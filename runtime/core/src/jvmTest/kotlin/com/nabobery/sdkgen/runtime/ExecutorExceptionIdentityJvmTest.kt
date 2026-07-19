package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.resilience.SdkTimeoutGuard
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.awaitCancellation
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame

internal class ExecutorExceptionIdentityJvmTest {
    @Test
    fun transportFailureCauseIdentityIsPreservedWithAttemptDeadline() {
        val transportFailure = IllegalStateException("offline")

        val failure =
            assertFailsWith<SdkTransportException> {
                execute(
                    transport = SdkTransport { throw transportFailure },
                    deadlines = SdkDeadlines(totalMillis = null, attemptMillis = 1_000, idleMillis = null),
                )
            }

        assertSame(transportFailure, failure.cause)
    }

    @Test
    fun transportFailureCauseIdentityIsPreservedWithoutDeadlines() {
        val transportFailure = IllegalStateException("offline")

        val failure =
            assertFailsWith<SdkTransportException> {
                execute(transport = SdkTransport { throw transportFailure })
            }

        assertSame(transportFailure, failure.cause)
    }

    @Test
    fun cancellationIdentityIsPreservedWithAttemptDeadline() {
        val cancellation = CancellationException("cancelled")

        val failure =
            assertFailsWith<CancellationException> {
                execute(
                    transport = SdkTransport { throw cancellation },
                    deadlines = SdkDeadlines(totalMillis = null, attemptMillis = 1_000, idleMillis = null),
                    timeoutGuard = PassthroughTimeoutGuard,
                )
            }

        assertSame(cancellation, failure)
    }

    @Test
    fun responseDecodeFailureCauseIdentityIsPreservedAfterDeadlineGuard() {
        val decodeFailure = IllegalArgumentException("bad response")
        val responseCodec =
            object : MediaTypeCodec<String> by IdentityCodec {
                override suspend fun decode(
                    body: SdkByteStream,
                    mediaType: String?,
                ): String = throw decodeFailure
            }

        val failure =
            assertFailsWith<SdkSerializationException> {
                execute(
                    transport = SdkTransport { SdkResponse(200, emptyList(), IdentityStream("response")) },
                    deadlines = SdkDeadlines(totalMillis = null, attemptMillis = 1_000, idleMillis = null),
                    responseCodec = responseCodec,
                )
            }

        assertSame(decodeFailure, failure.cause)
    }

    @Test
    fun attemptDeadlineSurfacesAttemptTimeout() {
        val failure =
            assertFailsWith<SdkTimeoutException> {
                execute(
                    transport = SdkTransport { awaitCancellation() },
                    deadlines = SdkDeadlines(totalMillis = null, attemptMillis = 1, idleMillis = null),
                )
            }

        assertEquals(TimeoutPhase.ATTEMPT, failure.phase)
    }

    private fun execute(
        transport: SdkTransport,
        deadlines: SdkDeadlines = SdkDeadlines(totalMillis = null, attemptMillis = null, idleMillis = null),
        timeoutGuard: SdkTimeoutGuard? = null,
        responseCodec: MediaTypeCodec<String> = IdentityCodec,
    ): String =
        runBlocking {
            val requestCodecs = MediaTypeCodecRegistry.of(IdentityCodec)
            val responseCodecs = MediaTypeCodecRegistry.of(responseCodec)
            val executor = timeoutGuard?.let { SdkExecutor(transport, timeoutGuard = it) } ?: SdkExecutor(transport)
            executor.execute(
                request =
                    SdkExecutionRequest(
                        metadata =
                            OperationMetadata(
                                operationId = "op",
                                method = "GET",
                                path = "/operation",
                                requestMediaTypes = listOf("application/json"),
                                responseMediaTypes = listOf("application/json"),
                                successStatusCodes = setOf(200),
                                responseMode = SdkResponseMode.BUFFERED,
                                deadlines = deadlines,
                            ),
                        baseUri = "https://example.test",
                        requestValue = "request",
                        requestCodecIds = listOf("json"),
                    ),
                responseCodecIds = listOf("json"),
                requestCodecs = requestCodecs,
                responseCodecs = responseCodecs,
            )
        }
}

private class IdentityStream(
    value: String,
) : SdkByteStream {
    private var bytes: ByteArray? = value.encodeToByteArray()

    override suspend fun readChunk(maxBytes: Int): ByteArray? = bytes.also { bytes = null }

    override fun close(cause: Throwable?) {}
}

private data object PassthroughTimeoutGuard : SdkTimeoutGuard {
    override suspend fun runWithTimeout(
        timeoutMillis: Long,
        block: suspend () -> Unit,
    ): Boolean {
        block()
        return true
    }
}

private data object IdentityCodec : MediaTypeCodec<String> {
    override val id: String = "json"
    override val mediaTypes: Set<String> = setOf("application/json")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = body.readChunk()?.decodeToString().orEmpty()
}
