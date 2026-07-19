package com.nabobery.sdkgen.runtime.pagination

/**
 * What the pagination engine asks the caller-supplied fetch function to retrieve next.
 *
 * [First] is the initial page for every strategy: the fetch function already knows how to build that request (base
 * offset/page-number/limit, no cursor/token, the operation's own URL) from the business parameters and
 * [com.nabobery.sdkgen.runtime.CallOptions] it closed over — the engine itself never invents strategy-specific
 * defaults (limit values, starting page numbers) because [com.nabobery.sdkgen.runtime.PaginationDescriptor] only
 * carries request *parameter names*, never values.
 *
 * Continuation variants carry only what changed relative to the previous request: the engine tracks per-strategy
 * state ([PaginationDescriptor.OffsetLimit]'s offset, [PaginationDescriptor.PageSize]'s page number) internally and
 * derives each next value purely from the previous [PageEnvelope], so the fetch function only needs to splice one
 * changed value into an otherwise-unchanged request.
 */
public sealed interface PageRequest {
    /** The first page of a paginated call. */
    public data object First : PageRequest

    /** Continue a [PaginationDescriptor.CursorToken] sequence with the cursor read from the previous response. */
    public data class NextCursor(
        public val cursor: String,
    ) : PageRequest

    /** Continue a [PaginationDescriptor.OffsetLimit] sequence at the given zero-based offset. */
    public data class NextOffset(
        public val offset: Long,
    ) : PageRequest

    /** Continue a [PaginationDescriptor.PageSize] sequence at the given one-based page number. */
    public data class NextPage(
        public val page: Int,
    ) : PageRequest

    /** Continue a [PaginationDescriptor.NextUrl] sequence by fetching the given fully resolved, trust-checked URL. */
    public data class NextUrl(
        public val url: String,
    ) : PageRequest

    /** Continue a [PaginationDescriptor.NextToken] sequence with the token read from the previous response. */
    public data class NextToken(
        public val token: String,
    ) : PageRequest
}

/**
 * One decoded page, as generated code hands it to the pagination engine.
 *
 * [value] is the full decoded page payload (whatever the operation's response type is). [items] is the item list
 * extracted from [value] via the descriptor's `responseItemsPath`; it is generated code's job to compile that
 * [com.nabobery.sdkgen.runtime.PropertyPath] into an accessor and populate this list — this engine never parses
 * [value] itself. The remaining fields are populated only for the strategy actually in play on the operation's
 * [PaginationDescriptor]; fields irrelevant to that strategy are left at their `null`/empty default and ignored by
 * the transition logic.
 *
 * Not a `data class`: [items] is defensively copied at construction, for the same reason documented on
 * `ResponseAlternative` in `Descriptors.kt` (a data-class primary constructor cannot intercept and copy an incoming
 * mutable collection before it becomes part of the instance's identity). [equals]/[hashCode]/[toString]/[copy] are
 * hand-written over that copy.
 *
 * @property nextCursor the next-page cursor, for [PaginationDescriptor.CursorToken]; `null`/blank means no next page.
 * @property nextUrl the next-page URL (absolute or relative), for [PaginationDescriptor.NextUrl]; `null`/blank means
 *   no next page.
 * @property nextToken the next-page token, for [PaginationDescriptor.NextToken]; `null`/blank means no next page.
 * @property totalCount the total item count, for [PaginationDescriptor.OffsetLimit] when
 *   `responseTotalPath` is declared; `null` when undeclared or unavailable.
 * @property totalPages the total page count, for [PaginationDescriptor.PageSize] when `responseTotalPagesPath` is
 *   declared; `null` when undeclared or unavailable.
 */
public class PageEnvelope<T, I>(
    public val value: T,
    items: List<I> = emptyList(),
    public val nextCursor: String? = null,
    public val nextUrl: String? = null,
    public val nextToken: String? = null,
    public val totalCount: Long? = null,
    public val totalPages: Int? = null,
) {
    /** Defensive copy of the items supplied at construction; later mutation of the input has no effect. */
    public val items: List<I> = items.toList()

    public fun copy(
        value: T = this.value,
        items: List<I> = this.items,
        nextCursor: String? = this.nextCursor,
        nextUrl: String? = this.nextUrl,
        nextToken: String? = this.nextToken,
        totalCount: Long? = this.totalCount,
        totalPages: Int? = this.totalPages,
    ): PageEnvelope<T, I> = PageEnvelope(value, items, nextCursor, nextUrl, nextToken, totalCount, totalPages)

    override fun equals(other: Any?): Boolean =
        other is PageEnvelope<*, *> &&
            value == other.value &&
            items == other.items &&
            nextCursor == other.nextCursor &&
            nextUrl == other.nextUrl &&
            nextToken == other.nextToken &&
            totalCount == other.totalCount &&
            totalPages == other.totalPages

    override fun hashCode(): Int =
        arrayOf<Any?>(value, items, nextCursor, nextUrl, nextToken, totalCount, totalPages).contentHashCode()

    override fun toString(): String =
        "PageEnvelope(value=$value, items=$items, nextCursor=$nextCursor, nextUrl=$nextUrl, " +
            "nextToken=$nextToken, totalCount=$totalCount, totalPages=$totalPages)"
}

/**
 * One page as surfaced to SDK consumers by [com.nabobery.sdkgen.runtime.pagination.PaginationEngine]'s `pages()`
 * view (and, per-item, its `items()` view).
 *
 * [pageIndex] is one-based (the first page fetched is `1`, regardless of strategy — including
 * [PaginationDescriptor.OffsetLimit], where the underlying offset may start elsewhere). [continuationToken] and
 * [continuationUrl] surface only safe, already-logged-shape metadata (a cursor/token string, or a resolved URL) —
 * never response bodies or credentials — for callers that want to persist a resume point; at most one of them is
 * non-null, matching whichever strategy produced [hasNext].
 *
 * Not a `data class`: [items] is defensively copied, for the same reason as [PageEnvelope.items].
 * [equals]/[hashCode]/[toString]/[copy] are hand-written over that copy.
 */
public class Page<T, I>(
    public val value: T,
    items: List<I>,
    public val pageIndex: Int,
    public val hasNext: Boolean,
    public val continuationToken: String? = null,
    public val continuationUrl: String? = null,
) {
    /** Defensive copy of the items supplied at construction; later mutation of the input has no effect. */
    public val items: List<I> = items.toList()

    public fun copy(
        value: T = this.value,
        items: List<I> = this.items,
        pageIndex: Int = this.pageIndex,
        hasNext: Boolean = this.hasNext,
        continuationToken: String? = this.continuationToken,
        continuationUrl: String? = this.continuationUrl,
    ): Page<T, I> = Page(value, items, pageIndex, hasNext, continuationToken, continuationUrl)

    override fun equals(other: Any?): Boolean =
        other is Page<*, *> &&
            value == other.value &&
            items == other.items &&
            pageIndex == other.pageIndex &&
            hasNext == other.hasNext &&
            continuationToken == other.continuationToken &&
            continuationUrl == other.continuationUrl

    override fun hashCode(): Int =
        arrayOf<Any?>(value, items, pageIndex, hasNext, continuationToken, continuationUrl).contentHashCode()

    override fun toString(): String =
        "Page(value=$value, items=$items, pageIndex=$pageIndex, hasNext=$hasNext, " +
            "continuationToken=$continuationToken, continuationUrl=$continuationUrl)"
}
