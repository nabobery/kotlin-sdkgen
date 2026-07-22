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
import kotlin.collections.Map

/**
 * Describes a fixed amount to charge for shipping. Must be present if type is `fixed_amount`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/fixed_amount
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011.Serializer::class)
public class InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011(
    public val amount: Int,
    public val currency: String,
    public val currencyOptions:
        Map<String, InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9>? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        public var currencyOptions:
            Map<String, InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9>? = null

        public fun build(): InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011 {
            check(amountValue != null) { "amount is required" }
            check(currencyValue != null) { "currency is required" }
            return InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011(
                amount = amount,
                currency = currency,
                currencyOptions = currencyOptions,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011 must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            return InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011(
                amount = amount,
                currency = currency,
                currencyOptions =
                    rawObject["currency_options"]?.let {
                        json
                            .decodeFromJsonElement<Map<String, InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXaa7af5f9>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("currency", value.currency)
                    value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011(
    block: InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011.Builder.() -> Unit,
): InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011 =
    InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1ShippingRatesPostRequestFormFixedAmountX0bd5d011 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
