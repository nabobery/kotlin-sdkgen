package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.resilience.CoroutineSdkTimeoutGuard
import com.nabobery.sdkgen.runtime.resilience.SdkTimeoutGuard
import kotlin.coroutines.cancellation.CancellationException

public enum class SdkBodyOwnership {
    RUNTIME,
    TRANSPORT,
}

/** Request content with explicit replayability and ownership semantics. */
public sealed interface SdkRequestBody {
    public val contentType: String
    public val contentLength: Long?
    public val ownership: SdkBodyOwnership

    /** Replayable immutable bytes; constructor input and [bytes] reads are defensively copied. */
    public class Bytes(
        bytes: ByteArray,
        override val contentType: String,
        override val ownership: SdkBodyOwnership = SdkBodyOwnership.TRANSPORT,
    ) : SdkRequestBody {
        private val content: ByteArray = bytes.copyOf()

        public val bytes: ByteArray
            get() = content.copyOf()

        override val contentLength: Long = content.size.toLong()
    }

    /** Replayable body whose [create] callback must return a fresh body for each send attempt. */
    public class ReplayFactory(
        override val contentType: String,
        override val contentLength: Long? = null,
        override val ownership: SdkBodyOwnership = SdkBodyOwnership.TRANSPORT,
        public val create: suspend () -> SdkRequestBody,
    ) : SdkRequestBody

    /** Non-replayable stream that may be consumed only once and must be closed by its [ownership] owner. */
    public class OneShot(
        public val stream: SdkByteStream,
        override val contentType: String,
        override val contentLength: Long? = null,
        override val ownership: SdkBodyOwnership = SdkBodyOwnership.TRANSPORT,
    ) : SdkRequestBody
}

/** Sequential byte source used for request and response bodies. */
public interface SdkByteStream {
    /**
     * Reads between one and [maxBytes] bytes, or returns `null` at EOF.
     *
     * Implementations must reject non-positive limits, never return an empty chunk, and preserve cancellation identity.
     */
    public suspend fun readChunk(maxBytes: Int = DEFAULT_READ_SIZE): ByteArray?

    /**
     * Releases stream resources. Calls must be idempotent; implementations that expose close diagnostics must retain
     * the [cause] from the first call, preserving object identity.
     */
    public fun close(cause: Throwable? = null)

    public companion object {
        public const val DEFAULT_READ_SIZE: Int = 8 * 1024
    }
}

/** Applies a semantic response idle deadline when the transport does not enforce one itself. */
internal fun SdkByteStream.withIdleDeadline(
    idleMillis: Long?,
    operationId: String? = null,
    timeoutGuard: SdkTimeoutGuard = CoroutineSdkTimeoutGuard,
): SdkByteStream =
    if (idleMillis == null) {
        this
    } else {
        IdleDeadlineByteStream(this, idleMillis, operationId, timeoutGuard)
    }

private class IdleDeadlineByteStream(
    private val delegate: SdkByteStream,
    private val idleMillis: Long,
    private val operationId: String?,
    private val timeoutGuard: SdkTimeoutGuard,
) : SdkByteStream {
    init {
        require(idleMillis > 0) { "idle deadline must be positive" }
    }

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        var chunk: ByteArray? = null
        var closedForFailure = false
        try {
            if (!timeoutGuard.runWithTimeout(idleMillis) { chunk = delegate.readChunk(maxBytes) }) {
                val timeout =
                    SdkTimeoutException(
                        TimeoutPhase.STREAM_IDLE,
                        "stream idle deadline expired${operationId?.let { " for '$it'" } ?: ""}.",
                        operationId,
                    )
                closeIgnoringFailure(timeout)
                closedForFailure = true
                throw timeout
            }
            return chunk
        } catch (cancellation: CancellationException) {
            if (!closedForFailure) closeIgnoringFailure(cancellation)
            throw cancellation
        } catch (failure: Throwable) {
            if (!closedForFailure) closeIgnoringFailure(failure)
            throw failure
        }
    }

    override fun close(cause: Throwable?) {
        delegate.close(cause)
    }

    private fun closeIgnoringFailure(cause: Throwable) {
        runCatching { delegate.close(cause) }
    }
}

/**
 * Buffers this stream up to [maxBytes], copying chunks once into the returned array.
 *
 * @throws IllegalArgumentException when the limit is not representable by a Kotlin [ByteArray].
 * @throws SdkBufferLimitExceededException before allocating beyond the configured limit.
 */
public suspend fun SdkByteStream.toByteArray(maxBytes: Long): ByteArray {
    require(maxBytes > 0) { "maxBytes must be positive" }
    require(maxBytes <= Int.MAX_VALUE.toLong()) { "maxBytes must fit in a Kotlin ByteArray" }
    val chunks = mutableListOf<ByteArray>()
    var size = 0L
    while (true) {
        val chunk = readChunk() ?: break
        check(chunk.isNotEmpty()) { "readChunk must return null at EOF instead of an empty chunk" }
        val chunkSize = chunk.size.toLong()
        if (size > maxBytes - chunkSize) {
            throw SdkBufferLimitExceededException(maxBytes, size + chunkSize)
        }
        size += chunkSize
        chunks += chunk
    }
    val bytes = ByteArray(size.toInt())
    var offset = 0
    chunks.forEach { chunk ->
        chunk.copyInto(bytes, destinationOffset = offset)
        offset += chunk.size
    }
    return bytes
}
