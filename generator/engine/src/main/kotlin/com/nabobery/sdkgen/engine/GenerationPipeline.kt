package com.nabobery.sdkgen.engine

import com.fasterxml.jackson.databind.ObjectMapper
import com.nabobery.sdkgen.engine.config.ConfigDigest
import com.nabobery.sdkgen.engine.config.OverlayConflictPolicy
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.ZeroMatchPolicy
import com.nabobery.sdkgen.engine.declarations.DeclarationProjection
import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.OpenRouterPhase1Projection
import com.nabobery.sdkgen.engine.emit.KotlinEmitter
import com.nabobery.sdkgen.engine.emit.KotlinPoetEmitter
import com.nabobery.sdkgen.engine.output.AtomicOutputPublisher
import com.nabobery.sdkgen.engine.output.GenerationManifestIdentity
import com.nabobery.sdkgen.engine.output.LockPublication
import com.nabobery.sdkgen.engine.output.ManifestInput
import com.nabobery.sdkgen.engine.output.ManifestOverlay
import com.nabobery.sdkgen.engine.output.ManifestPlugin
import com.nabobery.sdkgen.openapi.SemanticAdapter
import com.nabobery.sdkgen.openapi.overlays.ConflictPolicy
import com.nabobery.sdkgen.openapi.overlays.OverlayApplicator
import com.nabobery.sdkgen.openapi.overlays.OverlayInput
import com.nabobery.sdkgen.openapi.overlays.ZeroMatchMode
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.deleteIfExists
import kotlin.io.path.readBytes
import kotlin.io.path.writeBytes

/**
 * A root OpenAPI document already staged and verified on local disk, together with the recorded
 * identity ([canonicalUri], [sha256], [contentLength]) of every referenced document it pulls in.
 * [GenerationPipeline] re-verifies [path] and each [references] entry against these digests
 * before use — this type is a claim of identity, not a substitute for that check.
 */
public data class ResolvedSource(
    public val path: Path,
    public val canonicalUri: String,
    public val sha256: String,
    public val contentLength: Long,
    public val references: List<ResolvedReference> = emptyList(),
)

public data class ResolvedReference(
    public val canonicalUri: String,
    public val sha256: String,
    public val contentLength: Long,
)

/** An OpenAPI Overlay (JSONPath-targeted actions) document staged and verified on local disk, applied in list order. */
public data class ResolvedGenerationOverlay(
    public val id: String,
    public val path: Path,
    public val canonicalUri: String,
    public val sha256: String,
)

/** Lock text committed atomically with the generated-output pointer. */
public data class GenerationLockPublication(
    public val destination: Path,
    public val encodedLock: String,
)

public data class GenerationDiagnosticView(
    public val code: String,
    public val message: String,
    public val documentUri: String,
    public val jsonPointer: String,
)

/** A symbol (schema, operation, ...) that projection chose not to represent, and why. */
public data class GenerationExclusionView(
    public val symbolId: String,
    public val reason: String,
    public val documentUri: String,
    public val jsonPointer: String,
)

public data class ValidationResult(
    public val diagnostics: List<GenerationDiagnosticView>,
    public val exclusions: List<GenerationExclusionView>,
)

/**
 * The outcome of a successful [GenerationPipeline.generate] call. [snapshotSha256] is the digest
 * of the atomically published output tree as a whole (its manifest), distinct from
 * [declarationModelSha256] which digests the pre-emission declaration model — the two let a
 * caller distinguish "the semantic mapping changed" from "only the rendered files changed" (e.g.
 * after an emitter formatting fix) without re-reading either artifact.
 */
public data class GenerationResult(
    public val snapshotSha256: String,
    public val declarationModelSha256: String,
    public val output: Path,
    public val generatedFiles: Int,
    public val manifestBytes: Long,
    public val diagnostics: List<GenerationDiagnosticView>,
    public val exclusions: List<GenerationExclusionView>,
    public val elapsedMillis: Long,
)

/**
 * Drives one OpenAPI-document-to-Kotlin-source generation from resolved, already-staged inputs:
 * adapt to a [com.nabobery.sdkgen.model.SemanticDocument], project it to a declaration model
 * (via [com.nabobery.sdkgen.engine.declarations.DeclarationProjection]), and — for [generate] only
 * — render and atomically publish Kotlin source files (via
 * [com.nabobery.sdkgen.engine.emit.KotlinEmitter]). The public constructor wires the Phase 1
 * OpenRouter-only projection and the KotlinPoet emitter; the internal constructor exists so tests
 * can substitute either seam without touching pipeline logic.
 *
 * [validate] and [generate] both re-verify every input's digest before doing any work (see
 * [verifyResolvedInputs]) and share the same adapt-then-project path, so a document that fails
 * projection fails identically in both. [validate] stops there and never touches [destination] or
 * disk beyond that shared path; [generate] additionally renders and publishes files.
 *
 * Atomicity: [generate] hands rendered files to [com.nabobery.sdkgen.engine.output.AtomicOutputPublisher],
 * which publishes the whole output tree (and, if requested, the lock file) as a single atomic
 * step. A [generate] call that fails at any point — adaptation, projection, rendering, or
 * publication — leaves any prior output at [destination] completely untouched; there is no
 * partially-written or half-updated state a caller can observe.
 */
