package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.repos.ReposClient
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkPaginationException
import com.nabobery.sdkgen.runtime.auth.Credential
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.Secret
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * GitHub-shaped generated-SDK proof (task T7): a `listIssues` operation whose next page is sourced from the RFC
 * 8288 `Link` response header, exercised through the real generated [ReposClient] (produced by `cli generate`
 * against `conformance/pagination-fixture/openapi.yaml`, via the real engine/emitter pipeline) against a
 * [FakeTransport]. Covers `listIssues()` (first page only), `listIssuesPages()`/`listIssuesItems()` walking a
 * relative, then an absolute, then a multi-`Link`-header response to completion, cross-origin refusal, and loop
 * detection.
 *
 * Also the `offsetLimit` executed-path proof: `listWidgetsPages()` (a `GET /repos/widgets` offset/limit
 * operation with a declared total) covering the default walk, non-zero initial-offset seeding, short-first-page
 * and empty-page termination without extra requests, the declared-total stop, untouched non-pagination
 * parameters, and continuation offsets beyond `Int.MAX_VALUE` serialized in the Long domain — all asserted
 * against the captured wire URIs.
 */
class PaginationFixtureConsumerTest {
    private fun client(
        transport: FakeTransport,
        trustedHosts: com.nabobery.sdkgen.runtime.auth.TrustedHosts? = null,
    ): ReposClient =
        ReposClient(
            transport,
            "https://api.pagination-fixture.test",
            credentialProviders =
                mapOf("apiKey" to CredentialProvider { Credential.ApiKeyCredential(Secret("test-key")) }),
            trustedHosts = trustedHosts,
        )

    @Test
    fun listIssuesReturnsOnlyTheFirstPage() =
        runTest {
            val transport =
                FakeTransport().enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next"""")),
                    body = FakeByteStream(listOf("""{"items":[{"id":1,"title":"one"}]}""".encodeToByteArray())),
                )

            val page = client(transport).listIssues("o", "r")

            assertEquals(listOf(1L), page.items.map { it.id })
            assertTrue(page.hasNext)
            assertEquals("https://api.pagination-fixture.test:443/repos/o/r/issues?page=2", page.continuationUrl)
            assertEquals(1, transport.capturedRequests.size)
        }

    @Test
    fun listIssuesPagesFollowsRelativeThenAbsoluteThenMultiLinkHeadersToCompletion() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next"""")),
                        body =
                            FakeByteStream(
                                listOf("""{"items":[{"id":1,"title":"one"},{"id":2,"title":"two"}]}""".encodeToByteArray()),
                            ),
                    ).enqueueResponse(
                        200,
                        headers =
                            listOf(
                                SdkHeader("Link", """<https://cdn.pagination-fixture.test/x>; rel="prev""""),
                                SdkHeader(
                                    "Link",
                                    """<https://api.pagination-fixture.test/repos/o/r/issues?page=3>; rel="next"""",
                                ),
                            ),
                        body = FakeByteStream(listOf("""{"items":[{"id":3,"title":"three"}]}""".encodeToByteArray())),
                    ).enqueueResponse(
                        200,
                        headers = emptyList(),
                        body = FakeByteStream(listOf("""{"items":[{"id":4,"title":"four"}]}""".encodeToByteArray())),
                    )

            val pages = client(transport).listIssuesPages("o", "r").toList()

            assertEquals(
                listOf(listOf(1L, 2L), listOf(3L), listOf(4L)),
                pages.map { page -> page.items.map { it.id } },
            )
            assertEquals(listOf(true, true, false), pages.map { it.hasNext })
            assertEquals(
                listOf(
                    "https://api.pagination-fixture.test/repos/o/r/issues",
                    "https://api.pagination-fixture.test:443/repos/o/r/issues?page=2",
                    "https://api.pagination-fixture.test/repos/o/r/issues?page=3",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    @Test
    fun listIssuesItemsFlattensAcrossPages() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next"""")),
                        body = FakeByteStream(listOf("""{"items":[{"id":1,"title":"a"}]}""".encodeToByteArray())),
                    ).enqueueResponse(
                        200,
                        body = FakeByteStream(listOf("""{"items":[{"id":2,"title":"b"}]}""".encodeToByteArray())),
                    )

            val items = client(transport).listIssuesItems("o", "r").toList()

            assertEquals(listOf(1L, 2L), items.map { it.id })
        }

    @Test
    fun untrustedCrossOriginLinkTargetIsRefused() =
        runTest {
            val transport =
                FakeTransport().enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Link", """<https://evil.test/steal>; rel="next"""")),
                    body = FakeByteStream(listOf("""{"items":[{"id":1,"title":"a"}]}""".encodeToByteArray())),
                )

            val failure =
                assertFailsWith<SdkPaginationException> {
                    client(transport).listIssuesPages("o", "r").toList()
                }

            assertTrue(requireNotNull(failure.message).contains("https://evil.test:443"))
        }

    @Test
    fun repeatedLinkTargetIsALoop() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next"""")),
                        body = FakeByteStream(listOf("""{"items":[{"id":1,"title":"a"}]}""".encodeToByteArray())),
                    ).enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next"""")),
                        body = FakeByteStream(listOf("""{"items":[{"id":2,"title":"b"}]}""".encodeToByteArray())),
                    )

