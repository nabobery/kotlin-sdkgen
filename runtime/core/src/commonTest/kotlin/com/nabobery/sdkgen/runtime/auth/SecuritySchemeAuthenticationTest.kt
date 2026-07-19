package com.nabobery.sdkgen.runtime.auth

import com.nabobery.sdkgen.runtime.SdkAuthenticationException
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequest
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.firstValue
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame
import kotlin.test.assertTrue

internal class SecuritySchemeAuthenticationTest {
    private val apiKeyHeader = SecurityScheme.ApiKey(SecurityScheme.ApiKeyLocation.HEADER, "X-Api-Key")
    private val apiKeyQuery = SecurityScheme.ApiKey(SecurityScheme.ApiKeyLocation.QUERY, "api_key")
    private val apiKeyCookie = SecurityScheme.ApiKey(SecurityScheme.ApiKeyLocation.COOKIE, "session")
    private val bearer = SecurityScheme.HttpBearer()
    private val basic = SecurityScheme.HttpBasic

    @Test
    fun andWithinRequirementAppliesEveryScheme() {
        val bindings =
            mapOf(
                "apiKey" to
                    SecuritySchemeBinding(
                        apiKeyHeader,
                        CredentialProvider { Credential.ApiKeyCredential(Secret("key-value")) },
                    ),
                "bearer" to
                    SecuritySchemeBinding(
                        bearer,
                        CredentialProvider { Credential.BearerCredential(Secret("token-value")) },
                    ),
            )
        val auth = SecuritySchemeAuthentication(bindings, TrustedHosts.of("https://example.test"))
        val request = requestWithSecurity(listOf(SecurityRequirement(listOf(ref("apiKey"), ref("bearer")))))

        val result = runSuspend { auth.apply(request) }

        assertEquals("key-value", result.headers.firstValue("X-Api-Key"))
        assertEquals("Bearer token-value", result.headers.firstValue("Authorization"))
    }

    @Test
    fun orAcrossRequirementsSelectsFirstRequirementWithAllProvidersConfigured() {
        val bindings =
            mapOf(
                "bearer" to
                    SecuritySchemeBinding(bearer, CredentialProvider { Credential.BearerCredential(Secret("token")) }),
            )
        val auth = SecuritySchemeAuthentication(bindings, TrustedHosts.of("https://example.test"))
        val request =
            requestWithSecurity(
                listOf(
                    SecurityRequirement(listOf(ref("unconfigured"))),
                    SecurityRequirement(listOf(ref("bearer"))),
                ),
            )

        val result = runSuspend { auth.apply(request) }

        assertEquals("Bearer token", result.headers.firstValue("Authorization"))
        assertEquals(null, result.headers.firstValue("X-Api-Key"))
    }

    @Test
    fun anonymousRequirementIsUsedWhenNoOtherRequirementIsSatisfiable() {
        val bindings = emptyMap<String, SecuritySchemeBinding>()
        val auth = SecuritySchemeAuthentication(bindings, TrustedHosts.of("https://example.test"))
        val request =
            requestWithSecurity(
                listOf(SecurityRequirement(listOf(ref("unconfigured"))), SecurityRequirement(emptyList())),
            )

        val result = runSuspend { auth.apply(request) }

        assertEquals(request, result)
    }

    @Test
    fun noSatisfiableRequirementThrowsTypedErrorListingMissingSchemeIds() {
        val bindings =
            mapOf(
                "bearer" to
                    SecuritySchemeBinding(bearer, CredentialProvider { Credential.BearerCredential(Secret("token")) }),
            )
        val auth = SecuritySchemeAuthentication(bindings, TrustedHosts.of("https://example.test"))
        val request =
            requestWithSecurity(
                listOf(SecurityRequirement(listOf(ref("apiKey"), ref("bearer")))),
            )

        val failure = assertFailsWith<SdkAuthenticationException> { runSuspend { auth.apply(request) } }

        assertTrue(failure.message!!.contains("apiKey"))
    }

    @Test
    fun apiKeyAppliedInHeaderForm() {
        val auth = authFor("apiKey" to apiKeyHeader, credential = { Credential.ApiKeyCredential(Secret("secret-1")) })
        val request = requestWithSecurity(oneScheme("apiKey"))

        val result = runSuspend { auth.apply(request) }

        assertEquals("secret-1", result.headers.firstValue("X-Api-Key"))
    }

    @Test
    fun apiKeyAppliedInQueryForm() {
        val auth = authFor("apiKey" to apiKeyQuery, credential = { Credential.ApiKeyCredential(Secret("secret 2")) })
        val request = requestWithSecurity(oneScheme("apiKey"), uri = "https://example.test/items?x=1")

        val result = runSuspend { auth.apply(request) }

        assertEquals("https://example.test/items?x=1&api_key=secret%202", result.uri)
    }

