package com.nabobery.sdkgen.cli

import java.nio.file.Path
import java.util.concurrent.TimeUnit
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Exercises [main] end to end in a genuinely separate JVM process.
 *
 * [CliModuleTest] drives every command through Clikt's `CliktCommand.test` extension, which calls
 * `CliktCommand.parse` directly and reads the resulting `CliktCommandTestResult.statusCode` — it never calls
 * [main] and therefore never runs `main`'s own `try`/`catch` exit-code translation. A bug confined to that
 * translation (for example, an unreachable `catch (result: ProgramResult)` clause placed after a `catch
 * (error: CliktError)` clause, since `ProgramResult : CliktError`; or `--help` being routed through the generic
 * usage-error branch instead of [CliktCommand.echoFormattedHelp]) is invisible to every in-process test in this
 * suite no matter how thorough, because none of them ever reach the buggy code path. Only a real subprocess that
 * runs [main] and inspects the process's actual exit status and the actual stream each line landed on can catch
 * it. `stdout` and `stderr` are captured on separate pipes (not merged) precisely so a test can tell "help text
 * on stdout" apart from "help text on stderr" -- an assertion on exit code alone would have passed against the
 * pre-fix behavior in [helpOnTheRootCommandPrintsToStdoutAndExitsZero], since the old code already exited `0`
 * for `--help`; only the missing/misrouted text and the wrong stream gave the bug away.
 */
internal class CliModuleProcessTest {
    @Test
    fun mainPropagatesADiagnosticsProgramResultAsExitCodeOne() {
        // `validate --config <missing>` fails inside `ConfigCommand.execute`'s `failureHandler`, which throws
        // `ProgramResult(SDKGEN_EXIT_DIAGNOSTICS)` i.e. `ProgramResult(1)`. Under the pre-fix catch ordering this
        // was caught by the general `CliktError` branch and remapped by `sdkgenExitCode` to `SDKGEN_EXIT_USAGE`
        // (2), so the process exited 2. This assertion (`1`) would fail against that ordering.
        val result = runSdkgenProcess("validate", "--config", "/nonexistent/sdkgen-cli-process-test/x.yaml")

        assertEquals(SDKGEN_EXIT_DIAGNOSTICS, result.exitCode, result.debugString())
    }

    @Test
    fun mainMapsGenuineUsageErrorsToExitCodeTwo() {
        val result = runSdkgenProcess("--this-flag-does-not-exist")

        assertEquals(SDKGEN_EXIT_USAGE, result.exitCode, result.debugString())
        // Genuine usage errors are unaffected by the --help fix: still reported on stderr, exit 2.
        assertTrue(result.stdout.isEmpty(), result.debugString())
        assertTrue(result.stderr.isNotBlank(), result.debugString())
    }

    @Test
    fun helpOnTheRootCommandPrintsToStdoutAndExitsZero() {
        val result = runSdkgenProcess("--help")

        // Before the fix, PrintHelpMessage fell through to the generic CliktError branch: `error.message` is
        // null for PrintHelpMessage, so sdkgenUsageMessage's fallback produced
        // "Invalid command usage (PrintHelpMessage). Run 'sdkgen --help'." on STDERR, and stdout was empty.
        // Asserting exit code 0 alone would NOT have caught this: the old code already exited 0 for --help.
        assertEquals(SDKGEN_EXIT_OK, result.exitCode, result.debugString())
        assertTrue(result.stderr.isEmpty(), result.debugString())
        assertTrue(result.stdout.isNotBlank(), result.debugString())
        assertTrue(result.stdout.contains("Usage:"), result.debugString())
        assertTrue(result.stdout.contains("compat"), result.debugString())
        assertTrue(!result.stdout.contains("Invalid command usage"), result.debugString())
    }