public class GenerationPipeline private constructor(
    private val generatorVersion: String,
    private val edition: String,
    private val kotlinPoetVersion: String,
    private val projection: DeclarationProjection,
    private val emitter: KotlinEmitter,
) {
    public constructor(
        generatorVersion: String,
        edition: String = "community",
        kotlinPoetVersion: String = "2.3.0",
    ) : this(generatorVersion, edition, kotlinPoetVersion, OpenRouterPhase1Projection(), KotlinPoetEmitter())

    internal constructor(
        generatorVersion: String,
        projection: DeclarationProjection,
        edition: String = "community",
        kotlinPoetVersion: String = "2.3.0",
        emitter: KotlinEmitter = KotlinPoetEmitter(),
    ) : this(generatorVersion, edition, kotlinPoetVersion, projection, emitter)

    /**
     * Adapts and projects [source] (with [overlays] applied) without emitting or publishing
     * anything. Use this to surface diagnostics and exclusions cheaply, e.g. from a `validate`
     * CLI command, without touching the output directory at all.
     *
     * @throws IllegalArgumentException if any resolved input's digest does not match its
     *   recorded identity in [config] or [source]/[overlays] (see [verifyResolvedInputs]).
     */
    public fun validate(
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
        overlays: List<ResolvedGenerationOverlay>,
    ): ValidationResult {
        verifyResolvedInputs(config, source, overlays)
        val effectivePath = materializeEffectiveSource(config, source, overlays)
        try {
            val semantic = SemanticAdapter().adapt(effectivePath).document
            val mapping =
                projection.project(
                    DeclarationProjectionRequest(
                        document = semantic,
                        packageName = config.kotlin.packageName,
                        canonicalDocumentUri = source.canonicalUri,
                        clientName = config.kotlin.naming.clientName,
                    ),
                )
            return ValidationResult(
                diagnostics =
                    mapping.diagnostics.map {
                        GenerationDiagnosticView(it.code, it.message, it.source.documentUri, it.source.jsonPointer)
                    },
                exclusions =
                    mapping.exclusions.map {
                        GenerationExclusionView(it.symbolId, it.reason, it.source.documentUri, it.source.jsonPointer)
                    },
            )
        } finally {
            if (effectivePath != source.path) effectivePath.deleteIfExists()
        }
    }

    /**
     * Adapts, projects, renders, and atomically publishes Kotlin source for [source] (with
     * [overlays] applied) to [destination]. See the class documentation for the atomicity
     * guarantee: a failure at any stage leaves prior content at [destination] untouched.
     *
     * [lock] is this call's own concern, not "locked mode" verification — passing it publishes an
     * `sdkgen.lock` alongside the generated output, atomically with it, recording the resolved
     * input identities for a future `--locked` run to check against
     * ([com.nabobery.sdkgen.engine.config.LockedInputVerifier]). Locked-mode *verification* (does
     * this run match a previously committed lock) happens before this method is ever called —
     * callers that need to refuse on drift call [com.nabobery.sdkgen.engine.config.LockedInputVerifier.verify]
     * against [source]/[overlays] first and only invoke [generate] once that passes.
     *
     * [failAfterFiles] is a test-only fault-injection seam: publishing fails partway through after
     * writing the given number of files, to exercise the atomicity guarantee.
     *
     * @throws IllegalArgumentException if any resolved input's digest does not match its recorded
     *   identity in [config] or [source]/[overlays].
     */
    public fun generate(
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
        overlays: List<ResolvedGenerationOverlay>,
        destination: Path,
        failAfterFiles: Int? = null,
        lock: GenerationLockPublication? = null,
    ): GenerationResult {
        verifyResolvedInputs(config, source, overlays)
        val started = System.nanoTime()
        val effectivePath = materializeEffectiveSource(config, source, overlays)
        try {
            val semantic = SemanticAdapter().adapt(effectivePath).document
            val mapping =
                projection.project(
                    DeclarationProjectionRequest(
                        document = semantic,
                        packageName = config.kotlin.packageName,
                        canonicalDocumentUri = source.canonicalUri,
                        clientName = config.kotlin.naming.clientName,
                    ),
                )
            val files = emitter.render(mapping.model)
            val identity = manifestIdentity(config, source, overlays)
            val publication =
                AtomicOutputPublisher().publish(
                    destination = destination,
                    declarationModel = mapping.model,
                    files = files,
                    identity = identity,
                    diagnostics = mapping.diagnostics,
                    exclusions = mapping.exclusions,
                    failAfterFiles = failAfterFiles,
                    lock = lock?.let { LockPublication(it.destination, it.encodedLock.encodeToByteArray()) },
                )
            return GenerationResult(
                snapshotSha256 = publication.digest,
                declarationModelSha256 = mapping.model.digest(),
                output = publication.destination,
                generatedFiles = files.size,
                manifestBytes = publication.manifestBytes,
                diagnostics =
                    mapping.diagnostics.map {
                        GenerationDiagnosticView(it.code, it.message, it.source.documentUri, it.source.jsonPointer)
                    },
                exclusions =
                    mapping.exclusions.map {
                        GenerationExclusionView(it.symbolId, it.reason, it.source.documentUri, it.source.jsonPointer)
                    },
                elapsedMillis = (System.nanoTime() - started) / 1_000_000,
            )
        } finally {
            if (effectivePath != source.path) effectivePath.deleteIfExists()
        }
    }

    private fun verifyResolvedInputs(
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
        overlays: List<ResolvedGenerationOverlay>,
    ) {
        verifyStagedFile(source.path, source.sha256, source.contentLength, source.canonicalUri)
        source.references.forEach { reference ->
            val stagedPath = source.path.parent.resolve(reference.canonicalUri.removePrefix("sdkgen://source/"))
            verifyStagedFile(stagedPath, reference.sha256, reference.contentLength, reference.canonicalUri)
        }
        config.source.sha256?.let { expected ->
            require(expected == source.sha256) { "Configured source digest does not match resolved source" }
        }
        require(
            config.overlays.map {
                it.id
            } == overlays.map { it.id },
        ) { "Resolved overlays must match configured order and identity" }
        overlays.forEach { overlay ->
            require(
                overlay.path.readBytes().sha256() == overlay.sha256,
            ) { "Resolved overlay digest does not match ${overlay.id}" }
            config.overlays.single { it.id == overlay.id }.sha256?.let { expected ->
                require(expected == overlay.sha256) { "Configured overlay digest does not match ${overlay.id}" }
            }
        }
    }

    private fun verifyStagedFile(
        path: Path,
        expectedSha256: String,
        expectedContentLength: Long,
        canonicalUri: String,
    ) {
        require(Files.size(path) == expectedContentLength) {
            "Resolved input length does not match $canonicalUri"
        }
        require(path.readBytes().sha256() == expectedSha256) {
            "Resolved input digest does not match $canonicalUri"
        }
    }

    private fun manifestIdentity(
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
        overlays: List<ResolvedGenerationOverlay>,
    ): GenerationManifestIdentity =
        GenerationManifestIdentity(
            configDigest = ConfigDigest.sha256(config),
            source = ManifestInput(source.canonicalUri, source.sha256, source.contentLength),
            references = source.references.map { ManifestInput(it.canonicalUri, it.sha256, it.contentLength) },
            overlays = overlays.map { ManifestOverlay(it.id, it.canonicalUri, it.sha256) },
            generatorVersion = generatorVersion,
            edition = edition,
            kotlinPoetVersion = kotlinPoetVersion,
            targets = config.kotlin.targets.map { it.name.lowercase() },
            plugins =
                config.plugins.filter { it.enabled }.map { plugin ->
                    ManifestPlugin(
                        id = plugin.id,
                        version = plugin.version,
                        spiRange = plugin.spiRange,
                        configSha256 = ConfigDigest.sha256(plugin.config),
                    )
                },
        )
}

