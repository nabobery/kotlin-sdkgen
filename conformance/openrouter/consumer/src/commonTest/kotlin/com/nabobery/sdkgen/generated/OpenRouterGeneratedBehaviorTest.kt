package com.nabobery.sdkgen.generated

import kotlinx.serialization.SerializationException
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.put
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertNull
import kotlin.test.assertTrue

class OpenRouterGeneratedBehaviorTest {
    @Test
    fun presenceRoundTripsAbsentNullAndValue() {
        val absent = request()
        val absentDecoded = SdkJson.decodeFromString<ChatRequest>(SdkJson.encodeToString(absent))
        assertEquals(FieldPresence.Absent, absentDecoded.temperaturePresence())
        assertNull(absentDecoded.temperature)

        val explicitNull = request { temperature = null }
        val nullDecoded = SdkJson.decodeFromString<ChatRequest>(SdkJson.encodeToString(explicitNull))
        assertEquals(FieldPresence.PresentNull, nullDecoded.temperaturePresence())

        val value = request { temperature = 0.75 }
        val valueDecoded = SdkJson.decodeFromString<ChatRequest>(SdkJson.encodeToString(value))
        assertEquals(FieldPresence.PresentValue, valueDecoded.temperaturePresence())
        assertEquals(0.75, valueDecoded.temperature)

        assertFailsWith<IllegalArgumentException> { ChatRequest.Builder().sessionId = null }
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
        val detail = SdkJson.decodeFromString<ReasoningDetail>(raw)
        assertIs<ReasoningDetail.Summary>(detail)
        assertEquals("short", detail.summary)
        assertEquals(
            SdkJson.parseToJsonElement(raw),
            SdkJson.parseToJsonElement(SdkJson.encodeToString(ReasoningDetail.serializer(), detail)),
        )

        assertFailsWith<OneOfNoMatchException> {
            SdkJson.decodeFromString<ReasoningDetail>("""{"type":"reasoning.unknown","summary":"x"}""")
        }
        assertFailsWith<OneOfNoMatchException> {
            SdkJson.decodeFromString<ReasoningDetail>("""{"summary":"x"}""")
        }
    }

    @Test
    fun anyOfViewsAreLazyTypedAndRawRemainsAuthoritative() {
        val listRaw = """["stop","halt","wait","done"]"""
        val listValue = ChatStopAnyOf.fromRaw(SdkJson.parseToJsonElement(listRaw))
        assertEquals(setOf(ChatStopAnyOfBranch.StringList), listValue.matchedBranches)
        assertEquals(listOf("stop", "halt", "wait", "done"), listValue.stringList)
        assertEquals(listRaw, SdkJson.encodeToString(listValue))
        assertEquals(listValue.raw, SdkJson.decodeFromString<ChatStopAnyOf>(listRaw).raw)

        val fiveElements = buildJsonArray { repeat(5) { add(JsonPrimitive("stop-$it")) } }
        assertFailsWith<AnyOfNoMatchException> { ChatStopAnyOf.fromRaw(fiveElements) }
        assertFailsWith<AnyOfNoMatchException> { SdkJson.decodeFromString<ChatStopAnyOf>(fiveElements.toString()) }

        val stringRaw = "\"done\""
        val stringValue = SdkJson.decodeFromString<ChatStopAnyOf>(stringRaw)
        assertEquals("done", stringValue.stringValue)
        assertEquals(stringRaw, SdkJson.encodeToString(stringValue))

        val request = request { stop = ChatStopAnyOf.fromRaw(JsonPrimitive("done")) }
        val decodedRequest = SdkJson.decodeFromString<ChatRequest>(SdkJson.encodeToString(request))
        assertEquals("done", decodedRequest.stop?.stringValue)
        assertFailsWith<AnyOfNoMatchException> {
            ChatStopAnyOf.fromRaw(buildJsonObject { put("unexpected", true) })
        }
    }

    @Test
    fun stopRoundTripsAbsentNullStringAndStringList() {
        val absent = roundTrip(request())
        assertEquals(FieldPresence.Absent, absent.stopPresence())

        val explicitNull = roundTrip(request { stop = null })
        assertEquals(FieldPresence.PresentNull, explicitNull.stopPresence())
        assertNull(explicitNull.stop)

        val stringValue = roundTrip(request { stop = ChatStopAnyOf.fromRaw(JsonPrimitive("done")) })
        assertEquals("done", stringValue.stop?.stringValue)

        val listValue =
            roundTrip(
                request {
                    stop =
                        ChatStopAnyOf.fromRaw(
                            buildJsonArray {
                                add(JsonPrimitive("done"))
                                add(JsonPrimitive("halt"))
                            },
                        )
                },
            )
        assertEquals(listOf("done", "halt"), listValue.stop?.stringList)
    }

    @Test
    fun requiredMessagesAndOptionalNonNullFieldsAreEnforced() {
        assertFailsWith<SerializationException> { SdkJson.decodeFromString<ChatRequest>("{}") }
        assertFailsWith<SerializationException> {
            SdkJson.decodeFromString<ChatRequest>("""{"messages":[],"session_id":null}""")
        }
        val value =
            request {
                sessionId = "session-1"
                unsetSessionId()
            }
        assertEquals(FieldPresence.Absent, value.sessionIdPresence())
    }

    @Test
    fun duplicateObjectKeysFollowParserLastWinsPolicy() {
        val raw =
            """{"messages":[],"temperature":0.1,"temperature":null}"""
        val decoded = SdkJson.decodeFromString<ChatRequest>(raw)

        assertEquals(FieldPresence.PresentNull, decoded.temperaturePresence())
        assertNull(decoded.temperature)
    }

    @Test
    fun duplicateDiscriminatorFollowsParserLastWinsPolicy() {
        val raw =
            """{"type":"reasoning.summary","summary":"first","type":"reasoning.text"}"""
        val decoded = SdkJson.decodeFromString<ReasoningDetail>(raw)

        assertIs<ReasoningDetail.Text>(decoded)
    }

    private fun roundTrip(value: ChatRequest): ChatRequest = SdkJson.decodeFromString(SdkJson.encodeToString(value))

    private fun request(block: ChatRequest.Builder.() -> Unit = {}): ChatRequest =
        chatRequest {
            messages =
                listOf(
                    buildJsonObject {
                        put("role", "user")
                        put("content", "hello")
                    },
                )
            block()
        }
}
