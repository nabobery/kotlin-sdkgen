package com.nabobery.sdkgen.cli

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

/**
 * Reads a staged generated-SDK ABI evidence manifest and produces [GeneratedSdkAbiEvidence] for
 * [AbiCompatibilityClassifier], the only production path that constructs that type from anything other than a
 * test fixture.
 *
 * The manifest is a small pointer file naming exactly one generated SDK's staged dumps. It is **not** a trusted
 * input: `compat --abi-evidence-from/--abi-evidence-to` takes both paths from the caller, so this reader is as
 * externally reachable as [CompatibilityManifestReader] and is bounded the same way — every size and count limit
 * below is checked before any allocation, and containment is decided on real paths rather than lexical ones.
 *
 * ```json
 * {
 *   "sdkIdentity": "github",
 *   "jvm": { "dumpPath": "jvm.api" },
 *   "klibTargets": [
 *     { "targetName": "linuxX64", "dumpPath": "klib/linuxX64.klib.api" },
 *     { "targetName": "iosArm64", "unavailable": { "reasonCode": "apple-target-requires-macos-host" } }
 *   ]
 * }
 * ```
 *
 * `dumpPath` is resolved relative to the manifest file's own parent directory, never absolute, so a staged
 * evidence directory can be relocated as a unit. Per ADR 0007 and [GeneratedSdkKlibTargetState], a KLib target is
 * either staged (`dumpPath`, becomes [GeneratedSdkKlibTargetState.Available]) or named unavailable with its
 * precise reason (`unavailable.reasonCode`, becomes [GeneratedSdkKlibTargetState.Unavailable]); a target this
 * packet's build matrix does not attempt at all is simply absent from `klibTargets`, per that type's own KDoc.
 * Declaring both `dumpPath` and `unavailable`, or neither, is a malformed manifest and fails closed.
 *
 * **This type is structurally disjoint from the product-publication inventory** exactly as
 * [GeneratedSdkAbiEvidence]'s own KDoc requires: this reader only ever reads a dump file's raw text from a path
 * this manifest names and hashes that text directly; it has no dependency on and never touches
 * `SdkgenProductStagedArtifactInventory`.
 */
internal object AbiEvidenceReader {
    private val MAPPER = ObjectMapper()

    /**
     * A pointer file names an SDK identity, one JVM dump, and a handful of KLib targets. Real ones are well under
     * a kilobyte; 1 MiB is generous enough that no legitimate manifest can reach it.
     */
    private const val MAX_MANIFEST_BYTES = 1L * 1024 * 1024

    /**
     * A real generated-SDK JVM dump is large: GitHub's is 37 MB across 473,610 lines and Stripe's is 48 MB. The
     * classifier parses declarations out of the text, so it genuinely has to be materialized — the bound is what
     * keeps "materialized" from meaning "whatever the caller points at".
     */
    private const val MAX_DUMP_BYTES = 128L * 1024 * 1024

    /** The whole KMP target set is single digits; 64 leaves room to grow without admitting a generated list. */
    private const val MAX_KLIB_TARGETS = 64

    internal fun read(path: Path): GeneratedSdkAbiEvidence {
        val manifestSize =
            try {
                Files.size(path)
            } catch (failure: IOException) {
                throw AbiEvidenceInputException("Generated-SDK ABI evidence manifest cannot be read: $path", failure)
            }
        if (manifestSize > MAX_MANIFEST_BYTES) {
            throw AbiEvidenceInputException(
                "Generated-SDK ABI evidence manifest exceeds the maximum size of 1 MiB: $path",
            )
        }

        val root =
            try {
                Files.newInputStream(path).use { input -> MAPPER.readTree(input) }
            } catch (failure: Exception) {
                throw AbiEvidenceInputException(
                    "Generated-SDK ABI evidence manifest is not well-formed JSON: $path",
                    failure,
                )
            }
        val sdkIdentity =
            root.get("sdkIdentity")?.takeIf { node -> node.isTextual && node.asText().isNotBlank() }?.asText()
                ?: throw AbiEvidenceInputException(
                    "Generated-SDK ABI evidence manifest is missing a non-blank sdkIdentity: $path",
                )

        val manifestDirectory = path.toAbsolutePath().normalize().parent
        val jvm = root.get("jvm")?.let { jvmNode -> readJvmArtifact(jvmNode, sdkIdentity, manifestDirectory, path) }

        val klibTargetsNode = root.get("klibTargets")
        val klibTargets =
            if (klibTargetsNode == null) {
                emptyList()
            } else {
                if (!klibTargetsNode.isArray) {
                    throw AbiEvidenceInputException(
                        "Generated-SDK ABI evidence manifest field klibTargets must be an array: $path",
                    )
                }
                if (klibTargetsNode.size() > MAX_KLIB_TARGETS) {
                    throw AbiEvidenceInputException(
                        "Generated-SDK ABI evidence manifest declares ${klibTargetsNode.size()} klibTargets, " +
                            "above the maximum of $MAX_KLIB_TARGETS: $path",
                    )
                }
                klibTargetsNode.map { targetNode -> readKlibTarget(targetNode, sdkIdentity, manifestDirectory, path) }
            }

        return GeneratedSdkAbiEvidence(sdkIdentity = sdkIdentity, jvm = jvm, klibTargets = klibTargets)
    }

