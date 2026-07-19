package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkSerializationException
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import com.nabobery.sdkgen.testing.assertClosedNormally
import com.nabobery.sdkgen.testing.assertClosedWith
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.coroutines.Continuation
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.cancellation.CancellationException
import kotlin.coroutines.startCoroutine
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame

class OpenRouterRuntimeE2eTest {
    @Test
    fun generatedOperationCoversPhaseOneRuntimeExitGate() {
        val successBody =
            FakeByteStream(
                listOf(
                    (
                        "{\"choices\":[],\"created\":1,\"id\":\"chat-1\",\"model\":\"test\"," +
                            "\"object\":\"chat.completion\",\"system_fingerprint\":null}"
                    ).encodeToByteArray(),
                ),
            )
        val successTransport =
            FakeTransport().enqueueResponse(
                200,
                listOf(SdkHeader("Content-Type", "application/json; charset=utf-8")),
                successBody,
            )
        val success =
            runSuspend {
                OpenRouterClient(
                    successTransport,
                    "https://openrouter.test",
                    authentication = SdkAuthentication { it },
                ).sendChatCompletionRequest(request())
            }
        assertEquals("chat-1", success.id)
        assertEquals(
            OpenRouterClient.sendChatCompletionRequestMetadata.operationId,
            successTransport.capturedRequests.single().operationId,
        )
        successBody.assertClosedNormally()

        val apiBody = FakeByteStream(listOf("{\"error\":\"denied\"}".encodeToByteArray()))
        val apiTransport = FakeTransport().enqueueResponse(400, listOf(SdkHeader("X-Request-Id", "req-1")), apiBody)
        val apiFailure =
            assertFailsWith<SdkApiException> {
                runSuspend {
                    OpenRouterClient(
                        apiTransport,
                        "https://openrouter.test",
                        authentication = SdkAuthentication { it },
                    ).sendChatCompletionRequest(request())
                }
            }
        assertEquals(400, apiFailure.statusCode)
        apiBody.assertClosedWith(apiFailure)

        val transportFailure = IllegalStateException("offline")
        val typedTransportFailure =
            assertFailsWith<SdkTransportException> {
                runSuspend {
                    OpenRouterClient(
                        FakeTransport().enqueueFailure(transportFailure),
                        "https://openrouter.test",
                        authentication = SdkAuthentication { it },
                    ).sendChatCompletionRequest(request())
                }
            }
        assertSame(transportFailure, typedTransportFailure.cause)

        val cancellation = CancellationException("cancelled")
        val cancellationBody = FakeByteStream(failure = cancellation, failAtRead = 0)
        val cancellationTransport = FakeTransport().enqueueResponse(200, body = cancellationBody)
        val propagated =
            assertFailsWith<CancellationException> {
                runSuspend {
                    OpenRouterClient(
                        cancellationTransport,
                        "https://openrouter.test",
                        authentication = SdkAuthentication { it },
                    ).sendChatCompletionRequest(request())
                }
            }
        assertSame(cancellation, propagated)
        cancellationBody.assertClosedWith(cancellation)

        val malformedBody = FakeByteStream(listOf("{".encodeToByteArray()))
        val malformedTransport = FakeTransport().enqueueResponse(200, body = malformedBody)
        val serializationFailure =
            assertFailsWith<SdkSerializationException> {
                runSuspend {
                    OpenRouterClient(
                        malformedTransport,
                        "https://openrouter.test",
                        authentication = SdkAuthentication { it },
                    ).sendChatCompletionRequest(request())
                }
            }
        malformedBody.assertClosedWith(serializationFailure)
    }

    private fun request(): ChatRequest =
        chatRequest {
            messages =
                listOf(
                    SdkJson.decodeFromJsonElement(
                        buildJsonObject {
                            put("role", "user")
                            put("content", "hello")
                        },
                    ),
                )
        }
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
