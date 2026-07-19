package com.nabobery.sdkgen.transport.javahttp

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkConfigurationException
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.runtime.TransportCapabilities
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.future.await
import java.net.ConnectException
import java.net.http.HttpClient
import java.net.http.HttpConnectTimeoutException
import java.net.http.HttpResponse
import java.nio.ByteBuffer
import java.util.concurrent.CompletionException
import java.util.concurrent.ExecutionException
import java.util.concurrent.Flow
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.cancellation.CancellationException

/**
 * JVM transport backed by a consumer-owned JDK [HttpClient].
 *
 * The client is a sanctioned constructor hand-off only and is never closed, mutated, rebuilt, or otherwise shut down.
 * Its [HttpClient.followRedirects] policy must be [HttpClient.Redirect.NEVER] so one SDK transport attempt issues
 * exactly one physical HTTP request. Response bodies must be read to exhaustion or explicitly closed; closing cancels
 * the JDK body subscription, as required by the JDK `BodyHandlers.ofPublisher()` contract. Semantic deadlines remain
 * runtime-owned, so this adapter never installs an [java.net.http.HttpRequest.Builder.timeout].
 *
 * @throws SdkConfigurationException if the supplied client follows redirects.
 */
public class JavaHttpSdkTransport(
    private val client: HttpClient,
) : SdkTransport {
    init {
        if (client.followRedirects() != HttpClient.Redirect.NEVER) {
            throw SdkConfigurationException(
                "JDK HttpClient followRedirects must be NEVER, but was ${client.followRedirects()}.",
            )
        }
    }

    private val capabilities =
        TransportCapabilities(
            supportsStreaming = true,
            supportsHttp2 = client.version() == HttpClient.Version.HTTP_2,
            canSetUserAgent = true,
        )

    override suspend fun execute(request: SdkRequest): SdkResponse {
        val future = client.sendAsync(request.toHttpRequest(), HttpResponse.BodyHandlers.ofPublisher())
        val response =
            try {
                future.await()
            } catch (cancellation: CancellationException) {
                future.cancel(true)
                request.body.closeOnCancellation(cancellation)
                throw cancellation
            } catch (failure: Throwable) {
                val cause = failure.unwrapCompletionWrappers()
                throw SdkTransportException(
                    message = "JDK HttpClient failed before returning a response.",
                    operationId = request.operationId,
                    cause = cause,
                    requestMayHaveReachedServer = cause !is ConnectException && cause !is HttpConnectTimeoutException,
                )
            }
        return SdkResponse(
            statusCode = response.statusCode(),
            headers = response.headers().toSdkHeaders(),
            body = JavaHttpResponseBody(response.body(), request.operationId),
        )
    }

    override fun capabilities(): TransportCapabilities = capabilities
}

private fun SdkRequestBody?.closeOnCancellation(cause: CancellationException) {
    val oneShot = this as? SdkRequestBody.OneShot ?: return
    if (oneShot.ownership == SdkBodyOwnership.TRANSPORT) {
        oneShot.stream.close(cause)
    }
}

private class JavaHttpResponseBody(
    publisher: Flow.Publisher<List<ByteBuffer>>,
    private val operationId: String,
) : SdkByteStream {
    private val closed = AtomicBoolean()
    private val batches = Channel<List<ByteBuffer>>(1)
    private val subscriber = ResponseBodySubscriber(batches, closed)
    private var currentBatch: Iterator<ByteBuffer> = emptyList<ByteBuffer>().iterator()
    private var currentBuffer: ByteBuffer? = null
    private var batchDemandOutstanding = true

    init {
        publisher.subscribe(subscriber)
    }

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        check(!closed.get()) { "stream is closed" }
        return try {
            val buffer = nextBuffer() ?: return null
            val size = minOf(maxBytes, buffer.remaining())
            ByteArray(size).also(buffer::get).also {
                if (!buffer.hasRemaining() && !currentBatch.hasNext()) requestNextBatch()
            }
        } catch (cancellation: CancellationException) {
            close(cancellation)
            throw cancellation
        } catch (failure: Throwable) {
            throw SdkTransportException(
                "JDK response body stream failed.",
                operationId,
                failure.unwrapCompletionWrappers(),
            )
        }
    }

    override fun close(cause: Throwable?) {
        if (closed.compareAndSet(false, true)) {
            val cancellation = CancellationException("JDK response body closed", cause)
            subscriber.cancel()
            batches.cancel(cancellation)
        }
    }

    private fun requestNextBatch() {
        if (!batchDemandOutstanding) {
            subscriber.requestNext()
            batchDemandOutstanding = true
        }
    }

    private suspend fun nextBuffer(): ByteBuffer? {
        currentBuffer?.takeIf(ByteBuffer::hasRemaining)?.let { return it }
        while (true) {
            if (currentBatch.hasNext()) {
                currentBuffer = currentBatch.next()
                currentBuffer?.takeIf(ByteBuffer::hasRemaining)?.let { return it }
            } else {
                requestNextBatch()
                val result = batches.receiveCatching()
                if (result.isClosed) {
                    result.exceptionOrNull()?.let { throw it }
                    return null
                }
                currentBatch = requireNotNull(result.getOrNull()).iterator()
                batchDemandOutstanding = false
            }
        }
    }
}

private class ResponseBodySubscriber(
    private val batches: Channel<List<ByteBuffer>>,
    private val closed: AtomicBoolean,
) : Flow.Subscriber<List<ByteBuffer>> {
    private lateinit var subscription: Flow.Subscription

    override fun onSubscribe(subscription: Flow.Subscription) {
        if (::subscription.isInitialized || closed.get()) {
            subscription.cancel()
            return
        }
        this.subscription = subscription
        subscription.request(1)
    }

    override fun onNext(item: List<ByteBuffer>) {
        if (batches.trySend(item).isFailure) {
            cancel()
            batches.close(IllegalStateException("JDK response publisher violated backpressure"))
        }
    }

    override fun onError(throwable: Throwable) {
        batches.close(throwable)
    }

    override fun onComplete() {
        batches.close()
    }

    fun requestNext() {
        subscription.request(1)
    }

    fun cancel() {
        if (::subscription.isInitialized) subscription.cancel()
    }
}

private fun java.net.http.HttpHeaders.toSdkHeaders(): List<SdkHeader> =
    map().flatMap { (name, values) -> values.map { value -> SdkHeader(name, value) } }

private tailrec fun Throwable.unwrapCompletionWrappers(): Throwable =
    when (this) {
        is CompletionException, is ExecutionException -> cause?.unwrapCompletionWrappers() ?: this
        else -> this
    }
