package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.middleware.AttemptMiddleware
import com.nabobery.sdkgen.runtime.middleware.LogicalMiddleware
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver
import com.nabobery.sdkgen.runtime.resilience.RetryBudget

/**
 * Immutable, client-scoped configuration for a generated SDK client: the layer between the SDK author's
 * `sdkgen.yaml` defaults and a caller's per-call [CallOptions].
 *
 * A generated root client accepts one instance and hands that exact object to every resource client it constructs,
 * so a single configuration — including the single [retryBudget] — governs the whole generated surface. It owns only
 * concerns that [SdkExecutor] or [CallOptions] already support; it is not a dependency-injection container and it
 * never creates transports or reads the environment.
 *
 * The full resolution order is
 * `contract-derived OperationMetadata -> sdkgen.yaml defaults -> SdkClientConfig -> CallOptions`, and each property
 * resolves under its own documented rule:
 *
 * - [retry]: [PolicyOverride.Inherit] defers to the operation's generated default, [PolicyOverride.Disabled] turns
 *   retries off, [PolicyOverride.Replace] replaces the descriptor. A non-[PolicyOverride.Inherit] per-call
 *   [CallOptions.retry] always wins over this value (see [resolveCallOptions]).
 * - [deadlines]: a non-null value replaces the operation's generated [SdkDeadlines] entirely; a non-null per-call
 *   [CallOptions.deadlines] replaces it in turn.
 * - [requestHook]: runs at [SdkExecutor]'s client-hook stage, before any per-call [CallOptions.requestHook].
 * - [logicalMiddleware] / [attemptMiddleware]: passed to the executor as its client-level chains, which nest
 *   *outside* the per-call chains supplied through [CallOptions].
 * - [observers]: notified of every lifecycle event once, in addition to per-call [CallOptions.observers].
 * - [retryBudget]: the exact instance every resource client's executor consumes.
 * - [productToken]: when non-null, replaces the generated fallback `User-Agent` product token; `null` means "use
 *   the generated fallback". Blank values and values containing CR or LF are rejected at construction so a
 *   configuration can never smuggle a header injection into the transport.
 *
 * Hooks, middleware, observers, the budget, and the product token are given to the executor exactly once at
 * construction; they are deliberately *not* folded into resolved [CallOptions], which would register them twice
 * and duplicate lifecycle notifications.
 *
 * Not a `data class`: the three lists are defensively copied at construction, as in [CallOptions].
 */
public class SdkClientConfig(
    public val retry: PolicyOverride<RetryDescriptor> = PolicyOverride.Inherit,
    public val deadlines: SdkDeadlines? = null,
    public val requestHook: SdkRequestHook? = null,
    logicalMiddleware: List<LogicalMiddleware> = emptyList(),
    attemptMiddleware: List<AttemptMiddleware> = emptyList(),
    observers: List<SdkLifecycleObserver> = emptyList(),
    public val retryBudget: RetryBudget = RetryBudget(),
    public val productToken: String? = null,
) {
    /** Defensive copy of the client-level logical middleware supplied at construction. */
    public val logicalMiddleware: List<LogicalMiddleware> = logicalMiddleware.toList()

    /** Defensive copy of the client-level attempt middleware supplied at construction. */
    public val attemptMiddleware: List<AttemptMiddleware> = attemptMiddleware.toList()

    /** Defensive copy of the client-level lifecycle observers supplied at construction. */
    public val observers: List<SdkLifecycleObserver> = observers.toList()

    init {
        if (productToken != null) {
            require(productToken.isNotBlank()) { "productToken must not be blank" }
            require('\r' !in productToken && '\n' !in productToken) {
                "productToken must not contain CR or LF characters"
            }
        }
    }

    /**
     * Folds this client's [retry] and [deadlines] decisions into [options] for one call, leaving every other
     * [CallOptions] field untouched. Per-call values keep final precedence: a non-[PolicyOverride.Inherit]
     * [CallOptions.retry] and a non-null [CallOptions.deadlines] are returned as given.
     *
     * Returns [options] itself — no allocation — when this configuration contributes neither a retry nor a
     * deadlines decision. Generated clients call this on every executor path, so the result is what
     * [SdkExecutor] resolves against the operation's generated metadata.
     */
    public fun resolveCallOptions(options: CallOptions): CallOptions =
        if (deadlines == null && retry == PolicyOverride.Inherit) {
            options
        } else {
            options.copy(
                deadlines = options.deadlines ?: deadlines,
                retry = if (options.retry == PolicyOverride.Inherit) retry else options.retry,
            )
        }

    override fun toString(): String =
        "SdkClientConfig(retry=$retry, deadlines=$deadlines, requestHook=$requestHook, " +
            "logicalMiddleware=$logicalMiddleware, attemptMiddleware=$attemptMiddleware, observers=$observers, " +
            "retryBudget=$retryBudget, productToken=$productToken)"
}
