package com.nabobery.sdkgen.runtime

import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.json.Json
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.cancellation.CancellationException
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class RuntimeModuleTest {
    @Test
    fun codecRegistrySelectsExactThenStructuredSuffixThenDefaultIgnoringParameters() {
        val exact = StringCodec("exact", setOf("application/problem+json"))
        val json = StringCodec("json", setOf("application/json"), setOf("json"))
        val fallback = StringCodec("fallback", setOf("application/octet-stream"))
        val registry = MediaTypeCodecRegistry.of(exact, json, fallback, defaultCodecId = "fallback")

        assertSame(exact, registry.select(listOf("exact", "json"), "application/problem+json; charset=utf-8"))
        assertSame(json, registry.select(listOf("json"), "application/vnd.openrouter+json"))
        assertSame(fallback, registry.select(listOf("fallback"), "text/plain"))
    }

    @Test
    fun byteRequestBodyDefensivelyCopiesImmutableContent() {
        val source = byteArrayOf(1, 2, 3)
        val body = SdkRequestBody.Bytes(source, "application/octet-stream")
        source[0] = 9
        val firstRead = body.bytes
        firstRead[1] = 9

        assertContentEquals(byteArrayOf(1, 2, 3), body.bytes)
    }

    @Test
    fun kotlinxSerializationCodecEncodesAndDecodesBufferedJson() {
        val codec = KotlinxSerializationCodec("string", String.serializer(), Json)

        val body = runSuspend { codec.encode("hello", "application/json") }
        assertContentEquals("\"hello\"".encodeToByteArray(), assertIs<SdkRequestBody.Bytes>(body).bytes)
        val decoded =
            runSuspend { codec.decode(RecordingStream(listOf("\"hello\"".encodeToByteArray())), "application/json") }
        assertEquals("hello", decoded)
    }

    @Test
    fun boundedReadAcceptsExactLimitAndCopiesChunksOnce() {
        val stream = RecordingStream(listOf("ab".encodeToByteArray(), "cd".encodeToByteArray()))

        val bytes = runSuspend { stream.toByteArray(4) }

        assertContentEquals("abcd".encodeToByteArray(), bytes)
    }

    @Test
    fun boundedReadRejectsOneByteOverAndMultiChunkCrossing() {
        val oneByteOver = RecordingStream(listOf("abcde".encodeToByteArray()))
        val direct =
            assertFailsWith<SdkBufferLimitExceededException> {
                runSuspend { oneByteOver.toByteArray(4) }
            }
        assertEquals(4, direct.maxBytes)

        val crossing =
            RecordingStream(listOf("ab".encodeToByteArray(), "cd".encodeToByteArray(), "e".encodeToByteArray()))
        assertFailsWith<SdkBufferLimitExceededException> {
            runSuspend { crossing.toByteArray(4) }
        }
    }

    @Test
    fun boundedReadRejectsInvalidLimitsAndPreservesCancellationIdentity() {
        assertFailsWith<IllegalArgumentException> {
            runSuspend { RecordingStream().toByteArray(0) }
        }
        assertFailsWith<IllegalArgumentException> {
            runSuspend { RecordingStream().toByteArray(-1) }
        }
        assertFailsWith<IllegalArgumentException> {
            runSuspend { RecordingStream().toByteArray(Int.MAX_VALUE.toLong() + 1) }
        }

        val cancellation = CancellationException("cancelled")
        val thrown =
            assertFailsWith<CancellationException> {
                runSuspend { RecordingStream(failure = cancellation).toByteArray(8) }
            }
        assertSame(cancellation, thrown)
    }

    @Test
    fun executorWrapsBufferedLimitWithOperationAndClosesBodyWithTypedFailure() {
        val responseBody = RecordingStream(listOf("\"hello\"".encodeToByteArray()))
        val transport =
            RecordingTransport(SdkResponse(200, listOf(SdkHeader("Content-Type", "application/json")), responseBody))
        val codec = KotlinxSerializationCodec("json", String.serializer(), Json, maxBufferedBytes = 4)
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport)

        val failure =
            assertFailsWith<SdkSerializationException> {
                runSuspend {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata = operationMetadata(),
                                baseUri = "https://openrouter.test",
                                requestValue = "request",
                                requestCodecIds = listOf("json"),
                            ),
                        responseCodecIds = listOf("json"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }

        assertEquals("sendChatCompletionRequest", failure.operationId)
        assertIs<SdkBufferLimitExceededException>(failure.cause)
        assertSame(failure, responseBody.closeCause)
    }

    @Test
    fun executeValidatesEncodesTransportsClassifiesDecodesAndCloses() {
        val responseBody = RecordingStream(listOf("ok".encodeToByteArray()))
        val transport =
            RecordingTransport(SdkResponse(200, listOf(SdkHeader("Content-Type", "application/json")), responseBody))
        val codec = StringCodec("json", setOf("application/json"), setOf("json"))
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport)

        val result: String =
            runSuspend {
                executor.execute(
                    request =
                        SdkExecutionRequest(
                            metadata = operationMetadata(),
                            baseUri = "https://openrouter.test",
                            requestValue = "request",
                            requestCodecIds = listOf("json"),
                        ),
                    responseCodecIds = listOf("json"),
                    requestCodecs = codecs,
                    responseCodecs = codecs,
                )
            }

        assertEquals("ok", result)
        assertEquals("POST", transport.requests.single().method)
        assertEquals("https://openrouter.test/chat/completions", transport.requests.single().uri)
        assertTrue(responseBody.closed)
        assertEquals(null, responseBody.closeCause)
    }

    @Test
    fun executorAppliesBearerAuthenticationBeforeTransport() {
        val responseBody = RecordingStream(listOf("ok".encodeToByteArray()))
        val transport =
            RecordingTransport(SdkResponse(200, listOf(SdkHeader("Content-Type", "application/json")), responseBody))
        val codec = StringCodec("json", setOf("application/json"), setOf("json"))
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport, BearerTokenAuthentication { " token " })

        runSuspend {
            executor.execute(
                request =
                    SdkExecutionRequest(
                        metadata = operationMetadata(),
                        baseUri = "https://openrouter.test",
                        requestValue = "request",
                        requestCodecIds = listOf("json"),
                    ),
                responseCodecIds = listOf("json"),
                requestCodecs = codecs,
                responseCodecs = codecs,
            )
        }

        assertEquals(
            "Bearer token",
            transport.requests
                .single()
                .headers
                .firstValue("Authorization"),
        )
    }

    @Test
    fun bearerAuthenticationReplacesAllAuthorizationCaseVariants() {
        val request =
            SdkRequest(
                method = "GET",
                uri = "https://openrouter.test/chat/completions",
                headers =
                    listOf(
                        SdkHeader("authorization", "Bearer stale-a"),
                        SdkHeader("AUTHORIZATION", "Bearer stale-b"),
                    ),
                body = null,
                expectedResponseMode = SdkResponseMode.BUFFERED,
                deadlines = SdkDeadlines(null, null, null),
                operationId = "auth",
            )

        val authenticated = runSuspend { BearerTokenAuthentication { "fresh" }.apply(request) }

        assertEquals(1, authenticated.headers.count { it.name.equals("Authorization", ignoreCase = true) })
        assertEquals("Bearer fresh", authenticated.headers.firstValue("Authorization"))
    }

    @Test
    fun nonSuccessIsTypedAndClosesBody() {
        val responseBody = RecordingStream(listOf("denied".encodeToByteArray()))
        val transport = RecordingTransport(SdkResponse(401, listOf(SdkHeader("X-Request-Id", "req-1")), responseBody))
        val codec = StringCodec("json", setOf("application/json"), setOf("json"))
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport)

        val failure =
            assertFailsWith<SdkApiException> {
                runSuspend {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata = operationMetadata(),
                                baseUri = "https://openrouter.test",
                                requestValue = "request",
                                requestCodecIds = listOf("json"),
                            ),
                        responseCodecIds = listOf("json"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }

        assertEquals(401, failure.statusCode)
        assertEquals("req-1", failure.headers.firstValue("X-Request-Id"))
        assertTrue(responseBody.closed)
    }

    @Test
    fun transportFailureIsTyped() {
        val executor =
            SdkExecutor(transport = SdkTransport { throw IllegalStateException("offline") })
        val codecs = MediaTypeCodecRegistry.of(StringCodec("json", setOf("application/json")))

        val failure =
            assertFailsWith<SdkTransportException> {
                runSuspend {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata = operationMetadata(),
                                baseUri = "https://openrouter.test",
                                requestValue = "request",
                                requestCodecIds = listOf("json"),
                            ),
                        responseCodecIds = listOf("json"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }
        assertIs<IllegalStateException>(failure.cause)
    }

    @Test
    fun closeFailureCannotReplaceCancellation() {
        val cancellation = CancellationException("cancelled")
        val responseBody = RecordingStream(failure = cancellation, closeFailure = IllegalStateException("close failed"))
        val transport = RecordingTransport(SdkResponse(200, emptyList(), responseBody))
        val codec = StringCodec("json", setOf("application/json"), setOf("json"))
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport)

        val thrown =
            assertFailsWith<CancellationException> {
                runSuspend {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata = operationMetadata(),
                                baseUri = "https://openrouter.test",
                                requestValue = "request",
                                requestCodecIds = listOf("json"),
                            ),
                        responseCodecIds = listOf("json"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }

        assertSame(cancellation, thrown)
    }

    @Test
    fun decodeCancellationWinsWhenCloseThrowsAnotherCancellation() {
        val decodeCancellation = CancellationException("decode cancelled")
        val closeCancellation = CancellationException("close cancelled")
        val responseBody = RecordingStream(failure = decodeCancellation, closeFailure = closeCancellation)
        val transport = RecordingTransport(SdkResponse(200, emptyList(), responseBody))
        val codec = StringCodec("json", setOf("application/json"), setOf("json"))
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport)

        val thrown =
            assertFailsWith<CancellationException> {
                runSuspend {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata = operationMetadata(),
                                baseUri = "https://openrouter.test",
                                requestValue = "request",
                                requestCodecIds = listOf("json"),
                            ),
                        responseCodecIds = listOf("json"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }

        assertSame(decodeCancellation, thrown)
        assertSame(decodeCancellation, responseBody.closeCause)
    }

    @Test
    fun closeCancellationAfterSuccessfulDecodeIsRethrownByIdentity() {
        val cancellation = CancellationException("close cancelled")
        val responseBody = RecordingStream(listOf("ok".encodeToByteArray()), closeFailure = cancellation)
        val transport = RecordingTransport(SdkResponse(200, emptyList(), responseBody))
        val codec = StringCodec("json", setOf("application/json"), setOf("json"))
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport)

        val thrown =
            assertFailsWith<CancellationException> {
                runSuspend {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata = operationMetadata(),
                                baseUri = "https://openrouter.test",
                                requestValue = "request",
                                requestCodecIds = listOf("json"),
                            ),
                        responseCodecIds = listOf("json"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }

        assertSame(cancellation, thrown)
    }

    @Test
    fun closeFailureAfterSuccessfulDecodeIsWrappedAsTransportException() {
        val closeFailure = IllegalStateException("close failed")
        val responseBody = RecordingStream(listOf("ok".encodeToByteArray()), closeFailure = closeFailure)
        val transport = RecordingTransport(SdkResponse(200, emptyList(), responseBody))
        val codec = StringCodec("json", setOf("application/json"), setOf("json"))
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport)

        val thrown =
            assertFailsWith<SdkTransportException> {
                runSuspend {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata = operationMetadata(),
                                baseUri = "https://openrouter.test",
                                requestValue = "request",
                                requestCodecIds = listOf("json"),
                            ),
                        responseCodecIds = listOf("json"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }

        assertSame(closeFailure, thrown.cause)
    }

    @Test
    fun cancellationPropagatesUnchangedAndClosesBodyWithCause() {
        val cancellation = CancellationException("cancelled")
        val responseBody = RecordingStream(failure = cancellation)
        val transport = RecordingTransport(SdkResponse(200, emptyList(), responseBody))
        val codec = StringCodec("json", setOf("application/json"), setOf("json"))
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor = SdkExecutor(transport)

        val thrown =
            assertFailsWith<CancellationException> {
                runSuspend {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata = operationMetadata(),
                                baseUri = "https://openrouter.test",
                                requestValue = "request",
                                requestCodecIds = listOf("json"),
                            ),
                        responseCodecIds = listOf("json"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }

        assertSame(cancellation, thrown)
        assertSame(cancellation, responseBody.closeCause)
    }

    private fun operationMetadata(): OperationMetadata =
        OperationMetadata(
            operationId = "sendChatCompletionRequest",
            method = "POST",
            path = "/chat/completions",
            requestMediaTypes = listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            responseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(totalMillis = 60_000, attemptMillis = 60_000, idleMillis = 30_000),
        )
}

private class StringCodec(
    override val id: String,
    override val mediaTypes: Set<String>,
    override val structuredSyntaxSuffixes: Set<String> = emptySet(),
) : MediaTypeCodec<String> {
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

private class RecordingTransport(
    private val response: SdkResponse,
) : SdkTransport {
    val requests = mutableListOf<SdkRequest>()

    override suspend fun execute(request: SdkRequest): SdkResponse {
        requests += request
        return response
    }
}

private class RecordingStream(
    chunks: List<ByteArray> = emptyList(),
    private val failure: Throwable? = null,
    private val closeFailure: Throwable? = null,
) : SdkByteStream {
    private val remaining = chunks.toMutableList()
    var closed: Boolean = false
    var closeCause: Throwable? = null

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        failure?.let { throw it }
        return remaining.removeFirstOrNull()
    }

    override fun close(cause: Throwable?) {
        closed = true
        closeCause = cause
        closeFailure?.let { throw it }
    }
}

private fun <T> runSuspend(block: suspend () -> T): T {
    var outcome: Result<T>? = null
    block.startCoroutine(
        object : Continuation<T> {
            override val context = EmptyCoroutineContext

            override fun resumeWith(result: Result<T>) {
                outcome = result
            }
        },
    )
    return requireNotNull(outcome).getOrThrow()
}
