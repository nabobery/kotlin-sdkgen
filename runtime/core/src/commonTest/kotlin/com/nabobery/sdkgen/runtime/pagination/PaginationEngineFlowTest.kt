package com.nabobery.sdkgen.runtime.pagination

import com.nabobery.sdkgen.runtime.PaginationBounds
import com.nabobery.sdkgen.runtime.PaginationDescriptor
import com.nabobery.sdkgen.runtime.PropertyPath
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkPaginationException
import com.nabobery.sdkgen.runtime.SdkTimeoutException
import com.nabobery.sdkgen.runtime.TimeoutPhase
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.resilience.SdkClock
import com.nabobery.sdkgen.runtime.runTestSuspend
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList
import kotlin.coroutines.cancellation.CancellationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame
import kotlin.test.assertTrue

/**
 * Flow-level contract tests for [PaginationEngine]'s three views, built on the pure arithmetic already covered by
 * [PaginationTransitionTest].
 */
internal class PaginationEngineFlowTest {
    private val itemsPath = PropertyPath("items")

    @Test
    fun firstPageWorksWithoutAnyAccessorsPopulated() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Nothing>(descriptor)
            val fetcher = ScriptedFetcher<String, Nothing>().enqueue(PageEnvelope("page-1"))

            val page = engine.firstPage(fetcher.fetch)

