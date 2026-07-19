package com.nabobery.sdkgen.runtime

import com.nabobery.sdkgen.runtime.middleware.AttemptCallContext
import com.nabobery.sdkgen.runtime.middleware.LogicalCallContext
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class RedactionTest {
    @Test
    fun requestContextsAndCallOptionsDoNotExposeHeaderOrUriSecrets() {
        val headerSecret = "header-secret-value"
        val querySecret = "query-secret-value"
        val request =
            SdkRequest(
                method = "GET",
                uri = "https://example.test/items?api_key=$querySecret#fragment-secret-value",
                headers =
                    listOf(
                        SdkHeader("Authorization", headerSecret),
                        SdkHeader("Proxy-Authorization", "proxy-secret-value"),
                        SdkHeader("Cookie", "session-cookie-value"),
                        SdkHeader("X-Api-Key", "configured-api-key-value"),
                    ),
                body = null,
                expectedResponseMode = SdkResponseMode.BUFFERED,
                deadlines = SdkDeadlines(null, null, null),
                operationId = "redaction",
            )
        val rendered =
            listOf(
                SdkHeader("Authorization", headerSecret).toString(),
                request.toString(),
                CallOptions(headers = request.headers).toString(),
                LogicalCallContext(request, "redaction", "GET", "/items").toString(),
                AttemptCallContext(request, "redaction", 1, "call-1").toString(),
            )

        rendered.forEach { value ->
            assertFalse(value.contains(headerSecret), value)
            assertFalse(value.contains(querySecret), value)
            assertFalse(value.contains("fragment-secret-value"), value)
            assertFalse(value.contains("proxy-secret-value"), value)
            assertFalse(value.contains("session-cookie-value"), value)
            assertFalse(value.contains("configured-api-key-value"), value)
        }
        assertTrue(request.toString().contains("https://example.test/items"))
    }

    @Test
    fun executionRequestToStringDoesNotExposeRequestUriOrParameterSecrets() {
        val requestSecret = "request-secret-value"
        val querySecret = "query-secret-value"
        val rendered =
            SdkExecutionRequest(
                metadata =
                    OperationMetadata(
                        operationId = "redaction",
                        method = "GET",
                        path = "/items",
                        requestMediaTypes = listOf("application/json"),
                        responseMediaTypes = listOf("application/json"),
                        successStatusCodes = setOf(200),
                        responseMode = SdkResponseMode.BUFFERED,
                        deadlines = SdkDeadlines(null, null, null),
                    ),
                baseUri = "https://example.test/items?api_key=$querySecret#fragment-secret-value",
                requestValue = LeakyRequest(requestSecret),
                requestCodecIds = listOf("json"),
                parameters =
                    listOf(
                        SdkRequestParameter(SdkParameterLocation.QUERY, "api_key", listOf(querySecret)),
                    ),
            ).toString()

        assertFalse(rendered.contains(requestSecret), rendered)
        assertFalse(rendered.contains(querySecret), rendered)
        assertFalse(rendered.contains("fragment-secret-value"), rendered)
        assertTrue(rendered.contains("baseUri=https://example.test/items"), rendered)
        assertTrue(rendered.contains("requestValue=present(LeakyRequest)"), rendered)
        assertTrue(rendered.contains("valueCount=1"), rendered)
    }

    @Test
    fun diagnosticSafeHeadersRemainActionableWhileCredentialHeadersStayRedacted() {
        val safe = SdkHeader("Content-Type", "application/json").toString()
        val requestId = SdkHeader("X-Request-Id", "request-123").toString()
        val authorization = SdkHeader("Authorization", "Bearer credential-value").toString()
        val unknown = SdkHeader("X-Internal-Token", "unknown-secret").toString()

        assertTrue(safe.contains("application/json"), safe)
        assertTrue(requestId.contains("request-123"), requestId)
        assertFalse(authorization.contains("credential-value"), authorization)
        assertFalse(unknown.contains("unknown-secret"), unknown)
    }

    @Test
    fun responseDoesNotDelegateToAnArbitraryBodyToString() {
        val bodySecret = "body-secret-value"
        val response = SdkResponse(statusCode = 200, headers = emptyList(), body = LeakyStream(bodySecret))

        assertFalse(response.toString().contains(bodySecret))
        assertTrue(response.toString().contains("body=<stream>"))
    }

    private class LeakyRequest(
        private val secret: String,
    ) {
        override fun toString(): String = secret
    }

    private class LeakyStream(
        private val secret: String,
    ) : SdkByteStream {
        override suspend fun readChunk(maxBytes: Int): ByteArray? = null

        override fun close(cause: Throwable?) = Unit

        override fun toString(): String = secret
    }
}
