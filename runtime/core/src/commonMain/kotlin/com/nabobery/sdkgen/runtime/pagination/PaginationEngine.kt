package com.nabobery.sdkgen.runtime.pagination

import com.nabobery.sdkgen.runtime.PaginationBounds
import com.nabobery.sdkgen.runtime.PaginationDescriptor
import com.nabobery.sdkgen.runtime.SdkPaginationException
import com.nabobery.sdkgen.runtime.SdkTimeoutException
import com.nabobery.sdkgen.runtime.TimeoutPhase
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.resilience.SdkClock
import com.nabobery.sdkgen.runtime.resilience.SystemSdkClock
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

/**
 * What the transition logic decided after inspecting one [PageEnvelope]: either fetch another page with the given
 * [PageRequest.Continue], or stop.
 */
internal sealed interface PageOutcome {
    data class Continue(
        val next: PageRequest,
    ) : PageOutcome

    data object Terminate : PageOutcome
}

/**
 * Per-strategy state the transition logic threads from one page to the next. Only the fields relevant to the active
 * [PaginationDescriptor] subtype are ever read; the others stay at their construction defaults.
 *
 * @property offset the next zero-based offset to request, for [PaginationDescriptor.OffsetLimit].
 * @property page the next one-based page number to request, for [PaginationDescriptor.PageSize].
 * @property expectedPageSize the item count observed on the first non-empty page, used to recognize a short
 *   (final) page for [PaginationDescriptor.OffsetLimit] and [PaginationDescriptor.PageSize] without the descriptor
 *   needing to carry the requested limit/size *value* (it only carries the request parameter *name*).
 * @property seenContinuations every cursor/token/resolved-URL value already used to fetch a page, for loop
 *   detection on [PaginationDescriptor.CursorToken], [PaginationDescriptor.NextToken], and
 *   [PaginationDescriptor.NextUrl].
 */
internal data class TransitionState(
    val offset: Long = 0,
    val page: Int = 1,
    val expectedPageSize: Int? = null,
    val seenContinuations: Set<String> = emptySet(),
)

/**
 * The one transition model shared by all five [PaginationDescriptor] strategies (spec §7.6, §11.4): given the
 * strategy, the just-fetched [envelope], and the state threaded from prior pages, decides whether to continue and,
 * if so, what to request next.
 *
 * `internal` rather than `private`, matching [com.nabobery.sdkgen.runtime.SdkExecutor.matchAlternative]'s precedent
 * in this codebase: the precedence and loop-detection rules here are not all independently observable through the
 * public `pages()`/`items()` Flow surface alone (e.g. a contrived non-advancing offset can only occur from a
 * hand-crafted [TransitionState], never from this engine's own arithmetic), so tests call this directly.
 *
 * @param resolveUrl resolves and trust-checks a raw `NextUrl`/`HeaderNextUrl` response value; only invoked for
 *   [PaginationDescriptor.NextUrl] and [PaginationDescriptor.HeaderNextUrl]. Threaded in rather than called directly
 *   so this function stays a pure decision over its arguments, independently testable without a real
 *   [TrustedHosts] configuration.
 * @throws SdkPaginationException when the same continuation value would be reused (loop detection), or when a
 *   computed offset/page fails to advance past its previous value.
 */
internal fun computeTransition(
    descriptor: PaginationDescriptor,
    envelope: PageEnvelope<*, *>,
    state: TransitionState,
    operationId: String?,
    resolveUrl: (String) -> String,
): Pair<PageOutcome, TransitionState> =
    when (descriptor) {
        is PaginationDescriptor.CursorToken -> {
            continuationTransition(envelope.nextCursor, state, operationId, PageRequest::NextCursor)
        }

        is PaginationDescriptor.NextToken -> {
            continuationTransition(envelope.nextToken, state, operationId, PageRequest::NextToken)
        }

        is PaginationDescriptor.NextUrl -> {
            val raw = envelope.nextUrl
            if (raw.isNullOrBlank()) {
                PageOutcome.Terminate to state
            } else {
                continuationTransition(resolveUrl(raw), state, operationId, PageRequest::NextUrl)
            }
        }

        is PaginationDescriptor.HeaderNextUrl -> {
            val raw = firstNextLinkTarget(envelope.linkHeaderValues())
            if (raw.isNullOrBlank()) {
                PageOutcome.Terminate to state
            } else {
                continuationTransition(resolveUrl(raw), state, operationId, PageRequest::NextUrl)
            }
        }

        is PaginationDescriptor.OffsetLimit -> {
            offsetTransition(envelope, state, operationId)
        }

        is PaginationDescriptor.PageSize -> {
            pageNumberTransition(envelope, state, operationId)
        }
    }

