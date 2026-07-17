package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkTransport

/**
 * Deterministic scripted transport for single-threaded tests.
 *
 * Instances are mutable, are not thread-safe, and consume one queued step per request.
 */
public class FakeTransport : SdkTransport {
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

    override suspend fun execute(request: SdkRequest): SdkResponse {
        captured += request
        val step = script.removeFirstOrNull() ?: error("Fake transport script is exhausted")
        return when (step) {
            is ScriptStep.Response -> step.response
            is ScriptStep.Failure -> throw step.failure
        }
    }

    private sealed interface ScriptStep {
        data class Response(
            val response: SdkResponse,
        ) : ScriptStep

        data class Failure(
            val failure: Throwable,
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
