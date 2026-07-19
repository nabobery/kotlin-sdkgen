package com.nabobery.sdkgen.engine.config

import com.nabobery.sdkgen.engine.ResolvedGenerationOverlay
import com.nabobery.sdkgen.engine.ResolvedSource
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 * The `sdkgen.lock` `v1alpha1` contract: a snapshot of exactly which config, source bytes,
 * overlays, and generator identity produced a committed generation output. [configDigest] is
 * [ConfigDigest.sha256] of the `sdkgen.yaml`/`sdkgen.json` that produced this lock — a mismatch
 * against the current config is config drift, checked by [LockDrift]. [source] and [overlays]
 * are checked against freshly resolved inputs by [LockedMode.verify]; committing this file and
 * later running with `--locked` is what pins a reproducible generation to reviewed content
 * rather than to a URI that could resolve to different bytes later.
 */
@Serializable
public data class SdkgenLockV1Alpha1(
    public val version: LockVersion = LockVersion.V1_ALPHA_1,
    public val configDigest: String,
    public val source: LockedSource,
    public val overlays: List<LockedOverlay>,
    public val generator: LockedGenerator,
    public val compatibilityProfiles: List<LockedCompatibilityProfile> = emptyList(),
    public val plugins: List<LockedPlugin> = emptyList(),
    public val tools: List<LockedTool> = emptyList(),
)

@Serializable
public enum class LockVersion {
    @SerialName("v1alpha1")
    V1_ALPHA_1,
}

/** [references] must be in strict ascending canonical-URI order; [LockedMode.verify] refuses a lock that violates this. */
@Serializable
public data class LockedSource(
    public val canonicalUri: String,
    public val sha256: String,
    public val contentLength: Long,
    public val references: List<LockedReference> = emptyList(),
)

@Serializable
public data class LockedReference(
    public val canonicalUri: String,
    public val sha256: String,
    public val contentLength: Long,
)

/** Overlays retain configured application order; reordering them is lock drift. */
@Serializable
public data class LockedOverlay(
    public val id: String,
    public val canonicalUri: String,
    public val sha256: String,
)

@Serializable
public data class LockedGenerator(
    public val version: String,
    public val edition: String,
)

@Serializable
public data class LockedCompatibilityProfile(
    public val id: String,
    public val version: String,
)

/** The exact descriptor phases used by the generation, pinned in canonical phase order. */
@Serializable
public data class LockedPlugin(
    public val id: String,
    public val version: String,
    public val spiRange: String,
    public val configSha256: String,
    public val phases: List<String> = emptyList(),
) {
    init {
        require(phases == phases.distinct()) { "Locked plugin phases must not be duplicated" }
        require(phases.all { phase -> phase in LOCKED_PLUGIN_PHASE_ORDER }) {
            "Locked plugin phases must use the published phase names"
        }
        require(phases == phases.sortedBy { phase -> LOCKED_PLUGIN_PHASE_ORDER.indexOf(phase) }) {
            "Locked plugin phases must be listed in canonical phase order"
        }
    }
}

@Serializable
public data class LockedTool(
    public val id: String,
    public val version: String,
)

/**
 * Encodes and decodes `sdkgen.lock` as canonical, deterministic JSON. [decode] validates the
 * version discriminator before attempting full deserialization, so a lock from an unsupported
 * future version fails with a clear [UnsupportedLockVersionException] rather than an opaque
 * structural deserialization error.
 */
public object LockCodec {
    private val json =
        Json {
            prettyPrint = true
            prettyPrintIndent = "  "
            encodeDefaults = true
            explicitNulls = false
            ignoreUnknownKeys = false
        }

    private val versionJson =
        Json {
            ignoreUnknownKeys = true
        }

    /** Normalizes line endings and trailing whitespace so re-encoding an unchanged lock is byte-identical. */
    public fun encode(lock: SdkgenLockV1Alpha1): String =
        json.encodeToString(lock).replace("\r\n", "\n").trimEnd() + "\n"

    /**
     * @throws LockDecodeException if [text] is not valid JSON matching the lock schema.
     * @throws MissingLockVersionException if [text] has no `version` field.
     * @throws UnsupportedLockVersionException if `version` is present but not `v1alpha1`.
     */
    public fun decode(
        text: String,
        file: String = "sdkgen.lock",
    ): SdkgenLockV1Alpha1 {
        val version =
            try {
                versionJson.decodeFromString<LockVersionEnvelope>(text).version
            } catch (error: SerializationException) {
                throw LockDecodeException(lockDecodeDiagnostic(file, error.message.orEmpty()), error)
            }
        requireSupportedVersion(version, file)
        return try {
            json.decodeFromString(text)
        } catch (error: SerializationException) {
            throw LockDecodeException(lockDecodeDiagnostic(file, error.message.orEmpty()), error)
        } catch (error: IllegalArgumentException) {
            throw LockDecodeException(lockDecodeDiagnostic(file, error.message.orEmpty()), error)
        }
    }

