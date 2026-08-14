package io.github.nabobery.sdkgen.generated

import io.github.nabobery.sdkgen.generated.chat.ChatClient.SendChatCompletionRequestResponse
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.PaginationDescriptor
import com.nabobery.sdkgen.runtime.PolicyOverride
import com.nabobery.sdkgen.runtime.PropertyPath
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkAuthenticationException
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.StreamingDescriptor
import com.nabobery.sdkgen.runtime.bodies.MultipartBody
import com.nabobery.sdkgen.runtime.bodies.TransferEvent
import com.nabobery.sdkgen.runtime.bodies.TransferObserver
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver
import com.nabobery.sdkgen.runtime.pagination.PageEnvelope
import com.nabobery.sdkgen.runtime.pagination.PageRequest
import com.nabobery.sdkgen.runtime.pagination.PaginationEngine
import com.nabobery.sdkgen.runtime.streaming.sseFlow
import com.nabobery.sdkgen.testing.ChunkedByteStream
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import com.nabobery.sdkgen.testing.sseEventFixture
import com.nabobery.sdkgen.testing.sseStreamFixture
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertSame
import kotlin.test.assertTrue

class OpenRouterFixtureConformanceTest {
    @Test
    fun ordinaryGeneratedCallUsesFakeTransportAndClosesBody() =
        runTest {
            val body =
                FakeByteStream(
                    listOf(
                        (
                            "{\"choices\":[],\"created\":1,\"id\":\"chat-fixture\",\"model\":\"test\"," +
                                "\"object\":\"chat.completion\",\"system_fingerprint\":null}"
                        ).encodeToByteArray(),
                    ),
                )
            val transport =
                FakeTransport().enqueueResponse(
                    200,
                    listOf(SdkHeader("Content-Type", "application/json")),
                    body,
                )

            val result =
                OpenRouterClient(
                    transport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).chat.sendChatCompletionRequest(chatRequest())

            assertEquals("chat-fixture", result.id)
            assertEquals("sendChatCompletionRequest", transport.capturedRequests.single().operationId)
            assertTrue(body.closed)
        }

    @Test
    fun cursorPaginationExposesPageAndItemFlows() =
        runTest {
            val engine =
                PaginationEngine<String, String>(
                    PaginationDescriptor.CursorToken(
                        requestCursorParam = "cursor",
                        responseItemsPath = PropertyPath("data"),
                        responseNextCursorPath = PropertyPath("next_cursor"),
                    ),
                    operationId = "list-fixture",
                )
            val fetch: suspend (PageRequest) -> PageEnvelope<String, String> = { request ->
                when (request) {
                    PageRequest.First -> PageEnvelope("page-1", listOf("a", "b"), nextCursor = "next")
                    PageRequest.NextCursor("next") -> PageEnvelope("page-2", listOf("c"))
                    else -> error("Unexpected page request: $request")
                }
            }

            assertEquals(listOf("page-1", "page-2"), engine.pages(fetch).toList().map { it.value })
            assertEquals(listOf("a", "b", "c"), engine.items(fetch).toList())
        }

    @Test
    fun sseChatFixtureIsIncrementalAndCancellationClosesWithSameCause() =
        runTest {
            val payload =
                sseStreamFixture(
                    sseEventFixture("{\"delta\":\"hel\"}"),
                    sseEventFixture("{\"delta\":\"lo\"}"),
                )
            val stream = ChunkedByteStream(payload, List(payload.size) { 1 })
            val observed = mutableListOf<String>()
            val cancellation = CancellationException("stop after first event")

            assertFailsWith<CancellationException> {
                sseFlow({ stream }, StreamingDescriptor.ServerSentEvents()).collect { event ->
                    observed += event.data
                    throw cancellation
                }
            }.also { assertSame(cancellation, it) }

            assertEquals(listOf("{\"delta\":\"hel\"}"), observed)
            assertTrue(stream.closed)
            assertSame(cancellation, stream.closeCause)
        }

