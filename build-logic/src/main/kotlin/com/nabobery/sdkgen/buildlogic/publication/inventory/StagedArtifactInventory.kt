package com.nabobery.sdkgen.buildlogic.publication.inventory

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

/**
 * A Maven coordinate (`group:artifactId:version`) for one of the eight ADR-0008 SDKGen *product*
 * publications, or one of their per-target Kotlin/Multiplatform variant publications (for example
 * `kotlin-sdkgen-runtime-jvm`).
 */
public data class SdkgenProductCoordinate(
    public val group: String,
    public val artifactId: String,
    public val version: String,
) {
    /** Renders as `group:artifactId:version`, for example in error and diagnostic messages. */
    override fun toString(): String = "$group:$artifactId:$version"
}

/**
 * One physical file staged for an ADR-0008 SDKGen *product* Maven publication: a jar, `.klib`, POM, or
 * Gradle Module Metadata file that `maven-publish` wrote into an isolated local staging repository (see
 * `conformance/publication/publish-to-isolated-repository.init.gradle.kts`).
 *
 * **Boundary (ADR-0013, "Evidence sources", lines 122-126):** this type describes a *product* publication
 * artifact only, one of the eight ADR-0008 coordinates (engine, cli, gradle-plugin, runtime, the three
 * transport adapters, testing) or one of their Kotlin/Multiplatform per-target variants. It is never
 * evidence about a *generated SDK* that kotlin-sdkgen emits for a consumer OpenAPI document. Product
 * publication ABI evidence and generated-SDK ABI evidence are strictly separate evidence lanes: a
 * [SdkgenProductStagedArtifact] must never be reused as, or conflated with, generated-SDK ABI evidence.
 *
 * @property coordinate the staged Maven coordinate.
 * @property classifier the Maven classifier (for example `sources`, `javadoc`, `metadata`), or `null` for
 *   the unclassified main artifact.
 * @property extension the file extension without a leading dot (for example `jar`, `klib`, `pom`, `module`).
 * @property target the Kotlin/Multiplatform target this artifact was published for (for example
 *   `iosarm64`, `jvm`, or `js` — `.klib` is not native-only, `kotlin-sdkgen-testing-js` is a valid `.klib`
 *   target), derived by [com.nabobery.sdkgen.buildlogic.publication.StagedArtifactRepositoryScanner] from
 *   matching this artifact's coordinate against the known ADR-0008 root artifact IDs. `null` means "this
 *   artifact legitimately has no target" — a root/aggregate publication (e.g. the KMP metadata
 *   publication, or a JVM-only module like `kotlin-sdkgen-transport-java-http`) — and is distinct from
 *   "unknown": an artifactId matching no known root also resolves to `null` rather than a guessed value.
 *   ADR-0007 requires running `klib dump-abi` against every staged `.klib` independently and comparing
 *   *each target's* ABI against its own baseline; this field is what makes a staged `.klib`'s target
 *   knowable without parsing its artifactId again downstream.
 * @property relativePath the staged file's path relative to the staging repository root, using `/`
 *   separators. Never an absolute host path.
 * @property sha256 the lowercase hexadecimal SHA-256 digest of the staged file's bytes.
 */
public data class SdkgenProductStagedArtifact(
    public val coordinate: SdkgenProductCoordinate,
    public val classifier: String?,
    public val extension: String,
    public val target: String?,
    public val relativePath: String,
    public val sha256: String,
)

/**
 * A deterministic, read-only inventory of every file staged for the eight ADR-0008 SDKGen product
 * publications (and their per-target Kotlin/Multiplatform variants) in one isolated local staging
 * repository.
 *
 * [artifacts] is always sorted by [SdkgenProductCoordinate.group], then [SdkgenProductCoordinate.artifactId],
 * then [SdkgenProductCoordinate.version], then [SdkgenProductStagedArtifact.classifier], then
 * [SdkgenProductStagedArtifact.extension], then [SdkgenProductStagedArtifact.relativePath]. The inventory
 * contains no timestamps and no absolute host paths.
 *
 * This is the read-only consumer seam a downstream packet (for example, a generated-SDK ABI classifier)
 * uses to answer questions like "what JVM JARs are staged?" or "what `.klib` files are staged?" without
 * knowing how staging happened and without being able to mutate the inventory. See
 * [SdkgenProductStagedArtifact]'s KDoc for the hard boundary against generated-SDK ABI evidence: this type
 * must never be reused as that evidence.
 */
