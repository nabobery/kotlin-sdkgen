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
public data class InvoicesResourceShippingCostView(
    @SerialName("amount_subtotal")
    public val amountSubtotal: Int,
    @SerialName("amount_tax")
    public val amountTax: Int,
    @SerialName("amount_total")
    public val amountTotal: Int,
    @SerialName("shipping_rate")
    public val shippingRate: InlineInvoicesResourceShippingCostShippingRateX8cbdd80f? = null,
    public val taxes: List<LineItemsTaxAmount>? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_shipping_cost
 */
@Serializable(with = InvoicesResourceShippingCost.Serializer::class)
public class InvoicesResourceShippingCost(
    /**
     * Total shipping cost before any taxes are applied.
     */
    public val amountSubtotal: Int,
    /**
     * Total tax amount applied due to shipping costs. If no tax was applied, defaults to 0.
     */
    public val amountTax: Int,
    /**
     * Total shipping cost after taxes are applied.
     */
    public val amountTotal: Int,
    /**
     * The ID of the ShippingRate for this invoice.
     */
    public val shippingRate: InlineInvoicesResourceShippingCostShippingRateX8cbdd80f? = null,
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
         * The ID of the ShippingRate for this invoice.
         */
        public var shippingRate: InlineInvoicesResourceShippingCostShippingRateX8cbdd80f? = null

        /**
         * The taxes applied to the shipping rate.
         */
        public var taxes: List<LineItemsTaxAmount>? = null

        public fun build(): InvoicesResourceShippingCost {
            check(amountSubtotalValue != null) { "amountSubtotal is required" }
            check(amountTaxValue != null) { "amountTax is required" }
            check(amountTotalValue != null) { "amountTotal is required" }
            return InvoicesResourceShippingCost(
                amountSubtotal = amountSubtotal,
                amountTax = amountTax,
                amountTotal = amountTotal,
                shippingRate = shippingRate,
                taxes = taxes,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InvoicesResourceShippingCost = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InvoicesResourceShippingCost> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InvoicesResourceShippingCost {
            val jsonDecoder = decoder.requireJsonDecoder("InvoicesResourceShippingCost")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InvoicesResourceShippingCost must be a JSON object")
            val amountSubtotal = json.decodeRequired<Int>(rawObject, "amount_subtotal")
            val amountTax = json.decodeRequired<Int>(rawObject, "amount_tax")
            val amountTotal = json.decodeRequired<Int>(rawObject, "amount_total")
            return InvoicesResourceShippingCost(
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
                            json.decodeFromJsonElement<InlineInvoicesResourceShippingCostShippingRateX8cbdd80f?>(
                                element,
                            )
                        }
                    },
                taxes = rawObject["taxes"]?.let { json.decodeFromJsonElement<List<LineItemsTaxAmount>>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InvoicesResourceShippingCost,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InvoicesResourceShippingCost")
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

public fun invoicesResourceShippingCost(
    block: InvoicesResourceShippingCost.Builder.() -> Unit,
): InvoicesResourceShippingCost = InvoicesResourceShippingCost.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("InvoicesResourceShippingCost is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
