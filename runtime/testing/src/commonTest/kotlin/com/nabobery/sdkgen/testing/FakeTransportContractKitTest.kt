package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.runtime.TransportCapabilities
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertIs
import kotlin.test.assertSame

internal class FakeTransportContractKitTest : SdkTransportContractKit() {
    override val expectedCapabilities: TransportCapabilities = TransportCapabilities(supportsStreaming = true)
    override val capabilitySkipReasons: Map<ContractCapability, String> =
        mapOf(
            ContractCapability.ATTEMPT_DEADLINE to "FakeTransport has no native clock or attempt timer.",
            ContractCapability.STREAM_IDLE_DEADLINE to "Idle enforcement belongs to the runtime stream consumer.",
            ContractCapability.CALLER_OWNED_ENGINE to "FakeTransport has no external engine instance.",
        )

    override fun createServer(): ContractServer = FakeContractServer(expectedCapabilities)

    override fun createTransport(server: ContractServer): SdkTransport = (server as FakeContractServer).transport

    override fun runTest(block: suspend () -> Unit) {
        kotlinx.coroutines.test.runTest { block() }
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

    @Test
    override fun connectionFailureBeforeSendIsTypedAndPreservesCause() {
        super.connectionFailureBeforeSendIsTypedAndPreservesCause()
        val cause = IllegalStateException("reference connection failure")
        val server = FakeContractServer(expectedCapabilities)
        server.enqueue(
            ScriptedExchange(
                RequestExpectation("GET", server.url("/identity-connect")),
                ResponseScript(failure = ConnectionFailure(cause, requestMayHaveReachedServer = false)),
            ),
        )
        val failure =
            assertFails { runContractSuspend { server.transport.execute(request(server, "/identity-connect")) } }
        assertIs<SdkTransportException>(failure)
        assertSame(cause, failure.cause)
    }

    @Test
    override fun abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded() {
        super.abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded()
        val cause = IllegalStateException("reference stream failure")
        val server = FakeContractServer(expectedCapabilities)
        server.enqueue(
            ScriptedExchange(
                RequestExpectation("GET", server.url("/identity-stream")),
                ResponseScript(
                    body =
                        ResponseBodyScript.Chunks(
                            listOf(byteArrayOf(1)),
                            failureAfterChunk = 1,
                            failure = cause,
                        ),
                ),
            ),
        )
        val body = runContractSuspend { server.transport.execute(request(server, "/identity-stream")).body }
        runContractSuspend { body.readChunk() }
        val failure = assertFails { runContractSuspend { body.readChunk() } }
        assertIs<SdkTransportException>(failure)
        assertSame(cause, failure.cause)
    }

    @Test override fun declaredIdleDeadlineRejectsSlowLorisBody() = super.declaredIdleDeadlineRejectsSlowLorisBody()

    @Test override fun contractSkipReportIsConsistent() = super.contractSkipReportIsConsistent()

    @Test
    fun mandatoryDeadlineRowsAreNotSkippedByNativeCapabilityReports() {
        declaredAttemptDeadlineIsHonored()
        declaredIdleDeadlineRejectsSlowLorisBody()
        assertEquals(false, skippedRows.containsKey("declaredAttemptDeadlineIsHonored"))
        assertEquals(false, skippedRows.containsKey("declaredIdleDeadlineRejectsSlowLorisBody"))
    }

    @Test
    fun incrementalityProbeDetectsBufferingTransport() =
        kotlinx.coroutines.test.runTest {
            val server = FakeContractServer(expectedCapabilities)
            val gate = ChunkGate()
            server.enqueue(
                ScriptedExchange(
                    RequestExpectation("GET", server.url("/buffered-incrementality")),
                    ResponseScript(
                        body = ResponseBodyScript.Chunks(listOf(byteArrayOf(1), byteArrayOf(2)), gate = gate),
                    ),
                ),
            )
            val response =
                async(start = CoroutineStart.UNDISPATCHED) {
                    BufferingTransport(server.transport).execute(
                        SdkRequest(
                            method = "GET",
                            uri = server.url("/buffered-incrementality"),
                            headers = emptyList(),
                            body = null,
                            expectedResponseMode = SdkResponseMode.STREAMING,
                            deadlines = SdkDeadlines(null, null, null),
                            operationId = "transport-contract",
                        ),
                    )
                }
            try {
                gate.awaitProduced(0)
                assertEquals(false, response.isCompleted)
                gate.release(0)
                gate.awaitProduced(1)
                assertEquals(false, response.isCompleted)
                gate.release(1)
                val buffered = response.await()
                assertContentEquals(byteArrayOf(1, 2), buffered.body.readChunk())
                assertEquals(null, buffered.body.readChunk())
                buffered.body.close()
                server.assertResponseClosed(0, null)
            } finally {
                if (!response.isCompleted) response.cancel()
                server.close()
            }
        }

    @Test
    fun portableFaultRowsAcceptAdapterWrappedCauses() {
        val kit = CauseWrappingTransportContractKit()
        kit.connectionFailureBeforeSendIsTypedAndPreservesCause()
        kit.abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded()
    }
}

private class CauseWrappingTransportContractKit : SdkTransportContractKit() {
    override val expectedCapabilities: TransportCapabilities = TransportCapabilities(supportsStreaming = true)
    override val capabilitySkipReasons: Map<ContractCapability, String> = emptyMap()

