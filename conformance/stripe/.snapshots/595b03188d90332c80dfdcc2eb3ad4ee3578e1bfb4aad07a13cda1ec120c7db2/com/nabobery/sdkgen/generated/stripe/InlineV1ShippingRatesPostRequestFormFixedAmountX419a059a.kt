package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Describes a fixed amount to charge for shipping. Must be present if type is `fixed_amount`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates~1{shipping_rate_token}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fixed_amount
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a.Serializer::class)
public class InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a(
    public val currencyOptions:
        Map<String, InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19>? = null,
) {
    public class Builder {
        public var currencyOptions:
            Map<String, InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19>? = null

        public fun build(): InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a =
            InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a(
                currencyOptions = currencyOptions,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a must be a JSON object",
                    )
            return InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a(
                currencyOptions =
                    rawObject["currency_options"]?.let {
                        json
                            .decodeFromJsonElement<Map<String, InlineV1ShippingRatesPostRequestFormFixedAmountAdditionalValueXed08bb19>>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1ShippingRatesPostRequestFormFixedAmountX419a059a(
    block: InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a.Builder.() -> Unit,
): InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a =
    InlineV1ShippingRatesPostRequestFormFixedAmountX419a059a.build(block)
