package com.nabobery.sdkgen.cli

import com.github.ajalt.clikt.core.CliktError
import com.github.ajalt.clikt.core.parse
import com.github.ajalt.clikt.testing.test
import com.nabobery.sdkgen.engine.config.LockCodec
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import java.nio.file.Files
import java.nio.file.Path
import kotlin.coroutines.cancellation.CancellationException
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.readSymbolicLink
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class CliModuleTest {
    @Test
    fun validateChecksPinnedContractWithoutEmission() {
        val project = fixtureProject()

        val result = sdkgenCommand().test("validate --config ${project.config} --format json")

        assertEquals(0, result.statusCode)
        assertTrue(result.stdout.contains("\"status\":\"ok\""))
        assertFalse(project.output.exists())
    }

    @Test
    fun generateWritesAtomicSourcesManifestAndLockThenCheckIsClean() {
        val project = fixtureProject()

        val generated = sdkgenCommand().test("generate --config ${project.config}")
        val checked = sdkgenCommand().test("check --config ${project.config}")

        assertEquals(0, generated.statusCode, generated.output)
        assertEquals(0, checked.statusCode, checked.output)
        assertTrue(project.output.exists())
        assertTrue(project.output.resolve("manifest.json").exists())
        assertTrue(project.lock.exists())
        assertTrue(
            project.output
                .resolve(
                    "com/nabobery/sdkgen/generated/OpenRouterClient.kt",
                ).readText()
                .contains("OperationMetadata"),
        )
    }

    @Test
    fun checkReportsGeneratedDriftAndLockedModeReportsLockDrift() {
        val project = fixtureProject()
        assertEquals(0, sdkgenCommand().test("generate --config ${project.config}").statusCode)
        val target =
            project.output.parent
                .resolve(project.output.readSymbolicLink())
                .normalize()
        target.resolve("com/nabobery/sdkgen/generated/OpenRouterClient.kt").writeText("changed\n")

        val check = sdkgenCommand().test("check --config ${project.config} --format json")
        assertEquals(1, check.statusCode)
        assertTrue(check.stdout.contains("SDKGEN-CHECK-GENERATED-DRIFT"))

        project.config.writeText(
            project.config.readText().replace("requestTimeoutMillis: 60000", "requestTimeoutMillis: 61000"),
        )
        val locked = sdkgenCommand().test("generate --config ${project.config} --locked --format json")
        assertEquals(1, locked.statusCode)
        assertTrue(locked.stdout.contains("SDKGEN-LOCK-CONFIG-DRIFT"))
    }

    @Test
    fun lockedModeRefusesExternalReferenceDriftBeforeReplacingOutput() {
        val project = referencedFixtureProject()
        val generated = sdkgenCommand().test("generate --config ${project.config}")
        assertEquals(0, generated.statusCode, generated.output)
        val activeTarget = project.output.readSymbolicLink()

        project.reference.writeText(referencedComponent("after"))
        val locked = sdkgenCommand().test("generate --config ${project.config} --locked --format json")

        assertEquals(1, locked.statusCode, locked.output)
        assertTrue(locked.stdout.contains("SDKGEN-LOCK-DIGEST-MISMATCH"))
        assertEquals(activeTarget, project.output.readSymbolicLink())
    }

    @Test
    fun lockedCommandsPreserveTypedLockContractDiagnostics() {
        val cases =
            listOf(
                LockFailureCase("missing version", "SDKGEN-LOCK-VERSION-MISSING") { text ->
                    text.replaceFirst("  \"version\": \"v1alpha1\",\n", "")
                },
                LockFailureCase("unsupported version", "SDKGEN-LOCK-VERSION-UNSUPPORTED") { text ->
                    text.replaceFirst("v1alpha1", "v2")
                },
                LockFailureCase("malformed content", "SDKGEN-LOCK-DECODE-FAILED") { "{not-json" },
                LockFailureCase("unknown field", "SDKGEN-LOCK-DECODE-FAILED") { text ->
                    text.replaceFirst("  \"configDigest\"", "  \"unknown\": true,\n  \"configDigest\"")
                },
            )

        cases.forEach { case ->
            val project = fixtureProject()
            val generated = sdkgenCommand().test("generate --config ${project.config}")
            assertEquals(0, generated.statusCode, case.name)
            project.lock.writeText(case.mutate(project.lock.readText()))

            val result = sdkgenCommand().test("check --config ${project.config} --format json")

            assertEquals(1, result.statusCode, case.name)
            assertTrue(result.stdout.contains(case.code), case.name)
            assertTrue(result.stdout.contains("\"phase\":\"lock\""), case.name)
            assertTrue(result.stdout.contains(project.lock.toString()), case.name)
        }
    }

    @Test
    fun lockedModeJsonRefusalsUseOneSortedDiagnosticsDocument() {
        val project = referencedFixtureProject()
        assertEquals(0, sdkgenCommand().test("generate --config ${project.config}").statusCode)
        val lock = LockCodec.decode(project.lock.readText())
        project.lock.writeText(
            LockCodec.encode(
                lock.copy(
                    source =
                        lock.source.copy(
                            sha256 = "f".repeat(64),
                            references = lock.source.references.map { it.copy(sha256 = "e".repeat(64)) },
                        ),
                ),
            ),
        )

        val result = sdkgenCommand().test("generate --config ${project.config} --locked --format json")

        assertEquals(1, result.statusCode, result.output)
        val document = Json.parseToJsonElement(result.stdout).jsonObject
        assertEquals("v1alpha1", document.getValue("contractVersion").jsonPrimitive.content)
        assertEquals("diagnostics", document.getValue("status").jsonPrimitive.content)
        val diagnostics = document.getValue("diagnostics").jsonArray
        assertEquals(2, diagnostics.size)
        assertEquals(
            listOf("$.source", "$.source.references[0]"),
            diagnostics.map {
                it.jsonObject
                    .getValue(
                        "sourcePointer",
                    ).jsonObject
                    .getValue("pointer")
                    .jsonPrimitive.content
            },
        )
    }

    @Test
    fun cliBoundaryRethrowsTheSameCancellationInstance() {
        val cancellation = CancellationException("cancelled")
        var handled = false

        val thrown =
            assertFailsWith<CancellationException> {
                executeCliAction(
                    action = { throw cancellation },
                    failureHandler = { failure ->
                        handled = true
                        throw AssertionError("Cancellation reached failure handler", failure)
                    },
                )
            }

        assertSame(cancellation, thrown)
        assertFalse(handled)
    }

    @Test
    fun diagnosticsUseExitOneAndUsageUsesExitTwo() {
        val project = fixtureProject()
        val missing = project.root.resolve("missing.yaml")

        val diagnostic = sdkgenCommand().test("validate --config $missing --format json")
        val usage = assertFailsWith<CliktError> { sdkgenCommand().parse(listOf("validate", "--unknown")) }

        assertEquals(1, diagnostic.statusCode)
        assertTrue(diagnostic.stdout.contains("SDKGEN-CLI-FAILURE"))
        assertTrue(diagnostic.stdout.contains("\"phase\":\"cli\""))
        assertTrue(diagnostic.stdout.contains("\"remediation\":"))
        assertTrue(diagnostic.stdout.contains("\"sourcePointer\":"))
        assertEquals(2, sdkgenExitCode(usage))
        assertTrue(sdkgenUsageMessage(usage).contains("NoSuchOption"))
    }

    private fun referencedFixtureProject(): ReferencedFixtureProject {
        val root = Files.createTempDirectory("sdkgen-cli-reference-test")
        val specs = root.resolve("specs").also(Path::createDirectories)
        val source = specs.resolve("openapi.yaml")
        val openRouter = Path.of(requireNotNull(System.getProperty("cli.openRouterFile"))).readText()
        val schemasMarker = "  schemas:\n"
        require(schemasMarker in openRouter) { "OpenRouter fixture is missing the components schema marker" }
        source.writeText(
            openRouter.replaceFirst(
                schemasMarker,
                schemasMarker +
                    "    ExternalLockProbe:\n" +
                    "      ${'$'}ref: 'components.yaml#/components/schemas/Referenced'\n",
            ),
        )
        val reference = specs.resolve("components.yaml")
        reference.writeText(referencedComponent("before"))
        val config = root.resolve("sdkgen.yaml")
        config.writeText(
            """
            version: v1alpha1
            source:
              uri: specs/openapi.yaml
              sha256: ${source.sha256()}
              acquisition:
                mode: local
                offline: true
                allowedLocalRoots: [specs]
            kotlin:
              packageName: com.nabobery.sdkgen.generated
              coordinates:
                groupId: com.nabobery
                artifactId: reference-generated
              naming:
                clientName: ReferenceClient
                resourceGrouping: tags
              targets: [jvm]
            output:
              sources: generated/current
              resources: generated/resources
              manifest: generated/current/manifest.json
              lock: sdkgen.lock
              checkedInSources: true
            """.trimIndent() + "\n",
        )
        root.resolve("generated").createDirectories()
        return ReferencedFixtureProject(
            config = config,
            output = root.resolve("generated/current"),
            lock = root.resolve("sdkgen.lock"),
            reference = reference,
        )
    }

    private fun referencedComponent(description: String): String =
        """
        components:
          schemas:
            Referenced:
              type: object
              description: $description
        """.trimIndent() + "\n"

    private fun fixtureProject(): FixtureProject {
        val root = Files.createTempDirectory("sdkgen-cli-test")
        val source = Path.of(requireNotNull(System.getProperty("cli.openRouterFile"))).toAbsolutePath()
        val config = root.resolve("sdkgen.yaml")
        config.writeText(
            """
            version: v1alpha1
            source:
              uri: ${source.toString().replace('\\', '/')}
              sha256: ${source.sha256()}
              acquisition:
                mode: local
                offline: true
                allowedLocalRoots:
                  - ${source.parent.toString().replace('\\', '/')}
            kotlin:
              packageName: com.nabobery.sdkgen.generated
              coordinates:
                groupId: com.nabobery
                artifactId: openrouter-generated
              naming:
                clientName: OpenRouterClient
                resourceGrouping: tags
              targets: [jvm]
            runtime:
              requestTimeoutMillis: 60000
            output:
              sources: generated/current
              resources: generated/resources
              manifest: generated/current/manifest.json
              lock: sdkgen.lock
              checkedInSources: true
            """.trimIndent() +
                "\n",
        )
        root.resolve("generated").createDirectories()
        return FixtureProject(root, config, root.resolve("generated/current"), root.resolve("sdkgen.lock"))
    }
}

private data class LockFailureCase(
    val name: String,
    val code: String,
    val mutate: (String) -> String,
)

private data class ReferencedFixtureProject(
    val config: Path,
    val output: Path,
    val lock: Path,
    val reference: Path,
)

private data class FixtureProject(
    val root: Path,
    val config: Path,
    val output: Path,
    val lock: Path,
)

private fun Path.sha256(): String =
    java.security.MessageDigest
        .getInstance("SHA-256")
        .digest(Files.readAllBytes(this))
        .joinToString("") { "%02x".format(it) }
