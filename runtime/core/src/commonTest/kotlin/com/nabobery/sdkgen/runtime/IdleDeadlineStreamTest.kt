package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.resilience.SdkTimeoutGuard
import kotlin.coroutines.cancellation.CancellationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame

internal class IdleDeadlineStreamTest {
    @Test
    fun firstByteStallThrowsStreamIdleTimeoutAndClosesWithSameCause() {
        val delegate = IdleRecordingStream()
        val stream = delegate.withIdleDeadline(50, "op", ScriptedTimeoutGuard(true))

        val failure = assertFailsWith<SdkTimeoutException> { runTestSuspend { stream.readChunk() } }

        assertEquals(TimeoutPhase.STREAM_IDLE, failure.phase)
        assertSame(failure, delegate.closeCause)
        assertEquals(1, delegate.closeCalls)
    }

    @Test
    fun midStreamStallClosesAfterEarlierChunk() {
        val delegate = IdleRecordingStream(byteArrayOf(1))
        val stream = delegate.withIdleDeadline(50, "op", ScriptedTimeoutGuard(false, true))

        assertEquals(byteArrayOf(1).toList(), runTestSuspend { stream.readChunk() }?.toList())
        val failure = assertFailsWith<SdkTimeoutException> { runTestSuspend { stream.readChunk() } }

        assertEquals(TimeoutPhase.STREAM_IDLE, failure.phase)
        assertSame(failure, delegate.closeCause)
    }

    @Test
    fun eofCompletesNormallyWhenReadFinishesBeforeIdleDeadline() {
        val delegate = IdleRecordingStream()
        val stream = delegate.withIdleDeadline(50, "op", ScriptedTimeoutGuard(false))

        assertEquals(null, runTestSuspend { stream.readChunk() })
        assertEquals(0, delegate.closeCalls)
    }

    @Test
    fun cancellationIdentityIsPreservedAndClosesWithCancellation() {
        val cancellation = CancellationException("cancelled")
        val delegate = IdleRecordingStream(failure = cancellation)
        val stream = delegate.withIdleDeadline(50, "op", ScriptedTimeoutGuard(false))

        val thrown = assertFailsWith<CancellationException> { runTestSuspend { stream.readChunk() } }

        assertSame(cancellation, thrown)
        assertSame(cancellation, delegate.closeCause)
    }
}

private class ScriptedTimeoutGuard(
    private vararg val expired: Boolean,
) : SdkTimeoutGuard {
    private var index = 0

    override suspend fun runWithTimeout(
        timeoutMillis: Long,
        block: suspend () -> Unit,
    ): Boolean {
        val isExpired = expired.getOrNull(index++) ?: false
        if (isExpired) return false
        block()
        return true
    }
}

private class IdleRecordingStream(
    private val chunk: ByteArray? = null,
    private val failure: Throwable? = null,
) : SdkByteStream {
    var closeCause: Throwable? = null
    var closeCalls: Int = 0

    override suspend fun readChunk(maxBytes: Int): ByteArray? {
        failure?.let { throw it }
        return chunk
    }

    override fun close(cause: Throwable?) {
        closeCalls += 1
        if (closeCause == null) closeCause = cause
    }
}
