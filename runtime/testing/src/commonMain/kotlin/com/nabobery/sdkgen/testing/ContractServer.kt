package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.runtime.redactedHeaderList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.update

/**
 * Engine-neutral endpoint controlled by [SdkTransportContractKit].
 *
 * Platform adapter tests implement this interface with their preferred local server or mock engine. The common kit
 * deliberately does not publish or depend on a real HTTP server.
 */
public interface ContractServer {
    /** Returns an absolute URL for [path]. */
    public fun url(path: String = "/"): String

    /**
     * Queues one physical exchange in execution order.
     *
     * Implementations must consume the request body and verify every [ScriptedExchange.request] fact, preferably by
     * delegating to [ContractRequestVerification], before returning the scripted response.
     */
    public fun enqueue(exchange: ScriptedExchange)

    /** Asserts that the response body for [exchangeIndex] was closed with [cause], preserving cause identity. */
    public fun assertResponseClosed(
        exchangeIndex: Int,
        cause: Throwable?,
    )

    /** Releases server resources after a contract test. */
    public fun close()
}

/** One expected physical request and its scripted result. */
public data class ScriptedExchange(
    public val request: RequestExpectation,
    public val response: ResponseScript,
)

/**
 * Neutral request facts a server must verify. Header names compare case-insensitively while values and repetition order
 * remain exact. A null [body] means no body is expected.
 */
public class RequestExpectation(
    public val method: String,
    public val uri: String,
    headers: List<SdkHeader> = emptyList(),
    body: ByteArray? = null,
) {
    public val headers: List<SdkHeader> = headers.toList()
    private val expectedBody: ByteArray? = body?.copyOf()

    public val body: ByteArray?
        get() = expectedBody?.copyOf()
}

/** A response, connection failure, or stream script returned for one expected request. */
public data class ResponseScript(
    public val statusCode: Int = 200,
    public val headers: List<SdkHeader> = emptyList(),
    public val body: ResponseBodyScript = ResponseBodyScript.Empty,
    public val failure: ConnectionFailure? = null,
)

/**
 * Coordinates incremental response production between a [ContractServer] and its contract test.
 *
 * A real HTTP implementation flushes scripted chunk N, records it as produced, then calls [awaitRelease] before writing
 * chunk N+1. The test waits with [awaitProduced], makes assertions while later chunks remain unavailable, and calls
 * [release] to permit the next write.
 */
public class ChunkGate {
    private val produced: MutableStateFlow<Set<Int>> = MutableStateFlow(emptySet())
    private val released: MutableStateFlow<Set<Int>> = MutableStateFlow(emptySet())

    /** Suspends the server after chunk [index] is produced until the test releases it. */
    public suspend fun awaitRelease(index: Int) {
        markProduced(index)
        released.first { index in it }
    }

    /** Permits the server to produce the chunk after [index]. */
    public fun release(index: Int) {
        require(index >= 0) { "chunk index must be non-negative" }
        released.update { it + index }
    }

    /** Suspends the test until the server has produced chunk [index]. */
    public suspend fun awaitProduced(index: Int) {
        require(index >= 0) { "chunk index must be non-negative" }
        produced.first { index in it }
    }

    /** Records that chunk [index] has become available to the client. */
    public fun markProduced(index: Int) {
        require(index >= 0) { "chunk index must be non-negative" }
        produced.update { it + index }
    }
}

/** Response-body delivery independent of any adapter engine. */
public sealed interface ResponseBodyScript {
    public data object Empty : ResponseBodyScript

    /** Chunks must be delivered in order and without coalescing by an in-memory server. */
    public class Chunks(
        chunks: List<ByteArray>,
        public val gate: ChunkGate? = null,
        public val failureAfterChunk: Int? = null,
        public val failure: Throwable? = null,
    ) : ResponseBodyScript {
        private val content: List<ByteArray> = chunks.map(ByteArray::copyOf)

        public val chunks: List<ByteArray>
            get() = content.map(ByteArray::copyOf)

        init {
            require(content.all { it.isNotEmpty() }) { "response chunks must not be empty" }
            require(failureAfterChunk == null || failureAfterChunk in 0..content.size) {
                "failureAfterChunk must be within the chunk list"
            }
            require(failureAfterChunk == null || failure != null) { "failureAfterChunk requires a failure" }
        }
    }
}

