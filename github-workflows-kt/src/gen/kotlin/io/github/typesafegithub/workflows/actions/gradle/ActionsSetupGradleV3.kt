// This file was generated using action-binding-generator. Don't change it by hand, otherwise your
// changes will be overwritten with the next binding code regeneration.
// See https://github.com/typesafegithub/github-workflows-kt for more info.
@file:Suppress(
    "DataClassPrivateConstructor",
    "UNUSED_PARAMETER",
)

package io.github.typesafegithub.workflows.actions.gradle

import io.github.typesafegithub.workflows.domain.actions.Action
import io.github.typesafegithub.workflows.domain.actions.RegularAction
import java.util.LinkedHashMap
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.toList
import kotlin.collections.toTypedArray

/**
 * Action: Setup Gradle
 *
 * Configures Gradle for GitHub actions, caching state and generating a dependency graph via
 * Dependency Submission.
 *
 * [Action on GitHub](https://github.com/gradle/actions/tree/v3/setup-gradle)
 *
 * @param gradleVersion Gradle version to use. If specified, this Gradle version will be downloaded,
 * added to the PATH and used for invoking Gradle.
 * @param cacheDisabled When 'true', all caching is disabled. No entries will be written to or read
 * from the cache.
 * @param cacheReadOnly When 'true', existing entries will be read from the cache but no entries
 * will be written.
 * By default this value is 'false' for workflows on the GitHub default branch and 'true' for
 * workflows on other branches.
 * @param cacheWriteOnly When 'true', entries will not be restored from the cache but will be saved
 * at the end of the Job.
 * Setting this to 'true' implies cache-read-only will be 'false'.
 * @param cacheOverwriteExisting When 'true', a pre-existing Gradle User Home will not prevent the
 * cache from being restored.
 * @param cacheEncryptionKey A base64 encoded AES key used to encrypt the configuration-cache data.
 * The key is exported as 'GRADLE_ENCRYPTION_KEY' for later steps.
 * A suitable key can be generated with `openssl rand -base64 16`.
 * Configuration-cache data will not be saved/restored without an encryption key being provided.
 * @param gradleHomeCacheIncludes Paths within Gradle User Home to cache.
 * @param gradleHomeCacheExcludes Paths within Gradle User Home to exclude from cache.
 * @param gradleHomeCacheCleanup When 'true', the action will attempt to remove any stale/unused
 * entries from the Gradle User Home prior to saving to the GitHub Actions cache.
 * @param addJobSummary Specifies when a Job Summary should be inluded in the action results. Valid
 * values are 'never', 'always' (default), and 'on-failure'.
 * @param addJobSummaryAsPrComment Specifies when each Job Summary should be added as a PR comment.
 * Valid values are 'never' (default), 'always', and 'on-failure'. No action will be taken if the
 * workflow was not triggered from a pull request.
 * @param dependencyGraph Specifies if a GitHub dependency snapshot should be generated for each
 * Gradle build, and if so, how. Valid values are 'disabled' (default), 'generate',
 * 'generate-and-submit', 'generate-and-upload', 'download-and-submit' and 'clear'.
 * @param dependencyGraphContinueOnFailure When 'false' a failure to generate or submit a dependency
 * graph will fail the Step or Job. When 'true' a warning will be emitted but no failure will result.
 * @param artifactRetentionDays Specifies the number of days to retain any artifacts generated by
 * the action. If not set, the default retention settings for the repository will apply.
 * @param buildScanPublish Set to 'true' to automatically publish build results as a Build Scan on
 * scans.gradle.com.
 * For publication to succeed without user input, you must also provide values for
 * `build-scan-terms-of-service-url` and 'build-scan-terms-of-service-agree'.
 * @param buildScanTermsOfServiceUrl The URL to the Build Scan® terms of service. This input must be
 * set to 'https://gradle.com/terms-of-service'.
 * @param buildScanTermsOfServiceAgree Indicate that you agree to the Build Scan® terms of service.
 * This input value must be "yes".
 * @param arguments Gradle command line arguments (supports multi-line input)
 * @param buildRootDirectory Path to the root directory of the build. Default is the root of the
 * GitHub workspace.
 * @param generateJobSummary When 'false', no Job Summary will be generated for the Job.
 * @param gradleHomeCacheStrictMatch When 'true', the action will not attempt to restore the Gradle
 * User Home entries from other Jobs.
 * @param workflowJobContext Used to uniquely identify the current job invocation. Defaults to the
 * matrix values for this job; this should not be overridden by users (INTERNAL).
 * @param githubToken The GitHub token used to authenticate when submitting via the Dependency
 * Submission API.
 * @param _customInputs Type-unsafe map where you can put any inputs that are not yet supported by
 * the binding
 * @param _customVersion Allows overriding action's version, for example to use a specific minor
 * version, or a newer version that the binding doesn't yet know about
 */
