package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.TransportCapabilities
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

/**
 * Deterministic scripted transport for single-threaded tests.
 *
 * Instances are mutable, are not thread-safe, and consume one queued step per request.
 */
public class FakeTransport(
    private val reportedCapabilities: TransportCapabilities = TransportCapabilities(),
) : SdkTransport {
    private val script: MutableList<ScriptStep> = mutableListOf()
    private val captured: MutableList<SdkRequest> = mutableListOf()

    public val capturedRequests: List<SdkRequest>
        get() = captured.toList()

    public fun enqueueResponse(
        statusCode: Int,
        headers: List<SdkHeader> = emptyList(),
        body: FakeByteStream = FakeByteStream(),
    ): FakeTransport = apply { script += ScriptStep.Response(SdkResponse(statusCode, headers, body)) }

    public fun enqueueFailure(failure: Throwable): FakeTransport = apply { script += ScriptStep.Failure(failure) }

    /** Queues a request-aware exchange used by [FakeContractServer]. */
    public fun enqueueExchange(exchange: suspend (SdkRequest) -> SdkResponse): FakeTransport =
        apply { script += ScriptStep.Exchange(exchange) }

    override suspend fun execute(request: SdkRequest): SdkResponse {
        captured += request
        val step = script.removeFirstOrNull() ?: error("Fake transport script is exhausted")
        return when (step) {
            is ScriptStep.Response -> step.response
            is ScriptStep.Failure -> throw step.failure
            is ScriptStep.Exchange -> step.exchange(request)
        }
    }

    override fun capabilities(): TransportCapabilities = reportedCapabilities

    private sealed interface ScriptStep {
        data class Response(
            val response: SdkResponse,
        ) : ScriptStep

        data class Failure(
            val failure: Throwable,
        ) : ScriptStep

        data class Exchange(
            val exchange: suspend (SdkRequest) -> SdkResponse,
        ) : ScriptStep
    }
}

/**
 * Chunked mutable stream for single-threaded tests.
 *
 * The stream defensively copies input chunks, supports deterministic read failure injection, and records only the first
 * close cause by identity. It is not thread-safe.
 */
public class FakeByteStream(
    chunks: List<ByteArray> = emptyList(),
    private val failure: Throwable? = null,
    private val failAtRead: Int? = null,
) : SdkByteStream {
    private val chunks: MutableList<ByteArray> = chunks.map(ByteArray::copyOf).toMutableList()
    private var reads: Int = 0

    public var closed: Boolean = false
        private set

    public var closeCause: Throwable? = null
        private set

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        if (failAtRead == reads) throw requireNotNull(failure) { "failAtRead requires a failure" }
        reads += 1
        val chunk = chunks.removeFirstOrNull() ?: return null
        if (chunk.size <= maxBytes) return chunk
        val prefix = chunk.copyOfRange(0, maxBytes)
        chunks.add(0, chunk.copyOfRange(maxBytes, chunk.size))
        return prefix
    }

    override fun close(cause: Throwable?) {
        if (!closed) {
            closed = true
            closeCause = cause
        }
    }
}

public fun FakeByteStream.assertClosedNormally() {
    check(closed) { "Expected stream to be closed" }
    check(closeCause == null) { "Expected normal close but found $closeCause" }
}

public fun FakeByteStream.assertClosedWith(expected: Throwable) {
    check(closed) { "Expected stream to be closed" }
    check(closeCause === expected) { "Expected close cause identity to be preserved" }
}

internal fun <T> runSuspendImmediate(block: suspend () -> T): T {
    var outcome: Result<T>? = null
    block.startCoroutine(
        object : Continuation<T> {
            override val context = EmptyCoroutineContext

            override fun resumeWith(result: Result<T>) {
                outcome = result
            }
        },
    )
    return requireNotNull(outcome) { "Suspend block did not complete immediately" }.getOrThrow()
}
