package com.nabobery.sdkgen.generated

import kotlinx.serialization.SerializationException
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertNull
import kotlin.test.assertTrue

/**
 * Behavior coverage for the full-spec regeneration (W6-T19): presence tracking, open enums,
 * discriminated `oneOf`, and lazily-typed `anyOf` views, exercised against the actual symbols the
 * generator now emits for these OpenRouter schemas. These symbol names (and, in a couple of cases,
 * the exact branch shape) differ from the earlier curated single-operation generation because
 * full-spec naming resolution scopes generated names per schema and `ChatRequest.stop` gained a
 * third, unconstrained `anyOf` branch.
 */
class OpenRouterGeneratedBehaviorTest {
    @Test
    fun presenceRoundTripsAbsentNullAndValue() {
        val absent = byokKey()
        val absentDecoded = SdkJson.decodeFromString<ByokKey>(SdkJson.encodeToString(absent))
        assertEquals(FieldPresence.Absent, absentDecoded.namePresence())
        assertNull(absentDecoded.name)

        val explicitNull = byokKey { name = null }
        val nullDecoded = SdkJson.decodeFromString<ByokKey>(SdkJson.encodeToString(explicitNull))
        assertEquals(FieldPresence.PresentNull, nullDecoded.namePresence())

        val value = byokKey { name = "Production OpenAI Key" }
        val valueDecoded = SdkJson.decodeFromString<ByokKey>(SdkJson.encodeToString(value))
        assertEquals(FieldPresence.PresentValue, valueDecoded.namePresence())
        assertEquals("Production OpenAI Key", valueDecoded.name)

        val unset =
            byokKey {
                name = "will be unset"
                unsetName()
            }
        assertEquals(FieldPresence.Absent, unset.namePresence())
    }

    @Test
    fun unknownOpenEnumRoundTripsWithoutNormalization() {
        val unknown = SdkJson.decodeFromString<ProviderSort>("\"future-score\"")
        assertIs<ProviderSort.SdkUnknown>(unknown)
        assertEquals("future-score", unknown.value)
        assertEquals("\"future-score\"", SdkJson.encodeToString(ProviderSort.serializer(), unknown))
        assertEquals(ProviderSort.Exacto, SdkJson.decodeFromString<ProviderSort>("\"exacto\""))
    }

    @Test
    fun discriminatorOneOfIsStrictAndRetainsRawJson() {
        val raw = """{"type":"reasoning.summary","summary":"short","future":true}"""
        val detail = SdkJson.decodeFromString<ReasoningDetailUnion>(raw)
        assertIs<ReasoningDetailUnion.ReasoningDetailSummary>(detail)
        assertEquals("short", detail.summary)
        assertEquals(
            SdkJson.parseToJsonElement(raw),
            SdkJson.parseToJsonElement(SdkJson.encodeToString(ReasoningDetailUnion.Serializer, detail)),
        )

        assertFailsWith<ReasoningDetailUnionNoMatchException> {
            SdkJson.decodeFromString<ReasoningDetailUnion>("""{"type":"reasoning.unknown","summary":"x"}""")
        }
        assertFailsWith<ReasoningDetailUnionNoMatchException> {
            SdkJson.decodeFromString<ReasoningDetailUnion>("""{"summary":"x"}""")
        }
    }

    @Test
    fun duplicateDiscriminatorFollowsParserLastWinsPolicy() {
        val raw =
            """{"type":"reasoning.summary","summary":"first","type":"reasoning.text"}"""
        val decoded = SdkJson.decodeFromString<ReasoningDetailUnion>(raw)

        assertIs<ReasoningDetailUnion.ReasoningDetailText>(decoded)
    }

