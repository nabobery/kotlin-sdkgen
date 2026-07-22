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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class TaxProductResourceTaxTransactionShippingCostView(
    public val amount: Int,
    @SerialName("amount_tax")
    public val amountTax: Int,
    @SerialName("shipping_rate")
    public val shippingRate: String? = null,
    @SerialName("tax_behavior")
    public val taxBehavior: InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279,
    @SerialName("tax_code")
    public val taxCode: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_transaction_shipping_cost
 */
@Serializable(with = TaxProductResourceTaxTransactionShippingCost.Serializer::class)
public class TaxProductResourceTaxTransactionShippingCost(
    /**
     * The shipping amount in the [smallest currency unit](https://docs.stripe.com/currencies#minor-units). If
     * `tax_behavior=inclusive`, then this amount includes taxes. Otherwise, taxes were calculated on top of this amount.
     */
    public val amount: Int,
    /**
     * The amount of tax calculated for shipping, in the [smallest currency
     * unit](https://docs.stripe.com/currencies#minor-units).
     */
    public val amountTax: Int,
    /**
     * Specifies whether the `amount` includes taxes. If `tax_behavior=inclusive`, then the amount includes taxes.
     */
    public val taxBehavior: InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279,
    /**
     * The [tax code](https://docs.stripe.com/tax/tax-categories) ID used for shipping.
     */
    public val taxCode: String,
    /**
     * The ID of an existing [ShippingRate](https://docs.stripe.com/api/shipping_rates/object).
     */
    public val shippingRate: String? = null,
) {
    public class Builder {
        private var amountValue: Int? = null

        public var amount: Int
            get() = requireNotNull(amountValue) { "amount is required" }
            set(`value`) {
                amountValue = value
            }

        private var amountTaxValue: Int? = null

        public var amountTax: Int
            get() = requireNotNull(amountTaxValue) { "amountTax is required" }
            set(`value`) {
                amountTaxValue = value
            }

        private var taxBehaviorValue:
            InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279? = null

        public var taxBehavior: InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279
            get() = requireNotNull(taxBehaviorValue) { "taxBehavior is required" }
            set(`value`) {
                taxBehaviorValue = value
            }

        private var taxCodeValue: String? = null

        public var taxCode: String
            get() = requireNotNull(taxCodeValue) { "taxCode is required" }
            set(`value`) {
                taxCodeValue = value
            }

        /**
         * The ID of an existing [ShippingRate](https://docs.stripe.com/api/shipping_rates/object).
         */
        public var shippingRate: String? = null

        public fun build(): TaxProductResourceTaxTransactionShippingCost {
            check(amountValue != null) { "amount is required" }
            check(amountTaxValue != null) { "amountTax is required" }
            check(taxBehaviorValue != null) { "taxBehavior is required" }
            check(taxCodeValue != null) { "taxCode is required" }
            return TaxProductResourceTaxTransactionShippingCost(
                amount = amount,
                amountTax = amountTax,
                taxBehavior = taxBehavior,
                taxCode = taxCode,
                shippingRate = shippingRate,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): TaxProductResourceTaxTransactionShippingCost =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<TaxProductResourceTaxTransactionShippingCost> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): TaxProductResourceTaxTransactionShippingCost {
            val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxTransactionShippingCost")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "TaxProductResourceTaxTransactionShippingCost must be a JSON object",
                    )
            val amount = json.decodeRequired<Int>(rawObject, "amount")
            val amountTax = json.decodeRequired<Int>(rawObject, "amount_tax")
            val taxBehavior =
                json.decodeRequired<InlineTaxProductResourceTaxTransactionShippingCostTaxBehaviorXd2b0b279>(
                    rawObject,
                    "tax_behavior",
                )
            val taxCode = json.decodeRequired<String>(rawObject, "tax_code")
            return TaxProductResourceTaxTransactionShippingCost(
                amount = amount,
                amountTax = amountTax,
                taxBehavior = taxBehavior,
                taxCode = taxCode,
                shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: TaxProductResourceTaxTransactionShippingCost,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxTransactionShippingCost")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("amount", json.encodeToJsonElement(value.amount))
                    put("amount_tax", json.encodeToJsonElement(value.amountTax))
                    put("tax_behavior", json.encodeToJsonElement(value.taxBehavior))
                    put("tax_code", value.taxCode)
                    value.shippingRate?.let { put("shipping_rate", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun taxProductResourceTaxTransactionShippingCost(
    block: TaxProductResourceTaxTransactionShippingCost.Builder.() -> Unit,
): TaxProductResourceTaxTransactionShippingCost = TaxProductResourceTaxTransactionShippingCost.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "TaxProductResourceTaxTransactionShippingCost is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
