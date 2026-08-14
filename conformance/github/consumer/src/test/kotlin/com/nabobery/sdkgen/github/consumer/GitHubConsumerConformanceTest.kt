package com.nabobery.sdkgen.github.consumer

import io.github.nabobery.sdkgen.github.generated.GitHubClient
import io.github.nabobery.sdkgen.github.generated.InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0
import io.github.nabobery.sdkgen.github.generated.InlineRepositoryRuleCreationTypeX8824ca31
import io.github.nabobery.sdkgen.github.generated.InlineUserPatchRequestJsonXcc70b87c
import io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecba
import io.github.nabobery.sdkgen.github.generated.InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecbaNoMatchException
import io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c
import io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93cBranchValidationException
import io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93cNoMatchException
import io.github.nabobery.sdkgen.github.generated.InlineWorkflowIdParameterX9533605b
import io.github.nabobery.sdkgen.github.generated.RepositoryRule
import io.github.nabobery.sdkgen.github.generated.RepositoryRuleBranchValidationException
import io.github.nabobery.sdkgen.github.generated.RepositoryRuleNoMatchException
import io.github.nabobery.sdkgen.github.generated.RepositoryRuleset
import io.github.nabobery.sdkgen.github.generated.SdkJson
import io.github.nabobery.sdkgen.github.generated.gitignore.GitignoreClient
import io.github.nabobery.sdkgen.github.generated.migrations.MigrationsClient
import io.github.nabobery.sdkgen.github.generated.search.SearchClient
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
import com.nabobery.sdkgen.runtime.sdkPrimitiveUnionParameterValues
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonArray
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.put
import java.io.File
import java.security.MessageDigest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertTrue

class GitHubConsumerConformanceTest {
    @Test
    fun githubPaginationParityFixture() =
        parityFixture("github.pagination") {
            searchCodeFirstPageDecodesPinnedOfficialExampleAndCapturesOneRequest()
            searchCodePagesFollowsRelativeThenAbsoluteSameOriginLinksWithoutPrefetch()
            searchCodeItemsFlattensDistinguishableItemsInOrder()
            crossOriginContinuationFailsBeforeSecondRequestAndCannotLeakCredentials()
        }

    @Test
    fun githubAuthenticationParityFixture() =
        parityFixture("github.auth") {
            githubBearerReplacesCallerAuthorizationOnEveryPhysicalPageRequest()
            missingGithubBearerProviderFailsBeforeTransport()
        }

    @Test
    fun githubTypedErrorsParityFixture() =
        parityFixture("github.typed-errors") {
            searchCodeWithResponsePreservesTypedBasicAndValidationErrors()
        }

    @Test
    fun githubOptionalityParityFixture() =
        parityFixture("github.optionality") {
            usersPatchPreservesAbsentOptionalFieldsAndPermittedExplicitNull()
        }

    @Test
    fun githubUnionsParityFixture() =
        parityFixture("github.unions") {
            primitiveTimestampOneOfFactoriesValidateAndRoundTrip()
            repositoryRulesDecodeExactBranchesAndValidateSelectedFactories()
            scalarOrArrayParameterUnionsDecodeBothBranches()
            pathUnionBranchesEachRenderExactlyOnePathSegment()
        }

    @Test
    fun githubJvmCompilationParityFixture() =
        parityFixture("github.compile-jvm") {
            // This test runs only after Gradle has compiled the complete generated main source set.
            // Referencing a representative generated public type prevents an empty-source-set false positive.
            assertEquals("search/code", SearchClient.searchCodeMetadata.operationId)
        }