    private fun requireSupportedVersion(
        version: String?,
        file: String,
    ) {
        if (version == null) {
            throw MissingLockVersionException(
                lockVersionDiagnostic(
                    code = "SDKGEN-LOCK-VERSION-MISSING",
                    file = file,
                    message = "The required lock-file version discriminator is missing.",
                    remediation = "Regenerate sdkgen.lock with a supported SDKGen version.",
                ),
            )
        }
        if (version != "v1alpha1") {
            throw UnsupportedLockVersionException(
                actualVersion = version,
                diagnostic =
                    lockVersionDiagnostic(
                        code = "SDKGEN-LOCK-VERSION-UNSUPPORTED",
                        file = file,
                        message = "Unsupported SDKGen lock-file version '$version'.",
                        remediation =
                            "Use a v1alpha1 lock file or regenerate sdkgen.lock with a supported SDKGen version.",
                    ),
            )
        }
    }

    @Serializable
    private data class LockVersionEnvelope(
        val version: String? = null,
    )
}

/**
 * Verifies that staged generation inputs exactly match the reviewed [SdkgenLockV1Alpha1] contract.
 * This is the refusal model for `--locked` generation: [verify] never throws for a mismatch, it
 * returns diagnostics — an empty list means proceed, any non-empty result means the caller must
 * refuse to generate rather than silently generating from unreviewed content. Refusal reasons
 * include config drift, a digest or content-length mismatch on the root document or a reference,
 * an input present but not locked (or vice versa), a duplicated input, and a lock whose
 * references are not in canonical order. [pluginPhases] supplies the currently registered descriptor
 * phases so a lock cannot silently accept a plugin that moved work between phases.
 */
public object LockedInputVerifier {
    public fun verify(
        config: SdkgenConfigV1Alpha1,
        lock: SdkgenLockV1Alpha1,
        source: ResolvedSource,
        overlays: List<ResolvedGenerationOverlay>,
        pluginPhases: Map<String, List<String>> = emptyMap(),
    ): List<Diagnostic> {
        val resolved =
            ResolvedInputs(
                source = ResolvedInput(source.canonicalUri, source.sha256, source.contentLength),
                references =
                    source.references.map { reference ->
                        ResolvedInput(reference.canonicalUri, reference.sha256, reference.contentLength)
                    },
                overlays =
                    overlays.map { overlay ->
                        ResolvedOverlay(overlay.id, overlay.canonicalUri, overlay.sha256)
                    },
            )
        return when (val result = LockedMode.verify(config, lock, resolved, pluginPhases)) {
            LockedModeResult.Proceed -> emptyList()
            is LockedModeResult.Refused -> result.reasons.map(LockRefusal::diagnostic)
        }
    }
}

@Serializable
internal data class ResolvedInputs(
    val source: ResolvedInput,
    val references: List<ResolvedInput>,
    val overlays: List<ResolvedOverlay>,
)

@Serializable
internal data class ResolvedInput(
    val canonicalUri: String,
    val sha256: String,
    val contentLength: Long,
)

@Serializable
internal data class ResolvedOverlay(
    val id: String,
    val canonicalUri: String,
    val sha256: String,
)

internal sealed interface LockedModeResult {
    data object Proceed : LockedModeResult

    data class Refused(
        val reasons: List<LockRefusal>,
    ) : LockedModeResult
}

internal sealed class LockRefusal(
    open val diagnostic: Diagnostic,
) {
    data class DigestMismatch(
        val inputId: String,
        val expectedSha256: String,
        val actualSha256: String,
        override val diagnostic: Diagnostic,
    ) : LockRefusal(diagnostic)

    data class ContentLengthMismatch(
        val inputId: String,
        val expectedContentLength: Long,
        val actualContentLength: Long,
        override val diagnostic: Diagnostic,
    ) : LockRefusal(diagnostic)

    data class MissingInput(
        val inputId: String,
        override val diagnostic: Diagnostic,
    ) : LockRefusal(diagnostic)

    data class MissingLockEntry(
        val inputId: String,
        override val diagnostic: Diagnostic,
    ) : LockRefusal(diagnostic)

    data class DuplicateInput(
        val inputId: String,
        override val diagnostic: Diagnostic,
    ) : LockRefusal(diagnostic)

    data class DuplicateLockEntry(
        val inputId: String,
        override val diagnostic: Diagnostic,
    ) : LockRefusal(diagnostic)

    data class ReferenceOrder(
        override val diagnostic: Diagnostic,
    ) : LockRefusal(diagnostic)

    data class ConfigDrift(
        override val diagnostic: Diagnostic,
    ) : LockRefusal(diagnostic)

    data class PluginMetadataMismatch(
        val pluginId: String,
        val expected: LockedPlugin?,
        val actual: LockedPlugin?,
        override val diagnostic: Diagnostic,
    ) : LockRefusal(diagnostic)
}