public class SdkgenProductStagedArtifactInventory private constructor(
    public val artifacts: List<SdkgenProductStagedArtifact>,
) {
    init {
        require(artifacts == artifacts.sortedWith(ENTRY_ORDER)) {
            "SdkgenProductStagedArtifactInventory.artifacts must be sorted deterministically " +
                "by coordinate, then classifier, then extension, then relative path."
        }
    }

    /** Every staged artifact whose [SdkgenProductStagedArtifact.extension] equals [extension] exactly. */
    public fun byExtension(extension: String): List<SdkgenProductStagedArtifact> =
        artifacts.filter { it.extension == extension }

    /** Every staged JVM JAR artifact (`extension == "jar"`). */
    public fun jvmJars(): List<SdkgenProductStagedArtifact> = byExtension(EXTENSION_JAR)

    /** Every staged Kotlin/Native or Kotlin/JS `.klib` artifact. */
    public fun klibs(): List<SdkgenProductStagedArtifact> = byExtension(EXTENSION_KLIB)

    /**
     * Every staged artifact whose [SdkgenProductCoordinate.artifactId] is [artifactId] itself, or one of
     * its Kotlin/Multiplatform per-target variants (an artifact id of the form `"$artifactId-<target>"`).
     */
    public fun byRootArtifactId(artifactId: String): List<SdkgenProductStagedArtifact> =
        artifacts.filter {
            it.coordinate.artifactId == artifactId || it.coordinate.artifactId.startsWith("$artifactId-")
        }

    public companion object {
        /** File extension used by staged JVM archives. */
        public const val EXTENSION_JAR: String = "jar"

        /** File extension used by staged Kotlin/Native and Kotlin/JS klib archives. */
        public const val EXTENSION_KLIB: String = "klib"

        internal val ENTRY_ORDER: Comparator<SdkgenProductStagedArtifact> =
            compareBy<SdkgenProductStagedArtifact> { it.coordinate.group }
                .thenBy { it.coordinate.artifactId }
                .thenBy { it.coordinate.version }
                .thenBy { it.classifier.orEmpty() }
                .thenBy { it.extension }
                .thenBy { it.relativePath }

        /** Builds an inventory, sorting [artifacts] into the canonical deterministic order. */
        public fun of(artifacts: Collection<SdkgenProductStagedArtifact>): SdkgenProductStagedArtifactInventory =
            SdkgenProductStagedArtifactInventory(artifacts.sortedWith(ENTRY_ORDER))
    }
}

/**
 * Deterministic JSON encoding for [SdkgenProductStagedArtifactInventory]. Field order and the schema
 * version marker are fixed, so byte-identical inputs always produce byte-identical JSON.
 *
 * **Schema history.** `v1` (`sdkgen-staged-artifact-inventory-v1`) carried no [SdkgenProductStagedArtifact.target]
 * field at all. `v2` (`sdkgen-staged-artifact-inventory-v2`, current) adds it. Following this project's
 * precedent for versioned formats (`CompatibilityManifestReader`, ADR-0013's ruling that "a field not part
 * of the declared schema" and "a field this reader does not consume" are different things that must be
 * handled differently), the two schema versions are treated as genuinely distinct shapes rather than one
 * reader silently tolerating an optional key:
 *  - [encode] always writes the current `v2` shape, with `"target"` present on every artifact entry (as a
 *    JSON string or explicit JSON `null`).
 *  - [decode] accepts both `v1` and `v2` documents. Under `v1`, `"target"` must be *absent* (its presence
 *    would be undeclared drift in a schema that predates the field) and every decoded artifact's `target`
 *    is `null`. Under `v2`, `"target"` must be *present* (a `v2` document missing it is truncated/corrupt,
 *    not merely permissively defaulted) and its value — string or `null` — is carried through unchanged.
 *    An unrecognized schema version fails closed in both cases.
 */
public object SdkgenProductStagedArtifactInventoryJson {
    private const val SCHEMA_VERSION_V1: String = "sdkgen-staged-artifact-inventory-v1"
    private const val SCHEMA_VERSION_V2: String = "sdkgen-staged-artifact-inventory-v2"
    private const val CURRENT_SCHEMA_VERSION: String = SCHEMA_VERSION_V2
    private val SUPPORTED_SCHEMA_VERSIONS = setOf(SCHEMA_VERSION_V1, SCHEMA_VERSION_V2)
    private val json = Json

