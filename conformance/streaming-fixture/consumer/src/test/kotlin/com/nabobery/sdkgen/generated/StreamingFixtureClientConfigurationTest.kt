package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.chat.ChatClient
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.PolicyOverride
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkClientConfig
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkRequestHook
import com.nabobery.sdkgen.runtime.TransportCapabilities
import com.nabobery.sdkgen.runtime.auth.Credential
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.Secret
import com.nabobery.sdkgen.runtime.middleware.AttemptCallContext
import com.nabobery.sdkgen.runtime.middleware.AttemptMiddleware
import com.nabobery.sdkgen.runtime.middleware.AttemptResult
import com.nabobery.sdkgen.runtime.middleware.LogicalCallContext
import com.nabobery.sdkgen.runtime.middleware.LogicalMiddleware
import com.nabobery.sdkgen.runtime.middleware.LogicalOutcome
import com.nabobery.sdkgen.runtime.observation.AttemptOutcomeSignal
import com.nabobery.sdkgen.runtime.observation.SdkLifecycleObserver
import com.nabobery.sdkgen.runtime.observation.SdkOutcomeKind
import com.nabobery.sdkgen.runtime.resilience.RetryBudget
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * Proves the 0.4.0 client-configuration contract through the real generated [ChatClient] rather than through the
 * runtime alone: a direct generated call — with no wrapper-supplied `options` — receives the client's retry,
 * deadline, hook, middleware, observer, budget, and product-token decisions, and per-call [CallOptions] keep final
 * precedence exactly as documented on [SdkClientConfig].
 *
 * The fixture's generated metadata carries `maxAttempts = 3`, so every retry assertion below pins a count that
 * differs from that default; a test that merely observed "some retry" could pass against 0.3.0 behavior.
 */
class StreamingFixtureClientConfigurationTest {
    private val request = ChatRequest(model = "m", prompt = "p")

    @Test
    fun clientRetryReplaceGovernsADirectGeneratedCall() =
        runTest {
            val transport = failingThen(failures = 1)
            val client =
                client(transport, SdkClientConfig(retry = PolicyOverride.Replace(RetryDescriptor(maxAttempts = 2))))

            val result = client.sendChatCompletion(request)

            assertEquals("c1", result.id)
            assertEquals(2, transport.capturedRequests.size)
        }

    @Test
    fun clientRetryReplaceBoundsAttemptsBelowTheGeneratedDefault() =
        runTest {
            val transport = failingThen(failures = 2)
            val client =
                client(transport, SdkClientConfig(retry = PolicyOverride.Replace(RetryDescriptor(maxAttempts = 2))))

            assertFailsWith<ChatClient.SendChatCompletionApiException> { client.sendChatCompletion(request) }

            assertEquals(2, transport.capturedRequests.size)
        }

    @Test
    fun clientRetryDisabledSuppressesTheGeneratedDefault() =
        runTest {
            val transport = failingThen(failures = 1)
            val client = client(transport, SdkClientConfig(retry = PolicyOverride.Disabled))

            assertFailsWith<ChatClient.SendChatCompletionApiException> { client.sendChatCompletion(request) }

            assertEquals(1, transport.capturedRequests.size)
        }

    @Test
    fun perCallDisabledWinsOverClientReplace() =
        runTest {
            val transport = failingThen(failures = 1)
            val client =
                client(transport, SdkClientConfig(retry = PolicyOverride.Replace(RetryDescriptor(maxAttempts = 3))))

            assertFailsWith<ChatClient.SendChatCompletionApiException> {
                client.sendChatCompletion(request, CallOptions(retry = PolicyOverride.Disabled))
            }

            assertEquals(1, transport.capturedRequests.size)
        }