    @Test
    fun githubPortableSourceParityFixture() =
        parityFixture("github.source-portable") {
            val generatedRoot = File("../generated")
            val forbiddenTokens =
                listOf(
                    "import java.",
                    "import javax.",
                    "import kotlin.jvm.",
                    "javaClass",
                    "Class.forName",
                )
            val violations =
                generatedRoot
                    .walkTopDown()
                    .filter { file -> file.isFile && file.extension == "kt" }
                    .flatMap { file ->
                        file.useLines { lines ->
                            lines
                                .mapIndexedNotNull { index, line ->
                                    forbiddenTokens
                                        .firstOrNull(line::contains)
                                        ?.let { token ->
                                            "${file.relativeTo(generatedRoot).invariantSeparatorsPath}:" +
                                                "${index + 1}:$token"
                                        }
                                }.toList()
                                .asSequence()
                        }
                    }.toList()

            assertTrue(generatedRoot.isDirectory, "Generated GitHub source directory is missing")
            assertTrue(violations.isEmpty(), violations.joinToString(separator = "\n"))
        }

    private fun searchCodeFirstPageDecodesPinnedOfficialExampleAndCapturesOneRequest() =
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

    private fun searchCodePagesFollowsRelativeThenAbsoluteSameOriginLinksWithoutPrefetch() =
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

    private fun searchCodeItemsFlattensDistinguishableItemsInOrder() =
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

    private fun githubBearerReplacesCallerAuthorizationOnEveryPhysicalPageRequest() =
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

    private fun missingGithubBearerProviderFailsBeforeTransport() =
        runTest {
            val transport = FakeTransport()
            val client = GitHubClient(transport, BASE_URI)

            assertFailsWith<SdkAuthenticationException> {
                client.search.searchCode(q = "addClass")
            }
            assertEquals(0, transport.capturedRequests.size)
        }

    private fun crossOriginContinuationFailsBeforeSecondRequestAndCannotLeakCredentials() =
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

    private fun searchCodeWithResponsePreservesTypedBasicAndValidationErrors() =
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

