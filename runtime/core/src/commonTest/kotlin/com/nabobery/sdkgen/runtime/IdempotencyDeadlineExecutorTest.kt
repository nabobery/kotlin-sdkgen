package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.resilience.RetryBudget
import com.nabobery.sdkgen.runtime.resilience.SdkTimeoutGuard
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull

internal class IdempotencyDeadlineExecutorTest {
    @Test
    fun clientGeneratedIdempotencyKeyIsReusedAcrossAttempts() {
        val transport = ScriptedTransport().response(503).response(200)
        val metadata = metadata(idempotency = IdempotencyDescriptor("Idempotency-Key", clientGenerated = true))

        execute(transport, metadata)

        val keys = transport.requests.map { it.headers.firstValue("Idempotency-Key") }
        assertNotNull(keys[0])
        assertEquals(keys[0], keys[1])
    }

    @Test
    fun callerSuppliedIdempotencyKeyWinsOverGeneration() {
        val transport = ScriptedTransport().response(503).response(200)
        val metadata = metadata(idempotency = IdempotencyDescriptor("Idempotency-Key", clientGenerated = true))

        execute(transport, metadata, options = CallOptions(headers = listOf(SdkHeader("idempotency-key", "caller"))))

        assertEquals(listOf("caller", "caller"), transport.requests.map { it.headers.firstValue("Idempotency-Key") })
    }

    @Test
    fun logicalHooksRunOnceAndAuthenticationRunsPerAttempt() {
        val transport = ScriptedTransport().response(503).response(200)
        var hooks = 0
        var authentications = 0
        val hook =
            SdkRequestHook { request ->
                hooks += 1
                request
            }
        val auth =
            SdkAuthentication { request ->
                authentications += 1
                request
            }

        execute(transport, metadata(), authentication = auth, requestHook = hook)

        assertEquals(1, hooks)
        assertEquals(2, authentications)
    }

    @Test
    fun safeOperationRetriesPerAttemptTimeoutWithinTotalDeadline() {
        val transport = ScriptedTransport().response(200)
        val guard = DeterministicTimeoutGuard(expireCalls = mutableListOf(true, false))

        val result =
            execute(
                transport,
                metadata(
                    deadlines = SdkDeadlines(totalMillis = 1_000, attemptMillis = 50, idleMillis = null),
                    safety = OperationSafety(safe = true),
                ),
                timeoutGuard = guard,
            )

        assertEquals("ok", result)
        assertEquals(listOf(50L, 50L), guard.requested)
    }

    @Test
    fun unsafeOperationDoesNotRetryPerAttemptTimeout() {
        val transport = ScriptedTransport().response(200)
        val guard = DeterministicTimeoutGuard(expireCalls = mutableListOf(true))

        val failure =
            assertFailsWith<SdkTimeoutException> {
                execute(
                    transport,
                    metadata(deadlines = SdkDeadlines(totalMillis = 1_000, attemptMillis = 50, idleMillis = null)),
                    timeoutGuard = guard,
                )
            }

        assertEquals(TimeoutPhase.ATTEMPT, failure.phase)
        assertEquals(AttemptClassification.NOT_RETRYABLE, failure.retryHistory.single().classification)
    }

    @Test
    fun totalDeadlineIncludesBackoffAndExpiresBeforeSleepingPastBudget() {
        val transport = ScriptedTransport().response(503)
        val time = DeterministicTime(randomValue = 0.5)

        val failure =
            assertFailsWith<SdkTimeoutException> {
                execute(
                    transport,
                    metadata(deadlines = SdkDeadlines(totalMillis = 200, attemptMillis = null, idleMillis = null)),
                    time = time,
                )
            }

        assertEquals(TimeoutPhase.TOTAL, failure.phase)
        assertEquals(emptyList(), time.delays)
    }