    @Test
    fun apiKeyAppliedInCookieFormPreservesUnrelatedCookiesAndRemovesCredentialPairs() {
        val auth = authFor("apiKey" to apiKeyCookie, credential = { Credential.ApiKeyCredential(Secret("sess-1")) })
        val request =
            requestWithSecurity(oneScheme("apiKey"))
                .copy(
                    headers =
                        listOf(
                            SdkHeader("cookie", "session=stale-a; locale=en"),
                            SdkHeader("COOKIE", "SESSION=stale-b; theme=dark"),
                        ),
                )

        val result = runSuspend { auth.apply(request) }

        assertEquals(1, result.headers.count { it.name.equals("Cookie", ignoreCase = true) })
        assertEquals("locale=en; theme=dark; session=sess-1", result.headers.firstValue("Cookie"))
    }

    @Test
    fun apiKeyAppliedInCookieFormMatchesEncodedNamesAndValuesCaseInsensitively() {
        val encodedScheme = SecurityScheme.ApiKey(SecurityScheme.ApiKeyLocation.COOKIE, "Api Key")
        val auth = authFor("apiKey" to encodedScheme, credential = { Credential.ApiKeyCredential(Secret("value 2")) })
        val request =
            requestWithSecurity(oneScheme("apiKey"))
                .copy(headers = listOf(SdkHeader("Cookie", "API%20KEY=stale%20value; keep=1")))

        val result = runSuspend { auth.apply(request) }

        assertEquals("keep=1; Api%20Key=value%202", result.headers.firstValue("Cookie"))
    }

    @Test
    fun queryAuthenticationPreservesFragmentAndEncodesIpv6UriComponents() {
        val auth =
            SecuritySchemeAuthentication(
                mapOf(
                    "apiKey" to
                        SecuritySchemeBinding(
                            apiKeyQuery,
                            CredentialProvider { Credential.ApiKeyCredential(Secret("secret 2")) },
                        ),
                ),
                TrustedHosts.of("https://[2001:db8::1]"),
            )
        val request = requestWithSecurity(oneScheme("apiKey"), uri = "https://[2001:db8::1]/items#section")

        val result = runSuspend { auth.apply(request) }

        assertEquals("https://[2001:db8::1]/items?api_key=secret%202#section", result.uri)
    }

    @Test
    fun queryAuthenticationPreservesExistingQueryAndEmptyFragment() {
        val auth = authFor("apiKey" to apiKeyQuery, credential = { Credential.ApiKeyCredential(Secret("secret")) })
        val request = requestWithSecurity(oneScheme("apiKey"), uri = "//[2001:db8::1]/items?x=1#")

        assertEquals(
            "//[2001:db8::1]/items?x=1&api_key=secret#",
            appendQueryParam(request.uri, "api_key", "secret"),
        )
    }

    @Test
    fun finalBearerAuthenticationReplacesAuthorizationHeadersIgnoringCase() {
        val auth = authFor("bearer" to bearer, credential = { Credential.BearerCredential(Secret("fresh")) })
        val request =
            requestWithSecurity(oneScheme("bearer"))
                .copy(
                    headers =
                        listOf(
                            SdkHeader("authorization", "Bearer stale-a"),
                            SdkHeader("AUTHORIZATION", "Bearer stale-b"),
                        ),
                )

        val result = runSuspend { auth.apply(request) }

        assertEquals(1, result.headers.count { it.name.equals("Authorization", ignoreCase = true) })
        assertEquals("Bearer fresh", result.headers.firstValue("Authorization"))
    }

    @Test
    fun finalHeaderApiKeyAuthenticationReplacesCaseVariantHeaders() {
        val auth = authFor("apiKey" to apiKeyHeader, credential = { Credential.ApiKeyCredential(Secret("fresh")) })
        val request =
            requestWithSecurity(oneScheme("apiKey"))
                .copy(
                    headers =
                        listOf(
                            SdkHeader("x-api-key", "stale-a"),
                            SdkHeader("X-API-KEY", "stale-b"),
                        ),
                )

        val result = runSuspend { auth.apply(request) }

        assertEquals(1, result.headers.count { it.name.equals("X-Api-Key", ignoreCase = true) })
        assertEquals("fresh", result.headers.firstValue("X-Api-Key"))
    }

