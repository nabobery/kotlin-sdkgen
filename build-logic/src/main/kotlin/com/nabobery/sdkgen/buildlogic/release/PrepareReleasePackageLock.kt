package com.nabobery.sdkgen.buildlogic.release

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault

/**
 * Creates the ephemeral npm lock used by a non-SNAPSHOT build.
 *
 * Kotlin's npm workspace metadata includes the Gradle project version. A release build therefore
 * differs from the committed development lock even when no npm dependency changed. This task
 * rewrites only the root package and internal workspace versions; any unexpected occurrence of the
 * development version fails closed so dependency metadata cannot be changed accidentally.
 */
@DisableCachingByDefault(because = "Produces a small, local release-build input; remote caching is unnecessary.")
public abstract class PrepareReleasePackageLock : DefaultTask() {
    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val developmentLockFile: RegularFileProperty

    @get:Input
    public abstract val releaseVersion: Property<String>

    @get:OutputFile
    public abstract val releaseLockFile: RegularFileProperty

    @TaskAction
    public fun prepare() {
        val version = releaseVersion.get()
        require(SEMANTIC_VERSION.matches(version) && !version.endsWith("-SNAPSHOT")) {
            "Release package-lock version must be a non-SNAPSHOT semantic version, but was '$version'."
        }

        val source = developmentLockFile.get().asFile.readText()
        val root = Json.parseToJsonElement(source).jsonObject
        val developmentVersion = root.requiredString("version")
        require(developmentVersion.endsWith("-SNAPSHOT")) {
            "Committed Kotlin/JS package-lock must use a SNAPSHOT version, but was '$developmentVersion'."
        }

        val packages = root.getValue("packages").jsonObject
        val rootPackage = packages.getValue("").jsonObject
        require(rootPackage.requiredString("version") == developmentVersion) {
            "Root package version must match package-lock version '$developmentVersion'."
        }

        val internalWorkspaces =
            rootPackage
                .getValue("workspaces")
                .jsonArray
                .map { it.jsonPrimitive.content }
                .filter { it.startsWith(INTERNAL_WORKSPACE_PREFIX) }

        internalWorkspaces.forEach { workspace ->
            val workspaceVersion = packages[workspace]?.jsonObject?.requiredString("version")
            require(workspaceVersion == developmentVersion) {
                "Internal workspace '$workspace' must use version '$developmentVersion', but was '$workspaceVersion'."
            }
        }

        val expectedVersionedPackages = (internalWorkspaces + "").toSet()
        val actualVersionedPackages =
            packages
                .filterValues { packageEntry ->
                    packageEntry.jsonObject["version"]?.jsonPrimitive?.content == developmentVersion
                }.keys
        require(actualVersionedPackages == expectedVersionedPackages) {
            "Only the root package and internal workspaces may use version '$developmentVersion'. " +
                "Expected $expectedVersionedPackages, but found $actualVersionedPackages. " +
                "Refusing to rewrite unexpected package metadata."
        }

        val versionEntry = "\"version\": \"$developmentVersion\""
        val expectedOccurrences = ROOT_VERSION_ENTRY_COUNT + internalWorkspaces.size
        val actualOccurrences = source.countOccurrences(versionEntry)
        require(actualOccurrences == expectedOccurrences) {
            "Expected $expectedOccurrences release-version entries in the committed package-lock, " +
                "but found $actualOccurrences. Refusing to rewrite unexpected package metadata."
        }

        val target = releaseLockFile.get().asFile
        target.parentFile.mkdirs()
        target.writeText(source.replace(versionEntry, "\"version\": \"$version\""))
    }

    private fun JsonObject.requiredString(key: String): String =
        requireNotNull(this[key]) { "package-lock is missing '$key'." }.jsonPrimitive.content

    private fun String.countOccurrences(value: String): Int {
        var count = 0
        var index = indexOf(value)
        while (index >= 0) {
            count++
            index = indexOf(value, startIndex = index + value.length)
        }
        return count
    }

    private companion object {
        private val SEMANTIC_VERSION =
            Regex(
                "^(0|[1-9][0-9]*)\\.(0|[1-9][0-9]*)\\.(0|[1-9][0-9]*)" +
                    "(?:-(?:0|[1-9][0-9]*|[0-9]*[A-Za-z-][0-9A-Za-z-]*)" +
                    "(?:\\.(?:0|[1-9][0-9]*|[0-9]*[A-Za-z-][0-9A-Za-z-]*))*)?" +
                    "(?:\\+[0-9A-Za-z-]+(?:\\.[0-9A-Za-z-]+)*)?$",
            )
        private const val INTERNAL_WORKSPACE_PREFIX = "packages/"
        private const val ROOT_VERSION_ENTRY_COUNT = 2
    }
}