            assertEquals("page-1", page.value)
            assertEquals(emptyList(), page.items)
            assertEquals(1, page.pageIndex)
            assertTrue(!page.hasNext)
            assertEquals(listOf(PageRequest.First), fetcher.requests)
        }

    @Test
    fun cursorTokenPagesFlowWalksUntilCursorIsAbsent() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a', 'b'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('c'), nextCursor = "c2"))
                    .enqueue(PageEnvelope("p3", items = listOf('d'), nextCursor = null))

            val pages = engine.pages(fetcher.fetch).toList()

            assertEquals(listOf("p1", "p2", "p3"), pages.map { it.value })
            assertEquals(listOf(1, 2, 3), pages.map { it.pageIndex })
            assertEquals(listOf(true, true, false), pages.map { it.hasNext })
            assertEquals(listOf("c1", "c2", null), pages.map { it.continuationToken })
            assertEquals(
                listOf(PageRequest.First, PageRequest.NextCursor("c1"), PageRequest.NextCursor("c2")),
                fetcher.requests,
            )
        }

    @Test
    fun itemsFlowFlattensInPageThenItemOrder() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a', 'b'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('c', 'd'), nextCursor = null))

            val items = engine.items(fetcher.fetch).toList()

            assertEquals(listOf('a', 'b', 'c', 'd'), items)
        }

    @Test
    fun coldReCollectionRestartsFromPageOneWithFreshState() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('b'), nextCursor = null))
                    // Same script contents again for the second, independent collection.
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('b'), nextCursor = null))

            val flow = engine.pages(fetcher.fetch)
            val firstCollection = flow.toList()
            val secondCollection = flow.toList()

            assertEquals(firstCollection.map { it.value }, secondCollection.map { it.value })
            assertEquals(listOf(1, 2), secondCollection.map { it.pageIndex })
            assertEquals(
                listOf(
                    PageRequest.First,
                    PageRequest.NextCursor("c1"),
                    PageRequest.First,
                    PageRequest.NextCursor("c1"),
                ),
                fetcher.requests,
            )
        }

    @Test
    fun maxPagesStopsWithoutFetchingBeyondTheBound() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('b'), nextCursor = "c2"))
            // No third scripted step: a fetch beyond maxPages would fail the script and fail this test.

            val pages = engine.pages(fetcher.fetch, maxPages = 2).toList()

            assertEquals(listOf("p1", "p2"), pages.map { it.value })
            assertEquals(false, pages.last().hasNext)
            assertEquals(2, fetcher.requests.size)
        }

    @Test
    fun callOptionsStylePaginationBoundsStopPagesWithoutFetchingBeyondTheBound() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('b'), nextCursor = "c2"))

            val pages = engine.pages(fetcher.fetch, pagination = PaginationBounds(maxPages = 2)).toList()

            assertEquals(listOf("p1", "p2"), pages.map { it.value })
            assertEquals(false, pages.last().hasNext)
            assertEquals(2, fetcher.requests.size)
        }

    @Test
    fun callOptionsStylePaginationBoundsTruncateItemsExactlyAtTheBound() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a', 'b', 'c'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('d', 'e'), nextCursor = "c2"))

            val items = engine.items(fetcher.fetch, pagination = PaginationBounds(maxItems = 4)).toList()

            assertEquals(listOf('a', 'b', 'c', 'd'), items)
            assertEquals(2, fetcher.requests.size)
        }

    @Test
    fun maxItemsTruncatesItemsFlowExactlyAtTheBound() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a', 'b', 'c'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('d', 'e'), nextCursor = "c2"))

            val items = engine.items(fetcher.fetch, maxItems = 4).toList()

            assertEquals(listOf('a', 'b', 'c', 'd'), items)
            assertEquals(2, fetcher.requests.size)
        }

    @Test
    fun elapsedBudgetExceededThrowsPaginationBudgetTimeout() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor, operationId = "listThings")
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextCursor = "c1"))
            val clock = StepClock(listOf(0L, 50L, 200L))

            val failure =
                assertFailsWith<SdkTimeoutException> {
                    engine.pages(fetcher.fetch, maxElapsedMillis = 100, clock = clock).toList()
                }

            assertEquals(TimeoutPhase.PAGINATION_BUDGET, failure.phase)
            assertEquals("listThings", failure.operationId)
            // Budget is checked before the second fetch; the first page's fetch must still have happened.
            assertEquals(1, fetcher.requests.size)
        }

    @Test
    fun collectionStopsFetchingImmediatelyOnceTakeIsSatisfied() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('b'), nextCursor = "c2"))
            // Two scripted pages only: take(1) must never reach for a third.

            val firstOnly = engine.pages(fetcher.fetch).take(1).toList()

            assertEquals(listOf("p1"), firstOnly.map { it.value })
            assertEquals(1, fetcher.requests.size)
        }

    @Test
    fun pageFetchFailurePropagatesUnwrappedWithNoFurtherFetches() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val failure = IllegalStateException("boom")
            val fetcher = ScriptedFetcher<String, Char>().enqueueFailure(failure)

            val thrown = assertFailsWith<IllegalStateException> { engine.pages(fetcher.fetch).toList() }

            assertSame(failure, thrown)
            assertEquals(1, fetcher.requests.size)
        }

    @Test
    fun cancellationFromFetchPropagatesByIdentity() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val cancellation = CancellationException("cancelled")
            val fetcher = ScriptedFetcher<String, Char>().enqueueFailure(cancellation)

            val thrown = assertFailsWith<CancellationException> { engine.pages(fetcher.fetch).toList() }

            assertSame(cancellation, thrown)
        }

    @Test
    fun fetchIsNeverCalledReentrantly() =
        runTestSuspend {
            val descriptor =
                PaginationDescriptor.CursorToken(
                    "cursor",
                    responseItemsPath = itemsPath,
                    responseNextCursorPath = itemsPath,
                )
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextCursor = "c1"))
                    .enqueue(PageEnvelope("p2", items = listOf('b'), nextCursor = null))

            engine.pages(fetcher.fetch).toList()

            assertEquals(2, fetcher.requests.size)
            assertEquals(1, fetcher.maxObservedConcurrency)
        }

    // --- NextUrl trust ---

    @Test
    fun relativeRootNextUrlResolvesAgainstBaseOrigin() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test/v1")
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    baseUri = "https://api.example.test/v1",
                    trustedHosts = trustedHosts,
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextUrl = "/v1/things?cursor=2"))
                    .enqueue(PageEnvelope("p2", items = listOf('b'), nextUrl = null))

            val pages = engine.pages(fetcher.fetch).toList()

            assertEquals(
                listOf(PageRequest.First, PageRequest.NextUrl("https://api.example.test:443/v1/things?cursor=2")),
                fetcher.requests,
            )
            assertEquals(listOf("p1", "p2"), pages.map { it.value })
        }

    @Test
    fun sameOriginAbsoluteNextUrlIsAllowed() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    baseUri = "https://api.example.test",
                    trustedHosts = trustedHosts,
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(
                        PageEnvelope(
                            "p1",
                            items = listOf('a'),
                            nextUrl = "https://api.example.test/v1/things?cursor=2",
                        ),
                    ).enqueue(PageEnvelope("p2", items = listOf('b'), nextUrl = null))

            val pages = engine.pages(fetcher.fetch).toList()

            assertEquals(listOf("p1", "p2"), pages.map { it.value })
        }

    @Test
    fun explicitlyTrustedCrossOriginNextUrlIsAllowed() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test", setOf("https://cdn.example.test"))
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    baseUri = "https://api.example.test",
                    trustedHosts = trustedHosts,
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(
                        PageEnvelope("p1", items = listOf('a'), nextUrl = "https://cdn.example.test/things?cursor=2"),
                    ).enqueue(PageEnvelope("p2", items = listOf('b'), nextUrl = null))

            val pages = engine.pages(fetcher.fetch).toList()

            assertEquals(listOf("p1", "p2"), pages.map { it.value })
        }

    @Test
    fun untrustedCrossOriginNextUrlIsRefusedNamingOnlyTheOrigin() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    baseUri = "https://api.example.test",
                    trustedHosts = trustedHosts,
                    operationId = "listThings",
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextUrl = "https://evil.test/steal?token=abc"))

            val failure = assertFailsWith<SdkPaginationException> { engine.pages(fetcher.fetch).toList() }

            assertTrue(requireNotNull(failure.message).contains("https://evil.test:443"))
            assertTrue(!requireNotNull(failure.message).contains("token"))
            assertEquals("listThings", failure.operationId)
            // Only the first (successful) fetch happened; the refused next-URL was never requested.
            assertEquals(1, fetcher.requests.size)
        }

    @Test
    fun schemeRelativeNextUrlToUntrustedOriginIsRefused() =
        runTestSuspend {
            // Regression: a "//host/path" reference must resolve to a full URL and go through the same trust check
            // as any other absolute URL — never be mistaken for root-relative (same-origin) just because it started
            // as a relative reference.
            val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    baseUri = "https://api.example.test",
                    trustedHosts = trustedHosts,
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextUrl = "//evil.test/steal"))

            val failure = assertFailsWith<SdkPaginationException> { engine.pages(fetcher.fetch).toList() }

            assertTrue(requireNotNull(failure.message).contains("https://evil.test:443"))
            assertEquals(1, fetcher.requests.size)
        }

    @Test
    fun schemeRelativeNextUrlToTrustedOriginIsAllowed() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test", setOf("https://cdn.example.test"))
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    baseUri = "https://api.example.test",
                    trustedHosts = trustedHosts,
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextUrl = "//cdn.example.test/things?cursor=2"))
                    .enqueue(PageEnvelope("p2", items = listOf('b'), nextUrl = null))

            val pages = engine.pages(fetcher.fetch).toList()

            assertEquals(listOf("p1", "p2"), pages.map { it.value })
            assertEquals(
                listOf(PageRequest.First, PageRequest.NextUrl("https://cdn.example.test/things?cursor=2")),
                fetcher.requests,
            )
        }

    // --- HeaderNextUrl ---

    @Test
    fun headerNextUrlResolvesRelativeTargetAgainstEachPagesOwnRequestUri() =
        runTestSuspend {
            // The second page's Link header is relative and must resolve against the *second* page's own
            // requestUri, not the operation's static baseUri (which points at a different path entirely) —
            // this is the behavior that distinguishes HeaderNextUrl from body-path NextUrl.
            val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    trustedHosts = trustedHosts,
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(
                        PageEnvelope(
                            "p1",
                            items = listOf('a'),
                            requestUri = "https://api.example.test/repos/o/r/issues?page=1",
                            responseHeaders = listOf(SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next"""")),
                        ),
                    ).enqueue(
                        PageEnvelope(
                            "p2",
                            items = listOf('b'),
                            requestUri = "https://api.example.test/repos/o/r/issues?page=2",
                            responseHeaders = emptyList(),
                        ),
                    )

            val pages = engine.pages(fetcher.fetch).toList()

            assertEquals(listOf("p1", "p2"), pages.map { it.value })
            assertEquals(
                listOf(
                    PageRequest.First,
                    PageRequest.NextUrl("https://api.example.test:443/repos/o/r/issues?page=2"),
                ),
                fetcher.requests,
            )
        }

    @Test
    fun headerNextUrlAbsoluteTargetPassesThroughUnchanged() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine = PaginationEngine<String, Char>(descriptor, trustedHosts = trustedHosts)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(
                        PageEnvelope(
                            "p1",
                            items = listOf('a'),
                            requestUri = "https://api.example.test/issues",
                            responseHeaders =
                                listOf(SdkHeader("Link", """<https://api.example.test/issues?page=2>; rel="next"""")),
                        ),
                    ).enqueue(
                        PageEnvelope("p2", items = listOf('b'), requestUri = "https://api.example.test/issues?page=2"),
                    )

            val pages = engine.pages(fetcher.fetch).toList()

            assertEquals(listOf("p1", "p2"), pages.map { it.value })
        }

    @Test
    fun headerNextUrlUntrustedOriginIsRefused() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    trustedHosts = trustedHosts,
                    operationId = "listIssues",
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(
                        PageEnvelope(
                            "p1",
                            items = listOf('a'),
                            requestUri = "https://api.example.test/issues",
                            responseHeaders = listOf(SdkHeader("Link", """<https://evil.test/steal>; rel="next"""")),
                        ),
                    )

            val failure = assertFailsWith<SdkPaginationException> { engine.pages(fetcher.fetch).toList() }

            assertTrue(requireNotNull(failure.message).contains("https://evil.test:443"))
            assertEquals("listIssues", failure.operationId)
            assertEquals(1, fetcher.requests.size)
        }

    @Test
    fun headerNextUrlRepeatedResolvedTargetIsALoop() =
        runTestSuspend {
            // Page 1 points at page 2, and page 2's Link header points right back at page 2 itself (its own
            // requestUri) — the second transition's resolved target was already used to fetch page 2, so it is a
            // loop.
            val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine = PaginationEngine<String, Char>(descriptor, trustedHosts = trustedHosts)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(
                        PageEnvelope(
                            "p1",
                            items = listOf('a'),
                            requestUri = "https://api.example.test/issues?page=1",
                            responseHeaders =
                                listOf(SdkHeader("Link", """<https://api.example.test/issues?page=2>; rel="next"""")),
                        ),
                    ).enqueue(
                        PageEnvelope(
                            "p2",
                            items = listOf('b'),
                            requestUri = "https://api.example.test/issues?page=2",
                            responseHeaders =
                                listOf(SdkHeader("Link", """<https://api.example.test/issues?page=2>; rel="next"""")),
                        ),
                    )

            assertFailsWith<SdkPaginationException> { engine.pages(fetcher.fetch).toList() }
            Unit
        }

    @Test
    fun firstPageForHeaderNextUrlResolvesAndTrustChecksTheLinkTarget() =
        runTestSuspend {
            // Unlike NextUrl, a HeaderNextUrl target is untrusted transport-layer input the caller has no other
            // way to validate before acting on it, and resolving/trust-checking it costs no extra fetch — so
            // firstPage() surfaces the same resolved, trusted URL pages()/items() would use to continue.
            val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine = PaginationEngine<String, Char>(descriptor, trustedHosts = trustedHosts)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(
                        PageEnvelope(
                            "p1",
                            items = listOf('a'),
                            requestUri = "https://api.example.test/issues",
                            responseHeaders =
                                listOf(SdkHeader("Link", """</issues?page=2>; rel="next"""")),
                        ),
                    )

            val page = engine.firstPage(fetcher.fetch)

            assertEquals("p1", page.value)
            assertTrue(page.hasNext)
            assertEquals("https://api.example.test:443/issues?page=2", page.continuationUrl)
        }

    @Test
    fun firstPageForHeaderNextUrlThrowsOnAnUntrustedLinkTarget() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.HeaderNextUrl(itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine =
                PaginationEngine<String, Char>(descriptor, trustedHosts = trustedHosts, operationId = "listIssues")
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(
                        PageEnvelope(
                            "p1",
                            items = listOf('a'),
                            requestUri = "https://api.example.test/issues",
                            responseHeaders = listOf(SdkHeader("Link", """<https://evil.test/steal>; rel="next"""")),
                        ),
                    )

            val failure = assertFailsWith<SdkPaginationException> { engine.firstPage(fetcher.fetch) }

            assertTrue(requireNotNull(failure.message).contains("https://evil.test:443"))
            assertEquals("listIssues", failure.operationId)
        }

    // --- requestedPageSize / initialOffset / initialPage ---

    @Test
    fun requestedPageSizeRecognizesAShortFirstPageAsFinal() =
        runTestSuspend {
            // Without requestedPageSize, a first page can never be recognized as short (there is no baseline to
            // compare it against yet) — this is exactly the gap requestedPageSize closes: the caller tells the
            // engine the size the very first request actually used, so a short *first* page terminates immediately.
            val descriptor = PaginationDescriptor.OffsetLimit("offset", "limit", itemsPath)
            val engine = PaginationEngine<String, Char>(descriptor, requestedPageSize = 5)
            val fetcher = ScriptedFetcher<String, Char>().enqueue(PageEnvelope("p1", items = listOf('a', 'b', 'c')))
            // Only one scripted step: a second fetch would fail the script and fail this test.

            val pages = engine.pages(fetcher.fetch).toList()

            assertEquals(listOf("p1"), pages.map { it.value })
            assertEquals(false, pages.single().hasNext)
            assertEquals(1, fetcher.requests.size)
        }

    @Test
    fun initialOffsetSeedsOffsetLimitTransitionArithmetic() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.OffsetLimit("offset", "limit", itemsPath)
            val engine = PaginationEngine<String, Char>(descriptor, initialOffset = 100)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = (1..20).map { 'a' }))
                    .enqueue(PageEnvelope("p2", items = emptyList()))

            engine.pages(fetcher.fetch).toList()

            assertEquals(listOf(PageRequest.First, PageRequest.NextOffset(120)), fetcher.requests)
        }

    @Test
    fun initialPageSeedsPageSizeTransitionArithmetic() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.PageSize("page", "size", itemsPath)
            val engine = PaginationEngine<String, Char>(descriptor, initialPage = 5)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a', 'b')))
                    .enqueue(PageEnvelope("p2", items = emptyList()))

            engine.pages(fetcher.fetch).toList()

            assertEquals(listOf(PageRequest.First, PageRequest.NextPage(6)), fetcher.requests)
        }

    @Test
    fun defaultInitialStateIsUnchangedFromBeforeTheseParametersExisted() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.OffsetLimit("offset", "limit", itemsPath)
            val engine = PaginationEngine<String, Char>(descriptor)
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a', 'b')))
                    .enqueue(PageEnvelope("p2", items = emptyList()))

            engine.pages(fetcher.fetch).toList()

            assertEquals(listOf(PageRequest.First, PageRequest.NextOffset(2)), fetcher.requests)
        }

    // --- firstPage() never resolves/trust-checks a next-URL it will never fetch ---

    @Test
    fun firstPageSucceedsEvenWhenItsNextUrlIsCrossOriginAndUntrusted() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    baseUri = "https://api.example.test",
                    trustedHosts = trustedHosts,
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextUrl = "https://evil.test/steal?token=abc"))

            val page = engine.firstPage(fetcher.fetch)

            assertEquals("p1", page.value)
            assertTrue(page.hasNext)
            // Raw, unresolved value — firstPage() never resolves or trust-checks a continuation it will never fetch.
            assertEquals("https://evil.test/steal?token=abc", page.continuationUrl)
            assertEquals(1, fetcher.requests.size)
        }

    @Test
    fun continuingPastThatSameFirstPageViaPagesStillThrows() =
        runTestSuspend {
            val descriptor = PaginationDescriptor.NextUrl(itemsPath, itemsPath)
            val trustedHosts = TrustedHosts.of("https://api.example.test")
            val engine =
                PaginationEngine<String, Char>(
                    descriptor,
                    baseUri = "https://api.example.test",
                    trustedHosts = trustedHosts,
                )
            val fetcher =
                ScriptedFetcher<String, Char>()
                    .enqueue(PageEnvelope("p1", items = listOf('a'), nextUrl = "https://evil.test/steal?token=abc"))

            assertFailsWith<SdkPaginationException> { engine.pages(fetcher.fetch).toList() }
            Unit
        }
}

private class ScriptedFetcher<T, I> {
    private val script: MutableList<suspend () -> PageEnvelope<T, I>> = mutableListOf()
    private val recorded: MutableList<PageRequest> = mutableListOf()
    private var concurrent: Int = 0

    val requests: List<PageRequest>
        get() = recorded.toList()

    var maxObservedConcurrency: Int = 0
        private set

    fun enqueue(envelope: PageEnvelope<T, I>): ScriptedFetcher<T, I> = apply { script += { envelope } }

    fun enqueueFailure(failure: Throwable): ScriptedFetcher<T, I> = apply { script += { throw failure } }

    val fetch: suspend (PageRequest) -> PageEnvelope<T, I> = { request ->
        concurrent += 1
        maxObservedConcurrency = maxOf(maxObservedConcurrency, concurrent)
        check(concurrent == 1) { "Reentrant page fetch detected" }
        try {
            recorded += request
            val step = script.removeFirstOrNull() ?: error("Scripted fetcher script is exhausted")
            step()
        } finally {
            concurrent -= 1
        }
    }
}

private class StepClock(
    private val readings: List<Long>,
) : SdkClock {
    private var index = 0

    override fun monotonicMillis(): Long {
        val value = readings.getOrElse(index) { readings.last() }
        if (index < readings.lastIndex) index += 1
        return value
    }
}