internal object LockedMode {
    fun verify(
        config: SdkgenConfigV1Alpha1,
        lock: SdkgenLockV1Alpha1,
        resolved: ResolvedInputs,
        pluginPhases: Map<String, List<String>> = emptyMap(),
    ): LockedModeResult {
        val configDrift = LockDrift.check(config, lock)
        val refusals =
            buildList {
                addAll(configDrift.map(LockRefusal::ConfigDrift))
                if (configDrift.isEmpty()) {
                    comparePlugins(config, lock.plugins, pluginPhases).forEach(::add)
                }
                addAll(
                    compareInput(
                        inputId = lock.source.canonicalUri,
                        expectedSha256 = lock.source.sha256,
                        expectedContentLength = lock.source.contentLength,
                        actual = resolved.source.takeIf { it.canonicalUri == lock.source.canonicalUri },
                        path = "$.source",
                    ),
                )
                compareReferences(lock.source.references, resolved.references).forEach(::add)
                compareOverlays(lock.overlays, resolved.overlays).forEach(::add)
            }
        return if (refusals.isEmpty()) LockedModeResult.Proceed else LockedModeResult.Refused(refusals)
    }

    private fun comparePlugins(
        config: SdkgenConfigV1Alpha1,
        expected: List<LockedPlugin>,
        pluginPhases: Map<String, List<String>>,
    ): List<LockRefusal> {
        val actual =
            config.plugins
                .filter { plugin -> plugin.enabled }
                .map { plugin ->
                    LockedPlugin(
                        id = plugin.id,
                        version = plugin.version,
                        spiRange = plugin.spiRange,
                        configSha256 = ConfigDigest.sha256(plugin.config),
                        phases = pluginPhases[plugin.id].orEmpty(),
                    )
                }
        return buildList {
            expected
                .groupingBy(LockedPlugin::id)
                .eachCount()
                .filterValues { count -> count > 1 }
                .keys
                .sorted()
                .forEach { pluginId -> add(duplicateLockEntry(pluginId, "$.plugins")) }
            actual
                .groupingBy(LockedPlugin::id)
                .eachCount()
                .filterValues { count -> count > 1 }
                .keys
                .sorted()
                .forEach { pluginId -> add(duplicateInput(pluginId, "$.plugins")) }
            repeat(maxOf(expected.size, actual.size)) { index ->
                val locked = expected.getOrNull(index)
                val configured = actual.getOrNull(index)
                if (locked != configured) {
                    val pluginId = locked?.id ?: configured?.id ?: "<unknown>"
                    add(
                        pluginMetadataMismatch(
                            index = index,
                            pluginId = pluginId,
                            expected = locked,
                            actual = configured,
                        ),
                    )
                }
            }
        }
    }

    private fun compareReferences(
        expected: List<LockedReference>,
        actual: List<ResolvedInput>,
    ): List<LockRefusal> {
        val actualByUri = actual.associateBy(ResolvedInput::canonicalUri)
        val expectedUris = expected.mapTo(mutableSetOf(), LockedReference::canonicalUri)
        val expectedUrisInOrder = expected.map(LockedReference::canonicalUri)
        return buildList {
            if (expectedUrisInOrder.zipWithNext().any { (previous, next) -> previous >= next }) {
                add(referenceOrder("$.source.references"))
            }
            expected
                .groupingBy(LockedReference::canonicalUri)
                .eachCount()
                .filterValues { count -> count > 1 }
                .keys
                .sorted()
                .forEach { inputId -> add(duplicateLockEntry(inputId, "$.source.references")) }
            actual
                .groupingBy(ResolvedInput::canonicalUri)
                .eachCount()
                .filterValues { count -> count > 1 }
                .keys
                .sorted()
                .forEach { inputId -> add(duplicateInput(inputId, "$.source.references")) }
            expected.forEachIndexed { index, locked ->
                addAll(
                    compareInput(
                        inputId = locked.canonicalUri,
                        expectedSha256 = locked.sha256,
                        expectedContentLength = locked.contentLength,
                        actual = actualByUri[locked.canonicalUri],
                        path = "$.source.references[$index]",
                    ),
                )
            }
            actual.filterNot { it.canonicalUri in expectedUris }.forEach { input ->
                add(missingLockEntry(input.canonicalUri, "$.source.references"))
            }
        }
    }

