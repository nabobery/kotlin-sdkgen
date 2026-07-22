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

public enum class InlinePaymentIntentShippingXd9b79a0aBranch {
    Shipping,
}

public sealed class InlinePaymentIntentShippingXd9b79a0aDecodingException(
    message: String,
) : SerializationException(message)

public class InlinePaymentIntentShippingXd9b79a0aNoMatchException(
    message: String,
) : InlinePaymentIntentShippingXd9b79a0aDecodingException(message)

internal data class InlinePaymentIntentShippingXd9b79a0aInspection(
    public val matchesShipping: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesShipping).count { it }
}

/**
 * Shipping information for this PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/shipping
 */
@Serializable(with = InlinePaymentIntentShippingXd9b79a0a.Serializer::class)
public class InlinePaymentIntentShippingXd9b79a0a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlinePaymentIntentShippingXd9b79a0aInspection,
) {
    public val shipping: ShippingView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesShipping) json.decodeFromJsonElement<ShippingView>(raw) else null
        }

    public val matchedBranches: Set<InlinePaymentIntentShippingXd9b79a0aBranch>
        get() =
            buildSet {
                if (inspection.matchesShipping) add(InlinePaymentIntentShippingXd9b79a0aBranch.Shipping)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlinePaymentIntentShippingXd9b79a0a {
            val inspection = inspectInlinePaymentIntentShippingXd9b79a0a(raw)
            if (inspection.matchCount == 0) {
                throw InlinePaymentIntentShippingXd9b79a0aNoMatchException(
                    "InlinePaymentIntentShippingXd9b79a0a matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlinePaymentIntentShippingXd9b79a0a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlinePaymentIntentShippingXd9b79a0a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlinePaymentIntentShippingXd9b79a0a {
            val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentShippingXd9b79a0a")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentShippingXd9b79a0a,
        ) {
            encoder.requireJsonEncoder("InlinePaymentIntentShippingXd9b79a0a").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlinePaymentIntentShippingXd9b79a0a(
    element: JsonElement,
): InlinePaymentIntentShippingXd9b79a0aInspection {
    val raw =
        element as? JsonObject ?: return InlinePaymentIntentShippingXd9b79a0aInspection(
            matchesShipping = false,
            failures = listOf("Shipping: expected JSON object"),
        )
    val matchesShipping = true
    return InlinePaymentIntentShippingXd9b79a0aInspection(
        matchesShipping = matchesShipping,
        failures =
            buildList {
                if (!matchesShipping) add("Shipping: required properties  do not match their declared types")
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