    @Test
    fun helpOnASubcommandPrintsThatSubcommandsHelpToStdoutAndExitsZero() {
        // Regression coverage for the claim that `diff --help`/`compat --help` route to NoSuchSubcommand: that
        // does not reproduce here. ProcessBuilder passes "diff" and "--help" as two separate argv elements (as
        // any real shell invocation `sdkgen diff --help` does too), and Clikt's subcommand routing consumes
        // "diff" as the subcommand before "--help" is parsed as DiffCommand's own eager help option. The
        // apparent NoSuchSubcommand symptom was reproducible only by passing "diff --help" as a single
        // whitespace-joined argv element (e.g. an unquoted zsh variable expansion, which -- unlike bash -- does
        // not word-split), which is exactly what this test does NOT do.
        val diffHelp = runSdkgenProcess("diff", "--help")
        val compatHelp = runSdkgenProcess("compat", "--help")

        assertEquals(SDKGEN_EXIT_OK, diffHelp.exitCode, diffHelp.debugString())
        assertTrue(diffHelp.stderr.isEmpty(), diffHelp.debugString())
        assertTrue(diffHelp.stdout.contains("Usage:"), diffHelp.debugString())
        assertTrue(diffHelp.stdout.contains("--from"), diffHelp.debugString())
        assertTrue(!diffHelp.stdout.contains("Invalid command usage"), diffHelp.debugString())

        assertEquals(SDKGEN_EXIT_OK, compatHelp.exitCode, compatHelp.debugString())
        assertTrue(compatHelp.stderr.isEmpty(), compatHelp.debugString())
        assertTrue(compatHelp.stdout.contains("Usage:"), compatHelp.debugString())
        assertTrue(compatHelp.stdout.contains("--fail-on"), compatHelp.debugString())
        assertTrue(!compatHelp.stdout.contains("Invalid command usage"), compatHelp.debugString())
    }
}

private data class SdkgenProcessResult(
    val exitCode: Int,
    val stdout: String,
    val stderr: String,
) {
    fun debugString(): String = "exitCode=$exitCode\n--- stdout ---\n$stdout\n--- stderr ---\n$stderr"
}

private fun runSdkgenProcess(vararg args: String): SdkgenProcessResult {
    val javaBinary = Path.of(System.getProperty("java.home"), "bin", "java").toString()
    val classpath = System.getProperty("java.class.path")
    val command = listOf(javaBinary, "-cp", classpath, "com.nabobery.sdkgen.cli.CliModuleKt") + args

    val builder = ProcessBuilder(command)
    // Two sources of environment noise would otherwise make the stream assertions below fail for reasons that
    // have nothing to do with the CLI:
    //   - JAVA_TOOL_OPTIONS makes the child JVM print "Picked up JAVA_TOOL_OPTIONS: ..." to stderr before main()
    //     runs, so `stderr.isEmpty()` would be false even on a perfectly clean help run. The orchestrator's gate
    //     sets it to bound heap, so this is the normal case here, not an edge case.
    //   - Clikt renders help through mordant, which emits ANSI colour codes when it believes a terminal is
    //     present, so a plain `contains("Usage:")` can fail against colourised output.
    // Both are removed at the source rather than by loosening the assertions, which would blunt exactly the
    // stream-and-content checks these tests exist to make.
    builder.environment().remove("JAVA_TOOL_OPTIONS")
    builder.environment()["NO_COLOR"] = "1"
    val process = builder.start()
    // stdout and stderr are drained concurrently on their own threads, not sequentially: a child that fills the
    // OS pipe buffer on the stream read second (while nobody is draining it yet) can block forever, and this
    // test cares specifically about which stream the output landed on, so merging the streams isn't an option.
    val stdoutReader = StreamDrain(process.inputStream).also { it.start() }
    val stderrReader = StreamDrain(process.errorStream).also { it.start() }
    val exited = process.waitFor(60, TimeUnit.SECONDS)
    if (!exited) {
        process.destroyForcibly()
    }
    stdoutReader.join(TimeUnit.SECONDS.toMillis(10))
    stderrReader.join(TimeUnit.SECONDS.toMillis(10))
    if (!exited) {
        error(
            "sdkgen subprocess did not exit within 60s. stdout so far:\n${stdoutReader.text()}\n" +
                "stderr so far:\n${stderrReader.text()}",
        )
    }
    return SdkgenProcessResult(
        exitCode = process.exitValue(),
        stdout = stdoutReader.text(),
        stderr = stderrReader.text(),
    )
}

/** Drains an [java.io.InputStream] to a string on its own thread so two streams can be read without deadlock. */
private class StreamDrain(
    private val stream: java.io.InputStream,
) {
    private val thread = Thread { buffer.append(stream.bufferedReader().readText()) }
    private val buffer = StringBuilder()

    fun start(): StreamDrain {
        thread.start()
        return this
    }

    fun join(timeoutMillis: Long) = thread.join(timeoutMillis)

    fun text(): String = buffer.toString()
}