    override fun createServer(): ContractServer = FakeContractServer(expectedCapabilities)

    override fun createTransport(server: ContractServer): SdkTransport =
        CauseWrappingTransport((server as FakeContractServer).transport)

    override fun runTest(block: suspend () -> Unit) {
        runContractSuspend(block)
    }
}

private class CauseWrappingTransport(
    private val delegate: SdkTransport,
) : SdkTransport {
    override suspend fun execute(request: SdkRequest): SdkResponse =
        try {
            val response = delegate.execute(request)
            SdkResponse(
                response.statusCode,
                response.headers,
                CauseWrappingByteStream(response.body, request.operationId),
            )
        } catch (failure: SdkTransportException) {
            throw SdkTransportException(
                "Adapter connection failure",
                request.operationId,
                IllegalStateException("engine connection failure", failure),
                failure.requestMayHaveReachedServer,
            )
        }

    override fun capabilities(): TransportCapabilities = delegate.capabilities()
}

private class CauseWrappingByteStream(
    private val delegate: SdkByteStream,
    private val operationId: String,
) : SdkByteStream {
    override suspend fun readChunk(maxBytes: Int): ByteArray? =
        try {
            delegate.readChunk(maxBytes)
        } catch (failure: SdkTransportException) {
            throw SdkTransportException(
                "Adapter stream failure",
                operationId,
                IllegalStateException("engine stream failure", failure),
            )
        }

    override fun close(cause: Throwable?) {
        delegate.close(cause)
    }
}

private class BufferingTransport(
    private val delegate: SdkTransport,
) : SdkTransport {
    override suspend fun execute(request: SdkRequest): SdkResponse {
        val response = delegate.execute(request)
        val bytes = response.body.readAllAndClose()
        return SdkResponse(response.statusCode, response.headers, FakeByteStream(listOf(bytes)))
    }

    override fun capabilities(): TransportCapabilities = delegate.capabilities()
}

private fun request(
    server: ContractServer,
    path: String,
): SdkRequest =
    SdkRequest(
        method = "GET",
        uri = server.url(path),
        headers = emptyList(),
        body = null,
        expectedResponseMode = SdkResponseMode.STREAMING,
        deadlines = SdkDeadlines(null, null, null),
        operationId = "reference-identity",
    )

private suspend fun SdkByteStream.readAllAndClose(): ByteArray {
    val chunks = mutableListOf<ByteArray>()
    try {
        while (true) chunks += readChunk() ?: break
    } finally {
        close()
    }
    return chunks.fold(ByteArray(0), ByteArray::plus)
}
