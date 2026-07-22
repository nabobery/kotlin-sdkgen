package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

@Serializable
public data class BillingBillResourceInvoicingPricingPricingView(
    @SerialName("price_details")
    public val priceDetails: BillingBillResourceInvoicingPricingPricingPriceDetails? = null,
    public val type: InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2,
    @SerialName("unit_amount_decimal")
    public val unitAmountDecimal: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_pricing_pricing
 */
@Serializable(with = BillingBillResourceInvoicingPricingPricing.Serializer::class)
public class BillingBillResourceInvoicingPricingPricing(
    /**
     * The type of the pricing details.
     */
    public val type: InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2,
    public val priceDetails: BillingBillResourceInvoicingPricingPricingPriceDetails? = null,
    /**
     * The unit amount (in the `currency` specified) of the item which contains a decimal value with at most 12 decimal
     * places.
     */
    public val unitAmountDecimal: String? = null,
) {
    public class Builder {
        private var typeValue: InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2? = null

        public var type: InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var priceDetails: BillingBillResourceInvoicingPricingPricingPriceDetails? = null

        /**
         * The unit amount (in the `currency` specified) of the item which contains a decimal value with at most 12 decimal
         * places.
         */
        public var unitAmountDecimal: String? = null

        public fun build(): BillingBillResourceInvoicingPricingPricing {
            check(typeValue != null) { "type is required" }
            return BillingBillResourceInvoicingPricingPricing(
                type = type,
                priceDetails = priceDetails,
                unitAmountDecimal = unitAmountDecimal,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): BillingBillResourceInvoicingPricingPricing =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<BillingBillResourceInvoicingPricingPricing> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): BillingBillResourceInvoicingPricingPricing {
            val jsonDecoder = decoder.requireJsonDecoder("BillingBillResourceInvoicingPricingPricing")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("BillingBillResourceInvoicingPricingPricing must be a JSON object")
            val type =
                json.decodeRequired<InlineBillingBillResourceInvoicingPricingPricingTypeX8164aff2>(
                    rawObject,
                    "type",
                )
            return BillingBillResourceInvoicingPricingPricing(
                type = type,
                priceDetails =
                    rawObject["price_details"]?.let {
                        json.decodeFromJsonElement<BillingBillResourceInvoicingPricingPricingPriceDetails>(it)
                    },
                unitAmountDecimal =
                    rawObject["unit_amount_decimal"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: BillingBillResourceInvoicingPricingPricing,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("BillingBillResourceInvoicingPricingPricing")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.priceDetails?.let { put("price_details", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun billingBillResourceInvoicingPricingPricing(
    block: BillingBillResourceInvoicingPricingPricing.Builder.() -> Unit,
): BillingBillResourceInvoicingPricingPricing = BillingBillResourceInvoicingPricingPricing.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "BillingBillResourceInvoicingPricingPricing is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