    @Test
    fun multipartRuntimeFixtureReplaysExactBytes() =
        runTest {
            val body =
                MultipartBody(boundaryProvider = { "openrouter-boundary" })
                    .text("model", "whisper-1")
                    .bytes("input_audio", byteArrayOf(0, 1, 2), filename = "audio.wav")
                    .build()
            val replay = body as SdkRequestBody.ReplayFactory

            val first = consume(requireNotNull(replay.create()))
            val second = consume(requireNotNull(replay.create()))

            assertContentEquals(first, second)
            assertTrue(first.decodeToString().contains("name=\"input_audio\"; filename=\"audio.wav\""))
        }

    @Test
    fun generatedBinaryDownloadPreservesBytesAndCancellationCause() =
        runTest {
            val bytes = byteArrayOf(0, 1, 2, 3, 4)
            val normal = FakeByteStream(listOf(byteArrayOf(0), byteArrayOf(1, 2), byteArrayOf(3, 4)))
            val normalTransport = FakeTransport().enqueueResponse(200, body = normal)
            val downloaded =
                OpenRouterClient(
                    normalTransport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).files.downloadFileContent("file-1")

            assertContentEquals(bytes, consume(downloaded))
            assertTrue(normal.closed)

            val cancellation = CancellationException("binary consumer stopped")
            val cancelled = FakeByteStream(listOf(byteArrayOf(0)), failure = cancellation, failAtRead = 1)
            val cancelledTransport = FakeTransport().enqueueResponse(200, body = cancelled)
            val stream =
                OpenRouterClient(
                    cancelledTransport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).files.downloadFileContent("file-2")
            assertContentEquals(byteArrayOf(0), stream.readChunk())
            val thrown = assertFailsWith<CancellationException> { stream.readChunk() }
            stream.close(thrown)

            assertSame(cancellation, thrown)
            assertSame(cancellation, cancelled.closeCause)
        }

    @Test
    fun retryReusesCallerIdempotencyKeyAcrossAttempts() =
        runTest {
            val firstBody =
                FakeByteStream(
                    listOf("{\"error\":{\"code\":429,\"message\":\"retry\"}}".encodeToByteArray()),
                )
            val secondBody = FakeByteStream(listOf(byteArrayOf(1, 2, 3)))
            val transport =
                FakeTransport()
                    .enqueueResponse(429, body = firstBody)
                    .enqueueResponse(200, body = secondBody)
            val options =
                CallOptions(
                    headers = listOf(SdkHeader("Idempotency-Key", "stable-key")),
                    retry =
                        PolicyOverride.Replace(
                            RetryDescriptor(
                                retryableStatusCodes = listOf(ResponseSelector.ExactStatus(429)),
                                maxAttempts = 2,
                                backoff = BackoffHints(1, maxDelayMillis = 1),
                            ),
                        ),
                )

            val stream =
                OpenRouterClient(
                    transport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).files.downloadFileContent("file-retry", options = options)

            assertContentEquals(byteArrayOf(1, 2, 3), consume(stream))
            assertEquals(2, transport.capturedRequests.size)
            assertEquals(
                listOf("stable-key", "stable-key"),
                transport.capturedRequests.map { request ->
                    request.headers.single { it.name.equals("Idempotency-Key", ignoreCase = true) }.value
                },
            )
            assertTrue(firstBody.closed)
            assertTrue(secondBody.closed)
        }

    @Test
    fun throwingLifecycleAndTransferObserversDoNotCorruptSuccessfulCall() =
        runTest {
            val body = FakeByteStream(listOf(byteArrayOf(4, 5, 6)))
            val transport = FakeTransport().enqueueResponse(200, body = body)
            val options =
                CallOptions(
                    transferObserver = ThrowingTransferObserver,
                    observers = listOf(ThrowingLifecycleObserver),
                )

            val stream =
                OpenRouterClient(
                    transport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).files.downloadFileContent("file-observer", options = options)

            assertContentEquals(byteArrayOf(4, 5, 6), consume(stream))
            assertTrue(body.closed)
        }

