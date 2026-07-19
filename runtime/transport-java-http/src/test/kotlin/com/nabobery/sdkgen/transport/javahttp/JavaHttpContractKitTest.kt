package com.nabobery.sdkgen.transport.javahttp

import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.testing.ContractCapability
import com.nabobery.sdkgen.testing.ContractServer
import com.nabobery.sdkgen.testing.EngineOwnershipProbe
import com.nabobery.sdkgen.testing.SdkTransportContractKit
import kotlinx.coroutines.runBlocking
import java.net.ServerSocket
import java.net.http.HttpClient
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse

class JavaHttpContractKitTest : SdkTransportContractKit() {
    private lateinit var executor: ExecutorService

    override val expectedCapabilities: TransportCapabilities =
        TransportCapabilities(
            supportsStreaming = true,
            supportsHttp2 = true,
            canSetUserAgent = true,
        )

    override val capabilitySkipReasons: Map<ContractCapability, String> =
        mapOf(
            ContractCapability.ATTEMPT_DEADLINE to
                "The neutral runtime owns attempt deadlines; this adapter deliberately sets no HttpRequest timeout.",
            ContractCapability.STREAM_IDLE_DEADLINE to
                "The neutral runtime owns stream-idle deadlines; the adapter exposes raw bytes without read timers.",
        )

    override fun createServer(): ContractServer = JdkContractServer()

    override fun createTransport(server: ContractServer): SdkTransport {
        executor = Executors.newSingleThreadExecutor()
        return JavaHttpSdkTransport(HttpClient.newBuilder().executor(executor).build())
    }

    override fun runTest(block: suspend () -> Unit) {
        runBlocking { block() }
    }

    override fun engineOwnershipProbe(): EngineOwnershipProbe =
        object : EngineOwnershipProbe {
            override fun snapshot(): Any = executor.isShutdown

            override fun assertUnchanged(snapshot: Any) {
                assertFalse(snapshot as Boolean)
                assertFalse(executor.isShutdown)
            }
        }

    override fun tearDownTransport(transport: SdkTransport) {
        executor.shutdownNow()
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

    @Test override fun cancellationIdentityIsPreservedMidBody() = super.cancellationIdentityIsPreservedMidBody()

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

    @Test override fun connectionFailureBeforeSendIsTypedAndPreservesCause() =
        super.connectionFailureBeforeSendIsTypedAndPreservesCause()

    @Test
    override fun abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded() {
        ServerSocket(0).use { server ->
            val writer =
                Thread {
                    server.accept().use { socket ->
                        val reader = socket.getInputStream().bufferedReader()
                        while (!reader.readLine().isNullOrEmpty()) {
                            // Consume request headers before writing the deliberately truncated response.
                        }
                        socket.getOutputStream().apply {
                            write("HTTP/1.1 200 OK\r\nContent-Length: 2\r\nConnection: close\r\n\r\n".toByteArray())
                            write(byteArrayOf(1))
                            flush()
                        }
                    }
                }.apply { start() }
            runBlocking {
                val response =
                    JavaHttpSdkTransport(HttpClient.newHttpClient()).execute(
                        streamingRequest("http://127.0.0.1:${server.localPort}/abrupt"),
                    )
                assertContentEquals(byteArrayOf(1), response.body.readChunk())
                val failure = assertFailsWith<SdkTransportException> { response.body.readChunk() }
                response.body.close(failure)
            }
            writer.join(5_000)
            check(!writer.isAlive) { "Raw abrupt-response server did not terminate" }
        }
    }

    @Test override fun declaredIdleDeadlineRejectsSlowLorisBody() = super.declaredIdleDeadlineRejectsSlowLorisBody()

    @Test override fun contractSkipReportIsConsistent() = super.contractSkipReportIsConsistent()
}

private fun streamingRequest(uri: String): SdkRequest =
    SdkRequest(
        method = "GET",
        uri = uri,
        headers = emptyList(),
        body = null,
        expectedResponseMode = SdkResponseMode.STREAMING,
        deadlines = SdkDeadlines(null, null, null),
        operationId = "java-http-contract",
    )
