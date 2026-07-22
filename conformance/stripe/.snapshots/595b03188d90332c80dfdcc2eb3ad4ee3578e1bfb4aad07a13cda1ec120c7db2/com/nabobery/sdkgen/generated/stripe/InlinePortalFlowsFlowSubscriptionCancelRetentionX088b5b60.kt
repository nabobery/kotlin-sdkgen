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

public enum class InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60Branch {
    PortalFlowsRetention,
}

public sealed class InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60NoMatchException(
    message: String,
) : InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60DecodingException(message)

internal data class InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60Inspection(
    public val matchesPortalFlowsRetention: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPortalFlowsRetention).count { it }
}

/**
 * Specify a retention strategy to be used in the cancellation flow.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_flow_subscription_cancel/properties/retention
 */
@Serializable(with = InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60.Serializer::class)
public class InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60Inspection,
) {
    public val portalFlowsRetention: PortalFlowsRetentionView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPortalFlowsRetention) {
                json.decodeFromJsonElement<PortalFlowsRetentionView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60Branch>
        get() =
            buildSet {
                if (inspection.matchesPortalFlowsRetention) {
                    add(
                        InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60Branch.PortalFlowsRetention,
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
        ): InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60 {
            val inspection = inspectInlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60(raw)
            if (inspection.matchCount == 0) {
                throw InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60NoMatchException(
                    "InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60(
    element: JsonElement,
): InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60Inspection {
    val raw =
        element as? JsonObject ?: return InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60Inspection(
            matchesPortalFlowsRetention = false,
            failures = listOf("PortalFlowsRetention: expected JSON object"),
        )
    val matchesPortalFlowsRetention = raw["type"] != null
    return InlinePortalFlowsFlowSubscriptionCancelRetentionX088b5b60Inspection(
        matchesPortalFlowsRetention = matchesPortalFlowsRetention,
        failures =
            buildList {
                if (!matchesPortalFlowsRetention) {
                    add(
                        "PortalFlowsRetention: required properties 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
