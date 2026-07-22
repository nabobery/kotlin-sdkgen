package com.nabobery.sdkgen.runtime

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class SdkExecutorStreamingContractTest {
    @Test
    fun executeRawInjectsDeclaredSseAcceptHeader() {
        val body = StreamingContractStream("data: ok\n\n")
        val transport = StreamingContractTransport(response(body, "text/event-stream; charset=utf-8"))

        runTestSuspend {
            SdkExecutor(transport).executeRaw(
                request = request(),
                requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
            )
        }

        assertEquals("text/event-stream", transport.request.headers.firstValue("Accept"))
    }

    @Test
    fun executeRawPreservesCallerAcceptHeaderCaseInsensitively() {
        val body = StreamingContractStream("data: ok\n\n")
        val transport = StreamingContractTransport(response(body, "text/event-stream"))

        runTestSuspend {
            SdkExecutor(transport).executeRaw(
                request = request(),
                requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                options = CallOptions(headers = listOf(SdkHeader("aCcEpT", "application/x-custom"))),
            )
        }

        assertEquals(
            listOf("application/x-custom"),
            transport.request.headers
                .filter {
                    it.name.equals("Accept", true)
                }.map { it.value },
        )
    }

    @Test
    fun executeRawTransfersBodyOnlyAfterMatchingDeclaredSseContentType() {
        val body = StreamingContractStream("data: ok\n\n")
        val transport = StreamingContractTransport(response(body, "Text/Event-Stream; charset=utf-8"))

        val result =
            runTestSuspend {
                SdkExecutor(transport).executeRaw(
                    request = request(),
                    requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                )
            }

        assertSame(body, result)
        assertFalse(body.closed)
    }

    @Test
    fun executeRawRejectsWrongStreamingContentTypeAndClosesBody() {
        val body = StreamingContractStream("{}")
        val transport = StreamingContractTransport(response(body, "application/json"))

        val failure =
            assertFailsWith<SdkStreamingException> {
                runTestSuspend {
                    SdkExecutor(transport).executeRaw(
                        request = request(),
                        requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                    )
                }
            }

        assertTrue(body.closed)
        assertSame(failure, body.closeCause)
    }

    @Test
    fun executeRawRejectsMissingStreamingContentTypeAndClosesBody() {
        val body = StreamingContractStream("data: ok\n\n")
        val transport = StreamingContractTransport(SdkResponse(200, emptyList(), body))

        val failure =
            assertFailsWith<SdkStreamingException> {
                runTestSuspend {
                    SdkExecutor(transport).executeRaw(
                        request = request(),
                        requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                    )
                }
            }

        assertTrue(body.closed)
        assertSame(failure, body.closeCause)
    }

    @Test
    fun executeRawWithTypedErrorsTransfersValidatedSseSuccessBody() {
        val body = StreamingContractStream("data: ok\n\n")
        val transport = StreamingContractTransport(response(body, "text/event-stream"))

        val result =
            runTestSuspend {
                SdkExecutor(transport).executeRawWithTypedErrors(
                    request = typedRequest(),
                    requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                    responseDecoder = StreamingTypedDecoder(),
                    mapError = ::mapTypedError,
                )
            }

        assertSame(body, result)
        assertFalse(body.closed)
    }

    @Test
    fun executeRawWithTypedErrorsDecodesDeclaredNonSuccessAndThrowsMappedException() {
        val body = StreamingContractStream("bad key")
        val transport =
            StreamingContractTransport(
                SdkResponse(401, listOf(SdkHeader("Content-Type", "application/json")), body),
            )

        val failure =
            assertFailsWith<StreamingTypedApiException> {
                runTestSuspend {
                    SdkExecutor(transport).executeRawWithTypedErrors(
                        request = typedRequest(),
                        requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                        responseDecoder = StreamingTypedDecoder(),
                        mapError = ::mapTypedError,
                    )
                }
            }

        assertEquals("bad key", failure.error.message)
        assertEquals(401, failure.statusCode)
        assertTrue(body.closed)
        assertSame(failure, body.closeCause)
    }

    @Test
    fun executeRawWithTypedErrorsUsesUnknownApiExceptionForUnmatchedStatus() {
        val body = StreamingContractStream("mystery")
        val transport = StreamingContractTransport(SdkResponse(599, emptyList(), body))

        val failure =
            assertFailsWith<UnknownApiException> {
                runTestSuspend {
                    SdkExecutor(transport).executeRawWithTypedErrors(
                        request = typedRequest(),
                        requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                        responseDecoder = StreamingTypedDecoder(),
                        mapError = ::mapTypedError,
                    )
                }
            }

        assertEquals("mystery", failure.redactedBodyPreview)
        assertTrue(body.closed)
        assertSame(failure, body.closeCause)
    }

    @Test
    fun executeRawWithTypedErrorsPreservesCancellationIdentityAndClosesBody() {
        val cancellation = kotlin.coroutines.cancellation.CancellationException("stop")
        val body = StreamingContractStream("bad key")
        val transport =
            StreamingContractTransport(
                SdkResponse(401, listOf(SdkHeader("Content-Type", "application/json")), body),
            )

        val failure =
            assertFailsWith<kotlin.coroutines.cancellation.CancellationException> {
                runTestSuspend {
                    SdkExecutor(transport).executeRawWithTypedErrors(
                        request = typedRequest(),
                        requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                        responseDecoder = StreamingTypedDecoder(cancellation),
                        mapError = ::mapTypedError,
                    )
                }
            }

        assertSame(cancellation, failure)
        assertTrue(body.closed)
        assertSame(cancellation, body.closeCause)
    }

    private fun typedRequest(): SdkExecutionRequest<Unit> =
        request().copy(
            metadata =
                request().metadata.copy(
                    responseAlternatives =
                        listOf(
                            ResponseAlternative(
                                selector = ResponseSelector.ExactStatus(200),
                                mediaTypes = listOf("application/json"),
                                typeTag = "BufferedSuccess",
                                mode = SdkResponseMode.BUFFERED,
                                id = "success",
                            ),
                            ResponseAlternative(
                                selector = ResponseSelector.ExactStatus(401),
                                mediaTypes = listOf("application/json"),
                                typeTag = "Error",
                                mode = SdkResponseMode.BUFFERED,
                                id = "error",
                            ),
                        ),
                ),
        )

    private fun mapTypedError(
        response: StreamingTypedResponse,
        statusCode: Int,
        headers: List<SdkHeader>,
    ): SdkApiException = StreamingTypedApiException(response as StreamingTypedResponse.Error, statusCode, headers)

    private fun request(): SdkExecutionRequest<Unit> =
        SdkExecutionRequest(
            metadata =
                OperationMetadata(
                    operationId = "streamOp",
                    method = "GET",
                    path = "/events",
                    requestMediaTypes = emptyList(),
                    responseMediaTypes = emptyList(),
                    successStatusCodes = setOf(200),
                    responseMode = SdkResponseMode.STREAMING,
                    deadlines = SdkDeadlines(null, null, null),
                    streaming =
                        StreamingDescriptor.ServerSentEvents(
                            requestFlag = "documentary-only",
                            responseContentType = "text/event-stream",
                        ),
                ),
            baseUri = "https://example.test",
            requestValue = Unit,
            requestCodecIds = emptyList(),
        )

    private fun response(
        body: SdkByteStream,
        contentType: String,
    ): SdkResponse = SdkResponse(200, listOf(SdkHeader("Content-Type", contentType)), body)
}

