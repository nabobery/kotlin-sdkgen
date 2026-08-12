package com.nabobery.sdkgen.buildlogic.publication

import com.nabobery.sdkgen.buildlogic.publication.inventory.SdkgenProductStagedArtifactInventory
import com.nabobery.sdkgen.buildlogic.publication.inventory.SdkgenProductStagedArtifactInventoryJson
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.gradle.work.DisableCachingByDefault
import java.io.File

/**
 * Fail-closed verification of a
 * [SdkgenProductStagedArtifactInventory] against the staging repository it claims to describe.
 *
 * An empty repository, an empty inventory, a missing ADR-0008 coordinate, a staged file the inventory
 * names but that no longer exists, or a checksum mismatch are all hard failures. This task never infers a
 * successful rehearsal from missing or incomplete evidence.
 */
@DisableCachingByDefault(because = "The task records a successful verification marker for a local repository.")
public abstract class VerifyStagedArtifactInventory : DefaultTask() {
    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val repositoryDirectory: DirectoryProperty

    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    public abstract val inventoryFile: RegularFileProperty

    @get:Input
    public abstract val expectedVersion: Property<String>

    /** Whether every release publication, documentation artifact, and signature must be present. */
    @get:Input
    public abstract val requireReleaseArtifacts: Property<Boolean>

    @get:OutputFile
    public abstract val verificationMarker: RegularFileProperty

    @TaskAction
    public fun verify() {
        val repository = repositoryDirectory.get().asFile
        check(repository.isDirectory && repository.listFiles()?.isNotEmpty() == true) {
            "Staged artifact inventory verification requires a non-empty repository directory: ${repository.path}"
        }

        val inventory = SdkgenProductStagedArtifactInventoryJson.decode(inventoryFile.get().asFile.readText())
        val failures =
            StagedArtifactInventoryVerification.verify(
                repository,
                inventory,
                expectedVersion.get(),
                requireReleaseArtifacts.getOrElse(false),
            )
        check(failures.isEmpty()) {
            "Staged artifact inventory verification failed:\n${failures.joinToString("\n")}"
        }

        verificationMarker.get().asFile.apply {
            parentFile.mkdirs()
            writeText("Staged artifact inventory verified: ${inventory.artifacts.size} artifact(s).\n")
        }
    }
}

internal object StagedArtifactInventoryVerification {
    // The eight ADR-0008 product coordinates, sourced from Adr0008ProductArtifactIds (shared with
    // sdkgen.publishing.gradle.kts and StagedArtifactRepositoryScanner) rather than a fourth independent
    // literal list.
    private val expectedRootArtifactIds = Adr0008ProductArtifactIds.projectPathToArtifactId.values.distinct()

    private val binaryExtensions =
        setOf(
            SdkgenProductStagedArtifactInventory.EXTENSION_JAR,
            SdkgenProductStagedArtifactInventory.EXTENSION_KLIB,
        )

    internal fun verify(
        repository: File,
        inventory: SdkgenProductStagedArtifactInventory,
        expectedVersion: String,
        requireReleaseArtifacts: Boolean = false,
    ): List<String> {
        // Fail closed: an inventory over zero artifacts must never verify as success, even when the
        // repository directory itself is non-empty (e.g. an inventory that was truncated or hand-edited).
        if (inventory.artifacts.isEmpty()) {
            return listOf("inventory is empty: an inventory over zero artifacts can never verify")
        }

        val failures = mutableListOf<String>()
        inventory.artifacts
            .filter { artifact -> artifact.coordinate.version != expectedVersion }
            .mapTo(failures) { artifact ->
                "unexpected staged version ${artifact.coordinate.version} for ${artifact.coordinate}; " +
                    "expected $expectedVersion"
            }

        expectedRootArtifactIds.forEach { rootArtifactId ->
            val coordinateArtifacts = inventory.byRootArtifactId(rootArtifactId)
            val hasBinaryArtifact = coordinateArtifacts.any { it.extension in binaryExtensions }
            if (!hasBinaryArtifact) {
                failures += "missing expected coordinate: no staged jar or klib found for $rootArtifactId"
            }
        }

        if (requireReleaseArtifacts) {
            failures += releaseArtifactFailures(repository, inventory, expectedVersion)
        }

        failures += unexpectedCoordinateFailures(inventory)

        val repositoryRoot = repository.toPath().toRealPath()
        inventory.artifacts.forEach { artifact ->
            val candidate = repositoryRoot.resolve(artifact.relativePath).normalize()
            if (!candidate.startsWith(repositoryRoot)) {
                failures += "${artifact.coordinate} (${artifact.relativePath}): staged path escapes the repository"
                return@forEach
            }
            val file = candidate.toFile()
            if (!file.isFile) {
                failures += "${artifact.coordinate} (${artifact.relativePath}): staged file no longer exists"
                return@forEach
            }
            if (!candidate.toRealPath().startsWith(repositoryRoot)) {
                failures +=
                    "${artifact.coordinate} (${artifact.relativePath}): staged path resolves outside the repository"
                return@forEach
            }
            val actualSha256 = Sha256.of(file)
            if (actualSha256 != artifact.sha256) {
                failures +=
                    "${artifact.coordinate} (${artifact.relativePath}): checksum mismatch " +
                    "(expected ${artifact.sha256}, found $actualSha256)"
            }
        }

        return failures
    }

