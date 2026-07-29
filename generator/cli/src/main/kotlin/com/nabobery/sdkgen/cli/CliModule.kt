@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.CliktError
import com.github.ajalt.clikt.core.PrintHelpMessage
import com.github.ajalt.clikt.core.PrintMessage
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
import com.nabobery.sdkgen.engine.SdkGenDependencyVersions
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

/** The `contractVersion` field stamped on every `--format json` CLI output document. */
public const val SDKGEN_CLI_CONTRACT_VERSION: String = "v1alpha1"

/** The command completed with no diagnostics to report. */
public const val SDKGEN_EXIT_OK: Int = 0

/**
 * The command ran to completion but produced one or more diagnostics that block the requested
 * outcome — e.g. `validate` found schema problems, or `--locked` refused on drift. Distinct from
 * [SDKGEN_EXIT_USAGE]: the command itself was well-formed, only its subject matter was not.
 */
public const val SDKGEN_EXIT_DIAGNOSTICS: Int = 1

/** The command line itself was invalid (unknown option, missing argument, `--help`, etc.). */
public const val SDKGEN_EXIT_USAGE: Int = 2

/**
 * The `sdkgen` CLI entry point: `validate` (adapt and project without writing output), `generate`
 * (write Kotlin source, optionally refusing on lock drift with `--locked`), `check` (confirm
 * committed output matches what generation would produce today), `diff` (compare effective and
 * generated contracts), `explain` (trace a symbol or diagnostic to source), and `compat` (render the
 * ADR 0013 five-layer compatibility report between two compatibility manifests). Every diagnostic
 * or usage failure is reported through [SDKGEN_EXIT_DIAGNOSTICS]/[SDKGEN_EXIT_USAGE] rather than
 * an uncaught exception; `--format json` emits one JSON document per invocation carrying
 * [SDKGEN_CLI_CONTRACT_VERSION] and sorted arrays, so scripted callers never need to parse
 * free-form text.
 */
public fun main(args: Array<String>) {
    val command = sdkgenCommand()
    try {
        command.parse(args)
    } catch (result: ProgramResult) {
        // Clikt 5.1.0 declares `ProgramResult : CliktError`, and `Abort : ProgramResult(statusCode = 1)`, so this
        // branch MUST be checked before the general `CliktError` branch below. Kotlin does not reject a supertype
        // catch clause preceding a subtype one the way Java does, so ordering these the other way around would
        // silently make this branch unreachable: every `ProgramResult` (including every command's explicit
        // `throw ProgramResult(SDKGEN_EXIT_DIAGNOSTICS)` / `throw ProgramResult(THRESHOLD_REACHED_EXIT_CODE)`)
        // would be caught as a plain `CliktError` and remapped by `sdkgenExitCode` to `SDKGEN_EXIT_USAGE` (2),
        // defeating every non-zero, non-two exit code this CLI reports.
        exitProcess(result.statusCode)
    } catch (error: CliktError) {
        // [PrintHelpMessage] (thrown by the built-in `--help`/`-h` eager option on the root command and on
        // every subcommand) and [PrintMessage] (its `PrintCompletionMessage` subtype included) are requested
        // output, not usage errors: `error.message` is null for [PrintHelpMessage], so routing them through
        // the generic branch below previously produced the useless fallback
        // "Invalid command usage (PrintHelpMessage). Run 'sdkgen --help'." on stderr for every `--help`
        // invocation, telling the user to run the very thing that just failed. [CliktCommand.echoFormattedHelp]
        // is the accessor Clikt itself uses in its own default `main()` (see
        // `CommandLineParser.main`/`mainReturningValue` in clikt-core): for a [PrintHelpMessage] it renders the
        // full help text for the command named by `error.context` (the subcommand's own context when `--help`
        // was parsed as that subcommand's eager option, the root context otherwise) via the configured
        // `HelpFormatter`; for a plain [PrintMessage] it returns `error.message` directly. Either way it echoes
        // with `err = error.printError`, which is `false` for both types, so the text lands on stdout.
        if (error is PrintHelpMessage || error is PrintMessage) {
            command.echoFormattedHelp(error)
            exitProcess(error.statusCode)
        }
        if (sdkgenRequestedJson(args)) {
            command.echo(sdkgenUsageDocument(error))
        } else {
            command.echo(sdkgenUsageMessage(error), err = true)
        }
        exitProcess(sdkgenExitCode(error))
    }
}

