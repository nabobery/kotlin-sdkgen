@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.CliktError
import com.github.ajalt.clikt.core.ProgramResult
import com.github.ajalt.clikt.core.parse
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.optional
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.choice
import com.nabobery.sdkgen.engine.GenerationBlockedException
import com.nabobery.sdkgen.engine.GenerationDiagnosticView
import com.nabobery.sdkgen.engine.GenerationExclusionView
import com.nabobery.sdkgen.engine.GenerationLockPublication
import com.nabobery.sdkgen.engine.GenerationPipeline
import com.nabobery.sdkgen.engine.ProjectedSymbolView
import com.nabobery.sdkgen.engine.ResolvedGenerationOverlay
import com.nabobery.sdkgen.engine.ResolvedReference
import com.nabobery.sdkgen.engine.ResolvedSource
import com.nabobery.sdkgen.engine.ValidationResult
import com.nabobery.sdkgen.engine.config.ConfigContractException
import com.nabobery.sdkgen.engine.config.ConfigDigest
import com.nabobery.sdkgen.engine.config.ConfigLoader
import com.nabobery.sdkgen.engine.config.Diagnostic
import com.nabobery.sdkgen.engine.config.LockCodec
import com.nabobery.sdkgen.engine.config.LockContractException
import com.nabobery.sdkgen.engine.config.LockedCompatibilityProfile
import com.nabobery.sdkgen.engine.config.LockedGenerator
import com.nabobery.sdkgen.engine.config.LockedInputVerifier
import com.nabobery.sdkgen.engine.config.LockedOverlay
import com.nabobery.sdkgen.engine.config.LockedPlugin
import com.nabobery.sdkgen.engine.config.LockedReference
import com.nabobery.sdkgen.engine.config.LockedSource
import com.nabobery.sdkgen.engine.config.LockedTool
import com.nabobery.sdkgen.engine.config.OverlayConflictPolicy
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SdkgenLockV1Alpha1
import com.nabobery.sdkgen.engine.config.ZeroMatchPolicy
import com.nabobery.sdkgen.engine.input.LocalInputResolver
import com.nabobery.sdkgen.engine.input.ResolvedGenerationInputs
import com.nabobery.sdkgen.engine.spi.BuiltInSdkGenPlugins
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.openapi.overlays.ConflictPolicy
import com.nabobery.sdkgen.openapi.overlays.OverlayApplicator
import com.nabobery.sdkgen.openapi.overlays.OverlayInput
import com.nabobery.sdkgen.openapi.overlays.ZeroMatchMode
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.contentOrNull
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import kotlinx.serialization.json.put
import java.io.Closeable
import java.nio.file.Files
import java.nio.file.Path
import java.util.Locale
import kotlin.coroutines.cancellation.CancellationException
import kotlin.io.path.exists
import kotlin.io.path.isSymbolicLink
import kotlin.io.path.readBytes
import kotlin.io.path.readSymbolicLink
import kotlin.io.path.readText
import kotlin.system.exitProcess

internal data class ExplainTrace(
    val kind: String,
    val name: String,
    val reason: String,
    val origin: ExplainOrigin,
    val overlays: List<ExplainOverlay>,
    val diagnosticCode: String? = null,
    val resolvedName: String? = null,
)

internal data class ExplainOrigin(
    val documentUri: String,
    val jsonPointer: String,
)

internal data class ExplainOverlay(
    val id: String,
    val canonicalUri: String,
)

internal fun explainMatches(
    query: String,
    validation: com.nabobery.sdkgen.engine.ValidationResult,
    inputs: CommandInputs,
): List<ExplainTrace> {
    val normalizedPointer = query.removePrefix("#")
    val diagnostics =
        validation.diagnostics
            .filter { diagnostic ->
                diagnostic.code == query ||
                    diagnostic.jsonPointer == normalizedPointer ||
                    diagnostic.documentUri == query
            }.map { diagnostic ->
                ExplainTrace(
                    kind = "diagnostic",
                    name = diagnostic.code,
                    reason = diagnostic.message,
                    origin = explainOrigin(diagnostic.documentUri, diagnostic.jsonPointer, inputs),
                    overlays = overlayProvenance(inputs, diagnostic.jsonPointer),
                    diagnosticCode = diagnostic.code,
                )
            }
    val exclusions =
        validation.exclusions
            .filter { exclusion ->
                exclusion.symbolId == query ||
                    exclusion.symbolId.endsWith(":$query") ||
                    exclusion.documentUri == query ||
                    exclusion.jsonPointer == normalizedPointer
            }.map { exclusion ->
                ExplainTrace(
                    kind = "symbol",
                    name = exclusion.symbolId,
                    reason = exclusion.reason,
                    origin = explainOrigin(exclusion.documentUri, exclusion.jsonPointer, inputs),
                    overlays = overlayProvenance(inputs, exclusion.jsonPointer),
                )
            }
    val exclusionDiagnostics =
        if (query == "SDKGEN-EMIT-EXCLUDED") {
            validation.exclusions.map { exclusion ->
                ExplainTrace(
                    kind = "diagnostic",
                    name = query,
                    reason = "${exclusion.symbolId} was excluded: ${exclusion.reason}",
                    origin = explainOrigin(exclusion.documentUri, exclusion.jsonPointer, inputs),
                    overlays = overlayProvenance(inputs, exclusion.jsonPointer),
                    diagnosticCode = query,
                )
            }
        } else {
            emptyList()
        }
    return (diagnostics + exclusions + exclusionDiagnostics).sortedWith(
        compareBy(ExplainTrace::kind, ExplainTrace::name, { it.origin.jsonPointer }),
    )
}

