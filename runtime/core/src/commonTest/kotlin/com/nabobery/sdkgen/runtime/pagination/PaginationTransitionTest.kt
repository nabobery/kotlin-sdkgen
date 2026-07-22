package com.nabobery.sdkgen.runtime.pagination

import com.nabobery.sdkgen.runtime.PaginationDescriptor
import com.nabobery.sdkgen.runtime.PropertyPath
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkPaginationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Unit tests for [computeTransition]'s pure arithmetic, exercised directly (see [computeTransition]'s KDoc for why
 * this is `internal` rather than `private`) rather than only through the public `pages()`/`items()` Flow surface.
 */
internal class PaginationTransitionTest {
    private val itemsPath = PropertyPath("items")
    private val identityResolve: (String) -> String = { it }

    // --- CursorToken ---

    @Test
    fun cursorTokenNullCursorTerminates() {
        val descriptor =
            PaginationDescriptor.CursorToken(
                "cursor",
                responseItemsPath = itemsPath,
                responseNextCursorPath = itemsPath,
            )
        val envelope = PageEnvelope<Unit, String>(Unit, nextCursor = null)

        val (outcome, _) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun cursorTokenBlankCursorTerminates() {
        val descriptor =
            PaginationDescriptor.CursorToken(
                "cursor",
                responseItemsPath = itemsPath,
                responseNextCursorPath = itemsPath,
            )
        val envelope = PageEnvelope<Unit, String>(Unit, nextCursor = "  ")

        val (outcome, _) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun cursorTokenPresentCursorContinuesAndRecordsIt() {
        val descriptor =
            PaginationDescriptor.CursorToken(
                "cursor",
                responseItemsPath = itemsPath,
                responseNextCursorPath = itemsPath,
            )
        val envelope = PageEnvelope<Unit, String>(Unit, nextCursor = "abc")

        val (outcome, state) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Continue(PageRequest.NextCursor("abc")), outcome)
        assertTrue("abc" in state.seenContinuations)
    }

    @Test
    fun cursorTokenRepeatedCursorIsALoop() {
        val descriptor =
            PaginationDescriptor.CursorToken(
                "cursor",
                responseItemsPath = itemsPath,
                responseNextCursorPath = itemsPath,
            )
        val envelope = PageEnvelope<Unit, String>(Unit, nextCursor = "abc")
        val state = TransitionState(seenContinuations = setOf("abc"))

        assertFailsWith<SdkPaginationException> {
            computeTransition(descriptor, envelope, state, "op", identityResolve)
        }
    }

    // --- NextToken ---

    @Test
    fun nextTokenNullTokenTerminates() {
        val descriptor =
            PaginationDescriptor.NextToken(
                "token",
                responseItemsPath = itemsPath,
                responseNextTokenPath = itemsPath,
            )
        val envelope = PageEnvelope<Unit, String>(Unit, nextToken = null)

        val (outcome, _) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun nextTokenRepeatedTokenIsALoop() {
        val descriptor =
            PaginationDescriptor.NextToken(
                "token",
                responseItemsPath = itemsPath,
                responseNextTokenPath = itemsPath,
            )
        val envelope = PageEnvelope<Unit, String>(Unit, nextToken = "tok-1")
        val state = TransitionState(seenContinuations = setOf("tok-1"))

        assertFailsWith<SdkPaginationException> {
            computeTransition(descriptor, envelope, state, null, identityResolve)
        }
    }

    // --- NextUrl ---

    @Test
    fun nextUrlNullTerminates() {
        val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
        val envelope = PageEnvelope<Unit, String>(Unit, nextUrl = null)

        val (outcome, _) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun nextUrlPresentResolvesAndContinues() {
        val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
        val envelope = PageEnvelope<Unit, String>(Unit, nextUrl = "/page/2")
        val resolve: (String) -> String = { "https://example.test$it" }

        val (outcome, state) = computeTransition(descriptor, envelope, TransitionState(), null, resolve)

        assertEquals(PageOutcome.Continue(PageRequest.NextUrl("https://example.test/page/2")), outcome)
        assertTrue("https://example.test/page/2" in state.seenContinuations)
    }

    @Test
    fun nextUrlRepeatedResolvedUrlIsALoop() {
        val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
        val envelope = PageEnvelope<Unit, String>(Unit, nextUrl = "https://example.test/page/2")
        val state = TransitionState(seenContinuations = setOf("https://example.test/page/2"))

        assertFailsWith<SdkPaginationException> {
            computeTransition(descriptor, envelope, state, null, identityResolve)
        }
    }

    // --- HeaderNextUrl ---

    @Test
    fun headerNextUrlNoLinkHeaderTerminates() {
        val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
        val envelope = PageEnvelope<Unit, String>(Unit, responseHeaders = emptyList())

        val (outcome, _) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun headerNextUrlNoNextRelTerminates() {
        val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
        val envelope =
            PageEnvelope<Unit, String>(
                Unit,
                responseHeaders = listOf(SdkHeader("Link", """<https://example.test/prev>; rel="prev"""")),
            )

        val (outcome, _) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun headerNextUrlPresentResolvesAndContinues() {
        val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
        val envelope =
            PageEnvelope<Unit, String>(
                Unit,
                responseHeaders = listOf(SdkHeader("Link", """</page/2>; rel="next"""")),
            )
        val resolve: (String) -> String = { "https://example.test$it" }

        val (outcome, state) = computeTransition(descriptor, envelope, TransitionState(), null, resolve)

        assertEquals(PageOutcome.Continue(PageRequest.NextUrl("https://example.test/page/2")), outcome)
        assertTrue("https://example.test/page/2" in state.seenContinuations)
    }

    @Test
    fun headerNextUrlRepeatedResolvedUrlIsALoop() {
        val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
        val envelope =
            PageEnvelope<Unit, String>(
                Unit,
                responseHeaders = listOf(SdkHeader("Link", """<https://example.test/page/2>; rel="next"""")),
            )
        val state = TransitionState(seenContinuations = setOf("https://example.test/page/2"))

        assertFailsWith<SdkPaginationException> {
            computeTransition(descriptor, envelope, state, null, identityResolve)
        }
    }

    @Test
    fun headerNextUrlReadsAcrossMultipleLinkHeaders() {
        val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
        val envelope =
            PageEnvelope<Unit, String>(
                Unit,
                responseHeaders =
                    listOf(
                        SdkHeader("Link", """<https://example.test/prev>; rel="prev""""),
                        SdkHeader("Link", """<https://example.test/page/3>; rel="next""""),
                    ),
            )

        val (outcome, _) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Continue(PageRequest.NextUrl("https://example.test/page/3")), outcome)
    }

    // --- OffsetLimit ---

    @Test
    fun offsetLimitEmptyPageTerminates() {
        val descriptor = PaginationDescriptor.OffsetLimit("offset", "limit", itemsPath)
        val envelope = PageEnvelope<Unit, String>(Unit, items = emptyList())

        val (outcome, _) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun offsetLimitFullPageAdvancesByItemCountAndContinues() {
        val descriptor = PaginationDescriptor.OffsetLimit("offset", "limit", itemsPath)
        val firstEnvelope = PageEnvelope<Unit, String>(Unit, items = listOf("a", "b", "c"))

        val (firstOutcome, firstState) =
            computeTransition(
                descriptor,
                firstEnvelope,
                TransitionState(),
                null,
                identityResolve,
            )
        assertEquals(PageOutcome.Continue(PageRequest.NextOffset(3)), firstOutcome)
        assertEquals(3L, firstState.offset)
        assertEquals(3, firstState.expectedPageSize)

        val secondEnvelope = PageEnvelope<Unit, String>(Unit, items = listOf("d", "e", "f"))
        val (secondOutcome, secondState) =
            computeTransition(
                descriptor,
                secondEnvelope,
                firstState,
                null,
                identityResolve,
            )
        assertEquals(PageOutcome.Continue(PageRequest.NextOffset(6)), secondOutcome)
        assertEquals(6L, secondState.offset)
    }

    @Test
    fun offsetLimitShortPageTerminatesAfterEmittingIt() {
        val descriptor = PaginationDescriptor.OffsetLimit("offset", "limit", itemsPath)
        val firstState = TransitionState(offset = 6, expectedPageSize = 3)
        val shortEnvelope = PageEnvelope<Unit, String>(Unit, items = listOf("g", "h"))

        val (outcome, state) = computeTransition(descriptor, shortEnvelope, firstState, null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
        assertEquals(8L, state.offset)
    }

    @Test
    fun offsetLimitTotalCountReachedTerminates() {
        val descriptor = PaginationDescriptor.OffsetLimit("offset", "limit", itemsPath, responseTotalPath = itemsPath)
        val state = TransitionState(offset = 3, expectedPageSize = 3)
        val envelope = PageEnvelope<Unit, String>(Unit, items = listOf("d", "e", "f"), totalCount = 6)

        val (outcome, _) = computeTransition(descriptor, envelope, state, null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun offsetLimitNonAdvancingOffsetIsALoop() {
        val descriptor = PaginationDescriptor.OffsetLimit("offset", "limit", itemsPath)
        // A hand-crafted state simulating a bug where the offset counter did not advance despite items being
        // returned; this can never arise from this engine's own arithmetic (items.size is always > 0 here, which
        // always strictly increases offset), so it is exercised directly against the pure transition function.
        val state = TransitionState(offset = Long.MAX_VALUE)
        val envelope = PageEnvelope<Unit, String>(Unit, items = listOf("overflow"))

        assertFailsWith<SdkPaginationException> {
            computeTransition(descriptor, envelope, state, null, identityResolve)
        }
    }

    // --- PageSize ---

    @Test
    fun pageSizeEmptyPageTerminates() {
        val descriptor = PaginationDescriptor.PageSize("page", "size", itemsPath)
        val envelope = PageEnvelope<Unit, String>(Unit, items = emptyList())

        val (outcome, _) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun pageSizeFullPageAdvancesPageNumberAndContinues() {
        val descriptor = PaginationDescriptor.PageSize("page", "size", itemsPath)
        val envelope = PageEnvelope<Unit, String>(Unit, items = listOf("a", "b"))

        val (outcome, state) = computeTransition(descriptor, envelope, TransitionState(), null, identityResolve)

        assertEquals(PageOutcome.Continue(PageRequest.NextPage(2)), outcome)
        assertEquals(2, state.page)
        assertEquals(2, state.expectedPageSize)
    }

    @Test
    fun pageSizeShortPageTerminates() {
        val descriptor = PaginationDescriptor.PageSize("page", "size", itemsPath)
        val state = TransitionState(page = 3, expectedPageSize = 2)
        val envelope = PageEnvelope<Unit, String>(Unit, items = listOf("only-one"))

        val (outcome, _) = computeTransition(descriptor, envelope, state, null, identityResolve)

        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun pageSizeTotalPagesReachedTerminates() {
        val descriptor = PaginationDescriptor.PageSize("page", "size", itemsPath, responseTotalPagesPath = itemsPath)
        val state = TransitionState(page = 2, expectedPageSize = 2)
        val envelope = PageEnvelope<Unit, String>(Unit, items = listOf("a", "b"), totalPages = 2)

        val (outcome, _) = computeTransition(descriptor, envelope, state, null, identityResolve)

        assertFalse(outcome is PageOutcome.Continue)
        assertEquals(PageOutcome.Terminate, outcome)
    }

    @Test
    fun pageSizeNonAdvancingPageIsALoop() {
        val descriptor = PaginationDescriptor.PageSize("page", "size", itemsPath)
        val state = TransitionState(page = Int.MAX_VALUE)
        val envelope = PageEnvelope<Unit, String>(Unit, items = listOf("overflow"))

        assertFailsWith<SdkPaginationException> {
            computeTransition(descriptor, envelope, state, null, identityResolve)
        }
    }
}
