package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class BillingCreditGrantsResourceMonetaryAmountView(
    public val currency: String,
    public val `value`: Int,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_credit_grants_resource_monetary_amount
 */
@Serializable(with = BillingCreditGrantsResourceMonetaryAmount.Serializer::class)
public class BillingCreditGrantsResourceMonetaryAmount(
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * A positive integer representing the amount.
     */
    public val `value`: Int,
) {
    public class Builder {
        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var valueValue: Int? = null

        public var `value`: Int
            get() = requireNotNull(valueValue) { "value is required" }
            set(`value`) {
                valueValue = value
            }

        public fun build(): BillingCreditGrantsResourceMonetaryAmount {
            check(currencyValue != null) { "currency is required" }
            check(valueValue != null) { "value is required" }
            return BillingCreditGrantsResourceMonetaryAmount(
                currency = currency,
                value = value,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingCreditGrantsResourceMonetaryAmount =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingCreditGrantsResourceMonetaryAmount> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingCreditGrantsResourceMonetaryAmount {
            val jsonDecoder = decoder.requireJsonDecoder("BillingCreditGrantsResourceMonetaryAmount")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingCreditGrantsResourceMonetaryAmount must be a JSON object")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val value = json.decodeRequired<Int>(rawObject, "value")
            return BillingCreditGrantsResourceMonetaryAmount(
                currency = currency,
                value = value,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingCreditGrantsResourceMonetaryAmount,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingCreditGrantsResourceMonetaryAmount")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("currency", value.currency)
                    put("value", json.encodeToJsonElement(value.value))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingCreditGrantsResourceMonetaryAmount(
    block: BillingCreditGrantsResourceMonetaryAmount.Builder.() -> Unit,
): BillingCreditGrantsResourceMonetaryAmount = BillingCreditGrantsResourceMonetaryAmount.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BillingCreditGrantsResourceMonetaryAmount is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
