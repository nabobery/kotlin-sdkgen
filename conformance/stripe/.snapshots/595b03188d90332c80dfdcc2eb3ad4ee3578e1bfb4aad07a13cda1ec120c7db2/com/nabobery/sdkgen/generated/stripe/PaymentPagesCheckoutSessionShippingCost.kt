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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@Serializable
public data class PaymentPagesCheckoutSessionShippingCostView(
    @SerialName("amount_subtotal")
    public val amountSubtotal: Int,
    @SerialName("amount_tax")
    public val amountTax: Int,
    @SerialName("amount_total")
    public val amountTotal: Int,
    @SerialName("shipping_rate")
    public val shippingRate: InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9? = null,
    public val taxes: List<LineItemsTaxAmount>? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_shipping_cost
 */
@Serializable(with = PaymentPagesCheckoutSessionShippingCost.Serializer::class)
public class PaymentPagesCheckoutSessionShippingCost(
    /**
     * Total shipping cost before any discounts or taxes are applied.
     */
    public val amountSubtotal: Int,
    /**
     * Total tax amount applied due to shipping costs. If no tax was applied, defaults to 0.
     */
    public val amountTax: Int,
    /**
     * Total shipping cost after discounts and taxes are applied.
     */
    public val amountTotal: Int,
    /**
     * The ID of the ShippingRate for this order.
     */
    public val shippingRate: InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9? = null,
    /**
     * The taxes applied to the shipping rate.
     */
    public val taxes: List<LineItemsTaxAmount>? = null,
) {
    public class Builder {
        private var amountSubtotalValue: Int? = null

        public var amountSubtotal: Int
            get() = requireNotNull(amountSubtotalValue) { "amountSubtotal is required" }
            set(`value`) {
                amountSubtotalValue = value
            }

        private var amountTaxValue: Int? = null

        public var amountTax: Int
            get() = requireNotNull(amountTaxValue) { "amountTax is required" }
            set(`value`) {
                amountTaxValue = value
            }

        private var amountTotalValue: Int? = null

        public var amountTotal: Int
            get() = requireNotNull(amountTotalValue) { "amountTotal is required" }
            set(`value`) {
                amountTotalValue = value
            }

        /**
         * The ID of the ShippingRate for this order.
         */
        public var shippingRate: InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9? =
            null

        /**
         * The taxes applied to the shipping rate.
         */
        public var taxes: List<LineItemsTaxAmount>? = null

        public fun build(): PaymentPagesCheckoutSessionShippingCost {
            check(amountSubtotalValue != null) { "amountSubtotal is required" }
            check(amountTaxValue != null) { "amountTax is required" }
            check(amountTotalValue != null) { "amountTotal is required" }
            return PaymentPagesCheckoutSessionShippingCost(
                amountSubtotal = amountSubtotal,
                amountTax = amountTax,
                amountTotal = amountTotal,
                shippingRate = shippingRate,
                taxes = taxes,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentPagesCheckoutSessionShippingCost =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentPagesCheckoutSessionShippingCost> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentPagesCheckoutSessionShippingCost {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentPagesCheckoutSessionShippingCost")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentPagesCheckoutSessionShippingCost must be a JSON object")
            val amountSubtotal = json.decodeRequired<Int>(rawObject, "amount_subtotal")
            val amountTax = json.decodeRequired<Int>(rawObject, "amount_tax")
            val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
            return PaymentPagesCheckoutSessionShippingCost(
                amountSubtotal = amountSubtotal,
                amountTax = amountTax,
                amountTotal = amountTotal,
                shippingRate =
                    rawObject["shipping_rate"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentPagesCheckoutSessionShippingCostShippingRateX5b77a1d9?>(
                                    element,
                                )
                        }
                    },
                taxes = rawObject["taxes"]?.let { json.decodeFromJsonElement<List<LineItemsTaxAmount>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentPagesCheckoutSessionShippingCost,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentPagesCheckoutSessionShippingCost")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount_subtotal", json.encodeToJsonElement(value.amountSubtotal))
                    put("amount_tax", json.encodeToJsonElement(value.amountTax))
                    put("amount_total", json.encodeToJsonElement(value.amountTotal))
                    value.shippingRate?.let { put("shipping_rate", json.encodeToJsonElement(it)) }
                    value.taxes?.let { put("taxes", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentPagesCheckoutSessionShippingCost(
    block: PaymentPagesCheckoutSessionShippingCost.Builder.() -> Unit,
): PaymentPagesCheckoutSessionShippingCost = PaymentPagesCheckoutSessionShippingCost.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PaymentPagesCheckoutSessionShippingCost is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
