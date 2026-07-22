package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineEventRequestXba251168Branch {
    NotificationEventRequest,
}

public sealed class InlineEventRequestXba251168DecodingException(
    message: String,
) : SerializationException(message)

public class InlineEventRequestXba251168NoMatchException(
    message: String,
) : InlineEventRequestXba251168DecodingException(message)

internal data class InlineEventRequestXba251168Inspection(
    public val matchesNotificationEventRequest: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesNotificationEventRequest).count { it }
}

/**
 * Information on the API request that triggers the event.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/event/properties/request
 */
@Serializable(with = InlineEventRequestXba251168.Serializer::class)
public class InlineEventRequestXba251168 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineEventRequestXba251168Inspection,
) {
    public val notificationEventRequest: NotificationEventRequestView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesNotificationEventRequest) {
                json.decodeFromJsonElement<NotificationEventRequestView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineEventRequestXba251168Branch>
        get() =
            buildSet {
                if (inspection.matchesNotificationEventRequest) {
                    add(
                        InlineEventRequestXba251168Branch.NotificationEventRequest,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineEventRequestXba251168 {
            val inspection = inspectInlineEventRequestXba251168(raw)
            if (inspection.matchCount == 0) {
                throw InlineEventRequestXba251168NoMatchException(
                    "InlineEventRequestXba251168 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineEventRequestXba251168(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineEventRequestXba251168> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineEventRequestXba251168 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineEventRequestXba251168")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineEventRequestXba251168,
        ) {
            encoder.requireJsonEncoder("InlineEventRequestXba251168").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineEventRequestXba251168(element: JsonElement): InlineEventRequestXba251168Inspection {
    val raw =
        element as? JsonObject ?: return InlineEventRequestXba251168Inspection(
            matchesNotificationEventRequest = false,
            failures = listOf("NotificationEventRequest: expected JSON object"),
        )
    val matchesNotificationEventRequest = true
    return InlineEventRequestXba251168Inspection(
        matchesNotificationEventRequest = matchesNotificationEventRequest,
        failures =
            buildList {
                if (!matchesNotificationEventRequest) {
                    add(
                        "NotificationEventRequest: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
