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

internal fun sdkgenUsageDocument(error: CliktError): String =
    COMPACT_JSON.encodeToString(
        buildJsonObject {
            put("contractVersion", SDKGEN_CLI_CONTRACT_VERSION)
            put("status", "diagnostics")
            put("command", "sdkgen")
            put(
                "diagnostics",
                buildJsonArray {
                    add(
                        buildJsonObject {
                            put("code", "SDKGEN-CLI-USAGE")
                            put("rule", "SDKGEN-CLI-USAGE")
                            put("phase", "cli")
                            put("severity", DiagnosticSeverity.ERROR.name.lowercase(Locale.ROOT))
                            put("message", sdkgenUsageMessage(error))
                            put("remediation", "Correct the command-line options and rerun the command.")
                            put(
                                "sourcePointer",
                                buildJsonObject {
                                    put("documentUri", "")
                                    put("pointer", "")
                                },
                            )
                        },
                    )
                },
            )
        },
    )
