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
 * /properties/shipping_cost/properties/shipping_rate_data/properties/delivery_estimate/properties/minimum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/delivery_estimate/properties/minimum
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e(
    public val unit: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165,
    public val `value`: Int,
) {
    public class Builder {
        private var unitValue: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165? =
            null

        public var unit: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165
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

        public fun build(): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e {
            check(unitValue != null) { "unit is required" }
            check(valueValue != null) { "value is required" }
            return InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e(
                unit = unit,
                value = value,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e must be a JSON object",
                    )
            val unit =
                json.decodeRequired<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataUnitX9dd7b165>(
                    rawObject,
                    "unit",
                )
            val value = json.decodeRequired<Int>(rawObject, "value")
            return InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e(
                unit = unit,
                value = value,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e",
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

public fun inlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e(
    block: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e =
    InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
