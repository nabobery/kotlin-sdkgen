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

internal class ExplainCommand : ConfigCommand("explain") {
    private val target: String? by argument("target", help = "Symbol or diagnostic code").optional()
    private val pointer: String? by option("--pointer", help = "Source JSON pointer to explain")
    private val warningsAsErrors: Boolean by option(
        "--warnings-as-errors",
        help = "Treat reported warnings as command-blocking diagnostics",
    ).flag(default = false)

    override fun run() {
        val query = target ?: pointer
        if (query.isNullOrBlank()) {
            emitUsageError("explain requires a symbol, diagnostic code, or --pointer.")
        }
        execute { inputs ->
            val analysis = pipeline().analyze(inputs.config, inputs.source, inputs.overlays)
            val traces =
                (
                    explainMatches(query, analysis.validation, inputs) +
                        explainProjectedSymbols(query, analysis.symbols, inputs)
                ).distinct().sortedWith(
                    compareBy(ExplainTrace::kind, ExplainTrace::name, { it.origin.jsonPointer }),
                )
            if (traces.isEmpty()) {
                emitDiagnostic(
                    code = "SDKGEN-EXPLAIN-NOT-FOUND",
                    message = "No generated symbol or diagnostic matched '$query'.",
                    path = inputs.configFile.toString(),
                    pointer = query,
                    phase = "cli",
                    remediation =
                        "Use a declaration symbol, diagnostic code, or source JSON pointer from validate output.",
                )
                throw ProgramResult(SDKGEN_EXIT_DIAGNOSTICS)
            }
            if (format == "json") {
                echo(COMPACT_JSON.encodeToString(explainDocument(query, traces, inputs, warningsAsErrors)))
            } else {
                echo(
                    "explain: $query warnings-as-errors=${warningsAsErrors || inputs.config.diagnostics.warningsAsErrors}",
                )
                traces.forEach { trace ->
                    val overlayText =
                        trace.overlays
                            .joinToString(",") { overlay -> "${overlay.id}=${overlay.canonicalUri}" }
                    echo(
                        "${trace.kind}: ${trace.name} <- ${trace.origin.documentUri}${trace.origin.jsonPointer} " +
                            "(${trace.reason})" +
                            overlayText.takeIf { it.isNotBlank() }?.let { " overlays=$it" }.orEmpty(),
                    )
                }
            }
        }
    }
}
