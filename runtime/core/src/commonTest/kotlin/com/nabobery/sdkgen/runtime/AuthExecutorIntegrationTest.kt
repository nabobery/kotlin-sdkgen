package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.auth.Credential
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.Secret
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.resilience.RetryBudget
import kotlin.coroutines.cancellation.CancellationException
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame
import kotlin.test.assertTrue

/**
 * Covers the [SdkExecutor] <-> [SecuritySchemeAuthentication] integration seam: per-physical-attempt
 * re-evaluation of credential providers, and [CancellationException] identity passing through a suspending
 * provider. Scheme selection/application itself is covered directly against [SecuritySchemeAuthentication] in
 * `runtime/auth`; this file only exercises the executor wiring (metadata.security -> SdkRequest.security ->
 * authentication seam, once per attempt).
 */
internal class AuthExecutorIntegrationTest {
    @Test
    fun credentialProviderIsCalledOncePerPhysicalAttemptNotOncePerLogicalCall() {
        val transport = ScriptedTransport().response(503).response(200, "ok")
        var callCount = 0
        val authentication =
            SecuritySchemeAuthentication(
                mapOf(
                    "bearer" to
                        SecuritySchemeBinding(
                            SecurityScheme.HttpBearer(),
                            CredentialProvider {
                                callCount += 1
                                Credential.BearerCredential(Secret("token-$callCount"))
                            },
                        ),
                ),
                TrustedHosts.of("https://example.test"),
            )
        val metadata =
            authMetadata(
                security = listOf(SecurityRequirement(listOf(SecuritySchemeRef("bearer")))),
                retry = RetryDescriptor(retryableStatusCodes = listOf(ResponseSelector.StatusRange(500, 599))),
            )

        val result = executeWithAuth(transport, metadata, authentication)

        assertEquals("ok", result)
        assertEquals(2, transport.requests.size)
        assertEquals(2, callCount)
        assertEquals("Bearer token-1", transport.requests[0].headers.firstValue("Authorization"))
        assertEquals("Bearer token-2", transport.requests[1].headers.firstValue("Authorization"))
    }

    @Test
    fun cancellationFromCredentialProviderIsRethrownByIdentity() {
        val transport = ScriptedTransport()
        val cancellation = CancellationException("stop")
        val authentication =
            SecuritySchemeAuthentication(
                mapOf(
                    "bearer" to
                        SecuritySchemeBinding(SecurityScheme.HttpBearer(), CredentialProvider { throw cancellation }),
                ),
                TrustedHosts.of("https://example.test"),
            )
        val metadata =
            authMetadata(security = listOf(SecurityRequirement(listOf(SecuritySchemeRef("bearer")))), retry = null)

        val caught =
            assertFailsWith<CancellationException> {
                executeWithAuth(transport, metadata, authentication)
            }

        assertSame(cancellation, caught)
        assertTrue(transport.requests.isEmpty())
    }

    @Test
    fun unsatisfiableSecurityNeverReachesTransport() {
        val transport = ScriptedTransport()
        val authentication =
            SecuritySchemeAuthentication(emptyMap(), TrustedHosts.of("https://example.test"))
        val metadata =
            authMetadata(security = listOf(SecurityRequirement(listOf(SecuritySchemeRef("bearer")))), retry = null)

        assertFailsWith<SdkAuthenticationException> {
            executeWithAuth(transport, metadata, authentication)
        }

        assertTrue(transport.requests.isEmpty())
    }

    @Test
    fun credentialProviderFailureNeverReachesTransportAndIsNeverRetried() {
        val transport = ScriptedTransport()
        val authentication =
            SecuritySchemeAuthentication(
                mapOf(
                    "bearer" to
                        SecuritySchemeBinding(
                            SecurityScheme.HttpBearer(),
                            CredentialProvider { error("token store unavailable") },
                        ),
                ),
                TrustedHosts.of("https://example.test"),
            )
        val metadata =
            authMetadata(
                security = listOf(SecurityRequirement(listOf(SecuritySchemeRef("bearer")))),
                // Retry-enabled: proves a credential-provider failure is classified NOT_RETRYABLE (never retried),
                // not merely "happens not to retry because retry is off".
                retry = RetryDescriptor(retryableStatusCodes = listOf(ResponseSelector.StatusRange(500, 599))),
            )

        val failure =
            assertFailsWith<SdkAuthenticationException> {
                executeWithAuth(transport, metadata, authentication)
            }

        assertTrue(transport.requests.isEmpty())
        assertEquals(1, failure.retryHistory.size)
        assertEquals(AttemptClassification.NOT_RETRYABLE, failure.retryHistory.single().classification)
    }

    private fun executeWithAuth(
        transport: ScriptedTransport,
        metadata: OperationMetadata,
        authentication: SdkAuthentication,
    ): String {
        val codecs = MediaTypeCodecRegistry.of(AuthTestCodec)
        val time = DeterministicTime()
        return runTestSuspend {
            SdkExecutor(
                transport = transport,
                authentication = authentication,
                clock = time,
                wallClock = time,
                delayer = time,
                random = time,
                retryBudget = RetryBudget(),
            ).execute(
                request =
                    SdkExecutionRequest(
                        metadata = metadata,
                        baseUri = "https://example.test",
                        requestValue = "request",
                        requestCodecIds = listOf("json"),
                    ),
                responseCodecIds = listOf("json"),
                requestCodecs = codecs,
                responseCodecs = codecs,
            )
        }
    }

    private fun authMetadata(
        security: List<SecurityRequirement>,
        retry: RetryDescriptor?,
    ): OperationMetadata =
        OperationMetadata(
            operationId = "op",
            method = "GET",
            path = "/items",
            requestMediaTypes = listOf("application/json"),
            responseMediaTypes = listOf("application/json"),
            successStatusCodes = setOf(200),
            responseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(null, null, null),
            security = security,
            safety = OperationSafety(safe = true),
            retry = retry,
        )
}

private data object AuthTestCodec : MediaTypeCodec<String> {
    override val id: String = "json"
    override val mediaTypes: Set<String> = setOf("application/json")

    override suspend fun encode(
        value: String,
        mediaType: String,
    ): SdkRequestBody = SdkRequestBody.Bytes(value.encodeToByteArray(), mediaType)

    override suspend fun decode(
        body: SdkByteStream,
        mediaType: String?,
    ): String = body.readChunk()?.decodeToString().orEmpty()
}