    /**
     * Encodes [inventory] to a deterministic, pretty-printed JSON document using the current (`v2`) schema.
     *
     * This is a small hand-written writer, deliberately not routed through kotlinx.serialization's generic
     * [JsonObject] encoder, so the exact byte layout (field order, two-space indentation, trailing newline)
     * is fixed and does not depend on library formatting defaults.
     */
    public fun encode(inventory: SdkgenProductStagedArtifactInventory): String =
        buildString {
            append("{\n")
            append("  \"schemaVersion\": ${jsonString(CURRENT_SCHEMA_VERSION)},\n")
            append("  \"artifacts\": [")
            if (inventory.artifacts.isEmpty()) {
                append("]\n")
            } else {
                append('\n')
                inventory.artifacts.forEachIndexed { index, artifact ->
                    append("    {\n")
                    append("      \"group\": ${jsonString(artifact.coordinate.group)},\n")
                    append("      \"artifactId\": ${jsonString(artifact.coordinate.artifactId)},\n")
                    append("      \"version\": ${jsonString(artifact.coordinate.version)},\n")
                    append("      \"classifier\": ${artifact.classifier?.let(::jsonString) ?: "null"},\n")
                    append("      \"extension\": ${jsonString(artifact.extension)},\n")
                    append("      \"target\": ${artifact.target?.let(::jsonString) ?: "null"},\n")
                    append("      \"relativePath\": ${jsonString(artifact.relativePath)},\n")
                    append("      \"sha256\": ${jsonString(artifact.sha256)}\n")
                    append("    }")
                    append(if (index == inventory.artifacts.lastIndex) "\n" else ",\n")
                }
                append("  ]\n")
            }
            append("}\n")
        }

    private fun jsonString(value: String): String {
        val escaped =
            buildString {
                value.forEach { character ->
                    when (character) {
                        '"' -> {
                            append("\\\"")
                        }

                        '\\' -> {
                            append("\\\\")
                        }

                        '\n' -> {
                            append("\\n")
                        }

                        '\r' -> {
                            append("\\r")
                        }

                        '\t' -> {
                            append("\\t")
                        }

                        else -> {
                            if (character.code < 0x20) {
                                append("\\u%04x".format(character.code))
                            } else {
                                append(character)
                            }
                        }
                    }
                }
            }
        return "\"$escaped\""
    }

    /**
     * Decodes a document previously produced by [encode] (`v2`), or a legacy `v1` document written before
     * [SdkgenProductStagedArtifact.target] existed. Fails closed on an unrecognized schema version, and on
     * a `"target"` key that is present under `v1` or absent under `v2` — see the class KDoc.
     */
    public fun decode(text: String): SdkgenProductStagedArtifactInventory {
        val root = json.parseToJsonElement(text).jsonObject
        val schemaVersion = root["schemaVersion"]?.jsonPrimitive?.contentOrNull
        check(schemaVersion in SUPPORTED_SCHEMA_VERSIONS) {
            "Unsupported staged artifact inventory schemaVersion: $schemaVersion"
        }
        val isV1 = schemaVersion == SCHEMA_VERSION_V1

        val artifacts =
            root["artifacts"]
                ?.jsonArray
                .orEmpty()
                .map { element ->
                    val entry = element.jsonObject
                    val hasTargetKey = "target" in entry
                    val target =
                        when {
                            isV1 && hasTargetKey -> {
                                error(
                                    "Staged artifact inventory entry declares \"target\" under unsupported " +
                                        "schemaVersion \"$SCHEMA_VERSION_V1\": that schema predates the target field.",
                                )
                            }

                            isV1 -> {
                                null
                            }

                            !hasTargetKey -> {
                                error(
                                    "Staged artifact inventory entry missing required field \"target\" " +
                                        "under schemaVersion \"$SCHEMA_VERSION_V2\".",
                                )
                            }

                            else -> {
                                entry["target"]?.jsonPrimitive?.contentOrNull
                            }
                        }
                    SdkgenProductStagedArtifact(
                        coordinate =
                            SdkgenProductCoordinate(
                                group = entry.requiredString("group"),
                                artifactId = entry.requiredString("artifactId"),
                                version = entry.requiredString("version"),
                            ),
                        classifier = entry["classifier"]?.jsonPrimitive?.contentOrNull,
                        extension = entry.requiredString("extension"),
                        target = target,
                        relativePath = entry.requiredString("relativePath"),
                        sha256 = entry.requiredString("sha256"),
                    )
                }
        return SdkgenProductStagedArtifactInventory.of(artifacts)
    }

    private fun JsonObject.requiredString(name: String): String =
        this[name]?.jsonPrimitive?.contentOrNull
            ?: error("Staged artifact inventory entry missing required field \"$name\".")
}
