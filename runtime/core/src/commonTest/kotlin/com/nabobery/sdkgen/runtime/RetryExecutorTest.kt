package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.resilience.RetryBudget
import kotlin.coroutines.cancellation.CancellationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class RetryExecutorTest {
    @Test
    fun safeOperationRetriesRetryableStatusAndSucceeds() {
        val transport = ScriptedTransport().response(503).response(200, "ok")
        val time = DeterministicTime()

        val result = execute(transport, metadata = metadata(safe = true), time = time)

        assertEquals("ok", result)
        assertEquals(2, transport.requests.size)
        assertEquals(1, time.delays.size)
    }

    @Test
    fun contractRetryDescriptorWithEmptyStatusesUsesDefaultRetryableStatuses() {
        val transport = ScriptedTransport().response(503).response(200, "ok")
        val retry = RetryDescriptor(retryConnectionErrors = true)

        assertEquals("ok", execute(transport, metadata = metadata(safe = true, retry = retry)))
        assertEquals(2, transport.requests.size)
    }

    @Test
    fun unsafeOperationDoesNotRetryConnectionFailureThatMayHaveReachedServer() {
        val transport = ScriptedTransport().failure(SdkTransportException("connection lost"))
        val retry = RetryDescriptor(retryConnectionErrors = true)

        val failure =
            assertFailsWith<SdkTransportException> {
                execute(transport, metadata = metadata(retry = retry))
            }

        assertEquals(1, transport.requests.size)
        assertEquals(AttemptClassification.NOT_RETRYABLE, failure.retryHistory.single().classification)
    }

    @Test
    fun explicitlyRetryableStatusAllowsUnsafeOperation() {
        val transport = ScriptedTransport().response(409).response(200, "ok")
        val retry = RetryDescriptor(retryableStatusCodes = listOf(ResponseSelector.ExactStatus(409)))

        assertEquals("ok", execute(transport, metadata = metadata(retry = retry)))
        assertEquals(2, transport.requests.size)
    }

    @Test
    fun connectionFailureBeforeSendRetriesUnsafeOneShotBody() {
        val beforeSend = SdkTransportException("connect failed", requestMayHaveReachedServer = false)
        val transport = ScriptedTransport().failure(beforeSend).response(200, "ok")
        val body = SdkRequestBody.OneShot(EmptyStream, "application/json")
        val retry = RetryDescriptor(retryConnectionErrors = true)

        assertEquals("ok", execute(transport, metadata = metadata(retry = retry), encodedBody = body))
        assertSame(body, transport.requests[0].body)
        assertSame(body, transport.requests[1].body)
    }

    @Test
    fun oneShotBodyIsNeverRetriedAfterRequestMayHaveReachedServer() {
        val transport = ScriptedTransport().response(503)
        val body = SdkRequestBody.OneShot(EmptyStream, "application/json")

        assertFailsWith<SdkApiException> {
            execute(transport, metadata = metadata(safe = true), encodedBody = body)
        }

        assertEquals(1, transport.requests.size)
    }

    @Test
    fun replayFactoryCreatesFreshBodyForEveryAttempt() {
        var creates = 0
        val factory =
            SdkRequestBody.ReplayFactory("application/json") {
                creates += 1
                SdkRequestBody.Bytes("body-$creates".encodeToByteArray(), "application/json")
            }
        val transport = ScriptedTransport().response(503).response(200, "ok")

        assertEquals("ok", execute(transport, metadata = metadata(safe = true), encodedBody = factory))
        assertEquals(2, creates)
    }

    @Test
    fun replayFactoryMayCreateFreshOneShotBodiesForRetries() {
        var creates = 0
        val factory =
            SdkRequestBody.ReplayFactory("application/json") {
                creates += 1
                SdkRequestBody.OneShot(EmptyStream, "application/json")
            }
        val transport = ScriptedTransport().response(503).response(200, "ok")

        assertEquals("ok", execute(transport, metadata = metadata(safe = true), encodedBody = factory))
        assertEquals(2, creates)
    }

    @Test
    fun retryAfterDeltaSecondsWinsWhenWithinCap() {
        val transport =
            ScriptedTransport()
                .response(503, headers = listOf(SdkHeader("Retry-After", "2")))
                .response(200, "ok")
        val time = DeterministicTime()

        execute(transport, metadata = metadata(safe = true), time = time)

        assertEquals(listOf(2_000L), time.delays)
    }

    @Test
    fun retryAfterHttpDateWinsWhenWithinCapAndFallsBackAboveCap() {
        val time = DeterministicTime(epoch = 784_111_777_000)
        val within =
            ScriptedTransport()
                .response(503, headers = listOf(SdkHeader("Retry-After", "Sun, 06 Nov 1994 08:49:40 GMT")))
                .response(200, "ok")
        execute(within, metadata = metadata(safe = true), time = time)
        assertEquals(listOf(3_000L), time.delays)

        val cappedTime = DeterministicTime(epoch = 784_111_777_000, randomValue = 0.5)
        val aboveCap =
            ScriptedTransport()
                .response(503, headers = listOf(SdkHeader("Retry-After", "Sun, 06 Nov 1994 08:51:00 GMT")))
                .response(200, "ok")
        execute(aboveCap, metadata = metadata(safe = true), time = cappedTime)
        assertEquals(listOf(250L), cappedTime.delays)
    }

    @Test
    fun fullJitterBackoffStaysWithinExponentialBounds() {
        val transport = ScriptedTransport().response(503).response(503).response(200, "ok")
        val time = DeterministicTime(randomValue = 0.999)

        execute(transport, metadata = metadata(safe = true), time = time)

        assertTrue(time.delays[0] in 0..499)
        assertTrue(time.delays[1] in 0..999)
    }

    @Test
    fun retryQuotaExhaustionSurfacesFinalExceptionWithHistory() {
        val transport = ScriptedTransport().response(503).response(503)
        val budget = RetryBudget(capacity = 1)

        val failure =
            assertFailsWith<SdkApiException> {
                execute(transport, metadata = metadata(safe = true), retryBudget = budget)
            }

        assertEquals(2, failure.retryHistory.size)
        assertEquals(AttemptClassification.RETRIED, failure.retryHistory[0].classification)
        assertEquals(AttemptClassification.EXHAUSTED, failure.retryHistory[1].classification)
    }

    @Test
    fun exhaustedBudgetClassifiesUnsafeOperationAsExhausted() {
        val budget = RetryBudget(capacity = 1)
        runTestSuspend { budget.tryConsumeRetry() }
        val transport = ScriptedTransport().failure(SdkTransportException("connection lost"))
        val retry = RetryDescriptor(retryConnectionErrors = true)

        val failure =
            assertFailsWith<SdkTransportException> {
                execute(transport, metadata = metadata(retry = retry), retryBudget = budget)
            }

        assertEquals(AttemptClassification.EXHAUSTED, failure.retryHistory.single().classification)
    }

    @Test
    fun safetyRefusedRetryDoesNotConsumeBudget() {
        val budget = RetryBudget(capacity = 1)
        val unsafeTransport = ScriptedTransport().failure(SdkTransportException("connection lost"))
        val retry = RetryDescriptor(retryConnectionErrors = true)

        assertFailsWith<SdkTransportException> {
            execute(unsafeTransport, metadata = metadata(retry = retry), retryBudget = budget)
        }

        assertTrue(runTestSuspend { budget.hasCapacity() })
    }

    @Test
    fun cancellationDuringRetryDelayIsRethrownByIdentity() {
        val cancellation = CancellationException("cancel")
        val time = DeterministicTime(delayFailure = cancellation)
        val transport = ScriptedTransport().response(503)

        val thrown =
            assertFailsWith<CancellationException> {
                execute(transport, metadata = metadata(safe = true), time = time)
            }

        assertSame(cancellation, thrown)
    }

    private fun execute(
        transport: ScriptedTransport,
        metadata: OperationMetadata,
        time: DeterministicTime = DeterministicTime(),
        retryBudget: RetryBudget = RetryBudget(),
        encodedBody: SdkRequestBody = SdkRequestBody.Bytes("request".encodeToByteArray(), "application/json"),
    ): String {
        val codec = FixedBodyCodec(encodedBody)
        val codecs = MediaTypeCodecRegistry.of(codec)
        val executor =
            SdkExecutor(
                transport = transport,
                clock = time,
                wallClock = time,
                delayer = time,
                random = time,
                retryBudget = retryBudget,
            )
        return runTestSuspend {
            executor.execute(
                request =
                    SdkExecutionRequest(
                        metadata = metadata,
                        baseUri = "https://example.test",
                        requestValue = "request",
                        requestCodecIds = listOf("json"),
                    ),
                responseCodecIds = listOf("json"),
                requestCodecs = codecs,
                responseCodecs = codecs,
            )
        }
    }

    private fun metadata(
        safe: Boolean = false,
        retry: RetryDescriptor? =
            RetryDescriptor(retryableStatusCodes = listOf(ResponseSelector.StatusRange(500, 599))),
    ): OperationMetadata =
        OperationMetadata(
            operationId = "op",
            method = "POST",
            path = "/operation",
            requestMediaTypes = listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            responseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(null, null, null),
            safety = OperationSafety(safe = safe),
            retry = retry,
        )
}

private class FixedBodyCodec(
    private val encodedBody: SdkRequestBody,
) : MediaTypeCodec<String> {
    override val id: String = "json"
    override val mediaTypes: Set<String> = setOf("application/json")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = encodedBody

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = body.readChunk()?.decodeToString().orEmpty()
}

private data object EmptyStream : SdkByteStream {
    override suspend fun readChunk(maxBytes: Int): ByteArray? = null

    override fun close(cause: Throwable?) {}
}
