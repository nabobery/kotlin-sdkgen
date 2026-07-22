package com.nabobery.sdkgen.testing

import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.PaginationDescriptor
import com.nabobery.sdkgen.runtime.PropertyPath
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkPaginationException
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.pagination.PageEnvelope
import com.nabobery.sdkgen.runtime.pagination.PageRequest
import com.nabobery.sdkgen.runtime.pagination.PaginationEngine
import com.nabobery.sdkgen.runtime.toByteArray
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * GitHub-shaped generated-SDK proof (task T7): a `GET /repos/{owner}/{repo}/issues`-style operation whose next page
 * is sourced from the RFC 8288 `Link` response header (relative, absolute, and multiple-header forms), executed
 * through the real [SdkExecutor] + [PaginationEngine] pipeline against a [FakeTransport] — exactly the composition
 * generated code for a [PaginationDescriptor.HeaderNextUrl] operation would produce, proving `pages()`/`items()`
 * end to end (same-origin trust, cross-origin refusal, and loop detection included).
 *
 * The `headerNextUrl` pagination style is wired from `x-sdkgen-pagination` through generated code. This focused
 * fixture keeps exercising the underlying runtime composition directly, independently of generator fixture coverage.
 */
class GitHubLinkPaginationFixtureTest {
    private val baseUri = "https://api.github.test"
    private val metadata =
        OperationMetadata(
            operationId = "listIssues",
            method = "GET",
            path = "/repos/o/r/issues",
            requestMediaTypes = emptyList(),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            responseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(30_000, 30_000, null),
            responseAlternatives =
                listOf(ResponseAlternative(ResponseSelector.ExactStatus(200), listOf("application/json"))),
            safety = OperationSafety(safe = true, idempotent = true),
        )
    private val descriptor = PaginationDescriptor.HeaderNextUrl(PropertyPath("items"))

    @Test
    fun pagesFlowFollowsRelativeAbsoluteAndMultiLinkHeadersToCompletion() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers =
                            listOf(
                                SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next""""),
                            ),
                        body = FakeByteStream(listOf("issue-1,issue-2".encodeToByteArray())),
                    ).enqueueResponse(
                        200,
                        headers =
                            listOf(
                                SdkHeader("Link", """<https://cdn.github.test/things>; rel="prev""""),
                                SdkHeader("Link", """<https://api.github.test/repos/o/r/issues?page=3>; rel="next""""),
                            ),
                        body = FakeByteStream(listOf("issue-3".encodeToByteArray())),
                    ).enqueueResponse(
                        200,
                        headers = emptyList(),
                        body = FakeByteStream(listOf("issue-4".encodeToByteArray())),
                    )
            val trustedHosts = TrustedHosts.of(baseUri, setOf("https://cdn.github.test"))
            val executor = SdkExecutor(transport)
            val engine =
                PaginationEngine<String, String>(
                    descriptor,
                    trustedHosts = trustedHosts,
                    operationId = metadata.operationId,
                )

            val pages = engine.pages(fetch = { pageRequest -> fetchIssuesPage(executor, pageRequest) }).toList()