internal fun sdkgenUsageMessage(error: CliktError): String =
    error.message?.takeIf(String::isNotBlank)
        ?: "Invalid command usage (${error::class.simpleName}). Run 'sdkgen --help'."

internal fun sdkgenRequestedJson(args: Array<String>): Boolean =
    args.withIndex().any { (index, value) ->
        value == "--format=json" || (value == "--format" && args.getOrNull(index + 1) == "json")
    }

internal fun sdkgenExitCode(error: CliktError): Int =
    if (error.statusCode == SDKGEN_EXIT_OK) SDKGEN_EXIT_OK else SDKGEN_EXIT_USAGE

internal fun sdkgenCommand(): CliktCommand =
    SdkgenCommand().subcommands(
        ValidateCommand(),
        GenerateCommand(),
        CheckCommand(),
        DiffCommand(),
        ExplainCommand(),
        CompatCommand(),
    )

internal fun executeCliAction(
    action: () -> Unit,
    failureHandler: (Throwable) -> Nothing,
) {
    try {
        action()
    } catch (result: ProgramResult) {
        throw result
    } catch (cancellation: CancellationException) {
        throw cancellation
    } catch (failure: Throwable) {
        failureHandler(failure)
    }
}

private class SdkgenCommand : CliktCommand(name = "sdkgen") {
    override fun run() = Unit
}

internal abstract class ConfigCommand(
    name: String,
) : CliktCommand(name = name) {
    private val sdkgenCommandName = name

    protected val configPath: String by option(
        "--config",
        help = "Path to sdkgen.yaml or sdkgen.json",
    ).default("sdkgen.yaml")
    protected val format: String by option(
        "--format",
        help = "Diagnostic format",
    ).choice("human", "json").default("human")

    protected fun execute(action: (CommandInputs) -> Unit) {
        executeCliAction(
            action = { loadInputs(Path.of(configPath)).use(action) },
            failureHandler = { failure ->
                emitDiagnostics(
                    when (failure) {
                        is ConfigContractException -> {
                            listOf(failure.diagnostic.toCliDiagnostic())
                        }

                        is LockContractException -> {
                            listOf(failure.diagnostic.toCliDiagnostic())
                        }

                        is CliDiagnosticsException -> {
                            failure.diagnostics.map(Diagnostic::toCliDiagnostic)
                        }

                        is GenerationBlockedException -> {
                            failure.validation.toCliDiagnostics()
                        }

                        else -> {
                            listOf(
                                CliDiagnostic(
                                    code = "SDKGEN-CLI-FAILURE",
                                    message = failure.message ?: failure::class.simpleName.orEmpty(),
                                    path = configPath,
                                ),
                            )
                        }
                    },
                )
                throw ProgramResult(SDKGEN_EXIT_DIAGNOSTICS)
            },
        )
    }

    protected fun emitOk(
        command: String,
        details: Map<String, String> = emptyMap(),
    ) {
        if (format == "json") {
            val value =
                buildJsonObject {
                    put("contractVersion", SDKGEN_CLI_CONTRACT_VERSION)
                    put("status", "ok")
                    put("command", command)
                    details.toSortedMap().forEach { (key, detail) -> put(key, detail) }
                }
            echo(COMPACT_JSON.encodeToString(value))
        } else {
            echo("$command: ok" + details.entries.joinToString("") { " ${it.key}=${it.value}" })
        }
    }

    protected fun emitUsageError(message: String): Nothing {
        val error = CliktError(message)
        if (format == "json") {
            echo(sdkgenUsageDocument(error))
        } else {
            echo(sdkgenUsageMessage(error), err = true)
        }
        throw ProgramResult(SDKGEN_EXIT_USAGE)
    }

    protected fun emitDiagnostic(
        code: String,
        message: String,
        path: String,
        pointer: String = "",
        phase: String = "cli",
        remediation: String = "Correct the reported input and rerun the command.",
    ) = emitDiagnostics(
        listOf(
            CliDiagnostic(
                code = code,
                message = message,
                path = path,
                pointer = pointer,
                phase = phase,
                remediation = remediation,
            ),
        ),
    )

    protected fun emitValidation(validation: ValidationResult) {
        emitDiagnostics(validation.toCliDiagnostics())
    }

    protected fun emitDiagnostics(diagnostics: List<CliDiagnostic>) {
        val sorted =
            diagnostics.sortedWith(
                compareBy(
                    CliDiagnostic::phase,
                    CliDiagnostic::path,
                    CliDiagnostic::pointer,
                    CliDiagnostic::pluginPhase,
                    CliDiagnostic::code,
                    CliDiagnostic::message,
                ),
            )
        if (format == "json") {
            val value =
                buildJsonObject {
                    put("contractVersion", SDKGEN_CLI_CONTRACT_VERSION)
                    put("status", "diagnostics")
                    put("command", sdkgenCommandName)
                    put(
                        "diagnostics",
                        buildJsonArray {
                            sorted.forEach { diagnostic ->
                                add(
                                    buildJsonObject {
                                        put("code", diagnostic.code)
                                        put("rule", diagnostic.code)
                                        put("phase", diagnostic.phase)
                                        diagnostic.pluginPhase?.let { put("pluginPhase", it) }
                                        put("severity", diagnostic.severity.name.lowercase(Locale.ROOT))
                                        put("message", diagnostic.message)
                                        put("remediation", diagnostic.remediation)
                                        diagnostic.operand?.let { put("operand", it) }
                                        put(
                                            "sourcePointer",
                                            buildJsonObject {
                                                put("documentUri", diagnostic.path)
                                                put("pointer", diagnostic.pointer)
                                                diagnostic.line?.let { put("line", it) }
                                                diagnostic.column?.let { put("column", it) }
                                                diagnostic.byteOffset?.let { put("byteOffset", it) }
                                            },
                                        )
                                    },
                                )
                            }
                        },
                    )
                }
            echo(COMPACT_JSON.encodeToString(value))
        } else {
            sorted.forEach { diagnostic ->
                echo(
                    "${diagnostic.operand?.let { "$it: " }.orEmpty()}" +
                        "${diagnostic.code} [${diagnostic.severity.name.lowercase(Locale.ROOT)}]: " +
                        "${diagnostic.message} (${diagnostic.path})",
                )
            }
        }
    }
}

