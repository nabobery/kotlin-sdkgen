package com.nabobery.sdkgen.transport.okhttp

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkConfigurationException
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransportException
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import mockwebserver3.MockResponse
import mockwebserver3.MockWebServer
import okhttp3.Call
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.Response
import okhttp3.ResponseBody
import okhttp3.ResponseBody.Companion.toResponseBody
import okio.Buffer
import okio.ForwardingSource
import okio.IOException
import okio.buffer
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class OkHttpSdkTransportTest {
    @Test
    fun preResponseIOExceptionIsPreservedByIdentity() {
        val injected = IOException("injected")
        val client =
            OkHttpClient
                .Builder()
                .addInterceptor(Interceptor { throw injected })
                .build()
        val failure =
            kotlin.test.assertFailsWith<SdkTransportException> {
                runBlocking { OkHttpSdkTransport(client).execute(request("http://127.0.0.1/identity")) }
            }
        assertSame(injected, failure.cause)
        kotlin.test.assertTrue(
            failure.requestMayHaveReachedServer,
            "An IOException that does not prove a connect-phase failure must stay conservatively 'may have reached'",
        )
    }

    @Test
    fun wrappedConnectExceptionRemainsConservativelyMayHaveReached() {
        val injected = IOException("interceptor failure", java.net.ConnectException("nested connect-shaped cause"))
        val client =
            OkHttpClient
                .Builder()
                .addInterceptor(Interceptor { throw injected })
                .build()
        val failure =
            kotlin.test.assertFailsWith<SdkTransportException> {
                runBlocking { OkHttpSdkTransport(client).execute(request("http://127.0.0.1/connect-refused")) }
            }
        assertSame(injected, failure.cause)
        assertTrue(
            failure.requestMayHaveReachedServer,
            "An interceptor wrapper does not prove that its nested connect-shaped cause happened before send",
        )
    }

    @Test
    fun streamingResponseCancelsConfiguredCallTimeout() {
        val server = MockWebServer()
        server.enqueue(
            MockResponse
                .Builder()
                .body("stream-completed")
                .bodyDelay(300, TimeUnit.MILLISECONDS)
                .build(),
        )
        server.start()
        val client = OkHttpClient.Builder().callTimeout(100, TimeUnit.MILLISECONDS).build()
        try {
            val response =
                runBlocking {
                    OkHttpSdkTransport(client).execute(
                        request(server.url("/stream").toString(), mode = SdkResponseMode.STREAMING),
                    )
                }
            val bytes = runBlocking { response.body.readChunk(64) }
            assertContentEquals("stream-completed".encodeToByteArray(), bytes)
            response.body.close()
        } finally {
            client.connectionPool.evictAll()
            client.dispatcher.executorService.shutdownNow()
            server.close()
        }
    }

    @Test
    fun replayFactoryOpensFreshContentForEverySend() {
        val server = MockWebServer()
        server.enqueue(MockResponse.Builder().code(204).build())
        server.enqueue(MockResponse.Builder().code(204).build())
        server.start()
        var creations = 0
        val body =
            SdkRequestBody.ReplayFactory("text/plain", 6) {
                creations += 1
                SdkRequestBody.Bytes("replay".encodeToByteArray(), "text/plain")
            }
        val client = OkHttpClient()
        val transport = OkHttpSdkTransport(client)
        try {
            repeat(2) {
                runBlocking {
                    transport.execute(request(server.url("/replay").toString(), "POST", body = body)).body.close()
                }
            }
            assertEquals(2, creations)
            repeat(2) {
                assertContentEquals("replay".encodeToByteArray(), server.takeRequest().body?.toByteArray())
            }
        } finally {
            client.connectionPool.evictAll()
            client.dispatcher.executorService.shutdownNow()
            server.close()
        }
    }

    @Test
    fun getAndHeadBodiesFailWithTypedConfigurationErrors() {
        val client = OkHttpClient()
        try {
            listOf("GET", "HEAD").forEach { method ->
                val failure =
                    assertFailsWith<SdkConfigurationException> {
                        runBlocking {
                            OkHttpSdkTransport(client).execute(
                                request(
                                    "http://127.0.0.1/invalid-body",
                                    method = method,
                                    body = SdkRequestBody.Bytes("body".encodeToByteArray(), "text/plain"),
                                ),
                            )
                        }
                    }
                assertEquals("okhttp-specific", failure.operationId)
                assertTrue(failure.message.orEmpty().contains(method))
            }
        } finally {
            client.connectionPool.evictAll()
            client.dispatcher.executorService.shutdownNow()
        }
    }

    @Test
    fun closeIsIdempotentAndCancelsTheCall() {
        lateinit var call: Call
        var sourceCloses = 0
        val client =
            OkHttpClient
                .Builder()
                .addInterceptor(
                    Interceptor { chain ->
                        call = chain.call()
                        Response
                            .Builder()
                            .request(chain.request())
                            .protocol(Protocol.HTTP_1_1)
                            .code(200)
                            .message("OK")
                            .body(
                                object : ResponseBody() {
                                    override fun contentType(): okhttp3.MediaType? = null

                                    override fun contentLength(): Long = -1L

                                    override fun source() =
                                        object : ForwardingSource(Buffer().writeUtf8("body")) {
                                            override fun close() {
                                                sourceCloses += 1
                                                super.close()
                                            }
                                        }.buffer()
                                },
                            ).build()
                    },
                ).build()
        try {
            val body = runBlocking { OkHttpSdkTransport(client).execute(request("http://127.0.0.1/close")) }.body

            body.close()
            body.close()

            assertEquals(1, sourceCloses)
            assertTrue(call.isCanceled())
        } finally {
            client.connectionPool.evictAll()
            client.dispatcher.executorService.shutdownNow()
        }
    }

    @Test
    fun responseStreamCloseObserverRetainsFirstCauseIdentity() {
        val observed = mutableListOf<Throwable?>()
        val client =
            OkHttpClient
                .Builder()
                .addInterceptor(
                    Interceptor { chain ->
                        Response
                            .Builder()
                            .request(chain.request())
                            .protocol(Protocol.HTTP_1_1)
                            .code(200)
                            .message("OK")
                            .body("body".toResponseBody())
                            .build()
                    },
                ).build()
        try {
            val body =
                runBlocking {
                    OkHttpSdkTransport(client, observed::add).execute(request("http://127.0.0.1/close-cause")).body
                }
            val first = IllegalArgumentException("decode failed")
            body.close(first)
            body.close(IllegalStateException("ignored"))
            assertEquals(1, observed.size)
            assertSame(first, observed.single())
        } finally {
            close(client)
        }
    }

    @Test
    fun closeSerializesResponseBodyCloseAfterInFlightRead() {
        lateinit var call: Call
        val readStarted = CountDownLatch(1)
        val reading = AtomicBoolean(false)
        val closeOverlappedRead = AtomicBoolean(false)
        val client =
            OkHttpClient
                .Builder()
                .addInterceptor(
                    Interceptor { chain ->
                        call = chain.call()
                        Response
                            .Builder()
                            .request(chain.request())
                            .protocol(Protocol.HTTP_1_1)
                            .code(200)
                            .message("OK")
                            .body(
                                object : ResponseBody() {
                                    override fun contentType(): okhttp3.MediaType? = null

                                    override fun contentLength(): Long = -1L

                                    override fun source() =
                                        object : ForwardingSource(Buffer()) {
                                            override fun read(
                                                sink: Buffer,
                                                byteCount: Long,
                                            ): Long {
                                                reading.set(true)
                                                readStarted.countDown()
                                                try {
                                                    while (!call.isCanceled()) Thread.yield()
                                                    throw IOException("cancelled read")
                                                } finally {
                                                    reading.set(false)
                                                }
                                            }

                                            override fun close() {
                                                if (reading.get()) closeOverlappedRead.set(true)
                                                super.close()
                                            }
                                        }.buffer()
                                },
                            ).build()
                    },
                ).build()
        try {
            runBlocking {
                val body = OkHttpSdkTransport(client).execute(request("http://127.0.0.1/race")).body
                val read = async(Dispatchers.Default) { assertFailsWith<SdkTransportException> { body.readChunk() } }
                assertTrue(readStarted.await(5, TimeUnit.SECONDS), "Response read did not start")
                body.close(CancellationException("consumer stopped"))
                read.await()
            }
            assertFalse(closeOverlappedRead.get(), "responseBody.close raced with source.read")
        } finally {
            close(client)
        }
    }

    @Test
    fun executeDoesNotFollowRedirectsWithDefaultCallerClient() {
        assertSingleRedirectExchange(OkHttpClient())
    }

    @Test
    fun executeDoesNotFollowRedirectsWithRedirectConfiguredCallerClient() {
        assertSingleRedirectExchange(
            OkHttpClient
                .Builder()
                .followRedirects(true)
                .followSslRedirects(true)
                .build(),
        )
    }

    @Test
    fun transportOwnedOneShotClosesOnSuccess() {
        val stream = TrackingByteStream(listOf("owned".encodeToByteArray()))
        val server = MockWebServer()
        server.enqueue(MockResponse.Builder().code(204).build())
        server.start()
        val client = OkHttpClient()
        try {
            val body =
                SdkRequestBody.OneShot(
                    stream,
                    "text/plain",
                    ownership = SdkBodyOwnership.TRANSPORT,
                )
            runBlocking {
                OkHttpSdkTransport(client)
                    .execute(request(server.url("/owned-success").toString(), "POST", body = body))
                    .body
                    .close()
            }
            assertEquals(1, stream.closeCount)
            assertEquals(null, stream.closeCause)
        } finally {
            close(client, server)
        }
    }

    @Test
    fun runtimeOwnedOneShotIsNeverClosedOnSuccess() {
        val stream = TrackingByteStream(listOf("runtime".encodeToByteArray()))
        val server = MockWebServer()
        server.enqueue(MockResponse.Builder().code(204).build())
        server.start()
        val client = OkHttpClient()
        try {
            val body =
                SdkRequestBody.OneShot(
                    stream,
                    "text/plain",
                    ownership = SdkBodyOwnership.RUNTIME,
                )
            runBlocking {
                OkHttpSdkTransport(client)
                    .execute(request(server.url("/runtime-success").toString(), "POST", body = body))
                    .body
                    .close()
            }
            assertEquals(0, stream.closeCount)
        } finally {
            close(client, server)
        }
    }

    @Test
    fun transportOwnedOneShotClosesWhenSendFailsBeforeWrite() {
        val injected = IOException("before write")
        val stream = TrackingByteStream(listOf("unused".encodeToByteArray()))
        val client =
            OkHttpClient
                .Builder()
                .addInterceptor(Interceptor { throw injected })
                .build()
        val body = SdkRequestBody.OneShot(stream, "text/plain", ownership = SdkBodyOwnership.TRANSPORT)
        try {
            val failure =
                assertFailsWith<SdkTransportException> {
                    runBlocking {
                        OkHttpSdkTransport(client).execute(request("http://127.0.0.1/pre-write", "POST", body = body))
                    }
                }
            assertSame(injected, failure.cause)
            assertEquals(1, stream.closeCount)
            assertSame(injected, stream.closeCause)
        } finally {
            close(client)
        }
    }

    @Test
    fun runtimeOwnedOneShotRemainsOpenWhenSendFailsBeforeWrite() {
        val stream = TrackingByteStream(listOf("unused".encodeToByteArray()))
        val client =
            OkHttpClient
                .Builder()
                .addInterceptor(Interceptor { throw IOException("before write") })
                .build()
        val body = SdkRequestBody.OneShot(stream, "text/plain", ownership = SdkBodyOwnership.RUNTIME)
        try {
            assertFailsWith<SdkTransportException> {
                runBlocking {
                    OkHttpSdkTransport(client).execute(request("http://127.0.0.1/pre-write", "POST", body = body))
                }
            }
            assertEquals(0, stream.closeCount)
        } finally {
            close(client)
        }
    }

    @Test
    fun replayFactoryProducedTransportOwnedOneShotIsClosed() {
        val stream = TrackingByteStream(listOf("replayed".encodeToByteArray()))
        val server = MockWebServer()
        server.enqueue(MockResponse.Builder().code(204).build())
        server.start()
        val client = OkHttpClient()
        try {
            val body =
                SdkRequestBody.ReplayFactory("text/plain", 8) {
                    SdkRequestBody.OneShot(stream, "text/plain", ownership = SdkBodyOwnership.TRANSPORT)
                }
            runBlocking {
                OkHttpSdkTransport(client)
                    .execute(request(server.url("/replay-one-shot").toString(), "POST", body = body))
                    .body
                    .close()
            }
            assertEquals(1, stream.closeCount)
        } finally {
            close(client, server)
        }
    }

    @Test
    fun capabilitiesDeriveHttp2SupportFromCallerProtocols() {
        val http1Only = OkHttpClient.Builder().protocols(listOf(Protocol.HTTP_1_1)).build()
        val http2 = OkHttpClient.Builder().protocols(listOf(Protocol.HTTP_2, Protocol.HTTP_1_1)).build()
        try {
            assertFalse(OkHttpSdkTransport(http1Only).capabilities().supportsHttp2)
            assertTrue(OkHttpSdkTransport(http2).capabilities().supportsHttp2)
        } finally {
            close(http1Only)
            close(http2)
        }
    }

    @Test
    fun capabilitiesExposeExpectedOkHttpFeatures() {
        val client = OkHttpClient()
        try {
            val capabilities = OkHttpSdkTransport(client).capabilities()
            assertTrue(capabilities.supportsStreaming)
            assertTrue(capabilities.supportsHttp2)
            assertTrue(capabilities.canSetUserAgent)
            assertTrue(capabilities.supportedDeadlines.isEmpty())
        } finally {
            close(client)
        }
    }
}

