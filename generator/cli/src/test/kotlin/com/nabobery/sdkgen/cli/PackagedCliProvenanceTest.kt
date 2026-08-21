package com.nabobery.sdkgen.cli

import com.nabobery.sdkgen.engine.config.LockCodec
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.util.concurrent.TimeUnit
import kotlin.io.path.createDirectories
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

/**
 * Proves generator-version provenance through a genuinely packaged CLI process.
 *
 * [SdkGenCliVersionTest] proves the resolver in isolation, but it cannot prove that the version is actually
 * observable once the CLI is packaged: [SdkGenCliVersion.current] reads `Implementation-Version` from the JAR
 * manifest of the package it was loaded from, and a classes-directory run (`java.class.path`) has no manifest at
 * all, so it can only ever observe the loud `0.0.0-dev` fallback. Only running the packaged sdkgen CLI — the
 * `installDist` distribution whose JAR carries the stamped manifest attribute — exercises the packaging that end
 * users get. The launcher path and the version the build stamped into it arrive as system properties wired by
 * `build.gradle.kts`; running against `java.class.path` here would silently pass for the wrong reason.
 */
internal class PackagedCliProvenanceTest {
    @Test
    fun packagedGenerationStampsTheBuildVersionIntoLockAndManifest() {
        val launcher = requirePackagedExecutable()
        val expectedVersion = requireExpectedPackagedVersion()

        val workspace = Files.createTempDirectory("sdkgen-provenance-")
        try {
            copyFixture("sdkgen.yaml", workspace.resolve("sdkgen.yaml"))
            copyFixture("openapi.yaml", workspace.resolve("openapi.yaml"))

            val result =
                runPackagedCli(
                    launcher,
                    "generate",
                    "--config",
                    workspace.resolve("sdkgen.yaml").toString(),
                )

            assertEquals(0, result.exitCode, result.debugString())

            // The run exited 0, so the lock and manifest must exist and be well-formed. If they are not, the
            // captured subprocess output is the only clue to what the packaging regression actually did, so it is
            // attached to the failure rather than surfacing a bare NoSuchFileException/JSON error.
            val lock =
                readProvenanceArtifact("sdkgen.lock", result) {
                    LockCodec.decode(workspace.resolve("sdkgen.lock").readText())
                }
            val manifestVersion =
                readProvenanceArtifact("manifest.json", result) {
                    manifestGeneratorVersion(workspace.resolve("generated/manifest.json"))
                }

            assertEquals(expectedVersion, lock.generator.version, result.debugString())
            assertEquals(expectedVersion, manifestVersion, result.debugString())

            // Guard against an implementation that merely swaps one hardcoded string for another: neither the
            // shipped placeholder nor the unpackaged-classes fallback may leak into a packaged generation.
            for (observed in listOf(lock.generator.version, manifestVersion)) {
                assertNotEquals("0.1.0-alpha.1", observed, result.debugString())
                assertNotEquals("0.0.0-dev", observed, result.debugString())
            }
        } finally {
            deleteRecursively(workspace)
        }
    }

    private fun <T> readProvenanceArtifact(
        artifact: String,
        result: PackagedCliResult,
        read: () -> T,
    ): T =
        try {
            read()
        } catch (failure: Exception) {
            throw AssertionError(
                "Packaged CLI exited 0 but $artifact could not be read.\n${result.debugString()}",
                failure,
            )
        }

    private fun manifestGeneratorVersion(manifest: Path): String =
        Json
            .parseToJsonElement(manifest.readText())
            .jsonObject["generatorVersion"]
            ?.jsonPrimitive
            ?.content
            ?: error("manifest.json at $manifest has no generatorVersion field")

    private fun copyFixture(
        resource: String,
        destination: Path,
    ) {
        val stream: InputStream =
            requireNotNull(javaClass.getResourceAsStream("provenance/$resource")) {
                "Missing packaged-provenance fixture resource: provenance/$resource"
            }
        destination.parent?.createDirectories()
        destination.writeText(stream.bufferedReader().use { it.readText() })
    }
}

private fun requirePackagedExecutable(): Path {
    val configured =
        System.getProperty("cli.packagedExecutable")?.takeIf(String::isNotBlank)
            ?: error(
                "System property 'cli.packagedExecutable' is not set. The packaged CLI launcher (installDist) " +
                    "must be wired as a test input; a java.class.path run cannot prove manifest packaging.",
            )
    val launcher = Path.of(configured)
    assertTrue(Files.isExecutable(launcher), "Packaged CLI launcher is not an executable file: $launcher")
    return launcher
}

private fun requireExpectedPackagedVersion(): String =
    System.getProperty("cli.expectedPackagedVersion")?.takeIf(String::isNotBlank)
        ?: error("System property 'cli.expectedPackagedVersion' is not set by the build.")

private data class PackagedCliResult(
    val exitCode: Int,
    val output: String,
) {
    fun debugString(): String = "exitCode=$exitCode\n--- output ---\n$output"
}

private fun runPackagedCli(
    launcher: Path,
    vararg args: String,
): PackagedCliResult {
    val command = listOf(launcher.toString()) + args
    val process =
        ProcessBuilder(command)
            .redirectErrorStream(true)
            .start()
    val drain = StringBuilder()
    val reader = Thread { drain.append(process.inputStream.bufferedReader().readText()) }
    reader.start()
    val exited = process.waitFor(120, TimeUnit.SECONDS)
    if (!exited) process.destroyForcibly()
    reader.join(TimeUnit.SECONDS.toMillis(10))
    if (!exited) error("Packaged CLI did not exit within 120s. Output so far:\n$drain")
    return PackagedCliResult(process.exitValue(), drain.toString())
}
