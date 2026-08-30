package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.openapi.SemanticAdapter
import java.nio.file.Files
import kotlin.io.path.writeText
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Plan D4: an explicit `x-sdkgen-streaming.payloadProperty` selects the envelope property whose schema describes
 * the JSON carried by each SSE `data:` field, so the generated `Flow<T>` element type is the wire payload rather
 * than the envelope. Omission preserves 0.3.0 behavior; malformed selections fail closed with an SSE-specific
 * diagnostic instead of silently falling back to the envelope type.
 */
class SsePayloadProjectionTest {
    @Test
    fun directEnvelopeSchemaProjectsTheSelectedPropertyType() {
        val operation = streamOperation(payload = "payloadProperty: data", envelope = INLINE_ENVELOPE)

        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "ChatChunk"), operation.streamResponseType)
        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "ChatResult"), operation.responseType)
        assertEquals("data", streaming(operation).payloadProperty)
    }

    @Test
    fun referencedEnvelopeSchemaProjectsTheSelectedPropertyType() {
        val operation = streamOperation(payload = "payloadProperty: data", envelope = REF_ENVELOPE)

        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "ChatChunk"), operation.streamResponseType)
        assertEquals(OperationResponseMode.MIXED, operation.responseMode)
    }

    @Test
    fun omittingPayloadPropertyKeepsTheEnvelopeAsTheElementType() {
        val operation = streamOperation(payload = "", envelope = REF_ENVELOPE)

        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "ChatStreamingResponse"), operation.streamResponseType)
        assertNull(streaming(operation).payloadProperty)
    }

    @Test
    fun optionalPayloadPropertyIsNotNullableButNullableSchemaIs() {
        val optional = streamOperation(payload = "payloadProperty: data", envelope = OPTIONAL_ENVELOPE)
        val nullable = streamOperation(payload = "payloadProperty: data", envelope = NULLABLE_ENVELOPE)

        assertEquals(KotlinTypeRef(GENERATED_PACKAGE, "ChatChunk"), optional.streamResponseType)
        // A `$ref | null` composition projects to an inline nullable declaration (the projection's ordinary
        // composition rule); what matters here is that the element type is nullable, not which name it gets.
        assertEquals(true, nullable.streamResponseType?.nullable)
    }

    @Test
    fun envelopeMediaTypeSelectorRequestFlagAndSentinelSurvivePayloadSelection() {
        val operation = streamOperation(payload = "payloadProperty: data", envelope = REF_ENVELOPE)
        val sse = streaming(operation)

        assertEquals("[DONE]", sse.terminalSentinel)
        assertEquals("stream", sse.requestFlag)
        assertEquals("text/event-stream", sse.responseContentType)
        assertTrue(operation.responseAlternatives.none { "text/event-stream" in it.mediaTypes })
    }

    @Test
    fun missingSseSchemaFailsClosed() {
        assertFailsClosed(envelope = NO_SCHEMA_ENVELOPE, expected = "has no schema")
    }

    @Test
    fun nonObjectEnvelopeFailsClosed() {
        assertFailsClosed(envelope = STRING_ENVELOPE, expected = "is not an object")
    }

    @Test
    fun missingPayloadPropertyFailsClosed() {
        assertFailsClosed(envelope = REF_ENVELOPE, payload = "payloadProperty: payload", expected = "'payload'")
    }

    @Test
    fun paginationDiagnosticsKeepTheirOwnWording() {
        val mapping = project(PAGINATION_MISSING_ITEMS_SPEC)
        val diagnostic = mapping.diagnostics.single { it.code == GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION }

        assertTrue("pagination path segment 'missing'" in diagnostic.message, diagnostic.message)
        assertTrue("SSE" !in diagnostic.message, diagnostic.message)
    }

    private fun assertFailsClosed(
        envelope: String,
        payload: String = "payloadProperty: data",
        expected: String,
    ) {
        val mapping = project(spec(payload, envelope))
        val diagnostic = mapping.diagnostics.single { it.code == GenerationDiagnosticCode.UNREPRESENTABLE_OPERATION }

        assertTrue("SSE payload property" in diagnostic.message, diagnostic.message)
        assertTrue(expected in diagnostic.message, diagnostic.message)
        assertTrue("payloadProperty" in diagnostic.remediation, diagnostic.remediation)
        assertTrue(
            mapping.model.files
                .flatMap(KotlinFileDeclaration::declarations)
                .none { it is OperationDeclaration },
        )
    }

    private fun streaming(operation: OperationDeclaration): StreamingDeclaration.ServerSentEvents =
        operation.streaming as StreamingDeclaration.ServerSentEvents

    private fun streamOperation(
        payload: String,
        envelope: String,
    ): OperationDeclaration {
        val mapping = project(spec(payload, envelope))
        assertTrue(mapping.diagnostics.isEmpty(), mapping.diagnostics.toString())
        return mapping.model.files
            .flatMap(KotlinFileDeclaration::declarations)
            .filterIsInstance<OperationClientDeclaration>()
            .flatMap(OperationClientDeclaration::operations)
            .single()
    }

    private fun project(yaml: String): DeclarationMappingResult {
        val path = Files.createTempFile("sdkgen-sse-payload-", ".yaml")
        path.writeText(yaml.trimIndent() + "\n")
        val document = SemanticAdapter().adapt(path).document
        return StandardProjection().project(
            DeclarationProjectionRequest(
                document = document,
                packageName = GENERATED_PACKAGE,
                canonicalDocumentUri = document.documentUri,
                clientName = "ChatClient",
            ),
        )
    }

    private fun spec(
        payload: String,
        envelope: String,
    ): String =
        """
        openapi: 3.1.0
        info:
          title: Chat
          version: "1"
        paths:
          /chat:
            post:
              operationId: sendChat
              x-sdkgen-streaming:
                mode: sse
                requestFlag: stream
                responseContentType: text/event-stream
                sentinel: "[DONE]"
                $payload
              requestBody:
                required: true
                content:
                  application/json:
                    schema:
                      ${'$'}ref: '#/components/schemas/ChatRequest'
              responses:
                '200':
                  description: OK
                  content:
                    application/json:
                      schema:
                        ${'$'}ref: '#/components/schemas/ChatResult'
                    text/event-stream:
        $envelope
        components:
          schemas:
            ChatRequest:
              type: object
              required: [prompt]
              properties:
                prompt:
                  type: string
            ChatResult:
              type: object
              required: [id]
              properties:
                id:
                  type: string
            ChatChunk:
              type: object
              required: [delta]
              properties:
                delta:
                  type: string
            ChatStreamingResponse:
              type: object
              required: [data]
              properties:
                data:
                  ${'$'}ref: '#/components/schemas/ChatChunk'
                event:
                  type: string
        """

    private companion object {
        const val GENERATED_PACKAGE = "com.example.generated"
        const val INLINE_ENVELOPE = """
                      schema:
                        type: object
                        required: [data]
                        properties:
                          data:
                            ${'$'}ref: '#/components/schemas/ChatChunk'
        """
        const val REF_ENVELOPE = """
                      schema:
                        ${'$'}ref: '#/components/schemas/ChatStreamingResponse'
        """
        const val OPTIONAL_ENVELOPE = """
                      schema:
                        type: object
                        properties:
                          data:
                            ${'$'}ref: '#/components/schemas/ChatChunk'
        """
        const val NULLABLE_ENVELOPE = """
                      schema:
                        type: object
                        required: [data]
                        properties:
                          data:
                            anyOf:
                              - ${'$'}ref: '#/components/schemas/ChatChunk'
                              - type: 'null'
        """
        const val NO_SCHEMA_ENVELOPE = """
                      example: "data: {}"
        """
        const val STRING_ENVELOPE = """
                      schema:
                        type: string
        """
        const val PAGINATION_MISSING_ITEMS_SPEC = """
        openapi: 3.1.0
        info:
          title: Items
          version: "1"
        paths:
          /items:
            get:
              operationId: listItems
              x-sdkgen-pagination:
                style: cursor
                requestCursor: cursor
                requestLimit: limit
                responseItems: /missing
                responseNextCursor: /nextCursor
              parameters:
                - name: cursor
                  in: query
                  schema:
                    type: string
                - name: limit
                  in: query
                  schema:
                    type: integer
              responses:
                '200':
                  description: OK
                  content:
                    application/json:
                      schema:
                        type: object
                        properties:
                          nextCursor:
                            type: string
        """
    }
}
