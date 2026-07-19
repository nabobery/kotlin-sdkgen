package com.nabobery.sdkgen.transport.okhttp

import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.testing.ConnectionFailure
import com.nabobery.sdkgen.testing.ContractCapability
import com.nabobery.sdkgen.testing.ContractRequestVerification
import com.nabobery.sdkgen.testing.ContractServer
import com.nabobery.sdkgen.testing.EngineOwnershipProbe
import com.nabobery.sdkgen.testing.RequestExpectation
import com.nabobery.sdkgen.testing.ResponseBodyScript
import com.nabobery.sdkgen.testing.ScriptedExchange
import com.nabobery.sdkgen.testing.SdkTransportContractKit
import kotlinx.coroutines.runBlocking
import mockwebserver3.Dispatcher
import mockwebserver3.MockResponse
import mockwebserver3.MockResponseBody
import mockwebserver3.MockWebServer
import mockwebserver3.RecordedRequest
import mockwebserver3.SocketEffect
import okhttp3.OkHttpClient
import okio.BufferedSink
import java.io.IOException
import java.net.InetAddress
import java.net.ServerSocket
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.CountDownLatch
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertTrue

internal class OkHttpTransportContractKitTest : SdkTransportContractKit() {
    private lateinit var client: OkHttpClient

    override val expectedCapabilities: TransportCapabilities =
        TransportCapabilities(
            supportsStreaming = true,
            supportsHttp2 = true,
            canSetUserAgent = true,
        )

    override val capabilitySkipReasons: Map<ContractCapability, String> =
        mapOf(
            ContractCapability.ATTEMPT_DEADLINE to
                "OkHttp client timeouts are consumer configuration; semantic attempt deadlines are runtime-owned.",
            ContractCapability.STREAM_IDLE_DEADLINE to
                "Stream-idle deadlines are enforced by the runtime around SdkByteStream reads.",
        )

    override fun createServer(): ContractServer = MockWebServerContractServer()

    override fun createTransport(server: ContractServer): SdkTransport {
        client = OkHttpClient.Builder().retryOnConnectionFailure(false).build()
        val mockServer = server as MockWebServerContractServer
        val delegate = OkHttpSdkTransport(client, mockServer::recordAdapterResponseClose)
        return object : SdkTransport {
            override suspend fun execute(request: SdkRequest) =
                delegate.execute(request).also { mockServer.markExecuteReturned() }

            override fun capabilities(): TransportCapabilities = delegate.capabilities()
        }
    }

    override fun runTest(block: suspend () -> Unit) {
        runBlocking { block() }
    }

    override fun tearDownTransport(transport: SdkTransport) {
        client.connectionPool.evictAll()
        client.dispatcher.executorService.shutdownNow()
    }

    override fun engineOwnershipProbe(): EngineOwnershipProbe =
        object : EngineOwnershipProbe {
            override fun snapshot(): Any = ClientSnapshot(client.dispatcher.executorService.isShutdown)

            override fun assertUnchanged(snapshot: Any) {
                assertEquals(snapshot, ClientSnapshot(client.dispatcher.executorService.isShutdown))
            }
        }

    @Test override fun bufferedRoundTripPreservesRequestAndRepeatedHeaders() =
        super.bufferedRoundTripPreservesRequestAndRepeatedHeaders()

    @Test override fun nonSuccessResponseBodyIsAvailable() = super.nonSuccessResponseBodyIsAvailable()

    @Test override fun bufferedResponseDoesNotReadAheadBeforeConsumerDemand() =
        super.bufferedResponseDoesNotReadAheadBeforeConsumerDemand()

    @Test override fun emptyResponseBodyReachesEof() = super.emptyResponseBodyReachesEof()

    @Test override fun oneMiBResponseBodyIsByteFaithful() = super.oneMiBResponseBodyIsByteFaithful()

    @Test override fun responseClosePreservesNormalAndFailureCauses() =
        super
            .responseClosePreservesNormalAndFailureCauses()

    @Test
    override fun cancellationIdentityIsPreservedMidBody() {
        repeat(50) { super.cancellationIdentityIsPreservedMidBody() }
    }

    @Test override fun callerOwnedEngineRemainsUnchanged() = super.callerOwnedEngineRemainsUnchanged()

    @Test override fun streamingChunksArriveIncrementally() = super.streamingChunksArriveIncrementally()