    @Test
    fun perCallReplaceWinsOverClientReplace() =
        runTest {
            val transport = failingThen(failures = 2)
            val client =
                client(transport, SdkClientConfig(retry = PolicyOverride.Replace(RetryDescriptor(maxAttempts = 3))))

            assertFailsWith<ChatClient.SendChatCompletionApiException> {
                client.sendChatCompletion(
                    request,
                    CallOptions(retry = PolicyOverride.Replace(RetryDescriptor(maxAttempts = 2))),
                )
            }

            assertEquals(2, transport.capturedRequests.size)
        }

    @Test
    fun clientDeadlinesReachTheTransportAndPerCallDeadlinesReplaceThem() =
        runTest {
            val clientDeadlines = SdkDeadlines(30_000, 10_000, null)
            val callDeadlines = SdkDeadlines(5_000, 5_000, null)
            val transport = failingThen(failures = 0).enqueueSuccess()
            val client = client(transport, SdkClientConfig(deadlines = clientDeadlines))

            client.sendChatCompletion(request)
            client.sendChatCompletion(request, CallOptions(deadlines = callDeadlines))

            assertEquals(clientDeadlines, transport.capturedRequests[0].deadlines)
            assertEquals(callDeadlines, transport.capturedRequests[1].deadlines)
        }

    @Test
    fun hooksMiddlewareAndObserversRunInPipelineOrderWithClientLayerOutermost() =
        runTest {
            val trace = mutableListOf<String>()
            val transport = failingThen(failures = 0)
            val config =
                SdkClientConfig(
                    requestHook =
                        SdkRequestHook {
                            trace += "client-hook"
                            it
                        },
                    logicalMiddleware = listOf(TracingLogical("client-logical", trace)),
                    attemptMiddleware = listOf(TracingAttempt("client-attempt", trace)),
                    observers = listOf(TracingObserver("client-observer", trace)),
                )
            val options =
                CallOptions(
                    requestHook =
                        SdkRequestHook {
                            trace += "call-hook"
                            it
                        },
                    logicalMiddleware = listOf(TracingLogical("call-logical", trace)),
                    attemptMiddleware = listOf(TracingAttempt("call-attempt", trace)),
                    observers = listOf(TracingObserver("call-observer", trace)),
                )

            client(transport, config).sendChatCompletion(request, options)

            assertEquals(
                listOf(
                    "client-observer:callStarted",
                    "call-observer:callStarted",
                    "client-hook",
                    "call-hook",
                    "client-logical:enter",
                    "call-logical:enter",
                    "client-observer:attemptStarted",
                    "call-observer:attemptStarted",
                    "client-attempt:enter",
                    "call-attempt:enter",
                    "call-attempt:exit",
                    "client-attempt:exit",
                    "client-observer:attemptCompleted",
                    "call-observer:attemptCompleted",
                    "call-logical:exit",
                    "client-logical:exit",
                    "client-observer:callCompleted",
                    "call-observer:callCompleted",
                ),
                trace,
            )
        }

    @Test
    fun oneRetryBudgetIsSharedByEveryClientBuiltFromTheSameConfiguration() =
        runTest {
            val budget = RetryBudget(capacity = 1)
            val config =
                SdkClientConfig(retry = PolicyOverride.Replace(RetryDescriptor(maxAttempts = 2)), retryBudget = budget)
            val first = failingThen(failures = 2)
            val second = failingThen(failures = 1)

            // The first client's retry consumes the only token and then fails, so nothing restores it.
            assertFailsWith<ChatClient.SendChatCompletionApiException> {
                client(
                    first,
                    config,
                ).sendChatCompletion(request)
            }
            assertEquals(2, first.capturedRequests.size)

            // A second client sharing the configuration finds the budget exhausted and does not retry.
            assertFailsWith<ChatClient.SendChatCompletionApiException> {
                client(
                    second,
                    config,
                ).sendChatCompletion(request)
            }
            assertEquals(1, second.capturedRequests.size)
        }

