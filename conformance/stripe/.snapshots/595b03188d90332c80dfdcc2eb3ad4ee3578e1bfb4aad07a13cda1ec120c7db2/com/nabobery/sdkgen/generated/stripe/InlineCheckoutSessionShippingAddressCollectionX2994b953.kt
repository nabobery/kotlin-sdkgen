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

public enum class InlineCheckoutSessionShippingAddressCollectionX2994b953Branch {
    PaymentPagesCheckoutSessionShippingAddressCollection,
}

public sealed class InlineCheckoutSessionShippingAddressCollectionX2994b953DecodingException(
    message: String,
) : SerializationException(message)

public class InlineCheckoutSessionShippingAddressCollectionX2994b953NoMatchException(
    message: String,
) : InlineCheckoutSessionShippingAddressCollectionX2994b953DecodingException(message)

internal data class InlineCheckoutSessionShippingAddressCollectionX2994b953Inspection(
    public val matchesPaymentPagesCheckoutSessionShippingAddressCollection: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesPaymentPagesCheckoutSessionShippingAddressCollection).count { it }
}

/**
 * When set, provides configuration for Checkout to collect a shipping address from a customer.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/shipping_address_collection
 */
@Serializable(with = InlineCheckoutSessionShippingAddressCollectionX2994b953.Serializer::class)
public class InlineCheckoutSessionShippingAddressCollectionX2994b953 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineCheckoutSessionShippingAddressCollectionX2994b953Inspection,
) {
    public val paymentPagesCheckoutSessionShippingAddressCollection:
        PaymentPagesCheckoutSessionShippingAddressCollectionView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesPaymentPagesCheckoutSessionShippingAddressCollection) {
                json
                    .decodeFromJsonElement<PaymentPagesCheckoutSessionShippingAddressCollectionView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineCheckoutSessionShippingAddressCollectionX2994b953Branch>
        get() =
            buildSet {
                if (inspection.matchesPaymentPagesCheckoutSessionShippingAddressCollection) {
                    add(
                        InlineCheckoutSessionShippingAddressCollectionX2994b953Branch.PaymentPagesCheckoutSessionShippingAddressCollection,
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
        ): InlineCheckoutSessionShippingAddressCollectionX2994b953 {
            val inspection = inspectInlineCheckoutSessionShippingAddressCollectionX2994b953(raw)
            if (inspection.matchCount == 0) {
                throw InlineCheckoutSessionShippingAddressCollectionX2994b953NoMatchException(
                    "InlineCheckoutSessionShippingAddressCollectionX2994b953 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineCheckoutSessionShippingAddressCollectionX2994b953(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineCheckoutSessionShippingAddressCollectionX2994b953> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCheckoutSessionShippingAddressCollectionX2994b953 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionShippingAddressCollectionX2994b953")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSessionShippingAddressCollectionX2994b953,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineCheckoutSessionShippingAddressCollectionX2994b953",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineCheckoutSessionShippingAddressCollectionX2994b953(
    element: JsonElement,
): InlineCheckoutSessionShippingAddressCollectionX2994b953Inspection {
    val raw =
        element as? JsonObject ?: return InlineCheckoutSessionShippingAddressCollectionX2994b953Inspection(
            matchesPaymentPagesCheckoutSessionShippingAddressCollection = false,
            failures = listOf("PaymentPagesCheckoutSessionShippingAddressCollection: expected JSON object"),
        )
    val matchesPaymentPagesCheckoutSessionShippingAddressCollection = raw["allowed_countries"] != null
    return InlineCheckoutSessionShippingAddressCollectionX2994b953Inspection(
        matchesPaymentPagesCheckoutSessionShippingAddressCollection = matchesPaymentPagesCheckoutSessionShippingAddressCollection,
        failures =
            buildList {
                if (!matchesPaymentPagesCheckoutSessionShippingAddressCollection) {
                    add(
                        "PaymentPagesCheckoutSessionShippingAddressCollection: required properties 'allowed_countries' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
