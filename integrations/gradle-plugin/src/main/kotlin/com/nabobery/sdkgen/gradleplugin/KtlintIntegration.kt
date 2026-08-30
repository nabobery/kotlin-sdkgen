package com.nabobery.sdkgen.gradleplugin

import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.file.Directory
import org.gradle.api.file.FileTreeElement
import org.gradle.api.provider.Provider
import org.gradle.api.specs.Spec
import org.gradle.api.tasks.util.PatternFilterable

/**
 * Optional integration with the ktlint Gradle plugin: SDKGen output roots are excluded from linting through ktlint's
 * one supported filter entry point, `KtlintExtension.filter(Action<PatternFilterable>)`.
 *
 * Everything the exclusion is built from — [Action], [PatternFilterable], [Spec], [FileTreeElement] — is Gradle core
 * API, so the filter is fully typed and independent of ktlint's class loader. Only the entry point itself is looked up
 * on the extension's runtime class, by its exact supported signature: ktlint is not a dependency of this plugin, and
 * a consumer may apply the two plugins from different class loaders (a convention plugin plus a `plugins {}` block,
 * or Gradle TestKit's injected plugin classpath), where a compile-time reference to `KtlintExtension` would not
 * resolve. The signature is pinned against ktlint-gradle 14.2.0 by `KtlintIntegrationContractTest`.
 */
internal object KtlintIntegration {
    private const val EXTENSION_NAME = "ktlint"
    private const val FILTER_METHOD = "filter"

    /**
     * Excludes every file below [outputRoot] from ktlint. The root is resolved when ktlint evaluates the filter, so
     * a consumer that reconfigures `outputDirectory` after applying the plugin is still honored.
     */
    fun excludeOutputRoot(
        project: Project,
        outputRoot: Provider<Directory>,
    ) {
        val extension =
            requireNotNull(project.extensions.findByName(EXTENSION_NAME)) {
                "The ktlint plugin did not register its '$EXTENSION_NAME' extension before SDKGen configured it."
            }
        val filter =
            runCatching { extension.javaClass.getMethod(FILTER_METHOD, Action::class.java) }.getOrElse { failure ->
                throw IllegalStateException(
                    "The installed ktlint Gradle plugin does not expose " +
                        "$FILTER_METHOD(org.gradle.api.Action<PatternFilterable>); SDKGen supports ktlint-gradle 14.x.",
                    failure,
                )
            }
        filter.invoke(extension, excludeBelow(outputRoot))
    }

    /** The typed filter action: exclude every element whose normalized path starts with the resolved output root. */
    internal fun excludeBelow(outputRoot: Provider<Directory>): Action<PatternFilterable> =
        Action { filterable -> filterable.exclude(belowRoot(outputRoot)) }

    private fun belowRoot(outputRoot: Provider<Directory>): Spec<FileTreeElement> =
        Spec { element ->
            val generatedRoot =
                outputRoot
                    .get()
                    .asFile
                    .toPath()
                    .toAbsolutePath()
                    .normalize()
            element.file
                .toPath()
                .toAbsolutePath()
                .normalize()
                .startsWith(generatedRoot)
        }
}
