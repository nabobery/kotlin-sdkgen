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

public enum class InlinePaymentMethodDetailsMobilepayCardX8e756108Branch {
    InternalCard,
}

public sealed class InlinePaymentMethodDetailsMobilepayCardX8e756108DecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsMobilepayCardX8e756108NoMatchException(
    message: String,
) : InlinePaymentMethodDetailsMobilepayCardX8e756108DecodingException(message)

internal data class InlinePaymentMethodDetailsMobilepayCardX8e756108Inspection(
    public val matchesInternalCard: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInternalCard).count { it }
}

/**
 * Internal card details
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_mobilepay/properties/card
 */
@Serializable(with = InlinePaymentMethodDetailsMobilepayCardX8e756108.Serializer::class)
public class InlinePaymentMethodDetailsMobilepayCardX8e756108 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentMethodDetailsMobilepayCardX8e756108Inspection,
) {
    public val internalCard: InternalCardView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInternalCard) json.decodeFromJsonElement<InternalCardView>(raw) else null
        }

    public val matchedBranches: Set<InlinePaymentMethodDetailsMobilepayCardX8e756108Branch>
        get() =
            buildSet {
                if (inspection.matchesInternalCard) {
                    add(
                        InlinePaymentMethodDetailsMobilepayCardX8e756108Branch.InternalCard,
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
        ): InlinePaymentMethodDetailsMobilepayCardX8e756108 {
            val inspection = inspectInlinePaymentMethodDetailsMobilepayCardX8e756108(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentMethodDetailsMobilepayCardX8e756108NoMatchException(
                    "InlinePaymentMethodDetailsMobilepayCardX8e756108 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlinePaymentMethodDetailsMobilepayCardX8e756108(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentMethodDetailsMobilepayCardX8e756108> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsMobilepayCardX8e756108 {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsMobilepayCardX8e756108")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodDetailsMobilepayCardX8e756108,
        ) {
            encoder.requireJsonEncoder("InlinePaymentMethodDetailsMobilepayCardX8e756108").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentMethodDetailsMobilepayCardX8e756108(
    element: JsonElement,
): InlinePaymentMethodDetailsMobilepayCardX8e756108Inspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentMethodDetailsMobilepayCardX8e756108Inspection(
            matchesInternalCard = false,
            failures = listOf("InternalCard: expected JSON object"),
        )
    val matchesInternalCard = true
    return InlinePaymentMethodDetailsMobilepayCardX8e756108Inspection(
        matchesInternalCard = matchesInternalCard,
        failures =
            buildList {
                if (!matchesInternalCard) add("InternalCard: required properties  do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