private sealed interface StreamingTypedResponse {
    data class Error(
        val message: String,
    ) : StreamingTypedResponse
}

private class StreamingTypedApiException(
    val error: StreamingTypedResponse.Error,
    statusCode: Int,
    headers: List<SdkHeader>,
) : SdkApiException(statusCode, headers, "streamOp")

private class StreamingTypedDecoder(
    private val failure: Throwable? = null,
) : SdkResponseAlternativeDecoder<StreamingTypedResponse> {
    override suspend fun decode(
        alternative: ResponseAlternative,
        statusCode: Int,
        headers: List<SdkHeader>,
        body: SdkByteStream,
        mediaType: String?,
    ): StreamingTypedResponse {
        failure?.let { throw it }
        return StreamingTypedResponse.Error(body.readChunk()?.decodeToString().orEmpty())
    }

    override suspend fun decodeUnknown(
        statusCode: Int,
        headers: List<SdkHeader>,
        body: SdkByteStream,
    ): StreamingTypedResponse = error("unknown statuses must not reach the typed decoder")
}

private class StreamingContractTransport(
    private val response: SdkResponse,
) : SdkTransport {
    lateinit var request: SdkRequest
        private set

    override fun capabilities(): TransportCapabilities = TransportCapabilities(supportsStreaming = true)

    override suspend fun execute(request: SdkRequest): SdkResponse {
        this.request = request
        return response
    }
}

private class StreamingContractStream(
    value: String,
) : SdkByteStream {
    private var bytes: ByteArray? = value.encodeToByteArray()
    var closed: Boolean = false
        private set
    var closeCause: Throwable? = null
        private set

    override suspend fun readChunk(maxBytes: Int): ByteArray? = bytes.also { bytes = null }

    override fun close(cause: Throwable?) {
        closed = true
        closeCause = cause
    }
}
