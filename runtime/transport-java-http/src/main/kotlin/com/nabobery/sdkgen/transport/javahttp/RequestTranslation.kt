package com.nabobery.sdkgen.transport.javahttp

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.jdk9.asPublisher
import java.net.URI
import java.net.http.HttpRequest
import java.nio.ByteBuffer
import java.util.concurrent.Flow
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.coroutines.EmptyCoroutineContext

/**
 * Headers that the JDK 17 HTTP client forbids applications from setting through [HttpRequest.Builder.header].
 *
 * `Connection`, `Content-Length`, `Expect`, `Host`, and `Upgrade` are controlled by the client because they affect
 * connection framing, routing, or protocol negotiation. They are omitted case-insensitively rather than allowing the
 * JDK to reject an otherwise valid SDK request. In particular, request length is supplied by
 * [HttpRequest.BodyPublisher.contentLength]. `User-Agent` is intentionally not restricted by JDK 17.
 */
internal val JDK_RESTRICTED_HEADERS: Set<String> =
    setOf(
        "connection",
        "content-length",
        "expect",
        "host",
        "upgrade",
    )

internal fun SdkRequest.toHttpRequest(): HttpRequest {
    val builder = HttpRequest.newBuilder(URI.create(uri)).applySdkHeaders(headers)
    val requestBody = body
    if (requestBody != null && headers.none { it.name.equals("Content-Type", ignoreCase = true) }) {
        builder.header("Content-Type", requestBody.contentType)
    }
    return builder
        .method(
            method,
            requestBody?.let(::requestBodyPublisher) ?: HttpRequest.BodyPublishers.noBody(),
        ).build()
}

/**
 * Adapts neutral request bodies with a coroutine-backed Reactive Streams publisher.
 *
 * `Flow.asPublisher` performs reads only in response to downstream demand. A replay factory is invoked inside the cold
 * flow, so every JDK subscription opens a fresh body. A one-shot body shares an atomic subscription guard and rejects
 * every subscription after the first; its stream is never buffered and is closed when consumption completes, fails,
 * or is cancelled when transport-owned.
 */
internal fun HttpRequest.Builder.applySdkHeaders(
    headers: List<com.nabobery.sdkgen.runtime.SdkHeader>,
): HttpRequest.Builder {
    headers.forEach { header ->
        if (header.name.lowercase() !in JDK_RESTRICTED_HEADERS) header(header.name, header.value)
    }
    return this
}

internal fun bodyPublisher(body: SdkRequestBody): HttpRequest.BodyPublisher = requestBodyPublisher(body)

internal fun requestBodyPublisher(body: SdkRequestBody): HttpRequest.BodyPublisher =
    when (body) {
        is SdkRequestBody.Bytes -> HttpRequest.BodyPublishers.ofByteArray(body.bytes)
        is SdkRequestBody.ReplayFactory -> streamingBodyPublisher(body)
        is SdkRequestBody.OneShot -> streamingBodyPublisher(body)
    }

private fun streamingBodyPublisher(body: SdkRequestBody): HttpRequest.BodyPublisher {
    val subscribed = AtomicBoolean(false)
    val publisher: Flow.Publisher<ByteBuffer> =
        flow {
            if (body is SdkRequestBody.OneShot && !subscribed.compareAndSet(false, true)) {
                throw IllegalStateException("One-shot request body may be subscribed only once")
            }
            emitBody(body)
        }.asPublisher(EmptyCoroutineContext)
    return body.contentLength?.let { HttpRequest.BodyPublishers.fromPublisher(publisher, it) }
        ?: HttpRequest.BodyPublishers.fromPublisher(publisher)
}

private suspend fun kotlinx.coroutines.flow.FlowCollector<ByteBuffer>.emitBody(body: SdkRequestBody) {
    when (body) {
        is SdkRequestBody.Bytes -> emit(ByteBuffer.wrap(body.bytes))
        is SdkRequestBody.ReplayFactory -> emitBody(body.create())
        is SdkRequestBody.OneShot -> emitStream(body.stream, body.ownership)
    }
}

private suspend fun kotlinx.coroutines.flow.FlowCollector<ByteBuffer>.emitStream(
    stream: SdkByteStream,
    ownership: SdkBodyOwnership,
) {
    var failure: Throwable? = null
    try {
        while (true) {
            val chunk = stream.readChunk() ?: break
            emit(ByteBuffer.wrap(chunk))
        }
    } catch (caught: Throwable) {
        failure = caught
        throw caught
    } finally {
        if (ownership == SdkBodyOwnership.TRANSPORT) stream.close(failure)
    }
}
