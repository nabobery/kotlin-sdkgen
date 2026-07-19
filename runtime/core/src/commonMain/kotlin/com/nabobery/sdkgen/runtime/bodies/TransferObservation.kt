package com.nabobery.sdkgen.runtime.bodies

import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkRequestBody

/** Direction of bytes observed for one physical request attempt. */
public enum class TransferDirection {
    UPLOAD,
    DOWNLOAD,
}

/**
 * Attempt-local transfer state supplied to [TransferObserver].
 *
 * Not a `data class`: public runtime value types use explicit hand-written [equals], [hashCode], [toString], and
 * [copy] methods so their ABI can evolve without locking in generated `componentN` members.
 */
public class TransferEvent(
    public val direction: TransferDirection,
    public val callId: String,
    public val attemptNumber: Int,
    public val bytesTransferred: Long,
    public val totalBytes: Long?,
) {
    init {
        require(callId.isNotBlank()) { "callId must not be blank" }
        require(attemptNumber > 0) { "attemptNumber must be positive" }
        require(bytesTransferred >= 0) { "bytesTransferred must not be negative" }
        require(totalBytes == null || totalBytes >= 0) { "totalBytes must not be negative" }
    }

    public fun copy(
        direction: TransferDirection = this.direction,
        callId: String = this.callId,
        attemptNumber: Int = this.attemptNumber,
        bytesTransferred: Long = this.bytesTransferred,
        totalBytes: Long? = this.totalBytes,
    ): TransferEvent = TransferEvent(direction, callId, attemptNumber, bytesTransferred, totalBytes)

    override fun equals(other: Any?): Boolean =
        other is TransferEvent &&
            direction == other.direction &&
            callId == other.callId &&
            attemptNumber == other.attemptNumber &&
            bytesTransferred == other.bytesTransferred &&
            totalBytes == other.totalBytes

    override fun hashCode(): Int =
        arrayOf<Any?>(direction, callId, attemptNumber, bytesTransferred, totalBytes).contentHashCode()

    override fun toString(): String =
        "TransferEvent(direction=$direction, callId=$callId, attemptNumber=$attemptNumber, " +
            "bytesTransferred=$bytesTransferred, totalBytes=$totalBytes)"
}

/**
 * Fast, non-suspending transfer callbacks.
 *
 * Implementations must return quickly. Callback failures are deliberately contained and never alter request,
 * response, cancellation, or close outcomes.
 */
public interface TransferObserver {
    public fun onStart(event: TransferEvent)

    public fun onProgress(event: TransferEvent)

    public fun onCompletion(event: TransferEvent)

    public fun onFailure(
        event: TransferEvent,
        failure: Throwable,
    )
}

/** Decorates [stream] with attempt-local transfer events while preserving pull-based reads and close causes. */
public fun observeTransfer(
    stream: SdkByteStream,
    observer: TransferObserver,
    direction: TransferDirection,
    callId: String,
    attemptNumber: Int,
    totalBytes: Long? = null,
): SdkByteStream = ObservingByteStream(stream, observer, direction, callId, attemptNumber, totalBytes)

/**
 * Decorates a request [body] with upload events while preserving content metadata and replayability.
 *
 * Each replay creates a fresh observed stream and resets the attempt-local byte count to zero.
 */
public fun observeTransfer(
    body: SdkRequestBody,
    observer: TransferObserver,
    callId: String,
    attemptNumber: Int,
): SdkRequestBody =
    when (body) {
        is SdkRequestBody.Bytes -> {
            SdkRequestBody.ReplayFactory(body.contentType, body.contentLength, body.ownership) {
                observedBody(body, observer, callId, attemptNumber)
            }
        }

        is SdkRequestBody.ReplayFactory -> {
            SdkRequestBody.ReplayFactory(body.contentType, body.contentLength, body.ownership) {
                observedBody(body.create(), observer, callId, attemptNumber)
            }
        }

        is SdkRequestBody.OneShot -> {
            observedOneShot(body, observer, callId, attemptNumber)
        }
    }

private fun observedOneShot(
    body: SdkRequestBody.OneShot,
    observer: TransferObserver,
    callId: String,
    attemptNumber: Int,
): SdkRequestBody.OneShot =
    SdkRequestBody.OneShot(
        stream =
            observeTransfer(
                body.stream,
                observer,
                TransferDirection.UPLOAD,
                callId,
                attemptNumber,
                body.contentLength,
            ),
        contentType = body.contentType,
        contentLength = body.contentLength,
        ownership = body.ownership,
    )

private suspend fun observedBody(
    body: SdkRequestBody,
    observer: TransferObserver,
    callId: String,
    attemptNumber: Int,
): SdkRequestBody.OneShot {
    val stream = body.openBodyStream()
    return SdkRequestBody.OneShot(
        stream = observeTransfer(stream, observer, TransferDirection.UPLOAD, callId, attemptNumber, body.contentLength),
        contentType = body.contentType,
        contentLength = body.contentLength,
        ownership = body.ownership,
    )
}

private suspend fun SdkRequestBody.openBodyStream(): SdkByteStream =
    when (this) {
        is SdkRequestBody.Bytes -> TransferByteArrayStream(bytes)
        is SdkRequestBody.OneShot -> stream
        is SdkRequestBody.ReplayFactory -> create().openBodyStream()
    }

private class ObservingByteStream(
    private val delegate: SdkByteStream,
    private val observer: TransferObserver,
    private val direction: TransferDirection,
    private val callId: String,
    private val attemptNumber: Int,
    private val totalBytes: Long?,
) : SdkByteStream {
    private var started: Boolean = false
    private var terminal: Boolean = false
    private var transferred: Long = 0
    private var closed: Boolean = false

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        startIfNeeded()
        return try {
            val chunk = delegate.readChunk(maxBytes)
            if (chunk == null) {
                completeIfNeeded()
            } else {
                transferred += chunk.size
                safely { observer.onProgress(event()) }
            }
            chunk
        } catch (failure: Throwable) {
            failIfNeeded(failure)
            throw failure
        }
    }

    override fun close(cause: Throwable?) {
        if (closed) return
        closed = true
        startIfNeeded()
        if (cause == null) completeIfNeeded() else failIfNeeded(cause)
        delegate.close(cause)
    }

    private fun startIfNeeded() {
        if (started) return
        started = true
        safely { observer.onStart(event()) }
    }

    private fun completeIfNeeded() {
        if (terminal) return
        terminal = true
        safely { observer.onCompletion(event()) }
    }

    private fun failIfNeeded(failure: Throwable) {
        if (terminal) return
        terminal = true
        safely { observer.onFailure(event(), failure) }
    }

    private fun event(): TransferEvent = TransferEvent(direction, callId, attemptNumber, transferred, totalBytes)
}

private class TransferByteArrayStream(
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

private inline fun safely(callback: () -> Unit) {
    try {
        callback()
    } catch (_: Throwable) {
        // Observer failures are outcome-neutral by contract.
    }
}