internal fun explainProjectedSymbols(
    query: String,
    symbols: List<ProjectedSymbolView>,
    inputs: CommandInputs,
): List<ExplainTrace> {
    val candidate = query.substringAfterLast(':').substringAfterLast('/').trim()
    if (candidate.isEmpty()) return emptyList()
    val normalizedPointer = query.removePrefix("#")
    return symbols
        .filter { symbol ->
            symbol.resolvedName == candidate ||
                symbol.symbolId == query ||
                symbol.symbolId.endsWith(":$candidate") ||
                symbol.origin.jsonPointer == normalizedPointer
        }.map { symbol ->
            ExplainTrace(
                kind = "symbol",
                name = symbol.symbolId,
                reason = "Projected Kotlin ${symbol.kind} '${symbol.resolvedName}' is emitted from the contract.",
                origin = explainOrigin(symbol.origin.documentUri, symbol.origin.jsonPointer, inputs),
                overlays = overlayProvenance(inputs, symbol.origin.jsonPointer),
                resolvedName = symbol.resolvedName,
            )
        }.distinct()
}

private fun pointersShareAncestry(
    left: String,
    right: String,
): Boolean =
    left == right ||
        left.startsWith("$right/") ||
        right.startsWith("$left/")

private fun overlayProvenance(
    inputs: CommandInputs,
    pointer: String,
): List<ExplainOverlay> {
    if (inputs.overlays.isEmpty()) return emptyList()
    val configured = inputs.config.overlays.associateBy { it.id }
    val zeroMatchPolicies = inputs.overlays.map { configured.getValue(it.id).zeroMatchPolicy }.distinct()
    val conflictPolicies = inputs.overlays.map { configured.getValue(it.id).conflictPolicy }.distinct()
    require(zeroMatchPolicies.size == 1) { "All overlays must use the same zero-match policy" }
    require(conflictPolicies.size == 1) { "All overlays must use the same conflict policy" }
    val result =
        OverlayApplicator(
            zeroMatchMode =
                if (zeroMatchPolicies.single() == ZeroMatchPolicy.FAIL) ZeroMatchMode.STRICT else ZeroMatchMode.COMPAT,
            conflictPolicy =
                if (conflictPolicies.single() == OverlayConflictPolicy.FAIL) {
                    ConflictPolicy.FAIL
                } else {
                    ConflictPolicy.LAST_WRITE_WINS
                },
        ).apply(
            source = inputs.source.path.readBytes(),
            overlays = inputs.overlays.map { overlay -> OverlayInput(overlay.id, overlay.path.readBytes()) },
        )
    return result.actions
        .filter { action ->
            action.matchedPointers.any { matched -> pointersShareAncestry(pointer, matched) }
        }.map { action -> action.overlayIdentity }
        .distinct()
        .map { id -> ExplainOverlay(id, inputs.overlays.first { it.id == id }.canonicalUri) }
}

internal fun explainOrigin(
    documentUri: String,
    jsonPointer: String,
    inputs: CommandInputs,
): ExplainOrigin =
    ExplainOrigin(
        documentUri = canonicalDocumentUri(documentUri, inputs),
        jsonPointer = jsonPointer,
    )

internal fun explainDocument(
    query: String,
    traces: List<ExplainTrace>,
    inputs: CommandInputs,
    warningsAsErrors: Boolean,
): JsonObject =
    buildJsonObject {
        put("contractVersion", SDKGEN_CLI_CONTRACT_VERSION)
        put("status", "ok")
        put("command", "explain")
        put("query", query)
        put("warningsAsErrors", warningsAsErrors || inputs.config.diagnostics.warningsAsErrors)
        put(
            "traces",
            buildJsonArray {
                traces.forEach { trace ->
                    add(
                        buildJsonObject {
                            put("kind", trace.kind)
                            put("name", trace.name)
                            put("reason", trace.reason)
                            put(
                                "naming",
                                buildJsonObject {
                                    put("requested", query)
                                    put("resolved", trace.resolvedName ?: trace.name)
                                    put("strategy", if (trace.kind == "symbol") "declaration" else "diagnostic")
                                },
                            )
                            trace.diagnosticCode?.let { put("diagnosticCode", it) }
                            put(
                                "origin",
                                buildJsonObject {
                                    put("documentUri", trace.origin.documentUri)
                                    put("jsonPointer", trace.origin.jsonPointer)
                                },
                            )
                            put(
                                "overlays",
                                buildJsonArray {
                                    trace.overlays.forEach { overlay ->
                                        add(
                                            buildJsonObject {
                                                put("id", overlay.id)
                                                put("canonicalUri", overlay.canonicalUri)
                                            },
                                        )
                                    }
                                },
                            )
                        },
                    )
                }
            },
        )
        put("diagnostics", buildJsonArray {})
    }
