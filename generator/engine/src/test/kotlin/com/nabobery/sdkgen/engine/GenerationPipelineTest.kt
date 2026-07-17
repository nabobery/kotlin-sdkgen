package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.ConfigVersion
import com.nabobery.sdkgen.engine.config.KotlinGenerationConfig
import com.nabobery.sdkgen.engine.config.NamingConfig
import com.nabobery.sdkgen.engine.config.OutputConfig
import com.nabobery.sdkgen.engine.config.OverlayConfig
import com.nabobery.sdkgen.engine.config.PackageCoordinates
import com.nabobery.sdkgen.engine.config.SdkgenConfigV1Alpha1
import com.nabobery.sdkgen.engine.config.SourceConfig
import com.nabobery.sdkgen.engine.config.TargetFamily
import com.nabobery.sdkgen.engine.declarations.DeclarationMappingResult
import com.nabobery.sdkgen.engine.declarations.DeclarationProjection
import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.KotlinDeclarationModel
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import java.util.Locale
import kotlin.io.path.createDirectories
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
    fun realInputGenerationIsGoldenDeterministicLocaleIndependentAndAtomic() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.openRouterFile")))
        val sourceBytes = sourcePath.readBytes()
        val source =
            ResolvedSource(
                sourcePath,
                "sdkgen://openrouter/openapi.yaml",
                sourceBytes.sha256(),
                sourceBytes.size.toLong(),
            )
        val config = config(source.sha256)
        val root = Files.createTempDirectory("sdkgen-pipeline-test")
        val firstOutput = root.resolve("first/current")
        val secondOutput = root.resolve("second/current")
        val pipeline = GenerationPipeline("0.1.0-test")

        val first = pipeline.generate(config, source, emptyList(), firstOutput)
        val second = pipeline.generate(config, source, emptyList(), secondOutput)
        assertEquals(first.snapshotSha256, second.snapshotSha256)
        assertEquals(first.declarationModelSha256, second.declarationModelSha256)
        assertEquals(tree(firstOutput), tree(secondOutput))
        assertEquals(7, first.generatedFiles)
        val clientSource = tree(firstOutput).getValue("com/nabobery/sdkgen/generated/OpenRouterClient.kt")
        assertTrue(clientSource.contains("OperationMetadata"))
        assertTrue(clientSource.contains("KotlinxSerializationCodec"))
        assertTrue(clientSource.contains("sendChatCompletionRequest"))
        println("openrouter-subset-generation-ms=${first.elapsedMillis}")
        assertTrue(first.exclusions.isNotEmpty())
        assertTrue(firstOutput.resolve("manifest.json").readText().contains("\"exclusions\""))

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
            pipeline.generate(config, source, emptyList(), firstOutput, failAfterFiles = 3)
        }
        assertEquals(activeTarget, firstOutput.readSymbolicLink())
        assertEquals(tree(secondOutput), tree(firstOutput))

        verifyGolden(firstOutput)
        val generatedKotlin = tree(firstOutput).filterKeys { it.endsWith(".kt") }.values
        assertFalse(generatedKotlin.any { Regex("\\bAny\\??\\b").containsMatchIn(it) })
        assertFalse(generatedKotlin.any { Regex("^import (java|javax)\\.", RegexOption.MULTILINE).containsMatchIn(it) })
        assertFalse(
            generatedKotlin.any { Regex("io\\.ktor|okhttp|HttpClient", RegexOption.IGNORE_CASE).containsMatchIn(it) },
        )
    }

    @Test
    fun nonOpenRouterDocumentReturnsTypedProjectionDiagnostic() {
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

        assertEquals(
            listOf("SDKGEN-PROJECTION-UNSUPPORTED-DOCUMENT"),
            result.diagnostics.map(GenerationDiagnosticView::code),
        )
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
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.openRouterFile")))
        val sourceBytes = sourcePath.readBytes()
        val source =
            ResolvedSource(
                sourcePath,
                "sdkgen://openrouter/openapi.yaml",
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
              - target: $.components.schemas.ChatRequest
                update:
                  description: Overlaid chat request description
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

        assertTrue(
            tree(
                output,
            ).getValue("com/nabobery/sdkgen/generated/ChatRequest.kt").contains("Overlaid chat request description"),
        )
        val manifest = tree(output).getValue("manifest.json")
        assertTrue(manifest.contains("sdkgen://overlays/proof.yaml"))
        assertTrue(manifest.contains(overlay.sha256))
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
            val document = SemanticAdapter().adapt(effectivePath).document
            assertTrue(document.schemas.keys.any { it.value.endsWith("/components/schemas/Referenced") })
        } finally {
            effectivePath.deleteIfExists()
        }
    }

    private class RecordingProjection : DeclarationProjection {
        var request: DeclarationProjectionRequest? = null

        override fun project(request: DeclarationProjectionRequest): DeclarationMappingResult {
            this.request = request
            return DeclarationMappingResult(KotlinDeclarationModel(emptyList()), emptyList(), emptyList())
        }
    }

    private fun verifyGolden(output: Path) {
        val goldenRoot = Path.of(requireNotNull(System.getProperty("engine.goldenRoot")))
        val consumerRoot = Path.of(requireNotNull(System.getProperty("engine.consumerSourceRoot")))
        if (System.getenv("UPDATE_EMISSION_GOLDENS") == "1") {
            tree(output).filterKeys { it.endsWith(".kt") }.forEach { (relative, text) ->
                goldenRoot.resolve(relative).also { requireNotNull(it.parent).createDirectories() }.writeText(text)
                consumerRoot.resolve(relative).also { requireNotNull(it.parent).createDirectories() }.writeText(text)
            }
        }
        val expected = tree(goldenRoot)
        val consumer = tree(consumerRoot)
        val actual = tree(output).filterKeys { it.endsWith(".kt") }
        assertTrue(expected.isNotEmpty(), "missing OpenRouter-derived emission goldens")
        assertEquals(expected, actual)
        assertEquals(expected, consumer)
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
