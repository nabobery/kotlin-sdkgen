package com.nabobery.sdkgen.cli

import com.github.ajalt.clikt.core.CliktError
import com.github.ajalt.clikt.core.parse
import com.github.ajalt.clikt.testing.test
import com.nabobery.sdkgen.engine.config.LockCodec
import kotlinx.serialization.decodeFromString
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
        val project = cleanFixtureProject()

        val result = sdkgenCommand().test("validate --config ${project.config} --format json")

        assertEquals(0, result.statusCode)
        assertTrue(result.stdout.contains("\"status\":\"ok\""))
        assertFalse(project.output.exists())
    }

    @Test
    fun generationRefusesInvalidInputWithoutPublishingOutputs() {
        val project = fixtureProject()

        val result = sdkgenCommand().test("generate --config ${project.config} --format json")

        assertEquals(1, result.statusCode, result.output)
        assertTrue(result.stdout.contains("\"status\":\"diagnostics\""))
        assertFalse(project.output.exists())
        assertFalse(project.lock.exists())
    }

    @Test
    fun generateWritesAtomicSourcesManifestAndLockThenCheckIsClean() {
        val project = cleanFixtureProject()

        val generated = sdkgenCommand().test("generate --config ${project.config}")
        val checked = sdkgenCommand().test("check --config ${project.config}")

        assertEquals(0, generated.statusCode, generated.output)
        assertEquals(0, checked.statusCode, checked.output)
        assertTrue(project.output.exists())
        assertTrue(project.output.resolve("manifest.json").exists())
        assertTrue(project.lock.exists())
        // "/chat" has no operation tag, so it falls back to its first path segment: the "chat" sub-client
        // (task T3 partitions the client by tag/resource; OperationMetadata lives on the sub-client, not the
        // root OpenRouterClient.kt facade).
        assertTrue(
            project.output
                .resolve(
                    "com/nabobery/sdkgen/generated/chat/ChatClient.kt",
                ).readText()
                .contains("OperationMetadata"),
        )
    }

    @Test
    fun checkReportsGeneratedDriftAndLockedModeReportsLockDrift() {
        val project = cleanFixtureProject()
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
            val project = cleanFixtureProject()
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
        val missingTarget = sdkgenCommand().test("explain --format json")
        val missingTargetEquals = sdkgenCommand().test("explain --format=json")
        val usage = assertFailsWith<CliktError> { sdkgenCommand().parse(listOf("validate", "--unknown")) }
        val jsonUsage =
            assertFailsWith<CliktError> {
                sdkgenCommand().parse(listOf("validate", "--unknown", "--format=json"))
            }

        assertEquals(1, diagnostic.statusCode)
        assertEquals(2, missingTarget.statusCode)
        assertEquals(2, missingTargetEquals.statusCode)
        val missingTargetUsage =
            sdkgenUsageDocument(CliktError("explain requires a symbol, diagnostic code, or --pointer.")) + "\n"
        assertEquals(missingTargetUsage, missingTarget.stdout)
        assertEquals(missingTargetUsage, missingTargetEquals.stdout)
        assertTrue(diagnostic.stdout.contains("SDKGEN-CLI-FAILURE"))
        assertTrue(diagnostic.stdout.contains("\"phase\":\"cli\""))
        assertTrue(diagnostic.stdout.contains("\"remediation\":"))
        assertTrue(diagnostic.stdout.contains("\"sourcePointer\":"))
        assertEquals(2, sdkgenExitCode(usage))
        assertTrue(sdkgenUsageMessage(usage).contains("NoSuchOption"))
        val usageDocument = Json.parseToJsonElement(sdkgenUsageDocument(usage)).jsonObject
        assertEquals("v1alpha1", usageDocument.getValue("contractVersion").jsonPrimitive.content)
        assertEquals("diagnostics", usageDocument.getValue("status").jsonPrimitive.content)
        assertEquals(1, usageDocument.getValue("diagnostics").jsonArray.size)
        val jsonUsageDocument = Json.parseToJsonElement(sdkgenUsageDocument(jsonUsage)).jsonObject
        assertEquals(
            "SDKGEN-CLI-USAGE",
            jsonUsageDocument
                .getValue("diagnostics")
                .jsonArray
                .first()
                .jsonObject
                .getValue("code")
                .jsonPrimitive
                .content,
        )
        assertEquals(2, sdkgenExitCode(jsonUsage))
    }

    @Test
    fun diffReportsEffectiveSemanticAndKotlinImpactAndIsDeterministic() {
        val before = cleanFixtureProject()
        val after = cleanFixtureProject()
        assertEquals(0, sdkgenCommand().test("generate --config ${before.config}").statusCode)
        assertEquals(0, sdkgenCommand().test("generate --config ${after.config}").statusCode)
        after.config.writeText(
            after.config
                .readText()
                .replace("requestTimeoutMillis: 60000", "requestTimeoutMillis: 61000")
                .replace("targets: [jvm]", "targets: [jvm, js]"),
        )
        assertEquals(0, sdkgenCommand().test("generate --config ${after.config}").statusCode)

        val command =
            "diff --from ${before.output.resolve("manifest.json")} " +
                "--to ${after.output.resolve("manifest.json")} --format json --warnings-as-errors"
        val first = sdkgenCommand().test(command)
        val second = sdkgenCommand().test(command)

        assertEquals(1, first.statusCode, first.output)
        assertEquals(first.stdout, second.stdout)
        val document = Json.parseToJsonElement(first.stdout).jsonObject
        assertEquals("v1alpha1", document.getValue("contractVersion").jsonPrimitive.content)
        assertEquals("changes", document.getValue("status").jsonPrimitive.content)
        assertTrue(first.stdout.contains("\"kind\":\"configuration\""))
        assertTrue(first.stdout.contains("\"kind\":\"effective-contract\""))
        assertTrue(first.stdout.contains("\"apiImpact\":\"potentially-breaking\""))
        assertTrue(first.stdout.contains("\"warningsAsErrors\":true"))
    }

    @Test
    fun diffAcceptsLockStatesAndInvalidInputsUseDiagnosticExit() {
        val project = cleanFixtureProject()
        assertEquals(0, sdkgenCommand().test("generate --config ${project.config}").statusCode)

        val sameLock =
            sdkgenCommand().test(
                "diff --from ${project.lock} --to ${project.lock} --format json",
            )
        val sameConfigToManifest =
            sdkgenCommand().test(
                "diff --from ${project.config} --to ${project.output.resolve("manifest.json")} --format json",
            )
        val sameDirectory =
            sdkgenCommand().test(
                "diff --from ${project.output} --to ${project.output} --format json",
            )
        val human =
            sdkgenCommand().test(
                "diff --from ${project.lock} --to ${project.lock} --format human",
            )
        val invalid =
            sdkgenCommand().test(
                "diff --from ${project.root.resolve("missing.json")} --to ${project.lock} --format json",
            )
        val invalidTo =
            sdkgenCommand().test(
                "diff --from ${project.lock} --to ${project.root.resolve("missing.json")} --format json",
            )

        assertEquals(0, sameLock.statusCode, sameLock.output)
        assertEquals(0, sameConfigToManifest.statusCode, sameConfigToManifest.output)
        assertEquals(0, sameDirectory.statusCode, sameDirectory.output)
        assertEquals(0, human.statusCode, human.output)
        assertTrue(human.stdout.contains("diff: no changes"))
        assertTrue(sameLock.stdout.contains("\"semanticComparison\":\"unavailable\""))
        assertEquals(1, invalid.statusCode)
        assertTrue(invalid.stdout.contains("SDKGEN-DIFF-INPUT-INVALID"))
        assertEquals(1, invalidTo.statusCode)
        assertTrue(invalidTo.stdout.contains("\"operand\":\"--to\""))
    }

    @Test
    fun diffComparesManifestToolsWithLockTools() {
        val project = cleanFixtureProject()
        assertEquals(0, sdkgenCommand().test("generate --config ${project.config}").statusCode)
        val manifest = project.output.resolve("manifest.json")
        val clean =
            sdkgenCommand().test(
                "diff --from ${project.lock} --to $manifest --format json",
            )
        val changedManifest = project.root.resolve("changed-manifest.json")
        changedManifest.writeText(
            manifest.readText().replace("\"version\": \"2.3.0\"", "\"version\": \"2.3.1\""),
        )
        val changed =
            sdkgenCommand().test(
                "diff --from ${project.lock} --to $changedManifest --format json",
            )

        assertEquals(0, clean.statusCode, clean.output)
        assertFalse(
            Json
                .parseToJsonElement(clean.stdout)
                .jsonObject
                .getValue("unavailableDimensions")
                .jsonArray
                .any { it.jsonPrimitive.content == "tools" },
        )
        assertFalse(clean.stdout.contains("\"subject\":\"tools\""))
        assertEquals(1, changed.statusCode, changed.output)
        assertTrue(changed.stdout.contains("\"subject\":\"tools\""))
    }

    @Test
    fun diffConfigToOwnManifestRemainsCleanForOverlaySemanticWarning() {
        val project = semanticWarningFixtureProject()

        val generated = sdkgenCommand().test("generate --config ${project.config}")
        val sameConfigToManifest =
            sdkgenCommand().test(
                "diff --from ${project.config} --to ${project.output.resolve("manifest.json")} --format json",
            )

        assertEquals(0, generated.statusCode, generated.output)
        assertEquals(0, sameConfigToManifest.statusCode, sameConfigToManifest.output)
        assertTrue(
            project.output
                .resolve("manifest.json")
                .readText()
                .contains("SDKGEN-LEGACY-NULLABLE-COMPOSITION"),
        )
    }

    @Test
    fun diffRejectsManifestTraversalBeforeComparingDeclaredFiles() {
        val root = Files.createTempDirectory("sdkgen-cli-manifest-test")
        val manifest = root.resolve("manifest.json")
        manifest.writeText(
            """
            {
              "schemaVersion": "v1alpha1",
              "files": [
                {"path": "../escape.kt", "sha256": "${"a".repeat(64)}"}
              ]
            }
            """.trimIndent(),
        )

        val result = sdkgenCommand().test("diff --from $manifest --to $manifest --format json")

        assertEquals(1, result.statusCode)
        assertTrue(result.stdout.contains("SDKGEN-DIFF-INPUT-INVALID"))
        assertTrue(result.stdout.contains("\"operand\":\"--from\""))
    }

    @Test
    fun diffPreservesOrderedOverlayArraysWithoutWalkingDeclaredFiles() {
        val root = Files.createTempDirectory("sdkgen-cli-canonical-manifest-test")
        val first = root.resolve("first.json")
        val second = root.resolve("second.json")
        val digest = "a".repeat(64)
        first.writeText(
            """
            {
              "schemaVersion": "v1alpha1",
              "overlays": [
                {"id": "z", "canonicalUri": "sdkgen://z", "sha256": "$digest"},
                {"id": "a", "canonicalUri": "sdkgen://a", "sha256": "$digest"}
              ],
              "files": [
                {"path": "b.kt", "sha256": "$digest"},
                {"path": "a.kt", "sha256": "$digest"}
              ]
            }
            """.trimIndent(),
        )
        second.writeText(
            """
            {
              "schemaVersion": "v1alpha1",
              "overlays": [
                {"id": "a", "canonicalUri": "sdkgen://a", "sha256": "$digest"},
                {"id": "z", "canonicalUri": "sdkgen://z", "sha256": "$digest"}
              ],
              "files": [
                {"path": "a.kt", "sha256": "$digest"},
                {"path": "b.kt", "sha256": "$digest"}
              ]
            }
            """.trimIndent(),
        )

        val result = sdkgenCommand().test("diff --from $first --to $second --format json")

        assertEquals(1, result.statusCode, result.output)
        val document = Json.parseToJsonElement(result.stdout).jsonObject
        assertEquals("changes", document.getValue("status").jsonPrimitive.content)
        assertEquals(
            "overlays",
            document
                .getValue("changes")
                .jsonArray
                .single()
                .jsonObject
                .getValue("subject")
                .jsonPrimitive.content,
        )
        assertTrue(document.getValue("unavailableDimensions").jsonArray.isNotEmpty())
    }

    @Test
    fun diffRejectsMalformedManifestOnTheCorrectOperand() {
        val root = Files.createTempDirectory("sdkgen-cli-manifest-operand-test")
        val from = root.resolve("from.json")
        val to = root.resolve("manifest.json")
        from.writeText("{\"schemaVersion\":\"v1alpha1\"}")
        to.writeText("{not-json")

        val result = sdkgenCommand().test("diff --from $from --to $to --format json")

        assertEquals(1, result.statusCode, result.output)
        assertTrue(result.stdout.contains("SDKGEN-DIFF-INPUT-INVALID"))
        assertTrue(result.stdout.contains("\"operand\":\"--to\""))
    }

    @Test
    fun diffRejectsManifestFileListsAboveTheBound() {
        val root = Files.createTempDirectory("sdkgen-cli-manifest-bound-test")
        val manifest = root.resolve("manifest.json")
        val digest = "b".repeat(64)
        val files =
            (0..20_000).joinToString(",") { index ->
                "{\"path\":\"$index.kt\",\"sha256\":\"$digest\"}"
            }
        manifest.writeText("{\"schemaVersion\":\"v1alpha1\",\"files\":[$files]}")

        val result = sdkgenCommand().test("diff --from $manifest --to $manifest --format json")

        assertEquals(1, result.statusCode, result.output)
        assertTrue(result.stdout.contains("SDKGEN-DIFF-INPUT-INVALID"))
        assertTrue(result.stdout.contains("\"operand\":\"--from\""))
    }

    @Test
    fun diffRejectsOversizedJsonOperandBeforeClassifyingItsName() {
        val root = Files.createTempDirectory("sdkgen-cli-json-bound-test")
        val oversized = root.resolve("not-manifest.json")
        oversized.writeText(
            """
            {"schemaVersion":"v1alpha1","padding":"${"x".repeat(17 * 1024 * 1024)}"}
            """.trimIndent(),
        )

        val result = sdkgenCommand().test("diff --from $oversized --to $oversized --format json")

        assertEquals(1, result.statusCode, result.output)
        assertTrue(result.stdout.contains("SDKGEN-DIFF-INPUT-INVALID"))
        assertTrue(result.stdout.contains("\"operand\":\"--from\""))
        assertTrue(result.stdout.contains("JSON operand exceeds"))
    }

    @Test
    fun diffWarningsAsErrorsOnlyBlocksWarnings() {
        val root = Files.createTempDirectory("sdkgen-cli-warning-test")
        val errorManifest = root.resolve("error.json")
        val warningManifest = root.resolve("warning.json")
        errorManifest.writeText(
            """
            {"schemaVersion":"v1alpha1","diagnostics":[
              {"code":"E","severity":"error","message":"error","source":{"documentUri":"source","jsonPointer":"/"}}
            ]}
            """.trimIndent(),
        )
        warningManifest.writeText(
            """
            {"schemaVersion":"v1alpha1","diagnostics":[
              {"code":"W","severity":"warning","message":"warning","source":{"documentUri":"source","jsonPointer":"/"}}
            ]}
            """.trimIndent(),
        )

        val allowlistedManifest = root.resolve("allowlisted.json")
        allowlistedManifest.writeText(
            """
            {"schemaVersion":"v1alpha1","warningsAsErrors":true,"warningAllowlist":["W"],"diagnostics":[
              {"code":"W","severity":"warning","message":"warning","source":{"documentUri":"source","jsonPointer":"/"}}
            ]}
            """.trimIndent(),
        )
        val unknownManifest = root.resolve("unknown.json")
        unknownManifest.writeText(
            """
            {"schemaVersion":"v1alpha1","diagnostics":[
              {"code":"U","severity":"notice","message":"unknown","source":{"documentUri":"source","jsonPointer":"/"}}
            ]}
            """.trimIndent(),
        )
        val errorOnly =
            sdkgenCommand().test(
                "diff --from $errorManifest --to $errorManifest --format json --warnings-as-errors",
            )
        val allowlisted =
            sdkgenCommand().test(
                "diff --from $allowlistedManifest --to $allowlistedManifest --format json",
            )
        val warningNotPromoted =
            sdkgenCommand().test(
                "diff --from $warningManifest --to $warningManifest --format json",
            )
        val warning =
            sdkgenCommand().test(
                "diff --from $warningManifest --to $warningManifest --format json --warnings-as-errors",
            )
        val unknown =
            sdkgenCommand().test(
                "diff --from $unknownManifest --to $unknownManifest --format json --warnings-as-errors",
            )

        assertEquals(1, errorOnly.statusCode)
        assertTrue(errorOnly.stdout.contains("\"status\":\"changes\""))
        assertEquals(0, allowlisted.statusCode)
        assertTrue(allowlisted.stdout.contains("\"warningAllowlist\":[\"W\"]"))
        assertEquals(0, warningNotPromoted.statusCode)
        assertTrue(warningNotPromoted.stdout.contains("\"status\":\"ok\""))
        assertEquals(1, warning.statusCode)
        assertTrue(warning.stdout.contains("warnings-as-errors"))
        assertEquals(0, unknown.statusCode)
        assertTrue(unknown.stdout.contains("\"severity\":\"notice\""))
    }

    @Test
    fun diffReportsAcceptedWaiverChangesAsGeneratedSemantic() {
        val root = Files.createTempDirectory("sdkgen-cli-accepted-waiver-test")
        val digest = "c".repeat(64)

        fun manifestWithDisposition(disposition: String): String =
            """
            {
              "schemaVersion": "v1alpha1",
              "acceptedWaivers": [
                {
                  "id": "waiver-1",
                  "category": "compat",
                  "kind": "operation",
                  "symbolId": "op:legacyChat",
                  "diagnosticCode": "SDKGEN-LEGACY-NULLABLE-COMPOSITION",
                  "reason": "legacy nullable composition",
                  "reasonSha256": "$digest",
                  "rationale": "grandfathered for v1 clients",
                  "owner": "sdk-team",
                  "disposition": "$disposition",
                  "source": {"documentUri": "source", "jsonPointer": "/"}
                }
              ]
            }
            """.trimIndent()
        val from = root.resolve("from.json")
        val to = root.resolve("to.json")
        from.writeText(manifestWithDisposition("accepted"))
        to.writeText(manifestWithDisposition("regressed"))

        val result = sdkgenCommand().test("diff --from $from --to $to --format json")

        assertEquals(1, result.statusCode, result.output)
        assertFalse(result.stdout.contains("SDKGEN-DIFF-INPUT-INVALID"))
        val document = Json.parseToJsonElement(result.stdout).jsonObject
        assertEquals("changes", document.getValue("status").jsonPrimitive.content)
        val change =
            document
                .getValue("changes")
                .jsonArray
                .single {
                    it.jsonObject
                        .getValue("subject")
                        .jsonPrimitive.content == "acceptedWaivers"
                }.jsonObject
        assertEquals("generated-semantic", change.getValue("kind").jsonPrimitive.content)
        assertEquals("changed", change.getValue("status").jsonPrimitive.content)
    }

    @Test
    fun diffTreatsManifestWithExclusionsAsReadable() {
        val root = Files.createTempDirectory("sdkgen-cli-exclusions-test")
        val digest = "d".repeat(64)
        val manifest = root.resolve("manifest.json")
        manifest.writeText(
            """
            {
              "schemaVersion": "v1alpha1",
              "exclusions": [
                {
                  "kind": "operation",
                  "symbolId": "op:legacyBeta",
                  "diagnosticCode": "SDKGEN-EMIT-EXCLUDED",
                  "reason": "unsupported composition",
                  "reasonSha256": "$digest",
                  "source": {"documentUri": "source", "jsonPointer": "/"}
                }
              ]
            }
            """.trimIndent(),
        )

        val result = sdkgenCommand().test("diff --from $manifest --to $manifest --format json")

        assertEquals(0, result.statusCode, result.output)
        assertFalse(result.stdout.contains("SDKGEN-DIFF-INPUT-INVALID"))
    }

    @Test
    fun diffRejectsManifestWithGenuinelyUnmodeledField() {
        val root = Files.createTempDirectory("sdkgen-cli-unmodeled-field-test")
        val manifest = root.resolve("manifest.json")
        manifest.writeText(
            """
            {
              "schemaVersion": "v1alpha1",
              "neverModeledField": "surprise"
            }
            """.trimIndent(),
        )

        val result = sdkgenCommand().test("diff --from $manifest --to $manifest --format json")

        assertEquals(1, result.statusCode, result.output)
        assertTrue(result.stdout.contains("SDKGEN-DIFF-INPUT-INVALID"))
    }

    @Test
    fun manifestAcceptedWaiverDocumentDecodesAllFields() {
        val digest = "e".repeat(64)
        val json =
            """
            {
              "id": "waiver-2",
              "category": "compat",
              "kind": "schema",
              "symbolId": "schema:LegacyPayload",
              "diagnosticCode": "SDKGEN-LEGACY-NULLABLE-COMPOSITION",
              "reason": "legacy nullable composition",
              "reasonSha256": "$digest",
              "rationale": "grandfathered for v1 clients",
              "owner": "sdk-team",
              "disposition": "accepted",
              "source": {"documentUri": "source", "jsonPointer": "/"}
            }
            """.trimIndent()

        val decoded = MANIFEST_JSON.decodeFromString<ManifestAcceptedWaiverDocument>(json)

        assertEquals("waiver-2", decoded.id)
        assertEquals("compat", decoded.category)
        assertEquals("schema", decoded.kind)
        assertEquals("schema:LegacyPayload", decoded.symbolId)
        assertEquals("SDKGEN-LEGACY-NULLABLE-COMPOSITION", decoded.diagnosticCode)
        assertEquals("legacy nullable composition", decoded.reason)
        assertEquals(digest, decoded.reasonSha256)
        assertEquals("grandfathered for v1 clients", decoded.rationale)
        assertEquals("sdk-team", decoded.owner)
        assertEquals("accepted", decoded.disposition)
        assertEquals("source", decoded.source?.documentUri)
        assertEquals("/", decoded.source?.jsonPointer)
    }

    @Test
    fun explainTracesSymbolsDiagnosticsPointersAndWarningsAsErrors() {
        val project = fixtureProject()

        val symbol =
            sdkgenCommand().test(
                "explain ChatUsage --config ${project.config} --format json",
            )
        val generatedSymbol =
            sdkgenCommand().test(
                "explain ChatRequest --config ${project.config} --format json",
            )
        val diagnostic =
            sdkgenCommand().test(
                "explain SDKGEN-EMIT-EXCLUDED --config ${project.config} --format json --warnings-as-errors",
            )
        val pointer =
            sdkgenCommand().test(
                "explain --pointer '#/components/schemas/ChatUsage' --config ${project.config} --format json",
            )
        val human =
            sdkgenCommand().test(
                "explain ChatUsage --config ${project.config} --format human",
            )

        assertEquals(0, symbol.statusCode, symbol.output)
        assertEquals(0, generatedSymbol.statusCode, generatedSymbol.output)
        assertEquals(0, diagnostic.statusCode, diagnostic.output)
        assertEquals(0, pointer.statusCode, pointer.output)
        assertEquals(0, human.statusCode, human.output)
        assertTrue(human.stdout.contains("symbol: schema:ChatUsage"))
        assertTrue(symbol.stdout.contains("\"kind\":\"symbol\""))
        assertTrue(symbol.stdout.contains("\"resolved\":\"ChatUsage\""))
        assertTrue(symbol.stdout.contains("/components/schemas/ChatUsage"))
        assertTrue(generatedSymbol.stdout.contains("/components/schemas/ChatRequest"))
        assertTrue(generatedSymbol.stdout.contains("\"strategy\":\"declaration\""))
        assertTrue(diagnostic.stdout.contains("\"kind\":\"diagnostic\""))
        assertTrue(diagnostic.stdout.contains("\"warningsAsErrors\":true"))
        assertTrue(pointer.stdout.contains("\"query\":\"#/components/schemas/ChatUsage\""))
        assertFalse(project.output.exists())
    }

    @Test
    fun explainUsesConfiguredNamingPluginResolvedSymbol() {
        val project = cleanFixtureProject()
        project.config.writeText(
            project.config
                .readText()
                .replace(
                    "kotlin:\n",
                    """
                    plugins:
                      - id: com.nabobery.sdkgen.builtin.naming-override
                        version: 0.1.0
                        spiRange: ">=0.1 <0.2"
                        config:
                          clientName: ExplainPluginClient
                    kotlin:
                    """.trimIndent() + "\n",
                ),
        )

        val result =
            sdkgenCommand().test(
                "explain ExplainPluginClient --config ${project.config} --format json",
            )

        assertEquals(0, result.statusCode, result.output)
        assertTrue(result.stdout.contains("ExplainPluginClient"))
        assertTrue(result.stdout.contains("client:ExplainPluginClient"))
        assertFalse(project.output.exists())
    }

    @Test
    fun explainReportsProjectedNameAndOriginalReferenceProvenance() {
        val project = referencedFixtureProject()

        val result =
            sdkgenCommand().test(
                "explain ExternalLockProbe --config ${project.config} --format json",
            )

        assertEquals(0, result.statusCode, result.output)
        val document = Json.parseToJsonElement(result.stdout).jsonObject
        val trace =
            document
                .getValue("traces")
                .jsonArray
                .first()
                .jsonObject
        assertEquals(
            "ExternalLockProbe",
            trace
                .getValue("naming")
                .jsonObject
                .getValue("resolved")
                .jsonPrimitive.content,
        )
        assertEquals(
            "/components/schemas/ExternalLockProbe",
            trace
                .getValue("origin")
                .jsonObject
                .getValue("jsonPointer")
                .jsonPrimitive.content,
        )
    }

    @Test
    fun explainIncludesOverlayActionDescendantOfQueriedSymbolPointer() {
        val project = cleanFixtureProject()
        val overlay = project.root.resolve("descendant-overlay.yaml")
        overlay.writeText(
            """
            overlay: 1.1.0
            info:
              title: Descendant action
              version: "1"
            actions:
              - target: "${'$'}['components']['schemas']['ChatRequest']['properties']['message']"
                update:
                  description: overlaid descendant
            """.trimIndent() + "\n",
        )
        project.config.writeText(
            project.config
                .readText()
                .replace(
                    "kotlin:\n",
                    """
                    overlays:
                      - id: descendant
                        uri: descendant-overlay.yaml
                        sha256: ${overlay.sha256()}
                    kotlin:
                    """.trimIndent() + "\n",
                ),
        )

        val result =
            sdkgenCommand().test(
                "explain --pointer '#/components/schemas/ChatRequest' --config ${project.config} --format json",
            )

        assertEquals(0, result.statusCode, result.output)
        val trace =
            Json
                .parseToJsonElement(result.stdout)
                .jsonObject
                .getValue("traces")
                .jsonArray
                .single()
                .jsonObject
        assertEquals(
            "descendant",
            trace
                .getValue("overlays")
                .jsonArray
                .single()
                .jsonObject
                .getValue("id")
                .jsonPrimitive.content,
        )
    }

    @Test
    fun explainPreservesDeclaredOverlayOrder() {
        val project = cleanFixtureProject()
        val zOverlay = project.root.resolve("z-overlay.yaml")
        zOverlay.writeText(
            """
            overlay: 1.1.0
            info:
              title: Z overlay
              version: "1"
            actions:
              - target: "${'$'}['components']['schemas']['ChatRequest']['properties']['message']"
                update:
                  description: z
            """.trimIndent() + "\n",
        )
        val aOverlay = project.root.resolve("a-overlay.yaml")
        aOverlay.writeText(
            """
            overlay: 1.1.0
            info:
              title: A overlay
              version: "1"
            actions:
              - target: "${'$'}['components']['schemas']['ChatRequest']"
                update:
                  description: a
            """.trimIndent() + "\n",
        )
        project.config.writeText(
            project.config
                .readText()
                .replace(
                    "kotlin:\n",
                    """
                    overlays:
                      - id: z
                        uri: z-overlay.yaml
                        sha256: ${zOverlay.sha256()}
                      - id: a
                        uri: a-overlay.yaml
                        sha256: ${aOverlay.sha256()}
                    kotlin:
                    """.trimIndent() + "\n",
                ),
        )

        val result =
            sdkgenCommand().test(
                "explain --pointer '#/components/schemas/ChatRequest' --config ${project.config} --format json",
            )
        val human =
            sdkgenCommand().test(
                "explain --pointer '#/components/schemas/ChatRequest' --config ${project.config} --format human",
            )

        assertEquals(0, result.statusCode, result.output)
        assertEquals(0, human.statusCode, human.output)
        assertTrue(human.stdout.indexOf("z=") < human.stdout.indexOf("a="), human.output)
        val trace =
            Json
                .parseToJsonElement(result.stdout)
                .jsonObject
                .getValue("traces")
                .jsonArray
                .single()
                .jsonObject
        assertEquals(
            listOf("z", "a"),
            trace
                .getValue("overlays")
                .jsonArray
                .map {
                    it.jsonObject
                        .getValue("id")
                        .jsonPrimitive
                        .content
                },
        )
    }

    private fun referencedFixtureProject(): ReferencedFixtureProject {
        val root = Files.createTempDirectory("sdkgen-cli-reference-test")
        val specs = root.resolve("specs").also(Path::createDirectories)
        val source = specs.resolve("openapi.yaml")
        source.writeText(
            """
            openapi: 3.1.0
            info:
              title: Referenced fixture
              version: "1"
            paths:
              /chat:
                get:
                  operationId: chat
                  responses:
                    '204': { description: ok }
            components:
              schemas:
                ExternalLockProbe:
                  ${'$'}ref: 'components.yaml#/components/schemas/Referenced'
            """.trimIndent() + "\n",
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
              properties:
                id:
                  type: string
        """.trimIndent() + "\n"

    private fun semanticWarningFixtureProject(): FixtureProject {
        val project = cleanFixtureProject()
        val source = project.root.resolve("openapi.yaml")
        source.writeText(
            source.readText().trimEnd() +
                "\n" +
                """
                WarningValue:
                  anyOf:
                    - type: string
                    - nullable: true
                """.trimIndent().prependIndent("    ") +
                "\n",
        )
        val overlay = project.root.resolve("overlay.yaml")
        overlay.writeText(
            """
            overlay: 1.1.0
            info:
              title: Semantic warning overlay
              version: "1"
            actions:
              - target: ${'$'}.info
                update:
                  description: overlaid
            """.trimIndent() + "\n",
        )
        project.config.writeText(
            project.config
                .readText()
                .replace(Regex("(?m)^  sha256: [0-9a-f]{64}$"), "  sha256: ${source.sha256()}")
                .replace(
                    "kotlin:\n",
                    """
                    overlays:
                      - id: metadata
                        uri: overlay.yaml
                        sha256: ${overlay.sha256()}
                    kotlin:
                    """.trimIndent() + "\n",
                ),
        )
        return project
    }

    private fun cleanFixtureProject(): FixtureProject {
        val root = Files.createTempDirectory("sdkgen-cli-clean-test")
        val source = root.resolve("openapi.yaml")
        source.writeText(
            """
            openapi: 3.1.0
            info:
              title: Clean fixture
              version: "1"
            paths:
              /chat:
                get:
                  operationId: chat
                  responses:
                    '204': { description: ok }
            components:
              schemas:
                ChatRequest:
                  type: object
                  properties:
                    message:
                      type: string
                ChatUsage:
                  type: object
                  properties:
                    total:
                      type: integer
            """.trimIndent() + "\n",
        )
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
                  - ${root.toString().replace('\\', '/')}
            kotlin:
              packageName: com.nabobery.sdkgen.generated
              coordinates:
                groupId: com.nabobery
                artifactId: clean-generated
              naming:
                clientName: OpenRouterClient
              targets: [jvm]
            runtime:
              requestTimeoutMillis: 60000
            output:
              sources: generated/current
              resources: generated/resources
              manifest: generated/current/manifest.json
              lock: sdkgen.lock
              checkedInSources: true
            """.trimIndent() + "\n",
        )
        root.resolve("generated").createDirectories()
        return FixtureProject(root, config, root.resolve("generated/current"), root.resolve("sdkgen.lock"))
    }

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
