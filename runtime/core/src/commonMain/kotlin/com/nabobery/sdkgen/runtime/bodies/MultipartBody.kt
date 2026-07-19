package com.nabobery.sdkgen.runtime.bodies

import com.nabobery.sdkgen.runtime.SdkBodyOwnership
import com.nabobery.sdkgen.runtime.SdkBufferLimitExceededException
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestBody
import kotlin.random.Random

/** Controls compatibility behavior for multipart form field names. */
public enum class MultipartCompatibility {
    /** Encode repeated values as repeated fields with the same name. */
    STANDARDS,

    /** Append `[]` to repeated field names for legacy servers that require PHP-style arrays. */
    LEGACY_BRACKETS,
}

private const val RANDOM_BOUNDARY_ALPHABET: String = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
private const val RANDOM_BOUNDARY_LENGTH: Int = 48

private fun randomBoundary(): String =
    buildString(RANDOM_BOUNDARY_LENGTH) {
        repeat(RANDOM_BOUNDARY_LENGTH) {
            append(RANDOM_BOUNDARY_ALPHABET[Random.Default.nextInt(RANDOM_BOUNDARY_ALPHABET.length)])
        }
    }

/** Incremental, platform-neutral `multipart/form-data` request-body builder. */
public class MultipartBody(
    private val compatibility: MultipartCompatibility = MultipartCompatibility.STANDARDS,
    private val boundaryProvider: () -> String = ::randomBoundary,
    private val maxConvenienceBytes: Long = DEFAULT_MAX_CONVENIENCE_BYTES,
) {
    private val parts: MutableList<Part> = mutableListOf()

    init {
        require(maxConvenienceBytes > 0) { "maxConvenienceBytes must be positive" }
    }

    /** Adds one bounded UTF-8 text field. Repeating [name] produces a standards-compliant multi-value field. */
    public fun text(
        name: String,
        value: String,
        mediaType: String = "text/plain; charset=utf-8",
        headers: List<SdkHeader> = emptyList(),
    ): MultipartBody = bytes(name, checkedBytes(value.encodeToByteArray()), mediaType, headers = headers)

    /** Adds all text [values] as repeated fields. */
    public fun textValues(
        name: String,
        values: Iterable<String>,
        mediaType: String = "text/plain; charset=utf-8",
        headers: List<SdkHeader> = emptyList(),
    ): MultipartBody =
        apply {
            val encodedName = if (compatibility == MultipartCompatibility.LEGACY_BRACKETS) "$name[]" else name
            values.forEach { text(encodedName, it, mediaType, headers) }
        }

    /** Adds one bounded immutable byte-array field. */
    public fun bytes(
        name: String,
        value: ByteArray,
        mediaType: String = "application/octet-stream",
        filename: String? = null,
        headers: List<SdkHeader> = emptyList(),
    ): MultipartBody =
        part(
            name = name,
            filename = filename,
            mediaType = mediaType,
            headers = headers,
            body = SdkRequestBody.Bytes(checkedBytes(value), mediaType),
        )

    /** Adds a one-shot stream field with an optional known [contentLength]. */
    public fun binary(
        name: String,
        stream: SdkByteStream,
        contentLength: Long? = null,
        mediaType: String = "application/octet-stream",
        filename: String? = null,
        headers: List<SdkHeader> = emptyList(),
        ownership: SdkBodyOwnership = SdkBodyOwnership.TRANSPORT,
    ): MultipartBody =
        part(
            name = name,
            filename = filename,
            mediaType = mediaType,
            headers = headers,
            body = SdkRequestBody.OneShot(stream, mediaType, contentLength, ownership),
        )

    /** Adds a typed part while retaining the body's declared length, ownership, and replayability. */
    public fun part(
        name: String,
        body: SdkRequestBody,
        filename: String? = null,
        mediaType: String = body.contentType,
        headers: List<SdkHeader> = emptyList(),
        contentLength: Long? = body.contentLength,
    ): MultipartBody =
        apply {
            requireTokenValue(name, "part name")
            filename?.let { requireTokenValue(it, "filename") }
            require(mediaType.isNotBlank()) { "mediaType must not be blank" }
            headers.forEach {
                requireTokenValue(it.name, "header name")
                requireTokenValue(it.value, "header value")
            }
            require(contentLength == null || contentLength >= 0) { "contentLength must not be negative" }
            if (body.contentLength != null && contentLength != null) {
                require(contentLength == body.contentLength) {
                    "contentLength $contentLength does not match body.contentLength ${body.contentLength}"
                }
            }
            parts += Part(name, filename, mediaType, headers.toList(), body, contentLength)
        }

    /** Builds a streaming request body. Any one-shot part makes the complete multipart body one-shot. */
    public fun build(): SdkRequestBody {
        val boundary = boundaryProvider()
        validateBoundary(boundary)
        val contentType = "multipart/form-data; boundary=$boundary"
        val contentLength = computeContentLength(boundary)
        val ownership =
            if (parts.any { it.body.ownership == SdkBodyOwnership.RUNTIME }) {
                SdkBodyOwnership.RUNTIME
            } else {
                SdkBodyOwnership.TRANSPORT
            }
        return if (parts.any { it.body is SdkRequestBody.OneShot }) {
            SdkRequestBody.OneShot(
                MultipartStream(boundary, parts.map(Part::openOnce)),
                contentType,
                contentLength,
                ownership,
            )
        } else {
            SdkRequestBody.ReplayFactory(contentType, contentLength, ownership) {
                SdkRequestBody.OneShot(
                    MultipartStream(boundary, parts.map(Part::openReplay)),
                    contentType,
                    contentLength,
                    ownership,
                )
            }
        }
    }

    private fun checkedBytes(value: ByteArray): ByteArray {
        if (value.size.toLong() > maxConvenienceBytes) {
            throw SdkBufferLimitExceededException(maxConvenienceBytes, value.size.toLong())
        }
        return value
    }

    private fun computeContentLength(boundary: String): Long? {
        if (parts.any { it.contentLength == null }) return null
        var total = closingBoundary(boundary).size.toLong()
        parts.forEach { part ->
            total = addExactOrNull(total, partPrefix(boundary, part).size.toLong()) ?: return null
            total = addExactOrNull(total, requireNotNull(part.contentLength)) ?: return null
            total = addExactOrNull(total, CRLF.size.toLong()) ?: return null
        }
        return total
    }

    internal data class Part(
        val name: String,
        val filename: String?,
        val mediaType: String,
        val headers: List<SdkHeader>,
        val body: SdkRequestBody,
        val contentLength: Long?,
    ) {
        fun openReplay(): OpenPart = OpenPart(this) { body.openReplayStream() }

        fun openOnce(): OpenPart = OpenPart(this) { body.openCompositeOnceStream() }
    }

    private companion object {
        private const val DEFAULT_MAX_CONVENIENCE_BYTES: Long = 8L * 1024 * 1024
    }
}