            assertEquals(listOf("issue-1,issue-2", "issue-3", "issue-4"), pages.map { it.value })
            assertEquals(
                listOf(listOf("issue-1", "issue-2"), listOf("issue-3"), listOf("issue-4")),
                pages.map { it.items },
            )
            assertEquals(listOf(true, true, false), pages.map { it.hasNext })
            assertEquals(
                listOf(
                    "https://api.github.test/repos/o/r/issues",
                    "https://api.github.test:443/repos/o/r/issues?page=2",
                    "https://api.github.test/repos/o/r/issues?page=3",
                ),
                transport.capturedRequests.map { it.uri },
            )
        }

    @Test
    fun itemsFlowFlattensAcrossPages() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next"""")),
                        body = FakeByteStream(listOf("a,b".encodeToByteArray())),
                    ).enqueueResponse(200, body = FakeByteStream(listOf("c".encodeToByteArray())))
            val executor = SdkExecutor(transport)
            val engine =
                PaginationEngine<String, String>(descriptor, trustedHosts = TrustedHosts.of(baseUri))

            val items = engine.items(fetch = { pageRequest -> fetchIssuesPage(executor, pageRequest) }).toList()

            assertEquals(listOf("a", "b", "c"), items)
        }

    @Test
    fun untrustedCrossOriginLinkTargetIsRefused() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", """<https://evil.test/steal>; rel="next"""")),
                        body = FakeByteStream(listOf("a".encodeToByteArray())),
                    )
            val executor = SdkExecutor(transport)
            val engine =
                PaginationEngine<String, String>(
                    descriptor,
                    trustedHosts = TrustedHosts.of(baseUri),
                    operationId = metadata.operationId,
                )

            val failure =
                assertFailsWith<SdkPaginationException> {
                    engine.pages(fetch = { pageRequest -> fetchIssuesPage(executor, pageRequest) }).toList()
                }

            assertTrue(requireNotNull(failure.message).contains("https://evil.test:443"))
            assertEquals(1, transport.capturedRequests.size)
        }

    @Test
    fun repeatedLinkTargetIsALoop() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next"""")),
                        body = FakeByteStream(listOf("a".encodeToByteArray())),
                    ).enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", """</repos/o/r/issues?page=2>; rel="next"""")),
                        body = FakeByteStream(listOf("b".encodeToByteArray())),
                    )
            val executor = SdkExecutor(transport)
            val engine = PaginationEngine<String, String>(descriptor, trustedHosts = TrustedHosts.of(baseUri))

            assertFailsWith<SdkPaginationException> {
                engine.pages(fetch = { pageRequest -> fetchIssuesPage(executor, pageRequest) }).toList()
            }
            Unit
        }

    /**
     * The `fetch<Op>Page` closure generated code for a [PaginationDescriptor.HeaderNextUrl] operation would produce:
     * [PageRequest.First] hits the operation's own templated path; [PageRequest.NextUrl] hits the already-resolved,
     * trust-checked absolute URL the engine computed from the previous response's `Link` header, split into an
     * origin ([SdkExecutionRequest.baseUri]) and a literal path+query template (no placeholders, so no double
     * encoding) since [SdkExecutor] always resolves a request URI from those two parts.
     */
    private suspend fun fetchIssuesPage(
        executor: SdkExecutor,
        pageRequest: PageRequest,
    ): PageEnvelope<String, String> {
        val (requestBaseUri, pathTemplate) =
            when (pageRequest) {
                PageRequest.First -> baseUri to metadata.path
                is PageRequest.NextUrl -> originAndPathOf(pageRequest.url)
                else -> error("unexpected page request for HeaderNextUrl: $pageRequest")
            }
        val requestMetadata =
            OperationMetadata(
                operationId = metadata.operationId,
                method = metadata.method,
                path = pathTemplate,
                requestMediaTypes = metadata.requestMediaTypes,
                responseMediaTypes = metadata.responseMediaTypes,
                successStatusCodes = metadata.successStatusCodes,
                responseMode = metadata.responseMode,
                deadlines = metadata.deadlines,
                responseAlternatives = metadata.responseAlternatives,
                safety = metadata.safety,
            )
        val request =
            SdkExecutionRequest(
                metadata = requestMetadata,
                baseUri = requestBaseUri,
                requestValue = Unit,
                requestCodecIds = emptyList(),
            )
        var capturedHeaders: List<SdkHeader> = emptyList()
        val decoder =
            object : SdkResponseAlternativeDecoder<String> {
                override suspend fun decode(
                    alternative: ResponseAlternative,
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                    mediaType: String?,
                ): String {
                    capturedHeaders = headers
                    return body.toByteArray(1_000_000L).decodeToString()
                }

                override suspend fun decodeUnknown(
                    statusCode: Int,
                    headers: List<SdkHeader>,
                    body: SdkByteStream,
                ): String = error("unexpected unmatched status $statusCode")
            }
        val result = executor.executeWithResponse(request, MediaTypeCodecRegistry.of(), decoder)
        val value =
            (result as? SdkResponseResult.Matched<String>)?.value
                ?: error("expected a matched success response")
        val items = if (value.isBlank()) emptyList() else value.split(',')
        return PageEnvelope(
            value = value,
            items = items,
            responseHeaders = capturedHeaders,
            requestUri = requestBaseUri.trimEnd('/') + "/" + pathTemplate.trimStart('/'),
        )
    }

    private fun originAndPathOf(url: String): Pair<String, String> {
        val schemeEnd =
            url.indexOf("://").let {
                require(it >= 0) { "expected an absolute URL: $url" }
                it + 3
            }
        val pathStart = url.indexOf('/', schemeEnd).let { if (it < 0) url.length else it }
        return url.substring(0, pathStart) to url.substring(pathStart)
    }
}