/** Every `Link` response header's raw value (RFC 8288 §3 allows repeated `Link` headers), name-matched case-insensitively. */
private fun PageEnvelope<*, *>.linkHeaderValues(): List<String> =
    responseHeaders.filter { header -> header.name.equals("Link", ignoreCase = true) }.map { it.value }

/**
 * Shared arithmetic for the three continuation-value strategies (cursor, token, next-URL): stop when the value is
 * absent, otherwise continue with it unless it has already been used, in which case that is a loop.
 */
private fun continuationTransition(
    value: String?,
    state: TransitionState,
    operationId: String?,
    toRequest: (String) -> PageRequest,
): Pair<PageOutcome, TransitionState> {
    if (value.isNullOrBlank()) return PageOutcome.Terminate to state
    if (value in state.seenContinuations) {
        throw SdkPaginationException(
            "Pagination loop detected: continuation value was returned more than once.",
            operationId,
        )
    }
    return PageOutcome.Continue(toRequest(value)) to state.copy(seenContinuations = state.seenContinuations + value)
}

private fun offsetTransition(
    envelope: PageEnvelope<*, *>,
    state: TransitionState,
    operationId: String?,
): Pair<PageOutcome, TransitionState> {
    val itemCount = envelope.items.size
    if (itemCount == 0) return PageOutcome.Terminate to state

    val newOffset = state.offset + itemCount
    if (newOffset <= state.offset) {
        throw SdkPaginationException("Pagination loop detected: offset failed to advance past $newOffset.", operationId)
    }
    val expectedPageSize = state.expectedPageSize ?: itemCount
    val nextState = state.copy(offset = newOffset, expectedPageSize = expectedPageSize)

    val shortPage = itemCount < expectedPageSize
    val totalReached = envelope.totalCount?.let { newOffset >= it } == true
    return if (shortPage || totalReached) {
        PageOutcome.Terminate to nextState
    } else {
        PageOutcome.Continue(PageRequest.NextOffset(newOffset)) to nextState
    }
}

private fun pageNumberTransition(
    envelope: PageEnvelope<*, *>,
    state: TransitionState,
    operationId: String?,
): Pair<PageOutcome, TransitionState> {
    val itemCount = envelope.items.size
    if (itemCount == 0) return PageOutcome.Terminate to state

    val newPage = state.page + 1
    if (newPage <= state.page) {
        throw SdkPaginationException(
            "Pagination loop detected: page number failed to advance past $newPage.",
            operationId,
        )
    }
    val expectedPageSize = state.expectedPageSize ?: itemCount
    val nextState = state.copy(page = newPage, expectedPageSize = expectedPageSize)

    val shortPage = itemCount < expectedPageSize
    val totalReached = envelope.totalPages?.let { state.page >= it } == true
    return if (shortPage || totalReached) {
        PageOutcome.Terminate to nextState
    } else {
        PageOutcome.Continue(PageRequest.NextPage(newPage)) to nextState
    }
}