private class ValidateCommand : ConfigCommand("validate") {
    override fun run() {
        execute { inputs ->
            val validation = pipeline().validate(inputs.config, inputs.source, inputs.overlays)
            val hasErrors = validation.diagnostics.any { it.severity == DiagnosticSeverity.ERROR }
            if (hasErrors || validation.exclusions.isNotEmpty()) {
                emitValidation(validation)
                throw ProgramResult(SDKGEN_EXIT_DIAGNOSTICS)
            }
            emitOk(
                "validate",
                mapOf(
                    "diagnostics" to validation.diagnostics.size.toString(),
                    "exclusions" to validation.exclusions.size.toString(),
                ),
            )
        }
    }
}

private class GenerateCommand : ConfigCommand("generate") {
    private val locked: Boolean by option(
        "--locked",
        help = "Refuse input or configuration drift",
    ).flag(default = false)
    private val outputOverride: String? by option("--output", help = "Override generated source destination")

    /**
     * Writes the emitted public-API projection beside the run for `sdkgen compat --kotlin-api-from/-to`.
     *
     * It is staged rather than published into the output tree because it is compatibility evidence, not
     * generated SDK source -- the same treatment the parity behavior ledger and the staged ABI dumps already get
     * under ADR 0013. Publishing it would put a second copy of the emitted API under the manifest's own digest
     * list and move every corpus manifest for a file no consumer compiles.
     */
    private val kotlinApiProjectionOutput: String? by option(
        "--kotlin-api-projection",
        help = "Also write the emitted public-API projection to this path, for `sdkgen compat`",
    )

    override fun run() {
        execute { inputs ->
            if (locked) verifyLocked(inputs)
            val output =
                outputOverride?.let(inputs::resolveOutput) ?: inputs.resolveOutput(inputs.config.output.sources)
            val lock = if (locked) null else generationLock(inputs)
            val result =
                pipeline().generate(
                    inputs.config,
                    inputs.source,
                    inputs.overlays,
                    output,
                    lock = lock,
                    publicApiProjectionDestination = kotlinApiProjectionOutput?.let(Path::of),
                )
            emitOk(
                "generate",
                mapOf("files" to result.generatedFiles.toString(), "snapshotSha256" to result.snapshotSha256),
            )
        }
    }
}

private class CheckCommand : ConfigCommand("check") {
    private val outputOverride: String? by option("--output", help = "Override generated source destination")

