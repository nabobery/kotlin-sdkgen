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

internal class DiffCommand : ConfigCommand("diff") {
    private val fromPath: String by
        option(
            "--from",
            help = "Manifest, lock, or config state to compare from",
        ).required()
    private val toPath: String by option("--to", help = "Manifest, lock, or config state to compare to").required()
    private val warningsAsErrors: Boolean by option(
        "--warnings-as-errors",
        help = "Treat reported warnings as command-blocking diagnostics",
    ).flag(default = false)

    override fun run() {
        var from: DiffSnapshot? = null
        var to: DiffSnapshot? = null
        try {
            executeCliAction(
                action = {
                    from = readDiffOperand(fromPath, "--from")
                    to = readDiffOperand(toPath, "--to")
                    val report =
                        compareDiffSnapshots(
                            requireNotNull(from),
                            requireNotNull(to),
                            warningsAsErrors,
                        )
                    emitDiffReport(report)
                    if (report.changes.isNotEmpty() || report.hasBlockingDiagnostics) {
                        throw ProgramResult(SDKGEN_EXIT_DIAGNOSTICS)
                    }
                },
                failureHandler = { failure ->
                    val diagnostics =
                        when (failure) {
                            is DiffInputException -> {
                                when (val cause = failure.cause) {
                                    is ConfigContractException -> {
                                        listOf(cause.diagnostic.toCliDiagnostic().copy(operand = failure.operand))
                                    }

                                    is LockContractException -> {
                                        listOf(cause.diagnostic.toCliDiagnostic().copy(operand = failure.operand))
                                    }

                                    is GenerationBlockedException -> {
                                        cause.validation.toCliDiagnostics().map { it.copy(operand = failure.operand) }
                                    }

                                    else -> {
                                        listOf(
                                            CliDiagnostic(
                                                code = "SDKGEN-DIFF-INPUT-INVALID",
                                                message = failure.message ?: "Invalid diff input.",
                                                path = failure.rawPath,
                                                operand = failure.operand,
                                            ),
                                        )
                                    }
                                }
                            }

                            is ConfigContractException -> {
                                listOf(failure.diagnostic.toCliDiagnostic())
                            }

                            is LockContractException -> {
                                listOf(failure.diagnostic.toCliDiagnostic())
                            }

                            is GenerationBlockedException -> {
                                failure.validation.toCliDiagnostics()
                            }

                            else -> {
                                val operand =
                                    when {
                                        from == null -> "--from"
                                        to == null -> "--to"
                                        else -> "diff"
                                    }
                                val path =
                                    when (operand) {
                                        "--from" -> fromPath
                                        "--to" -> toPath
                                        else -> ""
                                    }
                                listOf(
                                    CliDiagnostic(
                                        code = "SDKGEN-DIFF-INPUT-INVALID",
                                        message = failure.message ?: failure::class.simpleName.orEmpty(),
                                        path = path,
                                        operand = operand.takeIf { it.startsWith("--") },
                                    ),
                                )
                            }
                        }
                    emitDiagnostics(diagnostics)
                    throw ProgramResult(SDKGEN_EXIT_DIAGNOSTICS)
                },
            )
        } finally {
            from?.close()
            to?.close()
        }
    }

    private fun emitDiffReport(report: DiffReport) {
        if (format == "json") {
            echo(COMPACT_JSON.encodeToString(report.toJson()))
        } else {
            echo("diff: ${if (report.changes.isEmpty()) "no changes" else "${report.changes.size} change(s)"}")
            report.changes.forEach { change ->
                val values =
                    listOfNotNull(
                        change.from?.let { value -> "from=$value" },
                        change.to?.let { value -> "to=$value" },
                    ).joinToString(" ")
                echo(
                    "${change.kind} ${change.status} ${change.subject} [${change.impact}]" +
                        values.takeIf { it.isNotBlank() }?.let { " $it" }.orEmpty(),
                )
            }
            echo("api-impact: ${report.apiImpact}")
            echo("warnings-as-errors: ${report.warningsAsErrors}")
            if (report.unavailableDimensions.isNotEmpty()) {
                echo("unavailable: ${report.unavailableDimensions.joinToString()}")
            }
            if (report.truncated) echo("output: truncated")
            report.diagnostics.forEach { diagnostic -> echo("diagnostic: $diagnostic") }
        }
    }
}