internal data class OpenPart(
    val part: MultipartBody.Part,
    val openStream: suspend () -> SdkByteStream,
)

private class MultipartStream(
    boundary: String,
    parts: List<OpenPart>,
) : SdkByteStream {
    private val segments: MutableList<Segment> =
        buildList {
            parts.forEach { openPart ->
                add(Segment.Bytes(partPrefix(boundary, openPart.part)))
                add(Segment.Stream(openPart.openStream))
                add(Segment.Bytes(CRLF))
            }
            add(Segment.Bytes(closingBoundary(boundary)))
        }.toMutableList()
    private var closed: Boolean = false

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        check(!closed) { "stream is closed" }
        while (true) {
            when (val segment = segments.firstOrNull() ?: return null) {
                is Segment.Bytes -> {
                    val result = segment.read(maxBytes)
                    if (segment.exhausted) segments.removeAt(0)
                    return result
                }

                is Segment.Stream -> {
                    val stream = segment.stream()
                    val result = stream.readChunk(maxBytes)
                    if (result != null) return result
                    stream.close()
                    segments.removeAt(0)
                }
            }
        }
    }

    override fun close(cause: Throwable?) {
        if (closed) return
        closed = true
        segments.forEach { segment -> if (segment is Segment.Stream) segment.closeIfOpened(cause) }
        segments.clear()
    }

    private sealed interface Segment {
        class Bytes(
            private val bytes: ByteArray,
        ) : Segment {
            private var offset: Int = 0
            val exhausted: Boolean
                get() = offset == bytes.size

            fun read(maxBytes: Int): ByteArray {
                val end = minOf(bytes.size, offset + maxBytes)
                return bytes.copyOfRange(offset, end).also { offset = end }
            }
        }

        class Stream(
            private val openStream: suspend () -> SdkByteStream,
        ) : Segment {
            private var opened: SdkByteStream? = null

            suspend fun stream(): SdkByteStream = opened ?: openStream().also { opened = it }

            fun closeIfOpened(cause: Throwable?) {
                opened?.close(cause)
            }
        }
    }
}

