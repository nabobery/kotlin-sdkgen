package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.SdkByteStream

/**
 * Deterministic byte stream that delivers [payload] using [chunkSizes] and can fail at an exact byte offset.
 *
 * Input is defensively copied. When [failureAtOffset] falls inside a scripted chunk, bytes up to that offset are
 * returned first and [failure] is thrown by the next read. This utility is mutable, single-consumer, and not thread-safe.
 */
public class ChunkedByteStream(
    payload: ByteArray,
    chunkSizes: List<Int> = listOf(SdkByteStream.DEFAULT_READ_SIZE),
    private val failureAtOffset: Int? = null,
    private val failure: Throwable? = null,
) : SdkByteStream {
    private val payload: ByteArray = payload.copyOf()
    private val chunkSizes: List<Int> = chunkSizes.toList()
    private var offset: Int = 0
    private var chunkIndex: Int = 0

    public var closed: Boolean = false
        private set

    public var closeCause: Throwable? = null
        private set

    init {
        require(this.chunkSizes.isNotEmpty()) { "chunkSizes must not be empty" }
        require(this.chunkSizes.all { it > 0 }) { "chunkSizes must contain only positive values" }
        require(failureAtOffset == null || failureAtOffset in 0..this.payload.size) {
            "failureAtOffset must be within the payload"
        }
        require(failureAtOffset == null || failure != null) { "failureAtOffset requires a failure" }
    }

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        if (failureAtOffset == offset) throw requireNotNull(failure)
        if (offset == payload.size) return null

        val scriptedSize = chunkSizes[chunkIndex.coerceAtMost(chunkSizes.lastIndex)]
        chunkIndex += 1
        var end = (offset + minOf(scriptedSize, maxBytes)).coerceAtMost(payload.size)
        failureAtOffset?.let { failAt ->
            if (offset < failAt && end > failAt) end = failAt
        }
        val chunk = payload.copyOfRange(offset, end)
        offset = end
        return chunk
    }

    override fun close(cause: Throwable?) {
        if (!closed) {
            closed = true
            closeCause = cause
        }
    }
}

/** Builds one SSE comment fixture without a line terminator. */
public fun sseCommentFixture(comment: String): String = ": $comment"

/** Builds one SSE event fixture without the final blank-line terminator. */
public fun sseEventFixture(
    data: String,
    eventType: String? = null,
    id: String? = null,
    retryHintMillis: Long? = null,
): String =
    buildList {
        eventType?.let { add("event: $it") }
        id?.let { add("id: $it") }
        retryHintMillis?.let { add("retry: $it") }
        data.split('\n').forEach { add("data: $it") }
    }.joinToString("\n")

/** Renders SSE fixture fragments with the requested line ending and a blank line after each fragment. */
public fun sseStreamFixture(
    vararg fragments: String,
    includeBom: Boolean = false,
    lineEnding: String = "\n",
): ByteArray {
    require(lineEnding == "\n" || lineEnding == "\r\n" || lineEnding == "\r") {
        "lineEnding must be LF, CRLF, or CR"
    }
    val body =
        fragments.joinToString(separator = lineEnding + lineEnding, postfix = lineEnding + lineEnding) { fragment ->
            fragment.replace("\n", lineEnding)
        }
    return ((if (includeBom) "﻿" else "") + body).encodeToByteArray()
}
