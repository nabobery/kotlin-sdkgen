package com.nabobery.sdkgen.github.consumer

import com.nabobery.sdkgen.github.generated.GitHubClient
import com.nabobery.sdkgen.github.generated.InlineRepositoryRuleCreationTypeX8824ca31
import com.nabobery.sdkgen.github.generated.InlineUserPatchRequestJsonXcc70b87c
import com.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecba
import com.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecbaNoMatchException
import com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c
import com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93cBranchValidationException
import com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93cNoMatchException
import com.nabobery.sdkgen.github.generated.RepositoryRule
import com.nabobery.sdkgen.github.generated.RepositoryRuleBranchValidationException
import com.nabobery.sdkgen.github.generated.RepositoryRuleNoMatchException
import com.nabobery.sdkgen.github.generated.RepositoryRuleset
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.gitignore.GitignoreClient
import com.nabobery.sdkgen.github.generated.migrations.MigrationsClient
import com.nabobery.sdkgen.github.generated.search.SearchClient
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.SdkAuthenticationException
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkPaginationException
import com.nabobery.sdkgen.runtime.SdkRequestBody
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.auth.Credential
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.Secret
import com.nabobery.sdkgen.runtime.firstValue
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import java.security.MessageDigest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertTrue

class GitHubConsumerConformanceTest {
    @Test
    fun searchCodeFirstPageDecodesPinnedOfficialExampleAndCapturesOneRequest() =
        runTest {
            val transport = FakeTransport().enqueueResponse(200, body = exampleBody())

            val page = authenticatedClient(transport).search.searchCode(q = "addClass in:file")

            assertEquals(7, page.value.totalCount)
            assertEquals(listOf("classes.js"), page.items.map { item -> item.name })
            assertEquals(1, transport.capturedRequests.size)
            assertEquals(
                "https://api.github.test/search/code?q=addClass%20in%3Afile",
                transport.capturedRequests.single().uri,
            )
        }

