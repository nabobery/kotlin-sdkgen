package com.nabobery.sdkgen.transport.ktor

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.setBody
import io.ktor.client.request.url
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpMethod
import io.ktor.http.content.ByteArrayContent
import io.ktor.http.content.OutgoingContent
import io.ktor.utils.io.ByteWriteChannel
import io.ktor.utils.io.writeFully

/**
 * Header names ktor's [io.ktor.http.HeadersBuilder] refuses to accept directly (it throws
 * `UnsafeHeaderException`), because they are derived from the request body instead. [SdkRequest.headers] entries
 * with these names are therefore never forwarded as headers; [SdkRequestBody.contentType]/[SdkRequestBody.contentLength]
 * drive the equivalent wire values through the translated [OutgoingContent] instead.
 */
private val unsafeHeaderNames =
    setOf(HttpHeaders.ContentLength, HttpHeaders.ContentType, HttpHeaders.TransferEncoding, HttpHeaders.Upgrade)
        .map { it.lowercase() }
        .toSet()

/**
 * Translates one neutral [SdkRequest] into a ktor [HttpRequestBuilder].
 *
 * Headers are appended one at a time via [io.ktor.http.HeadersBuilder.append] to preserve both repeated values
 * (e.g. multiple `Cookie` headers) and their relative order — ktor never merges or deduplicates entries appended
 * this way. Any runtime-set header (e.g. `User-Agent`) is forwarded exactly like every other header.
 */
internal suspend fun SdkRequest.toHttpRequestBuilder(bodyScope: RequestBodyScope): HttpRequestBuilder {
    bodyScope.track(body)
    val builder = HttpRequestBuilder()
    builder.method = HttpMethod.parse(method)
    builder.url(uri)
    headers.forEach { header ->
        if (header.name.lowercase() !in unsafeHeaderNames) {
            builder.headers.append(header.name, header.value)
        }
    }
    body?.let { requestBody -> builder.setBody(requestBody.toOutgoingContent(bodyScope)) }
    return builder
}

/**
 * Resolves this request body down to wire content.
 *
 * [SdkRequestBody.ReplayFactory.create] is invoked exactly once per call to this function — i.e. once per physical
 * [io.ktor.client.HttpClient] attempt — so a fresh body is produced for every retry, per ADR-0006 replayability
 * semantics. [SdkRequestBody.OneShot] is never buffered: its bytes are streamed straight from [SdkByteStream] into
 * ktor's [ByteWriteChannel] one bounded chunk at a time.
 */
private suspend fun SdkRequestBody.toOutgoingContent(bodyScope: RequestBodyScope): OutgoingContent =
    when (this) {
        is SdkRequestBody.Bytes -> ByteArrayContent(bytes, ContentType.parse(contentType))
        is SdkRequestBody.ReplayFactory -> create().also(bodyScope::track).toOutgoingContent(bodyScope)
        is SdkRequestBody.OneShot -> toWriteChannelContent()
    }

private fun SdkRequestBody.OneShot.toWriteChannelContent(): OutgoingContent.WriteChannelContent =
    object : OutgoingContent.WriteChannelContent() {
        override val contentLength: Long? = this@toWriteChannelContent.contentLength
        override val contentType: ContentType = ContentType.parse(this@toWriteChannelContent.contentType)

        override suspend fun writeTo(channel: ByteWriteChannel) {
            val source = this@toWriteChannelContent.stream
            while (true) {
                val chunk = source.readChunk() ?: break
                channel.writeFully(chunk)
            }
            channel.flush()
        }
    }

internal class RequestBodyScope {
    private val transportOwnedStreams = mutableListOf<TrackedStream>()

    fun track(body: SdkRequestBody?) {
        if (body is SdkRequestBody.OneShot && body.ownership == SdkBodyOwnership.TRANSPORT) {
            if (transportOwnedStreams.none { it.stream === body.stream }) {
                transportOwnedStreams += TrackedStream(body.stream)
            }
        }
    }

    fun close(cause: Throwable?) {
        transportOwnedStreams.forEach { it.close(cause) }
    }

    private class TrackedStream(
        val stream: SdkByteStream,
    ) {
        private var closed = false

        fun close(cause: Throwable?) {
            if (closed) return
            closed = true
            stream.close(cause)
        }
    }
}
