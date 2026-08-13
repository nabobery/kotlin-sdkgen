@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine

import com.fasterxml.jackson.databind.ObjectMapper
import com.nabobery.sdkgen.engine.config.AcceptedWaiverConfig
import com.nabobery.sdkgen.engine.config.ConfigDigest
import com.nabobery.sdkgen.engine.config.OverlayConflictPolicy
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.WaivedSymbolKind
import com.nabobery.sdkgen.engine.config.ZeroMatchPolicy
import com.nabobery.sdkgen.engine.declarations.DeclarationMappingResult
import com.nabobery.sdkgen.engine.declarations.DeclarationProjection
import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.GenerationDiagnostic
import com.nabobery.sdkgen.engine.declarations.GenerationDiagnosticCode
import com.nabobery.sdkgen.engine.declarations.GenerationExclusion
import com.nabobery.sdkgen.engine.declarations.GenerationExclusionKind
import com.nabobery.sdkgen.engine.declarations.OperationClientDeclaration
import com.nabobery.sdkgen.engine.declarations.OperationDeclaration
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.engine.declarations.kotlinApiProjectionDigest
import com.nabobery.sdkgen.engine.declarations.semanticModelDigest
import com.nabobery.sdkgen.engine.emit.KotlinEmitter
import com.nabobery.sdkgen.engine.emit.KotlinPoetEmitter
import com.nabobery.sdkgen.engine.output.AtomicOutputPublisher
import com.nabobery.sdkgen.engine.output.GenerationManifestIdentity
import com.nabobery.sdkgen.engine.output.LockPublication
import com.nabobery.sdkgen.engine.output.ManifestCompatibilityProfile
import com.nabobery.sdkgen.engine.output.ManifestInput
import com.nabobery.sdkgen.engine.output.ManifestOverlay
import com.nabobery.sdkgen.engine.output.ManifestPlugin
import com.nabobery.sdkgen.engine.output.ManifestTool
import com.nabobery.sdkgen.engine.spi.DeclarationAugmentationPhaseValue
import com.nabobery.sdkgen.engine.spi.GeneratedFileSnapshot
import com.nabobery.sdkgen.engine.spi.NamingTypeMappingPhaseValue
import com.nabobery.sdkgen.engine.spi.OutputVerificationPhaseValue
import com.nabobery.sdkgen.engine.spi.PluginDiagnostic
import com.nabobery.sdkgen.engine.spi.PluginPipelineInput
import com.nabobery.sdkgen.engine.spi.PluginRecord
import com.nabobery.sdkgen.engine.spi.SdkGenPluginEngine
import com.nabobery.sdkgen.engine.spi.SdkGenPluginPhase
import com.nabobery.sdkgen.engine.spi.SdkGenPluginRegistry
import com.nabobery.sdkgen.engine.spi.applyDeclarationAugmentations
import com.nabobery.sdkgen.engine.spi.declarationSnapshots
import com.nabobery.sdkgen.engine.spi.toGenerationDiagnostic
import com.nabobery.sdkgen.model.DiagnosticPhase
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.model.SourceLocation
import com.nabobery.sdkgen.model.SourcePointer
import com.nabobery.sdkgen.openapi.SemanticAdapter
import com.nabobery.sdkgen.openapi.overlays.ConflictPolicy
import com.nabobery.sdkgen.openapi.overlays.OverlayApplicator
import com.nabobery.sdkgen.openapi.overlays.OverlayInput
import com.nabobery.sdkgen.openapi.overlays.ZeroMatchMode
import java.nio.file.AtomicMoveNotSupportedException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption.ATOMIC_MOVE
import java.nio.file.StandardCopyOption.REPLACE_EXISTING
import java.security.MessageDigest
import java.util.Locale
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
    public val severity: DiagnosticSeverity = DiagnosticSeverity.ERROR,
    public val phase: DiagnosticPhase = DiagnosticPhase.ADAPTATION,
    public val pluginPhase: SdkGenPluginPhase? = null,
    public val remediation: String = "Correct the reported input and rerun generation.",
    public val location: SourceLocation = SourceLocation(0, 0, 0),
)

/** A symbol (schema, operation, ...) that projection chose not to represent, and why. */
public data class GenerationExclusionView(
    public val symbolId: String,
    public val reason: String,
    public val documentUri: String,
    public val jsonPointer: String,
    public val kind: WaivedSymbolKind = WaivedSymbolKind.SCHEMA,
    public val diagnosticCode: String = "",
    public val reasonSha256: String = "",
) {
    /** Retains the pre-waiver JVM constructor descriptor for already-compiled consumers. */
    public constructor(
        symbolId: String,
        reason: String,
        documentUri: String,
        jsonPointer: String,
    ) : this(symbolId, reason, documentUri, jsonPointer, WaivedSymbolKind.SCHEMA, "", "")

    /** Retains the waiver-era JVM constructor descriptor for already-compiled consumers. */
    public constructor(
        waiverEraKind: WaivedSymbolKind,
        waiverEraSymbolId: String,
        waiverEraDiagnosticCode: String,
        waiverEraReason: String,
        waiverEraReasonSha256: String,
        waiverEraDocumentUri: String,
        waiverEraJsonPointer: String,
    ) : this(
        symbolId = waiverEraSymbolId,
        reason = waiverEraReason,
        documentUri = waiverEraDocumentUri,
        jsonPointer = waiverEraJsonPointer,
        kind = waiverEraKind,
        diagnosticCode = waiverEraDiagnosticCode,
        reasonSha256 = waiverEraReasonSha256,
    )
}

