package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.pagination.PageEnvelope
import com.nabobery.sdkgen.runtime.pagination.PageRequest

/**
 * Deterministic scripted page fetcher for pagination contract tests, mirroring [FakeTransport]'s scripted-step
 * shape for `suspend (PageRequest) -> PageEnvelope<T, I>` fetch functions.
 *
 * [fetch] enforces the "exactly one in-flight request" safety invariant a pagination engine must uphold: a
 * reentrant call while a previous call on the same instance has not yet returned fails the test immediately, rather
 * than silently allowing overlapping fetches to go unnoticed.
 *
 * Instances are mutable, are not thread-safe, and consume one queued step per call to [fetch].
 */
public class ScriptedPageFetcher<T, I> {
    private val script: MutableList<suspend () -> PageEnvelope<T, I>> = mutableListOf()
    private val recordedRequests: MutableList<PageRequest> = mutableListOf()
    private var inFlight: Boolean = false

    /** Every [PageRequest] passed to [fetch] so far, in call order. */
    public val requests: List<PageRequest>
        get() = recordedRequests.toList()

    /** Queues a successful page result for the next call to [fetch]. */
    public fun enqueueEnvelope(envelope: PageEnvelope<T, I>): ScriptedPageFetcher<T, I> =
        apply { script += { envelope } }

    /** Queues a failure — including a `CancellationException` — for the next call to [fetch]. */
    public fun enqueueFailure(failure: Throwable): ScriptedPageFetcher<T, I> = apply { script += { throw failure } }

    /**
     * Queues an arbitrary suspend step for the next call to [fetch] — an escape hatch beyond [enqueueEnvelope] and
     * [enqueueFailure] for scenarios those two can't express, such as a step that itself calls back into [fetch]
     * (exercising the reentrancy guard) or one that suspends on external synchronization.
     */
    public fun enqueueSuspending(block: suspend () -> PageEnvelope<T, I>): ScriptedPageFetcher<T, I> =
        apply {
            script +=
                block
        }

    /**
     * The fetch function to hand to a pagination engine's `firstPage`/`pages`/`items` view.
     *
     * @throws IllegalStateException if called while a previous invocation on this instance has not yet returned
     *   (reentrancy guard for the one-in-flight invariant), or if the script is exhausted.
     */
    public val fetch: suspend (PageRequest) -> PageEnvelope<T, I> = { request ->
        check(!inFlight) { "Reentrant page fetch detected: only one page fetch may be in flight at a time" }
        inFlight = true
        try {
            recordedRequests += request
            val step = script.removeFirstOrNull() ?: error("Scripted page fetcher script is exhausted")
            step()
        } finally {
            inFlight = false
        }
    }
}
