package com.nabobery.sdkgen.runtime

import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class TransportCapabilitiesTest {
    @Test
    fun defaultTransportCapabilitiesAreConservative() {
        val transport = SdkTransport { error("unused") }

        val capabilities = transport.capabilities()

        assertFalse(capabilities.supportsStreaming)
        assertEquals(RedirectCapability.UNSUPPORTED, capabilities.redirects)
        assertFalse(capabilities.supportsHttp2)
        assertFalse(capabilities.canSetUserAgent)
        assertTrue(capabilities.supportedDeadlines.isEmpty())
    }

    @Test
    fun transportCapabilitiesDefensivelyCopiesSupportedDeadlines() {
        val source = mutableSetOf(TimeoutPhase.TOTAL)
        val capabilities = TransportCapabilities(supportedDeadlines = source)

        source.add(TimeoutPhase.ATTEMPT)

        assertEquals(setOf(TimeoutPhase.TOTAL), capabilities.supportedDeadlines)
    }

    @Test
    fun transportCanReportRicherCapabilities() {
        val richCapabilities =
            TransportCapabilities(
                supportsStreaming = true,
                supportedDeadlines = setOf(TimeoutPhase.TOTAL, TimeoutPhase.ATTEMPT),
                supportsHttp2 = true,
                canSetUserAgent = true,
            )
        val transport =
            object : SdkTransport {
                override suspend fun execute(request: SdkRequest): SdkResponse = error("unused")

                override fun capabilities(): TransportCapabilities = richCapabilities
            }

        assertEquals(richCapabilities, transport.capabilities())
    }

    @Test
    fun executorDoesNotRejectRequestedDeadlinesWhenTransportReportsNoNativeDeadlineSupport() {
        // Ruling: total and attempt deadline enforcement is runtime-owned by SdkExecutor.
        // TransportCapabilities.supportedDeadlines describes transport-NATIVE enforcement only; its absence must
        // never fail preflight, since the runtime compensates. Only uncompensatable capabilities (currently
        // streaming) fail preflight.
        val responseBody =
            object : SdkByteStream {
                override suspend fun readChunk(maxBytes: Int): ByteArray? = null

                override fun close(cause: Throwable?) {}
            }
        val transport =
            object : SdkTransport {
                override suspend fun execute(request: SdkRequest): SdkResponse =
                    SdkResponse(200, listOf(SdkHeader("Content-Type", "application/json")), responseBody)

                override fun capabilities(): TransportCapabilities =
                    TransportCapabilities(supportedDeadlines = emptySet())
            }
        val executor = SdkExecutor(transport)
        val codecs = MediaTypeCodecRegistry.of(EchoCodec2)

        val result =
            runSuspendForCapabilitiesTest {
                executor.execute(
                    request =
                        SdkExecutionRequest(
                            metadata =
                                OperationMetadata(
                                    operationId = "op",
                                    method = "GET",
                                    path = "/x",
                                    requestMediaTypes = listOf("application/json"),
                                    responseMediaTypes = listOf("application/json"),
                                    successStatusCodes = setOf(200),
                                    responseMode = SdkResponseMode.BUFFERED,
                                    deadlines =
                                        SdkDeadlines(
                                            totalMillis = 1_000,
                                            attemptMillis = 1_000,
                                            idleMillis = 1_000,
                                        ),
                                ),
                            baseUri = "https://example.test",
                            requestValue = "req",
                            requestCodecIds = listOf("echo"),
                        ),
                    responseCodecIds = listOf("echo"),
                    requestCodecs = codecs,
                    responseCodecs = codecs,
                )
            }

        assertEquals("", result)
    }

    @Test
    fun executorRejectsStreamingRequestBeforeCallingTransportWhenUnsupported() {
        var executed = false
        val transport =
            object : SdkTransport {
                override suspend fun execute(request: SdkRequest): SdkResponse {
                    executed = true
                    error("must not be called")
                }

                override fun capabilities(): TransportCapabilities = TransportCapabilities(supportsStreaming = false)
            }
        val executor = SdkExecutor(transport)
        val codecs = MediaTypeCodecRegistry.of(EchoCodec2)

        val failure =
            assertFailsWith<SdkCapabilityException> {
                runSuspendForCapabilitiesTest {
                    executor.execute(
                        request =
                            SdkExecutionRequest(
                                metadata =
                                    OperationMetadata(
                                        operationId = "streamOp",
                                        method = "GET",
                                        path = "/stream",
                                        requestMediaTypes = listOf("application/json"),
                                        responseMediaTypes = listOf("application/json"),
                                        successStatusCodes = setOf(200),
                                        responseMode = SdkResponseMode.STREAMING,
                                        deadlines = SdkDeadlines(null, null, null),
                                    ),
                                baseUri = "https://example.test",
                                requestValue = "req",
                                requestCodecIds = listOf("echo"),
                            ),
                        responseCodecIds = listOf("echo"),
                        requestCodecs = codecs,
                        responseCodecs = codecs,
                    )
                }
            }

        assertFalse(executed)
        assertEquals("streamOp", failure.operationId)
        assertEquals("streaming", failure.capability)
    }
}

private object EchoCodec2 : MediaTypeCodec<String> {
    override val id: String = "echo"
    override val mediaTypes: Set<String> = setOf("application/json")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = ""
}

private fun <T> runSuspendForCapabilitiesTest(block: suspend () -> T): T {
    var outcome: Result<T>? = null
    block.startCoroutine(
        object : Continuation<T> {
            override val context = EmptyCoroutineContext

            override fun resumeWith(result: Result<T>) {
                outcome = result
            }
        },
    )
    return requireNotNull(outcome).getOrThrow()
}