    @Test override fun closingStreamMidBodyCancelsExchange() = super.closingStreamMidBodyCancelsExchange()

    @Test override fun hostileChunkSizesPreserveBytes() = super.hostileChunkSizesPreserveBytes()

    @Test override fun sseBytesAreIncrementalAndUnmodified() = super.sseBytesAreIncrementalAndUnmodified()

    @Test override fun multipartBodyExecutesWithExactBytesAndReplays() =
        super
            .multipartBodyExecutesWithExactBytesAndReplays()

    @Test override fun bytesAndReplayFactoryAreIdenticalAcrossAttempts() =
        super.bytesAndReplayFactoryAreIdenticalAcrossAttempts()

    @Test override fun oneShotBodyIsConsumedExactlyOnce() = super.oneShotBodyIsConsumedExactlyOnce()

    @Test override fun capabilitiesMatchExpectations() = super.capabilitiesMatchExpectations()

    @Test
    override fun redirectsAreSurfacedWithoutAutomaticFollowing() {
        super.redirectsAreSurfacedWithoutAutomaticFollowing()
    }

    @Test override fun unsupportedStreamingIsDeclaredForRuntimePreflight() =
        super.unsupportedStreamingIsDeclaredForRuntimePreflight()

    @Test override fun declaredAttemptDeadlineIsHonored() = super.declaredAttemptDeadlineIsHonored()

    @Test
    override fun connectionFailureBeforeSendIsTypedAndPreservesCause() {
        val port =
            ServerSocket(0, 1, InetAddress.getLoopbackAddress()).use { socket ->
                socket.localPort
            }
        val refusedClient = OkHttpClient.Builder().retryOnConnectionFailure(false).build()
        try {
            val failure =
                assertFails {
                    runBlocking {
                        OkHttpSdkTransport(refusedClient).execute(
                            contractRequest("http://127.0.0.1:$port/connect-failure"),
                        )
                    }
                }
            assertIs<com.nabobery.sdkgen.runtime.SdkTransportException>(failure)
            assertTrue(failure.cause != null, "Connection failure must retain a non-empty cause chain")
            assertTrue(
                generateSequence<Throwable>(failure) { it.cause }.any { it is java.net.ConnectException },
                "The cause chain must retain the refused connection",
            )
            assertFalse(failure.requestMayHaveReachedServer)
        } finally {
            refusedClient.connectionPool.evictAll()
            refusedClient.dispatcher.executorService.shutdownNow()
        }
    }

    @Test override fun abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded() =
        super.abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded()

    @Test override fun declaredIdleDeadlineRejectsSlowLorisBody() = super.declaredIdleDeadlineRejectsSlowLorisBody()

    @Test override fun contractSkipReportIsConsistent() = super.contractSkipReportIsConsistent()
}

private data class ClientSnapshot(
    val executorShutdown: Boolean,
)

private class MockWebServerContractServer : ContractServer {
    private val server = MockWebServer()
    private val exchanges = CopyOnWriteArrayList<ScriptedExchange>()
    private val observedRequests = CopyOnWriteArrayList<SdkRequest>()
    private val chunkGates = CopyOnWriteArrayList<Pair<com.nabobery.sdkgen.testing.ChunkGate, Int>>()
    private val pendingExecuteReturns = ConcurrentLinkedQueue<CountDownLatch>()
    private val adapterResponseCloses = CopyOnWriteArrayList<Throwable?>()

    init {
        server.dispatcher =
            object : Dispatcher() {
                override fun dispatch(request: RecordedRequest): MockResponse {
                    val exchange = exchanges.removeFirstOrNull() ?: error("Contract server script is exhausted")
                    verify(exchange.request, request)
                    exchange.response.failure?.let { return connectionFailure(it) }
                    val executeReturned = CountDownLatch(1)
                    pendingExecuteReturns += executeReturned
                    return MockResponse
                        .Builder()
                        .code(exchange.response.statusCode)
                        .apply {
                            exchange.response.headers.forEach { addHeader(it.name, it.value) }
                            val scriptedBody = exchange.response.body
                            if (scriptedBody is ResponseBodyScript.Chunks && scriptedBody.gate != null) {
                                addHeader("Transfer-Encoding", "chunked")
                            }
                            body(scriptedBody.toMockResponseBody(executeReturned))
                        }.build()
                }
            }
        server.start()
    }

    override fun url(path: String): String = server.url(path).toString()

