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

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/delivery_estimate/properties/maximum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/delivery_estimate/properties/maximum
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07(
    public val unit: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX0ae8b47f,
    public val `value`: Int,
) {
    public class Builder {
        private var unitValue: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX0ae8b47f? =
            null

        public var unit: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX0ae8b47f
            get() = requireNotNull(unitValue) { "unit is required" }
            set(`value`) {
                unitValue = value
            }

        private var valueValue: Int? = null

        public var `value`: Int
            get() = requireNotNull(valueValue) { "value is required" }
            set(`value`) {
                valueValue = value
            }

        public fun build(): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07 {
            check(unitValue != null) { "unit is required" }
            check(valueValue != null) { "value is required" }
            return InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07(
                unit = unit,
                value = value,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07 must be a JSON object",
                    )
            val unit =
                json.decodeRequired<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX0ae8b47f>(
                    rawObject,
                    "unit",
                )
            val value = json.decodeRequired<Int>(rawObject, "value")
            return InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07(
                unit = unit,
                value = value,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("unit", json.encodeToJsonElement(value.unit))
                    put("value", json.encodeToJsonElement(value.value))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07(
    block: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07 =
    InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