/**
 * The three views (spec §7.6, §11.4, FR-END-013/014) SDK-generated pagination methods are built from, all sharing
 * [computeTransition] as their single source of transition truth.
 *
 * This engine composes strictly *above* [com.nabobery.sdkgen.runtime.SdkExecutor]: it never calls a transport or an
 * executor itself. Each page fetch is a caller-supplied `suspend (PageRequest) -> PageEnvelope<T, I>` — generated
 * code binds that closure to `executor.execute(...)`, translating each [PageRequest] into the right request
 * mutation. Because every fetch is therefore a full, independent `executor.execute()` call, authentication is
 * re-resolved and retried exactly as any other call: this engine does nothing special for "fresh auth per page" —
 * it falls out of composing above the executor rather than around it, and retries of one page's transport failure
 * never re-fetch an earlier, already-successful page.
 *
 * Safety invariants (see the task's HARD BOUNDARY and spec §11.4): every fetch happens strictly sequentially with at
 * most one in flight (each `emit()`/state update happens between one fetch's completion and the next one's start,
 * never concurrently); there is no prefetch — the next page is requested only once a collector has asked to advance
 * past the previous one (`pages()`/`items()` are `flow { }` builders, which suspend at each `emit()` until the
 * collector is ready); a page-fetch failure — including `CancellationException`, which this engine never catches —
 * propagates to the collector unchanged, and no further fetch happens afterward, since an uncaught exception ends
 * the `flow { }` body.
 *
 * @property descriptor the operation's declared pagination strategy.
 * @property baseUri the operation's own base URI, used only by [PaginationDescriptor.NextUrl] to resolve a relative
 *   next-URL response value (see [resolveNextUrl]). Required (and [trustedHosts] required) only when [descriptor]
 *   is [PaginationDescriptor.NextUrl]; ignored otherwise.
 * @property trustedHosts the origin allowlist next-URLs are checked against, reusing
 *   [com.nabobery.sdkgen.runtime.auth.TrustedHosts] rather than duplicating trust logic (see [requireTrustedNextUrl]).
 * @property operationId included on thrown [SdkPaginationException]/[SdkTimeoutException] instances for diagnostics.
 * @property requestedPageSize the limit/size value the *first* request actually used, for
 *   [PaginationDescriptor.OffsetLimit] and [PaginationDescriptor.PageSize]. The descriptor itself only carries the
 *   request parameter *name* (see [PaginationDescriptor.OffsetLimit.requestLimitParam] /
 *   [PaginationDescriptor.PageSize.requestSizeParam]), never the value generated code actually put on the wire, so
 *   this engine cannot otherwise know it. Supplying it here means a short *first* page (fewer items than
 *   [requestedPageSize]) is already recognized as the final page instead of only becoming recognizable once a second,
 *   full-size page has established a baseline (`null` falls back to that first-observed-count baseline, matching
 *   this engine's behavior before this parameter existed). Ignored by every other strategy.
 * @property initialOffset the zero-based offset the first request actually used, for
 *   [PaginationDescriptor.OffsetLimit]; transitions advance from this value rather than assuming the first request
 *   started at `0`. Ignored by every other strategy.
 * @property initialPage the one-based page number the first request actually used, for
 *   [PaginationDescriptor.PageSize]; transitions advance from this value rather than assuming the first request was
 *   page `1`. Ignored by every other strategy.
 */
