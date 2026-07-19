package com.nabobery.sdkgen.transport.javahttp

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkConfigurationException
import com.nabobery.sdkgen.runtime.SdkRequestBody
import java.net.http.HttpClient
import java.net.http.HttpClient.Redirect
import java.net.http.HttpClient.Version
import java.net.http.HttpRequest
import java.nio.ByteBuffer
import java.util.concurrent.Flow
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class JavaHttpSdkTransportTest {
    @Test
    fun `client with redirect handling disabled is accepted`() {
        val client = HttpClient.newBuilder().followRedirects(Redirect.NEVER).build()

        JavaHttpSdkTransport(client)
    }

    @Test
    fun `clients that follow redirects are rejected`() {
        listOf(Redirect.NORMAL, Redirect.ALWAYS).forEach { redirectMode ->
            val client = HttpClient.newBuilder().followRedirects(redirectMode).build()

            val failure = assertFailsWith<SdkConfigurationException> { JavaHttpSdkTransport(client) }

            assertTrue(failure.message.orEmpty().contains(redirectMode.name))
        }
    }

    @Test
    fun `capabilities describe HTTP 1 1 client support`() {
        val client = HttpClient.newBuilder().version(Version.HTTP_1_1).build()
        val capabilities = JavaHttpSdkTransport(client).capabilities()

        assertTrue(capabilities.supportsStreaming)
        assertFalse(capabilities.supportsHttp2)
        assertTrue(capabilities.canSetUserAgent)
        assertTrue(capabilities.supportedDeadlines.isEmpty())
    }

    @Test
    fun `capabilities describe HTTP 2 client support`() {
        val client = HttpClient.newBuilder().version(Version.HTTP_2).build()
        val capabilities = JavaHttpSdkTransport(client).capabilities()

        assertTrue(capabilities.supportsStreaming)
        assertTrue(capabilities.supportsHttp2)
        assertTrue(capabilities.canSetUserAgent)
        assertTrue(capabilities.supportedDeadlines.isEmpty())
    }

    @Test
    fun `bytes publisher has exact content length and waits for demand`() {
        val publisher = requestBodyPublisher(SdkRequestBody.Bytes(byteArrayOf(1, 2, 3), "application/octet-stream"))
        val subscriber = RecordingSubscriber()

        publisher.subscribe(subscriber)

        assertEquals(3, publisher.contentLength())
        assertTrue(subscriber.items.isEmpty())
        assertFalse(subscriber.completed)

        subscriber.request(1)

        assertContentEquals(byteArrayOf(1, 2, 3), subscriber.items.single().toByteArray())
        assertTrue(subscriber.completed)
    }

    @Test
    fun `replay factory opens a fresh stream for every subscription`() {
        val creations = AtomicInteger()
        val body =
            SdkRequestBody.ReplayFactory("application/octet-stream") {
                val value = creations.incrementAndGet().toByte()
                SdkRequestBody.OneShot(ChunkStream(listOf(byteArrayOf(value))), "application/octet-stream")
            }
        val publisher = requestBodyPublisher(body)

        val first = RecordingSubscriber().also(publisher::subscribe)
        first.request(1)
        val second = RecordingSubscriber().also(publisher::subscribe)
        second.request(1)

        assertContentEquals(byteArrayOf(1), first.items.single().toByteArray())
        assertContentEquals(byteArrayOf(2), second.items.single().toByteArray())
        assertEquals(2, creations.get())
    }

    @Test
    fun `one shot publisher rejects a second subscription`() {
        val publisher =
            requestBodyPublisher(
                SdkRequestBody.OneShot(
                    ChunkStream(listOf(byteArrayOf(1))),
                    "application/octet-stream",
                    ownership = SdkBodyOwnership.TRANSPORT,
                ),
            )
        val first = RecordingSubscriber().also(publisher::subscribe)
        first.request(1)
        val second = RecordingSubscriber().also(publisher::subscribe)

        second.request(1)

        assertContentEquals(byteArrayOf(1), first.items.single().toByteArray())
        assertFailsWith<IllegalStateException> { throw requireNotNull(second.failure) }
    }

    @Test
    fun `stream publisher emits at most one chunk per request`() {
        val publisher =
            requestBodyPublisher(
                SdkRequestBody.OneShot(
                    ChunkStream(listOf(byteArrayOf(1), byteArrayOf(2))),
                    "application/octet-stream",
                ),
            )
        val subscriber = RecordingSubscriber().also(publisher::subscribe)

        subscriber.request(1)
        assertEquals(1, subscriber.items.size)
        assertFalse(subscriber.completed)

        subscriber.request(1)
        assertEquals(2, subscriber.items.size)

        subscriber.request(1)
        assertTrue(subscriber.completed)
    }

    @Test
    fun `restricted request headers are skipped case insensitively`() {
        val request =
            HttpRequest
                .newBuilder()
                .uri(java.net.URI.create("http://localhost/"))
                .applySdkHeaders(
                    listOf(
                        com.nabobery.sdkgen.runtime
                            .SdkHeader("Host", "example.test"),
                        com.nabobery.sdkgen.runtime
                            .SdkHeader("content-length", "999"),
                        com.nabobery.sdkgen.runtime
                            .SdkHeader("Connection", "close"),
                        com.nabobery.sdkgen.runtime
                            .SdkHeader("X-Test", "one"),
                        com.nabobery.sdkgen.runtime
                            .SdkHeader("x-test", "two"),
                    ),
                ).GET()
                .build()

        assertTrue(request.headers().allValues("Host").isEmpty())
        assertTrue(request.headers().allValues("Content-Length").isEmpty())
        assertTrue(request.headers().allValues("Connection").isEmpty())
        assertEquals(listOf("one", "two"), request.headers().allValues("X-Test"))
    }
}

private class RecordingSubscriber : Flow.Subscriber<ByteBuffer> {
    val items = mutableListOf<ByteBuffer>()
    lateinit var subscription: Flow.Subscription
    var failure: Throwable? = null
    var completed: Boolean = false

    override fun onSubscribe(subscription: Flow.Subscription) {
        this.subscription = subscription
    }

    override fun onNext(item: ByteBuffer) {
        items += item
    }

    override fun onError(throwable: Throwable) {
        failure = throwable
    }

    override fun onComplete() {
        completed = true
    }

    fun request(count: Long) {
        subscription.request(count)
    }
}

private class ChunkStream(
    chunks: List<ByteArray>,
) : SdkByteStream {
    private val remaining = chunks.map(ByteArray::copyOf).toMutableList()

    override suspend fun readChunk(maxBytes: Int): ByteArray? = remaining.removeFirstOrNull()

    override fun close(cause: Throwable?) = Unit
}

private fun ByteBuffer.toByteArray(): ByteArray = ByteArray(remaining()).also(::get)