    @Test
    fun totalDeadlineElapsedDuringFailedAttemptSurfacesTotalTimeout() {
        val time = DeterministicTime()
        val transport = ScriptedTransport(onExecute = { time.advanceBy(1_000) }).response(503)

        val failure =
            assertFailsWith<SdkTimeoutException> {
                execute(
                    transport,
                    metadata(deadlines = SdkDeadlines(totalMillis = 1_000, attemptMillis = null, idleMillis = null)),
                    time = time,
                )
            }

        assertEquals(TimeoutPhase.TOTAL, failure.phase)
        assertEquals(AttemptClassification.EXHAUSTED, failure.retryHistory.single().classification)
    }

    @Test
    fun totalDeadlineGuardUsesTotalPhaseWhenItIsShorterThanAttemptDeadline() {
        val transport = ScriptedTransport().response(200)
        val guard = DeterministicTimeoutGuard(expireCalls = mutableListOf(true))

        val failure =
            assertFailsWith<SdkTimeoutException> {
                execute(
                    transport,
                    metadata(deadlines = SdkDeadlines(totalMillis = 25, attemptMillis = 100, idleMillis = null)),
                    timeoutGuard = guard,
                )
            }

        assertEquals(TimeoutPhase.TOTAL, failure.phase)
        assertEquals(listOf(25L), guard.requested)
    }

    @Test
    fun callOptionsReplaceEnablesDefault408429And5xxSelectors() {
        val transport = ScriptedTransport().response(429).response(200)
        val options = CallOptions(retry = PolicyOverride.Replace(RetryDescriptor()))

        execute(transport, metadata(retry = null), options = options)

        assertEquals(2, transport.requests.size)
    }

    @Test
    fun streamingResponsesRemainSingleAttempt() {
        val transport = ScriptedTransport().response(503)

        assertFailsWith<SdkApiException> {
            execute(transport, metadata(responseMode = SdkResponseMode.STREAMING))
        }

        assertEquals(1, transport.requests.size)
    }

    private fun execute(
        transport: ScriptedTransport,
        metadata: OperationMetadata,
        options: CallOptions = CallOptions(),
        authentication: SdkAuthentication? = null,
        requestHook: SdkRequestHook? = null,
        time: DeterministicTime = DeterministicTime(),
        timeoutGuard: SdkTimeoutGuard = DeterministicTimeoutGuard(),
    ): String {
        val codecs = MediaTypeCodecRegistry.of(DeadlineCodec)
        return runTestSuspend {
            SdkExecutor(
                transport = transport,
                authentication = authentication,
                requestHook = requestHook,
                clock = time,
                wallClock = time,
                delayer = time,
                random = time,
                retryBudget = RetryBudget(),
                timeoutGuard = timeoutGuard,
            ).execute(
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
                options = options,
            )
        }
    }

    private fun metadata(
        retry: RetryDescriptor? =
            RetryDescriptor(
                retryableStatusCodes = listOf(ResponseSelector.StatusRange(500, 599)),
                maxAttempts = 3,
            ),
        idempotency: IdempotencyDescriptor? = null,
        deadlines: SdkDeadlines = SdkDeadlines(null, null, null),
        responseMode: SdkResponseMode = SdkResponseMode.BUFFERED,
        safety: OperationSafety = OperationSafety(),
    ): OperationMetadata =
        OperationMetadata(
            operationId = "op",
            method = "POST",
            path = "/operation",
            requestMediaTypes = listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            responseMode = responseMode,
            deadlines = deadlines,
            safety = safety,
            idempotency = idempotency,
            retry = retry,
        )
}

private class DeterministicTimeoutGuard(
    private val expireCalls: MutableList<Boolean> = mutableListOf(),
) : SdkTimeoutGuard {
    val requested = mutableListOf<Long>()

    override suspend fun runWithTimeout(
        timeoutMillis: Long,
        block: suspend () -> Unit,
    ): Boolean {
        requested += timeoutMillis
        if (expireCalls.removeFirstOrNull() == true) return false
        block()
        return true
    }
}

private data object DeadlineCodec : MediaTypeCodec<String> {
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