    @Test
    fun anyOfViewsAreLazyTypedAndRawRemainsAuthoritative() {
        val listRaw = """["stop","halt","wait","done"]"""
        val listValue = InlineComponentsSchemasChatRequestPropertiesStop.fromRaw(SdkJson.parseToJsonElement(listRaw))
        assertTrue(InlineComponentsSchemasChatRequestPropertiesStopBranch.Branch2 in listValue.matchedBranches)
        assertEquals(listOf("stop", "halt", "wait", "done"), listValue.branch2)
        assertEquals(listRaw, SdkJson.encodeToString(listValue))

        // A 5-element array no longer matches the size-bounded list branch (max 4), but the full-spec
        // schema also declares an unconstrained `JsonElement?` catch-all branch that the pre-T19
        // curated schema did not have, so it still decodes through that catch-all branch instead
        // of throwing.
        val tooMany = buildJsonArray { repeat(5) { add(JsonPrimitive("stop-$it")) } }
        val tooManyValue = InlineComponentsSchemasChatRequestPropertiesStop.fromRaw(tooMany)
        assertTrue(InlineComponentsSchemasChatRequestPropertiesStopBranch.Branch2 !in tooManyValue.matchedBranches)
        assertTrue(InlineComponentsSchemasChatRequestPropertiesStopBranch.Branch3 in tooManyValue.matchedBranches)

        val stringRaw = "\"done\""
        val stringValue = SdkJson.decodeFromString<InlineComponentsSchemasChatRequestPropertiesStop>(stringRaw)
        assertEquals("done", stringValue.branch1)
        assertEquals(stringRaw, SdkJson.encodeToString(stringValue))

        val request = request { stop = InlineComponentsSchemasChatRequestPropertiesStop.fromRaw(JsonPrimitive("done")) }
        val decodedRequest = SdkJson.decodeFromString<ChatRequest>(SdkJson.encodeToString(request))
        assertEquals("done", decodedRequest.stop?.branch1)
    }

    @Test
    fun stopRoundTripsAbsentAndStringList() {
        val absent = roundTrip(request())
        assertNull(absent.stop)

        val stringValue =
            roundTrip(
                request {
                    stop = InlineComponentsSchemasChatRequestPropertiesStop.fromRaw(JsonPrimitive("done"))
                },
            )
        assertEquals("done", stringValue.stop?.branch1)

        val listValue =
            roundTrip(
                request {
                    stop =
                        InlineComponentsSchemasChatRequestPropertiesStop.fromRaw(
                            buildJsonArray {
                                add(JsonPrimitive("done"))
                                add(JsonPrimitive("halt"))
                            },
                        )
                },
            )
        assertEquals(listOf("done", "halt"), listValue.stop?.branch2)
    }

    @Test
    fun requiredMessagesAreEnforced() {
        assertFailsWith<SerializationException> { SdkJson.decodeFromString<ChatRequest>("{}") }
    }

    @Test
    fun duplicateObjectKeysFollowParserLastWinsPolicy() {
        val raw =
            "{\"allowed_api_key_hashes\":null,\"allowed_models\":null,\"allowed_user_ids\":null," +
                "\"created_at\":\"2025-01-01T00:00:00Z\",\"disabled\":false,\"id\":\"key-1\"," +
                "\"is_fallback\":false,\"label\":\"sk-...\",\"provider\":\"openai\",\"sort_order\":0," +
                "\"workspace_id\":\"ws-1\",\"name\":\"first\",\"name\":null}"
        val decoded = SdkJson.decodeFromString<ByokKey>(raw)

        assertEquals(FieldPresence.PresentNull, decoded.namePresence())
        assertNull(decoded.name)
    }

    private fun roundTrip(value: ChatRequest): ChatRequest = SdkJson.decodeFromString(SdkJson.encodeToString(value))

    private fun userMessage(content: String): ChatMessages =
        SdkJson.decodeFromJsonElement(
            buildJsonObject {
                put("role", "user")
                put("content", content)
            },
        )

    private fun request(block: ChatRequest.Builder.() -> Unit = {}): ChatRequest =
        chatRequest {
            messages = listOf(userMessage("hello"))
            block()
        }

    private fun byokKey(block: ByokKey.Builder.() -> Unit = {}): ByokKey =
        ByokKey.build {
            allowedApiKeyHashes = null
            allowedModels = null
            allowedUserIds = null
            createdAt = "2025-01-01T00:00:00Z"
            disabled = false
            id = "key-1"
            isFallback = false
            label = "sk-...AbCd"
            provider = ByokProviderSlug.Openai
            sortOrder = 0
            workspaceId = "ws-1"
            block()
        }
}
