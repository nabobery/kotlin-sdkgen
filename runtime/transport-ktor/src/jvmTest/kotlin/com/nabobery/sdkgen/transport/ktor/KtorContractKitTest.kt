package com.nabobery.sdkgen.transport.ktor

import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.SdkTransportException
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
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.MockRequestHandleScope
import io.ktor.client.engine.mock.respond
import io.ktor.client.engine.mock.toByteArray
import io.ktor.client.request.HttpRequestData
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import io.ktor.utils.io.ByteChannel
import io.ktor.utils.io.writeFully
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.yield
import kotlin.coroutines.coroutineContext
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class KtorContractKitTest : SdkTransportContractKit() {
    override val expectedCapabilities: TransportCapabilities =
        TransportCapabilities(
            supportsStreaming = true,
            supportedDeadlines = emptySet(),
            supportsHttp2 = false,
            canSetUserAgent = true,
        )

    override val capabilitySkipReasons: Map<ContractCapability, String> =
        mapOf(
            ContractCapability.ATTEMPT_DEADLINE to
                "KtorSdkTransport does not install HttpTimeout on the consumer-owned client.",
            ContractCapability.STREAM_IDLE_DEADLINE to
                "Stream-idle deadline enforcement belongs to the neutral runtime.",
        )

    private var currentServer: KtorMockContractServer? = null

    override fun createServer(): ContractServer = KtorMockContractServer().also { currentServer = it }

    override fun createTransport(server: ContractServer): SdkTransport {
        val mockServer = server as KtorMockContractServer
        return KtorSdkTransport(mockServer.client, mockServer)
    }

    override fun runTest(block: suspend () -> Unit) {
        runBlocking { block() }
    }

    override fun engineOwnershipProbe(): EngineOwnershipProbe =
        object : EngineOwnershipProbe {
            override fun snapshot(): Any = requireNotNull(currentServer).client.coroutineContext[Job]!!

            override fun assertUnchanged(snapshot: Any) {
                val job = requireNotNull(currentServer).client.coroutineContext[Job]!!
                assertSame(snapshot, job)
                assertTrue(job.isActive, "KtorSdkTransport closed the consumer-owned HttpClient")
            }
        }

    @Test override fun bufferedRoundTripPreservesRequestAndRepeatedHeaders() =
        super.bufferedRoundTripPreservesRequestAndRepeatedHeaders()

    @Test override fun nonSuccessResponseBodyIsAvailable() = super.nonSuccessResponseBodyIsAvailable()

    @Test
    override fun bufferedResponseDoesNotReadAheadBeforeConsumerDemand() {
        runBlocking {
            withTimeout(15_000) {
                val channel = ByteChannel()
                val releaseSecondChunk = CompletableDeferred<Unit>()
                val secondChunkSent = CompletableDeferred<Unit>()
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                CoroutineScope(coroutineContext).launch {
                                    channel.writeFully(byteArrayOf(1))
                                    channel.flush()
                                    releaseSecondChunk.await()
                                    channel.writeFully(byteArrayOf(2))
                                    channel.flush()
                                    channel.close()
                                    secondChunkSent.complete(Unit)
                                }
                                respond(channel, HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val response = KtorSdkTransport(client).execute(testRequest())
                assertFalse(secondChunkSent.isCompleted, "Buffered execute read ahead before consumer demand")
                assertContentEquals(byteArrayOf(1), response.body.readChunk())
                releaseSecondChunk.complete(Unit)
                assertContentEquals(byteArrayOf(2), response.body.readChunk())
                assertNull(response.body.readChunk())
                response.body.close()
                client.close()
            }
        }
    }

    @Test override fun emptyResponseBodyReachesEof() = super.emptyResponseBodyReachesEof()

    @Test override fun oneMiBResponseBodyIsByteFaithful() = super.oneMiBResponseBodyIsByteFaithful()

    @Test
    override fun responseClosePreservesNormalAndFailureCauses() {
        // A buffered Ktor exchange has already terminated before the neutral response stream is returned, so no real
        // engine can observe a later decoder-supplied close cause. Assert the adapter stream's first-close identity
        // directly; streaming exchange termination is independently observed in KtorStreamingJvmTest.
        val normal = KtorResponseByteStream(Channel(RESPONSE_CHANNEL_CAPACITY), Job())
        normal.close()
        assertTrue(normal.isClosed)
        assertNull(normal.closeCause)

        val cause = IllegalArgumentException("decode failed")
        val failed = KtorResponseByteStream(Channel(RESPONSE_CHANNEL_CAPACITY), Job())
        failed.close(cause)
        failed.close(IllegalStateException("ignored second close"))
        assertTrue(failed.isClosed)
        assertSame(cause, failed.closeCause)
    }

    @Test override fun cancellationIdentityIsPreservedMidBody() = super.cancellationIdentityIsPreservedMidBody()

    @Test override fun callerOwnedEngineRemainsUnchanged() = super.callerOwnedEngineRemainsUnchanged()

    @Test
    override fun streamingChunksArriveIncrementally() {
        runBlocking {
            withTimeout(15_000) {
                val channel = ByteChannel()
                val releaseSecondChunk = CompletableDeferred<Unit>()
                val secondChunkSent = CompletableDeferred<Unit>()
                val client =
                    HttpClient(MockEngine) {
                        engine {
                            addHandler {
                                CoroutineScope(coroutineContext).launch {
                                    channel.writeFully(byteArrayOf(1))
                                    channel.flush()
                                    releaseSecondChunk.await()
                                    channel.writeFully(byteArrayOf(2))
                                    channel.flush()
                                    channel.close()
                                    secondChunkSent.complete(Unit)
                                }
                                respond(channel, HttpStatusCode.OK, headersOf())
                            }
                        }
                    }
                val response =
                    KtorSdkTransport(client).execute(
                        testRequest(expectedResponseMode = SdkResponseMode.STREAMING),
                    )

                assertFalse(secondChunkSent.isCompleted, "Streaming execute buffered the gated response body")
                assertContentEquals(byteArrayOf(1), response.body.readChunk())
                releaseSecondChunk.complete(Unit)
                assertContentEquals(byteArrayOf(2), response.body.readChunk())
                assertNull(response.body.readChunk())
                response.body.close()
                client.close()
            }
        }
    }

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

    @Test override fun abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded() =
        super.abruptMidStreamFailureIsTypedAndCloseCauseIsRecorded()

    @Test override fun declaredIdleDeadlineRejectsSlowLorisBody() = super.declaredIdleDeadlineRejectsSlowLorisBody()

    @Test override fun contractSkipReportIsConsistent() = super.contractSkipReportIsConsistent()
}

private class KtorMockContractServer :
    ContractServer,
    KtorExchangeObserver {
    private val exchanges = mutableListOf<ScriptedExchange>()
    private val responseTerminations = mutableListOf<CompletableDeferred<Throwable?>>()
    private val responseReady = mutableListOf<CompletableDeferred<Unit>>()
    private val responseScope = CoroutineScope(SupervisorJob())

    val client: HttpClient =
        HttpClient(MockEngine) {
            engine {
                addHandler { request -> handle(request) }
            }
        }

    override fun url(path: String): String = "https://contract.test/${path.trimStart('/')}"

    override fun enqueue(exchange: ScriptedExchange) {
        exchanges += exchange
    }

    override fun assertResponseClosed(
        exchangeIndex: Int,
        cause: Throwable?,
    ) {
        val observed = runBlocking { withTimeout(15_000) { responseTerminations[exchangeIndex].await() } }
        check(observed === cause) { "Response exchange termination cause identity did not match" }
    }

    override fun close() {
        client.close()
        responseScope.cancel()
        exchanges.clear()
    }

    override fun onResponseStarted(): Long {
        val index = responseTerminations.size
        responseTerminations += CompletableDeferred()
        responseReady[index].complete(Unit)
        return index.toLong()
    }

    override fun onResponseTerminated(
        exchangeId: Long,
        cause: Throwable?,
    ) {
        responseTerminations[exchangeId.toInt()].complete(cause)
    }

    private suspend fun MockRequestHandleScope.handle(
        request: HttpRequestData,
    ): io.ktor.client.request.HttpResponseData {
        val exchange = exchanges.removeFirstOrNull() ?: error("Contract server script is exhausted")
        val requestBody = request.body.toByteArray().takeUnless { it.isEmpty() }
        ContractRequestVerification.verify(exchange.request, request.toSdkRequest(exchange.request), requestBody)
        exchange.response.failure?.let { throw it.asTransportFailure() }
        val headers =
            headersOf(
                *exchange.response.headers
                    .map { it.name to listOf(it.value) }
                    .toTypedArray(),
            )
        val ready = CompletableDeferred<Unit>().also(responseReady::add)
        return respond(
            exchange.response.body.toChannel(responseScope, ready),
            HttpStatusCode.fromValue(exchange.response.statusCode),
            headers,
        )
    }
}

private fun HttpRequestData.toSdkRequest(expectation: RequestExpectation): SdkRequest =
    testRequest(
        method = method.value,
        uri = url.toString(),
        headers =
            expectation.headers.mapIndexed { index, expected ->
                SdkHeader(expected.name, requireNotNull(headers.getAll(expected.name))[index])
            },
    )

private fun ConnectionFailure.asTransportFailure(): SdkTransportException =
    SdkTransportException(
        message = "Scripted connection failure.",
        operationId = "transport-contract",
        cause = cause,
        requestMayHaveReachedServer = requestMayHaveReachedServer,
    )

private fun ResponseBodyScript.toChannel(
    scope: CoroutineScope,
    responseReady: CompletableDeferred<Unit>,
): ByteChannel {
    val channel = ByteChannel()
    when (this) {
        ResponseBodyScript.Empty -> {
            channel.close()
        }

        is ResponseBodyScript.Chunks -> {
            scope.launch {
                chunks.forEachIndexed { index, chunk ->
                    if (failureAfterChunk == index) {
                        channel.cancel(requireNotNull(failure))
                        return@launch
                    }
                    channel.writeFully(chunk)
                    channel.flush()
                    if (gate != null) {
                        responseReady.await()
                    } else {
                        yield()
                    }
                    gate?.awaitRelease(index)
                }
                if (failureAfterChunk == chunks.size) {
                    delay(10)
                    channel.cancel(requireNotNull(failure))
                } else {
                    channel.close()
                }
            }
        }
    }
    return channel
}