    private val CHECKSUM_EXTENSIONS = setOf("md5", "sha1", "sha256", "sha512")

    private fun releaseArtifactFailures(
        repository: File,
        inventory: SdkgenProductStagedArtifactInventory,
        expectedVersion: String,
    ): List<String> {
        val failures = mutableListOf<String>()
        Adr0008ProductArtifactIds.releaseProductArtifactIds.sorted().forEach { artifactId ->
            val coordinate = "${Adr0008ProductArtifactIds.PRODUCT_GROUP}:$artifactId:$expectedVersion"
            val coordinateArtifacts =
                inventory.artifacts.filter { artifact ->
                    artifact.coordinate.group == Adr0008ProductArtifactIds.PRODUCT_GROUP &&
                        artifact.coordinate.artifactId == artifactId &&
                        artifact.coordinate.version == expectedVersion
                }
            if (coordinateArtifacts.isEmpty()) {
                failures += "missing release publication coordinate $coordinate"
                return@forEach
            }
            if (coordinateArtifacts.none { artifact -> artifact.extension == "pom" }) {
                failures += "missing release POM for $coordinate"
            }
            if (coordinateArtifacts.none { artifact ->
                    artifact.extension == SdkgenProductStagedArtifactInventory.EXTENSION_JAR &&
                        artifact.classifier == "javadoc"
                }
            ) {
                failures += "missing release javadoc jar for $coordinate"
            }
        }
        inventory.artifacts
            .filterNot { artifact -> artifact.extension in CHECKSUM_EXTENSIONS || artifact.extension == "asc" }
            .forEach { artifact ->
                val signaturePath = "${artifact.relativePath}.asc"
                if (!repository.resolve(signaturePath).isFile) {
                    failures += "missing release signature: $signaturePath"
                }
            }
        return failures
    }

    /**
     * The converse pass: every staged coordinate must be one ADR-0008 allows, not merely "the eight are here".
     *
     * Without this the check is a subset test. A ninth coordinate — an accidentally published
     * `generator:model`, an internal fixture, anything written into the staging directory — passed, matched
     * its own checksum, and was counted in the verification marker's artifact total as though it belonged.
     * ADR-0008 fixes the *published surface*, so "nothing extra" is half of what it asserts.
     */
    private fun unexpectedCoordinateFailures(inventory: SdkgenProductStagedArtifactInventory): List<String> =
        inventory.artifacts
            .map { artifact -> artifact.coordinate }
            .distinct()
            .sortedBy { coordinate -> "${coordinate.group}:${coordinate.artifactId}" }
            .mapNotNull { coordinate ->
                when {
                    coordinate.group == Adr0008ProductArtifactIds.GRADLE_PLUGIN_MARKER_GROUP &&
                        coordinate.artifactId == Adr0008ProductArtifactIds.GRADLE_PLUGIN_MARKER_ARTIFACT_ID -> {
                        null
                    }

                    coordinate.group != Adr0008ProductArtifactIds.PRODUCT_GROUP -> {
                        "unexpected staged coordinate $coordinate: group is outside the ADR-0008 product set"
                    }

                    else -> {
                        unexpectedProductArtifactFailure(coordinate.toString(), coordinate.artifactId)
                    }
                }
            }

    private fun unexpectedProductArtifactFailure(
        coordinate: String,
        artifactId: String,
    ): String? {
        if (artifactId in expectedRootArtifactIds) return null

        // Longest-first so a root that is a textual prefix of another never wins over the more specific one.
        val root =
            Adr0008ProductArtifactIds.rootArtifactIdsLongestFirst
                .firstOrNull { root -> artifactId.startsWith("$root-") }
                ?: return "unexpected staged coordinate $coordinate: outside the ADR-0008 eight-coordinate set"

        val target = artifactId.removePrefix("$root-")
        return if (target in Adr0008ProductArtifactIds.KNOWN_TARGET_SUFFIXES) {
            null
        } else {
            "unexpected staged coordinate $coordinate: \"$target\" is not a recognized " +
                "Kotlin/Multiplatform target variant of $root"
        }
    }
}