    override fun run() {
        execute { inputs ->
            verifyLocked(inputs)
            val expectedOutput =
                outputOverride?.let(inputs::resolveOutput) ?: inputs.resolveOutput(inputs.config.output.sources)
            require(expectedOutput.exists()) { "Generated output does not exist: $expectedOutput" }
            val isolatedRoot = Files.createTempDirectory("sdkgen-check-")
            try {
                val isolatedOutput = isolatedRoot.resolve("current")
                pipeline().generate(inputs.config, inputs.source, inputs.overlays, isolatedOutput)
                val drift = compareTrees(expectedOutput, isolatedOutput)
                if (drift.isNotEmpty()) {
                    emitDiagnostic(
                        "SDKGEN-CHECK-GENERATED-DRIFT",
                        "Generated output differs: ${formatBoundedPaths(drift)}",
                        expectedOutput.toString(),
                    )
                    throw ProgramResult(SDKGEN_EXIT_DIAGNOSTICS)
                }
                emitOk("check", mapOf("diff" to "0"))
            } finally {
                deleteRecursively(isolatedRoot)
            }
        }
    }
}

internal data class CommandInputs(
    val configFile: Path,
    val config: SdkgenConfigV1Alpha1,
    val resolved: ResolvedGenerationInputs,
) : Closeable {
    val source: ResolvedSource
        get() = resolved.source

    val overlays: List<ResolvedGenerationOverlay>
        get() = resolved.overlays

    val root: Path = requireNotNull(configFile.toAbsolutePath().parent)

    fun resolveOutput(value: String): Path = root.resolve(value).normalize()

    val lockPath: Path = resolveOutput(config.output.lock)

    override fun close() {
        resolved.close()
    }
}

internal fun loadInputs(configFile: Path): CommandInputs {
    val absoluteConfig = configFile.toAbsolutePath().normalize()
    val text = absoluteConfig.readText()
    val config =
        if (absoluteConfig.fileName.toString().endsWith(".json")) {
            ConfigLoader.decodeJson(text, absoluteConfig.toString())
        } else {
            ConfigLoader.decodeYaml(text, absoluteConfig.toString())
        }
    val resolved = LocalInputResolver().resolve(absoluteConfig, config)
    return CommandInputs(absoluteConfig, config, resolved)
}

internal fun verifyLocked(inputs: CommandInputs) {
    require(inputs.lockPath.exists()) { "Locked mode requires ${inputs.lockPath}" }
    val lock = LockCodec.decode(inputs.lockPath.readText(), inputs.lockPath.toString())
    val diagnostics =
        LockedInputVerifier.verify(
            inputs.config,
            lock,
            inputs.source,
            inputs.overlays,
            pluginPhases = builtInPluginPhases(),
        )
    if (diagnostics.isNotEmpty()) throw CliDiagnosticsException(diagnostics)
}

internal fun generationLock(inputs: CommandInputs): GenerationLockPublication {
    val lock =
        SdkgenLockV1Alpha1(
            configDigest = ConfigDigest.sha256(inputs.config),
            source =
                LockedSource(
                    canonicalUri = inputs.source.canonicalUri,
                    sha256 = inputs.source.sha256,
                    contentLength = inputs.source.contentLength,
                    references =
                        inputs.source.references
                            .sortedBy { reference -> reference.canonicalUri }
                            .map { reference ->
                                LockedReference(
                                    canonicalUri = reference.canonicalUri,
                                    sha256 = reference.sha256,
                                    contentLength = reference.contentLength,
                                )
                            },
                ),
            overlays = inputs.overlays.map { LockedOverlay(it.id, it.canonicalUri, it.sha256) },
            generator = LockedGenerator(GENERATOR_VERSION, "community"),
            compatibilityProfiles =
                inputs.config.compatibilityProfiles.map { LockedCompatibilityProfile(it.id, it.version) },
            plugins =
                inputs.config.plugins.filter { it.enabled }.map {
                    LockedPlugin(
                        id = it.id,
                        version = it.version,
                        spiRange = it.spiRange,
                        configSha256 = ConfigDigest.sha256(it.config),
                        phases = builtInPluginPhases()[it.id].orEmpty(),
                    )
                },
            tools = listOf(LockedTool(id = "kotlinpoet", version = KOTLIN_POET_VERSION)),
        )
    return GenerationLockPublication(inputs.lockPath, LockCodec.encode(lock))
}

