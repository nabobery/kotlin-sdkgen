package com.nabobery.sdkgen.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.CliktError
import com.github.ajalt.clikt.core.ProgramResult
import com.github.ajalt.clikt.core.parse
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.choice
import com.nabobery.sdkgen.engine.GenerationLockPublication
import com.nabobery.sdkgen.engine.GenerationPipeline
import com.nabobery.sdkgen.engine.ResolvedGenerationOverlay
import com.nabobery.sdkgen.engine.ResolvedSource
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
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SdkgenLockV1Alpha1
import com.nabobery.sdkgen.engine.input.LocalInputResolver
import com.nabobery.sdkgen.engine.input.ResolvedGenerationInputs
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import java.io.Closeable
import java.nio.file.Files
import java.nio.file.Path
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
 * (write Kotlin source, optionally refusing on lock drift with `--locked`), and `check` (confirm
 * committed output matches what generation would produce today). Every diagnostic or usage
 * failure is reported through [SDKGEN_EXIT_DIAGNOSTICS]/[SDKGEN_EXIT_USAGE] rather than an
 * uncaught exception; `--format json` emits one JSON document per invocation carrying
 * [SDKGEN_CLI_CONTRACT_VERSION] and a sorted `diagnostics` array, so scripted callers never need
 * to parse free-form text.
 */
public fun main(args: Array<String>) {
    val command = sdkgenCommand()
    try {
        command.parse(args)
    } catch (result: ProgramResult) {
        exitProcess(result.statusCode)
    } catch (error: CliktError) {
        command.echo(sdkgenUsageMessage(error), err = true)
        exitProcess(sdkgenExitCode(error))
    }
}

internal fun sdkgenUsageMessage(error: CliktError): String =
    error.message?.takeIf(String::isNotBlank)
        ?: "Invalid command usage (${error::class.simpleName}). Run 'sdkgen --help'."

internal fun sdkgenExitCode(error: CliktError): Int =
    if (error.statusCode == SDKGEN_EXIT_OK) SDKGEN_EXIT_OK else SDKGEN_EXIT_USAGE

internal fun sdkgenCommand(): CliktCommand =
    SdkgenCommand().subcommands(ValidateCommand(), GenerateCommand(), CheckCommand())

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

private abstract class ConfigCommand(
    name: String,
) : CliktCommand(name = name) {
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

    private fun emitDiagnostics(diagnostics: List<CliDiagnostic>) {
        val sorted =
            diagnostics.sortedWith(
                compareBy(
                    CliDiagnostic::phase,
                    CliDiagnostic::path,
                    CliDiagnostic::pointer,
                    CliDiagnostic::code,
                    CliDiagnostic::message,
                ),
            )
        if (format == "json") {
            val value =
                buildJsonObject {
                    put("contractVersion", SDKGEN_CLI_CONTRACT_VERSION)
                    put("status", "diagnostics")
                    put(
                        "diagnostics",
                        buildJsonArray {
                            sorted.forEach { diagnostic ->
                                add(
                                    buildJsonObject {
                                        put("code", diagnostic.code)
                                        put("rule", diagnostic.code)
                                        put("phase", diagnostic.phase)
                                        put("message", diagnostic.message)
                                        put("remediation", diagnostic.remediation)
                                        put(
                                            "sourcePointer",
                                            buildJsonObject {
                                                put("documentUri", diagnostic.path)
                                                put("pointer", diagnostic.pointer)
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
            sorted.forEach { diagnostic -> echo("${diagnostic.code}: ${diagnostic.message} (${diagnostic.path})") }
        }
    }
}

private class ValidateCommand : ConfigCommand("validate") {
    override fun run() {
        execute { inputs ->
            val validation = pipeline().validate(inputs.config, inputs.source, inputs.overlays)
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

    override fun run() {
        execute { inputs ->
            if (locked) verifyLocked(inputs)
            val output = outputOverride?.let(Path::of) ?: inputs.resolveOutput(inputs.config.output.sources)
            val lock = if (locked) null else generationLock(inputs)
            val result = pipeline().generate(inputs.config, inputs.source, inputs.overlays, output, lock = lock)
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
            val expectedOutput = outputOverride?.let(Path::of) ?: inputs.resolveOutput(inputs.config.output.sources)
            require(expectedOutput.exists()) { "Generated output does not exist: $expectedOutput" }
            val isolatedRoot = Files.createTempDirectory("sdkgen-check-")
            try {
                val isolatedOutput = isolatedRoot.resolve("current")
                pipeline().generate(inputs.config, inputs.source, inputs.overlays, isolatedOutput)
                val drift = compareTrees(expectedOutput, isolatedOutput)
                if (drift.isNotEmpty()) {
                    emitDiagnostic(
                        "SDKGEN-CHECK-GENERATED-DRIFT",
                        "Generated output differs: ${drift.joinToString()}",
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

private data class CommandInputs(
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

private fun loadInputs(configFile: Path): CommandInputs {
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

private fun verifyLocked(inputs: CommandInputs) {
    require(inputs.lockPath.exists()) { "Locked mode requires ${inputs.lockPath}" }
    val lock = LockCodec.decode(inputs.lockPath.readText(), inputs.lockPath.toString())
    val diagnostics = LockedInputVerifier.verify(inputs.config, lock, inputs.source, inputs.overlays)
    if (diagnostics.isNotEmpty()) throw CliDiagnosticsException(diagnostics)
}

private fun generationLock(inputs: CommandInputs): GenerationLockPublication {
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
                    LockedPlugin(it.id, it.version, it.spiRange, ConfigDigest.sha256(it.config))
                },
        )
    return GenerationLockPublication(inputs.lockPath, LockCodec.encode(lock))
}

private fun compareTrees(
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

private fun tree(root: Path): Map<String, ByteArray> {
    val resolved = if (root.isSymbolicLink()) root.parent.resolve(root.readSymbolicLink()).normalize() else root
    return Files.walk(resolved).use { paths ->
        paths.filter(Files::isRegularFile).sorted().toList().associate { path ->
            resolved.relativize(path).toString().replace('\\', '/') to path.readBytes()
        }
    }
}

private fun deleteRecursively(root: Path) {
    if (!root.exists()) return
    Files.walk(root).use { paths -> paths.sorted(Comparator.reverseOrder()).forEach(Files::deleteIfExists) }
}

private fun pipeline(): GenerationPipeline = GenerationPipeline(GENERATOR_VERSION)

private class CliDiagnosticsException(
    val diagnostics: List<Diagnostic>,
) : RuntimeException(diagnostics.joinToString { diagnostic -> diagnostic.message })

private data class CliDiagnostic(
    val code: String,
    val message: String,
    val path: String,
    val pointer: String = "",
    val phase: String = "cli",
    val remediation: String = "Correct the reported input and rerun the command.",
)

private fun Diagnostic.toCliDiagnostic(): CliDiagnostic =
    CliDiagnostic(
        code = code,
        message = message,
        path = path.file,
        pointer = path.yamlPath,
        phase = phase.name.lowercase(),
        remediation = remediation,
    )

private const val GENERATOR_VERSION = "0.1.0-alpha.1"
private val COMPACT_JSON: Json = Json { prettyPrint = false }