/** Failure injected before a response is returned. */
public data class ConnectionFailure(
    public val cause: Throwable,
    public val requestMayHaveReachedServer: Boolean,
)

/** Request observed by [FakeContractServer], including the exact consumed request-body bytes. */
public class RecordedExchange internal constructor(
    public val request: SdkRequest,
    requestBody: ByteArray?,
) {
    private val body: ByteArray? = requestBody?.copyOf()

    public val requestBody: ByteArray?
        get() = body?.copyOf()
}

/**
 * Pure in-memory [ContractServer] paired with [transport]. It proves the shared suite against the reference transport
 * without introducing a platform HTTP server dependency.
 */
public class FakeContractServer(
    public val capabilities: com.nabobery.sdkgen.runtime.TransportCapabilities =
        com.nabobery.sdkgen.runtime
            .TransportCapabilities(supportsStreaming = true),
) : ContractServer {
    private val script: MutableList<ScriptedExchange> = mutableListOf()
    private val recorded: MutableList<RecordedExchange> = mutableListOf()
    private val responseCloses: MutableList<Throwable?> = mutableListOf()
    private val responseClosed: MutableList<Boolean> = mutableListOf()

    public val exchanges: List<RecordedExchange>
        get() = recorded.toList()

    public val transport: FakeTransport = FakeTransport(capabilities)

    override fun url(path: String): String = "https://contract.test/${path.trimStart('/')}"

    override fun enqueue(exchange: ScriptedExchange) {
        script += exchange
        transport.enqueueExchange(::executeNext)
    }

    override fun assertResponseClosed(
        exchangeIndex: Int,
        cause: Throwable?,
    ) {
        check(responseClosed.getOrNull(exchangeIndex) == true) { "Response $exchangeIndex was not closed" }
        check(responseCloses[exchangeIndex] === cause) { "Response close cause identity did not match" }
    }

    override fun close() {
        script.clear()
    }

    public fun assertExhausted() {
        check(script.isEmpty()) { "Expected all scripted exchanges to be consumed; ${script.size} remain" }
    }

    private suspend fun executeNext(request: SdkRequest): SdkResponse {
        val exchange = script.removeFirstOrNull() ?: error("Contract server script is exhausted")
        val requestBody = consumeBody(request.body)
        recorded += RecordedExchange(request, requestBody)
        ContractRequestVerification.verify(exchange.request, request, requestBody)
        exchange.response.failure?.let { failure ->
            throw SdkTransportException(
                message = "Scripted connection failure.",
                operationId = request.operationId,
                cause = failure.cause,
                requestMayHaveReachedServer = failure.requestMayHaveReachedServer,
            )
        }
        val exchangeIndex = responseCloses.size
        responseCloses += null
        responseClosed += false
        return SdkResponse(
            exchange.response.statusCode,
            exchange.response.headers,
            ObservingByteStream(
                TranslatingByteStream(exchange.response.body.openStream(), request.operationId),
            ) { cause ->
                if (!responseClosed[exchangeIndex]) {
                    responseClosed[exchangeIndex] = true
                    responseCloses[exchangeIndex] = cause
                }
            },
        )
    }
}

private suspend fun consumeBody(body: SdkRequestBody?): ByteArray? =
    when (body) {
        null -> null
        is SdkRequestBody.Bytes -> body.bytes
        is SdkRequestBody.OneShot -> body.stream.consumeAndClose()
        is SdkRequestBody.ReplayFactory -> consumeBody(body.create())
    }

private suspend fun SdkByteStream.consumeAndClose(): ByteArray {
    val chunks = mutableListOf<ByteArray>()
    var size = 0
    try {
        while (true) {
            val chunk = readChunk() ?: break
            chunks += chunk
            size += chunk.size
        }
    } catch (failure: Throwable) {
        close(failure)
        throw failure
    }
    close()
    return ByteArray(size).also { bytes ->
        var offset = 0
        chunks.forEach { chunk ->
            chunk.copyInto(bytes, offset)
            offset += chunk.size
        }
    }
}