    private fun readJvmArtifact(
        jvmNode: JsonNode,
        sdkIdentity: String,
        manifestDirectory: Path,
        path: Path,
    ): GeneratedSdkJvmAbiArtifact {
        val dumpPath =
            jvmNode.get("dumpPath")?.takeIf { node -> node.isTextual }?.asText()
                ?: throw AbiEvidenceInputException(
                    "Generated-SDK ABI evidence manifest field jvm.dumpPath is required: $path",
                )
        val dumpText = readDumpText(manifestDirectory, dumpPath, path)
        return GeneratedSdkJvmAbiArtifact(
            dumpText = dumpText,
            evidence =
                CompatibilityEvidenceReference(
                    kind = "jvm-abi-dump",
                    identity = "$sdkIdentity:jvm",
                    sha256 = normalizedCompatibilityFingerprint(dumpText),
                ),
        )
    }

    private fun readKlibTarget(
        targetNode: JsonNode,
        sdkIdentity: String,
        manifestDirectory: Path,
        path: Path,
    ): GeneratedSdkKlibAbiTarget {
        val targetName =
            targetNode.get("targetName")?.takeIf { node -> node.isTextual && node.asText().isNotBlank() }?.asText()
                ?: throw AbiEvidenceInputException(
                    "Generated-SDK ABI evidence manifest klibTargets entry is missing a non-blank targetName: $path",
                )
        val dumpPathNode = targetNode.get("dumpPath")
        val unavailableNode = targetNode.get("unavailable")
        if ((dumpPathNode == null) == (unavailableNode == null)) {
            throw AbiEvidenceInputException(
                "Generated-SDK ABI evidence manifest klibTargets entry \"$targetName\" must declare exactly one " +
                    "of dumpPath or unavailable: $path",
            )
        }

        val state =
            if (dumpPathNode != null) {
                val dumpText = readDumpText(manifestDirectory, dumpPathNode.asText(), path)
                GeneratedSdkKlibTargetState.Available(
                    dumpText = dumpText,
                    evidence =
                        CompatibilityEvidenceReference(
                            kind = "klib-abi-dump",
                            identity = "$sdkIdentity:$targetName",
                            sha256 = normalizedCompatibilityFingerprint(dumpText),
                        ),
                )
            } else {
                val reasonCode =
                    unavailableNode
                        ?.get("reasonCode")
                        ?.takeIf { node -> node.isTextual && node.asText().isNotBlank() }
                        ?.asText()
                        ?: throw AbiEvidenceInputException(
                            "Generated-SDK ABI evidence manifest klibTargets entry \"$targetName\" is unavailable " +
                                "but declares no non-blank reasonCode: $path",
                        )
                val detail = unavailableNode.get("detail")?.takeIf { node -> node.isTextual }?.asText()
                GeneratedSdkKlibTargetState.Unavailable(reasonCode = reasonCode, detail = detail)
            }

        return GeneratedSdkKlibAbiTarget(targetName = targetName, state = state)
    }

    private fun readDumpText(
        manifestDirectory: Path,
        dumpPath: String,
        manifestPath: Path,
    ): String {
        if (dumpPath.isBlank()) {
            throw AbiEvidenceInputException("Generated-SDK ABI evidence dumpPath must not be blank: $manifestPath")
        }

        // The lexical check catches `..` traversal cheaply and with a precise message, but it is not sufficient on
        // its own: `normalize()` rewrites text without consulting the filesystem, so a symlink inside the evidence
        // directory still resolves outside it and `Files.isRegularFile` follows it. Containment is therefore
        // decided below on paths with every link already resolved.
        val resolved = manifestDirectory.resolve(dumpPath).normalize()
        val escaped =
            AbiEvidenceInputException(
                "Generated-SDK ABI evidence dumpPath must not escape its manifest directory: $dumpPath",
            )
        if (!resolved.startsWith(manifestDirectory)) throw escaped

        val realDirectory =
            try {
                manifestDirectory.toRealPath()
            } catch (failure: IOException) {
                throw AbiEvidenceInputException(
                    "Generated-SDK ABI evidence manifest directory cannot be resolved: $manifestDirectory",
                    failure,
                )
            }
        val realDump =
            try {
                resolved.toRealPath()
            } catch (failure: IOException) {
                throw AbiEvidenceInputException(
                    "Generated-SDK ABI evidence dump file does not exist: $resolved",
                    failure,
                )
            }
        if (!realDump.startsWith(realDirectory)) throw escaped
        if (!Files.isRegularFile(realDump)) {
            throw AbiEvidenceInputException("Generated-SDK ABI evidence dump is not a regular file: $realDump")
        }

        val dumpSize = Files.size(realDump)
        if (dumpSize > MAX_DUMP_BYTES) {
            throw AbiEvidenceInputException(
                "Generated-SDK ABI evidence dump exceeds the maximum size of 128 MiB: $realDump",
            )
        }
        return Files.readString(realDump)
    }
}

/** Thrown for a malformed or structurally invalid generated-SDK ABI evidence manifest input. */
internal class AbiEvidenceInputException(
    message: String,
    cause: Throwable? = null,
) : IllegalArgumentException(message, cause)
