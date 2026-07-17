package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkSerializationException
import com.nabobery.sdkgen.runtime.SdkTransportException
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import com.nabobery.sdkgen.testing.assertClosedNormally
import com.nabobery.sdkgen.testing.assertClosedWith
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.jsonObject
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
        val successBody = FakeByteStream(listOf("{\"id\":\"chat-1\"}".encodeToByteArray()))
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
                ).sendChatCompletionRequest(request())
            }
        assertEquals("chat-1", success.jsonObject["id"]?.toString()?.trim('"'))
        assertEquals(OpenRouterClient.metadata.operationId, successTransport.capturedRequests.single().operationId)
        successBody.assertClosedNormally()

        val apiBody = FakeByteStream(listOf("{\"error\":\"denied\"}".encodeToByteArray()))
        val apiTransport = FakeTransport().enqueueResponse(429, listOf(SdkHeader("X-Request-Id", "req-1")), apiBody)
        val apiFailure =
            assertFailsWith<SdkApiException> {
                runSuspend {
                    OpenRouterClient(
                        apiTransport,
                        "https://openrouter.test",
                    ).sendChatCompletionRequest(request())
                }
            }
        assertEquals(429, apiFailure.statusCode)
        apiBody.assertClosedWith(apiFailure)

        val transportFailure = IllegalStateException("offline")
        val typedTransportFailure =
            assertFailsWith<SdkTransportException> {
                runSuspend {
                    OpenRouterClient(
                        FakeTransport().enqueueFailure(transportFailure),
                        "https://openrouter.test",
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
                    OpenRouterClient(cancellationTransport, "https://openrouter.test")
                        .sendChatCompletionRequest(request())
                }
            }
        assertSame(cancellation, propagated)
        cancellationBody.assertClosedWith(cancellation)

        val malformedBody = FakeByteStream(listOf("{".encodeToByteArray()))
        val malformedTransport = FakeTransport().enqueueResponse(200, body = malformedBody)
        val serializationFailure =
            assertFailsWith<SdkSerializationException> {
                runSuspend {
                    OpenRouterClient(malformedTransport, "https://openrouter.test")
                        .sendChatCompletionRequest(request())
                }
            }
        malformedBody.assertClosedWith(serializationFailure)
    }

    private fun request(): ChatRequest =
        chatRequest {
            messages =
                listOf(
                    buildJsonObject {
                        put("role", "user")
                        put("content", "hello")
                    },
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
