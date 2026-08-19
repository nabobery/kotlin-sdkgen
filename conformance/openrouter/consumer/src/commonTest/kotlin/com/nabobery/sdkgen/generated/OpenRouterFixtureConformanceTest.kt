package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.chat.ChatClient
import com.nabobery.sdkgen.generated.chat.ChatClient.SendChatCompletionRequestResponse
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.PolicyOverride
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkAuthenticationException
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.runtime.bodies.MultipartBody
import com.nabobery.sdkgen.runtime.bodies.TransferEvent
import com.nabobery.sdkgen.runtime.bodies.TransferObserver
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import com.nabobery.sdkgen.testing.assertClosedWith
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
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
    fun generatedModelsPagesWalksOffsetAndStopsOnAShortPage() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        body = FakeByteStream(listOf(modelsPage("model-1", "model-2").encodeToByteArray())),
                    ).enqueueResponse(
                        200,
                        body = FakeByteStream(listOf(modelsPage("model-3").encodeToByteArray())),
                    )

            val pages =
                OpenRouterClient(
                    transport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).models.getModelsPages(limit = 2).toList()

            assertEquals(
                listOf(listOf("model-1", "model-2"), listOf("model-3")),
                pages.map { page -> page.items.map { it.id } },
            )
            assertEquals(listOf(true, false), pages.map { it.hasNext })
            assertEquals(
                listOf(
                    "https://openrouter.test/models?limit=2",
                    "https://openrouter.test/models?limit=2&offset=2",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    @Test
    fun generatedFilesPagesThreadsTheResponseCursor() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        body = FakeByteStream(listOf(filesPage("file-1", "next").encodeToByteArray())),
                    ).enqueueResponse(
                        200,
                        body = FakeByteStream(listOf(filesPage("file-2", null).encodeToByteArray())),
                    )

            val pages =
                OpenRouterClient(
                    transport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).files.listFilesPages(limit = 1).toList()

            assertEquals(listOf(listOf("file-1"), listOf("file-2")), pages.map { page -> page.items.map { it.id } })
            assertEquals(listOf(true, false), pages.map { it.hasNext })
            assertEquals(
                listOf(
                    "https://openrouter.test/files?limit=1",
                    "https://openrouter.test/files?cursor=next&limit=1",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    @Test
    fun generatedFilesItemsFlattensPagesAcrossTheCursorWalk() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        body = FakeByteStream(listOf(filesPage("file-1", "next").encodeToByteArray())),
                    ).enqueueResponse(
                        200,
                        body = FakeByteStream(listOf(filesPage("file-2", null).encodeToByteArray())),
                    )

            val items =
                OpenRouterClient(
                    transport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).files.listFilesItems(limit = 1).toList()

            assertEquals(listOf("file-1", "file-2"), items.map { it.id })
            assertEquals(
                listOf(
                    "https://openrouter.test/files?limit=1",
                    "https://openrouter.test/files?cursor=next&limit=1",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    @Test
    fun generatedChatStreamPreservesRequestFlagAndDecodesHostileChunks() =
        runTest {
            val firstEvent = chatStreamEvent("hé")
            val secondEvent = chatStreamEvent("llo")
            val preSentinelBytes = (firstEvent + secondEvent + "data: [DONE]\n\n").encodeToByteArray()
            val utf8Split = firstEvent.indexOf("é").let { firstEvent.substring(0, it).encodeToByteArray().size + 1 }
            val eventSplit = firstEvent.encodeToByteArray().size + secondEvent.encodeToByteArray().size / 2
            val preSentinelChunks =
                listOf(
                    preSentinelBytes.copyOfRange(0, utf8Split),
                    preSentinelBytes.copyOfRange(utf8Split, eventSplit),
                    preSentinelBytes.copyOfRange(eventSplit, preSentinelBytes.size),
                )
            val unexpectedPostDoneRead = IllegalStateException("Post-[DONE] chat chunk was read")
            val stream =
                FakeByteStream(
                    chunks = preSentinelChunks + listOf(chatStreamEvent("poison").encodeToByteArray()),
                    failure = unexpectedPostDoneRead,
                    failAtRead = preSentinelChunks.size,
                )
            val transport =
                FakeTransport(
                    TransportCapabilities(supportsStreaming = true),
                ).enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Content-Type", "text/event-stream")),
                    body = stream,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            val request = chatRequestWithStream()
            val events = client.chat.sendChatCompletionRequestStream(request).toList()

            assertEquals(listOf("hé", "llo"), events.map { it.data.choices.single().delta.content })
            assertEquals("sendChatCompletionRequest", transport.capturedRequests.single().operationId)
            val requestBody = consume(requireNotNull(transport.capturedRequests.single().body)).decodeToString()
            assertEquals(SdkJson.encodeToString(request), requestBody)
            assertTrue(requestBody.contains("\"stream\":true"))
            assertTrue(stream.closed)
        }

    @Test
    fun generatedChatStreamCancellationClosesWithSameCause() =
        runTest {
            val cancellation = CancellationException("stop after first event")
            val stream =
                FakeByteStream(
                    listOf((chatStreamEvent("first") + chatStreamEvent("second")).encodeToByteArray()),
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
                client.chat.sendChatCompletionRequestStream(chatRequestWithStream()).collect {
                    throw cancellation
                }
            }.also { assertSame(cancellation, it) }

            stream.assertClosedWith(cancellation)
        }

    @Test
    fun generatedChatStreamNonSuccessIsTypedApiException() =
        runTest {
            val body =
                FakeByteStream(listOf("{\"error\":{\"code\":400,\"message\":\"bad model\"}}".encodeToByteArray()))
            val transport =
                FakeTransport(TransportCapabilities(supportsStreaming = true)).enqueueResponse(
                    400,
                    headers = listOf(SdkHeader("Content-Type", "application/json")),
                    body = body,
                )
            val client =
                OpenRouterClient(transport, "https://openrouter.test", authentication = SdkAuthentication { it })

            val failure =
                assertFailsWith<com.nabobery.sdkgen.generated.chat.ChatClient.SendChatCompletionRequestApiException> {
                    client.chat.sendChatCompletionRequestStream(chatRequestWithStream()).toList()
                }

            assertEquals(400, failure.statusCode)
            val error =
                assertIs<ChatClient.SendChatCompletionRequestResponse.Http400Json>(failure.error)
            assertEquals(400, error.json.error.code)
            assertEquals("bad model", error.json.error.message)
            body.assertClosedWith(failure)
        }

    @Test
    fun generatedImagesStreamSurfacesInBandErrorValueAndClosesAtDone() =
        runTest {
            val preSentinelRaw =
                "data: {\"data\":{\"error\":{\"message\":\"provider failed\"," +
                    "\"code\":\"bad_request\"},\"type\":\"error\"}}\n\n" +
                    "data: [DONE]\n\n"
            val preSentinelChunks =
                preSentinelRaw.encodeToByteArray().toList().chunked(5).map { it.toByteArray() }
            val poisonChunk =
                (
                    "data: {\"data\":{\"error\":{\"message\":\"poison\",\"code\":\"poison\"}," +
                        "\"type\":\"error\"}}\n\n"
                ).encodeToByteArray()
            val unexpectedPostDoneRead = IllegalStateException("Post-[DONE] images chunk was read")
            val stream =
                FakeByteStream(
                    chunks = preSentinelChunks + listOf(poisonChunk),
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

            val event = client.images.createImagesStream(imageRequestWithStream()).toList().single()

            val error = requireNotNull(event.data.imageGenStreamErrorEvent)
            assertEquals("provider failed", error.error.message)
            assertEquals("bad_request", error.error.code)
            assertEquals("error", error.type.value)
            assertTrue(stream.closed)
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

    private fun chatStreamEvent(content: String): String =
        "data: {\"data\":{\"choices\":[{\"delta\":{\"content\":\"$content\"},\"finish_reason\":null,\"index\":0}]," +
            "\"created\":1,\"id\":\"chat-1\",\"model\":\"test\",\"object\":\"chat.completion.chunk\"}}\n\n"

    private fun chatRequestWithStream(): ChatRequest =
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
            stream = true
        }

    private fun imageRequestWithStream(): ImageGenerationRequest =
        imageGenerationRequest {
            model = "openai/dall-e-3"
            prompt = "a test image"
            stream = true
        }

    private fun modelsPage(vararg ids: String): String =
        SdkJson.encodeToString(
            buildJsonObject {
                put("data", buildJsonArray { ids.forEach { add(modelJson(it)) } })
                put("links", buildJsonObject { put("next", JsonNull) })
                put("total_count", ids.size)
            },
        )

    private fun modelJson(id: String): JsonObject =
        buildJsonObject {
            put(
                "architecture",
                buildJsonObject {
                    put("input_modalities", buildJsonArray { add(JsonPrimitive("text")) })
                    put("instruct_type", JsonNull)
                    put("modality", "text->text")
                    put("output_modalities", buildJsonArray { add(JsonPrimitive("text")) })
                    put("tokenizer", "GPT")
                },
            )
            put("canonical_slug", id)
            put("context_length", 128000)
            put("created", 1)
            put("default_parameters", JsonNull)
            put("expiration_date", JsonNull)
            put("id", id)
            put("knowledge_cutoff", JsonNull)
            put("links", buildJsonObject { put("details", "/api/v1/models/$id/endpoints") })
            put("name", id)
            put("per_request_limits", JsonNull)
            put("pricing", buildJsonObject { put("completion", "0"); put("prompt", "0") })
            put("supported_parameters", buildJsonArray {})
            put("supported_voices", JsonNull)
            put("top_provider", buildJsonObject { put("is_moderated", false) })
        }

    private fun filesPage(id: String, cursor: String?): String =
        SdkJson.encodeToString(
            buildJsonObject {
                put("cursor", cursor?.let(::JsonPrimitive) ?: JsonNull)
                put(
                    "data",
                    buildJsonArray {
                        add(
                            buildJsonObject {
                                put("created_at", "2025-01-01T00:00:00Z")
                                put("downloadable", false)
                                put("filename", "$id.txt")
                                put("id", id)
                                put("mime_type", "text/plain")
                                put("size_bytes", 1)
                                put("type", "file")
                            },
                        )
                    },
                )
                put("first_id", id)
                put("has_more", cursor != null)
                put("last_id", id)
            },
        )

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
