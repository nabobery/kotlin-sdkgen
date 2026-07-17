package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.SemanticDocument
import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Files
import java.nio.file.Path
import kotlin.coroutines.cancellation.CancellationException
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame
import kotlin.test.assertTrue

class OpenRouterPhase1ProjectionTest {
    @Test
    fun mapsRealOpenRouterSemanticsToTheFourPhaseOneShapes() {
        val document =
            SemanticAdapter()
                .adapt(
                    Path.of(requireNotNull(System.getProperty("engine.openRouterFile"))),
                ).document

        val result = OpenRouterPhase1Projection("com.nabobery.sdkgen.generated").map(document)
        val declarations = result.model.files.flatMap(KotlinFileDeclaration::declarations)

        assertEquals(
            listOf("ChatRequest"),
            declarations.filterIsInstance<ModelDeclaration>().map(Declaration::resolvedName),
        )
        assertEquals(
            listOf("ProviderSort"),
            declarations.filterIsInstance<OpenEnumDeclaration>().map(Declaration::resolvedName),
        )
        assertEquals(
            listOf("ReasoningDetail"),
            declarations.filterIsInstance<OneOfDeclaration>().map(Declaration::resolvedName),
        )
        assertEquals(
            listOf("ChatStopAnyOf"),
            declarations.filterIsInstance<AnyOfDeclaration>().map(Declaration::resolvedName),
        )
        val client = declarations.filterIsInstance<OperationClientDeclaration>().single()
        assertEquals("OpenRouterClient", client.resolvedName)
        val operation = client.operations.single()
        assertEquals("sendChatCompletionRequest", operation.operationId)
        assertEquals("POST", operation.method)
        assertEquals("/chat/completions", operation.path)
        assertEquals(listOf("application/json"), operation.requestMediaTypes)
        assertEquals(listOf("application/json"), operation.responseMediaTypes)

        val request = declarations.filterIsInstance<ModelDeclaration>().single()
        assertEquals(
            listOf("messages", "model", "sessionId", "temperature", "maxTokens", "stop"),
            request.fields.map(FieldDeclaration::resolvedName),
        )
        assertTrue(request.fields.single { it.resolvedName == "stop" }.nullable)
        assertTrue(result.exclusions.any { it.symbolId == "schema:ChatRequest" && "properties" in it.reason })
        val topicalExclusions =
            setOf(
                "schema:BaseReasoningConfig",
                "schema:ChatUsage",
                "schema:Model",
                "schema:ModelsListResponse",
                "schema:ProviderPreferences",
                "schema:ProviderResponse",
            )
        assertEquals(
            topicalExclusions,
            result.exclusions
                .map(GenerationExclusion::symbolId)
                .filter(topicalExclusions::contains)
                .toSet(),
        )
        assertTrue(result.diagnostics.all { it.source.jsonPointer.startsWith("/components/schemas/") })
    }

    @Test
    fun namingIsLocaleIndependentAndReportsDeterministicCollisions() {
        val resolver = KotlinNameResolver()
        val first = resolver.resolveTypes(listOf("foo-bar", "foo_bar", "class"))
        val second = resolver.resolveTypes(listOf("class", "foo_bar", "foo-bar"))

        assertEquals(first.names, second.names)
        assertEquals("ClassValue", first.names.getValue("class"))
        assertEquals("FooBar", first.names.getValue("foo-bar"))
        assertEquals("FooBar2", first.names.getValue("foo_bar"))
        assertEquals(1, first.diagnostics.size)
    }

    @Test
    fun documentsWithMatchingSchemaNamesButIncompatibleShapesYieldTypedDiagnosticNotUncaughtException() {
        // Every named component schema the Phase 1 projection looks up by name is present, but the
        // required operation is missing, which trips a `.single { }` (NoSuchElementException) deep inside
        // mapChatOperation rather than the IllegalStateException `error(...)`/`requireSchema` paths.
        val document =
            SemanticAdapter()
                .adapt(
                    Path.of(requireNotNull(System.getProperty("engine.openRouterFile"))),
                ).document
        val mismatched = document.copy(operations = document.operations.map { it.copy(operationId = "renamed") })

        val result =
            OpenRouterPhase1Projection("com.nabobery.sdkgen.generated")
                .project(
                    DeclarationProjectionRequest(
                        document = mismatched,
                        packageName = "com.nabobery.sdkgen.generated",
                        canonicalDocumentUri = mismatched.documentUri,
                        clientName = "OpenRouterClient",
                    ),
                )

        assertEquals(
            listOf("SDKGEN-PROJECTION-UNSUPPORTED-DOCUMENT"),
            result.diagnostics.map(GenerationDiagnostic::code),
        )
    }

    @Test
    fun cancellationDuringProjectionIsNeverConvertedToATypedDiagnostic() {
        val cancellation = CancellationException("cancelled")
        val request =
            DeclarationProjectionRequest(
                document = cancellingDocument(cancellation),
                packageName = "com.nabobery.sdkgen.generated",
                canonicalDocumentUri = "sdkgen://test/cancelled",
                clientName = "OpenRouterClient",
            )

        val thrown =
            assertFailsWith<CancellationException> {
                OpenRouterPhase1Projection("com.nabobery.sdkgen.generated").project(request)
            }
        assertSame(cancellation, thrown)
    }

    private fun cancellingDocument(cancellation: CancellationException): SemanticDocument {
        val path = Files.createTempFile("sdkgen-cancel-probe-", ".yaml")
        path.writeText(
            """
            openapi: 3.1.0
            info:
              title: cancel-probe
              version: "1"
            paths: {}
            """.trimIndent() + "\n",
        )
        val document = SemanticAdapter().adapt(path).document
        // `schemas` is read as the very first step of mapping; a lazily-evaluated map that throws
        // cancellation on iteration exercises the real cancellation-identity contract without
        // requiring a coroutine dispatcher in this synchronous unit test.
        return document.copy(
            schemas =
                object : AbstractMap<com.nabobery.sdkgen.model.SchemaId, com.nabobery.sdkgen.model.SchemaModel>() {
                    override val entries:
                        Set<Map.Entry<com.nabobery.sdkgen.model.SchemaId, com.nabobery.sdkgen.model.SchemaModel>>
                        get() = throw cancellation
                },
        )
    }
}
