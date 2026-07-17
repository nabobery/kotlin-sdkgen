package com.nabobery.sdkgen.openapi.overlays

import io.swagger.v3.parser.OpenAPIV3Parser
import io.swagger.v3.parser.core.models.ParseOptions
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.writeText
import kotlin.system.measureTimeMillis
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class CorpusOverlayTest {
    private val corpusRoot = Path.of(checkNotNull(System.getProperty("corpus.root")))

    @Test
    fun `applies three realistic overlays to OpenRouter and revalidates OpenAPI 3_1`() {
        val sourcePath = corpusRoot.resolve("openrouter/openapi.yaml")
        val overlays =
            listOf(
                resourceOverlay("openrouter-streaming", "/overlays/openrouter/01-streaming.yaml"),
                resourceOverlay("openrouter-description", "/overlays/openrouter/02-description.yaml"),
                resourceOverlay("openrouter-remove-legacy", "/overlays/openrouter/03-remove-legacy-sentinel.yaml"),
            )
        lateinit var result: OverlayApplicationResult
        val elapsed =
            measureTimeMillis {
                result = OverlayApplicator().apply(Files.readAllBytes(sourcePath), overlays)
            }

        assertEquals("sse", result.document.at("/paths/~1chat~1completions/post/x-sdkgen-streaming/mode").asText())
        assertTrue(
            result.document
                .at(
                    "/paths/~1chat~1completions/post/responses/200/content/text~1event-stream/x-speakeasy-sse-sentinel",
                ).isMissingNode,
        )
        assertEquals(3, result.overlays.size)
        assertEquals(3, result.changes.size)
        validateOpenApi31(result.document, "OpenRouter")

        val outputDirectory = Path.of("build/results/corpus").createDirectories()
        val effectiveJson = DocumentCodec.prettyJson(result.document)
        outputDirectory.resolve("openrouter-effective.json").writeText(effectiveJson)
        outputDirectory.resolve("openrouter-diff.json").writeText(diffJson(result.changes))
        outputDirectory.resolve("openrouter-manifest.json").writeText(ManifestRenderer.render(result.overlays))
        println(
            "MEASURE openrouter_apply_ms=$elapsed effective_bytes=${effectiveJson.toByteArray().size} diff_entries=${result.changes.size}",
        )
    }

    @Test
    fun `applies canonical streaming and pagination overlays to stress fixtures`() {
        val streaming =
            applyStress(
                "stress/12-sse-request-streaming.yaml",
                resourceOverlay("stress-streaming", "/overlays/stress/streaming.yaml"),
            )
        assertEquals("sse", streaming.document.at("/paths/~1chat/post/x-sdkgen-streaming/mode").asText())
        validateOpenApi31(streaming.document, "streaming stress fixture")

        val pagination =
            applyStress(
                "stress/14-cursor-pagination.yaml",
                resourceOverlay("stress-pagination", "/overlays/stress/pagination.yaml"),
            )
        assertEquals("cursor", pagination.document.at("/paths/~1items/get/x-sdkgen-pagination/style").asText())
        validateOpenApi31(pagination.document, "pagination stress fixture")
    }

    private fun applyStress(
        relativePath: String,
        overlay: OverlayInput,
    ): OverlayApplicationResult =
        OverlayApplicator().apply(Files.readAllBytes(corpusRoot.resolve(relativePath)), listOf(overlay))

    private fun validateOpenApi31(
        document: com.fasterxml.jackson.databind.JsonNode,
        label: String,
    ) {
        val options =
            ParseOptions().apply {
                isResolve = false
                isResolveFully = false
                isValidateExternalRefs = true
            }
        val parsed = OpenAPIV3Parser().readContents(DocumentCodec.canonicalJson(document), null, options)
        assertNotNull(parsed.openAPI, "$label did not parse")
        assertTrue(parsed.openAPI.openapi.startsWith("3.1"), "$label parsed as ${parsed.openAPI.openapi}")
        assertTrue(parsed.messages.orEmpty().isEmpty(), "$label parser messages: ${parsed.messages}")
    }

    private fun resourceOverlay(
        identity: String,
        path: String,
    ): OverlayInput = OverlayInput(identity, checkNotNull(javaClass.getResource(path)).readBytes())

    private fun diffJson(changes: List<EffectiveChange>): String {
        val array = DocumentCodec.arrayNode()
        changes.forEach { change ->
            val node = DocumentCodec.objectNode()
            node.put("pointer", change.pointer)
            node.put("kind", change.kind.name.lowercase())
            change.before?.let { node.set<com.fasterxml.jackson.databind.JsonNode>("before", it) }
            change.after?.let { node.set<com.fasterxml.jackson.databind.JsonNode>("after", it) }
            array.add(node)
        }
        return DocumentCodec.prettyJson(array)
    }
}