    @Test
    fun searchCodePagesFollowsRelativeThenAbsoluteSameOriginLinksWithoutPrefetch() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers =
                            listOf(
                                SdkHeader("Link", "<https://ignored.github.test/search/code?page=99>; rel=\"prev\""),
                                SdkHeader("Link", "</search/code?q=addClass&page=2>; rel=\"next\""),
                            ),
                        body = exampleBody("first.js"),
                    ).enqueueResponse(
                        200,
                        headers =
                            listOf(
                                SdkHeader(
                                    "Link",
                                    "<https://api.github.test/search/code?q=addClass&page=3>; rel=\"next\"",
                                ),
                            ),
                        body = exampleBody("second.js"),
                    ).enqueueResponse(200, body = exampleBody("third.js"))

            val pages = authenticatedClient(transport).search.searchCodePages(q = "addClass").toList()

            assertEquals(listOf("first.js", "second.js", "third.js"), pages.map { page -> page.items.single().name })
            assertEquals(
                listOf(
                    "https://api.github.test/search/code?q=addClass",
                    "https://api.github.test:443/search/code?q=addClass&page=2",
                    "https://api.github.test/search/code?q=addClass&page=3",
                ),
                transport.capturedRequests.map { request -> request.uri },
            )
            assertEquals(3, transport.capturedRequests.size)
        }

    @Test
    fun searchCodeItemsFlattensDistinguishableItemsInOrder() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", "</search/code?q=addClass&page=2>; rel=\"next\"")),
                        body = exampleBody("first.js"),
                    ).enqueueResponse(200, body = exampleBody("second.js"))

            val items = authenticatedClient(transport).search.searchCodeItems(q = "addClass").toList()

            assertEquals(listOf("first.js", "second.js"), items.map { item -> item.name })
        }

    @Test
    fun githubBearerReplacesCallerAuthorizationOnEveryPhysicalPageRequest() =
        runTest {
            val transport =
                FakeTransport()
                    .enqueueResponse(
                        200,
                        headers = listOf(SdkHeader("Link", "</search/code?q=addClass&page=2>; rel=\"next\"")),
                        body = exampleBody("first.js"),
                    ).enqueueResponse(200, body = exampleBody("second.js"))

            authenticatedClient(transport)
                .search
                .searchCodePages(
                    q = "addClass",
                    options = CallOptions(headers = listOf(SdkHeader("authorization", "Bearer stale-token"))),
                ).toList()

            transport.capturedRequests.forEach { request ->
                val authorization =
                    request.headers.filter { header ->
                        header.name.equals("Authorization", ignoreCase = true)
                    }
                assertEquals(listOf("Bearer test-token"), authorization.map { header -> header.value })
            }
        }

    @Test
    fun missingGithubBearerProviderFailsBeforeTransport() =
        runTest {
            val transport = FakeTransport()
            val client = GitHubClient(transport, BASE_URI)

            assertFailsWith<SdkAuthenticationException> {
                client.search.searchCode(q = "addClass")
            }
            assertEquals(0, transport.capturedRequests.size)
        }

    @Test
    fun crossOriginContinuationFailsBeforeSecondRequestAndCannotLeakCredentials() =
        runTest {
            val transport =
                FakeTransport().enqueueResponse(
                    200,
                    headers = listOf(SdkHeader("Link", "<https://evil.example/search/code?q=addClass>; rel=\"next\"")),
                    body = exampleBody(),
                )

            assertFailsWith<SdkPaginationException> {
                authenticatedClient(transport).search.searchCodePages(q = "addClass").toList()
            }
            assertEquals(1, transport.capturedRequests.size)
            assertEquals(
                "Bearer test-token",
                transport.capturedRequests
                    .single()
                    .headers
                    .singleAuthorization(),
            )
        }

    @Test
    fun searchCodeWithResponsePreservesTypedBasicAndValidationErrors() =
        runTest {
            val forbidden =
                FakeTransport().enqueueResponse(
                    403,
                    body = FakeByteStream(listOf("""{"message":"forbidden"}""".encodeToByteArray())),
                )
            val forbiddenResult = authenticatedClient(forbidden).search.searchCodeWithResponse(q = "addClass")
            val forbiddenMatched = assertIs<SdkResponseResult.Matched<SearchClient.SearchCodeResponse>>(forbiddenResult)
            val forbiddenError = assertIs<SearchClient.SearchCodeResponse.Http403Json>(forbiddenMatched.value)
            assertEquals("forbidden", forbiddenError.json.message)

            val invalid =
                FakeTransport().enqueueResponse(
                    422,
                    body =
                        FakeByteStream(
                            listOf(
                                """{"documentation_url":"https://docs.github.test/errors","message":"invalid","errors":[{"resource":"Search","field":"q","code":"invalid"}]}"""
                                    .encodeToByteArray(),
                            ),
                        ),
                )
            val invalidResult = authenticatedClient(invalid).search.searchCodeWithResponse(q = "addClass")
            val invalidMatched = assertIs<SdkResponseResult.Matched<SearchClient.SearchCodeResponse>>(invalidResult)
            val validationError = assertIs<SearchClient.SearchCodeResponse.Http422Json>(invalidMatched.value)
            assertEquals("invalid", validationError.json.message)
            assertEquals(1, validationError.json.errors?.size)
        }

    @Test
    fun usersPatchPreservesAbsentOptionalFieldsAndPermittedExplicitNull() =
        runTest {
            val transport = FakeTransport().enqueueResponse(304)
            val request = InlineUserPatchRequestJsonXcc70b87c.build { twitterUsername = null }

            GitHubClient(transport, BASE_URI).users.usersUpdateAuthenticatedWithResponse(request)

            val body = assertIs<SdkRequestBody.Bytes>(transport.capturedRequests.single().body)
            assertEquals("{\"twitter_username\":null}", body.bytes.decodeToString())
        }

    @Test
    fun retainedOperationsSerializePathQueryArrayHeadersAndSpecialCharacters() =
        runTest {
            val migrationTransport = FakeTransport().enqueueResponse(304)
            MigrationsClient(migrationTransport, BASE_URI).migrationsGetStatusForAuthenticatedUserWithResponse(
                migrationId = 7,
                exclude = listOf("repositories", "releases"),
                options = CallOptions(headers = listOf(SdkHeader("X-Trace", "space / ?"))),
            )
            assertEquals(
                "https://api.github.test/user/migrations/7?exclude=repositories&exclude=releases",
                migrationTransport.capturedRequests.single().uri,
            )
            assertEquals(
                "space / ?",
                migrationTransport.capturedRequests
                    .single()
                    .headers
                    .firstValue("X-Trace"),
            )

            val gitignoreTransport = FakeTransport().enqueueResponse(304)
            GitignoreClient(gitignoreTransport, BASE_URI).gitignoreGetTemplateWithResponse("C++ & Kotlin")
            assertEquals(
                "https://api.github.test/gitignore/templates/C%2B%2B%20%26%20Kotlin",
                gitignoreTransport.capturedRequests.single().uri,
            )
        }

    @Test
    fun committedManifestPinsTheExactWaiverInventoryAndRetainedCallsRemainReachable() {
        val manifestBytes = requireNotNull(javaClass.getResource("/manifest.json")).readBytes()
        val manifest = Json.parseToJsonElement(manifestBytes.decodeToString()).jsonObject
        val waiverIds =
            manifest
                .getValue("acceptedWaivers")
                .jsonArray
                .map { waiver ->
                    waiver.jsonObject
                        .getValue("id")
                        .toString()
                        .trim('"')
                }

        assertEquals(MANIFEST_SHA256, manifestBytes.sha256())
        assertEquals(139, waiverIds.size)
        assertEquals(139, waiverIds.toSet().size)
        assertTrue("github-schema-components-schemas-issue" in waiverIds)
        assertTrue("github-operation-paths-1repos-1-owner-1-repo-1pulls-1-pull-number-get" in waiverIds)
        assertTrue("search/code" == SearchClient.searchCodeMetadata.operationId)
        assertTrue("gitignore/get-template" == GitignoreClient.gitignoreGetTemplateMetadata.operationId)
    }

    @Test
    fun primitiveTimestampOneOfFactoriesValidateAndRoundTrip() {
        val timestamp =
            InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c.StringValue.of(
                "2024-01-02T03:04:05Z",
            )
        val decoded =
            SdkJson.decodeFromString<InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c>(
                SdkJson.encodeToString(
                    InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c.Serializer,
                    timestamp,
                ),
            )

        assertIs<InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c.StringValue>(decoded)
        assertEquals("2024-01-02T03:04:05Z", decoded.value)
        assertFailsWith<
            InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93cBranchValidationException,
        > {
            InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c.StringValue.of("not-a-timestamp")
        }
        assertFailsWith<InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93cNoMatchException> {
            InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c.fromRaw(JsonPrimitive(true))
        }
        assertFailsWith<InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecbaNoMatchException> {
            InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecba.fromRaw(JsonPrimitive(true))
        }
    }

    @Test
    fun repositoryRulesDecodeExactBranchesAndValidateSelectedFactories() {
        val creation = SdkJson.decodeFromString<RepositoryRule>("""{"type":"creation"}""")
        val update = SdkJson.decodeFromString<RepositoryRule>("""{"type":"update"}""")
        val ruleset =
            SdkJson.decodeFromString<RepositoryRuleset>(
                """
                {
                  "enforcement":"active",
                  "id":7,
                  "name":"protected main",
                  "source":"Repository",
                  "rules":[{"type":"creation"},{"type":"update"}]
                }
                """.trimIndent(),
            )

        assertIs<RepositoryRule.RepositoryRuleCreation>(creation)
        assertIs<RepositoryRule.RepositoryRuleUpdate>(update)
        assertEquals(2, ruleset.rules?.size)
        assertIs<RepositoryRule.RepositoryRuleCreation>(requireNotNull(ruleset.rules)[0])
        assertIs<RepositoryRule.RepositoryRuleUpdate>(requireNotNull(ruleset.rules)[1])

        val factory =
            RepositoryRule.RepositoryRuleCreation.of(
                InlineRepositoryRuleCreationTypeX8824ca31.Creation,
            )
        val roundTripped =
            SdkJson.decodeFromString<RepositoryRule>(
                SdkJson.encodeToString(RepositoryRule.Serializer, factory),
            )
        assertIs<RepositoryRule.RepositoryRuleCreation>(roundTripped)
        assertFailsWith<RepositoryRuleBranchValidationException> {
            RepositoryRule.RepositoryRuleCreation.of(
                InlineRepositoryRuleCreationTypeX8824ca31.SdkUnknown("update"),
            )
        }
        assertFailsWith<RepositoryRuleNoMatchException> {
            RepositoryRule.RepositoryRuleCreation.of(
                InlineRepositoryRuleCreationTypeX8824ca31.SdkUnknown("unknown"),
            )
        }
    }

    private fun authenticatedClient(transport: FakeTransport): GitHubClient =
        GitHubClient(
            transport = transport,
            baseUri = BASE_URI,
            credentialProviders =
                mapOf(
                    "githubBearer" to CredentialProvider { Credential.BearerCredential(Secret("test-token")) },
                ),
        )

    private fun exampleBody(name: String? = null): FakeByteStream {
        val body =
            requireNotNull(
                javaClass.getResource("/code-search-result-item-paginated.json"),
            ).readBytes().decodeToString()
        val customized = name?.let { replacement -> body.replace("classes.js", replacement) } ?: body
        return FakeByteStream(listOf(customized.encodeToByteArray()))
    }

    private fun List<SdkHeader>.singleAuthorization(): String =
        single { header -> header.name.equals("Authorization", ignoreCase = true) }.value

    private fun ByteArray.sha256(): String =
        MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }

    private companion object {
        const val BASE_URI = "https://api.github.test"
        const val MANIFEST_SHA256 = "42cfd1f296c93be7213dcf7cf59dee0ee2aca8a879220b036c1226664623893f"
    }
}
