package com.nabobery.sdkgen.buildlogic.publication

/**
 * The single source of truth for ADR-0008's eight SDKGen *product* Maven coordinates: the fixed mapping
 * from a first-party Gradle project path to the root artifact ID `sdkgen.publishing.gradle.kts` rewrites
 * every publication of that project to use.
 *
 * This map is shared, not duplicated, by two call sites that would otherwise silently drift apart:
 *  - `sdkgen.publishing.gradle.kts`, which renames each project's publications to its root artifact ID;
 *  - [StagedArtifactRepositoryScanner], which matches a *staged* artifactId (e.g.
 *    `kotlin-sdkgen-transport-ktor-iosarm64`) against [rootArtifactIds] to recover which root product a
 *    staged file belongs to, and, from the matched root's suffix, which Kotlin/Multiplatform target
 *    variant (if any) it is.
 *
 * Both call sites live in this same Gradle precompiled-script source set (`build-logic/src/main/kotlin`),
 * so sharing one `internal`/`public` Kotlin type here is strictly cleaner than keeping two independently
 * maintained literal lists: a ninth product, or a renamed root, now only needs to change in one place.
 */
public object Adr0008ProductArtifactIds {
    /** Project path (e.g. `:runtime:core`) to the ADR-0008 root Maven artifactId it publishes under. */
    public val projectPathToArtifactId: Map<String, String> =
        mapOf(
            ":generator:engine" to "kotlin-sdkgen-engine",
            ":generator:cli" to "kotlin-sdkgen-cli",
            ":runtime:core" to "kotlin-sdkgen-runtime",
            ":runtime:testing" to "kotlin-sdkgen-testing",
            ":runtime:transport-ktor" to "kotlin-sdkgen-transport-ktor",
            ":runtime:transport-okhttp" to "kotlin-sdkgen-transport-okhttp",
            ":runtime:transport-java-http" to "kotlin-sdkgen-transport-java-http",
            ":integrations:gradle-plugin" to "kotlin-sdkgen-gradle-plugin",
        )

    /**
     * The eight root artifact IDs themselves ([projectPathToArtifactId]'s values), longest first. Longest
     * first matters for prefix matching a staged artifactId against these roots: it guarantees a root that
     * happens to be a textual prefix of another root is never matched before the more specific one.
     */
    public val rootArtifactIdsLongestFirst: List<String> =
        projectPathToArtifactId.values.distinct().sortedByDescending { it.length }

    /**
     * The Gradle Plugin Portal marker publication that accompanies `:integrations:gradle-plugin`.
     *
     * ADR-0008's "Negative consequences" names this explicitly: "The Gradle plugin requires separate marker
     * and Plugin Portal validation in addition to Maven publication." It is a real, expected staged
     * coordinate that is not one of the eight roots and lives under its own group, so any check asserting the
     * staged set equals the eight roots has to account for it by name rather than by accident.
     */
    public const val GRADLE_PLUGIN_MARKER_GROUP: String = "io.github.nabobery.kotlin-sdkgen"

    /** Artifact ID of [GRADLE_PLUGIN_MARKER_GROUP]'s marker publication. */
    public const val GRADLE_PLUGIN_MARKER_ARTIFACT_ID: String = "io.github.nabobery.kotlin-sdkgen.gradle.plugin"

    /** The Maven group every ADR-0008 root publishes under. */
    public const val PRODUCT_GROUP: String = "io.github.nabobery"

    /**
     * Kotlin/Multiplatform target suffixes a staged `<root>-<target>` variant may carry.
     *
     * Mirrors the target list `sdkgen.kotlin-kmp.gradle.kts` declares, lowercased the way Gradle Module
     * Metadata names its published variants. Enumerated rather than "anything after the last dash" so a
     * suffix nobody recognizes is a failure instead of a silently accepted coordinate.
     */
    public val KNOWN_TARGET_SUFFIXES: Set<String> =
        setOf(
            "android",
            "iosarm64",
            "iossimulatorarm64",
            "iosx64",
            "js",
            "jvm",
            "linuxarm64",
            "linuxx64",
            "macosarm64",
            "macosx64",
            "mingwx64",
        )

    private val projectPathToReleaseTargets =
        mapOf(
            ":runtime:core" to KNOWN_TARGET_SUFFIXES,
            ":runtime:testing" to KNOWN_TARGET_SUFFIXES,
            ":runtime:transport-ktor" to KNOWN_TARGET_SUFFIXES,
            ":runtime:transport-okhttp" to setOf("android", "jvm"),
        )

    /** Every physical Maven artifact ID the release repository must contain. */
    public val releaseProductArtifactIds: Set<String> =
        projectPathToArtifactId
            .flatMap { (projectPath, rootArtifactId) ->
                listOf(rootArtifactId) +
                    projectPathToReleaseTargets
                        .getOrElse(projectPath, ::emptySet)
                        .sorted()
                        .map { target -> "$rootArtifactId-$target" }
            }.toSet()
}
