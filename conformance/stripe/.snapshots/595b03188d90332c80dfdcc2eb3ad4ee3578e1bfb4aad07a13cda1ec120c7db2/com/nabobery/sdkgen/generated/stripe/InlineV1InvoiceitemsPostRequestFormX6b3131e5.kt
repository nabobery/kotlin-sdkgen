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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormX6b3131e5.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormX6b3131e5(
    /**
     * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. If you want
     * to apply a credit to the customer's account, pass a negative amount.
     */
    public val amount: Int? = null,
    /**
     * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for easy
     * tracking.
     */
    public val description: String? = null,
    /**
     * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice items,
     * and true for all other invoice items. Cannot be set to true for prorations.
     */
    public val discountable: Boolean? = null,
    /**
     * The coupons, promotion codes & existing discounts which apply to the invoice item or invoice line item. Item
     * discounts are applied before invoice discounts. Pass an empty string to remove previously-defined discounts.
     */
    public val discounts: InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6? = null,
    /**
     * The period associated with this invoice item. When set to different values, the period will be rendered on the
     * invoice. If you have [Stripe Revenue Recognition](https://docs.stripe.com/revenue-recognition) enabled, the period
     * will be used to recognize and defer revenue. See the [Revenue Recognition
     * documentation](https://docs.stripe.com/revenue-recognition/methodology/subscriptions-and-invoicing) for details.
     */
    public val period: InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7? = null,
    /**
     * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
     */
    public val priceData: InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26? = null,
    /**
     * The pricing information for the invoice item.
     */
    public val pricing: InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a? = null,
    /**
     * Non-negative integer. The quantity of units for the invoice item. Use `quantity_decimal` instead to provide decimal
     * precision. This field will be deprecated in favor of `quantity_decimal` in a future version.
     */
    public val quantity: Int? = null,
    /**
     * Non-negative decimal with at most 12 decimal places. The quantity of units for the line item.
     */
    public val quantityDecimal: String? = null,
    /**
     * Only required if a [default tax
     * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(r
     * ecommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of
     * taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
     * `inclusive` or `exclusive`, it cannot be changed.
     */
    public val taxBehavior: InlineV1InvoiceitemsPostRequestFormTaxBehaviorXd0ff4db1? = null,
    /**
     * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
     */
    public val taxCode: InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651? = null,
    /**
     * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice do not apply to
     * this invoice item. Pass an empty string to remove previously-defined tax rates.
     */
    public val taxRates: InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e? = null,
    /**
     * The decimal unit amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. This
     * `unit_amount_decimal` will be multiplied by the quantity to get the full amount. Passing in a negative
     * `unit_amount_decimal` will reduce the `amount_due` on the invoice. Accepts at most 12 decimal places.
     */
    public val unitAmountDecimal: String? = null,
) {
    public class Builder {
        /**
         * The integer amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. If you
         * want to apply a credit to the customer's account, pass a negative amount.
         */
        public var amount: Int? = null

        /**
         * An arbitrary string which you can attach to the invoice item. The description is displayed in the invoice for
         * easy tracking.
         */
        public var description: String? = null

        /**
         * Controls whether discounts apply to this invoice item. Defaults to false for prorations or negative invoice
         * items, and true for all other invoice items. Cannot be set to true for prorations.
         */
        public var discountable: Boolean? = null

        /**
         * The coupons, promotion codes & existing discounts which apply to the invoice item or invoice line item. Item
         * discounts are applied before invoice discounts. Pass an empty string to remove previously-defined discounts.
         */
        public var discounts: InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6? = null

        /**
         * The period associated with this invoice item. When set to different values, the period will be rendered on the
         * invoice. If you have [Stripe Revenue Recognition](https://docs.stripe.com/revenue-recognition) enabled, the
         * period will be used to recognize and defer revenue. See the [Revenue Recognition
         * documentation](https://docs.stripe.com/revenue-recognition/methodology/subscriptions-and-invoicing) for details.
         */
        public var period: InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7? = null

        /**
         * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline.
         */
        public var priceData: InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26? = null

        /**
         * The pricing information for the invoice item.
         */
        public var pricing: InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a? = null

        /**
         * Non-negative integer. The quantity of units for the invoice item. Use `quantity_decimal` instead to provide
         * decimal precision. This field will be deprecated in favor of `quantity_decimal` in a future version.
         */
        public var quantity: Int? = null

        /**
         * Non-negative decimal with at most 12 decimal places. The quantity of units for the line item.
         */
        public var quantityDecimal: String? = null

        /**
         * Only required if a [default tax
         * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-
         * (recommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive
         * of taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
         * `inclusive` or `exclusive`, it cannot be changed.
         */
        public var taxBehavior: InlineV1InvoiceitemsPostRequestFormTaxBehaviorXd0ff4db1? = null

        /**
         * A [tax code](https://docs.stripe.com/tax/tax-categories) ID.
         */
        public var taxCode: InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651? = null

        /**
         * The tax rates which apply to the invoice item. When set, the `default_tax_rates` on the invoice do not apply to
         * this invoice item. Pass an empty string to remove previously-defined tax rates.
         */
        public var taxRates: InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e? = null

        /**
         * The decimal unit amount in cents (or local equivalent) of the charge to be applied to the upcoming invoice. This
         * `unit_amount_decimal` will be multiplied by the quantity to get the full amount. Passing in a negative
         * `unit_amount_decimal` will reduce the `amount_due` on the invoice. Accepts at most 12 decimal places.
         */
        public var unitAmountDecimal: String? = null

        public fun build(): InlineV1InvoiceitemsPostRequestFormX6b3131e5 =
            InlineV1InvoiceitemsPostRequestFormX6b3131e5(
                amount = amount,
                description = description,
                discountable = discountable,
                discounts = discounts,
                expand = expand,
                metadata = metadata,
                period = period,
                priceData = priceData,
                pricing = pricing,
                quantity = quantity,
                quantityDecimal = quantityDecimal,
                taxBehavior = taxBehavior,
                taxCode = taxCode,
                taxRates = taxRates,
                unitAmountDecimal = unitAmountDecimal,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormX6b3131e5 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormX6b3131e5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormX6b3131e5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormX6b3131e5")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoiceitemsPostRequestFormX6b3131e5 must be a JSON object",
                    )
            return InlineV1InvoiceitemsPostRequestFormX6b3131e5(
                amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                discounts =
                    rawObject["discounts"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormDiscountsX2a7c703b>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormMetadataX326f4fd6>(it)
                    },
                period =
                    rawObject["period"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormPeriodXcae985a7>(it)
                    },
                priceData =
                    rawObject["price_data"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormPriceDataXd6200d26>(it)
                    },
                pricing =
                    rawObject["pricing"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a>(it)
                    },
                quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
                quantityDecimal = rawObject["quantity_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormTaxBehaviorXd0ff4db1>(it)
                    },
                taxCode =
                    rawObject["tax_code"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormTaxCodeX8962e651>(it)
                    },
                taxRates =
                    rawObject["tax_rates"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoiceitemsPostRequestFormTaxRatesX226d041e>(it)
                    },
                unitAmountDecimal =
                    rawObject["unit_amount_decimal"]?.let {
                        json
                            .decodeFromJsonElement<String>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoiceitemsPostRequestFormX6b3131e5,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormX6b3131e5")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.period?.let { put("period", json.encodeToJsonElement(it)) }
                    value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
                    value.pricing?.let { put("pricing", json.encodeToJsonElement(it)) }
                    value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
                    value.quantityDecimal?.let { put("quantity_decimal", it) }
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.taxCode?.let { put("tax_code", json.encodeToJsonElement(it)) }
                    value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoiceitemsPostRequestFormX6b3131e5(
    block: InlineV1InvoiceitemsPostRequestFormX6b3131e5.Builder.() -> Unit,
): InlineV1InvoiceitemsPostRequestFormX6b3131e5 = InlineV1InvoiceitemsPostRequestFormX6b3131e5.build(block)