public class PaginationEngine<T, I>(
    private val descriptor: PaginationDescriptor,
    private val baseUri: String? = null,
    private val trustedHosts: TrustedHosts? = null,
    private val operationId: String? = null,
    private val requestedPageSize: Int? = null,
    private val initialOffset: Long = 0,
    private val initialPage: Int = 1,
) {
    init {
        if (descriptor is PaginationDescriptor.NextUrl) {
            requireNotNull(baseUri) { "baseUri is required for a NextUrl pagination descriptor" }
            requireNotNull(trustedHosts) { "trustedHosts is required for a NextUrl pagination descriptor" }
        }
        if (descriptor is PaginationDescriptor.HeaderNextUrl) {
            requireNotNull(trustedHosts) { "trustedHosts is required for a HeaderNextUrl pagination descriptor" }
        }
        require(requestedPageSize == null || requestedPageSize > 0) { "requestedPageSize must be positive" }
        require(initialOffset >= 0) { "initialOffset must not be negative" }
        require(initialPage >= 1) { "initialPage must be at least 1" }
    }

    /** The [TransitionState] the first request's [initialOffset]/[initialPage]/[requestedPageSize] seed. */
    private fun initialTransitionState(): TransitionState =
        TransitionState(offset = initialOffset, page = initialPage, expectedPageSize = requestedPageSize)

    /**
     * Fetches only the first page. Never touches loop detection or budgets — a lightweight single-call view for
     * callers who only ever want page one (e.g. "give me the first 20 results"), including callers whose generated
     * `PageEnvelope` never populates an item-accessor (`items` stays empty): this view does not require one, unlike
     * [items].
     *
     * Deliberately does **not** resolve or trust-check a [PaginationDescriptor.NextUrl] continuation: resolving a
     * next-URL this view will never fetch would mean rejecting (or otherwise reacting to) a next page the caller
     * never asked to continue to, purely because it happens to be untrusted — a page whose *data* is perfectly valid
     * would fail to return at all. [Page.hasNext] is instead derived from the envelope's raw fields (a non-blank
     * cursor/token/URL, or short-page/total arithmetic for offset/page strategies using [requestedPageSize] /
     * [initialOffset] / [initialPage] when they make that arithmetic determinable); [Page.continuationUrl] surfaces
     * the *raw*, unresolved next-URL value for [PaginationDescriptor.NextUrl] (still safe, already-server-issued
     * metadata) rather than the resolved-and-trusted URL [pages] produces. A caller that goes on to call [pages] or
     * [items] to actually continue still goes through full resolution, trust-checking, and loop detection there.
     *
     * [PaginationDescriptor.HeaderNextUrl] is the one exception to the paragraph above: because its raw `Link`
     * header target is untrusted transport-layer input (not a body-declared value the caller could otherwise
     * inspect), and resolving/trust-checking it here requires no extra fetch, [Page.continuationUrl] for that
     * strategy is already the resolved, trusted URL — and an untrusted target throws [SdkPaginationException] from
     * this method itself. See [toFirstPage]'s KDoc for the full rationale.
     *
     * @throws SdkPaginationException when [descriptor] is [PaginationDescriptor.HeaderNextUrl] and the first page's
     *   `Link` header names a next-page target outside [trustedHosts].
     */
    public suspend fun firstPage(fetch: suspend (PageRequest) -> PageEnvelope<T, I>): Page<T, I> =
        fetch(PageRequest.First).toFirstPage()

    /**
     * A cold [Flow] of every page, fetched sequentially and on demand (see the class-level safety invariants).
     * Re-collecting always restarts from page one with fresh transition state — no state is shared across
     * collections, since this is a plain `flow { }` builder with all mutable state local to its body.
     *
     * @param maxPages when non-null, stops (without error) after emitting this many pages, without fetching beyond
     *   the last one emitted.
     * @param maxItems when non-null, stops (without error) once the cumulative item count across emitted pages
     *   would meet or exceed this bound — the page that crosses the bound is still emitted in full (this is a
     *   page-granular, not item-granular, bound; see [items] for a truncated item-level bound).
     * @param maxElapsedMillis when non-null, an elapsed-time budget across the whole walk, measured by [clock]
     *   before each fetch; exceeding it throws [SdkTimeoutException] with [TimeoutPhase.PAGINATION_BUDGET] instead
     *   of fetching the next page. Unlike [maxPages]/[maxItems], this is a failure, not a graceful truncation: an
     *   elapsed-time budget signals the caller waited too long, not a caller-chosen stopping point.
     * @param clock the monotonic clock [maxElapsedMillis] is measured against; overridable for deterministic tests.
     * @param pagination bounds from [com.nabobery.sdkgen.runtime.CallOptions.pagination]. When present, each non-null
     *   bound replaces the corresponding legacy individual parameter. The individual parameters remain for source
     *   compatibility; generated code should pass `options.pagination` through this parameter.
     */
    public fun pages(
        fetch: suspend (PageRequest) -> PageEnvelope<T, I>,
        maxPages: Int? = null,
        maxItems: Long? = null,
        maxElapsedMillis: Long? = null,
        clock: SdkClock = SystemSdkClock,
        pagination: PaginationBounds? = null,
    ): Flow<Page<T, I>> =
        flow {
            val effectiveMaxPages = pagination?.maxPages ?: maxPages
            val effectiveMaxItems = pagination?.maxItems ?: maxItems
            val effectiveMaxElapsedMillis = pagination?.maxElapsedMillis ?: maxElapsedMillis
            require(effectiveMaxPages == null || effectiveMaxPages > 0) { "maxPages must be positive" }
            require(effectiveMaxItems == null || effectiveMaxItems > 0) { "maxItems must be positive" }
            require(effectiveMaxElapsedMillis == null || effectiveMaxElapsedMillis > 0) {
                "maxElapsedMillis must be positive"
            }

            val startedAtMillis = if (effectiveMaxElapsedMillis != null) clock.monotonicMillis() else 0L
            var state = initialTransitionState()
            var request: PageRequest = PageRequest.First
            var pageIndex = 1
            var cumulativeItems = 0L

            while (true) {
                if (
                    effectiveMaxElapsedMillis != null &&
                    clock.monotonicMillis() - startedAtMillis > effectiveMaxElapsedMillis
                ) {
                    throw SdkTimeoutException(
                        TimeoutPhase.PAGINATION_BUDGET,
                        "Pagination elapsed budget of ${effectiveMaxElapsedMillis}ms exceeded before fetching page " +
                            "$pageIndex.",
                        operationId,
                    )
                }
                val envelope = fetch(request)
                val (outcome, nextState) =
                    computeTransition(descriptor, envelope, state, operationId) { rawNextUrl ->
                        resolveTrustedUrl(rawNextUrl, envelope)
                    }
                state = nextState
                cumulativeItems += envelope.items.size

                val boundedByPages = effectiveMaxPages != null && pageIndex >= effectiveMaxPages
                val boundedByItems = effectiveMaxItems != null && cumulativeItems >= effectiveMaxItems

                if (outcome is PageOutcome.Continue && !boundedByPages && !boundedByItems) {
                    emit(envelope.toPage(pageIndex, outcome))
                    request = outcome.next
                    pageIndex += 1
                } else {
                    emit(envelope.toPage(pageIndex, PageOutcome.Terminate))
                    break
                }
            }
        }

    /**
     * A cold [Flow] flattening every page's [Page.items] in page order, then item order within each page — built
     * directly on [pages], so it shares every safety invariant and budget semantics documented there, including
     * support for passing [com.nabobery.sdkgen.runtime.CallOptions.pagination] through [pagination].
     * Meaningful only when the operation's `PageEnvelope` populates an item accessor; when it never does, this simply
     * completes having emitted nothing.
     */
    public fun items(
        fetch: suspend (PageRequest) -> PageEnvelope<T, I>,
        maxPages: Int? = null,
        maxItems: Long? = null,
        maxElapsedMillis: Long? = null,
        clock: SdkClock = SystemSdkClock,
        pagination: PaginationBounds? = null,
    ): Flow<I> =
        flow {
            val effectiveMaxItems = pagination?.maxItems ?: maxItems
            var emitted = 0L
            pages(fetch, maxPages, maxItems, maxElapsedMillis, clock, pagination).collect { page ->
                for (item in page.items) {
                    if (effectiveMaxItems != null && emitted >= effectiveMaxItems) return@collect
                    emit(item)
                    emitted += 1
                }
            }
        }

    /**
     * The resolution base for a raw next-URL value: [PaginationDescriptor.HeaderNextUrl] resolves against the URI of
     * the request that actually returned the `Link` header ([PageEnvelope.requestUri]), since that may drift from
     * the operation's static [baseUri] across a multi-hop walk; every other next-URL-bearing strategy resolves
     * against the fixed [baseUri], matching this engine's pre-existing behavior.
     */
    private fun resolutionBase(envelope: PageEnvelope<T, I>): String =
        if (descriptor is PaginationDescriptor.HeaderNextUrl) {
            requireNotNull(envelope.requestUri) {
                "requestUri is required on a PageEnvelope for a HeaderNextUrl pagination descriptor"
            }
        } else {
            requireNotNull(baseUri)
        }

    private fun resolveTrustedUrl(
        rawNextUrl: String,
        envelope: PageEnvelope<T, I>,
    ): String {
        val base = resolutionBase(envelope)
        val resolved =
            resolveNextUrl(base, rawNextUrl)
                ?: throw SdkPaginationException(
                    "Pagination next-URL '$rawNextUrl' could not be resolved against '$base' " +
                        "(fragment-only references are never resolvable, and the base itself must be an absolute " +
                        "http(s) URI).",
                    operationId,
                )
        return requireTrustedNextUrl(resolved, requireNotNull(trustedHosts), operationId)
    }

    private fun PageEnvelope<T, I>.toPage(
        pageIndex: Int,
        outcome: PageOutcome,
    ): Page<T, I> =
        when (outcome) {
            is PageOutcome.Continue -> {
                Page(
                    value = value,
                    items = items,
                    pageIndex = pageIndex,
                    hasNext = true,
                    continuationToken =
                        (outcome.next as? PageRequest.NextCursor)?.cursor
                            ?: (outcome.next as? PageRequest.NextToken)?.token,
                    continuationUrl = (outcome.next as? PageRequest.NextUrl)?.url,
                )
            }

            PageOutcome.Terminate -> {
                Page(value = value, items = items, pageIndex = pageIndex, hasNext = false)
            }
        }

    /**
     * [firstPage]'s dedicated projection: derives [Page.hasNext] from raw envelope fields only and never runs loop
     * detection (see [firstPage]'s KDoc for why), matching this engine's pre-existing behavior for every strategy
     * except [PaginationDescriptor.HeaderNextUrl].
     *
     * [PaginationDescriptor.HeaderNextUrl] is the one exception: unlike a body-declared `NextUrl`, its raw `Link`
     * header target is untrusted transport-layer input the caller cannot otherwise validate before deciding whether
     * to act on [Page.continuationUrl] — resolving and trust-checking it here costs no extra fetch (every input,
     * [trustedHosts] and this page's own [PageEnvelope.requestUri], is already in hand), so [Page.continuationUrl]
     * is the same resolved, trusted URL [pages] would use to continue, and an untrusted target throws
     * [SdkPaginationException] from [firstPage] itself rather than silently handing back a URL a caller might
     * otherwise dereference unchecked.
     */
    private fun PageEnvelope<T, I>.toFirstPage(): Page<T, I> =
        when (descriptor) {
            is PaginationDescriptor.CursorToken -> {
                val cursor = nextCursor?.takeUnless(String::isBlank)
                Page(value, items, pageIndex = 1, hasNext = cursor != null, continuationToken = cursor)
            }

            is PaginationDescriptor.NextToken -> {
                val token = nextToken?.takeUnless(String::isBlank)
                Page(value, items, pageIndex = 1, hasNext = token != null, continuationToken = token)
            }

            is PaginationDescriptor.NextUrl -> {
                val url = nextUrl?.takeUnless(String::isBlank)
                Page(value, items, pageIndex = 1, hasNext = url != null, continuationUrl = url)
            }

            is PaginationDescriptor.HeaderNextUrl -> {
                val raw = firstNextLinkTarget(linkHeaderValues())?.takeUnless(String::isBlank)
                val resolved = raw?.let { resolveTrustedUrl(it, this) }
                Page(value, items, pageIndex = 1, hasNext = resolved != null, continuationUrl = resolved)
            }

            is PaginationDescriptor.OffsetLimit -> {
                val shortPage = requestedPageSize != null && items.size < requestedPageSize
                val totalReached = totalCount?.let { initialOffset + items.size >= it } == true
                Page(value, items, pageIndex = 1, hasNext = items.isNotEmpty() && !shortPage && !totalReached)
            }

            is PaginationDescriptor.PageSize -> {
                val shortPage = requestedPageSize != null && items.size < requestedPageSize
                val totalReached = totalPages?.let { initialPage >= it } == true
                Page(value, items, pageIndex = 1, hasNext = items.isNotEmpty() && !shortPage && !totalReached)
            }
        }
}