private const val MAX_PATH_REPORT = 100

internal fun formatBoundedPaths(paths: List<String>): String =
    paths.take(MAX_PATH_REPORT).joinToString() +
        if (paths.size > MAX_PATH_REPORT) " ... (${paths.size - MAX_PATH_REPORT} more)" else ""

internal fun compareTrees(
    expected: Path,
    actual: Path,
): List<String> {
    val expectedTree = tree(expected)
    val actualTree = tree(actual)
    return (expectedTree.keys + actualTree.keys).toSortedSet().filter { path ->
        val expectedBytes = expectedTree[path]
        val actualBytes = actualTree[path]
        expectedBytes == null || actualBytes == null || !expectedBytes.contentEquals(actualBytes)
    }
}

internal fun tree(root: Path): Map<String, ByteArray> {
    val resolved = if (root.isSymbolicLink()) root.parent.resolve(root.readSymbolicLink()).normalize() else root
    return Files.walk(resolved).use { paths ->
        paths.filter(Files::isRegularFile).sorted().toList().associate { path ->
            resolved.relativize(path).toString().replace('\\', '/') to path.readBytes()
        }
    }
}

internal fun deleteRecursively(root: Path) {
    if (!root.exists()) return
    Files.walk(root).use { paths -> paths.sorted(Comparator.reverseOrder()).forEach(Files::deleteIfExists) }
}

internal fun pipeline(): GenerationPipeline =
    GenerationPipeline(
        generatorVersion = GENERATOR_VERSION,
        kotlinPoetVersion = KOTLIN_POET_VERSION,
    )

internal fun builtInPluginPhases(): Map<String, List<String>> =
    BuiltInSdkGenPlugins
        .registry()
        .plugins
        .associate { plugin ->
            plugin.descriptor.id to plugin.descriptor.phases.map { phase -> phase.name.lowercase(Locale.ROOT) }
        }

private class CliDiagnosticsException(
    val diagnostics: List<Diagnostic>,
) : RuntimeException(diagnostics.joinToString { diagnostic -> diagnostic.message })

internal data class CliDiagnostic(
    val code: String,
    val message: String,
    val path: String,
    val operand: String? = null,
    val pointer: String = "",
    val phase: String = "cli",
    val pluginPhase: String? = null,
    val severity: DiagnosticSeverity = DiagnosticSeverity.ERROR,
    val remediation: String = "Correct the reported input and rerun the command.",
    val line: Int? = null,
    val column: Int? = null,
    val byteOffset: Long? = null,
)

internal fun ValidationResult.toCliDiagnostics(): List<CliDiagnostic> =
    diagnostics.map(GenerationDiagnosticView::toCliDiagnostic) +
        exclusions.map(GenerationExclusionView::toCliDiagnostic)

internal fun GenerationDiagnosticView.toCliDiagnostic(): CliDiagnostic =
    CliDiagnostic(
        code = code,
        message = message,
        path = documentUri,
        pointer = jsonPointer,
        phase = phase.name.lowercase(Locale.ROOT),
        pluginPhase = pluginPhase?.name?.lowercase(Locale.ROOT),
        severity = severity,
        remediation = remediation,
        line = location.line,
        column = location.column,
        byteOffset = location.byteOffset,
    )

internal fun GenerationExclusionView.toCliDiagnostic(): CliDiagnostic =
    CliDiagnostic(
        code = "SDKGEN-EMIT-EXCLUDED",
        message = "'$symbolId' was not emitted: $reason",
        path = documentUri,
        pointer = jsonPointer,
        phase = "projection",
        remediation = "Update the contract or projection so the symbol can be represented.",
    )

internal fun Diagnostic.toCliDiagnostic(): CliDiagnostic =
    CliDiagnostic(
        code = code,
        message = message,
        path = path.file,
        pointer = path.yamlPath,
        phase = phase.name.lowercase(Locale.ROOT),
        remediation = remediation,
    )

internal const val GENERATOR_VERSION = "0.1.0-alpha.1"
internal val KOTLIN_POET_VERSION = SdkGenDependencyVersions.kotlinPoet
internal val COMPACT_JSON: Json = Json { prettyPrint = false }
internal val MANIFEST_JSON: Json =
    Json {
        prettyPrint = false
        explicitNulls = false
        ignoreUnknownKeys = false
    }
