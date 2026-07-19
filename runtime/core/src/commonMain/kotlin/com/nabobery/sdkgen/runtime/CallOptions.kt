@file:kotlin.jvm.JvmName("ExecutorKt")

package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.bodies.TransferObserver
import com.nabobery.sdkgen.runtime.middleware.AttemptMiddleware
import com.nabobery.sdkgen.runtime.middleware.LogicalMiddleware
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver

public fun interface SdkRequestHook {
    public suspend fun apply(request: SdkRequest): SdkRequest
}

/**
 * A per-call decision about [CallOptions.retry], the one policy currently layered this way under [CallOptions]:
 * leave it as configured further up the resolution chain, turn it off for this call, or replace it outright.
 *
 * The absence of an explicit choice always means [Inherit] — there is no separate nullable/tri-state boolean flag
 * to keep in sync with a value; a caller who wants to say "use the operation/client default" simply omits the
 * override. This is not a general-purpose resolution model for arbitrary [CallOptions] fields (e.g. deadlines or
 * pagination bounds resolve by simple non-null-wins-over-default, not through this tri-state) — it is generic over
 * `T` only because [RetryDescriptor] is the value it wraps, not because other policies are expected to adopt it.
 */
public sealed interface PolicyOverride<out T> {
    /** Defer to whatever the next-outer layer in the resolution chain decided (the default). */
    public data object Inherit : PolicyOverride<Nothing>

    /** Explicitly turn the policy off for this call, regardless of outer configuration. */
    public data object Disabled : PolicyOverride<Nothing>

    /** Replace the policy with [value] for this call. */
    public data class Replace<T>(
        public val value: T,
    ) : PolicyOverride<T>
}

/** Optional limits applied while walking a paginated operation. */
public data class PaginationBounds(
    public val maxPages: Int? = null,
    public val maxItems: Long? = null,
    public val maxElapsedMillis: Long? = null,
)

/**
 * Per-call overrides layered on top of the operation's already-resolved defaults. Each property follows its own
 * resolution contract: [retry] is the only field using [PolicyOverride]'s retry-specific tri-state, while nullable
 * fields such as [deadlines] and [pagination] use their documented non-null override semantics.
 *
 * @property headers additional headers merged onto the request; per-call headers do not remove headers set by
 *   earlier layers.
 * @property deadlines when non-null, replaces the operation's [SdkDeadlines] entirely for this call.
 * @property retry per-call retry policy override; see [PolicyOverride].
 * @property requestHook an additional hook run after authentication and any client- or operation-level hooks.
 * @property logicalMiddleware per-call [LogicalMiddleware] appended after any client-level (constructor-supplied)
 *   logical middleware — the per-call chain is nested innermost, closest to the retry engine it wraps.
 * @property attemptMiddleware per-call [AttemptMiddleware] appended after any client-level (constructor-supplied)
 *   attempt middleware, with the same innermost nesting as [logicalMiddleware].
 * @property observers per-call [SdkLifecycleObserver]s notified in addition to any client-level
 *   (constructor-supplied) observers; see [SdkExecutor] for how the two lists are combined.
 * @property pagination optional limits for generated paginated-operation flows.
 *
 * Not a `data class`: [headers] is defensively copied at construction, which a data-class primary constructor
 * cannot do (see [ResponseAlternative]'s KDoc for why). [equals]/[hashCode]/[toString]/[copy] are hand-written over
 * that copy.
 */
public class CallOptions(
    headers: List<SdkHeader> = emptyList(),
    public val deadlines: SdkDeadlines? = null,
    public val retry: PolicyOverride<RetryDescriptor> = PolicyOverride.Inherit,
    public val requestHook: SdkRequestHook? = null,
    public val transferObserver: TransferObserver? = null,
    logicalMiddleware: List<LogicalMiddleware> = emptyList(),
    attemptMiddleware: List<AttemptMiddleware> = emptyList(),
    observers: List<SdkLifecycleObserver> = emptyList(),
    public val pagination: PaginationBounds? = null,
) {
    /** Defensive copy of the headers supplied at construction; later mutation of the input has no effect. */
    public val headers: List<SdkHeader> = headers.toList()

    /** Defensive copy of the logical middleware supplied at construction. */
    public val logicalMiddleware: List<LogicalMiddleware> = logicalMiddleware.toList()

    /** Defensive copy of the attempt middleware supplied at construction. */
    public val attemptMiddleware: List<AttemptMiddleware> = attemptMiddleware.toList()

    /** Defensive copy of the observers supplied at construction. */
    public val observers: List<SdkLifecycleObserver> = observers.toList()

    public fun copy(
        headers: List<SdkHeader> = this.headers,
        deadlines: SdkDeadlines? = this.deadlines,
        retry: PolicyOverride<RetryDescriptor> = this.retry,
        requestHook: SdkRequestHook? = this.requestHook,
        transferObserver: TransferObserver? = this.transferObserver,
        logicalMiddleware: List<LogicalMiddleware> = this.logicalMiddleware,
        attemptMiddleware: List<AttemptMiddleware> = this.attemptMiddleware,
        observers: List<SdkLifecycleObserver> = this.observers,
        pagination: PaginationBounds? = this.pagination,
    ): CallOptions =
        CallOptions(
            headers,
            deadlines,
            retry,
            requestHook,
            transferObserver,
            logicalMiddleware,
            attemptMiddleware,
            observers,
            pagination,
        )

    override fun equals(other: Any?): Boolean =
        other is CallOptions &&
            headers == other.headers &&
            deadlines == other.deadlines &&
            retry == other.retry &&
            requestHook == other.requestHook &&
            transferObserver == other.transferObserver &&
            logicalMiddleware == other.logicalMiddleware &&
            attemptMiddleware == other.attemptMiddleware &&
            observers == other.observers &&
            pagination == other.pagination

    override fun hashCode(): Int =
        arrayOf<Any?>(
            headers,
            deadlines,
            retry,
            requestHook,
            transferObserver,
            logicalMiddleware,
            attemptMiddleware,
            observers,
            pagination,
        ).contentHashCode()

    override fun toString(): String =
        "CallOptions(headers=$headers, deadlines=$deadlines, retry=$retry, requestHook=$requestHook, " +
            "transferObserver=$transferObserver, logicalMiddleware=$logicalMiddleware, " +
            "attemptMiddleware=$attemptMiddleware, observers=$observers, pagination=$pagination)"
}

