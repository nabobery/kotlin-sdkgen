package com.nabobery.sdkgen.runtime.middleware

import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponse

/**
 * A neutral, immutable view of one logical call, handed to [LogicalMiddleware.intercept].
 *
 * @property request the request as it stands entering this middleware. A middleware that wants to mutate the
 *   request calls `proceed` with a copy of this context whose [request] differs; see [LogicalMiddleware] for the
 *   validation applied to that replacement.
 * @property operationId the operation this call invokes.
 * @property method the HTTP method of [request].
 * @property normalizedRoute the operation's path *template* (e.g. `/users/{id}`), never an expanded URI — this is
 *   the same low-cardinality value surfaced to [com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver].
 *
 * Not a `data class`, matching the uniform public-type policy applied elsewhere in this runtime (see
 * [com.nabobery.sdkgen.runtime.ResponseAlternative]'s KDoc): [equals]/[hashCode]/[toString]/[copy] are hand-written.
 * [toString] is redaction-safe because it delegates to [request]'s own redaction-safe [toString].
 */
public class LogicalCallContext(
    public val request: SdkRequest,
    public val operationId: String,
    public val method: String,
    public val normalizedRoute: String,
) {
    public fun copy(
        request: SdkRequest = this.request,
        operationId: String = this.operationId,
        method: String = this.method,
        normalizedRoute: String = this.normalizedRoute,
    ): LogicalCallContext = LogicalCallContext(request, operationId, method, normalizedRoute)

    override fun equals(other: Any?): Boolean =
        other is LogicalCallContext &&
            request == other.request &&
            operationId == other.operationId &&
            method == other.method &&
            normalizedRoute == other.normalizedRoute

    override fun hashCode(): Int = arrayOf(request, operationId, method, normalizedRoute).contentHashCode()

    override fun toString(): String =
        "LogicalCallContext(request=$request, operationId=$operationId, method=$method, " +
            "normalizedRoute=$normalizedRoute)"
}

/**
 * The result of running the logical middleware chain (and the retry engine it wraps) for one call.
 *
 * [Failure] carries the exact [Throwable] that would otherwise have been thrown, so a middleware can inspect it and
 * decide to substitute a different outcome (the sanctioned short-circuit) without the executor needing an unchecked
 * cast to recover the original type — [T] is threaded through generically end-to-end instead.
 */
public sealed interface LogicalOutcome<out T> {
    public data class Success<T>(
        public val value: T,
    ) : LogicalOutcome<T>

    public data class Failure(
        public val error: Throwable,
    ) : LogicalOutcome<Nothing>
}

/**
 * Wraps one whole logical call — the retry engine and every physical attempt it makes — exactly once.
 *
 * `proceed` must be invoked **at most once**; a second invocation throws
 * [com.nabobery.sdkgen.runtime.SdkConfigurationException]. A middleware that never calls `proceed` short-circuits the
 * call entirely, skipping the retry engine and transport altogether.
 *
 * `intercept`'s type parameter `T` is the operation's decoded response type, instantiated fresh per call by
 * [com.nabobery.sdkgen.runtime.SdkExecutor.execute]. This makes `T` unknown to the middleware at the point it would
 * need to fabricate a value for it — a genuinely generic implementation has no way to conjure a `T` out of nothing
 * without an unchecked cast, so the *only* soundly constructible short-circuit outcome for unknown `T` is
 * [LogicalOutcome.Failure] (a real subtype of every `LogicalOutcome<T>`, via `LogicalOutcome<Nothing>`); there is no
 * type-safe way to fabricate a [LogicalOutcome.Success] here. After `proceed` returns, a middleware may freely
 * inspect and replace [LogicalOutcome.Success.value]/[LogicalOutcome.Failure.error] with another value of the *same*
 * concrete `T` it already observed (e.g. wrapping, redacting, or substituting a `Failure` for a `Success` it decides
 * to treat as an error) — that's a legitimate post-`proceed` transformation, not a pre-`proceed` fabrication.
 * [AttemptMiddleware] does not have this restriction, since [AttemptResult] is concrete over [SdkResponse] rather
 * than generic.
 */
public interface LogicalMiddleware {
    public suspend fun <T> intercept(
        call: LogicalCallContext,
        proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
    ): LogicalOutcome<T>
}

/**
 * A neutral, immutable view of one physical attempt, handed to [AttemptMiddleware.intercept].
 *
 * @property request the request prepared for this attempt (after body-replay for retried attempts), before
 *   SDK-identification header assignment, authentication, or signing.
 * @property operationId the operation this attempt belongs to.
 * @property attemptNumber 1-based; the first physical attempt of a logical call is `1`.
 * @property logicalCallId the id of the enclosing logical call, shared across every attempt of that call and with
 *   [com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver] events for the same call.
 *
 * Not a `data class`: the runtime's public context types use explicit hand-written [equals], [hashCode], [toString],
 * and [copy] methods so their ABI can evolve without locking in generated `componentN` members.
 * [toString] delegates to [request]'s redaction-safe representation.
 */
public class AttemptCallContext(
    public val request: SdkRequest,
    public val operationId: String,
    public val attemptNumber: Int,
    public val logicalCallId: String,
) {
    public fun copy(
        request: SdkRequest = this.request,
        operationId: String = this.operationId,
        attemptNumber: Int = this.attemptNumber,
        logicalCallId: String = this.logicalCallId,
    ): AttemptCallContext = AttemptCallContext(request, operationId, attemptNumber, logicalCallId)

    override fun equals(other: Any?): Boolean =
        other is AttemptCallContext &&
            request == other.request &&
            operationId == other.operationId &&
            attemptNumber == other.attemptNumber &&
            logicalCallId == other.logicalCallId

    override fun hashCode(): Int = arrayOf(request, operationId, attemptNumber, logicalCallId).contentHashCode()

    override fun toString(): String =
        "AttemptCallContext(request=$request, operationId=$operationId, attemptNumber=$attemptNumber, " +
            "logicalCallId=$logicalCallId)"
}

/**
 * The result of running the attempt middleware chain (and the authentication/transport exchange it wraps) for one
 * physical attempt. An alias of [LogicalOutcome] instantiated to [SdkResponse]: an attempt never decodes a response
 * body itself (decoding is a later, per-attempt pipeline stage outside this chain), so no generic type parameter is
 * needed here.
 */
public typealias AttemptResult = LogicalOutcome<SdkResponse>

/**
 * Wraps one physical attempt's authentication/signing and transport exchange exactly once.
 *
 * `proceed` must be invoked **at most once**; a second invocation throws
 * [com.nabobery.sdkgen.runtime.SdkConfigurationException]. A middleware that never calls `proceed` short-circuits the
 * attempt (e.g. to synthesize a canned [AttemptResult.Failure] for fault injection) without authentication or the
 * transport ever running.
 *
 * Runs *inside* the retry engine, once per physical attempt (including attempts the retry engine schedules after a
 * transient failure) — unlike [LogicalMiddleware], which wraps the whole retry engine exactly once regardless of how
 * many attempts occur inside it.
 */
public interface AttemptMiddleware {
    public suspend fun intercept(
        call: AttemptCallContext,
        proceed: suspend (AttemptCallContext) -> AttemptResult,
    ): AttemptResult
}