private fun assertSingleRedirectExchange(client: OkHttpClient) {
    val callerFollowRedirects = client.followRedirects
    val callerFollowSslRedirects = client.followSslRedirects
    val server = MockWebServer()
    server.enqueue(
        MockResponse
            .Builder()
            .code(302)
            .addHeader("Location", "/redirected")
            .body("redirect")
            .build(),
    )
    server.enqueue(
        MockResponse
            .Builder()
            .code(200)
            .body("followed")
            .build(),
    )
    server.start()
    try {
        val response = runBlocking { OkHttpSdkTransport(client).execute(request(server.url("/start").toString())) }
        assertEquals(302, response.statusCode)
        response.body.close()
        assertEquals(1, server.requestCount)
        assertEquals(callerFollowRedirects, client.followRedirects)
        assertEquals(callerFollowSslRedirects, client.followSslRedirects)
    } finally {
        close(client, server)
    }
}

private fun close(
    client: OkHttpClient,
    server: MockWebServer? = null,
) {
    client.connectionPool.evictAll()
    client.dispatcher.executorService.shutdownNow()
    server?.close()
}

private class TrackingByteStream(
    chunks: List<ByteArray>,
) : SdkByteStream {
    private val remaining = ArrayDeque(chunks)

    var closeCount: Int = 0
        private set
    var closeCause: Throwable? = null
        private set

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0)
        return remaining.removeFirstOrNull()
    }

    override fun close(cause: Throwable?) {
        closeCount += 1
        if (closeCount == 1) closeCause = cause
    }
}

private fun request(
    url: String,
    method: String = "GET",
    mode: SdkResponseMode = SdkResponseMode.BUFFERED,
    body: SdkRequestBody? = null,
): SdkRequest =
    SdkRequest(
        method = method,
        uri = url,
        headers = emptyList(),
        body = body,
        expectedResponseMode = mode,
        deadlines = SdkDeadlines(null, null, null),
        operationId = "okhttp-specific",
    )