/** Mutable builder backing the [callOptions] DSL. */
public class CallOptionsBuilder internal constructor() {
    private val headers = mutableListOf<SdkHeader>()
    private var deadlines: SdkDeadlines? = null
    private var retry: PolicyOverride<RetryDescriptor> = PolicyOverride.Inherit
    private var requestHook: SdkRequestHook? = null
    private var transferObserver: TransferObserver? = null
    private val logicalMiddleware = mutableListOf<LogicalMiddleware>()
    private val attemptMiddleware = mutableListOf<AttemptMiddleware>()
    private val observers = mutableListOf<SdkLifecycleObserver>()
    private var pagination: PaginationBounds? = null

    /** Appends one header to the call's header list. */
    public fun header(
        name: String,
        value: String,
    ) {
        headers += SdkHeader(name, value)
    }

    /** Replaces the call's deadlines entirely. */
    public fun deadlines(deadlines: SdkDeadlines) {
        this.deadlines = deadlines
    }

    /** Sets the per-call retry policy override. */
    public fun retry(override: PolicyOverride<RetryDescriptor>) {
        this.retry = override
    }

    /** Sets the per-call request hook. */
    public fun requestHook(hook: SdkRequestHook) {
        this.requestHook = hook
    }

    /** Observes attempt-local upload and download progress for this call. */
    public fun transferObserver(observer: TransferObserver) {
        this.transferObserver = observer
    }

    /** Appends one per-call logical middleware. */
    public fun logicalMiddleware(middleware: LogicalMiddleware) {
        logicalMiddleware += middleware
    }

    /** Appends one per-call attempt middleware. */
    public fun attemptMiddleware(middleware: AttemptMiddleware) {
        attemptMiddleware += middleware
    }

    /** Appends one per-call lifecycle observer. */
    public fun observer(observer: SdkLifecycleObserver) {
        observers += observer
    }

    /** Sets the limits applied while walking a paginated operation. */
    public fun pagination(bounds: PaginationBounds) {
        pagination = bounds
    }

    internal fun build(): CallOptions =
        CallOptions(
            headers.toList(),
            deadlines,
            retry,
            requestHook,
            transferObserver,
            logicalMiddleware.toList(),
            attemptMiddleware.toList(),
            observers.toList(),
            pagination,
        )
}

/** Builds a [CallOptions] using the [CallOptionsBuilder] DSL. */
public fun callOptions(block: CallOptionsBuilder.() -> Unit): CallOptions = CallOptionsBuilder().apply(block).build()

/**
 * Resolves the effective retry descriptor for one call by applying [callOverride] on top of [resolvedDefault], the
 * final [PolicyOverride.Inherit] step of the resolution order documented on [CallOptions].
 *
 * [resolvedDefault] is the already-resolved value of all lower layers (contract facts → SDK-author defaults →
 * client config → operation defaults); this function performs only the last step, per-call override on top of that
 * value. Full lower-layer resolution — folding contract facts, SDK-author defaults, and client configuration down
 * to one operation-level default — is performed by the generated client and client configuration, which arrive in
 * later Phase 2 tasks (W4 generator work, W2-T5 client configuration); this function does not (and cannot, since it
 * has no access to those layers) perform that folding itself.
 *
 * [PolicyOverride.Inherit] defers entirely to [resolvedDefault]; [PolicyOverride.Disabled] turns retries off for
 * this call, returning `null` regardless of [resolvedDefault]; [PolicyOverride.Replace] replaces [resolvedDefault]
 * outright with its value.
 *
 * This decides *which* [RetryDescriptor] governs a call; the retry loop itself is implemented by [SdkExecutor], which
 * consumes the resolved descriptor in its [SdkExecutor.PIPELINE_ORDER]'s `RETRY_ENGINE` stage.
 */
public fun resolveRetry(
    resolvedDefault: RetryDescriptor?,
    callOverride: PolicyOverride<RetryDescriptor>,
): RetryDescriptor? =
    when (callOverride) {
        PolicyOverride.Inherit -> resolvedDefault
        PolicyOverride.Disabled -> null
        is PolicyOverride.Replace -> callOverride.value
    }

/**
 * Resolves the effective deadlines for one call by applying [callDeadlines] on top of [resolvedDefault], the final
 * step of the resolution order documented on [CallOptions].
 *
 * [resolvedDefault] is the already-resolved value of all lower layers (contract facts → SDK-author defaults →
 * client config → operation defaults); this function performs only the last step, per-call override on top of that
 * value. Full lower-layer resolution is performed by the generated client and client configuration, which arrive in
 * later Phase 2 tasks (W4 generator work, W2-T5 client configuration).
 *
 * A non-null [callDeadlines] (from [CallOptions.deadlines]) replaces [resolvedDefault] entirely; `null` defers to
 * [resolvedDefault].
 */
public fun resolveDeadlines(
    resolvedDefault: SdkDeadlines,
    callDeadlines: SdkDeadlines?,
): SdkDeadlines = callDeadlines ?: resolvedDefault
