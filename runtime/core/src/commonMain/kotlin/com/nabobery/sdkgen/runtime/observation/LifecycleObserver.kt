package com.nabobery.sdkgen.runtime.observation

import com.nabobery.sdkgen.runtime.AttemptClassification
import kotlin.coroutines.cancellation.CancellationException

/**
 * A low-cardinality classification of how a call or attempt ended, shared by
 * [SdkLifecycleObserver.attemptCompleted] (the [AttemptOutcomeSignal.Failure] arm), [SdkLifecycleObserver.callCompleted],
 * and [SdkLifecycleObserver.callFailed].
 *
 * Deliberately excludes anything with unbounded cardinality (no status codes, URLs, header values, or messages) —
 * this is the telemetry SPI's contract for staying safe to aggregate and export as-is.
 */
public enum class SdkOutcomeKind {
    SUCCESS,
    CANCELLED,
    TIMEOUT,
    TRANSPORT_ERROR,
    AUTHENTICATION_ERROR,
    SERIALIZATION_ERROR,
    API_ERROR,
    CAPABILITY_ERROR,
    CONFIGURATION_ERROR,
    UNKNOWN,
}

/**
 * How one physical attempt ended, reported to [SdkLifecycleObserver.attemptCompleted].
 *
 * [StatusClass] deliberately reports only the response's hundreds digit (e.g. `2` for any `2xx`, `5` for any `5xx`)
 * rather than the raw status code, keeping the field low-cardinality per the telemetry SPI contract.
 */
public sealed interface AttemptOutcomeSignal {
    public data class StatusClass(
        public val hundredsDigit: Int,
    ) : AttemptOutcomeSignal {
        init {
            require(hundredsDigit in 1..5) { "hundredsDigit must be in 1..5, got $hundredsDigit" }
        }
    }

    public data class Failure(
        public val kind: SdkOutcomeKind,
    ) : AttemptOutcomeSignal
}

/**
 * Read-only telemetry SPI: the runtime's sole hook for observability. Every callback is a fast, non-suspending,
 * side-effect-only notification — an observer cannot alter the request, the response, or the outcome of the call it
 * is observing.
 *
 * All fields surfaced here are deliberately low-cardinality: no URLs with expanded parameter values, no header or
 * body content, no user identifiers. [callStarted]'s `normalizedRoute` is always the operation's path *template*
 * (see [com.nabobery.sdkgen.runtime.OperationMetadata.path]), never an expanded URI.
 *
 * Observer failures are contained: a throwing implementation never alters the call's outcome, and never prevents
 * other registered observers from running. This is the same containment guarantee
 * [com.nabobery.sdkgen.runtime.bodies.TransferObserver] makes for transfer progress callbacks. Cancellation of the
 * call itself is never swallowed by this containment — an observer callback throwing on a call that is being
 * cancelled does not change the fact that [kotlin.coroutines.cancellation.CancellationException] propagates out of
 * the call by identity.
 *
 * Every callback has a no-op default so an implementation overrides only the events it cares about.
 */
public interface SdkLifecycleObserver {
    /** Fired once, when a logical call begins. */
    public fun callStarted(
        callId: String,
        operationId: String,
        method: String,
        normalizedRoute: String,
    ) {
    }

    /** Fired once per physical attempt, before authentication/signing and transport run. */
    public fun attemptStarted(
        callId: String,
        attemptNumber: Int,
    ) {
    }

    /** Fired once per physical attempt, after it has fully concluded (including decoding). */
    public fun attemptCompleted(
        callId: String,
        attemptNumber: Int,
        outcome: AttemptOutcomeSignal,
        durationMillis: Long,
    ) {
    }

    /** Fired when the retry engine schedules another attempt after this one. */
    public fun retryScheduled(
        callId: String,
        delayMillis: Long,
        classification: AttemptClassification,
    ) {
    }

    /** Fired once, when a logical call reaches a terminal outcome (success or failure, including cancellation). */
    public fun callCompleted(
        callId: String,
        outcome: SdkOutcomeKind,
        totalAttempts: Int,
        durationMillis: Long,
    ) {
    }

    /** Fired once, in addition to [callCompleted], whenever a logical call ends in failure (including cancellation). */
    public fun callFailed(
        callId: String,
        kind: SdkOutcomeKind,
    ) {
    }
}

/**
 * Invokes [block] against every observer in [observers], containing (and discarding) any failure so one throwing
 * observer never stops the rest from running and never alters the caller's outcome. Mirrors the containment pattern
 * used for [com.nabobery.sdkgen.runtime.bodies.TransferObserver] callbacks.
 */
internal fun notifyObservers(
    observers: List<SdkLifecycleObserver>,
    block: (SdkLifecycleObserver) -> Unit,
) {
    for (observer in observers) {
        try {
            block(observer)
        } catch (_: CancellationException) {
            // Contained: an observer callback is not suspending and cannot legitimately carry call cancellation;
            // see the class KDoc for why the call's own cancellation is unaffected by this containment.
        } catch (_: Throwable) {
            // Contained: observer failures never alter the call's outcome.
        }
    }
}