    private fun compareOverlays(
        expected: List<LockedOverlay>,
        actual: List<ResolvedOverlay>,
    ): List<LockRefusal> =
        buildList {
            expected.forEachIndexed { index, locked ->
                val resolved = actual.getOrNull(index)
                if (resolved == null) {
                    add(missingInput(locked.id, "$.overlays[$index]"))
                } else if (resolved.id != locked.id || resolved.canonicalUri != locked.canonicalUri) {
                    add(
                        missingLockEntry(
                            inputId = "${resolved.id}:${resolved.canonicalUri}",
                            path = "$.overlays[$index]",
                        ),
                    )
                } else {
                    compareDigest(
                        inputId = locked.id,
                        expected = locked.sha256,
                        actual = resolved.sha256,
                        path = "$.overlays[$index]",
                    )?.let(::add)
                }
            }
            actual.drop(expected.size).forEachIndexed { offset, overlay ->
                add(missingLockEntry(overlay.id, "$.overlays[${expected.size + offset}]"))
            }
        }

    private fun compareInput(
        inputId: String,
        expectedSha256: String,
        expectedContentLength: Long,
        actual: ResolvedInput?,
        path: String,
    ): List<LockRefusal> {
        if (actual == null) return listOf(missingInput(inputId, path))
        return buildList {
            compareDigest(inputId, expectedSha256, actual.sha256, path)?.let(::add)
            if (actual.contentLength != expectedContentLength) {
                add(
                    LockRefusal.ContentLengthMismatch(
                        inputId = inputId,
                        expectedContentLength = expectedContentLength,
                        actualContentLength = actual.contentLength,
                        diagnostic =
                            lockDiagnostic(
                                code = "SDKGEN-LOCK-CONTENT-LENGTH-MISMATCH",
                                path = path,
                                message =
                                    "Content length mismatch for locked input '$inputId': " +
                                        "expected $expectedContentLength, resolved ${actual.contentLength}.",
                                remediation =
                                    "Restore the locked content or regenerate and review " +
                                        "sdkgen.lock without --locked.",
                            ),
                    ),
                )
            }
        }
    }

    private fun compareDigest(
        inputId: String,
        expected: String,
        actual: String?,
        path: String,
    ): LockRefusal? =
        when {
            actual == null -> {
                missingInput(inputId, path)
            }

            actual != expected -> {
                LockRefusal.DigestMismatch(
                    inputId = inputId,
                    expectedSha256 = expected,
                    actualSha256 = actual,
                    diagnostic =
                        lockDiagnostic(
                            code = "SDKGEN-LOCK-DIGEST-MISMATCH",
                            path = path,
                            message =
                                "Digest mismatch for locked input '$inputId': " +
                                    "expected $expected, resolved $actual.",
                            remediation =
                                "Restore the locked content or regenerate and review " +
                                    "sdkgen.lock without --locked.",
                        ),
                )
            }

            else -> {
                null
            }
        }

    private fun pluginMetadataMismatch(
        index: Int,
        pluginId: String,
        expected: LockedPlugin?,
        actual: LockedPlugin?,
    ): LockRefusal.PluginMetadataMismatch {
        val message =
            when {
                expected == null -> {
                    "Configured plugin '$pluginId' has no matching sdkgen.lock entry."
                }

                actual == null -> {
                    "Locked plugin '$pluginId' is not enabled in the current configuration."
                }

                else -> {
                    "Plugin metadata for '$pluginId' differs between sdkgen.lock and the current configuration."
                }
            }
        return LockRefusal.PluginMetadataMismatch(
            pluginId = pluginId,
            expected = expected,
            actual = actual,
            diagnostic =
                lockDiagnostic(
                    code = "SDKGEN-LOCK-PLUGIN-MISMATCH",
                    path = "$.plugins[$index]",
                    message = message,
                    remediation =
                        "Restore the locked plugin metadata or regenerate and review sdkgen.lock " +
                            "without --locked.",
                ),
        )
    }

    private fun missingInput(
        inputId: String,
        path: String,
    ): LockRefusal.MissingInput =
        LockRefusal.MissingInput(
            inputId = inputId,
            diagnostic =
                lockDiagnostic(
                    code = "SDKGEN-LOCK-INPUT-MISSING",
                    path = path,
                    message =
                        "Locked input '$inputId' was not present " +
                            "in the resolved input set.",
                    remediation =
                        "Restore the input or regenerate and review " +
                            "sdkgen.lock without --locked.",
                ),
        )

