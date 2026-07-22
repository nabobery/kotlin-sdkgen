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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41(
    public val displayName: String,
    public val deliveryEstimate: InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7? = null,
    public val fixedAmount: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataFixedAmountX1f52611e? = null,
    public val metadata: Map<String, String>? = null,
    public val taxBehavior: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTaxBehaviorX28fff3c2? = null,
    public val taxCode: String? = null,
    public val type: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2? = null,
) {
    public class Builder {
        private var displayNameValue: String? = null

        public var displayName: String
            get() = requireNotNull(displayNameValue) { "displayName is required" }
            set(`value`) {
                displayNameValue = value
            }

        public var deliveryEstimate:
            InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7? = null

        public var fixedAmount:
            InlineV1InvoicesPostRequestFormShippingCostShippingRateDataFixedAmountX1f52611e? = null

        public var metadata: Map<String, String>? = null

        public var taxBehavior:
            InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTaxBehaviorX28fff3c2? = null

        public var taxCode: String? = null

        public var type: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2? =
            null

        public fun build(): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41 {
            check(displayNameValue != null) { "displayName is required" }
            return InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41(
                displayName = displayName,
                deliveryEstimate = deliveryEstimate,
                fixedAmount = fixedAmount,
                metadata = metadata,
                taxBehavior = taxBehavior,
                taxCode = taxCode,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41 must be a JSON object",
                    )
            val displayName = json.decodeRequired<String>(rawObject, "display_name")
            return InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41(
                displayName = displayName,
                deliveryEstimate =
                    rawObject["delivery_estimate"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7>(
                                it,
                            )
                    },
                fixedAmount =
                    rawObject["fixed_amount"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataFixedAmountX1f52611e>(
                                it,
                            )
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTaxBehaviorX28fff3c2>(
                                it,
                            )
                    },
                taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
                type =
                    rawObject["type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTypeX18bddce2>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("display_name", value.displayName)
                    value.deliveryEstimate?.let { put("delivery_estimate", json.encodeToJsonElement(it)) }
                    value.fixedAmount?.let { put("fixed_amount", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.taxCode?.let { put("tax_code", it) }
                    value.type?.let { put("type", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41(
    block: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41 =
    InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesPostRequestFormShippingCostShippingRateDataX376d3e41 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