            assertFailsWith<SdkPaginationException> {
                client(transport).listIssuesPages("o", "r").toList()
            }
        }

    @Test
    fun listIssuesWithResponseSurfacesTypedNonSuccess() =
        runTest {
            val transport =
                FakeTransport().enqueueResponse(
                    401,
                    body = FakeByteStream(listOf("""{"message":"bad key"}""".encodeToByteArray())),
                )

            val result = client(transport).listIssuesWithResponse("o", "r")

            val matched = result as com.nabobery.sdkgen.runtime.SdkResponseResult.Matched<ReposClient.ListIssuesResponse>
            val error = matched.value as ReposClient.ListIssuesResponse.Http401Json
            assertEquals("bad key", error.json.message)
        }

    // --- offsetLimit pagination (listWidgets), executed end to end through the generated engine wiring ---

    private fun widgetPage(
        vararg ids: Long,
        total: Long? = null,
    ): FakeByteStream {
        val items = ids.joinToString(",") { id -> """{"id":$id,"name":"w$id"}""" }
        val body = if (total == null) """{"data":[$items]}""" else """{"data":[$items],"total":$total}"""
        return FakeByteStream(listOf(body.encodeToByteArray()))
    }

    @Test
    fun listWidgetsPagesWalksByReturnedPageSizeAndStopsOnAShortFinalPage() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(200, body = widgetPage(1, 2))
                    .enqueueResponse(200, body = widgetPage(3))

            val pages = client(transport).listWidgetsPages().toList()

            assertEquals(listOf(listOf(1L, 2L), listOf(3L)), pages.map { page -> page.items.map { it.id } })
            assertEquals(listOf(true, false), pages.map { it.hasNext })
            assertEquals(
                listOf(
                    "$WIDGETS_URI",
                    "$WIDGETS_URI?offset=2",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    @Test
    fun listWidgetsPagesSeedsANonZeroInitialOffsetAndAdvancesByPageSize() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(200, body = widgetPage(41, 42, 43, 44, 45))
                    .enqueueResponse(200, body = widgetPage(61, 62))

            val pages = client(transport).listWidgetsPages(offset = 40, limit = 5).toList()

            assertEquals(
                listOf(listOf(41L, 42L, 43L, 44L, 45L), listOf(61L, 62L)),
                pages.map { page -> page.items.map { it.id } },
            )
            // Advance by the page size actually served: offset 40 + 5 items = 45. Query parameters are
            // serialized in the generated client's deterministic (alphabetical) order.
            assertEquals(
                listOf(
                    "$WIDGETS_URI?limit=5&offset=40",
                    "$WIDGETS_URI?limit=5&offset=45",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    @Test
    fun listWidgetsPagesStopsAfterAShortFirstPageWithoutASecondRequest() =
        runTest {
            val transport = FakeTransport().enqueueResponse(200, body = widgetPage(1, 2, 3))

            val pages = client(transport).listWidgetsPages(limit = 20).toList()

            assertEquals(listOf(listOf(1L, 2L, 3L)), pages.map { page -> page.items.map { it.id } })
            assertEquals(listOf(false), pages.map { it.hasNext })
            assertEquals(1, transport.capturedRequests.size)
            assertEquals("$WIDGETS_URI?limit=20", transport.capturedRequests.single().uri)
        }

    @Test
    fun listWidgetsPagesStopsOnAnEmptyFirstPage() =
        runTest {
            val transport = FakeTransport().enqueueResponse(200, body = widgetPage(total = 100))

            val pages = client(transport).listWidgetsPages(limit = 20).toList()

            assertEquals(listOf(emptyList()), pages.map { page -> page.items.map { it.id } })
            assertEquals(listOf("$WIDGETS_URI?limit=20"), transport.capturedRequests.map { it.uri })
        }

    @Test
    fun listWidgetsPagesStopsExactlyAtTheDeclaredTotalWithoutAnExtraProbe() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(200, body = widgetPage(1, 2, total = 4))
                    .enqueueResponse(200, body = widgetPage(3, 4, total = 4))

            val pages = client(transport).listWidgetsPages(limit = 2).toList()

            assertEquals(listOf(listOf(1L, 2L), listOf(3L, 4L)), pages.map { page -> page.items.map { it.id } })
            assertEquals(listOf(true, false), pages.map { it.hasNext })
            assertEquals(
                listOf(
                    "$WIDGETS_URI?limit=2",
                    "$WIDGETS_URI?limit=2&offset=2",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    @Test
    fun listWidgetsPagesLeavesNonPaginationParametersUntouchedOnEveryRequest() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(200, body = widgetPage(41, 42, 43, 44, 45))
                    .enqueueResponse(200, body = widgetPage(61))

            val pages = client(transport).listWidgetsPages(offset = 40, limit = 5, kind = "gadgets").toList()

            assertEquals(2, pages.size)
            assertEquals(
                listOf(
                    "$WIDGETS_URI?kind=gadgets&limit=5&offset=40",
                    "$WIDGETS_URI?kind=gadgets&limit=5&offset=45",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    @Test
    fun listWidgetsPagesSerializesAContinuationOffsetBeyondIntMaxAsAPositiveLong() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(200, body = widgetPage(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
                    .enqueueResponse(200, body = widgetPage(11))

            val pages =
                client(transport)
                    .listWidgetsPages(offset = 2_147_483_640, limit = 10)
                    .toList()

            assertEquals(2, pages.size)
            // 2_147_483_640 + 10 = 2_147_483_650, above Int.MAX_VALUE (2_147_483_647): must not wrap negative.
            assertEquals(
                listOf(
                    "$WIDGETS_URI?limit=10&offset=2147483640",
                    "$WIDGETS_URI?limit=10&offset=2147483650",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    private companion object {
        const val WIDGETS_URI: String = "https://api.pagination-fixture.test/repos/widgets"
    }
}
