package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.auth.Credential
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.Secret
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertEquals

class RequestParameterExecutorTest {
    @Test
    fun bearerHeaderReachesFakeTransport() {
        val transport = RequestParameterRecordingTransport()
        val authentication =
            SecuritySchemeAuthentication(
                bindings =
                    mapOf(
                        "bearer" to
                            SecuritySchemeBinding(
                                SecurityScheme.HttpBearer(),
                                CredentialProvider { Credential.BearerCredential(Secret("token")) },
                            ),
                    ),
                trustedHosts = TrustedHosts.of("https://example.test"),
            )

        execute(
            transport = transport,
            authentication = authentication,
            metadata = metadata(security = listOf(SecurityRequirement(listOf(SecuritySchemeRef("bearer"))))),
        )

        assertEquals("Bearer token", transport.request.headers.firstValue("Authorization"))
    }

    @Test
    fun anonymousSecurityAlternativeStillReachesTransportWithoutCredentials() {
        val transport = RequestParameterRecordingTransport()
        val authentication =
            SecuritySchemeAuthentication(
                bindings = emptyMap(),
                trustedHosts = TrustedHosts.of("https://example.test"),
            )

        execute(
            transport = transport,
            authentication = authentication,
            metadata =
                metadata(
                    security =
                        listOf(
                            SecurityRequirement(listOf(SecuritySchemeRef("bearer"))),
                            SecurityRequirement(emptyList()),
                        ),
                ),
        )

        assertEquals("https://example.test/items", transport.request.uri)
    }

    @Test
    fun pathQueryHeadersAndCookiesAreEncodedAndPreserved() {
        val transport = RequestParameterRecordingTransport()

        execute(
            transport = transport,
            metadata = metadata(path = "/files/{id}"),
            options =
                CallOptions(
                    headers =
                        listOf(
                            SdkHeader("X-Call", "caller"),
                            SdkHeader("X-Repeated", "first"),
                            SdkHeader("Cookie", "session=keep"),
                        ),
                ),
            parameters =
                listOf(
                    SdkRequestParameter(SdkParameterLocation.PATH, "id", listOf("a/b?c")),
                    SdkRequestParameter(SdkParameterLocation.QUERY, "q", listOf("x&evil=1", "two words")),
                    SdkRequestParameter(SdkParameterLocation.HEADER, "X-Repeated", listOf("second", "third")),
                    SdkRequestParameter(SdkParameterLocation.COOKIE, "theme", listOf("dark mode")),
                ),
        )

        assertEquals(
            "https://example.test/files/a%2Fb%3Fc?q=x%26evil%3D1&q=two%20words",
            transport.request.uri,
        )
        assertEquals("caller", transport.request.headers.firstValue("X-Call"))
        assertEquals(
            listOf("first", "second", "third"),
            transport.request.headers
                .filter { it.name == "X-Repeated" }
                .map(SdkHeader::value),
        )
        assertEquals("session=keep; theme=dark%20mode", transport.request.headers.firstValue("Cookie"))
    }

    @Test
    fun paginationCursorWithSpacesAndAmpersandRemainsOneEncodedValue() {
        val transport = RequestParameterRecordingTransport()

        execute(
            transport = transport,
            metadata = metadata(path = "/items"),
            parameters =
                listOf(
                    SdkRequestParameter(SdkParameterLocation.QUERY, "cursor", listOf("page 2&next")),
                ),
        )

        assertEquals("https://example.test/items?cursor=page%202%26next", transport.request.uri)
    }

    private fun execute(
        transport: RequestParameterRecordingTransport,
        metadata: OperationMetadata,
        authentication: SdkAuthentication? = null,
        options: CallOptions = CallOptions(),
        parameters: List<SdkRequestParameter> = emptyList(),
    ) {
        runSuspend {
            SdkExecutor(transport = transport, authentication = authentication).executeBodyless(
                request =
                    SdkExecutionRequest(
                        metadata = metadata,
                        baseUri = "https://example.test",
                        requestValue = Unit,
                        requestCodecIds = emptyList(),
                        parameters = parameters,
                    ),
                requestCodecs = MediaTypeCodecRegistry.of<Unit>(),
                options = options,
            )
        }
    }

    private fun metadata(
        path: String = "/items",
        security: List<SecurityRequirement> = emptyList(),
    ): OperationMetadata =
        OperationMetadata(
            operationId = "listItems",
            method = "GET",
            path = path,
            requestMediaTypes = emptyList(),
            responseMediaTypes = emptyList(),
            successStatusCodes = setOf(200),
            responseMode = SdkResponseMode.BUFFERED,
            deadlines = SdkDeadlines(null, null, null),
            security = security,
        )
}

private class RequestParameterRecordingTransport : SdkTransport {
    lateinit var request: SdkRequest

    override suspend fun execute(request: SdkRequest): SdkResponse {
        this.request = request
        return SdkResponse(200, emptyList(), RequestParameterEmptyStream)
    }
}

private data object RequestParameterEmptyStream : SdkByteStream {
    override suspend fun readChunk(maxBytes: Int): ByteArray? = null

    override fun close(cause: Throwable?) = Unit
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