    @Test
    fun productTokenOverridesTheGeneratedFallbackUserAgent() =
        runTest {
            // `User-Agent` is only stamped when the transport reports it can set the header (FR-END-024).
            val transport =
                failingThen(failures = 0, capabilities = TransportCapabilities(canSetUserAgent = true))

            client(transport, SdkClientConfig(productToken = "acme-sdk/1.2.3")).sendChatCompletion(request)

            assertEquals(
                "acme-sdk/1.2.3",
                transport.capturedRequests
                    .single()
                    .headers
                    .single { it.name == "User-Agent" }
                    .value,
            )
        }

    @Test
    fun configuredConstructorKeepsCredentialResolutionPerAttempt() =
        runTest {
            val transport = failingThen(failures = 1)
            val client =
                client(transport, SdkClientConfig(retry = PolicyOverride.Replace(RetryDescriptor(maxAttempts = 2))))

            client.sendChatCompletion(request)

            transport.capturedRequests.forEach { captured ->
                assertTrue(
                    captured.headers.any { it.name == "Authorization" && it.value == "test-key" },
                    captured.toString(),
                )
            }
        }

    private fun client(
        transport: FakeTransport,
        config: SdkClientConfig,
    ): ChatClient =
        ChatClient(
            transport,
            "https://api.streaming-fixture.test",
            config,
            credentialProviders =
                mapOf("apiKey" to CredentialProvider { Credential.ApiKeyCredential(Secret("test-key")) }),
        )

    /** A transport that answers [failures] retryable `500` responses and then one success. */
    private fun failingThen(
        failures: Int,
        capabilities: TransportCapabilities = TransportCapabilities(),
    ): FakeTransport {
        val transport = FakeTransport(capabilities)
        repeat(failures) {
            transport.enqueueResponse(
                500,
                headers = listOf(SdkHeader("Content-Type", "application/json")),
                body = FakeByteStream(listOf("""{"message":"boom"}""".encodeToByteArray())),
            )
        }
        return transport.enqueueSuccess()
    }

    private fun FakeTransport.enqueueSuccess(): FakeTransport =
        enqueueResponse(
            200,
            headers = listOf(SdkHeader("Content-Type", "application/json")),
            body = FakeByteStream(listOf("""{"id":"c1","content":"hi"}""".encodeToByteArray())),
        )

    private class TracingLogical(
        private val name: String,
        private val trace: MutableList<String>,
    ) : LogicalMiddleware {
        override suspend fun <T> intercept(
            call: LogicalCallContext,
            proceed: suspend (LogicalCallContext) -> LogicalOutcome<T>,
        ): LogicalOutcome<T> {
            trace += "$name:enter"
            return proceed(call).also { trace += "$name:exit" }
        }
    }

    private class TracingAttempt(
        private val name: String,
        private val trace: MutableList<String>,
    ) : AttemptMiddleware {
        override suspend fun intercept(
            call: AttemptCallContext,
            proceed: suspend (AttemptCallContext) -> AttemptResult,
        ): AttemptResult {
            trace += "$name:enter"
            return proceed(call).also { trace += "$name:exit" }
        }
    }

    private class TracingObserver(
        private val name: String,
        private val trace: MutableList<String>,
    ) : SdkLifecycleObserver {
        override fun callStarted(
            callId: String,
            operationId: String,
            method: String,
            normalizedRoute: String,
        ) {
            trace += "$name:callStarted"
        }

        override fun attemptStarted(
            callId: String,
            attemptNumber: Int,
        ) {
            trace += "$name:attemptStarted"
        }

        override fun attemptCompleted(
            callId: String,
            attemptNumber: Int,
            outcome: AttemptOutcomeSignal,
            durationMillis: Long,
        ) {
            trace += "$name:attemptCompleted"
        }

        override fun callCompleted(
            callId: String,
            outcome: SdkOutcomeKind,
            totalAttempts: Int,
            durationMillis: Long,
        ) {
            trace += "$name:callCompleted"
        }
    }
}