internal fun materializeEffectiveSource(
    config: SdkgenConfigV1Alpha1,
    source: ResolvedSource,
    overlays: List<ResolvedGenerationOverlay>,
): Path {
    if (overlays.isEmpty()) return source.path
    val configured = config.overlays.associateBy { it.id }
    val zeroMatchModes = overlays.map { configured.getValue(it.id).zeroMatchPolicy }.distinct()
    val conflictPolicies = overlays.map { configured.getValue(it.id).conflictPolicy }.distinct()
    require(zeroMatchModes.size == 1) { "All Phase 1 overlays must use the same zero-match policy" }
    require(conflictPolicies.size == 1) { "All Phase 1 overlays must use the same conflict policy" }
    val applicator =
        OverlayApplicator(
            zeroMatchMode =
                if (zeroMatchModes.single() == ZeroMatchPolicy.FAIL) ZeroMatchMode.STRICT else ZeroMatchMode.COMPAT,
            conflictPolicy =
                if (conflictPolicies.single() == OverlayConflictPolicy.FAIL) {
                    ConflictPolicy.FAIL
                } else {
                    ConflictPolicy.LAST_WRITE_WINS
                },
        )
    val result =
        applicator.apply(
            source = source.path.readBytes(),
            overlays = overlays.map { OverlayInput(it.id, it.path.readBytes()) },
        )
    val temp = Files.createTempFile(requireNotNull(source.path.parent), ".sdkgen-effective-", ".json")
    temp.writeBytes(ObjectMapper().writeValueAsBytes(result.document))
    return temp
}

private fun ByteArray.sha256(): String =
    MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }
