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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199(
    public val displayName: String,
    public val deliveryEstimate: InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a? = null,
    public val fixedAmount: InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c? = null,
    public val metadata: Map<String, String>? = null,
    public val taxBehavior: InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX46c04a60? = null,
    public val taxCode: String? = null,
    public val type: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4? = null,
) {
    public class Builder {
        private var displayNameValue: String? = null

        public var displayName: String
            get() = requireNotNull(displayNameValue) { "displayName is required" }
            set(`value`) {
                displayNameValue = value
            }

        public var deliveryEstimate:
            InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a? = null

        public var fixedAmount: InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c? =
            null

        public var metadata: Map<String, String>? = null

        public var taxBehavior: InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX46c04a60? =
            null

        public var taxCode: String? = null

        public var type: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4? =
            null

        public fun build(): InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199 {
            check(displayNameValue != null) { "displayName is required" }
            return InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199(
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
        ): InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199 must be a JSON object",
                    )
            val displayName = json.decodeRequired<String>(rawObject, "display_name")
            return InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199(
                displayName = displayName,
                deliveryEstimate =
                    rawObject["delivery_estimate"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a>(
                                it,
                            )
                    },
                fixedAmount =
                    rawObject["fixed_amount"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c>(
                                it,
                            )
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostAnyOf1TaxBehaviorX46c04a60>(
                                it,
                            )
                    },
                taxCode = rawObject["tax_code"]?.let { json.decodeFromJsonElement<String>(it) },
                type =
                    rawObject["type"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataTypeX258b19c4>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199",
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

public fun inlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199(
    block: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199.Builder.() -> Unit,
): InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199 =
    InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataX55e5a199 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
