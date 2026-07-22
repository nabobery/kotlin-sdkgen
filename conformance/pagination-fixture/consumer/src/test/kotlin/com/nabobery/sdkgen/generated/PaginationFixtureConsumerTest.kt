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
}