public data class AcceptedWaiverView(
    public val id: String,
    public val category: String,
    public val kind: WaivedSymbolKind,
    public val symbolId: String,
    public val diagnosticCode: String,
    public val documentUri: String,
    public val jsonPointer: String,
    public val reason: String,
    public val reasonSha256: String,
    public val rationale: String,
    public val owner: String,
    public val disposition: String,
)

public data class ValidationResult(
    public val diagnostics: List<GenerationDiagnosticView>,
    public val exclusions: List<GenerationExclusionView>,
    public val acceptedWaivers: List<AcceptedWaiverView> = emptyList(),
) {
    /** Retains the v1alpha1 JVM constructor descriptor for already-compiled consumers. */
    public constructor(
        diagnostics: List<GenerationDiagnosticView>,
        exclusions: List<GenerationExclusionView>,
    ) : this(diagnostics, exclusions, emptyList())
}

/** One projected Kotlin declaration paired with its resolved name and source origin. */
public data class ProjectedSymbolView(
    public val symbolId: String,
    public val resolvedName: String,
    public val kind: String,
    public val origin: SourcePointer,
)

/** Read-only adaptation and projection result used by tooling such as `explain`. */
public data class GenerationAnalysisResult(
    public val validation: ValidationResult,
    public val symbols: List<ProjectedSymbolView>,
)

/** Generation cannot publish because the resolved input contains blocking diagnostics or exclusions. */
public class GenerationBlockedException(
    public val validation: ValidationResult,
) : IllegalStateException(
        "Generation blocked by ${validation.diagnostics.count { it.severity == DiagnosticSeverity.ERROR }} " +
            "blocking diagnostic(s) and ${validation.exclusions.size} exclusion(s).",
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
    public val acceptedWaivers: List<AcceptedWaiverView> = emptyList(),
) {
    /** Retains the pre-waiver JVM constructor descriptor for already-compiled consumers. */
    public constructor(
        snapshotSha256: String,
        declarationModelSha256: String,
        output: Path,
        generatedFiles: Int,
        manifestBytes: Long,
        diagnostics: List<GenerationDiagnosticView>,
        exclusions: List<GenerationExclusionView>,
        elapsedMillis: Long,
    ) : this(
        snapshotSha256,
        declarationModelSha256,
        output,
        generatedFiles,
        manifestBytes,
        diagnostics,
        exclusions,
        elapsedMillis,
        emptyList(),
    )

    /** Retains the waiver-era JVM constructor descriptor for already-compiled consumers. */
    public constructor(
        waiverEraSnapshotSha256: String,
        waiverEraDeclarationModelSha256: String,
        waiverEraOutput: Path,
        waiverEraGeneratedFiles: Int,
        waiverEraManifestBytes: Long,
        waiverEraDiagnostics: List<GenerationDiagnosticView>,
        waiverEraExclusions: List<GenerationExclusionView>,
        waiverEraAcceptedWaivers: List<AcceptedWaiverView>,
        waiverEraElapsedMillis: Long,
    ) : this(
        snapshotSha256 = waiverEraSnapshotSha256,
        declarationModelSha256 = waiverEraDeclarationModelSha256,
        output = waiverEraOutput,
        generatedFiles = waiverEraGeneratedFiles,
        manifestBytes = waiverEraManifestBytes,
        diagnostics = waiverEraDiagnostics,
        exclusions = waiverEraExclusions,
        elapsedMillis = waiverEraElapsedMillis,
        acceptedWaivers = waiverEraAcceptedWaivers,
    )
}