private suspend fun SdkRequestBody.openCompositeOnceStream(): SdkByteStream =
    when (this) {
        is SdkRequestBody.Bytes -> ByteArrayStream(bytes)
        is SdkRequestBody.OneShot -> stream
        is SdkRequestBody.ReplayFactory -> create().openCreatedStream()
    }

private suspend fun SdkRequestBody.openReplayStream(): SdkByteStream =
    when (this) {
        is SdkRequestBody.Bytes -> ByteArrayStream(bytes)
        is SdkRequestBody.OneShot -> error("OneShot body is not replayable")
        is SdkRequestBody.ReplayFactory -> create().openCreatedStream()
    }

private suspend fun SdkRequestBody.openCreatedStream(): SdkByteStream =
    when (this) {
        is SdkRequestBody.Bytes -> ByteArrayStream(bytes)
        is SdkRequestBody.OneShot -> stream
        is SdkRequestBody.ReplayFactory -> create().openCreatedStream()
    }

private class ByteArrayStream(
    bytes: ByteArray,
) : SdkByteStream {
    private val bytes = bytes.copyOf()
    private var offset: Int = 0
    private var closed: Boolean = false

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        check(!closed) { "stream is closed" }
        if (offset == bytes.size) return null
        val end = minOf(bytes.size, offset + maxBytes)
        return bytes.copyOfRange(offset, end).also { offset = end }
    }

    override fun close(cause: Throwable?) {
        closed = true
    }
}

private fun partPrefix(
    boundary: String,
    part: MultipartBody.Part,
): ByteArray {
    val disposition =
        buildString {
            append("Content-Disposition: form-data; name=\"")
            append(escapeQuoted(part.name))
            append('"')
            part.filename?.let { filename ->
                append("; filename=\"")
                append(escapeQuoted(filename))
                append('"')
                if (filename.any { it.code !in 0x20..0x7E }) {
                    append("; filename*=UTF-8''")
                    append(percentEncode(filename.encodeToByteArray()))
                }
            }
        }
    return buildString {
        append("--")
        append(boundary)
        append("\r\n")
        append(disposition)
        append("\r\nContent-Type: ")
        append(part.mediaType)
        append("\r\n")
        part.headers.forEach { header -> append("${header.name}: ${header.value}\r\n") }
        append("\r\n")
    }.encodeToByteArray()
}

private fun closingBoundary(boundary: String): ByteArray = "--$boundary--\r\n".encodeToByteArray()

private fun escapeQuoted(value: String): String = value.replace("\\", "\\\\").replace("\"", "\\\"")

private fun percentEncode(bytes: ByteArray): String =
    buildString {
        bytes.forEach { byte ->
            val value = byte.toInt() and 0xFF
            if ((value in 'a'.code..'z'.code) || (value in 'A'.code..'Z'.code) ||
                (value in '0'.code..'9'.code) || value == '-'.code || value == '.'.code || value == '_'.code ||
                value == '~'.code
            ) {
                append(value.toChar())
            } else {
                append('%')
                append(HEX[value ushr 4])
                append(HEX[value and 0x0F])
            }
        }
    }

private fun validateBoundary(boundary: String) {
    require(boundary.isNotBlank()) { "multipart boundary must not be blank" }
    require(boundary.length <= 70) { "multipart boundary must not exceed 70 characters" }
    require(
        boundary.all {
            it.isLetterOrDigit() || it in "'()+_,-./:=?"
        },
    ) { "multipart boundary contains invalid characters" }
}

private fun requireTokenValue(
    value: String,
    label: String,
) {
    require(value.isNotBlank()) { "$label must not be blank" }
    require('\r' !in value && '\n' !in value) { "$label must not contain CR or LF" }
}

private fun addExactOrNull(
    left: Long,
    right: Long,
): Long? = if (right > Long.MAX_VALUE - left) null else left + right

private val CRLF: ByteArray = "\r\n".encodeToByteArray()
private const val HEX: String = "0123456789ABCDEF"
