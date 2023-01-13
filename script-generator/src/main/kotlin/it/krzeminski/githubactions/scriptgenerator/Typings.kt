package it.krzeminski.githubactions.scriptgenerator

import com.squareup.kotlinpoet.CodeBlock
import it.krzeminski.githubactions.actionsmetadata.model.ActionCoords
import it.krzeminski.githubactions.actionsmetadata.model.BooleanTyping
import it.krzeminski.githubactions.actionsmetadata.model.EnumTyping
import it.krzeminski.githubactions.actionsmetadata.model.IntegerTyping
import it.krzeminski.githubactions.actionsmetadata.model.IntegerWithSpecialValueTyping
import it.krzeminski.githubactions.actionsmetadata.model.ListOfTypings
import it.krzeminski.githubactions.actionsmetadata.model.Typing
import it.krzeminski.githubactions.wrappergenerator.generation.buildActionClassName
import it.krzeminski.githubactions.wrappergenerator.generation.toPascalCase

fun String.orExpression(): CodeBlock {
    val input = trim()
    if (input.startsWith(EXPR_PREFIX) && endsWith(EXPR_SUFFIX)) {
        val expression = input.removeSuffix(EXPR_SUFFIX).removePrefix(EXPR_PREFIX).trim()
        return CodeBlock.of("expr(%S)", expression)
    } else {
        return CodeBlock.of("%S", input)
    }
}

private const val EXPR_PREFIX = "\${{"
private const val EXPR_SUFFIX = "}}"

fun valueWithTyping(value: String, typing: Typing, coords: ActionCoords): CodeBlock {
    val classname = coords.buildActionClassName()
    return when (typing) {
        is EnumTyping -> {
            val itemsNames = typing.itemsNames ?: typing.items.map { it.toPascalCase() }
            val itemsNameMap = typing.items.zip(itemsNames).toMap()
            val enumName = itemsNameMap[value]?.toPascalCase()
            CodeBlock.of("%L", "$classname.${typing.typeName}.$enumName")
        }

        is BooleanTyping ->
            CodeBlock.of("%L", value)

        is IntegerTyping ->
            value.toIntOrNull()
                ?.let { CodeBlock.of("%L", value) }
                ?: CodeBlock.of("%S", value)

        is IntegerWithSpecialValueTyping -> when (typing.specialValues.containsValue(value.toInt())) {
            true -> {
                val specialValue = typing.specialValues.keys.first { typing.specialValues[it] == value.toInt() }
                CodeBlock.of("%L", "$classname.${typing.typeName}.${specialValue.toPascalCase()}")
            }
            false -> CodeBlock.of("%L", "$classname.${typing.typeName}.Value($value)")
        }

        is ListOfTypings -> {
            val delimeter = if (typing.delimiter == "\\n") "\n" else typing.delimiter
            val values = value.trim().split(delimeter)

            values.joinToCode(
                prefix = CodeBlock.of("listOf("),
                postfix = ")",
            ) { elem ->
                valueWithTyping(elem, typing.typing, coords)
            }
        }
        else ->
            CodeBlock.of("%S", value)
    }
}
