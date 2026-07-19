package com.nabobery.sdkgen.transport.ktor

import com.nabobery.sdkgen.runtime.SdkByteStream
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.SendChannel
import kotlin.coroutines.cancellation.CancellationException
import kotlinx.coroutines.CancellationException as CoroutinesCancellationException

/** One chunk of read-ahead buffered beyond the chunk currently being copied out of ktor — never an unbounded prefetch. */
internal const val RESPONSE_CHANNEL_CAPACITY: Int = 1

/** Bounded per-transfer copy buffer size used when pumping a ktor response body. */
internal const val TRANSFER_BUFFER_SIZE: Int = SdkByteStream.DEFAULT_READ_SIZE

/**
 * Bridges one ktor streaming response body to the neutral runtime, per ADR-0006's retained-scope rule.
 *
 * A [KtorSdkTransport] never returns ktor's `ByteReadChannel` (or the enclosing `HttpResponse`) once its
 * `HttpStatement.execute` callback has returned — that scope is where the raw channel is actually valid. Instead, a
 * pump coroutine (launched *inside* that scope and captured by [pumpJob]) copies bytes out one bounded chunk at a
 * time into [channel], and the `execute` callback itself stays suspended, pumping, for as long as this instance's
 * lifetime lasts. Concretely:
 *
 * - normal end of stream: the pump closes [channel] with no cause, `execute` returns, and the callback (hence the
 *   ktor call) ends;
 * - [close] (consumer-initiated — cancellation, early abandonment, or explicit close): cancels [pumpJob], which
 *   interrupts the ktor read at its next suspension point and, in turn, unwinds the `execute` callback so the
 *   physical call is torn down promptly;
 * - a mid-stream engine/transport failure: the pump wraps it as a typed [com.nabobery.sdkgen.runtime.SdkTransportException],
 *   closes [channel] with that cause, and [readChunk] rethrows it once the buffered backlog (if any) is drained.
 *
 * [Channel.close] with a [kotlin.coroutines.cancellation.CancellationException] cause reliably preserves that exact
 * exception instance to [readChunk] callers (`Job`/`Channel` cancellation causes are never subject to kotlinx.coroutines'
 * JVM-only stack-trace-recovery copying — only ordinary result values crossing a suspend-resumption boundary are).
 * A non-cancellation failure crossing that same boundary is not guaranteed `===` identity on the JVM — only its
 * `cause` chain — so [readChunk] never asserts identity for those, only for [CancellationException].
 */
internal class KtorResponseByteStream(
    private val channel: Channel<ByteArray>,
    private val pumpJob: Job,
) : SdkByteStream {
    private var leftover: ByteArray? = null
    private var closed = false
    private var closeCauseValue: Throwable? = null

    /** Exposed for tests: the [Throwable] passed to the first [close] call, or `null` for a normal/absent close. */
    val closeCause: Throwable?
        get() = closeCauseValue

    val isClosed: Boolean
        get() = closed

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        leftover?.let { pending ->
            return takeUpTo(pending, maxBytes)
        }
        val result = channel.receiveCatching()
        if (result.isClosed) {
            result.exceptionOrNull()?.let { throw it }
            return null
        }
        return takeUpTo(result.getOrThrow(), maxBytes)
    }

    private fun takeUpTo(
        chunk: ByteArray,
        maxBytes: Int,
    ): ByteArray {
        if (chunk.size <= maxBytes) {
            leftover = null
            return chunk
        }
        leftover = chunk.copyOfRange(maxBytes, chunk.size)
        return chunk.copyOfRange(0, maxBytes)
    }

    override fun close(cause: Throwable?) {
        if (closed) return
        closed = true
        closeCauseValue = cause
        // Job.cancel() requires kotlinx.coroutines.CancellationException specifically, not the stdlib
        // kotlin.coroutines.cancellation.CancellationException this SPI otherwise uses (on the JVM they resolve to
        // the identical java.util.concurrent.CancellationException at runtime, but the Kotlin Multiplatform common
        // compiler treats them as distinct types, so a [cause] that is only the stdlib type must be re-wrapped here
        // — its instance is still preserved via [Throwable.cause] either way).
        val cancellation: CoroutinesCancellationException =
            when (cause) {
                null -> CoroutinesCancellationException("SdkByteStream closed")
                is CoroutinesCancellationException -> cause
                else -> CoroutinesCancellationException(cause.message, cause)
            }
        pumpJob.cancel(cancellation)
    }
}

/**
 * Copies [source] into [sink] one bounded [TRANSFER_BUFFER_SIZE] chunk at a time, suspending (applying backpressure)
 * whenever [sink] already holds [RESPONSE_CHANNEL_CAPACITY] unread chunks. Never reads ahead beyond that bound.
 */
internal suspend fun pumpKtorResponseBody(
    source: KtorResponseSource,
    sink: SendChannel<ByteArray>,
) {
    while (true) {
        val chunk = source.readNextChunk(TRANSFER_BUFFER_SIZE) ?: break
        if (chunk.isEmpty()) continue
        sink.send(chunk)
    }
}

/** Seam over ktor's `ByteReadChannel` so [pumpKtorResponseBody] is engine/channel-shape agnostic and testable. */
internal fun interface KtorResponseSource {
    /** Returns up to [maxBytes] freshly read bytes, or `null` at end of stream. */
    suspend fun readNextChunk(maxBytes: Int): ByteArray?
}
