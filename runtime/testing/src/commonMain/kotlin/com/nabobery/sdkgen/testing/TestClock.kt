package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.resilience.SdkClock
import com.nabobery.sdkgen.runtime.resilience.SdkDelayer
import com.nabobery.sdkgen.runtime.resilience.SdkTimeoutGuard
import com.nabobery.sdkgen.runtime.resilience.SdkWallClock

/**
 * Deterministic clock and delayer for runtime contract tests. Delays advance both monotonic and wall time immediately;
 * no wall-clock waiting occurs.
 */
public class TestClock(
    monotonicMillis: Long = 0,
    epochMillis: Long = 0,
) : SdkClock,
    SdkWallClock,
    SdkDelayer,
    SdkTimeoutGuard {
    private var monotonicNow: Long = monotonicMillis
    private var epochNow: Long = epochMillis
    private val recordedDelays: MutableList<Long> = mutableListOf()
    private val recordedTimeoutGuards: MutableList<Long> = mutableListOf()
    private var expireNextGuard: Boolean = false

    /** Delays requested so far, in order. */
    public val delays: List<Long>
        get() = recordedDelays.toList()

    /** Timeout guards requested so far, in order. */
    public val timeoutGuards: List<Long>
        get() = recordedTimeoutGuards.toList()

    override fun monotonicMillis(): Long = monotonicNow

    override fun epochMillis(): Long = epochNow

    override suspend fun delay(delayMillis: Long) {
        require(delayMillis >= 0) { "delayMillis must not be negative" }
        recordedDelays += delayMillis
        advanceBy(delayMillis)
    }

    override suspend fun runWithTimeout(
        timeoutMillis: Long,
        block: suspend () -> Unit,
    ): Boolean {
        require(timeoutMillis > 0) { "timeoutMillis must be positive" }
        recordedTimeoutGuards += timeoutMillis
        if (expireNextGuard) {
            expireNextGuard = false
            advanceBy(timeoutMillis)
            return false
        }
        block()
        return true
    }

    /** Makes the next [runWithTimeout] call expire without running its block. */
    public fun timeoutNextGuard() {
        expireNextGuard = true
    }

    /** Advances both clocks without recording a requested delay. */
    public fun advanceBy(millis: Long) {
        require(millis >= 0) { "millis must not be negative" }
        monotonicNow += millis
        epochNow += millis
    }
}
