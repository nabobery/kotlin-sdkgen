package com.nabobery.sdkgen.engine

import com.nabobery.sdkgen.engine.config.ConfigLoader
import com.nabobery.sdkgen.engine.declarations.DeclarationProjectionRequest
import com.nabobery.sdkgen.engine.declarations.KotlinFileDeclaration
import com.nabobery.sdkgen.engine.declarations.ModelDeclaration
import com.nabobery.sdkgen.engine.declarations.StandardProjection
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Files
import java.nio.file.Path
import java.security.MessageDigest
import kotlin.io.path.readBytes
import kotlin.io.path.readText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class OpenRouterTokenizerContractTest {
    @Test
    fun fullSpecCompatibilityOverlayProjectsArchitectureTokenizerAsRequiredNullable() {
        val sourcePath = Path.of(requireNotNull(System.getProperty("engine.openRouterFile")))
        val sourceBytes = sourcePath.readBytes()
        val source =
            ResolvedSource(
                path = sourcePath,
                canonicalUri = CANONICAL_URI,
                sha256 = sourceBytes.sha256(),
                contentLength = sourceBytes.size.toLong(),
            )
        val configPath = sourcePath.parent.resolve("sdkgen.yaml")
        val config = ConfigLoader.decodeYaml(configPath.readText(), configPath.toString())
        val overlayPath = sourcePath.parent.resolve("overlays/full-spec-compat.yaml")
        val overlayBytes = overlayPath.readBytes()
        val overlays =
            listOf(
                ResolvedGenerationOverlay(
                    id = "openrouter-full-spec-compat",
                    path = overlayPath,
                    canonicalUri = "sdkgen://overlay/openrouter-full-spec-compat",
                    sha256 = overlayBytes.sha256(),
                ),
            )

        val validation = GenerationPipeline("conformance-test").validate(config, source, overlays)

        assertFalse(
            validation.diagnostics.any { diagnostic ->
                diagnostic.jsonPointer == ARCHITECTURE_POINTER &&
                    diagnostic.message.contains("conflicting allOf property 'tokenizer'")
            },
            "the compatibility overlay must resolve the architecture tokenizer allOf conflict",
        )

        val effectivePath = materializeEffectiveSource(config, source, overlays)
        try {
            val document = SemanticAdapter().adapt(effectivePath, rootCanonicalUri = CANONICAL_URI).document
            val mapping =
                StandardProjection().project(
                    DeclarationProjectionRequest(
                        document = document,
                        packageName = config.kotlin.packageName,
                        canonicalDocumentUri = CANONICAL_URI,
                        clientName = config.kotlin.naming.clientName,
                        runtimeDefaults = config.runtime,
                    ),
                )
            val architecture =
                mapping.model.files
                    .flatMap(KotlinFileDeclaration::declarations)
                    .filterIsInstance<ModelDeclaration>()
                    .single { declaration -> declaration.symbolId == ARCHITECTURE_SYMBOL_ID }
            val tokenizer = architecture.fields.single { field -> field.wireName == "tokenizer" }

            assertEquals("ModelGroup", tokenizer.type.simpleName)
            assertTrue(tokenizer.type.nullable)
            assertTrue(tokenizer.required)
            assertTrue(tokenizer.nullable)
            assertTrue(architecture.usesFieldState)
        } finally {
            if (effectivePath != sourcePath) Files.deleteIfExists(effectivePath)
        }
    }

    private fun ByteArray.sha256(): String =
        MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }

    private companion object {
        const val CANONICAL_URI: String = "sdkgen://source/openapi.yaml"
        const val ARCHITECTURE_POINTER: String = "/components/schemas/ListEndpointsResponse/properties/architecture"
        const val ARCHITECTURE_SYMBOL_ID: String = "schema:InlineListEndpointsResponseArchitectureX070fc976"
    }
}