/**
 * Drives one OpenAPI-document-to-Kotlin-source generation from resolved, already-staged inputs:
 * adapt to a [com.nabobery.sdkgen.model.SemanticDocument], project it to a declaration model
 * (via [com.nabobery.sdkgen.engine.declarations.DeclarationProjection]), and — for [generate] only
 * — render and atomically publish Kotlin source files (via
 * [com.nabobery.sdkgen.engine.emit.KotlinEmitter]). The public constructor wires the general
 * standard projection and the KotlinPoet emitter; the internal constructor exists so tests can
 * substitute either seam without touching pipeline logic.
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
    private val pluginEngine: SdkGenPluginEngine,
) {
    public constructor(
        generatorVersion: String,
        edition: String = "community",
        kotlinPoetVersion: String = SdkGenDependencyVersions.kotlinPoet,
    ) : this(
        generatorVersion,
        edition,
        kotlinPoetVersion,
        StandardProjection(),
        KotlinPoetEmitter(),
        SdkGenPluginEngine(),
    )

    /**
     * Creates a pipeline with an explicitly supplied plugin registry. Plugin discovery is never
     * implicit; callers that opt into custom plugins must register them in deterministic order.
     */
    public constructor(
        generatorVersion: String,
        pluginRegistry: SdkGenPluginRegistry,
        edition: String = "community",
        kotlinPoetVersion: String = SdkGenDependencyVersions.kotlinPoet,
    ) : this(
        generatorVersion,
        edition,
        kotlinPoetVersion,
        StandardProjection(),
        KotlinPoetEmitter(),
        SdkGenPluginEngine(pluginRegistry),
    )

    internal constructor(
        generatorVersion: String,
        projection: DeclarationProjection,
        edition: String = "community",
        kotlinPoetVersion: String = SdkGenDependencyVersions.kotlinPoet,
        emitter: KotlinEmitter = KotlinPoetEmitter(),
        pluginEngine: SdkGenPluginEngine = SdkGenPluginEngine(),
    ) : this(generatorVersion, edition, kotlinPoetVersion, projection, emitter, pluginEngine)

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
            val adaptation = SemanticAdapter().adapt(effectivePath, rootCanonicalUri = source.canonicalUri)
            val effectiveDocumentUri = adaptation.document.documentUri
            val semantic =
                canonicalizeSemanticSources(
                    adaptation.document,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val prepared = preparePlugins(config, semantic, source)
            val preparedSemantic =
                canonicalizeSemanticSources(
                    prepared.semantic,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val mapping =
                canonicalizeMappingSources(
                    prepared.mapping,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val pluginDiagnostics =
                canonicalizePluginDiagnostics(
                    prepared.pluginDiagnostics,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val diagnostics =
                effectiveDiagnostics(
                    config,
                    combinedDiagnostics(preparedSemantic, mapping, pluginDiagnostics),
                )
            val exclusions = combinedExclusions(config, preparedSemantic, mapping)
            val waivers = resolveWaivers(config, exclusions, source.sourcePointer())
            return ValidationResult(
                diagnostics =
                    (
                        withoutAcceptedDiagnostics(
                            diagnostics,
                            waivers.accepted,
                        ) + waivers.diagnostics
                    ).map(::diagnosticView),
                exclusions = waivers.activeExclusions.map(::exclusionView),
                acceptedWaivers = waivers.accepted,
            )
        } finally {
            if (effectivePath != source.path) effectivePath.deleteIfExists()
        }
    }

    /**
     * Adapts and projects [source] without rendering or publishing. Unlike [validate], this also
     * exposes the resolved Kotlin declaration names and their source pointers for tooling.
     */
    public fun analyze(
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
        overlays: List<ResolvedGenerationOverlay>,
    ): GenerationAnalysisResult {
        verifyResolvedInputs(config, source, overlays)
        val effectivePath = materializeEffectiveSource(config, source, overlays)
        try {
            val adaptation = SemanticAdapter().adapt(effectivePath, rootCanonicalUri = source.canonicalUri)
            val effectiveDocumentUri = adaptation.document.documentUri
            val semantic =
                canonicalizeSemanticSources(
                    adaptation.document,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val prepared = preparePlugins(config, semantic, source)
            val preparedSemantic =
                canonicalizeSemanticSources(
                    prepared.semantic,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val mapping =
                canonicalizeMappingSources(
                    prepared.mapping,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val pluginDiagnostics =
                canonicalizePluginDiagnostics(
                    prepared.pluginDiagnostics,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val diagnostics =
                effectiveDiagnostics(
                    config,
                    combinedDiagnostics(preparedSemantic, mapping, pluginDiagnostics),
                )
            val exclusions = combinedExclusions(config, preparedSemantic, mapping)
            val waivers = resolveWaivers(config, exclusions, source.sourcePointer())
            val validation =
                ValidationResult(
                    diagnostics =
                        (
                            withoutAcceptedDiagnostics(
                                diagnostics,
                                waivers.accepted,
                            ) + waivers.diagnostics
                        ).map(::diagnosticView),
                    exclusions = waivers.activeExclusions.map(::exclusionView),
                    acceptedWaivers = waivers.accepted,
                )
            val symbols =
                buildList {
                    mapping.model.files.flatMap { file -> file.declarations }.forEach { declaration ->
                        add(
                            ProjectedSymbolView(
                                symbolId = declaration.symbolId,
                                resolvedName = declaration.resolvedName,
                                kind = declarationKind(declaration.symbolId),
                                origin = mapping.origins[declaration.symbolId] ?: preparedSemantic.source,
                            ),
                        )
                        if (declaration is OperationClientDeclaration) {
                            declaration.operations.forEach { operation ->
                                add(
                                    ProjectedSymbolView(
                                        symbolId = operation.symbolId,
                                        resolvedName = operation.operationId,
                                        kind = "operation",
                                        origin = mapping.origins[operation.symbolId] ?: semantic.source,
                                    ),
                                )
                            }
                        }
                    }
                }.distinctBy { symbol ->
                    "${symbol.symbolId}|${symbol.resolvedName}|${symbol.origin.documentUri}|${symbol.origin.jsonPointer}"
                }.sortedWith(
                    compareBy(
                        ProjectedSymbolView::kind,
                        ProjectedSymbolView::resolvedName,
                        ProjectedSymbolView::symbolId,
                    ),
                )
            return GenerationAnalysisResult(validation, symbols)
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
     * @throws GenerationBlockedException if blocking diagnostics or exclusions are present.
     */
    public fun generate(
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
        overlays: List<ResolvedGenerationOverlay>,
        destination: Path,
        failAfterFiles: Int? = null,
        lock: GenerationLockPublication? = null,
        publicApiProjectionDestination: Path? = null,
    ): GenerationResult {
        publicApiProjectionDestination?.let { projectionPath ->
            validateProjectionDestination(projectionPath, destination)
        }
        verifyResolvedInputs(config, source, overlays)
        val started = System.nanoTime()
        val effectivePath = materializeEffectiveSource(config, source, overlays)
        try {
            val adaptation = SemanticAdapter().adapt(effectivePath, rootCanonicalUri = source.canonicalUri)
            val effectiveDocumentUri = adaptation.document.documentUri
            val semantic =
                canonicalizeSemanticSources(
                    adaptation.document,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val prepared = preparePlugins(config, semantic, source)
            val preparedSemantic =
                canonicalizeSemanticSources(
                    prepared.semantic,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val mapping =
                canonicalizeMappingSources(
                    prepared.mapping,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val pluginDiagnostics =
                canonicalizePluginDiagnostics(
                    prepared.pluginDiagnostics,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val preparedDiagnostics =
                effectiveDiagnostics(
                    config,
                    combinedDiagnostics(preparedSemantic, mapping, pluginDiagnostics),
                )
            val preparedExclusions = combinedExclusions(config, preparedSemantic, mapping)
            val preparedWaivers = resolveWaivers(config, preparedExclusions, source.sourcePointer())
            blockIfNeeded(
                withoutAcceptedDiagnostics(preparedDiagnostics, preparedWaivers.accepted) + preparedWaivers.diagnostics,
                preparedWaivers.activeExclusions,
                preparedWaivers.accepted,
            )
            val emitted = emitter.render(mapping.model)
            val files = emitted.files
            val outputPlugins =
                pluginEngine.run(
                    config = config,
                    input =
                        PluginPipelineInput(
                            source = source.sourcePointer(),
                            document = preparedSemantic,
                            naming = prepared.naming,
                            declarations = prepared.declarations,
                            output =
                                OutputVerificationPhaseValue(
                                    files =
                                        files.map { file ->
                                            GeneratedFileSnapshot(
                                                file.path,
                                                file.bytes.sha256(),
                                                file.bytes.size.toLong(),
                                            )
                                        },
                                ),
                            initialDiagnostics = pluginDiagnostics,
                        ).also { stagedInput ->
                            stagedInput.skippedPluginIds += prepared.skippedPluginIds
                        },
                    from = SdkGenPluginPhase.OUTPUT_VERIFICATION,
                )
            val outputPluginDiagnostics =
                canonicalizePluginDiagnostics(
                    outputPlugins.diagnostics,
                    effectiveDocumentUri,
                    source.canonicalUri,
                )
            val diagnostics =
                effectiveDiagnostics(
                    config,
                    combinedDiagnostics(preparedSemantic, mapping, outputPluginDiagnostics),
                )
            val exclusions = combinedExclusions(config, preparedSemantic, mapping)
            val waivers = resolveWaivers(config, exclusions, source.sourcePointer())
            val activeDiagnostics = withoutAcceptedDiagnostics(diagnostics, waivers.accepted) + waivers.diagnostics
            blockIfNeeded(activeDiagnostics, waivers.activeExclusions, waivers.accepted)
            val identity = manifestIdentity(config, source, overlays, outputPlugins.records)
            val publication =
                AtomicOutputPublisher().publish(
                    destination = destination,
                    declarationModel = prepared.mapping.model,
                    files = files,
                    identity = identity,
                    diagnostics = activeDiagnostics,
                    exclusions = waivers.activeExclusions,
                    acceptedWaivers = waivers.accepted,
                    failAfterFiles = failAfterFiles,
                    lock = lock?.let { LockPublication(it.destination, it.encodedLock.encodeToByteArray()) },
                    effectiveContractSha256 = effectivePath.readBytes().sha256(),
                    semanticModelSha256 = preparedSemantic.semanticModelDigest(),
                    kotlinApiSha256 = prepared.mapping.model.kotlinApiProjectionDigest(),
                )
            // Staged beside the run rather than published into the output tree, exactly as the parity behavior
            // ledger and the staged ABI dumps are: it is compatibility evidence, not generated SDK source, and
            // committing it would put a second copy of the emitted API under the manifest's own digest list.
            publicApiProjectionDestination?.let { projectionPath ->
                writeProjectionAtomically(
                    projectionPath = projectionPath,
                    generatedOutput = publication.destination,
                    bytes = emitted.publicApiProjection.encodeToByteArray(),
                )
            }
            return GenerationResult(
                snapshotSha256 = publication.digest,
                declarationModelSha256 = prepared.mapping.model.digest(),
                output = publication.destination,
                generatedFiles = files.size,
                manifestBytes = publication.manifestBytes,
                diagnostics = activeDiagnostics.map(::diagnosticView),
                exclusions = waivers.activeExclusions.map(::exclusionView),
                acceptedWaivers = waivers.accepted,
                elapsedMillis = (System.nanoTime() - started) / 1_000_000,
            )
        } finally {
            if (effectivePath != source.path) effectivePath.deleteIfExists()
        }
    }

    private fun writeProjectionAtomically(
        projectionPath: Path,
        generatedOutput: Path,
        bytes: ByteArray,
    ) {
        val output = generatedOutput.toRealPath()
        val requested = projectionPath.toAbsolutePath().normalize()
        require(!requested.startsWith(output)) {
            "Kotlin API projection path must be outside the generated output tree: $projectionPath"
        }
        val parent = requireNotNull(requested.parent) { "Kotlin API projection path must have a parent" }
        Files.createDirectories(parent)
        val realParent = parent.toRealPath()
        val destination = realParent.resolve(requested.fileName)
        require(!destination.startsWith(output)) {
            "Kotlin API projection path must be outside the generated output tree: $projectionPath"
        }
        val temporary = Files.createTempFile(realParent, ".${requested.fileName}-", ".tmp")
        try {
            temporary.writeBytes(bytes)
            try {
                Files.move(temporary, destination, ATOMIC_MOVE, REPLACE_EXISTING)
            } catch (_: AtomicMoveNotSupportedException) {
                Files.move(temporary, destination, REPLACE_EXISTING)
            }
        } finally {
            temporary.deleteIfExists()
        }
    }

    private fun validateProjectionDestination(
        projectionPath: Path,
        generatedOutput: Path,
    ) {
        val requested = projectionPath.toAbsolutePath().normalize()
        val output = generatedOutput.toAbsolutePath().normalize()
        val resolvedRequested = resolveThroughExistingAncestor(requested)
        val resolvedOutput = resolveThroughExistingAncestor(output)
        require(!requested.startsWith(output) && !resolvedRequested.startsWith(resolvedOutput)) {
            "Kotlin API projection path must be outside the generated output tree: $projectionPath"
        }
    }

    /**
     * Resolves every existing path prefix so a symlinked ancestor cannot disguise containment, while retaining
     * not-yet-created suffixes for the pre-publication validation.
     */
    private fun resolveThroughExistingAncestor(path: Path): Path {
        var ancestor = path.toAbsolutePath().normalize()
        val missing = ArrayDeque<Path>()
        while (!Files.exists(ancestor)) {
            ancestor.fileName?.let(missing::addFirst)
            ancestor = ancestor.parent ?: return path.toAbsolutePath().normalize()
        }
        var resolved = ancestor.toRealPath()
        missing.forEach { segment -> resolved = resolved.resolve(segment) }
        return resolved.normalize()
    }

    private fun project(
        semantic: SemanticDocument,
        config: SdkgenConfigV1Alpha1,
        source: ResolvedSource,
        clientName: String = config.kotlin.naming.clientName,
        modelPrefix: String? = config.kotlin.naming.modelPrefix,
        operationPrefix: String? = config.kotlin.naming.operationPrefix,
    ): DeclarationMappingResult =
        projection.project(
            DeclarationProjectionRequest(
                document = semantic,
                packageName = config.kotlin.packageName,
                canonicalDocumentUri = source.canonicalUri,
                clientName = clientName,
                modelPrefix = modelPrefix,
                operationPrefix = operationPrefix,
                runtimeDefaults = config.runtime,
            ),
        )

    private fun canonicalizeSemanticSources(
        semantic: SemanticDocument,
        effectiveDocumentUri: String,
        resolvedSourceUri: String,
    ): SemanticDocument =
        semantic.copy(
            documentUri = canonicalDocumentUri(semantic.documentUri, effectiveDocumentUri, resolvedSourceUri),
            diagnostics =
                semantic.diagnostics.map { diagnostic ->
                    diagnostic.copy(
                        source = canonicalizeSourcePointer(diagnostic.source, effectiveDocumentUri, resolvedSourceUri),
                    )
                },
            source = canonicalizeSourcePointer(semantic.source, effectiveDocumentUri, resolvedSourceUri),
        )

    private fun canonicalizeMappingSources(
        mapping: DeclarationMappingResult,
        effectiveDocumentUri: String,
        resolvedSourceUri: String,
    ): DeclarationMappingResult =
        mapping.copy(
            diagnostics =
                mapping.diagnostics.map { diagnostic ->
                    diagnostic.copy(
                        source = canonicalizeSourcePointer(diagnostic.source, effectiveDocumentUri, resolvedSourceUri),
                    )
                },
            exclusions =
                mapping.exclusions.map { exclusion ->
                    exclusion.copy(
                        source = canonicalizeSourcePointer(exclusion.source, effectiveDocumentUri, resolvedSourceUri),
                    )
                },
            origins =
                mapping.origins.mapValues { (_, origin) ->
                    canonicalizeSourcePointer(origin, effectiveDocumentUri, resolvedSourceUri)
                },
        )

    private fun canonicalizePluginDiagnostics(
        diagnostics: List<PluginDiagnostic>,
        effectiveDocumentUri: String,
        resolvedSourceUri: String,
    ): List<PluginDiagnostic> =
        diagnostics.map { diagnostic ->
            diagnostic.copy(
                source = canonicalizeSourcePointer(diagnostic.source, effectiveDocumentUri, resolvedSourceUri),
            )
        }

    private fun canonicalDocumentUri(
        documentUri: String,
        effectiveDocumentUri: String,
        resolvedSourceUri: String,
    ): String = if (documentUri == effectiveDocumentUri) resolvedSourceUri else documentUri

    private fun canonicalizeSourcePointer(
        source: SourcePointer,
        effectiveDocumentUri: String,
        resolvedSourceUri: String,
    ): SourcePointer =
        if (source.documentUri == effectiveDocumentUri) {
            source.copy(documentUri = resolvedSourceUri)
        } else {
            source
        }

    private fun preparePlugins(
        config: SdkgenConfigV1Alpha1,
        semantic: SemanticDocument,
        source: ResolvedSource,
    ): PreparedPluginGeneration {
        val sourcePointer = source.sourcePointer()
        val preProjection =
            pluginEngine.run(
                config = config,
                input =
                    PluginPipelineInput(
                        source = sourcePointer,
                        document = semantic,
                        naming =
                            NamingTypeMappingPhaseValue(
                                clientName = config.kotlin.naming.clientName,
                                modelPrefix = config.kotlin.naming.modelPrefix,
                                operationPrefix = config.kotlin.naming.operationPrefix,
                            ),
                    ),
                from = SdkGenPluginPhase.VALIDATION,
            )
        val mapping =
            project(
                semantic = preProjection.document,
                config = config,
                source = source,
                clientName = preProjection.naming.clientName,
                modelPrefix = preProjection.naming.modelPrefix,
                operationPrefix = preProjection.naming.operationPrefix,
            )
        val postProjection =
            pluginEngine.run(
                config = config,
                input =
                    PluginPipelineInput(
                        source = sourcePointer,
                        document = preProjection.document,
                        naming = preProjection.naming,
                        declarations =
                            DeclarationAugmentationPhaseValue(
                                declarations = declarationSnapshots(mapping.model, sourcePointer),
                            ),
                        initialDiagnostics = preProjection.diagnostics,
                    ).also { stagedInput ->
                        stagedInput.skippedPluginIds += preProjection.skippedPluginIds
                    },
                from = SdkGenPluginPhase.DECLARATION_AUGMENTATION,
            )
        val declarations = requireNotNull(postProjection.declarations)
        return PreparedPluginGeneration(
            semantic = postProjection.document,
            naming = postProjection.naming,
            mapping = mapping.copy(model = applyDeclarationAugmentations(mapping.model, declarations.augmentations)),
            declarations = declarations,
            pluginDiagnostics = postProjection.diagnostics,
            skippedPluginIds = postProjection.skippedPluginIds,
        )
    }

    private fun combinedDiagnostics(
        semantic: SemanticDocument,
        mapping: DeclarationMappingResult,
        pluginDiagnostics: List<PluginDiagnostic> = emptyList(),
    ): List<GenerationDiagnostic> =
        (
            semantic.diagnostics.map(GenerationDiagnostic::fromSemantic) +
                mapping.diagnostics +
                pluginDiagnostics.map { diagnostic -> diagnostic.toGenerationDiagnostic() }
        ).distinctBy { diagnostic ->
            listOf(
                diagnostic.wireCode,
                diagnostic.symbolId,
                diagnostic.source.documentUri,
                diagnostic.source.jsonPointer,
                diagnostic.pluginPhase,
                diagnostic.message,
            )
        }.sortedWith(
            compareBy(
                GenerationDiagnostic::phase,
                { diagnostic -> diagnostic.source.documentUri },
                { diagnostic -> diagnostic.source.jsonPointer },
                GenerationDiagnostic::wireCode,
                { diagnostic -> diagnostic.pluginPhase },
                GenerationDiagnostic::message,
            ),
        )

    private fun effectiveDiagnostics(
        config: SdkgenConfigV1Alpha1,
        diagnostics: List<GenerationDiagnostic>,
    ): List<GenerationDiagnostic> = diagnostics.map { diagnostic -> applyWarningPolicy(config, diagnostic) }

    private fun applyWarningPolicy(
        config: SdkgenConfigV1Alpha1,
        diagnostic: GenerationDiagnostic,
    ): GenerationDiagnostic =
        if (
            diagnostic.severity == DiagnosticSeverity.WARNING &&
            config.diagnostics.warningsAsErrors &&
            diagnostic.wireCode !in config.diagnostics.warningAllowlist
        ) {
            diagnostic.copy(severity = DiagnosticSeverity.ERROR)
        } else {
            diagnostic
        }

    private data class WaiverResolution(
        val activeExclusions: List<GenerationExclusion>,
        val accepted: List<AcceptedWaiverView>,
        val diagnostics: List<GenerationDiagnostic>,
    )

    private fun resolveWaivers(
        config: SdkgenConfigV1Alpha1,
        exclusions: List<GenerationExclusion>,
        source: SourcePointer,
    ): WaiverResolution {
        val accepted = mutableListOf<AcceptedWaiverView>()
        val diagnostics = mutableListOf<GenerationDiagnostic>()
        val acceptedKeys = mutableSetOf<List<String>>()
        config.acceptedWaivers.sortedBy(AcceptedWaiverConfig::id).forEach { waiver ->
            val matches = exclusions.filter { exclusion -> exclusion.matches(waiver) }
            when (matches.size) {
                0 -> {
                    diagnostics +=
                        waiverDiagnostic("SDKGEN-WAIVER-STALE", "Waiver '${waiver.id}' matched no exclusion.", source)
                }

                1 -> {
                    val exclusion = matches.single()
                    val key = exclusion.waiverIdentity()
                    if (!acceptedKeys.add(key)) {
                        diagnostics +=
                            waiverDiagnostic(
                                "SDKGEN-WAIVER-DUPLICATE-MATCH",
                                "Waiver '${waiver.id}' duplicates an accepted exclusion.",
                                source,
                            )
                    } else {
                        accepted += exclusion.acceptedView(waiver)
                    }
                }

                else -> {
                    diagnostics +=
                        waiverDiagnostic(
                            "SDKGEN-WAIVER-AMBIGUOUS",
                            "Waiver '${waiver.id}' matched ${matches.size} exclusions.",
                            source,
                        )
                }
            }
        }
        return WaiverResolution(
            activeExclusions = exclusions.filterNot { exclusion -> exclusion.waiverIdentity() in acceptedKeys },
            accepted = accepted.sortedBy(AcceptedWaiverView::id),
            diagnostics = diagnostics,
        )
    }

    private fun GenerationExclusion.matches(waiver: AcceptedWaiverConfig): Boolean =
        kind.toWaivedSymbolKind() == waiver.match.kind &&
            symbolId == waiver.match.symbolId &&
            diagnosticCode == waiver.match.diagnosticCode &&
            source.documentUri == waiver.match.documentUri &&
            source.jsonPointer == waiver.match.jsonPointer &&
            reason.sha256() == waiver.match.reasonSha256

    private fun GenerationExclusion.waiverIdentity(): List<String> =
        listOf(kind.name, symbolId, diagnosticCode, source.documentUri, source.jsonPointer, reason.sha256())

    private fun GenerationExclusion.acceptedView(waiver: AcceptedWaiverConfig): AcceptedWaiverView =
        AcceptedWaiverView(
            id = waiver.id,
            category = waiver.category,
            kind = kind.toWaivedSymbolKind(),
            symbolId = symbolId,
            diagnosticCode = diagnosticCode,
            documentUri = source.documentUri,
            jsonPointer = source.jsonPointer,
            reason = reason,
            reasonSha256 = reason.sha256(),
            rationale = waiver.rationale,
            owner = waiver.owner,
            disposition = waiver.disposition.name.lowercase(),
        )

    private fun com.nabobery.sdkgen.engine.declarations.GenerationExclusionKind.toWaivedSymbolKind(): WaivedSymbolKind =
        when (this) {
            com.nabobery.sdkgen.engine.declarations.GenerationExclusionKind.SCHEMA -> WaivedSymbolKind.SCHEMA
            com.nabobery.sdkgen.engine.declarations.GenerationExclusionKind.OPERATION -> WaivedSymbolKind.OPERATION
        }

    private fun waiverDiagnostic(
        code: String,
        message: String,
        source: SourcePointer,
    ): GenerationDiagnostic =
        GenerationDiagnostic(
            code = GenerationDiagnosticCode.PROJECTION_FAILED,
            message = message,
            source = source,
            symbolId = "waiver:$code",
            sourceCode = code,
        )

    private fun withoutAcceptedDiagnostics(
        diagnostics: List<GenerationDiagnostic>,
        accepted: List<AcceptedWaiverView>,
    ): List<GenerationDiagnostic> {
        val acceptedIdentities =
            accepted
                .map { waiver ->
                    listOf(
                        waiver.symbolId,
                        waiver.diagnosticCode,
                        waiver.documentUri,
                        waiver.jsonPointer,
                        waiver.reasonSha256,
                    )
                }.toSet()
        return diagnostics.filterNot { diagnostic ->
            listOf(
                diagnostic.symbolId,
                diagnostic.wireCode,
                diagnostic.source.documentUri,
                diagnostic.source.jsonPointer,
                diagnostic.message.sha256(),
            ) in acceptedIdentities
        }
    }

    private fun blockIfNeeded(
        diagnostics: List<GenerationDiagnostic>,
        exclusions: List<GenerationExclusion>,
        acceptedWaivers: List<AcceptedWaiverView> = emptyList(),
    ) {
        if (diagnostics.none { it.severity == DiagnosticSeverity.ERROR } && exclusions.isEmpty()) return
        throw GenerationBlockedException(
            ValidationResult(
                diagnostics = diagnostics.map(::diagnosticView),
                exclusions = exclusions.map(::exclusionView),
                acceptedWaivers = acceptedWaivers,
            ),
        )
    }

    private fun combinedExclusions(
        config: SdkgenConfigV1Alpha1,
        semantic: SemanticDocument,
        mapping: DeclarationMappingResult,
    ): List<GenerationExclusion> {
        val semanticExclusions =
            semantic.diagnostics.mapNotNull { diagnostic ->
                val effective = applyWarningPolicy(config, GenerationDiagnostic.fromSemantic(diagnostic))
                diagnostic.relatedSymbolId
                    ?.takeIf { effective.severity == DiagnosticSeverity.ERROR }
                    ?.let { symbolId ->
                        GenerationExclusion(
                            kind =
                                if (symbolId.startsWith("operation:")) {
                                    com.nabobery.sdkgen.engine.declarations.GenerationExclusionKind.OPERATION
                                } else {
                                    com.nabobery.sdkgen.engine.declarations.GenerationExclusionKind.SCHEMA
                                },
                            symbolId = symbolId,
                            diagnosticCode = effective.wireCode,
                            reason = diagnostic.message,
                            source = diagnostic.source,
                        )
                    }
            }
        val emittedOperations =
            mapping.model.files
                .flatMap { file -> file.declarations }
                .filterIsInstance<OperationClientDeclaration>()
                .flatMap(OperationClientDeclaration::operations)
                .map(OperationDeclaration::symbolId)
                .toSet()
        return (semanticExclusions + mapping.exclusions)
            .filterNot { exclusion ->
                exclusion.symbolId.startsWith("operation:") && exclusion.symbolId in emittedOperations
            }.distinctBy { exclusion ->
                listOf(
                    exclusion.symbolId,
                    exclusion.source.documentUri,
                    exclusion.source.jsonPointer,
                    exclusion.reason,
                )
            }.sortedWith(
                compareBy(
                    GenerationExclusion::symbolId,
                    { exclusion -> exclusion.source.documentUri },
                    { exclusion -> exclusion.source.jsonPointer },
                ),
            )
    }

    private fun diagnosticView(diagnostic: GenerationDiagnostic): GenerationDiagnosticView =
        GenerationDiagnosticView(
            code = diagnostic.wireCode,
            message = diagnostic.message,
            documentUri = diagnostic.source.documentUri,
            jsonPointer = diagnostic.source.jsonPointer,
            severity = diagnostic.severity,
            phase = diagnostic.phase,
            pluginPhase = diagnostic.pluginPhase,
            remediation = diagnostic.remediation,
            location = diagnostic.source.location,
        )

    private fun exclusionView(exclusion: GenerationExclusion): GenerationExclusionView =
        GenerationExclusionView(
            kind =
                when (exclusion.kind) {
                    GenerationExclusionKind.SCHEMA -> WaivedSymbolKind.SCHEMA
                    GenerationExclusionKind.OPERATION -> WaivedSymbolKind.OPERATION
                },
            symbolId = exclusion.symbolId,
            diagnosticCode = exclusion.diagnosticCode,
            reason = exclusion.reason,
            reasonSha256 = exclusion.reason.sha256(),
            documentUri = exclusion.source.documentUri,
            jsonPointer = exclusion.source.jsonPointer,
        )

    private fun String.sha256(): String =
        MessageDigest
            .getInstance(
                "SHA-256",
            ).digest(encodeToByteArray())
            .joinToString("") { byte -> "%02x".format(byte) }

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
        pluginRecords: List<PluginRecord> = emptyList(),
    ): GenerationManifestIdentity =
        GenerationManifestIdentity(
            configDigest = ConfigDigest.sha256(config),
            source = ManifestInput(source.canonicalUri, source.sha256, source.contentLength),
            references = source.references.map { ManifestInput(it.canonicalUri, it.sha256, it.contentLength) },
            overlays = overlays.map { ManifestOverlay(it.id, it.canonicalUri, it.sha256) },
            generatorVersion = generatorVersion,
            edition = edition,
            kotlinPoetVersion = kotlinPoetVersion,
            targets = config.kotlin.targets.map { it.name.lowercase(Locale.ROOT) },
            compatibilityProfiles =
                config.compatibilityProfiles.map { profile ->
                    ManifestCompatibilityProfile(profile.id, profile.version)
                },
            plugins =
                pluginRecords.map { plugin ->
                    ManifestPlugin(
                        id = plugin.id,
                        version = plugin.version,
                        spiRange = plugin.spiRange,
                        configSha256 = plugin.configDigest,
                        phases = plugin.phases.map { phase -> phase.name.lowercase(Locale.ROOT) },
                    )
                },
            warningsAsErrors = config.diagnostics.warningsAsErrors,
            warningAllowlist = config.diagnostics.warningAllowlist,
            tools = listOf(ManifestTool(id = "kotlinpoet", version = kotlinPoetVersion)),
        )
}

private fun declarationKind(symbolId: String): String =
    when {
        symbolId.startsWith("schema:") -> "schema"
        symbolId.startsWith("operation:") -> "operation"
        symbolId.startsWith("client:") -> "client"
        symbolId.startsWith("support:") -> "support"
        else -> "declaration"
    }

private data class PreparedPluginGeneration(
    val semantic: SemanticDocument,
    val naming: NamingTypeMappingPhaseValue,
    val mapping: DeclarationMappingResult,
    val declarations: DeclarationAugmentationPhaseValue,
    val pluginDiagnostics: List<PluginDiagnostic>,
    val skippedPluginIds: List<String>,
)

private fun ResolvedSource.sourcePointer(): SourcePointer =
    SourcePointer(
        documentUri = canonicalUri,
        jsonPointer = "/",
        location = SourceLocation(0, 0, 0),
    )

internal fun materializeEffectiveSource(
    config: SdkgenConfigV1Alpha1,
    source: ResolvedSource,
    overlays: List<ResolvedGenerationOverlay>,
): Path {
    if (overlays.isEmpty()) return source.path
    val configured = config.overlays.associateBy { it.id }
    val zeroMatchModes = overlays.map { configured.getValue(it.id).zeroMatchPolicy }.distinct()
    val conflictPolicies = overlays.map { configured.getValue(it.id).conflictPolicy }.distinct()
    require(zeroMatchModes.size == 1) { "All overlays must use the same zero-match policy" }
    require(conflictPolicies.size == 1) { "All overlays must use the same conflict policy" }
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