    private fun missingLockEntry(
        inputId: String,
        path: String,
    ): LockRefusal.MissingLockEntry =
        LockRefusal.MissingLockEntry(
            inputId = inputId,
            diagnostic =
                lockDiagnostic(
                    code = "SDKGEN-LOCK-ENTRY-MISSING",
                    path = path,
                    message = "Resolved input '$inputId' has no matching sdkgen.lock entry.",
                    remediation = "Regenerate and review sdkgen.lock without --locked before generation.",
                ),
        )

    private fun duplicateInput(
        inputId: String,
        path: String,
    ): LockRefusal.DuplicateInput =
        LockRefusal.DuplicateInput(
            inputId = inputId,
            diagnostic =
                lockDiagnostic(
                    code = "SDKGEN-LOCK-DUPLICATE-INPUT",
                    path = path,
                    message = "Resolved input '$inputId' appears more than once.",
                    remediation = "Fix the resolved input graph before running in locked mode.",
                ),
        )

    private fun referenceOrder(path: String): LockRefusal.ReferenceOrder =
        LockRefusal.ReferenceOrder(
            diagnostic =
                lockDiagnostic(
                    code = "SDKGEN-LOCK-REFERENCE-ORDER",
                    path = path,
                    message = "Locked references must be in strict canonical URI order.",
                    remediation = "Regenerate and review sdkgen.lock without --locked.",
                ),
        )

    private fun duplicateLockEntry(
        inputId: String,
        path: String,
    ): LockRefusal.DuplicateLockEntry =
        LockRefusal.DuplicateLockEntry(
            inputId = inputId,
            diagnostic =
                lockDiagnostic(
                    code = "SDKGEN-LOCK-DUPLICATE-ENTRY",
                    path = path,
                    message = "Locked input '$inputId' appears more than once.",
                    remediation = "Regenerate and review sdkgen.lock without --locked.",
                ),
        )
}

internal object LockDrift {
    fun check(
        config: SdkgenConfigV1Alpha1,
        lock: SdkgenLockV1Alpha1,
    ): List<Diagnostic> {
        val actualDigest = ConfigDigest.sha256(config)
        return if (actualDigest == lock.configDigest) {
            emptyList()
        } else {
            listOf(
                lockDiagnostic(
                    code = "SDKGEN-LOCK-CONFIG-DRIFT",
                    path = "$.configDigest",
                    message =
                        "sdkgen.yaml does not match sdkgen.lock: expected ${lock.configDigest}, " +
                            "computed $actualDigest.",
                    remediation =
                        "Run check to review drift, then regenerate sdkgen.lock if the " +
                            "configuration change is intentional.",
                ),
            )
        }
    }
}

private fun lockDecodeDiagnostic(
    file: String,
    message: String,
): Diagnostic =
    Diagnostic(
        code = "SDKGEN-LOCK-DECODE-FAILED",
        severity = DiagnosticSeverity.ERROR,
        path =
            DiagnosticPath(
                file = file,
                yamlPath =
                    LOCK_JSON_PATH
                        .find(message)
                        ?.groupValues
                        ?.get(1)
                        ?.trimEnd('.') ?: "$",
            ),
        phase = DiagnosticPhase.LOCK,
        message = message.ifBlank { "The lock file could not be decoded." },
        remediation = "Regenerate sdkgen.lock with a supported SDKGen version.",
    )

private fun lockVersionDiagnostic(
    code: String,
    file: String,
    message: String,
    remediation: String,
): Diagnostic =
    Diagnostic(
        code = code,
        severity = DiagnosticSeverity.ERROR,
        path = DiagnosticPath(file = file, yamlPath = "$.version"),
        phase = DiagnosticPhase.LOCK,
        message = message,
        remediation = remediation,
    )

private val LOCKED_PLUGIN_PHASE_ORDER =
    listOf(
        "validation",
        "semantic_transform",
        "naming_type_mapping",
        "declaration_augmentation",
        "output_verification",
    )

private val LOCK_JSON_PATH = Regex("path: (\\$[^\\n]+)")

private fun lockDiagnostic(
    code: String,
    path: String,
    message: String,
    remediation: String,
): Diagnostic =
    Diagnostic(
        code = code,
        severity = DiagnosticSeverity.ERROR,
        path = DiagnosticPath(file = "sdkgen.lock", yamlPath = path),
        phase = DiagnosticPhase.LOCK,
        message = message,
        remediation = remediation,
    )
