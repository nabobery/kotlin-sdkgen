package com.nabobery.sdkgen.runtime

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

/**
 * [SdkExecutor.executeWithHeaders] must decode exactly like [SdkExecutor.execute] (same status classification, typed
 * error throwing) while additionally surfacing the physical response's headers — the piece
 * [PaginationDescriptor.HeaderNextUrl] pagination needs (the `Link` header) that [SdkExecutor.execute] discards.
 */
class ExecuteWithHeadersTest {
    @Test
    fun decodedValueAndHeadersAreBothSurfacedOnSuccess() =
        runTestSuspend {
            val transport =
                ScriptedTransport().response(
                    200,
                    body = "hello",
                    headers = listOf(SdkHeader("Link", """</items?page=2>; rel="next"""")),
                )
            val executor = SdkExecutor(transport)

            val result =
                executor.executeWithHeaders(
                    request = SdkExecutionRequest(metadata(), "https://example.test", "request", listOf("json")),
                    responseCodecIds = listOf("json"),
                    requestCodecs = MediaTypeCodecRegistry.of(ExecuteWithHeadersStringCodec),
                    responseCodecs = MediaTypeCodecRegistry.of(ExecuteWithHeadersStringCodec),
                )

            assertEquals("hello", result.value)
            assertEquals(listOf(SdkHeader("Link", """</items?page=2>; rel="next"""")), result.headers)
        }

    @Test
    fun copyReplacesOnlyTheSuppliedFields() {
        val original = SdkHeaderedResponse("value", listOf(SdkHeader("X", "1")))

        val valueReplaced = original.copy(value = "other")
        assertEquals("other", valueReplaced.value)
        assertEquals(listOf(SdkHeader("X", "1")), valueReplaced.headers)

        val headersReplaced = original.copy(headers = emptyList())
        assertEquals("value", headersReplaced.value)
        assertEquals(emptyList(), headersReplaced.headers)
    }

    @Test
    fun nonSuccessStatusStillThrowsExactlyLikeExecute() =
        runTestSuspend {
            val transport = ScriptedTransport().response(500, body = "boom")
            val executor = SdkExecutor(transport)

            assertFailsWith<SdkApiException> {
                executor.executeWithHeaders(
                    request = SdkExecutionRequest(metadata(), "https://example.test", "request", listOf("json")),
                    responseCodecIds = listOf("json"),
                    requestCodecs = MediaTypeCodecRegistry.of(ExecuteWithHeadersStringCodec),
                    responseCodecs = MediaTypeCodecRegistry.of(ExecuteWithHeadersStringCodec),
                )
            }
            Unit
        }

    private fun metadata(): OperationMetadata =
        OperationMetadata(
            operationId = "listItems",
            method = "GET",
            path = "/items",
            requestMediaTypes = listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            responseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(null, null, null),
        )
}

private object ExecuteWithHeadersStringCodec : MediaTypeCodec<String> {
    override val id: String = "json"
    override val mediaTypes: Set<String> = setOf("application/json")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String =
        buildList {
            while (true) add(body.readChunk() ?: break)
        }.fold(ByteArray(0), ByteArray::plus).decodeToString()
}