    @Test
    fun basicAuthEncodesUsernameAndPasswordAsBase64() {
        val auth =
            authFor("basic" to basic, credential = { Credential.BasicCredential("alice", Secret("wonderland")) })
        val request = requestWithSecurity(oneScheme("basic"))

        val result = runSuspend { auth.apply(request) }

        // "alice:wonderland" base64-encoded, verified against a known-good RFC 4648 encoding.
        assertEquals("Basic YWxpY2U6d29uZGVybGFuZA==", result.headers.firstValue("Authorization"))
    }

    @Test
    fun bearerAuthUsesConfiguredSchemeToken() {
        val auth =
            authFor(
                "bearer" to SecurityScheme.HttpBearer(scheme = "Token"),
                credential = { Credential.BearerCredential(Secret("xyz")) },
            )
        val request = requestWithSecurity(oneScheme("bearer"))

        val result = runSuspend { auth.apply(request) }

        assertEquals("Token xyz", result.headers.firstValue("Authorization"))
    }

    @Test
    fun crossOriginRequestIsRefusedCredentialsAndThrows() {
        val auth = authFor("bearer" to bearer, credential = { Credential.BearerCredential(Secret("token")) })
        val request =
            requestWithSecurity(oneScheme("bearer"), uri = "https://evil.test/steal")

        val failure = assertFailsWith<SdkAuthenticationException> { runSuspend { auth.apply(request) } }

        assertTrue(failure.message!!.contains("evil.test"))
    }

    @Test
    fun anonymousRequirementPassesEvenCrossOrigin() {
        val auth =
            SecuritySchemeAuthentication(emptyMap(), TrustedHosts.of("https://example.test"))
        val request =
            requestWithSecurity(listOf(SecurityRequirement(emptyList())), uri = "https://elsewhere.test/anything")

        val result = runSuspend { auth.apply(request) }

        assertEquals(request, result)
    }

    @Test
    fun explicitlyTrustedHostReceivesCredentials() {
        val auth =
            SecuritySchemeAuthentication(
                mapOf(
                    "bearer" to
                        SecuritySchemeBinding(
                            bearer,
                            CredentialProvider { Credential.BearerCredential(Secret("token")) },
                        ),
                ),
                TrustedHosts.of("https://example.test", setOf("https://cdn.example.com")),
            )
        val request = requestWithSecurity(oneScheme("bearer"), uri = "https://cdn.example.com/asset")

        val result = runSuspend { auth.apply(request) }

        assertEquals("Bearer token", result.headers.firstValue("Authorization"))
    }

    @Test
    fun credentialTypeMismatchThrowsTypedError() {
        val auth = authFor("bearer" to bearer, credential = { Credential.ApiKeyCredential(Secret("wrong-type")) })
        val request = requestWithSecurity(oneScheme("bearer"))

        assertFailsWith<SdkAuthenticationException> { runSuspend { auth.apply(request) } }
    }

    @Test
    fun credentialProviderFailureIsWrappedAsAuthenticationExceptionWithCauseIdentityPreserved() {
        val providerFailure = IllegalStateException("token store unavailable")
        val auth =
            SecuritySchemeAuthentication(
                mapOf("bearer" to SecuritySchemeBinding(bearer, CredentialProvider { throw providerFailure })),
                TrustedHosts.of("https://example.test"),
            )
        val request = requestWithSecurity(oneScheme("bearer"))

        val failure = assertFailsWith<SdkAuthenticationException> { runSuspend { auth.apply(request) } }

        assertSame(providerFailure, failure.cause)
        assertTrue(failure.message!!.contains("bearer"))
    }

    private fun authFor(
        vararg entries: Pair<String, SecurityScheme>,
        credential: suspend () -> Credential,
    ): SecuritySchemeAuthentication {
        val bindings =
            entries.associate { (id, scheme) ->
                id to SecuritySchemeBinding(scheme, CredentialProvider { credential() })
            }
        return SecuritySchemeAuthentication(bindings, TrustedHosts.of("https://example.test"))
    }

    private fun oneScheme(schemeId: String): List<SecurityRequirement> =
        listOf(SecurityRequirement(listOf(ref(schemeId))))

    private fun ref(schemeId: String): SecuritySchemeRef = SecuritySchemeRef(schemeId)

    private fun requestWithSecurity(
        security: List<SecurityRequirement>,
        uri: String = "https://example.test/items",
    ): SdkRequest =
        SdkRequest(
            method = "GET",
            uri = uri,
            headers = emptyList(),
            body = null,
            expectedResponseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(null, null, null),
            operationId = "op",
            security = security,
        )
}

private fun <T> runSuspend(block: suspend () -> T): T {
    var outcome: Result<T>? = null
    block.startCoroutine(
        object : Continuation<T> {
            override val context = EmptyCoroutineContext

            override fun resumeWith(result: Result<T>) {
                outcome = result
            }
        },
    )
    return requireNotNull(outcome).getOrThrow()
}