    @Test
    fun generatedWithResponseTypedSuccessPreservesStatusAndRepeatedHeaders() =
        runTest {
            val body =
                FakeByteStream(
                    listOf(
                        (
                            "{\"choices\":[],\"created\":1,\"id\":\"chat-with-response-success\",\"model\":\"test\"," +
                                "\"object\":\"chat.completion\",\"system_fingerprint\":null}"
                        ).encodeToByteArray(),
                    ),
                )
            val repeatedHeaders =
                listOf(
                    SdkHeader("Content-Type", "application/json"),
                    SdkHeader("X-OpenRouter-Trace", "trace-1"),
                    SdkHeader("X-OpenRouter-Trace", "trace-2"),
                )
            val transport = FakeTransport().enqueueResponse(200, repeatedHeaders, body)

            val result =
                OpenRouterClient(
                    transport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).chat.sendChatCompletionRequestWithResponse(chatRequest())

            assertIs<SdkResponseResult.Matched<SendChatCompletionRequestResponse>>(result)
            assertEquals(200, result.statusCode)
            assertEquals(repeatedHeaders, result.headers)

            val value = result.value
            assertIs<SendChatCompletionRequestResponse.SuccessJson>(value)
            assertEquals(200, value.statusCode)
            assertEquals(repeatedHeaders, value.headers)
            assertEquals("chat-with-response-success", value.json.id)
            assertTrue(body.closed)
        }

    @Test
    fun generatedWithResponseDeclaredTypedNonSuccess() =
        runTest {
            val errorBodyJson =
                """{"error":{"code":400,"message":"Invalid chat prompt format"}}"""
            val body = FakeByteStream(listOf(errorBodyJson.encodeToByteArray()))
            val responseHeaders = listOf(SdkHeader("Content-Type", "application/json"))
            val transport = FakeTransport().enqueueResponse(400, responseHeaders, body)

            val result =
                OpenRouterClient(
                    transport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).chat.sendChatCompletionRequestWithResponse(chatRequest())

            assertIs<SdkResponseResult.Matched<SendChatCompletionRequestResponse>>(result)
            assertEquals(400, result.statusCode)
            assertEquals(responseHeaders, result.headers)

            val value = result.value
            assertIs<SendChatCompletionRequestResponse.Http400Json>(value)
            assertEquals(400, value.statusCode)
            assertEquals(responseHeaders, value.headers)
            assertEquals("Invalid chat prompt format", value.json.error.message)
            assertTrue(body.closed)
        }

    @Test
    fun missingRequiredAuthFailsBeforeTransportIsInvoked() =
        runTest {
            val transport = FakeTransport()
            val client = OpenRouterClient(transport, "https://openrouter.test")

            assertFailsWith<SdkAuthenticationException> {
                client.chat.sendChatCompletionRequest(chatRequest())
            }

            assertTrue(transport.capturedRequests.isEmpty())
        }

    private fun chatRequest(): ChatRequest =
        chatRequest {
            messages =
                listOf(
                    SdkJson.decodeFromJsonElement(
                        buildJsonObject {
                            put("role", "user")
                            put("content", "hello")
                        },
                    ),
                )
        }
}

private object ThrowingLifecycleObserver : SdkLifecycleObserver {
    override fun callStarted(
        callId: String,
        operationId: String,
        method: String,
        normalizedRoute: String,
    ): Unit = error("lifecycle observer failure")
}

private object ThrowingTransferObserver : TransferObserver {
    override fun onStart(event: TransferEvent): Unit = error("transfer observer start failure")

    override fun onProgress(event: TransferEvent): Unit = error("transfer observer progress failure")

    override fun onCompletion(event: TransferEvent): Unit = error("transfer observer completion failure")

    override fun onFailure(
        event: TransferEvent,
        failure: Throwable,
    ): Unit = error("transfer observer failure")
}

private suspend fun consume(body: SdkRequestBody): ByteArray =
    when (body) {
        is SdkRequestBody.Bytes -> body.bytes
        is SdkRequestBody.OneShot -> consume(body.stream)
        is SdkRequestBody.ReplayFactory -> consume(body.create())
    }

private suspend fun consume(stream: com.nabobery.sdkgen.runtime.SdkByteStream): ByteArray {
    val chunks = mutableListOf<ByteArray>()
    while (true) chunks += stream.readChunk() ?: break
    stream.close()
    return chunks.fold(ByteArray(0), ByteArray::plus)
}
