package io.github.nabobery.sdkgen.generated

import com.nabobery.sdkgen.runtime.RedirectCapability
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.StreamingDescriptor
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.runtime.bodies.MultipartBody
import com.nabobery.sdkgen.runtime.streaming.sseFlow
import com.nabobery.sdkgen.transport.javahttp.JavaHttpSdkTransport
import com.nabobery.sdkgen.transport.ktor.KtorSdkTransport
import com.nabobery.sdkgen.transport.okhttp.OkHttpSdkTransport
import com.sun.net.httpserver.HttpExchange
import com.sun.net.httpserver.HttpServer
import io.ktor.client.HttpClient
import io.ktor.client.engine.java.Java
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import okhttp3.OkHttpClient
import java.net.InetSocketAddress
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import java.net.http.HttpClient as JdkHttpClient

class OpenRouterAdapterConformanceTest {
    @Test
    fun generatedFixturesAndCapabilitiesRunThroughKtor() =
        withServer { baseUri ->
            HttpClient(Java).use { client ->
                exerciseAdapter(
                    KtorSdkTransport(
                        client,
                        TransportCapabilities(supportsStreaming = true, supportsHttp2 = true, canSetUserAgent = true),
                    ),
                    baseUri,
                    expectedHttp2 = true,
                )
            }
        }

    @Test
    fun generatedFixturesAndCapabilitiesRunThroughOkHttp() =
        withServer { baseUri ->
            val client = OkHttpClient.Builder().protocols(listOf(okhttp3.Protocol.HTTP_1_1)).build()
            exerciseAdapter(OkHttpSdkTransport(client), baseUri, expectedHttp2 = false)
            client.dispatcher.executorService.shutdown()
            client.connectionPool.evictAll()
        }

    @Test
    fun generatedFixturesAndCapabilitiesRunThroughJavaHttp() =
        withServer { baseUri ->
            val client =
                JdkHttpClient
                    .newBuilder()
                    .followRedirects(JdkHttpClient.Redirect.NEVER)
                    .version(JdkHttpClient.Version.HTTP_1_1)
                    .build()
            exerciseAdapter(JavaHttpSdkTransport(client), baseUri, expectedHttp2 = false)
        }

    private fun exerciseAdapter(
        transport: SdkTransport,
        baseUri: String,
        expectedHttp2: Boolean,
    ) = runBlocking {
        val client = OpenRouterClient(transport, baseUri, authentication = SdkAuthentication { it })

        val chat = client.chat.sendChatCompletionRequest(chatRequest())
        assertEquals("adapter-chat", chat.id)

        val binary = client.files.downloadFileContent("fixture")
        assertContentEquals(byteArrayOf(0, 1, 2, 3), consumeAdapterStream(binary))

        val multipart =
            MultipartBody(boundaryProvider = { "adapter-boundary" })
                .text("model", "whisper-1")
                .bytes("input_audio", byteArrayOf(7, 8, 9), filename = "audio.wav")
                .build()
        val multipartResponse =
            transport.execute(
                request(
                    method = "POST",
                    uri = "$baseUri/multipart",
                    body = multipart,
                    responseMode = SdkResponseMode.BUFFERED,
                    operationId = "multipart-fixture",
                ),
            )
        assertEquals(200, multipartResponse.statusCode)
        assertContentEquals("ok".encodeToByteArray(), consumeAdapterStream(multipartResponse.body))

        val events =
            sseFlow(
                streamProvider = {
                    transport
                        .execute(
                            request(
                                method = "GET",
                                uri = "$baseUri/events",
                                responseMode = SdkResponseMode.STREAMING,
                                operationId = "sse-fixture",
                            ),
                        ).body
                },
                descriptor = StreamingDescriptor.ServerSentEvents(),
            ).toList()
        assertEquals(listOf("first", "second"), events.map { it.data })

        val capabilities = transport.capabilities()
        assertTrue(capabilities.supportsStreaming)
        assertEquals(RedirectCapability.UNSUPPORTED, capabilities.redirects)
        assertTrue(capabilities.supportedDeadlines.isEmpty())
        assertEquals(expectedHttp2, capabilities.supportsHttp2)
        assertTrue(capabilities.canSetUserAgent)
    }

    private fun request(
        method: String,
        uri: String,
        body: SdkRequestBody? = null,
        responseMode: SdkResponseMode,
        operationId: String,
    ): SdkRequest =
        SdkRequest(
            method = method,
            uri = uri,
            headers =
                buildList {
                    body?.contentType?.let { add(SdkHeader("Content-Type", it)) }
                },
            body = body,
            expectedResponseMode = responseMode,
            deadlines = SdkDeadlines(totalMillis = 5_000, attemptMillis = 5_000, idleMillis = 5_000),
            operationId = operationId,
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

private fun <T> withServer(block: (String) -> T): T {
    val server = HttpServer.create(InetSocketAddress("127.0.0.1", 0), 0)
    server.createContext("/") { exchange -> exchange.respond() }
    server.start()
    return try {
        block("http://127.0.0.1:${server.address.port}")
    } finally {
        server.stop(0)
    }
}

private fun HttpExchange.respond() {
    val (contentType, response) =
        when (requestURI.path) {
            "/chat/completions" -> {
                "application/json" to
                    (
                        "{\"choices\":[],\"created\":1,\"id\":\"adapter-chat\",\"model\":\"test\"," +
                            "\"object\":\"chat.completion\",\"system_fingerprint\":null}"
                    ).encodeToByteArray()
            }

            "/files/fixture/content" -> {
                "application/octet-stream" to byteArrayOf(0, 1, 2, 3)
            }

            "/multipart" -> {
                val request = requestBody.readAllBytes().decodeToString()
                check(request.contains("name=\"input_audio\"; filename=\"audio.wav\""))
                "text/plain" to "ok".encodeToByteArray()
            }

            "/events" -> {
                "text/event-stream" to "data: first\n\ndata: second\n\n".encodeToByteArray()
            }

            else -> {
                error("Unexpected adapter fixture path: ${requestURI.path}")
            }
        }
    responseHeaders.add("Content-Type", contentType)
    sendResponseHeaders(200, response.size.toLong())
    responseBody.use { it.write(response) }
}

private suspend fun consumeAdapterStream(stream: com.nabobery.sdkgen.runtime.SdkByteStream): ByteArray {
    val chunks = mutableListOf<ByteArray>()
    while (true) chunks += stream.readChunk() ?: break
    stream.close()
    return chunks.fold(ByteArray(0), ByteArray::plus)
}
