package com.nabobery.sdkgen.runtime.middleware

import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkConfigurationException
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponse
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.runtime.runTestSuspend
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertIs
import kotlin.test.assertSame
import kotlin.test.assertTrue

/**
 * Item 3 (review ruling): [runAttemptChain] owns exactly one closable resource per invocation — the [SdkResponse]
 * its `terminal` produces (at most once, since `proceed` is enforced at-most-once). Whenever that produced response
 * does not end up being the chain's returned [LogicalOutcome.Success] value, its body must still be closed, with
 * the failure that displaced it (or no cause, for a substituted different success) as the close cause.
 */
internal class AttemptChainOrphanedResponseTest {
    @Test
    fun secondProceedClosesFirstResponseWithConfigurationExceptionAsCause() {
        val body = RecordingByteStream()
        val response = SdkResponse(200, emptyList(), body)
        val doubleProceed =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call)
                    return proceed(call)
                }
            }

        val thrown =
            assertFailsWith<SdkConfigurationException> {
                runTestSuspend { runAttemptChain(listOf(doubleProceed), context()) { response } }
            }

        assertTrue(body.closed)
        assertSame(thrown, body.closeCause)
    }

    @Test
    fun middlewareThrowingAfterProceedClosesResponseWithThatFailureAsCause() {
        val body = RecordingByteStream()
        val response = SdkResponse(200, emptyList(), body)
        val customFailure = IllegalStateException("boom after proceed")
        val throwingAfterProceed =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call)
                    throw customFailure
                }
            }

        val thrown =
            assertFailsWith<IllegalStateException> {
                runTestSuspend { runAttemptChain(listOf(throwingAfterProceed), context()) { response } }
            }

        assertSame(customFailure, thrown)
        assertTrue(body.closed)
        assertSame(customFailure, body.closeCause)
    }

    @Test
    fun middlewareSubstitutingFailureClosesDiscardedResponseWithThatFailureAsCause() {
        val body = RecordingByteStream()
        val response = SdkResponse(200, emptyList(), body)
        val substituteFailure = SdkTransportException("synthetic failure")
        val substitutingFailure =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call)
                    return LogicalOutcome.Failure(substituteFailure)
                }
            }

        val outcome = runTestSuspend { runAttemptChain(listOf(substitutingFailure), context()) { response } }

        val failure = assertIs<LogicalOutcome.Failure>(outcome)
        assertSame(substituteFailure, failure.error)
        assertTrue(body.closed)
        assertSame(substituteFailure, body.closeCause)
    }

    @Test
    fun middlewareSubstitutingDifferentSuccessClosesOrphanedResponseWithNoCause() {
        val orphanBody = RecordingByteStream()
        val orphanResponse = SdkResponse(200, emptyList(), orphanBody)
        val fabricatedBody = RecordingByteStream()
        val fabricatedResponse = SdkResponse(201, emptyList(), fabricatedBody)
        val substitutingSuccess =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call)
                    return LogicalOutcome.Success(fabricatedResponse)
                }
            }

        val outcome = runTestSuspend { runAttemptChain(listOf(substitutingSuccess), context()) { orphanResponse } }

        val success = assertIs<LogicalOutcome.Success<SdkResponse>>(outcome)
        assertSame(fabricatedResponse, success.value)
        assertTrue(orphanBody.closed)
        assertEquals(null, orphanBody.closeCause)
        assertFalse(fabricatedBody.closed)
    }

    @Test
    fun middlewareCopyingResponseWithSharedBodyIsNotTreatedAsOrphaned() {
        // Item 1 (review ruling): orphan detection must compare BODY identity, not SdkResponse identity.
        // `Success(originalResponse.copy(headers = ...))` shares the body and must NOT be closed.
        val body = RecordingByteStream()
        val response = SdkResponse(200, emptyList(), body)
        val headerAddingMiddleware =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    val result = proceed(call)
                    return if (result is LogicalOutcome.Success) {
                        LogicalOutcome.Success(
                            result.value.copy(headers = result.value.headers + SdkHeader("X-Extra", "1")),
                        )
                    } else {
                        result
                    }
                }
            }

        val outcome = runTestSuspend { runAttemptChain(listOf(headerAddingMiddleware), context()) { response } }

        val success = assertIs<LogicalOutcome.Success<SdkResponse>>(outcome)
        assertSame(body, success.value.body)
        assertFalse(body.closed, "a response copy sharing the same body must not be treated as orphaned")
    }

    @Test
    fun innerFabricationDiscardedByOuterFailureClosesBothTransportAndFabricatedBodies() {
        // Item 2 (review round 2 ruling): nested fabrication must not leak. The inner middleware discards the
        // terminal's real response (responseA) and fabricates responseB; the outer middleware discards responseB
        // and replaces it with a Failure. Both responseA and responseB must be closed - this composes recursively
        // per frame.
        val bodyA = RecordingByteStream()
        val responseA = SdkResponse(200, emptyList(), bodyA)
        val bodyB = RecordingByteStream()
        val responseB = SdkResponse(201, emptyList(), bodyB)
        val substituteFailure = SdkTransportException("outer replaced with failure")

        val innerFabricator =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call) // discards responseA
                    return LogicalOutcome.Success(responseB)
                }
            }
        val outerReplacingWithFailure =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call) // discards responseB
                    return LogicalOutcome.Failure(substituteFailure)
                }
            }

        val outcome =
            runTestSuspend {
                runAttemptChain(listOf(outerReplacingWithFailure, innerFabricator), context()) { responseA }
            }

        val failure = assertIs<LogicalOutcome.Failure>(outcome)
        assertSame(substituteFailure, failure.error)
        assertTrue(bodyA.closed, "the terminal's real response was never closed")
        assertEquals(null, bodyA.closeCause)
        assertTrue(bodyB.closed, "the inner-fabricated response was never closed")
        assertSame(substituteFailure, bodyB.closeCause)
    }

    @Test
    fun innerFabricationDiscardedByOuterSuccessSubstitutionSurvivesOnlyTheOutermostResponse() {
        // Item 2 (review round 2 ruling): the outer middleware discards the inner-fabricated responseB and
        // substitutes its own responseC. responseA (terminal) and responseB (inner) must both be closed; responseC
        // (the final outcome) survives untouched for decode.
        val bodyA = RecordingByteStream()
        val responseA = SdkResponse(200, emptyList(), bodyA)
        val bodyB = RecordingByteStream()
        val responseB = SdkResponse(201, emptyList(), bodyB)
        val bodyC = RecordingByteStream()
        val responseC = SdkResponse(202, emptyList(), bodyC)

        val innerFabricator =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call) // discards responseA
                    return LogicalOutcome.Success(responseB)
                }
            }
        val outerSubstitutingSuccess =
            object : AttemptMiddleware {
                override suspend fun intercept(
                    call: AttemptCallContext,
                    proceed: suspend (AttemptCallContext) -> AttemptResult,
                ): AttemptResult {
                    proceed(call) // discards responseB
                    return LogicalOutcome.Success(responseC)
                }
            }

        val outcome =
            runTestSuspend {
                runAttemptChain(listOf(outerSubstitutingSuccess, innerFabricator), context()) { responseA }
            }

        val success = assertIs<LogicalOutcome.Success<SdkResponse>>(outcome)
        assertSame(responseC, success.value)
        assertTrue(bodyA.closed, "the terminal's real response was never closed")
        assertEquals(null, bodyA.closeCause)
        assertTrue(bodyB.closed, "the inner-fabricated response was never closed")
        assertEquals(null, bodyB.closeCause)
        assertFalse(bodyC.closed, "the surviving outermost response must not be closed by the chain runner")
    }

    private fun context(): AttemptCallContext =
        AttemptCallContext(
            request =
                SdkRequest(
                    method = "GET",
                    uri = "https://example.test/op",
                    headers = emptyList(),
                    body = null,
                    expectedResponseMode = SdkResponseMode.BUFFERED,
                    deadlines = SdkDeadlines(null, null, null),
                    operationId = "op",
                ),
            operationId = "op",
            attemptNumber = 1,
            logicalCallId = "call-1",
        )
}

private class RecordingByteStream : SdkByteStream {
    var closed: Boolean = false
    var closeCause: Throwable? = null

    override suspend fun readChunk(maxBytes: Int): ByteArray? = null

    override fun close(cause: Throwable?) {
        closed = true
        closeCause = cause
    }
}
