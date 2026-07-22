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

/**
 * Settings for the cost of shipping for this invoice.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostX8f940f66.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostX8f940f66(
    public val shippingRate: String? = null,
    public val shippingRateData: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41? = null,
) {
    public class Builder {
        public var shippingRate: String? = null

        public var shippingRateData:
            InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41? = null

        public fun build(): InlineV1InvoicesPostRequestFormShippingCostX8f940f66 =
            InlineV1InvoicesPostRequestFormShippingCostX8f940f66(
                shippingRate = shippingRate,
                shippingRateData = shippingRateData,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostX8f940f66 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostX8f940f66> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostX8f940f66 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingCostX8f940f66")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormShippingCostX8f940f66 must be a JSON object",
                    )
            return InlineV1InvoicesPostRequestFormShippingCostX8f940f66(
                shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
                shippingRateData =
                    rawObject["shipping_rate_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormShippingCostX8f940f66,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingCostX8f940f66")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.shippingRate?.let { put("shipping_rate", it) }
                    value.shippingRateData?.let { put("shipping_rate_data", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormShippingCostX8f940f66(
    block: InlineV1InvoicesPostRequestFormShippingCostX8f940f66.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormShippingCostX8f940f66 =
    InlineV1InvoicesPostRequestFormShippingCostX8f940f66.build(block)