    private fun usersPatchPreservesAbsentOptionalFieldsAndPermittedExplicitNull() =
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
    fun currentManifestPinsTheExactWaiverInventoryAndRetainedCallsRemainReachable() {
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

    /**
     * Decodes both branches of the scalar-or-array parameter unions ADR-0016 made reachable.
     *
     * These types shipped broken: the emitted array-shape predicate was `element is JsonArray && element !is
     * JsonArray || (element as JsonArray)...`, and because `&&` binds tighter than `||` the left side was
     * always false, so the unguarded cast ran for every non-array and threw `ClassCastException`. Compiling
     * the corpus did not catch it because nothing decoded these types — which is the gap this test closes.
     */
    private fun scalarOrArrayParameterUnionsDecodeBothBranches() {
        val freeFormString =
            SdkJson.decodeFromString<InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0>("\"patch\"")
        assertEquals(
            "patch",
            assertIs<InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0.StringValue>(freeFormString).value,
        )

        // The string branch is free-form: a value outside the array branch's enum must still decode. This is
        // the branch ADR-0016 declines to narrow away.
        val undocumented =
            SdkJson.decodeFromString<InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0>("\"custom-value\"")
        assertEquals(
            "custom-value",
            assertIs<InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0.StringValue>(undocumented).value,
        )

        val list =
            SdkJson.decodeFromString<InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0>("[\"patch\"]")
        assertEquals(
            listOf("patch"),
            assertIs<InlineDependabotAlertCommaSeparatedHasParameterX8a3d21d0.ListValue>(list).value.map { it.value },
        )

        // Both wire forms of a path union: "an ID or a name".
        val numericWorkflow = SdkJson.decodeFromString<InlineWorkflowIdParameterX9533605b>("42")
        assertEquals(42, assertIs<InlineWorkflowIdParameterX9533605b.IntValue>(numericWorkflow).value)
        val namedWorkflow = SdkJson.decodeFromString<InlineWorkflowIdParameterX9533605b>("\"ci.yml\"")
        assertEquals("ci.yml", assertIs<InlineWorkflowIdParameterX9533605b.StringValue>(namedWorkflow).value)

        // The scalar and single-element-array branches must project to the same wire values: that
        // indistinguishability is what makes ADR-0016's repeated-parameter projection lossless.
        assertEquals(
            sdkPrimitiveUnionParameterValues(freeFormString.raw),
            sdkPrimitiveUnionParameterValues(list.raw),
        )
    }

    /**
     * Decoding a path union proves the type exists; it does not prove the URI it produces is correct. Both
     * branches must render into the single segment `renderPathTemplate` allows, and they must render to the
     * same shape of URI — that is the whole content of "an ID or a name is not observable on the wire".
     *
     * This calls the generated operation rather than inspecting the union, because the defect class this guards
     * against — a union branch expanding to zero or many path values — compiles cleanly and only fails when the
     * request is actually built.
     */
    private fun pathUnionBranchesEachRenderExactlyOnePathSegment() =
        runTest {
            val transport = FakeTransport().enqueueResponse(204).enqueueResponse(204)
            val client = authenticatedClient(transport)

            client.actions.actionsEnableWorkflow(
                owner = "octocat",
                repo = "hello-world",
                workflowId = SdkJson.decodeFromString<InlineWorkflowIdParameterX9533605b>("42"),
            )
            client.actions.actionsEnableWorkflow(
                owner = "octocat",
                repo = "hello-world",
                workflowId = SdkJson.decodeFromString<InlineWorkflowIdParameterX9533605b>("\"ci.yml\""),
            )

            assertEquals(
                listOf(
                    "https://api.github.test/repos/octocat/hello-world/actions/workflows/42/enable",
                    "https://api.github.test/repos/octocat/hello-world/actions/workflows/ci.yml/enable",
                ),
                transport.capturedRequests.map { request -> request.uri },
            )
        }

    private fun primitiveTimestampOneOfFactoriesValidateAndRoundTrip() {
        val timestamp =
            InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c.StringValue.of(
                "2024-01-02T03:04:05Z",
            )
        val decoded =
            SdkJson.decodeFromString<InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c>(
                SdkJson.encodeToString(
                    InlineWebhookPullRequestReffb1OneOf1PullRequestBaseRepoCreatedAtX29f0f93c.serializer(),
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

    private fun repositoryRulesDecodeExactBranchesAndValidateSelectedFactories() {
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
                SdkJson.encodeToString(RepositoryRule.serializer(), factory),
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

    private inline fun parityFixture(
        fixtureId: String,
        block: () -> Unit,
    ) {
        val runId = System.getProperty(PARITY_RUN_ID_PROPERTY)
        if (runId == null) {
            block()
            return
        }
        parityEvent(runId, fixtureId, "START")
        try {
            block()
            parityEvent(runId, fixtureId, "PASS")
        } catch (failure: Throwable) {
            val failureType = failure::class.simpleName ?: "Throwable"
            parityEvent(runId, fixtureId, "FAIL", "$fixtureId failed: $failureType")
            throw failure
        }
    }

    private fun parityEvent(
        runId: String,
        fixtureId: String,
        event: String,
        error: String? = null,
    ) {
        val frame =
            buildJsonObject {
                put("fixtureId", fixtureId)
                put("event", event)
                error?.let { put("error", it) }
                put("runId", runId)
            }
        println("SDKGEN_PARITY_EVENT $frame")
        System.out.flush()
    }

    private fun ByteArray.sha256(): String =
        MessageDigest.getInstance("SHA-256").digest(this).joinToString("") { byte -> "%02x".format(byte) }

    private companion object {
        const val BASE_URI = "https://api.github.test"
        const val PARITY_RUN_ID_PROPERTY = "sdkgen.parity.runId"

        /**
         * Digest of the committed corpus manifest. Moves with any regenerated byte, so it may only be
         * updated together with a reviewed corpus change.
         *
         * Last moved by the regeneration that materialized the object oneOf discriminator predicate-correctness
         * fix from 7d40f6ec8.
         */
        const val MANIFEST_SHA256 = "c647b1a8db048b8f6bd012443ca038b50850d43aad5a614d2efd62550b45772e"
    }
}