    override fun enqueue(exchange: ScriptedExchange) {
        exchanges += exchange
        val body = exchange.response.body
        if (body is ResponseBodyScript.Chunks) {
            body.gate?.let { chunkGates.add(it to body.chunks.size) }
        }
    }

    override fun assertResponseClosed(
        exchangeIndex: Int,
        cause: Throwable?,
    ) {
        check(exchangeIndex in observedRequests.indices) { "Response $exchangeIndex request was not observed" }
        check(
            exchangeIndex in adapterResponseCloses.indices,
        ) { "Response $exchangeIndex was not closed by the adapter" }
        check(adapterResponseCloses[exchangeIndex] === cause) { "Response close cause identity did not match" }
    }

    /**
     * MockWebServer can observe the socket ending, but not the Throwable supplied to a client-side stream close. The
     * adapter's internal test seam records that otherwise-unobservable fact; OkHttpSdkTransportTest separately exercises
     * the seam's idempotence and first-cause identity without presenting it as a server-side observation.
     */
    fun recordAdapterResponseClose(cause: Throwable?) {
        adapterResponseCloses += cause
    }

    fun markExecuteReturned() {
        pendingExecuteReturns.remove()?.countDown()
    }

    override fun close() {
        pendingExecuteReturns.forEach(CountDownLatch::countDown)
        chunkGates.forEach { (gate, count) -> repeat(count) { gate.release(it) } }
        server.close()
    }

    private fun verify(
        expected: RequestExpectation,
        recorded: RecordedRequest,
    ) {
        val headers =
            recorded.headers
                .map { (name, value) -> SdkHeader(name, value) }
                .filterNot { it.name.equals("Host", ignoreCase = true) || it.name.equals("Connection", true) }
        val actual =
            SdkRequest(
                method = requireNotNull(recorded.method),
                uri = recorded.url.toString(),
                headers = headers.filter { header -> expected.headers.any { it.name.equals(header.name, true) } },
                body = null,
                expectedResponseMode = com.nabobery.sdkgen.runtime.SdkResponseMode.BUFFERED,
                deadlines =
                    com.nabobery.sdkgen.runtime
                        .SdkDeadlines(null, null, null),
                operationId = "contract-server",
            )
        observedRequests += actual
        val body = (recorded.body?.toByteArray() ?: ByteArray(0)).takeIf { it.isNotEmpty() }
        ContractRequestVerification.verify(expected, actual, body)
    }

    private fun connectionFailure(failure: ConnectionFailure): MockResponse =
        MockResponse
            .Builder()
            .onResponseStart(SocketEffect.ShutdownConnection)
            .build()
}

private fun contractRequest(url: String): SdkRequest =
    SdkRequest(
        method = "GET",
        uri = url,
        headers = emptyList(),
        body = null,
        expectedResponseMode = SdkResponseMode.BUFFERED,
        deadlines = SdkDeadlines(null, null, null),
        operationId = "transport-contract",
    )

private fun ResponseBodyScript.toMockResponseBody(executeReturned: CountDownLatch): MockResponseBody =
    when (this) {
        ResponseBodyScript.Empty -> {
            object : MockResponseBody {
                override val contentLength: Long = 0

                override fun writeTo(sink: BufferedSink) = Unit
            }
        }

        is ResponseBodyScript.Chunks -> {
            object : MockResponseBody {
                override val contentLength: Long =
                    if (gate == null) {
                        chunks.sumOf { it.size.toLong() } + if (failureAfterChunk != null) 1L else 0L
                    } else {
                        -1L
                    }

                override fun writeTo(sink: BufferedSink) {
                    chunks.forEachIndexed { index, chunk ->
                        if (failureAfterChunk == index) throw IOException("scripted stream failure", failure)
                        if (gate != null) sink.writeUtf8(chunk.size.toString(16)).writeUtf8("\r\n")
                        sink.write(chunk)
                        if (gate != null) sink.writeUtf8("\r\n")
                        sink.flush()
                        gate?.markProduced(index)
                        if (index == 0 && gate != null) executeReturned.await()
                        if (index < chunks.lastIndex) gate?.let { runBlocking { it.awaitRelease(index) } }
                    }
                    if (failureAfterChunk == chunks.size) throw IOException("scripted stream failure", failure)
                    if (gate != null) sink.writeUtf8("0\r\n\r\n").flush()
                }
            }
        }
    }
