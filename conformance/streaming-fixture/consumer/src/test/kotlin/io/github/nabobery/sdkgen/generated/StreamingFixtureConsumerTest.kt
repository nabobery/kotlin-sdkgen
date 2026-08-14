package io.github.nabobery.sdkgen.generated

import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkStreamingException
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.runtime.auth.Credential
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.Secret
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import com.nabobery.sdkgen.testing.assertClosedNormally
import com.nabobery.sdkgen.testing.assertClosedWith
import io.github.nabobery.sdkgen.generated.chat.ChatClient
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertTrue

/**
 * OpenRouter-shaped generated-SDK proof (task T7): a `sendChatCompletion` operation whose success response is
 * available as either a buffered JSON body or a `text/event-stream`, exercised through the real generated
 * [ChatClient] (produced by `cli generate` against `conformance/streaming-fixture/openapi.yaml`) against a
 * [FakeTransport]. Covers the buffered/typed-error surface, the streaming surface (including hostile byte
 * boundaries, cancellation, and the terminal sentinel), and that both surfaces exist side by side without
 * overloading `sendChatCompletion` by return type.
 */
class StreamingFixtureConsumerTest {
    private fun client(transport: FakeTransport): ChatClient =
        ChatClient(
            transport,
            "https://api.streaming-fixture.test",
            credentialProviders =
                mapOf("apiKey" to CredentialProvider { Credential.ApiKeyCredential(Secret("test-key")) }),
        )

    private fun streamingTransport(): FakeTransport = FakeTransport(TransportCapabilities(supportsStreaming = true))

    private val sseHeaders: List<SdkHeader> = listOf(SdkHeader("Content-Type", "text/event-stream"))

    // --- buffered ---

    @Test
    fun bufferedSuccessDecodesToChatResult() =
        runTest {
            val transport =
                FakeTransport().enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body = FakeByteStream(listOf("""{"id":"c1","content":"hi"}""".encodeToByteArray())),
                )

            val result = client(transport).sendChatCompletion(ChatRequest(model = "m", prompt = "p"))

