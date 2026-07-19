package com.nabobery.sdkgen.runtime.resilience

import kotlinx.coroutines.delay
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.random.Random
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.TimeSource

/** Monotonic time source used for elapsed retry and deadline accounting. */
public fun interface SdkClock {
    /** Returns monotonic milliseconds from an arbitrary, stable origin. */
    public fun monotonicMillis(): Long
}

/** Wall-clock source used only to interpret HTTP-date `Retry-After` values. */
public fun interface SdkWallClock {
    /** Returns milliseconds since the Unix epoch. */
    public fun epochMillis(): Long
}

/** Suspension seam for retry backoff. */
public fun interface SdkDelayer {
    /** Suspends for [delayMillis]. */
    public suspend fun delay(delayMillis: Long)
}

/** Timeout seam used to guard one physical transport attempt without leaking coroutine timeout types. */
public fun interface SdkTimeoutGuard {
    /** Runs [block] and returns `true`, or cancels it at [timeoutMillis] and returns `false`. */
    public suspend fun runWithTimeout(
        timeoutMillis: Long,
        block: suspend () -> Unit,
    ): Boolean
}

/** Randomness seam used for full-jitter backoff. */
public fun interface SdkRandom {
    /** Returns a value in `[0.0, 1.0)`. */
    public fun nextDouble(): Double
}

/**
 * Client-scoped retry quota. Each automatic retry costs one token and each successful logical call restores one token,
 * up to [capacity]. Methods are safe for concurrent coroutines.
 */
public class RetryBudget(
    public val capacity: Int = DEFAULT_CAPACITY,
) {
    private val mutex: Mutex = Mutex()
    private var tokens: Int = capacity

    init {
        require(capacity > 0) { "capacity must be positive" }
    }

    /** Returns whether a retry token is currently available without consuming it. */
    public suspend fun hasCapacity(): Boolean = mutex.withLock { tokens > 0 }

    /** Consumes one token when available. */
    public suspend fun tryConsumeRetry(): Boolean =
        mutex.withLock {
            if (tokens == 0) {
                false
            } else {
                tokens -= 1
                true
            }
        }

    /** Restores one token after a successful logical call, capped at [capacity]. */
    public suspend fun recordSuccess() {
        mutex.withLock {
            if (tokens < capacity) tokens += 1
        }
    }

    public companion object {
        /** Default client-scoped retry quota capacity. */
        public const val DEFAULT_CAPACITY: Int = 10
    }
}

internal object SystemSdkClock : SdkClock {
    private val origin = TimeSource.Monotonic.markNow()

    override fun monotonicMillis(): Long = origin.elapsedNow().inWholeMilliseconds
}

@OptIn(ExperimentalTime::class)
internal object SystemSdkWallClock : SdkWallClock {
    override fun epochMillis(): Long = Clock.System.now().toEpochMilliseconds()
}

internal object CoroutineSdkDelayer : SdkDelayer {
    override suspend fun delay(delayMillis: Long) {
        kotlinx.coroutines.delay(delayMillis)
    }
}

internal object CoroutineSdkTimeoutGuard : SdkTimeoutGuard {
    override suspend fun runWithTimeout(
        timeoutMillis: Long,
        block: suspend () -> Unit,
    ): Boolean = withTimeoutOrNull(timeoutMillis) { block() } != null
}

internal object DefaultSdkRandom : SdkRandom {
    override fun nextDouble(): Double = Random.nextDouble()
}
