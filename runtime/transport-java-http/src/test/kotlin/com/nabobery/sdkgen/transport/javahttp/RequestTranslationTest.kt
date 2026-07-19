package com.nabobery.sdkgen.transport.javahttp

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseMode
import java.nio.ByteBuffer
import java.util.concurrent.Flow
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RequestTranslationTest {
    @Test
    fun `restricted headers are omitted while repeated ordinary headers are preserved`() {
        val translated =
            request(
                headers =
                    listOf(
                        SdkHeader("Host", "forbidden.example"),
                        SdkHeader("Content-Length", "999"),
                        SdkHeader("Connection", "close"),
                        SdkHeader("X-Repeat", "one"),
                        SdkHeader("x-repeat", "two"),
                        SdkHeader("User-Agent", "sdkgen-test"),
                    ),
                body = SdkRequestBody.Bytes("body".encodeToByteArray(), "text/plain"),
            ).toHttpRequest()

        assertFalse(
            translated
                .headers()
                .map()
                .keys
                .any { it.equals("Host", ignoreCase = true) },
        )
        assertFalse(
            translated
                .headers()
                .map()
                .keys
                .any { it.equals("Content-Length", ignoreCase = true) },
        )
        assertFalse(
            translated
                .headers()
                .map()
                .keys
                .any { it.equals("Connection", ignoreCase = true) },
        )
        assertEquals(listOf("one", "two"), translated.headers().allValues("X-Repeat"))
        assertEquals("sdkgen-test", translated.headers().firstValue("User-Agent").orElseThrow())
        assertEquals(4, translated.bodyPublisher().orElseThrow().contentLength())
    }

    @Test
    fun `replay factory opens a fresh body for each subscription`() {
        var creations = 0
        val publisher =
            requestBodyPublisher(
                SdkRequestBody.ReplayFactory("application/octet-stream", 1) {
                    creations += 1
                    SdkRequestBody.Bytes(byteArrayOf(creations.toByte()), "application/octet-stream")
                },
            )

        assertContentEquals(byteArrayOf(1), publisher.collectAll())
        assertContentEquals(byteArrayOf(2), publisher.collectAll())
        assertEquals(2, creations)
    }

    @Test
    fun `one shot publisher rejects a second subscription`() {
        val stream = RecordingStream(listOf("once".encodeToByteArray()))
        val publisher = requestBodyPublisher(SdkRequestBody.OneShot(stream, "text/plain"))

        assertContentEquals("once".encodeToByteArray(), publisher.collectAll())
        val failure = assertFailsWith<IllegalStateException> { publisher.collectAll() }
        assertTrue(failure.message.orEmpty().contains("only once"))
        assertTrue(stream.closed)
    }

    @Test
    fun `body publisher emits nothing before demand`() {
        val publisher = requestBodyPublisher(SdkRequestBody.Bytes("abc".encodeToByteArray(), "text/plain"))
        val subscriber = DemandRecordingSubscriber()

        publisher.subscribe(subscriber)
        assertTrue(subscriber.items.isEmpty())
        assertFalse(subscriber.completed)

        subscriber.subscription.request(1)
        subscriber.awaitTerminal()
        assertContentEquals("abc".encodeToByteArray(), subscriber.items.single().toByteArray())
    }
}

private fun request(
    headers: List<SdkHeader> = emptyList(),
    body: SdkRequestBody? = null,
): SdkRequest =
    SdkRequest(
        method = "POST",
        uri = "https://example.test/resource",
        headers = headers,
        body = body,
        expectedResponseMode = SdkResponseMode.BUFFERED,
        deadlines = SdkDeadlines(null, null, null),
        operationId = "request-translation",
    )

private class RecordingStream(
    chunks: List<ByteArray>,
) : SdkByteStream {
    private val chunks = ArrayDeque(chunks)
    var closed: Boolean = false

    override suspend fun readChunk(maxBytes: Int): ByteArray? = chunks.removeFirstOrNull()

    override fun close(cause: Throwable?) {
        closed = true
    }
}

private class DemandRecordingSubscriber : Flow.Subscriber<ByteBuffer> {
    val items = mutableListOf<ByteBuffer>()
    lateinit var subscription: Flow.Subscription
    var completed: Boolean = false
    var failure: Throwable? = null

    override fun onSubscribe(subscription: Flow.Subscription) {
        this.subscription = subscription
    }

    override fun onNext(item: ByteBuffer) {
        items += item
    }

    override fun onError(throwable: Throwable) {
        failure = throwable
        completed = true
    }

    override fun onComplete() {
        completed = true
    }

    fun awaitTerminal() {
        repeat(1_000) {
            if (completed) return
            Thread.sleep(1)
        }
        error("publisher did not terminate")
    }
}

private fun Flow.Publisher<ByteBuffer>.collectAll(): ByteArray {
    val subscriber = DemandRecordingSubscriber()
    subscribe(subscriber)
    subscriber.subscription.request(Long.MAX_VALUE)
    subscriber.awaitTerminal()
    subscriber.failure?.let { throw it }
    return subscriber.items.fold(ByteArray(0)) { accumulated, buffer -> accumulated + buffer.toByteArray() }
}

private fun ByteBuffer.toByteArray(): ByteArray = ByteArray(remaining()).also(::get)