/** Shared exact request verification for fake and real [ContractServer] implementations. */
public object ContractRequestVerification {
    /** Verifies [actual] and its consumed [actualBody] against [expected]. */
    public fun verify(
        expected: RequestExpectation,
        actual: SdkRequest,
        actualBody: ByteArray?,
    ) {
        check(expected.method == actual.method) { "Expected method ${expected.method}, got ${actual.method}" }
        check(expected.uri == actual.uri) { "Expected URI ${expected.uri}, got ${actual.uri}" }
        check(expected.headers.size == actual.headers.size) {
            "Expected headers ${redactedHeaderList(expected.headers)}, got ${redactedHeaderList(actual.headers)}"
        }
        expected.headers.zip(actual.headers).forEach { (expectedHeader, actualHeader) ->
            check(
                expectedHeader.name.equals(actualHeader.name, ignoreCase = true) &&
                    expectedHeader.value == actualHeader.value,
            ) {
                "Expected header ${redactedHeaderList(listOf(expectedHeader))}, got " +
                    redactedHeaderList(listOf(actualHeader))
            }
        }
        check(expected.body?.contentEquals(actualBody ?: ByteArray(0)) ?: (actualBody == null)) {
            "Request body did not match"
        }
    }
}

private class TranslatingByteStream(
    private val delegate: SdkByteStream,
    private val operationId: String,
) : SdkByteStream {
    override suspend fun readChunk(maxBytes: Int): ByteArray? =
        try {
            delegate.readChunk(maxBytes)
        } catch (cancellation: kotlin.coroutines.cancellation.CancellationException) {
            throw cancellation
        } catch (failure: SdkTransportException) {
            throw failure
        } catch (failure: Throwable) {
            throw SdkTransportException("Scripted response stream failed.", operationId, failure)
        }

    override fun close(cause: Throwable?) {
        delegate.close(cause)
    }
}

private class ObservingByteStream(
    private val delegate: SdkByteStream,
    private val onClose: (Throwable?) -> Unit,
) : SdkByteStream {
    override suspend fun readChunk(maxBytes: Int): ByteArray? = delegate.readChunk(maxBytes)

    override fun close(cause: Throwable?) {
        delegate.close(cause)
        onClose(cause)
    }
}

private fun ResponseBodyScript.openStream(): SdkByteStream =
    when (this) {
        ResponseBodyScript.Empty -> {
            FakeByteStream()
        }

        is ResponseBodyScript.Chunks -> {
            ScriptedResponseByteStream(chunks, gate, failureAfterChunk, failure)
        }
    }

private class ScriptedResponseByteStream(
    chunks: List<ByteArray>,
    private val gate: ChunkGate?,
    private val failureAfterChunk: Int?,
    private val failure: Throwable?,
) : SdkByteStream {
    private val chunks: MutableList<ByteArray> = chunks.map(ByteArray::copyOf).toMutableList()
    private var completedChunks: Int = 0
    private var currentOffset: Int = 0
    private var closed: Boolean = false

    init {
        if (chunks.isNotEmpty()) gate?.markProduced(0)
    }

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        require(maxBytes > 0) { "maxBytes must be positive" }
        check(!closed) { "stream is closed" }
        if (currentOffset == 0 && completedChunks > 0) {
            gate?.awaitRelease(completedChunks - 1)
            if (chunks.isNotEmpty()) gate?.markProduced(completedChunks)
        }
        if (failureAfterChunk == completedChunks && currentOffset == 0) {
            throw requireNotNull(failure) { "failureAfterChunk requires a failure" }
        }
        val chunk = chunks.firstOrNull() ?: return null
        val end = minOf(currentOffset + maxBytes, chunk.size)
        val result = chunk.copyOfRange(currentOffset, end)
        currentOffset = end
        if (currentOffset == chunk.size) {
            chunks.removeAt(0)
            gate?.markProduced(completedChunks)
            completedChunks += 1
            currentOffset = 0
        }
        return result
    }

    override fun close(cause: Throwable?) {
        closed = true
    }
}

internal fun <T> runContractSuspend(block: suspend () -> T): T = runSuspendImmediate(block)
