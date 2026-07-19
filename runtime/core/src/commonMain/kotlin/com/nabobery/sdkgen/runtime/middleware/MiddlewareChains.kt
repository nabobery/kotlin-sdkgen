package com.nabobery.sdkgen.runtime.middleware

import com.nabobery.sdkgen.runtime.SdkConfigurationException
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponse
import kotlin.coroutines.cancellation.CancellationException

/**
 * Runs [middlewares] around [terminal] as one chain, in order, enforcing that each middleware invokes its `proceed`
 * callback at most once and that any request replacement it performs stays within the sanctioned bounds (see
 * [validateRequestReplacement]).
 *
 * A [CancellationException] escaping [terminal] is rethrown by identity and never converted into
 * [LogicalOutcome.Failure] — see [LogicalMiddleware] and the executor's cancellation-identity invariant. Any other
 * [Throwable] escaping [terminal] is captured as [LogicalOutcome.Failure] so an outer middleware can observe and,
 * if it chooses, replace it.
 */
internal suspend fun <T> runLogicalChain(
    middlewares: List<LogicalMiddleware>,
    initial: LogicalCallContext,
    terminal: suspend (LogicalCallContext) -> T,
): T {
    suspend fun runFrom(
        index: Int,
        context: LogicalCallContext,
    ): LogicalOutcome<T> {
        if (index >= middlewares.size) {
            return try {
                LogicalOutcome.Success(terminal(context))
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (failure: Throwable) {
                LogicalOutcome.Failure(failure)
            }
        }
        val middleware = middlewares[index]
        var proceeded = false
        return middleware.intercept(context) { nextContext ->
            if (proceeded) {
                throw SdkConfigurationException(
                    "Logical middleware invoked proceed() more than once for operation '${context.operationId}'.",
                    context.operationId,
                )
            }
            proceeded = true
            validateRequestReplacement(context.request, nextContext.request, context.operationId)
            runFrom(index + 1, nextContext)
        }
    }
    return when (val outcome = runFrom(0, initial)) {
        is LogicalOutcome.Success -> outcome.value
        is LogicalOutcome.Failure -> throw outcome.error
    }
}

/**
 * Runs [middlewares] around [terminal] as one chain for a single physical attempt. Semantics mirror
 * [runLogicalChain] (besides the fixed `T = SdkResponse` result type via [AttemptResult]), with one addition: this
 * chain polices every closable [SdkResponse] any frame produces or fabricates, at every depth.
 *
 * Each middleware frame owns exactly one "beneath" outcome — whatever its own `proceed` call returned (which,
 * recursively, is already fully accounted for by every frame beneath it, including the terminal). After the frame's
 * own `intercept` call settles — normally or by throwing — this function compares the beneath outcome's response
 * *body* (by reference, not the enclosing [SdkResponse] wrapper: a middleware that returns
 * `Success(response.copy(headers = ...))` keeps the same body and must not be treated as abandoning it) against
 * what the frame itself produced. A different body (or no body at all, for a thrown exception or a substituted
 * [LogicalOutcome.Failure]) means the beneath response was abandoned, so its body is closed here — with the frame's
 * substituted failure, or the exception that escaped the frame, as the close cause, or no cause when a different
 * success value was substituted. Because every frame performs this check for its own immediate `proceed` result,
 * this composes recursively to any depth of fabrication or substitution: an inner middleware fabricating a response
 * that an outer middleware then discards is caught at the outer frame, exactly as a directly-discarded terminal
 * response is caught at the frame that discarded it. Without this, an abandoned body — at any depth — would never
 * be closed: the caller only ever sees (and therefore only ever closes) the response this function ultimately
 * returns.
 *
 * [onRequestObserved] is invoked once at the entry of *every* frame reached — every middleware frame and, if
 * reached, the terminal frame — with "deepest wins" semantics: frames are entered strictly in order, and each
 * invocation simply overwrites the caller's record of "the request as most recently observed", so the last
 * invocation before the chain settles is always the request as seen at the deepest point actually reached, whether
 * that is the terminal or some middleware that short-circuited before ever reaching it. This lets a retry engine
 * layered above this chain see an outer middleware's request mutation (e.g. stripping or adding an idempotency key)
 * even when an inner middleware short-circuits before the terminal ever runs.
 */
internal suspend fun runAttemptChain(
    middlewares: List<AttemptMiddleware>,
    initial: AttemptCallContext,
    onRequestObserved: (SdkRequest) -> Unit = {},
    terminal: suspend (AttemptCallContext) -> SdkResponse,
): AttemptResult {
    suspend fun runFrom(
        index: Int,
        context: AttemptCallContext,
    ): AttemptResult {
        onRequestObserved(context.request)
        if (index >= middlewares.size) {
            return try {
                LogicalOutcome.Success(terminal(context))
            } catch (cancellation: CancellationException) {
                throw cancellation
            } catch (failure: Throwable) {
                LogicalOutcome.Failure(failure)
            }
        }
        val middleware = middlewares[index]
        var proceeded = false
        var beneathOutcome: AttemptResult? = null
        val frameOutcome =
            try {
                middleware.intercept(context) { nextContext ->
                    if (proceeded) {
                        throw SdkConfigurationException(
                            "Attempt middleware invoked proceed() more than once for operation " +
                                "'${context.operationId}' attempt ${context.attemptNumber}.",
                            context.operationId,
                        )
                    }
                    proceeded = true
                    validateRequestReplacement(context.request, nextContext.request, context.operationId)
                    runFrom(index + 1, nextContext).also { beneathOutcome = it }
                }
            } catch (cancellation: CancellationException) {
                closeAbandonedBody(beneathOutcome, null, cancellation)
                throw cancellation
            } catch (failure: Throwable) {
                closeAbandonedBody(beneathOutcome, null, failure)
                throw failure
            }
        closeAbandonedBody(beneathOutcome, frameOutcome, null)
        return frameOutcome
    }
    return runFrom(0, initial)
}

/**
 * Closes [beneath]'s response body when this frame abandoned it — i.e. [beneath] is a [LogicalOutcome.Success]
 * whose response body is not the same object as [frameOutcome]'s response body (or [frameOutcome] is a
 * [LogicalOutcome.Failure]/`null`, meaning no body survived at all). Comparison is by [SdkResponse.body] identity,
 * not [SdkResponse] identity, so a middleware that returns a *copy* of the response it received (e.g. to add a
 * header) — sharing the same body — is correctly recognized as not abandoning anything.
 *
 * The close cause is [frameOutcome]'s [LogicalOutcome.Failure.error] when present, else [thrown] (an exception that
 * escaped the frame's `intercept` call entirely), else `null` (a different success value was substituted). A
 * failure while closing an already-abandoned body is contained — it must never mask the real failure already
 * propagating, or block the frame from returning/rethrowing normally.
 */
private fun closeAbandonedBody(
    beneath: AttemptResult?,
    frameOutcome: AttemptResult?,
    thrown: Throwable?,
) {
    val beneathBody = (beneath as? LogicalOutcome.Success)?.value?.body ?: return
    val frameBody = (frameOutcome as? LogicalOutcome.Success)?.value?.body
    if (beneathBody === frameBody) return
    val cause = (frameOutcome as? LogicalOutcome.Failure)?.error ?: thrown
    try {
        beneathBody.close(cause)
    } catch (_: Throwable) {
        // Contained: see KDoc above.
    }
}

/**
 * The concrete shape of an [SdkRequestBody], used to police sanctioned request replacement. [SdkRequestBody.Bytes]
 * and [SdkRequestBody.ReplayFactory] are both "replayable" in the informal sense, but they are *not* interchangeable
 * here: a [SdkRequestBody.ReplayFactory] is re-invoked once per attempt (its `create` callback may do real work —
 * open a file, re-serialize, etc.), while [SdkRequestBody.Bytes] is a fixed in-memory buffer replayed verbatim. A
 * middleware silently turning one into the other would change *when* and *how often* body-producing work runs
 * without that being an explicit, reviewed decision, so this type keeps the three concrete classes distinct rather
 * than collapsing [SdkRequestBody.Bytes]/[SdkRequestBody.ReplayFactory] into one "replayable" bucket.
 */
private enum class ReplayabilityClass {
    NONE,
    BYTES,
    REPLAY_FACTORY,
    ONE_SHOT,
}

private fun replayabilityClassOf(body: SdkRequestBody?): ReplayabilityClass =
    when (body) {
        null -> ReplayabilityClass.NONE
        is SdkRequestBody.Bytes -> ReplayabilityClass.BYTES
        is SdkRequestBody.ReplayFactory -> ReplayabilityClass.REPLAY_FACTORY
        is SdkRequestBody.OneShot -> ReplayabilityClass.ONE_SHOT
    }

/**
 * Validates that a middleware's replacement request preserves the sanctioned invariants relative to [original]:
 * the request body's concrete class ([ReplayabilityClass] — none / [SdkRequestBody.Bytes] /
 * [SdkRequestBody.ReplayFactory] / [SdkRequestBody.OneShot], never cross-substituted), [SdkRequestBody.ownership],
 * and [SdkRequestBody.contentLength] must all stay the same. A middleware may still replace the body's *content*
 * (e.g. to redact or transform it) as long as it keeps the same concrete class.
 *
 * @throws SdkConfigurationException when [replacement] violates one of those invariants.
 */
internal fun validateRequestReplacement(
    original: SdkRequest,
    replacement: SdkRequest,
    operationId: String,
) {
    if (original.body === replacement.body) return
    val originalClass = replayabilityClassOf(original.body)
    val replacementClass = replayabilityClassOf(replacement.body)
    if (originalClass != replacementClass) {
        throw SdkConfigurationException(
            "Middleware replaced the request body with an incompatible replayability class " +
                "(was $originalClass, now $replacementClass) for operation '$operationId'.",
            operationId,
        )
    }
    val originalBody = original.body
    val replacementBody = replacement.body
    if (originalBody != null && replacementBody != null) {
        if (originalBody.ownership != replacementBody.ownership) {
            throw SdkConfigurationException(
                "Middleware changed request body ownership for operation '$operationId'.",
                operationId,
            )
        }
        if (originalBody.contentLength != replacementBody.contentLength) {
            throw SdkConfigurationException(
                "Middleware changed request body content length for operation '$operationId'.",
                operationId,
            )
        }
    }
}
