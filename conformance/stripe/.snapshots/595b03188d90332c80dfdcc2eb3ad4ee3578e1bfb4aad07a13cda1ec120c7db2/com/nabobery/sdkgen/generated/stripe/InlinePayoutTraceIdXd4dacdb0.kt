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

public enum class InlinePayoutTraceIdXd4dacdb0Branch {
    PayoutsTraceId,
}

public sealed class InlinePayoutTraceIdXd4dacdb0DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePayoutTraceIdXd4dacdb0NoMatchException(
    message: String,
) : InlinePayoutTraceIdXd4dacdb0DecodingException(message)

internal data class InlinePayoutTraceIdXd4dacdb0Inspection(
    public val matchesPayoutsTraceId: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPayoutsTraceId).count { it }
}

/**
 * A value that generates from the beneficiary's bank that allows users to track payouts with their bank. Banks might
 * call this a "reference number" or something similar.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/trace_id
 */
@Serializable(with = InlinePayoutTraceIdXd4dacdb0.Serializer::class)
public class InlinePayoutTraceIdXd4dacdb0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePayoutTraceIdXd4dacdb0Inspection,
) {
    public val payoutsTraceId: PayoutsTraceIdView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPayoutsTraceId) json.decodeFromJsonElement<PayoutsTraceIdView>(raw) else null
        }

    public val matchedBranches: Set<InlinePayoutTraceIdXd4dacdb0Branch>
        get() =
            buildSet {
                if (inspection.matchesPayoutsTraceId) add(InlinePayoutTraceIdXd4dacdb0Branch.PayoutsTraceId)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePayoutTraceIdXd4dacdb0 {
            val inspection = inspectInlinePayoutTraceIdXd4dacdb0(raw)
            if (inspection.matchCount == 0) {
                throw InlinePayoutTraceIdXd4dacdb0NoMatchException(
                    "InlinePayoutTraceIdXd4dacdb0 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlinePayoutTraceIdXd4dacdb0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePayoutTraceIdXd4dacdb0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePayoutTraceIdXd4dacdb0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePayoutTraceIdXd4dacdb0")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePayoutTraceIdXd4dacdb0,
        ) {
            encoder.requireJsonEncoder("InlinePayoutTraceIdXd4dacdb0").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePayoutTraceIdXd4dacdb0(element: JsonElement): InlinePayoutTraceIdXd4dacdb0Inspection {
    val raw =
        element as? JsonObject ?: return InlinePayoutTraceIdXd4dacdb0Inspection(
            matchesPayoutsTraceId = false,
            failures = listOf("PayoutsTraceId: expected JSON object"),
        )
    val matchesPayoutsTraceId = raw["status"].isString()
    return InlinePayoutTraceIdXd4dacdb0Inspection(
        matchesPayoutsTraceId = matchesPayoutsTraceId,
        failures =
            buildList {
                if (!matchesPayoutsTraceId) {
                    add(
                        "PayoutsTraceId: required properties 'status' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