            assertEquals("c1", result.id)
            assertEquals("hi", result.content)
        }

    @Test
    fun bufferedNonSuccessThrowsTypedApiException() =
        runTest {
            val transport =
                FakeTransport().enqueueResponse(
                    401,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body = FakeByteStream(listOf("""{"message":"bad key"}""".encodeToByteArray())),
                )

            val failure =
                assertFailsWith<ChatClient.SendChatCompletionApiException> {
                    client(transport).sendChatCompletion(ChatRequest(model = "m", prompt = "p"))
                }

            val error = assertIs<ChatClient.SendChatCompletionResponse.Http401Json>(failure.error)
            assertEquals("bad key", error.json.message)
            assertEquals(401, failure.statusCode)
        }

    @Test
    fun withResponseExposesTheMatchedAlternativeWithoutThrowing() =
        runTest {
            val transport =
                FakeTransport().enqueueResponse(
                    500,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body = FakeByteStream(listOf("""{"message":"boom"}""".encodeToByteArray())),
                )

            val result = client(transport).sendChatCompletionWithResponse(ChatRequest(model = "m", prompt = "p"))

            val matched = assertIs<SdkResponseResult.Matched<ChatClient.SendChatCompletionResponse>>(result)
            val alternative = assertIs<ChatClient.SendChatCompletionResponse.Http500Json>(matched.value)
            assertEquals("boom", alternative.json.message)
        }

    // --- streaming ---

    @Test
    fun generatedSseParityFixtureHandlesHostileBoundariesAndCancellation() =
        parityFixture("stress.generated-sse") {
            runTest {
                val raw =
                    "data: {\"id\":\"c1\",\"content\":\"Hel\"}\n\n" +
                        "data: {\"id\":\"c1\",\"content\":\"lo\"}\n\n" +
                        "data: [DONE]\n\n"
                val normalStream =
                    FakeByteStream(
                        raw
                            .encodeToByteArray()
                            .toList()
                            .chunked(3)
                            .map { it.toByteArray() },
                    )
                val normalTransport =
                    streamingTransport().enqueueResponse(200, headers = sseHeaders, body = normalStream)

                val deltas =
                    client(normalTransport)
                        .sendChatCompletionStream(ChatRequest(model = "m", prompt = "p"))
                        .toList()

                assertEquals(listOf("Hel", "lo"), deltas.map { it.content })
                normalStream.assertClosedNormally()

                val cancelledStream =
                    FakeByteStream(
                        listOf(
                            "data: {\"id\":\"c1\",\"content\":\"first\"}\n\n".encodeToByteArray(),
                            "data: {\"id\":\"c1\",\"content\":\"second\"}\n\n".encodeToByteArray(),
                        ),
                    )
                val cancelledTransport =
                    streamingTransport().enqueueResponse(200, headers = sseHeaders, body = cancelledStream)

                assertEquals(
                    "first",
                    client(cancelledTransport)
                        .sendChatCompletionStream(ChatRequest(model = "m", prompt = "p"))
                        .first()
                        .content,
                )
                assertTrue(cancelledStream.closed)

                val incrementalStream =
                    CountingByteStream(
                        listOf(
                            "data: {\"id\":\"c1\",\"content\":\"incremental\"}\n\n".encodeToByteArray(),
                            "data: {\"id\":\"c1\",\"content\":\"must-not-be-read\"}\n\n".encodeToByteArray(),
                        ),
                    )
                val incrementalTransport =
                    streamingTransport().enqueueExchange {
                        SdkResponse(200, sseHeaders, incrementalStream)
                    }

                assertEquals(
                    "incremental",
                    client(incrementalTransport)
                        .sendChatCompletionStream(ChatRequest(model = "m", prompt = "p"))
                        .first()
                        .content,
                )
                assertEquals(1, incrementalStream.reads)
                assertTrue(incrementalStream.closed)

                val eventCount = 1_024
                val longStream =
                    FakeByteStream(
                        buildList {
                            repeat(eventCount) { index ->
                                add(
                                    "data: {\"id\":\"c1\",\"content\":\"$index\"}\n\n".encodeToByteArray(),
                                )
                            }
                            add("data: [DONE]\n\n".encodeToByteArray())
                        },
                    )
                val longTransport = streamingTransport().enqueueResponse(200, headers = sseHeaders, body = longStream)

                val longResult =
                    client(longTransport)
                        .sendChatCompletionStream(ChatRequest(model = "m", prompt = "p"))
                        .toList()

                assertEquals(eventCount, longResult.size)
                assertEquals("0", longResult.first().content)
                assertEquals((eventCount - 1).toString(), longResult.last().content)
                longStream.assertClosedNormally()
            }
        }

    @Test
    fun streamDecodesEventsAcrossHostileByteBoundariesAndStopsAtSentinel() =
        runTest {
            val raw =
                "data: {\"id\":\"c1\",\"content\":\"Hel\"}\n\n" +
                    "data: {\"id\":\"c1\",\"content\":\"lo\"}\n\n" +
                    "data: [DONE]\n\n"
            val bytes = raw.encodeToByteArray()
            // Hostile boundaries: 3-byte chunks, none aligned with a line or event boundary.
            val chunks = bytes.toList().chunked(3).map { it.toByteArray() }
            val stream = FakeByteStream(chunks)
            val transport =
                streamingTransport().enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Content-Type", "text/event-stream")),
                    body = stream,
                )

            val deltas = client(transport).sendChatCompletionStream(ChatRequest(model = "m", prompt = "p")).toList()

            assertEquals(listOf("Hel", "lo"), deltas.map { it.content })
            assertTrue(deltas.all { it.id == "c1" })
            stream.assertClosedNormally()
        }

    @Test
    fun streamIsColdAndOpensAFreshConnectionPerCollection() =
        runTest {
            fun page(content: String) =
                FakeByteStream(
                    listOf("data: {\"id\":\"c1\",\"content\":\"$content\"}\n\ndata: [DONE]\n\n".encodeToByteArray()),
                )
            val transport =
                streamingTransport()
                    .enqueueResponse(200, headers = sseHeaders, body = page("first"))
                    .enqueueResponse(200, headers = sseHeaders, body = page("second"))
            val flow = client(transport).sendChatCompletionStream(ChatRequest(model = "m", prompt = "p"))

            // No request happens just from building the Flow.
            assertEquals(0, transport.capturedRequests.size)

            val first = flow.toList()
            val second = flow.toList()

            assertEquals(listOf("first"), first.map { it.content })
            assertEquals(listOf("second"), second.map { it.content })
            assertEquals(2, transport.capturedRequests.size)
        }

    @Test
    fun cancellingCollectionClosesTheUnderlyingConnectionPromptly() =
        runTest {
            val raw =
                "data: {\"id\":\"c1\",\"content\":\"a\"}\n\n" +
                    "data: {\"id\":\"c1\",\"content\":\"b\"}\n\n" +
                    "data: [DONE]\n\n"
            val stream = FakeByteStream(listOf(raw.encodeToByteArray()))
            val transport = streamingTransport().enqueueResponse(200, headers = sseHeaders, body = stream)

            val first = client(transport).sendChatCompletionStream(ChatRequest(model = "m", prompt = "p")).first()

            assertEquals("a", first.content)
            // first() cancels the flow once satisfied; the underlying connection is still closed promptly, just
            // not "normally" (its close cause is the internal abort, not null).
            assertTrue(stream.closed)
        }

    @Test
    fun cancellationDuringCollectionPropagatesAndClosesWithTheCancellationCause() =
        runTest {
            val stream =
                FakeByteStream(
                    listOf("data: {\"id\":\"c1\",\"content\":\"a\"}\n\n".encodeToByteArray()),
                )
            val transport = streamingTransport().enqueueResponse(200, headers = sseHeaders, body = stream)
            val flow = client(transport).sendChatCompletionStream(ChatRequest(model = "m", prompt = "p"))

            val job =
                async {
                    flow.take(1).toList()
                    // take(1) cancels the upstream after the first element via a CancellationException.
                }
            job.await()

            assertTrue(stream.closed)
        }

    @Test
    fun streamTypedDecodeFailureIsSurfacedAsSerializationException() =
        runTest {
            val stream = FakeByteStream(listOf("data: not-json\n\n".encodeToByteArray()))
            val transport = streamingTransport().enqueueResponse(200, headers = sseHeaders, body = stream)

            assertFailsWith<com.nabobery.sdkgen.runtime.SdkSerializationException> {
                client(transport).sendChatCompletionStream(ChatRequest(model = "m", prompt = "p")).toList()
            }
            stream.assertClosedWith(stream.closeCause ?: error("expected a close cause"))
        }

    @Test
    fun streamDeclaredJsonErrorThrowsGeneratedTypedApiException() =
        runTest {
            val stream = FakeByteStream(listOf("""{"message":"bad key"}""".encodeToByteArray()))
            val transport =
                streamingTransport().enqueueResponse(
                    401,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body = stream,
                )

            val failure =
                assertFailsWith<ChatClient.SendChatCompletionApiException> {
                    client(transport).sendChatCompletionStream(ChatRequest(model = "m", prompt = "p")).toList()
                }

            val error = assertIs<ChatClient.SendChatCompletionResponse.Http401Json>(failure.error)
            assertEquals("bad key", error.json.message)
            stream.assertClosedWith(failure)
        }

    @Test
    fun streamRejectsSuccessfulJsonResponseBeforeSseParsing() =
        runTest {
            val stream = FakeByteStream(listOf("""{"id":"c1","content":"not an event stream"}""".encodeToByteArray()))
            val transport =
                streamingTransport().enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body = stream,
                )

            val failure =
                assertFailsWith<SdkStreamingException> {
                    client(transport).sendChatCompletionStream(ChatRequest(model = "m", prompt = "p")).toList()
                }

            stream.assertClosedWith(failure)
        }

    private inline fun parityFixture(
        fixtureId: String,
        block: () -> Unit,
    ) {
        val runId = System.getProperty(PARITY_RUN_ID_PROPERTY)
        if (runId == null) {
            block()
            return
        }
        parityEvent(runId, fixtureId, "START")
        try {
            block()
            parityEvent(runId, fixtureId, "PASS")
        } catch (failure: Throwable) {
            val failureType = failure::class.simpleName ?: "Throwable"
            parityEvent(runId, fixtureId, "FAIL", "$fixtureId failed: $failureType")
            throw failure
        }
    }

    private fun parityEvent(
        runId: String,
        fixtureId: String,
        event: String,
        error: String? = null,
    ) {
        val frame =
            buildJsonObject {
                put("fixtureId", fixtureId)
                put("event", event)
                error?.let { put("error", it) }
                put("runId", runId)
            }
        println("SDKGEN_PARITY_EVENT $frame")
        System.out.flush()
    }

    private companion object {
        const val PARITY_RUN_ID_PROPERTY = "sdkgen.parity.runId"
    }

    private class CountingByteStream(
        chunks: List<ByteArray>,
    ) : SdkByteStream {
        private val chunks = ArrayDeque(chunks.map(ByteArray::copyOf))

        var reads: Int = 0
            private set

        var closed: Boolean = false
            private set

        override suspend fun readChunk(maxBytes: Int): ByteArray? {
            require(maxBytes > 0) { "maxBytes must be positive" }
            reads += 1
            return chunks.removeFirstOrNull()
        }

        override fun close(cause: Throwable?) {
            closed = true
        }
    }
}
