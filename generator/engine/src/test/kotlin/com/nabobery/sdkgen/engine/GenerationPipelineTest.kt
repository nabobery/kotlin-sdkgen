@file:OptIn(com.nabobery.sdkgen.engine.spi.ExperimentalSdkGenApi::class)

package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.AcceptedWaiverConfig
import com.nabobery.sdkgen.engine.config.ConfigVersion
import com.nabobery.sdkgen.engine.config.DiagnosticsConfig
import com.nabobery.sdkgen.engine.config.KotlinGenerationConfig
import com.nabobery.sdkgen.engine.config.NamingConfig
import com.nabobery.sdkgen.engine.config.OutputConfig
import com.nabobery.sdkgen.engine.config.OverlayConfig
import com.nabobery.sdkgen.engine.config.PackageCoordinates
import com.nabobery.sdkgen.engine.config.PluginConfig
import com.nabobery.sdkgen.engine.config.RuntimeDefaults
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SourceConfig
import com.nabobery.sdkgen.engine.config.TargetFamily
import com.nabobery.sdkgen.engine.config.VerificationConfig
import com.nabobery.sdkgen.engine.config.WaivedSymbolKind
import com.nabobery.sdkgen.engine.config.WaiverDisposition
import com.nabobery.sdkgen.engine.config.WaiverMatchConfig
import com.nabobery.sdkgen.engine.declarations.DeclarationMappingResult
import com.nabobery.sdkgen.engine.declarations.DeclarationProjection
import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.GenerationDiagnostic
import com.nabobery.sdkgen.engine.declarations.GenerationDiagnosticCode
import com.nabobery.sdkgen.engine.declarations.GenerationExclusion
import com.nabobery.sdkgen.engine.declarations.GenerationExclusionKind
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.engine.emit.EmittedSources
import com.nabobery.sdkgen.engine.emit.KotlinEmitter
import com.nabobery.sdkgen.engine.spi.DeclarationAugmentation
import com.nabobery.sdkgen.engine.spi.DeclarationAugmentationPhaseValue
import com.nabobery.sdkgen.engine.spi.DeclarationAugmentationPlugin
import com.nabobery.sdkgen.engine.spi.NamingTypeMappingPhaseValue
import com.nabobery.sdkgen.engine.spi.NamingTypeMappingPlugin
import com.nabobery.sdkgen.engine.spi.PluginContext
import com.nabobery.sdkgen.engine.spi.PluginDescriptor
import com.nabobery.sdkgen.engine.spi.PluginPhaseResult
import com.nabobery.sdkgen.engine.spi.SdkGenPluginEngine
import com.nabobery.sdkgen.engine.spi.SdkGenPluginPhase
import com.nabobery.sdkgen.engine.spi.SdkGenPluginRegistry
import com.nabobery.sdkgen.engine.spi.SemanticTransformPhaseValue
import com.nabobery.sdkgen.engine.spi.SemanticTransformPlugin
import com.nabobery.sdkgen.engine.spi.ValidationPhaseValue
import com.nabobery.sdkgen.engine.spi.ValidationPlugin
import com.nabobery.sdkgen.model.DiagnosticSeverity
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import java.util.Locale
import kotlin.io.path.deleteIfExists
import kotlin.io.path.exists
import kotlin.io.path.isSymbolicLink
import kotlin.io.path.readBytes
import kotlin.io.path.readSymbolicLink
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GenerationPipelineTest {
    @Test
    fun basicInputGenerationIsGoldenDeterministicLocaleIndependentAndAtomic() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val sourceBytes = sourcePath.readBytes()
        val source =
            ResolvedSource(
                sourcePath,
                "sdkgen://fixtures/basic-openapi.yaml",
                sourceBytes.sha256(),
                sourceBytes.size.toLong(),
            )
        val config = config(source.sha256)
        val root = Files.createTempDirectory("sdkgen-pipeline-test")
        val firstOutput = root.resolve("first/current")
        val secondOutput = root.resolve("second/current")
        val firstProjection = root.resolve("first/kotlin-api.json")
        val pipeline = GenerationPipeline("0.1.0-test")

        val first =
            pipeline.generate(
                config,
                source,
                emptyList(),
                firstOutput,
                publicApiProjectionDestination = firstProjection,
            )
        val second = pipeline.generate(config, source, emptyList(), secondOutput)
        assertEquals(first.snapshotSha256, second.snapshotSha256)
        assertEquals(first.declarationModelSha256, second.declarationModelSha256)
        assertEquals(tree(firstOutput), tree(secondOutput))
        assertTrue(first.generatedFiles > 1)
        val generatedTree = tree(firstOutput)
        assertTrue(generatedTree.keys.any { it.endsWith("/OpenRouterClient.kt") })
        // Task T3 partitions the client by tag/resource: OpenRouterClient.kt is now a thin facade exposing
        // each sub-client as a lazily-initialized property, while "/chat" (untagged, falls back to its first
        // path segment) is emitted into its own chat/ChatClient.kt sub-client file.
        val facadeSource = generatedTree.getValue("com/nabobery/sdkgen/generated/OpenRouterClient.kt")
        assertTrue(facadeSource.contains("public val chat: ChatClient"))
        assertTrue(facadeSource.contains("by lazy"))
        val clientSource = generatedTree.getValue("com/nabobery/sdkgen/generated/chat/ChatClient.kt")
        assertTrue(clientSource.contains("OperationMetadata"))
        assertTrue(clientSource.contains("emptyList()"))
        assertTrue(!clientSource.contains("Unit.serializer()"))
        assertTrue(first.diagnostics.isEmpty())
        assertTrue(first.exclusions.isEmpty())
        assertTrue(firstOutput.resolve("manifest.json").readText().contains("\"exclusions\""))
        val projectionText = firstProjection.readText()
        assertTrue(projectionText.contains("\"schemaVersion\": \"kotlin-public-api/v2\""))
        assertTrue(projectionText.contains(first.declarationModelSha256))
        assertTrue(projectionText.contains("\"files\""))

        val previousLocale = Locale.getDefault()
        try {
            Locale.setDefault(Locale.forLanguageTag("tr-TR"))
            val turkishOutput = root.resolve("turkish/current")
            val turkish = pipeline.generate(config, source, emptyList(), turkishOutput)
            assertEquals(first.snapshotSha256, turkish.snapshotSha256)
            assertEquals(tree(firstOutput), tree(turkishOutput))
        } finally {
            Locale.setDefault(previousLocale)
        }

        val activeTarget = firstOutput.readSymbolicLink()
        assertFailsWith<IllegalStateException> {
            pipeline.generate(config, source, emptyList(), firstOutput, failAfterFiles = 1)
        }
        assertEquals(activeTarget, firstOutput.readSymbolicLink())
        assertEquals(tree(secondOutput), tree(firstOutput))

        val generatedKotlin = tree(firstOutput).filterKeys { it.endsWith(".kt") }.values
        assertFalse(generatedKotlin.any { Regex("<Any\\b|, Any\\b|Any\\?\\b").containsMatchIn(it) })
        assertFalse(generatedKotlin.any { Regex("^import (java|javax)\\.", RegexOption.MULTILINE).containsMatchIn(it) })
        assertFalse(
            generatedKotlin.any { Regex("io\\.ktor|okhttp|HttpClient", RegexOption.IGNORE_CASE).containsMatchIn(it) },
        )
    }

    @Test
    fun defaultProjectionAcceptsANonOpenRouterDocument() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val sourceBytes = sourcePath.readBytes()
        val source =
            ResolvedSource(
                sourcePath,
                "sdkgen://fixtures/basic-openapi.yaml",
                sourceBytes.sha256(),
                sourceBytes.size.toLong(),
            )

        val result = GenerationPipeline("0.1.0-test").validate(config(source.sha256), source, emptyList())

        assertTrue(result.diagnostics.isEmpty())
        assertTrue(result.exclusions.isEmpty())
    }

    @Test
    fun kotlinApiProjectionCannotOverwriteGeneratedOutput() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val sourceBytes = sourcePath.readBytes()
        val source =
            ResolvedSource(
                sourcePath,
                "sdkgen://fixtures/basic-openapi.yaml",
                sourceBytes.sha256(),
                sourceBytes.size.toLong(),
            )
        val output = Files.createTempDirectory("sdkgen-projection-collision").resolve("current")
        val pipeline = GenerationPipeline("0.1.0-test")
        pipeline.generate(config(source.sha256), source, emptyList(), output)
        val manifestBefore = output.resolve("manifest.json").readText()

        val failure =
            assertFailsWith<IllegalArgumentException> {
                pipeline.generate(
                    config(source.sha256),
                    source,
                    emptyList(),
                    output,
                    publicApiProjectionDestination = output.resolve("manifest.json"),
                )
            }

        assertTrue(failure.message.orEmpty().contains("outside the generated output tree"))
        assertEquals(manifestBefore, output.resolve("manifest.json").readText())

        val outputAlias = output.parent.resolve("output-alias")
        Files.createSymbolicLink(outputAlias, output)
        val aliasFailure =
            assertFailsWith<IllegalArgumentException> {
                pipeline.generate(
                    config(source.sha256),
                    source,
                    emptyList(),
                    output,
                    publicApiProjectionDestination = outputAlias.resolve("projection.json"),
                )
            }

        assertTrue(aliasFailure.message.orEmpty().contains("outside the generated output tree"))
        assertEquals(manifestBefore, output.resolve("manifest.json").readText())
    }

    @Test
    fun publicResultAndConfigTypesRetainPriorJvmConstructorDescriptors() {
        SdkgenConfigV1Alpha1::class.java.getConstructor(
            ConfigVersion::class.java,
            SourceConfig::class.java,
            List::class.java,
            List::class.java,
            KotlinGenerationConfig::class.java,
            RuntimeDefaults::class.java,
            List::class.java,
            List::class.java,
            OutputConfig::class.java,
            DiagnosticsConfig::class.java,
            VerificationConfig::class.java,
        )
        GenerationExclusionView::class.java.getConstructor(
            String::class.java,
            String::class.java,
            String::class.java,
            String::class.java,
        )
        ValidationResult::class.java.getConstructor(List::class.java, List::class.java)
        GenerationResult::class.java.getConstructor(
            String::class.java,
            String::class.java,
            Path::class.java,
            Int::class.javaPrimitiveType,
            Long::class.javaPrimitiveType,
            List::class.java,
            List::class.java,
            Long::class.javaPrimitiveType,
        )
    }

    @Test
    fun generateRefusesBlockingDiagnosticsAndExclusionsBeforePublishing() {
        val source = basicSource()
        val root = Files.createTempDirectory("sdkgen-blocked-generation")
        val output = root.resolve("current")
        val lock = GenerationLockPublication(root.resolve("sdkgen.lock"), "lock\n")
        val config =
            config(source.sha256).copy(
                diagnostics = DiagnosticsConfig(warningsAsErrors = true),
            )

        val failure =
            assertFailsWith<GenerationBlockedException> {
                GenerationPipeline(
                    "0.1.0-test",
                    projection = DecoratedProjection(warning = true, exclusionSymbol = "operation:not-emitted"),
                ).generate(config, source, emptyList(), output, lock = lock)
            }

        assertTrue(
            failure.validation.diagnostics.any {
                it.code == "SDKGEN-TEST-WARNING" && it.severity == DiagnosticSeverity.ERROR
            },
        )
        assertEquals(
            listOf("operation:not-emitted"),
            failure.validation.exclusions.map(GenerationExclusionView::symbolId),
        )
        assertFalse(output.exists())
        assertFalse(lock.destination.exists())
        assertFalse(root.resolve(".snapshots").exists())

        val exclusionOnlyOutput = root.resolve("exclusion-only")
        val exclusionFailure =
            assertFailsWith<GenerationBlockedException> {
                GenerationPipeline(
                    "0.1.0-test",
                    projection = DecoratedProjection(exclusionSymbol = "operation:not-emitted"),
                ).generate(config(source.sha256), source, emptyList(), exclusionOnlyOutput, lock = lock)
            }
        assertTrue(exclusionFailure.validation.diagnostics.isEmpty())
        assertEquals(
            listOf("operation:not-emitted"),
            exclusionFailure.validation.exclusions.map { it.symbolId },
        )
        assertFalse(exclusionOnlyOutput.exists())
        assertFalse(lock.destination.exists())
        assertFalse(root.resolve(".snapshots").exists())
    }

    @Test
    fun blockedGenerationRetainsAcceptedAndStaleWaiverAuditViews() {
        val source = basicSource()
        val pipeline =
            GenerationPipeline(
                "0.1.0-test",
                projection = DecoratedProjection(exclusionSymbols = listOf("schema:accepted", "schema:active")),
            )
        val baseline = pipeline.validate(config(source.sha256), source, emptyList())
        val accepted = baseline.exclusions.single { exclusion -> exclusion.symbolId == "schema:accepted" }
        val acceptedWaiver =
            AcceptedWaiverConfig(
                id = "accepted-test-exclusion",
                category = "test-waiver",
                match =
                    WaiverMatchConfig(
                        kind = WaivedSymbolKind.SCHEMA,
                        symbolId = accepted.symbolId,
                        diagnosticCode = accepted.diagnosticCode,
                        documentUri = accepted.documentUri,
                        jsonPointer = accepted.jsonPointer,
                        reasonSha256 = accepted.reasonSha256,
                    ),
                rationale = "Audit result view regression.",
                owner = "engine-test",
                disposition = WaiverDisposition.OMIT,
            )
        val mixedConfig = config(source.sha256).copy(acceptedWaivers = listOf(acceptedWaiver))
        val mixedValidation = pipeline.validate(mixedConfig, source, emptyList())
        val mixedFailure =
            assertFailsWith<GenerationBlockedException> {
                pipeline.generate(
                    mixedConfig,
                    source,
                    emptyList(),
                    Files.createTempDirectory("sdkgen-waiver-mixed").resolve("out"),
                )
            }
        assertEquals(mixedValidation.acceptedWaivers, mixedFailure.validation.acceptedWaivers)
        assertEquals(mixedValidation.exclusions, mixedFailure.validation.exclusions)

        val staleConfig =
            mixedConfig.copy(
                acceptedWaivers =
                    listOf(
                        acceptedWaiver.copy(match = acceptedWaiver.match.copy(reasonSha256 = "0".repeat(64))),
                    ),
            )
        val staleValidation = pipeline.validate(staleConfig, source, emptyList())
        val staleFailure =
            assertFailsWith<GenerationBlockedException> {
                pipeline.generate(
                    staleConfig,
                    source,
                    emptyList(),
                    Files.createTempDirectory("sdkgen-waiver-stale").resolve("out"),
                )
            }
        assertTrue(staleValidation.acceptedWaivers.isEmpty())
        assertTrue(staleValidation.diagnostics.any { it.code == "SDKGEN-WAIVER-STALE" })
        assertEquals(staleValidation, staleFailure.validation)
    }

    @Test
    fun invalidDeclarationAugmentationsBlockBeforeRendering() {
        val source = basicSource()
        val config =
            config(source.sha256).copy(
                plugins = listOf(PluginConfig("collision", "0.1.0", ">=0.1 <0.2")),
            )
        var rendered = false
        val pipeline =
            GenerationPipeline(
                "0.1.0-test",
                projection = StandardProjection(),
                emitter =
                    KotlinEmitter {
                        rendered = true
                        EmittedSources(files = emptyList(), publicApiProjection = "{}")
                    },
                pluginEngine =
                    SdkGenPluginEngine(
                        SdkGenPluginRegistry(listOf(CollidingPipelinePlugin)),
                    ),
            )

        val failure =
            assertFailsWith<GenerationBlockedException> {
                pipeline.generate(
                    config,
                    source,
                    emptyList(),
                    Files.createTempDirectory("sdkgen-invalid-augmentation").resolve("current"),
                )
            }

        assertFalse(rendered)
        assertTrue(failure.validation.diagnostics.any { it.code == "SDKGEN-PLUGIN-NAME-COLLISION" })
    }

    @Test
    fun emittedOperationsAreNotReportedAsExclusions() {
        val source = basicSource()
        val config = config(source.sha256)
        val pipeline =
            GenerationPipeline(
                "0.1.0-test",
                projection = DecoratedProjection(exclusionSymbol = "operation:chat"),
            )

        val validation = pipeline.validate(config, source, emptyList())
        assertTrue(validation.exclusions.isEmpty())
        val output = Files.createTempDirectory("sdkgen-emitted-operation").resolve("current")
        val result = pipeline.generate(config, source, emptyList(), output)
        assertTrue(result.exclusions.isEmpty())
    }

    @Test
    fun warningsAsErrorsEscalatesWarningsUnlessAllowlistedForValidateAndGenerate() {
        val source = basicSource()
        val root = Files.createTempDirectory("sdkgen-warning-policy")
        val escalatedConfig =
            config(source.sha256).copy(
                diagnostics = DiagnosticsConfig(warningsAsErrors = true),
            )
        val escalatedPipeline =
            GenerationPipeline("0.1.0-test", projection = DecoratedProjection(warning = true))

        val escalatedValidation = escalatedPipeline.validate(escalatedConfig, source, emptyList())
        assertEquals(DiagnosticSeverity.ERROR, escalatedValidation.diagnostics.single().severity)
        assertFailsWith<GenerationBlockedException> {
            escalatedPipeline.generate(escalatedConfig, source, emptyList(), root.resolve("escalated"))
        }

        val allowlistedConfig =
            escalatedConfig.copy(
                diagnostics =
                    DiagnosticsConfig(
                        warningsAsErrors = true,
                        warningAllowlist = listOf("SDKGEN-TEST-WARNING"),
                    ),
            )
        val allowlistedPipeline =
            GenerationPipeline("0.1.0-test", projection = DecoratedProjection(warning = true))
        val allowlistedValidation = allowlistedPipeline.validate(allowlistedConfig, source, emptyList())
        assertEquals(DiagnosticSeverity.WARNING, allowlistedValidation.diagnostics.single().severity)
        val result = allowlistedPipeline.generate(allowlistedConfig, source, emptyList(), root.resolve("allowlisted"))
        assertEquals(DiagnosticSeverity.WARNING, result.diagnostics.single().severity)
    }

    @Test
    fun semanticDiagnosticsAndOperationExclusionsReachValidationWithLocationAndSeverity() {
        val sourcePath = Files.createTempFile("sdkgen-invalid-extension-", ".yaml")
        sourcePath.writeText(
            """
            openapi: 3.1.0
            info: { title: Invalid extension, version: "1" }
            paths:
              /items:
                get:
                  operationId: listItems
                  x-sdkgen-pagination:
                    style: cursor
                    requestCursor: cursor
                    responseItems: data
                    responseNextCursor: /next
                  responses:
                    '200': { description: ok }
            """.trimIndent() + "\n",
        )
        val bytes = sourcePath.readBytes()
        val source =
            ResolvedSource(sourcePath, "sdkgen://fixtures/invalid-extension", bytes.sha256(), bytes.size.toLong())

        val result = GenerationPipeline("0.1.0-test").validate(config(source.sha256), source, emptyList())

        val diagnostic = result.diagnostics.single { it.code == "SDKGEN-INVALID-CANONICAL-EXTENSION" }
        assertEquals(com.nabobery.sdkgen.model.DiagnosticSeverity.ERROR, diagnostic.severity)
        assertTrue(diagnostic.location.line > 0)
        assertTrue(diagnostic.location.column > 0)
        assertEquals("/paths/~1items/get/x-sdkgen-pagination/responseItems", diagnostic.jsonPointer)
        assertEquals(listOf("operation:listItems"), result.exclusions.map { it.symbolId })
    }

    @Test
    fun injectedDeclarationProjectionIsUsed() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val sourceBytes = sourcePath.readBytes()
        val source =
            ResolvedSource(
                sourcePath,
                "sdkgen://fixtures/basic-openapi.yaml",
                sourceBytes.sha256(),
                sourceBytes.size.toLong(),
            )
        val projection = RecordingProjection()

        val result =
            GenerationPipeline("0.1.0-test", projection = projection)
                .validate(config(source.sha256), source, emptyList())

        assertTrue(projection.request != null)
        assertTrue(result.diagnostics.isEmpty())
    }

    @Test
    fun orderedOverlaysFeedTheSemanticModelAndManifest() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val sourceBytes = sourcePath.readBytes()
        val source =
            ResolvedSource(
                sourcePath,
                "sdkgen://fixtures/basic-openapi.yaml",
                sourceBytes.sha256(),
                sourceBytes.size.toLong(),
            )
        val overlayPath = Files.createTempFile("sdkgen-overlay-", ".yaml")
        overlayPath.writeText(
            """
            overlay: 1.1.0
            info:
              title: Integration proof
              version: "1"
            actions:
              - target: $.paths['/chat'].post
                update:
                  description: Overlaid chat operation description
            """.trimIndent(),
        )
        val overlayBytes = overlayPath.readBytes()
        val overlay =
            ResolvedGenerationOverlay("proof", overlayPath, "sdkgen://overlays/proof.yaml", overlayBytes.sha256())
        val config =
            config(
                source.sha256,
            ).copy(overlays = listOf(OverlayConfig("proof", overlay.canonicalUri, overlay.sha256)))
        val output = Files.createTempDirectory("sdkgen-overlay-output").resolve("current")

        GenerationPipeline("0.1.0-test").generate(config, source, listOf(overlay), output)

        // "/chat" has no operation tag, so it falls back to its first path segment: the "chat" sub-client
        // (task T3 partitions the client by tag/resource, so the method itself lives in ChatClient.kt, not
        // the root OpenRouterClient.kt facade).
        assertTrue(
            tree(
                output,
            ).getValue("com/nabobery/sdkgen/generated/chat/ChatClient.kt")
                .contains("Overlaid chat operation description"),
        )
        val manifest = tree(output).getValue("manifest.json")
        assertTrue(manifest.contains("sdkgen://overlays/proof.yaml"))
        assertTrue(manifest.contains(overlay.sha256))
    }

    @Test
    fun overlayEffectiveSourceUrisAreStableInDiagnosticsAndExclusions() {
        val source = basicSource()
        val overlayPath = Files.createTempFile("sdkgen-overlay-source-", ".yaml")
        overlayPath.writeText(
            """
            overlay: 1.1.0
            info:
              title: Source URI proof
              version: "1"
            actions:
              - target: ${'$'}.info
                update:
                  description: overlaid
            """.trimIndent() + "\n",
        )
        val overlayBytes = overlayPath.readBytes()
        val overlay =
            ResolvedGenerationOverlay("proof", overlayPath, "sdkgen://overlay/proof", overlayBytes.sha256())
        val configured =
            config(source.sha256).copy(overlays = listOf(OverlayConfig("proof", overlay.canonicalUri, overlay.sha256)))

        val pipeline =
            GenerationPipeline(
                "0.1.0-test",
                projection = DecoratedProjection(warning = true, exclusionSymbol = "operation:not-emitted"),
            )
        val validation = pipeline.validate(configured, source, listOf(overlay))
        val analysis = pipeline.analyze(configured, source, listOf(overlay))

        assertEquals(
            source.canonicalUri,
            validation.diagnostics.single { it.code == "SDKGEN-TEST-WARNING" }.documentUri,
        )
        assertEquals(source.canonicalUri, validation.exclusions.single().documentUri)
        assertEquals(
            source.canonicalUri,
            analysis.validation.diagnostics
                .single()
                .documentUri,
        )
        assertEquals(
            source.canonicalUri,
            analysis.validation.exclusions
                .single()
                .documentUri,
        )
        assertFalse(analysis.validation.diagnostics.any { it.documentUri.contains(".sdkgen-effective-") })
        assertFalse(analysis.validation.exclusions.any { it.documentUri.contains(".sdkgen-effective-") })
    }

    @Test
    fun repeatedOverlayGenerationWithDiagnosticsIsDeterministic() {
        val source = basicSource()
        val overlayPath = Files.createTempFile("sdkgen-overlay-determinism-", ".yaml")
        overlayPath.writeText(
            """
            overlay: 1.1.0
            info:
              title: Determinism proof
              version: "1"
            actions:
              - target: ${'$'}.info
                update:
                  description: overlaid
            """.trimIndent() + "\n",
        )
        val overlayBytes = overlayPath.readBytes()
        val overlay =
            ResolvedGenerationOverlay("proof", overlayPath, "sdkgen://overlay/proof", overlayBytes.sha256())
        val configured =
            config(source.sha256).copy(overlays = listOf(OverlayConfig("proof", overlay.canonicalUri, overlay.sha256)))
        val root = Files.createTempDirectory("sdkgen-overlay-determinism-output-")
        val pipeline =
            GenerationPipeline("0.1.0-test", projection = DecoratedProjection(warning = true))

        val first =
            pipeline.generate(configured, source, listOf(overlay), root.resolve("first/current"))
        val second =
            pipeline.generate(configured, source, listOf(overlay), root.resolve("second/current"))

        assertEquals(first.snapshotSha256, second.snapshotSha256)
        assertEquals(tree(first.output), tree(second.output))
        assertEquals(source.canonicalUri, first.diagnostics.single().documentUri)
        val manifest = tree(first.output).getValue("manifest.json")
        assertTrue(manifest.contains(source.canonicalUri))
        assertFalse(manifest.contains(".sdkgen-effective-"))
    }

    @Test
    fun overlaidEffectiveSourceKeepsRelativeReferenceBase() {
        val sourceRoot = Files.createTempDirectory("sdkgen-relative-ref-")
        val sourcePath = sourceRoot.resolve("openapi.yaml")
        sourcePath.writeText(
            """
            openapi: 3.1.0
            info:
              title: Relative reference
              version: "1"
            paths: {}
            components:
              schemas:
                Root:
                  ${'$'}ref: 'components.yaml#/components/schemas/Referenced'
            """.trimIndent() + "\n",
        )
        sourceRoot.resolve("components.yaml").writeText(
            """
            components:
              schemas:
                Referenced:
                  type: object
            """.trimIndent() + "\n",
        )
        val sourceBytes = sourcePath.readBytes()
        val source =
            ResolvedSource(sourcePath, "sdkgen://source/openapi.yaml", sourceBytes.sha256(), sourceBytes.size.toLong())
        val overlayPath = sourceRoot.resolve("overlay.yaml")
        overlayPath.writeText(
            """
            overlay: 1.1.0
            info:
              title: Relative reference proof
              version: "1"
            actions:
              - target: ${'$'}.info
                update:
                  description: overlaid
            """.trimIndent() + "\n",
        )
        val overlayBytes = overlayPath.readBytes()
        val overlay = ResolvedGenerationOverlay("proof", overlayPath, "sdkgen://overlay/proof", overlayBytes.sha256())
        val configured =
            config(
                source.sha256,
            ).copy(overlays = listOf(OverlayConfig("proof", overlay.canonicalUri, overlay.sha256)))

        val effectivePath = materializeEffectiveSource(configured, source, listOf(overlay))
        try {
            val document =
                SemanticAdapter()
                    .adapt(effectivePath, rootCanonicalUri = source.canonicalUri)
                    .document
            assertEquals(source.canonicalUri, document.documentUri)
            assertTrue(document.schemas.keys.any { it.value.endsWith("/components/schemas/Referenced") })
        } finally {
            effectivePath.deleteIfExists()
        }
    }

    @Test
    fun analyzeUsesSemanticNamingAndDeclarationPluginsWithoutRendering() {
        val source = basicSource()
        val config =
            config(source.sha256).copy(
                plugins = listOf(PluginConfig("analyze-plugin", "0.1.0", ">=0.1 <0.2")),
            )
        var rendered = false
        val pipeline =
            GenerationPipeline(
                "0.1.0-test",
                projection = StandardProjection(),
                emitter =
                    KotlinEmitter {
                        rendered = true
                        EmittedSources(files = emptyList(), publicApiProjection = "{}")
                    },
                pluginEngine = SdkGenPluginEngine(SdkGenPluginRegistry(listOf(AnalyzePipelinePlugin))),
            )

        val analysis = pipeline.analyze(config, source, emptyList())

        assertFalse(rendered)
        assertTrue(
            analysis.validation.diagnostics.any {
                it.code == "SDKGEN-PLUGIN-ANALYZE-WARNING" &&
                    it.message.contains("analyze plugin warning") &&
                    it.pluginPhase == SdkGenPluginPhase.VALIDATION
            },
        )
        assertTrue(
            analysis.symbols.any {
                it.symbolId == "client:AnalyzedClient" && it.resolvedName == "PluginRenamedClient"
            },
        )
        val operation = analysis.symbols.single { it.symbolId == "operation:transformedOperation" }
        assertTrue(operation.resolvedName.contains("transformedOperation", ignoreCase = true))
        assertEquals(source.canonicalUri, operation.origin.documentUri)
        assertTrue(operation.origin.jsonPointer.startsWith("/paths/"))
    }

    private object AnalyzePipelinePlugin :
        ValidationPlugin,
        SemanticTransformPlugin,
        NamingTypeMappingPlugin,
        DeclarationAugmentationPlugin {
        override val descriptor =
            PluginDescriptor(
                id = "analyze-plugin",
                version = "0.1.0",
                spiRange = ">=0.1 <0.2",
                phases =
                    listOf(
                        SdkGenPluginPhase.VALIDATION,
                        SdkGenPluginPhase.SEMANTIC_TRANSFORM,
                        SdkGenPluginPhase.NAMING_TYPE_MAPPING,
                        SdkGenPluginPhase.DECLARATION_AUGMENTATION,
                    ),
            )

        override fun validate(
            input: ValidationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<ValidationPhaseValue> =
            PluginPhaseResult.Applied(
                input.copy(
                    diagnostics =
                        input.diagnostics +
                            context.diagnostic(
                                code = "ANALYZE-WARNING",
                                phase = SdkGenPluginPhase.VALIDATION,
                                message = "analyze plugin warning",
                                remediation = "Keep the analyze plugin configured.",
                                severity = DiagnosticSeverity.WARNING,
                            ),
                ),
            )

        override fun transformSemantic(
            input: SemanticTransformPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<SemanticTransformPhaseValue> =
            PluginPhaseResult.Applied(
                input.copy(
                    document =
                        input.document.copy(
                            operations =
                                input.document.operations.map { operation ->
                                    operation.copy(operationId = "transformedOperation")
                                },
                        ),
                ),
            )

        override fun mapNamesAndTypes(
            input: NamingTypeMappingPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<NamingTypeMappingPhaseValue> =
            PluginPhaseResult.Applied(
                input.copy(
                    clientName = "AnalyzedClient",
                    modelPrefix = "Analyzed",
                    operationPrefix = "plugin",
                ),
            )

        override fun augmentDeclarations(
            input: DeclarationAugmentationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<DeclarationAugmentationPhaseValue> {
            val client = input.declarations.first { it.symbolId.startsWith("client:") }
            return PluginPhaseResult.Applied(
                input.copy(
                    augmentations =
                        input.augmentations +
                            DeclarationAugmentation(
                                symbolId = client.symbolId,
                                resolvedName = "PluginRenamedClient",
                                source = context.source,
                            ),
                ),
            )
        }
    }

    private object CollidingPipelinePlugin : DeclarationAugmentationPlugin {
        override val descriptor =
            PluginDescriptor(
                "collision",
                "0.1.0",
                ">=0.1 <0.2",
                listOf(SdkGenPluginPhase.DECLARATION_AUGMENTATION),
            )

        override fun augmentDeclarations(
            input: DeclarationAugmentationPhaseValue,
            context: PluginContext,
        ): PluginPhaseResult<DeclarationAugmentationPhaseValue> {
            // Rename the root client facade to collide with the support declaration that shares its package:
            // picking by symbolId identity (rather than list position) keeps this deterministic regardless of
            // how many per-tag/resource sub-client declarations the projection also produces (task T3).
            val facade = input.declarations.first { declaration -> declaration.symbolId == "client:OpenRouterClient" }
            val support = input.declarations.first { declaration -> declaration.symbolId == "support:serialization" }
            return PluginPhaseResult.Applied(
                input.copy(
                    augmentations =
                        listOf(
                            DeclarationAugmentation(
                                symbolId = facade.symbolId,
                                resolvedName = support.resolvedName,
                                source = context.source,
                            ),
                        ),
                ),
            )
        }
    }

    private class RecordingProjection : DeclarationProjection {
        var request: DeclarationProjectionRequest? = null

        override fun project(request: DeclarationProjectionRequest): DeclarationMappingResult {
            this.request = request
            return DeclarationMappingResult(KotlinDeclarationModel(emptyList()), emptyList(), emptyList())
        }
    }

    private class DecoratedProjection(
        private val warning: Boolean = false,
        private val exclusionSymbol: String? = null,
        private val exclusionSymbols: List<String> = emptyList(),
    ) : DeclarationProjection {
        override fun project(request: DeclarationProjectionRequest): DeclarationMappingResult {
            val result = StandardProjection().project(request)
            val source =
                request.document.operations
                    .single()
                    .source
            val diagnostic =
                if (warning) {
                    GenerationDiagnostic(
                        code = GenerationDiagnosticCode.SEMANTIC,
                        message = "Test warning",
                        source = source,
                        symbolId = "document:test",
                        sourceCode = "SDKGEN-TEST-WARNING",
                        severity = DiagnosticSeverity.WARNING,
                    )
                } else {
                    null
                }
            val exclusions =
                (listOfNotNull(exclusionSymbol) + exclusionSymbols).map { symbolId ->
                    GenerationExclusion(
                        kind = GenerationExclusionKind.SCHEMA,
                        symbolId = symbolId,
                        diagnosticCode = GenerationDiagnosticCode.UNREPRESENTABLE_SCHEMA.wireCode,
                        reason = "Test exclusion",
                        source = source,
                    )
                }
            return DeclarationMappingResult(
                model = result.model,
                diagnostics = result.diagnostics + listOfNotNull(diagnostic),
                exclusions = result.exclusions + exclusions,
            )
        }
    }

    private fun basicSource(): ResolvedSource {
        val path = Path.of(requireNotNull(System.getProperty("engine.basicOpenApiFile")))
        val bytes = path.readBytes()
        return ResolvedSource(
            path,
            "sdkgen://fixtures/basic-openapi.yaml",
            bytes.sha256(),
            bytes.size.toLong(),
        )
    }

    private fun config(sourceSha256: String): SdkgenConfigV1Alpha1 =
        SdkgenConfigV1Alpha1(
            version = ConfigVersion.V1_ALPHA_1,
            source = SourceConfig(uri = "sdkgen://openrouter/openapi.yaml", sha256 = sourceSha256),
            kotlin =
                KotlinGenerationConfig(
                    packageName = "com.nabobery.sdkgen.generated",
                    coordinates = PackageCoordinates("com.nabobery", "openrouter-generated"),
                    naming = NamingConfig(clientName = "OpenRouterClient"),
                    targets = listOf(TargetFamily.JVM, TargetFamily.JS, TargetFamily.MACOS),
                ),
            output = OutputConfig("generated", "resources", "manifest.json"),
        )

    private fun tree(root: Path): Map<String, String> {
        if (!root.exists()) return emptyMap()
        val resolvedRoot = if (root.isSymbolicLink()) root.parent.resolve(root.readSymbolicLink()).normalize() else root
        return Files.walk(resolvedRoot).use { paths ->
            paths.filter(Files::isRegularFile).sorted().toList().associate { path ->
                resolvedRoot.relativize(path).toString().replace('\\', '/') to path.readText()
            }
        }
    }
}

private fun ByteArray.sha256(): String =
    MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }
