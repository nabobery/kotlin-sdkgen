package com.nabobery.sdkgen.generated

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class ChatStopAnyOfBranch {
    StringValue,
    StringList,
}

public class AnyOfNoMatchException(
    message: String,
) : SerializationException(message)

internal data class ChatStopAnyOfInspection(
    public val matchesStringValue: Boolean,
    public val matchesStringList: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesStringValue, matchesStringList).count { it }
}

/**
 * Raw-preserving views for the OpenRouter ChatRequest.stop anyOf value.
 */
@Serializable(with = ChatStopAnyOf.Serializer::class)
public class ChatStopAnyOf internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: ChatStopAnyOfInspection,
) {
    public val stringValue: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesStringValue) json.decodeFromJsonElement<String>(raw) else null }

    public val stringList: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesStringList) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val matchedBranches: Set<ChatStopAnyOfBranch>
        get() =
            buildSet {
                if (inspection.matchesStringValue) add(ChatStopAnyOfBranch.StringValue)
                if (inspection.matchesStringList) add(ChatStopAnyOfBranch.StringList)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): ChatStopAnyOf {
            val inspection = inspectChatStopAnyOf(raw)
            if (inspection.matchCount == 0) {
                throw AnyOfNoMatchException(
                    "ChatStopAnyOf matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return ChatStopAnyOf(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<ChatStopAnyOf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): ChatStopAnyOf {
            val jsonDecoder = decoder.requireJsonDecoder("ChatStopAnyOf")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: ChatStopAnyOf,
        ) {
            encoder.requireJsonEncoder("ChatStopAnyOf").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectChatStopAnyOf(element: JsonElement): ChatStopAnyOfInspection {
    val matchesStringValue = element is JsonPrimitive && element.isString
    val matchesStringList =
        element is JsonArray && element.all { it is JsonPrimitive && it.isString } && element.size <= 4
    return ChatStopAnyOfInspection(
        matchesStringValue = matchesStringValue,
        matchesStringList = matchesStringList,
        failures =
            buildList {
                if (!matchesStringValue) add("StringValue: value does not match String")
                if (!matchesStringList) add("StringList: value does not match List")
            },
    )
}