public data class ActionsSetupGradleV3 private constructor(
    /**
     * Gradle version to use. If specified, this Gradle version will be downloaded, added to the
     * PATH and used for invoking Gradle.
     */
    public val gradleVersion: String? = null,
    /**
     * When 'true', all caching is disabled. No entries will be written to or read from the cache.
     */
    public val cacheDisabled: Boolean? = null,
    /**
     * When 'true', existing entries will be read from the cache but no entries will be written.
     * By default this value is 'false' for workflows on the GitHub default branch and 'true' for
     * workflows on other branches.
     */
    public val cacheReadOnly: Boolean? = null,
    /**
     * When 'true', entries will not be restored from the cache but will be saved at the end of the
     * Job.
     * Setting this to 'true' implies cache-read-only will be 'false'.
     */
    public val cacheWriteOnly: Boolean? = null,
    /**
     * When 'true', a pre-existing Gradle User Home will not prevent the cache from being restored.
     */
    public val cacheOverwriteExisting: Boolean? = null,
    /**
     * A base64 encoded AES key used to encrypt the configuration-cache data. The key is exported as
     * 'GRADLE_ENCRYPTION_KEY' for later steps.
     * A suitable key can be generated with `openssl rand -base64 16`.
     * Configuration-cache data will not be saved/restored without an encryption key being provided.
     */
    public val cacheEncryptionKey: String? = null,
    /**
     * Paths within Gradle User Home to cache.
     */
    public val gradleHomeCacheIncludes: List<String>? = null,
    /**
     * Paths within Gradle User Home to exclude from cache.
     */
    public val gradleHomeCacheExcludes: List<String>? = null,
    /**
     * When 'true', the action will attempt to remove any stale/unused entries from the Gradle User
     * Home prior to saving to the GitHub Actions cache.
     */
    public val gradleHomeCacheCleanup: Boolean? = null,
    /**
     * Specifies when a Job Summary should be inluded in the action results. Valid values are
     * 'never', 'always' (default), and 'on-failure'.
     */
    public val addJobSummary: ActionsSetupGradleV3.AddJobSummary? = null,
    /**
     * Specifies when each Job Summary should be added as a PR comment. Valid values are 'never'
     * (default), 'always', and 'on-failure'. No action will be taken if the workflow was not triggered
     * from a pull request.
     */
    public val addJobSummaryAsPrComment: ActionsSetupGradleV3.AddJobSummaryAsPrComment? = null,
    /**
     * Specifies if a GitHub dependency snapshot should be generated for each Gradle build, and if
     * so, how. Valid values are 'disabled' (default), 'generate', 'generate-and-submit',
     * 'generate-and-upload', 'download-and-submit' and 'clear'.
     */
    public val dependencyGraph: ActionsSetupGradleV3.DependencyGraph? = null,
    /**
     * When 'false' a failure to generate or submit a dependency graph will fail the Step or Job.
     * When 'true' a warning will be emitted but no failure will result.
     */
    public val dependencyGraphContinueOnFailure: Boolean? = null,
    /**
     * Specifies the number of days to retain any artifacts generated by the action. If not set, the
     * default retention settings for the repository will apply.
     */
    public val artifactRetentionDays: Int? = null,
    /**
     * Set to 'true' to automatically publish build results as a Build Scan on scans.gradle.com.
     * For publication to succeed without user input, you must also provide values for
     * `build-scan-terms-of-service-url` and 'build-scan-terms-of-service-agree'.
     */
    public val buildScanPublish: Boolean? = null,
    /**
     * The URL to the Build Scan® terms of service. This input must be set to
     * 'https://gradle.com/terms-of-service'.
     */
    public val buildScanTermsOfServiceUrl: String? = null,
    /**
     * Indicate that you agree to the Build Scan® terms of service. This input value must be "yes".
     */
    public val buildScanTermsOfServiceAgree: String? = null,
    /**
     * Gradle command line arguments (supports multi-line input)
     */
    public val arguments: String? = null,
    /**
     * Path to the root directory of the build. Default is the root of the GitHub workspace.
     */
    public val buildRootDirectory: String? = null,
    /**
     * When 'false', no Job Summary will be generated for the Job.
     */
    public val generateJobSummary: Boolean? = null,
    /**
     * When 'true', the action will not attempt to restore the Gradle User Home entries from other
     * Jobs.
     */
    public val gradleHomeCacheStrictMatch: String? = null,
    /**
     * Used to uniquely identify the current job invocation. Defaults to the matrix values for this
     * job; this should not be overridden by users (INTERNAL).
     */
    public val workflowJobContext: String? = null,
    /**
     * The GitHub token used to authenticate when submitting via the Dependency Submission API.
     */
    public val githubToken: String? = null,
    /**
     * Type-unsafe map where you can put any inputs that are not yet supported by the binding
     */
    public val _customInputs: Map<String, String> = mapOf(),
    /**
     * Allows overriding action's version, for example to use a specific minor version, or a newer
     * version that the binding doesn't yet know about
     */
    public val _customVersion: String? = null,
) : RegularAction<ActionsSetupGradleV3.Outputs>("gradle", "actions/setup-gradle", _customVersion ?:
        "v3") {
    public constructor(
        vararg pleaseUseNamedArguments: Unit,
        gradleVersion: String? = null,
        cacheDisabled: Boolean? = null,
        cacheReadOnly: Boolean? = null,
        cacheWriteOnly: Boolean? = null,
        cacheOverwriteExisting: Boolean? = null,
        cacheEncryptionKey: String? = null,
        gradleHomeCacheIncludes: List<String>? = null,
        gradleHomeCacheExcludes: List<String>? = null,
        gradleHomeCacheCleanup: Boolean? = null,
        addJobSummary: ActionsSetupGradleV3.AddJobSummary? = null,
        addJobSummaryAsPrComment: ActionsSetupGradleV3.AddJobSummaryAsPrComment? = null,
        dependencyGraph: ActionsSetupGradleV3.DependencyGraph? = null,
        dependencyGraphContinueOnFailure: Boolean? = null,
        artifactRetentionDays: Int? = null,
        buildScanPublish: Boolean? = null,
        buildScanTermsOfServiceUrl: String? = null,
        buildScanTermsOfServiceAgree: String? = null,
        arguments: String? = null,
        buildRootDirectory: String? = null,
        generateJobSummary: Boolean? = null,
        gradleHomeCacheStrictMatch: String? = null,
        workflowJobContext: String? = null,
        githubToken: String? = null,
        _customInputs: Map<String, String> = mapOf(),
        _customVersion: String? = null,
    ) : this(gradleVersion=gradleVersion, cacheDisabled=cacheDisabled, cacheReadOnly=cacheReadOnly,
            cacheWriteOnly=cacheWriteOnly, cacheOverwriteExisting=cacheOverwriteExisting,
            cacheEncryptionKey=cacheEncryptionKey, gradleHomeCacheIncludes=gradleHomeCacheIncludes,
            gradleHomeCacheExcludes=gradleHomeCacheExcludes,
            gradleHomeCacheCleanup=gradleHomeCacheCleanup, addJobSummary=addJobSummary,
            addJobSummaryAsPrComment=addJobSummaryAsPrComment, dependencyGraph=dependencyGraph,
            dependencyGraphContinueOnFailure=dependencyGraphContinueOnFailure,
            artifactRetentionDays=artifactRetentionDays, buildScanPublish=buildScanPublish,
            buildScanTermsOfServiceUrl=buildScanTermsOfServiceUrl,
            buildScanTermsOfServiceAgree=buildScanTermsOfServiceAgree, arguments=arguments,
            buildRootDirectory=buildRootDirectory, generateJobSummary=generateJobSummary,
            gradleHomeCacheStrictMatch=gradleHomeCacheStrictMatch,
            workflowJobContext=workflowJobContext, githubToken=githubToken,
            _customInputs=_customInputs, _customVersion=_customVersion)

    @Suppress("SpreadOperator")
    override fun toYamlArguments(): LinkedHashMap<String, String> = linkedMapOf(
        *listOfNotNull(
            gradleVersion?.let { "gradle-version" to it },
            cacheDisabled?.let { "cache-disabled" to it.toString() },
            cacheReadOnly?.let { "cache-read-only" to it.toString() },
            cacheWriteOnly?.let { "cache-write-only" to it.toString() },
            cacheOverwriteExisting?.let { "cache-overwrite-existing" to it.toString() },
            cacheEncryptionKey?.let { "cache-encryption-key" to it },
            gradleHomeCacheIncludes?.let { "gradle-home-cache-includes" to it.joinToString("\n") },
            gradleHomeCacheExcludes?.let { "gradle-home-cache-excludes" to it.joinToString("\n") },
            gradleHomeCacheCleanup?.let { "gradle-home-cache-cleanup" to it.toString() },
            addJobSummary?.let { "add-job-summary" to it.stringValue },
            addJobSummaryAsPrComment?.let { "add-job-summary-as-pr-comment" to it.stringValue },
            dependencyGraph?.let { "dependency-graph" to it.stringValue },
            dependencyGraphContinueOnFailure?.let { "dependency-graph-continue-on-failure" to
                    it.toString() },
            artifactRetentionDays?.let { "artifact-retention-days" to it.toString() },
            buildScanPublish?.let { "build-scan-publish" to it.toString() },
            buildScanTermsOfServiceUrl?.let { "build-scan-terms-of-service-url" to it },
            buildScanTermsOfServiceAgree?.let { "build-scan-terms-of-service-agree" to it },
            arguments?.let { "arguments" to it },
            buildRootDirectory?.let { "build-root-directory" to it },
            generateJobSummary?.let { "generate-job-summary" to it.toString() },
            gradleHomeCacheStrictMatch?.let { "gradle-home-cache-strict-match" to it },
            workflowJobContext?.let { "workflow-job-context" to it },
            githubToken?.let { "github-token" to it },
            *_customInputs.toList().toTypedArray(),
        ).toTypedArray()
    )

    override fun buildOutputObject(stepId: String): Outputs = Outputs(stepId)

    public sealed class DependencyGraph(
        public val stringValue: String,
    ) {
        public object Disabled : ActionsSetupGradleV3.DependencyGraph("disabled")

        public object Generate : ActionsSetupGradleV3.DependencyGraph("generate")

        public object GenerateAndSubmit :
                ActionsSetupGradleV3.DependencyGraph("generate-and-submit")

        public object DownloadAndSubmit :
                ActionsSetupGradleV3.DependencyGraph("download-and-submit")

        public object Clear : ActionsSetupGradleV3.DependencyGraph("clear")

        public class Custom(
            customStringValue: String,
        ) : ActionsSetupGradleV3.DependencyGraph(customStringValue)
    }

    public sealed class AddJobSummary(
        public val stringValue: String,
    ) {
        public object Never : ActionsSetupGradleV3.AddJobSummary("never")

        public object Always : ActionsSetupGradleV3.AddJobSummary("always")

        public object OnFailure : ActionsSetupGradleV3.AddJobSummary("on-failure")

        public class Custom(
            customStringValue: String,
        ) : ActionsSetupGradleV3.AddJobSummary(customStringValue)
    }

    public sealed class AddJobSummaryAsPrComment(
        public val stringValue: String,
    ) {
        public object Never : ActionsSetupGradleV3.AddJobSummaryAsPrComment("never")

        public object Always : ActionsSetupGradleV3.AddJobSummaryAsPrComment("always")

        public object OnFailure : ActionsSetupGradleV3.AddJobSummaryAsPrComment("on-failure")

        public class Custom(
            customStringValue: String,
        ) : ActionsSetupGradleV3.AddJobSummaryAsPrComment(customStringValue)
    }

    public class Outputs(
        stepId: String,
    ) : Action.Outputs(stepId) {
        /**
         * Link to the Build Scan® generated by a Gradle build. Note that this output applies to a
         * Step executing Gradle, not to the `setup-gradle` Step itself.
         */
        public val buildScanUrl: String = "steps.$stepId.outputs.build-scan-url"

        /**
         * Path to the GitHub Dependency Graph snapshot file generated by a Gradle build. Note that
         * this output applies to a Step executing Gradle, not to the `setup-gradle` Step itself.
         */
        public val dependencyGraphFile: String = "steps.$stepId.outputs.dependency-graph-file"

        /**
         * Version of Gradle that was setup by the action
         */
        public val gradleVersion: String = "steps.$stepId.outputs.gradle-version"
    }
}
