package com.nabobery.sdkgen.generated

import com.nabobery.sdkgen.generated.chat.ChatClient.SendChatCompletionRequestResponse
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkAuthenticationException
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.testing.FakeByteStream
import com.nabobery.sdkgen.testing.FakeTransport
import kotlinx.coroutines.test.runTest
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertTrue

class OpenRouterParityFixtureTest {
    @Test
    fun generatedRequiredAuthPreflightParityFixture() =
        parityFixture("openrouter.auth") {
            runTest {
                val transport = FakeTransport()
                val client = OpenRouterClient(transport, "https://openrouter.test")

                assertFailsWith<SdkAuthenticationException> {
                    client.chat.sendChatCompletionRequest(chatRequest())
                }
                assertTrue(transport.capturedRequests.isEmpty())
            }
        }

    @Test
    fun generatedTypedErrorParityFixture() =
        parityFixture("openrouter.typed-errors") {
            runTest {
                val body =
                    FakeByteStream(
                        listOf("""{"error":{"code":400,"message":"Invalid prompt"}}""".encodeToByteArray()),
                    )
                val headers = listOf(SdkHeader("Content-Type", "application/json"))
                val result =
                    OpenRouterClient(
                        FakeTransport().enqueueResponse(400, headers, body),
                        "https://openrouter.test",
                        authentication = SdkAuthentication { it },
                    ).chat.sendChatCompletionRequestWithResponse(chatRequest())

                val matched = assertIs<SdkResponseResult.Matched<SendChatCompletionRequestResponse>>(result)
                val typed = assertIs<SendChatCompletionRequestResponse.Http400Json>(matched.value)
                assertEquals(400, typed.statusCode)
                assertEquals(headers, typed.headers)
                assertEquals("Invalid prompt", typed.json.error.message)
                assertTrue(body.closed)
            }
        }

    @Test
    fun generatedModelContractParityFixture() =
        parityFixture("openrouter.model-contracts") {
            val additionalProperties =
                SdkJson.decodeFromString<AdvisorNestedTool>(
                    """{"type":"openrouter:web_search","display_name":null,"future":"kept"}""",
                )
            assertEquals(JsonNull, additionalProperties.additionalProperties["display_name"])
            assertEquals(JsonPrimitive("kept"), additionalProperties.additionalProperties["future"])

            val mutableProperties = linkedMapOf("future" to JsonPrimitive("original"))
            val copied = AdvisorNestedTool(type = "openrouter:web_search", additionalProperties = mutableProperties)
            mutableProperties["future"] = JsonPrimitive("mutated")
            assertEquals(JsonPrimitive("original"), copied.additionalProperties["future"])

            val unknownEnum = SdkJson.decodeFromString<ProviderSort>("\"future-score\"")
            assertIs<ProviderSort.SdkUnknown>(unknownEnum)
            assertEquals("future-score", unknownEnum.value)

            val union =
                SdkJson.decodeFromString<ReasoningDetailUnion>(
                    """{"type":"reasoning.summary","summary":"short","future":true}""",
                )
            assertIs<ReasoningDetailUnion.ReasoningDetailSummary>(union)
            assertEquals("short", union.summary)

            val stop = InlineComponentsSchemasChatRequestPropertiesStop.fromRaw(JsonPrimitive("done"))
            assertEquals("done", stop.branch1)

            val absentOptional =
                ByokKey(
                    allowedApiKeyHashes = null,
                    allowedModels = null,
                    allowedUserIds = null,
                    createdAt = "2025-01-01T00:00:00Z",
                    disabled = false,
                    id = "key-1",
                    isFallback = false,
                    label = "sk-...AbCd",
                    provider = ByokProviderSlug.Openai,
                    sortOrder = 0,
                    workspaceId = "ws-1",
                )
            assertEquals(FieldPresence.Absent, absentOptional.namePresence())
        }

    private fun chatRequest(): ChatRequest =
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
            parityEvent(runId, fixtureId, "FAIL", "$fixtureId failed: ${failure::class.simpleName ?: "Throwable"}")
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

    private companion object {
        const val PARITY_RUN_ID_PROPERTY = "sdkgen.parity.runId"
    }
}
