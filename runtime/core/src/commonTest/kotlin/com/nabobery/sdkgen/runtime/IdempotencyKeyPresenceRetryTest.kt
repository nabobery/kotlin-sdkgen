package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.middleware.AttemptCallContext
import com.nabobery.sdkgen.runtime.middleware.AttemptMiddleware
import com.nabobery.sdkgen.runtime.middleware.AttemptResult
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * Item 2 (review ruling): the retry engine's idempotency-key-presence check must describe the request that could
 * actually have reached the server - the FINAL, post-attempt-middleware request - not the pre-middleware view a
 * middleware may have stripped a key from or added one to.
 */
internal class IdempotencyKeyPresenceRetryTest {
    @Test
    fun middlewareStrippingGeneratedKeyIsNotClassifiedRetrySafe() {
        val transport = ScriptedTransport().failure(indeterminateConnectionFailure()).response(200)
        val time = DeterministicTime()
        val strippingMiddleware =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    val stripped = call.request.copy(headers = call.request.headers.filterNot { it.name == KEY_HEADER })
                    return proceed(call.copy(request = stripped))
                }
            }

        assertFailsWith<SdkTransportException> {
            execute(
                transport,
                time,
                attemptMiddleware = listOf(strippingMiddleware),
                idempotency = IdempotencyDescriptor(keyHeader = KEY_HEADER, clientGenerated = true),
            )
        }

        // Not retried: the key was present pre-middleware (auto-generated) but stripped before transport, so the
        // final request could not be safely retried on its idempotency key alone.
        assertEquals(1, transport.requests.size)
    }

    @Test
    fun middlewareAddingKeyIsVisibleToRetryClassification() {
        val transport = ScriptedTransport().failure(indeterminateConnectionFailure()).response(200)
        val time = DeterministicTime()
        val addingMiddleware =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    val withKey = call.request.copy(headers = call.request.headers + SdkHeader(KEY_HEADER, "mw-key"))
                    return proceed(call.copy(request = withKey))
                }
            }

        val result =
            execute(
                transport,
                time,
                attemptMiddleware = listOf(addingMiddleware),
                idempotency = IdempotencyDescriptor(keyHeader = KEY_HEADER, clientGenerated = false),
            )

        // Retried: the key was absent pre-middleware (never auto-generated) but present on the final, post-
        // middleware request the retry decision must describe.
        assertEquals("ok", result)
        assertTrue(transport.requests.size == 2)
    }

    @Test
    fun outerStripsKeyAndInnerShortCircuitBeforeTerminalIsNotClassifiedKeySafe() {
        // Item 3 (review round 2 ruling): the request must be recorded at EVERY frame entry (deepest-recorded
        // wins), not just at the terminal - so an outer middleware's mutation is visible to retry classification
        // even when an inner middleware short-circuits before the terminal ever runs.
        var attemptInvocations = 0
        val time = DeterministicTime()
        val outerStripping =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    attemptInvocations += 1
                    val stripped = call.request.copy(headers = call.request.headers.filterNot { it.name == KEY_HEADER })
                    return proceed(call.copy(request = stripped))
                }
            }
        val innerShortCircuit =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult = throw indeterminateConnectionFailure()
            }
        val transport = ScriptedTransport().response(200)

        assertFailsWith<SdkTransportException> {
            execute(
                transport,
                time,
                attemptMiddleware = listOf(outerStripping, innerShortCircuit),
                idempotency = IdempotencyDescriptor(keyHeader = KEY_HEADER, clientGenerated = true),
                maxAttempts = 2,
            )
        }

        // Not retried: the deepest point reached (the outer middleware's frame, since the inner one short-
        // circuited before the terminal) shows the key already stripped.
        assertEquals(1, attemptInvocations)
    }

    @Test
    fun outerAddsKeyAndInnerShortCircuitBeforeTerminalIsClassifiedKeySafe() {
        var attemptInvocations = 0
        val time = DeterministicTime()
        val outerAdding =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    attemptInvocations += 1
                    val withKey = call.request.copy(headers = call.request.headers + SdkHeader(KEY_HEADER, "mw-key"))
                    return proceed(call.copy(request = withKey))
                }
            }
        val innerShortCircuit =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult = throw indeterminateConnectionFailure()
            }
        val transport = ScriptedTransport().response(200)

        assertFailsWith<SdkTransportException> {
            execute(
                transport,
                time,
                attemptMiddleware = listOf(outerAdding, innerShortCircuit),
                idempotency = IdempotencyDescriptor(keyHeader = KEY_HEADER, clientGenerated = false),
                maxAttempts = 2,
            )
        }

        // Retried once (until maxAttempts = 2 is exhausted): the deepest point reached shows the key added by the
        // outer middleware, even though the inner middleware short-circuited before the terminal every attempt.
        assertEquals(2, attemptInvocations)
    }

    private fun indeterminateConnectionFailure(): SdkTransportException =
        SdkTransportException("connection reset", "op", requestMayHaveReachedServer = true)

    private fun execute(
        transport: ScriptedTransport,
        time: DeterministicTime,
        attemptMiddleware: List<AttemptMiddleware>,
        idempotency: IdempotencyDescriptor,
        maxAttempts: Int? = null,
    ): String {
        val codecs = MediaTypeCodecRegistry.of(IdempotencyStringCodec)
        val executor =
            SdkExecutor(
                transport = transport,
                clock = time,
                wallClock = time,
                delayer = time,
                random = time,
                attemptMiddleware = attemptMiddleware,
            )
        return runTestSuspend {
            executor.execute(
                request =
                    SdkExecutionRequest(
                        metadata =
                            OperationMetadata(
                                operationId = "op",
                                method = "POST",
                                path = "/op",
                                requestMediaTypes = listOf("text/plain"),
                                responseMediaTypes = listOf("text/plain"),
                                successStatusCodes = setOf(200),
                                responseMode = SdkResponseMode.BUFFERED,
                                deadlines = SdkDeadlines(null, null, null),
                                // Both false: only idempotencyKeyPresent can make this connection-style failure retry-safe.
                                safety = OperationSafety(safe = false, idempotent = false),
                                idempotency = idempotency,
                                retry = RetryDescriptor(retryConnectionErrors = true, maxAttempts = maxAttempts),
                            ),
                        baseUri = "https://example.test",
                        requestValue = "request",
                        requestCodecIds = listOf("text"),
                    ),
                responseCodecIds = listOf("text"),
                requestCodecs = codecs,
                responseCodecs = codecs,
                options = CallOptions(),
            )
        }
    }

    private companion object {
        const val KEY_HEADER = "Idempotency-Key"
    }
}

private object IdempotencyStringCodec : MediaTypeCodec<String> {
    override val id: String = "text"
    override val mediaTypes: Set<String> = setOf("text/plain")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = body.readChunk()?.decodeToString().orEmpty()
}
