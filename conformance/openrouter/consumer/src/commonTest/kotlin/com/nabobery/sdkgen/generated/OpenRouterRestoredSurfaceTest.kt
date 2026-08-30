package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.anthropicmessages.AnthropicMessagesClient
import com.nabobery.sdkgen.generated.betaresponses.BetaResponsesClient
import com.nabobery.sdkgen.generated.stt.SttClient
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import com.nabobery.sdkgen.testing.assertClosedWith
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame
import kotlin.test.assertTrue

private typealias TextDelta =
    InlineMessagesContentBlockDeltaEventDeltaX956b8ed8.InlineMessagesContentBlockDeltaEventDeltaOneOf1Xecf23299

/**
 * Acceptance coverage (ADR 0021) for the OpenRouter operation surface restored by removing the compat
 * overlay's `/messages`, `/responses`, and `/audio/transcriptions` path removals. Every symbol
 * referenced here is absent from the pre-restoration snapshot (that is the captured RED), and the
 * assertions pin the load-bearing intersection-reclaimed fields plus the streaming, typed-error,
 * cancellation, and wire-body contracts these operations must honor.
 */
class OpenRouterRestoredSurfaceTest {
    // ---- /messages ---------------------------------------------------------------------------

    @Test
    fun createMessagesStreamSplitsChunksTerminatesAtDoneAndPreservesRequest() =
        runTest {
            val preSentinelBytes =
                (messagesStreamEvent("Hello") + messagesStreamEvent("world") + "data: [DONE]\n\n")
                    .encodeToByteArray()
            val preSentinelChunks = preSentinelBytes.toList().chunked(7).map { it.toByteArray() }
            val unexpectedPostDoneRead = IllegalStateException("Post-[DONE] messages chunk was read")
            val stream =
                FakeByteStream(
                    chunks = preSentinelChunks + listOf(messagesStreamEvent("poison").encodeToByteArray()),
                    failure = unexpectedPostDoneRead,
                    failAtRead = preSentinelChunks.size,
                )
            val transport =
                FakeTransport(TransportCapabilities(supportsStreaming = true)).enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Content-Type", "text/event-stream")),
                    body = stream,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            val request = messagesRequest(stream = true)
            // `payloadProperty: data` projects the element type to the `MessagesStreamEvents` payload union, so the
            // envelope's `event` name is no longer part of the collected value; the typed branch is.
            val events: List<MessagesStreamEvents> = client.anthropicMessages.createMessagesStream(request).toList()

            assertEquals(
                listOf("Hello", "world"),
                events.map { event ->
                    val delta = assertIs<MessagesStreamEvents.MessagesContentBlockDeltaEvent>(event).delta
                    assertIs<TextDelta>(delta).text
                },
            )
            assertEquals("createMessages", transport.capturedRequests.single().operationId)
            val requestBody = consume(requireNotNull(transport.capturedRequests.single().body)).decodeToString()
            assertEquals(SdkJson.encodeToString(request), requestBody)
            assertTrue(requestBody.contains("\"stream\":true"))
            assertTrue(stream.closed)
        }

