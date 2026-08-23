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
        // Full production binding: resolve EXACTLY the overlay list sdkgen.yaml declares (audit first, compat
        // second) so this contract exercises the architecture rewrite in the real applied-overlay order.
        val configured = ConfigLoader.decodeYaml(configPath.readText(), configPath.toString())
        val overlays =
            configured.overlays.map { overlay ->
                val path = sourcePath.parent.resolve(overlay.uri)
                val sha256 = path.readBytes().sha256()
                assertEquals(
                    overlay.sha256,
                    sha256,
                    "committed sdkgen.yaml digest for '${overlay.id}' must match the overlay bytes",
                )
                ResolvedGenerationOverlay(
                    id = overlay.id,
                    path = path,
                    canonicalUri = "sdkgen://overlay/${overlay.id}",
                    sha256 = sha256,
                )
            }

        val validation = GenerationPipeline("conformance-test").validate(configured, source, overlays)

        assertFalse(
            validation.diagnostics.any { diagnostic ->
                diagnostic.jsonPointer == ARCHITECTURE_POINTER &&
                    diagnostic.message.contains("conflicting allOf property 'tokenizer'")
            },
            "the compatibility overlay must resolve the architecture tokenizer allOf conflict",
        )

        val effectivePath = materializeEffectiveSource(configured, source, overlays)
        try {
            val document = SemanticAdapter().adapt(effectivePath, rootCanonicalUri = CANONICAL_URI).document
            val mapping =
                StandardProjection().project(
                    DeclarationProjectionRequest(
                        document = document,
                        packageName = configured.kotlin.packageName,
                        canonicalDocumentUri = CANONICAL_URI,
                        clientName = configured.kotlin.naming.clientName,
                        runtimeDefaults = configured.runtime,
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
