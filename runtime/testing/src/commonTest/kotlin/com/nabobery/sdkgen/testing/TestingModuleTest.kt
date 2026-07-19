package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.resilience.RetryBudget
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

internal class TestingModuleTest {
    @Test
    fun scriptedResponseCapturesRequestAndExposesChunks() {
        val body = FakeByteStream(chunks = listOf("first".encodeToByteArray(), "second".encodeToByteArray()))
        val transport = FakeTransport().enqueueResponse(statusCode = 200, body = body)

        val response = runSuspend { transport.execute(request()) }

        assertEquals(1, transport.capturedRequests.size)
        assertEquals("operation", transport.capturedRequests.single().operationId)
        assertContentEquals("first".encodeToByteArray(), runSuspend { response.body.readChunk() })
        assertContentEquals("second".encodeToByteArray(), runSuspend { response.body.readChunk() })
        assertEquals(null, runSuspend { response.body.readChunk() })
    }

    @Test
    fun failureBeforeSendIsInjected() {
        val transport = FakeTransport().enqueueFailure(IllegalStateException("before send"))

        val failure = assertFailsWith<IllegalStateException> { runSuspend { transport.execute(request()) } }

        assertEquals("before send", failure.message)
        assertEquals(1, transport.capturedRequests.size)
    }

    @Test
    fun bodyReadFailureCanOccurBeforeDataOrAfterPartialStream() {
        val duringRead = FakeByteStream(failure = IllegalStateException("during read"), failAtRead = 0)
        assertFailsWith<IllegalStateException> { runSuspend { duringRead.readChunk() } }

        val afterPartial =
            FakeByteStream(
                chunks = listOf("partial".encodeToByteArray()),
                failure = IllegalStateException("after partial"),
                failAtRead = 1,
            )
        assertContentEquals("partial".encodeToByteArray(), runSuspend { afterPartial.readChunk() })
        assertFailsWith<IllegalStateException> { runSuspend { afterPartial.readChunk() } }
    }

    @Test
    fun testClockProvidesDeterministicMonotonicWallAndDelayTime() {
        val clock = TestClock(monotonicMillis = 100, epochMillis = 1_700_000_000_000)

        runSuspend { clock.delay(250) }

        assertEquals(350, clock.monotonicMillis())
        assertEquals(1_700_000_000_250, clock.epochMillis())
        assertEquals(listOf(250L), clock.delays)
    }

    @Test
    fun testClockCanDeterministicallyExpireTheNextTimeoutGuard() {
        val clock = TestClock()
        clock.timeoutNextGuard()
        var ran = false

        val completed = runSuspend { clock.runWithTimeout(25) { ran = true } }

        assertEquals(false, completed)
        assertEquals(false, ran)
        assertEquals(listOf(25L), clock.timeoutGuards)
    }

    @Test
    fun retryBudgetConsumesRetriesAndRefillsOneTokenOnSuccess() {
        val budget = RetryBudget(capacity = 2)

        assertTrue(runSuspend { budget.tryConsumeRetry() })
        assertTrue(runSuspend { budget.tryConsumeRetry() })
        assertEquals(false, runSuspend { budget.tryConsumeRetry() })
        runSuspend { budget.recordSuccess() }
        assertTrue(runSuspend { budget.tryConsumeRetry() })
    }

    @Test
    fun closureAssertionsDistinguishNormalAndExceptionalClose() {
        val normal = FakeByteStream()
        normal.close()
        normal.assertClosedNormally()

        val cause = IllegalArgumentException("decode")
        val failed = FakeByteStream()
        failed.close(cause)
        failed.assertClosedWith(cause)
        assertTrue(failed.closed)
    }

    private fun request(): SdkRequest =
        SdkRequest(
            method = "GET",
            uri = "https://example.test",
            headers = emptyList(),
            body = null,
            expectedResponseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(1_000, 1_000, 1_000),
            operationId = "operation",
        )
}

private fun <T> runSuspend(block: suspend () -> T): T {
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
