package com.nabobery.sdkgen.transport.javahttp

import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransportException
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelAndJoin
import kotlinx.coroutines.runBlocking
import java.net.Authenticator
import java.net.CookieHandler
import java.net.ProxySelector
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpConnectTimeoutException
import java.net.http.HttpHeaders
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.ByteBuffer
import java.time.Duration
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.concurrent.Flow
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLParameters
import javax.net.ssl.SSLSession
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class ResponseSubscriptionTest {
    @Test
    fun `cancelling a suspended response read cancels the JDK body subscription`() =
        runBlocking {
            val publisher = TrackingBodySource()
            val response = JavaHttpSdkTransport(StubHttpClient(publisher)).execute(request())
            publisher.awaitSubscribed()
            val read = async(start = CoroutineStart.UNDISPATCHED) { response.body.readChunk() }

            read.cancelAndJoin()

            publisher.awaitCancelled()
            assertTrue(publisher.cancelled.get())
        }

    @Test
    fun `connect timeout is classified as definitely before send`() =
        runBlocking {
            val cause = HttpConnectTimeoutException("connect timed out")

            val failure =
                assertFailsWith<SdkTransportException> {
                    JavaHttpSdkTransport(StubHttpClient(failure = cause)).execute(request())
                }

            assertEquals(false, failure.requestMayHaveReachedServer)
            assertTrue(generateSequence<Throwable>(failure) { it.cause }.any { it === cause })
        }

    @Test
    fun `response publisher requests no next batch until every buffer in the current batch is consumed`() =
        runBlocking {
            val publisher = TrackingBodySource()
            val response = JavaHttpSdkTransport(StubHttpClient(publisher)).execute(request())
            publisher.awaitSubscribed()

            assertEquals(1, publisher.requested.get())
            publisher.emit(byteArrayOf(1), byteArrayOf(2))
            assertEquals(1, response.body.readChunk()!!.single())
            assertEquals(1, publisher.requested.get())

            assertEquals(2, response.body.readChunk()!!.single())
            publisher.awaitRequested(2)
            assertEquals(2, publisher.requested.get())
            response.body.close()
        }

    private fun request(): SdkRequest =
        SdkRequest(
            method = "GET",
            uri = "https://example.test/stream",
            headers = emptyList(),
            body = null,
            expectedResponseMode = SdkResponseMode.STREAMING,
            deadlines = SdkDeadlines(null, null, null),
            operationId = "response-subscription",
        )
}

private class TrackingBodySource {
    val requested = AtomicLong()
    val cancelled = AtomicBoolean()
    private lateinit var subscriber: Flow.Subscriber<in List<ByteBuffer>>

    fun subscribe(subscriber: Flow.Subscriber<in List<ByteBuffer>>) {
        this.subscriber = subscriber
        subscriber.onSubscribe(
            object : Flow.Subscription {
                override fun request(count: Long) {
                    requested.addAndGet(count)
                }

                override fun cancel() {
                    cancelled.set(true)
                }
            },
        )
    }

    fun emit(vararg chunks: ByteArray) {
        subscriber.onNext(chunks.map(ByteBuffer::wrap))
    }

    fun awaitSubscribed() {
        repeat(1_000) {
            if (::subscriber.isInitialized && requested.get() > 0) return
            Thread.sleep(1)
        }
        error("response publisher was not subscribed")
    }

    fun awaitRequested(expected: Long) {
        repeat(1_000) {
            if (requested.get() >= expected) return
            Thread.sleep(1)
        }
        error("response publisher did not receive $expected requests")
    }

    fun awaitCancelled() {
        repeat(1_000) {
            if (cancelled.get()) return
            Thread.sleep(1)
        }
        error("response publisher was not cancelled")
    }
}

private class StubHttpClient(
    private val source: TrackingBodySource? = null,
    private val failure: Throwable? = null,
) : HttpClient() {
    override fun cookieHandler(): Optional<CookieHandler> = Optional.empty()

    override fun connectTimeout(): Optional<Duration> = Optional.empty()

    override fun followRedirects(): Redirect = Redirect.NEVER

    override fun proxy(): Optional<ProxySelector> = Optional.empty()

    override fun sslContext(): SSLContext = SSLContext.getDefault()

    override fun sslParameters(): SSLParameters = SSLParameters()

    override fun authenticator(): Optional<Authenticator> = Optional.empty()

    override fun version(): Version = Version.HTTP_1_1

    override fun executor(): Optional<Executor> = Optional.empty()

    override fun <T : Any?> send(
        request: HttpRequest,
        responseBodyHandler: HttpResponse.BodyHandler<T>,
    ): HttpResponse<T> = error("synchronous send is not used")

    override fun <T : Any?> sendAsync(
        request: HttpRequest,
        responseBodyHandler: HttpResponse.BodyHandler<T>,
    ): CompletableFuture<HttpResponse<T>> {
        failure?.let { return CompletableFuture.failedFuture(it) }
        val subscriber =
            responseBodyHandler.apply(
                object : HttpResponse.ResponseInfo {
                    override fun statusCode(): Int = 200

                    override fun headers(): HttpHeaders = HttpHeaders.of(emptyMap()) { _, _ -> true }

                    override fun version(): Version = Version.HTTP_1_1
                },
            )
        requireNotNull(source).subscribe(subscriber)
        return subscriber.body.toCompletableFuture().thenApply { body -> StubHttpResponse(request, body) }
    }

    override fun <T : Any?> sendAsync(
        request: HttpRequest,
        responseBodyHandler: HttpResponse.BodyHandler<T>,
        pushPromiseHandler: HttpResponse.PushPromiseHandler<T>,
    ): CompletableFuture<HttpResponse<T>> = sendAsync(request, responseBodyHandler)
}

private class StubHttpResponse<T>(
    private val request: HttpRequest,
    private val body: T,
) : HttpResponse<T> {
    override fun statusCode(): Int = 200

    override fun request(): HttpRequest = request

    override fun previousResponse(): Optional<HttpResponse<T>> = Optional.empty()

    override fun headers(): HttpHeaders = HttpHeaders.of(emptyMap()) { _, _ -> true }

    override fun body(): T = body

    override fun sslSession(): Optional<SSLSession> = Optional.empty()

    override fun uri(): URI = request.uri()

    override fun version(): HttpClient.Version = HttpClient.Version.HTTP_1_1
}
