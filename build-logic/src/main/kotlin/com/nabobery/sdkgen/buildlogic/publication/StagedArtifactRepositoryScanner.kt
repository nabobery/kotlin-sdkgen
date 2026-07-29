package com.nabobery.sdkgen.buildlogic.publication

import com.nabobery.sdkgen.buildlogic.publication.inventory.SdkgenProductCoordinate
import com.nabobery.sdkgen.buildlogic.publication.inventory.SdkgenProductStagedArtifact
import com.nabobery.sdkgen.buildlogic.publication.inventory.SdkgenProductStagedArtifactInventory
import java.io.File

/**
 * Scans an isolated local Maven staging repository (as populated by
 * `conformance/publication/publish-to-isolated-repository.init.gradle.kts`) and builds a deterministic
 * [SdkgenProductStagedArtifactInventory] over every staged artifact file.
 *
 * Repository-housekeeping files (`maven-metadata.xml` and Gradle/Maven's auto-generated `.md5`, `.sha1`,
 * `.sha256`, `.sha512`, and `.asc` side-car files) are not artifacts and are excluded; every checksum in
 * the emitted inventory is computed directly from the artifact's own bytes, never copied from a side-car.
 */
internal object StagedArtifactRepositoryScanner {
    private val excludedFileNames = setOf("maven-metadata.xml")
    private val excludedExtensions = setOf("md5", "sha1", "sha256", "sha512", "asc")

    // Matches Gradle's unique-timestamped snapshot suffix, e.g. "20260727.235959-1" or
    // "20260727.235959-1-sources", capturing an optional trailing classifier in group 1.
    private val snapshotSuffixPattern = Regex("""^\d{8}\.\d{6}-\d+(?:-(.+))?$""")

    internal fun scan(repositoryRoot: File): SdkgenProductStagedArtifactInventory {
        val artifacts =
            repositoryRoot
                .walkTopDown()
                .filter { it.isDirectory && looksLikeVersionDirectory(it) }
                .flatMap { versionDirectory -> artifactsIn(repositoryRoot, versionDirectory).asSequence() }
                .toList()
        return SdkgenProductStagedArtifactInventory.of(artifacts)
    }

    private fun looksLikeVersionDirectory(directory: File): Boolean =
        directory.listFiles()?.any { it.isFile && !isExcluded(it) } == true

    private fun isExcluded(file: File): Boolean =
        file.name in excludedFileNames || file.extension.lowercase() in excludedExtensions

    private fun artifactsIn(
        repositoryRoot: File,
        versionDirectory: File,
    ): List<SdkgenProductStagedArtifact> {
        val artifactId = versionDirectory.parentFile?.name ?: return emptyList()
        val groupDirectory = versionDirectory.parentFile?.parentFile ?: return emptyList()
        val group =
            groupDirectory
                .relativeTo(repositoryRoot)
                .path
                .split(File.separatorChar)
                .filter(String::isNotEmpty)
                .joinToString(".")
        if (group.isEmpty()) return emptyList()
        val version = versionDirectory.name

        return versionDirectory
            .listFiles()
            .orEmpty()
            .filter { it.isFile && !isExcluded(it) }
            .mapNotNull { file -> parseArtifact(repositoryRoot, file, group, artifactId, version) }
    }

    private fun parseArtifact(
        repositoryRoot: File,
        file: File,
        group: String,
        artifactId: String,
        version: String,
    ): SdkgenProductStagedArtifact? {
        val fileName = file.name
        val prefix = "$artifactId-"
        if (!fileName.startsWith(prefix)) return null
        val extension = file.extension
        if (extension.isEmpty()) return null
        val base = fileName.removePrefix(prefix).removeSuffix(".$extension")

        val classifier =
            when {
                base == version -> {
                    null
                }

                base.startsWith("$version-") -> {
                    base.removePrefix("$version-")
                }

                version.endsWith("-SNAPSHOT") -> {
                    val unqualifiedVersion = version.removeSuffix("-SNAPSHOT")
                    if (!base.startsWith("$unqualifiedVersion-")) return null
                    val remainder = base.removePrefix("$unqualifiedVersion-")
                    val match = snapshotSuffixPattern.matchEntire(remainder) ?: return null
                    match.groupValues[1].takeIf(String::isNotEmpty)
                }

                else -> {
                    return null
                }
            }

        return SdkgenProductStagedArtifact(
            coordinate = SdkgenProductCoordinate(group, artifactId, version),
            classifier = classifier,
            extension = extension,
            target = resolveTarget(artifactId),
            relativePath = file.relativeTo(repositoryRoot).path.replace(File.separatorChar, '/'),
            sha256 = Sha256.of(file),
        )
    }

    /**
     * Derives the Kotlin/Multiplatform target (if any) a staged artifactId was published for.
     *
     * ADR-0007 requires running `klib dump-abi` against every staged `.klib` independently and comparing
     * each *target's* ABI against its own baseline, so the target must be known per staged file — but it
     * can only be derived correctly by matching against the known ADR-0008 [Adr0008ProductArtifactIds.rootArtifactIdsLongestFirst]
     * root set, never by splitting the artifactId on its last dash. Module names themselves contain dashes
     * (`kotlin-sdkgen-transport-java-http` is a whole, JVM-only root artifact with no target suffix at
     * all; naively taking its last dash-segment would misread it as target `"http"`), so a suffix is only
     * ever trusted once the remaining prefix is confirmed to be one of the eight known roots.
     *
     * - An artifactId equal to a known root exactly (a root/JVM-only publication, or a Kotlin/Multiplatform
     *   metadata/aggregate publication that shares the root's bare name) has no target: `null`.
     * - An artifactId of the form `"$root-<suffix>"`, where `$root` is a known root, resolves to `<suffix>`
     *   as its target. `.klib` is not native-only — `kotlin-sdkgen-testing-js` resolves to target `"js"`
     *   just as `kotlin-sdkgen-transport-ktor-iosarm64` resolves to `"iosarm64"`.
     * - An artifactId matching no known root at all also resolves to `null` — never a guessed value.
     *
     * That last case is *not* fail-closed here, and the KDoc previously claimed it was. `null` means "this
     * artifact legitimately has no target", so an unidentifiable artifactId becomes indistinguishable from a
     * plain root publication, and [parseArtifact] admits it into the inventory either way. Rejecting it is
     * `StagedArtifactInventoryVerification`'s job, which now refuses any coordinate outside the ADR-0008 set
     * rather than only checking that the eight expected ones are present. This function stays total on
     * purpose: an inventory that silently dropped artifacts it could not classify would hide the very
     * coordinate the verifier needs to see in order to reject it.
     *
     * Roots are tried longest-first so that if one known root were ever a textual prefix of another (not
     * currently true of the ADR-0008 set, but not guaranteed to stay that way), the more specific root
     * always wins the match.
     */
    private fun resolveTarget(artifactId: String): String? {
        for (root in Adr0008ProductArtifactIds.rootArtifactIdsLongestFirst) {
            if (artifactId == root) return null
            val prefix = "$root-"
            if (artifactId.startsWith(prefix)) return artifactId.removePrefix(prefix)
        }
        return null
    }
}