    @Test
    fun createMessagesStreamNonSuccessIsTypedApiException() =
        runTest {
            val body =
                FakeByteStream(
                    listOf(
                        "{\"error\":{\"message\":\"invalid request\",\"type\":\"invalid_request_error\"},\"type\":\"error\"}"
                            .encodeToByteArray(),
                    ),
                )
            val transport =
                FakeTransport(TransportCapabilities(supportsStreaming = true)).enqueueResponse(
                    400,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body = body,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            val failure =
                assertFailsWith<AnthropicMessagesClient.CreateMessagesApiException> {
                    client.anthropicMessages.createMessagesStream(messagesRequest(stream = true)).toList()
                }
            assertEquals(400, failure.statusCode)
            assertIs<AnthropicMessagesClient.CreateMessagesResponse.Http400Json>(failure.error)
            body.assertClosedWith(failure)
        }

    @Test
    fun createMessagesStreamCancellationClosesWithSameCause() =
        runTest {
            val cancellation = CancellationException("messages consumer stopped")
            val stream =
                FakeByteStream(
                    listOf((messagesStreamEvent("first") + messagesStreamEvent("second")).encodeToByteArray()),
                    failure = cancellation,
                    failAtRead = 1,
                )
            val transport =
                FakeTransport(TransportCapabilities(supportsStreaming = true)).enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Content-Type", "text/event-stream")),
                    body = stream,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            assertFailsWith<CancellationException> {
                client.anthropicMessages.createMessagesStream(messagesRequest(stream = true)).collect {
                    throw cancellation
                }
            }.also { assertSame(cancellation, it) }
            stream.assertClosedWith(cancellation)
        }

    // ---- /responses --------------------------------------------------------------------------

    @Test
    fun createResponsesStreamTerminatesAtDoneAndPreservesRequest() =
        runTest {
            val preSentinelBytes =
                (responsesStreamEvent("Hello") + responsesStreamEvent("world") + "data: [DONE]\n\n")
                    .encodeToByteArray()
            val preSentinelChunks = preSentinelBytes.toList().chunked(9).map { it.toByteArray() }
            val unexpectedPostDoneRead = IllegalStateException("Post-[DONE] responses chunk was read")
            val stream =
                FakeByteStream(
                    chunks = preSentinelChunks + listOf(responsesStreamEvent("poison").encodeToByteArray()),
                    failure = unexpectedPostDoneRead,
                    failAtRead = preSentinelChunks.size,
                )
            val transport =
                FakeTransport(TransportCapabilities(supportsStreaming = true)).enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Content-Type", "text/event-stream")),
                    body = stream,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            val request = responsesRequest(stream = true)
            val events: List<StreamEvents> = client.betaResponses.createResponsesStream(request).toList()

            assertEquals(2, events.size)
            assertEquals("createResponses", transport.capturedRequests.single().operationId)
            val requestBody = consume(requireNotNull(transport.capturedRequests.single().body)).decodeToString()
            assertEquals(SdkJson.encodeToString(request), requestBody)
            assertTrue(requestBody.contains("\"stream\":true"))
            assertTrue(stream.closed)
        }

    @Test
    fun createResponsesStreamNonSuccessIsTypedApiException() =
        runTest {
            val body =
                FakeByteStream(
                    listOf("{\"error\":{\"code\":400,\"message\":\"bad responses request\"}}".encodeToByteArray()),
                )
            val transport =
                FakeTransport(TransportCapabilities(supportsStreaming = true)).enqueueResponse(
                    400,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body = body,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            val failure =
                assertFailsWith<BetaResponsesClient.CreateResponsesApiException> {
                    client.betaResponses.createResponsesStream(responsesRequest(stream = true)).toList()
                }
            assertEquals(400, failure.statusCode)
            assertIs<BetaResponsesClient.CreateResponsesResponse.Http400Json>(failure.error)
            body.assertClosedWith(failure)
        }

    // ---- /audio/transcriptions (JSON) --------------------------------------------------------

    @Test
    fun createAudioTranscriptionsJsonSendsExactWireBodyAndDecodesResult() =
        runTest {
            val body = FakeByteStream(listOf("{\"text\":\"Hello world\"}".encodeToByteArray()))
            val transport =
                FakeTransport().enqueueResponse(
                    200,
                    listOf(SdkHeader("Content-Type", "application/json")),
                    body,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            val request = sttRequest()
            val result: SttResponse = client.stt.createAudioTranscriptions(request)

            assertEquals("Hello world", result.text)
            assertEquals("createAudioTranscriptions", transport.capturedRequests.single().operationId)
            // No hidden request mutation: the captured wire body equals the caller's serialized request.
            assertEquals(SdkJson.encodeToString(request), consume(requireNotNull(transport.capturedRequests.single().body)).decodeToString())
            assertTrue(body.closed)
        }

    @Test
    fun createAudioTranscriptionsJsonNonSuccessIsTypedApiException() =
        runTest {
            val body =
                FakeByteStream(
                    listOf("{\"error\":{\"code\":400,\"message\":\"invalid audio\"}}".encodeToByteArray()),
                )
            val transport =
                FakeTransport().enqueueResponse(
                    400,
                    listOf(SdkHeader("Content-Type", "application/json")),
                    body,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            val failure =
                assertFailsWith<SttClient.CreateAudioTranscriptionsApiException> {
                    client.stt.createAudioTranscriptions(sttRequest())
                }
            assertEquals(400, failure.statusCode)
            // The typed alternative AND its decoded payload: proof the 400 body was decoded into the
            // generated error model rather than merely classified by status code.
            val error = assertIs<SttClient.CreateAudioTranscriptionsResponse.Http400Json>(failure.error)
            assertEquals(400, error.json.error.code)
            assertEquals("invalid audio", error.json.error.message)
            body.assertClosedWith(failure)
        }

    // ---- /audio/transcriptions (multipart) ---------------------------------------------------

    @Test
    fun createAudioTranscriptionsMultipartSendsExactMultipartParts() =
        runTest {
            val responseBody = FakeByteStream(listOf("{\"text\":\"transcribed\"}".encodeToByteArray()))
            val transport =
                FakeTransport().enqueueResponse(
                    200,
                    listOf(SdkHeader("Content-Type", "application/json")),
                    responseBody,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            val request =
                InlineAudioTranscriptionsPostRequestMultipartXc57fc157(
                    `file` = FakeByteStream(listOf("RIFF-AUDIO-BYTES".encodeToByteArray())),
                    model = "openai/whisper-large-v3",
                    responseFormat = InlineAudioTranscriptionsPostRequestMultipartResponseFormatX8238d791.VerboseJson,
                    timestampGranularities =
                        listOf(
                            InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc.Word,
                            InlineAudioTranscriptionsPostRequestMultipartTimestampGranularitiesItemX457952fc.Segment,
                        ),
                )
            val result: SttResponse = client.stt.createAudioTranscriptionsMultipart(request)

            assertEquals("transcribed", result.text)
            assertEquals("createAudioTranscriptions", transport.capturedRequests.single().operationId)
            val wire = consume(requireNotNull(transport.capturedRequests.single().body)).decodeToString()
            assertTrue(wire.contains("name=\"file\""), "multipart wire is missing the file part header")
            assertTrue(wire.contains("RIFF-AUDIO-BYTES"), "multipart wire is missing the file bytes")
            assertTrue(wire.contains("name=\"model\""), "multipart wire is missing the model part header")
            assertTrue(wire.contains("openai/whisper-large-v3"), "multipart wire is missing the model value")
            // F1: the string-backed open-enum scalar `response_format` must arrive as the BARE `verbose_json` in a
            // text/plain part, not the JSON-quoted `"verbose_json"` produced by the generic encode fallback.
            assertTrue(wire.contains("name=\"response_format\""), "multipart wire is missing the response_format part")
            assertTrue(wire.contains("\r\n\r\nverbose_json\r\n"), "response_format value must be bare verbose_json")
            assertFalse(wire.contains("\"verbose_json\""), "response_format value must not be JSON-quoted")
            // F2: the source property is literally named `timestamp_granularities[]`; each element must repeat under
            // that UNCHANGED name with the enum `.value`, never the double-bracketed `timestamp_granularities[][0]`.
            // Parse the wire into ordered (name, value) entries PRESERVING repeats: a lone repeated-name part
            // plus a malformed indexed sibling (e.g. `timestamp_granularities[1]`) must not slip through a
            // substring search.
            val boundary = wire.substringBefore("\r\n")
            val entries =
                wire
                    .split(boundary)
                    .filter { chunk -> chunk.contains("name=\"") }
                    .map { chunk ->
                        val name = requireNotNull(Regex("name=\"([^\"]+)\"").find(chunk)).groupValues[1]
                        name to chunk.substringAfter("\r\n\r\n").removeSuffix("\r\n")
                    }
            assertEquals(
                "verbose_json",
                entries.single { (name, _) -> name == "response_format" }.second,
                "response_format must be the single bare verbose_json part",
            )
            assertEquals(
                listOf("word", "segment"),
                entries.filter { (name, _) -> name == "timestamp_granularities[]" }.map { (_, value) -> value },
                "timestamp_granularities[] must repeat under its UNCHANGED name with the enum values in order",
            )
            assertTrue(
                entries.none { (name, _) ->
                    name.startsWith("timestamp_granularities") && name != "timestamp_granularities[]"
                },
                "no indexed or double-bracketed timestamp_granularities variant may appear: $entries",
            )
            assertTrue(responseBody.closed)
        }

    // ---- helpers -----------------------------------------------------------------------------

    /** Documented wire form: each `data:` field carries the payload JSON itself, not the SSE envelope. */
    private fun messagesStreamEvent(text: String): String =
        "data: {\"type\":\"content_block_delta\"," +
            "\"index\":0,\"delta\":{\"type\":\"text_delta\",\"text\":\"$text\"}}\n\n"

    private fun responsesStreamEvent(text: String): String =
        "data: {\"type\":\"response.output_text.delta\",\"content_index\":0," +
            "\"delta\":\"$text\",\"item_id\":\"item-1\",\"logprobs\":[],\"output_index\":0," +
            "\"sequence_number\":4}\n\n"

    private fun messagesRequest(stream: Boolean): MessagesRequest =
        SdkJson.decodeFromString(
            "{\"model\":\"anthropic/claude-sonnet-4\",\"messages\":[{\"role\":\"user\"," +
                "\"content\":\"Hello, how are you?\"}]" + if (stream) ",\"stream\":true}" else "}",
        )

    private fun responsesRequest(stream: Boolean): ResponsesRequest =
        SdkJson.decodeFromString(
            "{\"model\":\"openai/gpt-4o\",\"input\":\"Tell me a joke\"" +
                if (stream) ",\"stream\":true}" else "}",
        )

    private fun sttRequest(): SttRequest =
        SdkJson.decodeFromString(
            "{\"model\":\"openai/whisper-large-v3\",\"input_audio\":{\"data\":\"UklGRiQA\",\"format\":\"wav\"}}",
        )
}

/**
 * Compile-time proof that the audited allOf intersection reclaimed the refined, non-JSON-blob shapes
 * of the load-bearing properties on the restored schemas. This function is never invoked; it exists
 * so that a regression that drops the reclaimed property (or degrades it back to an untyped blob)
 * fails the consumer compile.
 */
@Suppress("unused", "UNUSED_PARAMETER")
private fun restoredIntersectionReclaims(
    messages: MessagesResult,
    responses: OpenResponsesResult,
    outputItemAdded: StreamEventsResponseOutputItemAdded,
    textDelta: TextDeltaEvent,
    created: OpenResponsesCreatedEvent,
) {
    // Bound to the EXACT generated types: an intersection-reclaimed property that degraded to a blob
    // (JsonElement / Any / a raw list) would fail to compile here, so this is a typed-projection proof,
    // not merely a presence check.
    val messagesUsage: InlineMessagesResultAllOf2UsageX81dc147b = messages.usage
    val responsesOutput: List<OutputItems> = responses.output
    val responsesText: TextExtendedConfig? = responses.text
    val responsesUsage: Usage? = responses.usage
    val responsesServiceTier: String? = responses.serviceTier
    val addedItem: OutputItems = outputItemAdded.item
    val deltaLogprobs: List<StreamLogprob> = textDelta.logprobs
    val createdResponse: OpenResponsesResult = created.response
}

private suspend fun consume(body: SdkRequestBody): ByteArray =
    when (body) {
        is SdkRequestBody.Bytes -> body.bytes
        is SdkRequestBody.OneShot -> consume(body.stream)
        is SdkRequestBody.ReplayFactory -> consume(requireNotNull(body.create()))
    }

private suspend fun consume(stream: SdkByteStream): ByteArray {
    val chunks = mutableListOf<ByteArray>()
    while (true) chunks += stream.readChunk() ?: break
    stream.close()
    return chunks.fold(ByteArray(0), ByteArray::plus)
}
