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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1prices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1PricesPostRequestFormX26912080.Serializer::class)
public class InlineV1PricesPostRequestFormX26912080(
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String,
    /**
     * Whether the price can be used for new purchases. Defaults to `true`.
     */
    public val active: Boolean? = null,
    /**
     * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed
     * amount (specified in `unit_amount` or `unit_amount_decimal`) will be charged per unit in `quantity` (for prices
     * with `usage_type=licensed`), or per unit of total usage (for prices with `usage_type=metered`). `tiered` indicates
     * that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and `tiers_mode`
     * attributes.
     */
    public val billingScheme: InlineV1PricesPostRequestFormBillingSchemeX67bff49a? = null,
    /**
     * Prices defined in each available currency option. Each key must be a three-letter [ISO currency
     * code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
     * currency](https://stripe.com/docs/currencies).
     */
    public val currencyOptions: Map<String, InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f>? = null,
    /**
     * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and Payment
     * Links.
     */
    public val customUnitAmount: InlineV1PricesPostRequestFormCustomUnitAmountX8bb5f273? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200 characters.
     */
    public val lookupKey: String? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * A brief description of the price, hidden from customers.
     */
    public val nickname: String? = null,
    /**
     * The ID of the [Product](https://docs.stripe.com/api/products) that this [Price](https://docs.stripe.com/api/prices)
     * will belong to.
     */
    public val product: String? = null,
    /**
     * These fields can be used to create a new product that this price will belong to.
     */
    public val productData: InlineV1PricesPostRequestFormProductDataX52465f20? = null,
    /**
     * The recurring components of a price such as `interval` and `usage_type`.
     */
    public val recurring: InlineV1PricesPostRequestFormRecurringXac885c5d? = null,
    /**
     * Only required if a [default tax
     * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-(r
     * ecommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive of
     * taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
     * `inclusive` or `exclusive`, it cannot be changed.
     */
    public val taxBehavior: InlineV1PricesPostRequestFormTaxBehaviorX45616dab? = null,
    /**
     * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also
     * the documentation for `billing_scheme`.
     */
    public val tiers: List<InlineV1PricesPostRequestFormTiersItemX4171cb99>? = null,
    /**
     * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum
     * quantity within a period determines the per unit price, in `graduated` tiering pricing can successively change as
     * the quantity grows.
     */
    public val tiersMode: InlineV1PricesPostRequestFormTiersModeX7dd943f9? = null,
    /**
     * If set to true, will atomically remove the lookup key from the existing price, and assign it to this price.
     */
    public val transferLookupKey: Boolean? = null,
    /**
     * Apply a transformation to the reported usage or set quantity before computing the billed price. Cannot be combined
     * with `tiers`.
     */
    public val transformQuantity: InlineV1PricesPostRequestFormTransformQuantityXc0c69d44? = null,
    /**
     * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how much to charge. One of
     * `unit_amount`, `unit_amount_decimal`, or `custom_unit_amount` is required, unless `billing_scheme=tiered`.
     */
    public val unitAmount: Int? = null,
    /**
     * Same as `unit_amount`, but accepts a decimal value in cents (or local equivalent) with at most 12 decimal places.
     * Only one of `unit_amount` and `unit_amount_decimal` can be set.
     */
    public val unitAmountDecimal: String? = null,
) {
    public class Builder {
        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        /**
         * Whether the price can be used for new purchases. Defaults to `true`.
         */
        public var active: Boolean? = null

        /**
         * Describes how to compute the price per period. Either `per_unit` or `tiered`. `per_unit` indicates that the fixed
         * amount (specified in `unit_amount` or `unit_amount_decimal`) will be charged per unit in `quantity` (for prices
         * with `usage_type=licensed`), or per unit of total usage (for prices with `usage_type=metered`). `tiered`
         * indicates that the unit pricing will be computed using a tiering strategy as defined using the `tiers` and
         * `tiers_mode` attributes.
         */
        public var billingScheme: InlineV1PricesPostRequestFormBillingSchemeX67bff49a? = null

        /**
         * Prices defined in each available currency option. Each key must be a three-letter [ISO currency
         * code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
         * currency](https://stripe.com/docs/currencies).
         */
        public var currencyOptions:
            Map<String, InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f>? = null

        /**
         * When set, provides configuration for the amount to be adjusted by the customer during Checkout Sessions and
         * Payment Links.
         */
        public var customUnitAmount: InlineV1PricesPostRequestFormCustomUnitAmountX8bb5f273? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * A lookup key used to retrieve prices dynamically from a static string. This may be up to 200 characters.
         */
        public var lookupKey: String? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        /**
         * A brief description of the price, hidden from customers.
         */
        public var nickname: String? = null

        /**
         * The ID of the [Product](https://docs.stripe.com/api/products) that this
         * [Price](https://docs.stripe.com/api/prices) will belong to.
         */
        public var product: String? = null

        /**
         * These fields can be used to create a new product that this price will belong to.
         */
        public var productData: InlineV1PricesPostRequestFormProductDataX52465f20? = null

        /**
         * The recurring components of a price such as `interval` and `usage_type`.
         */
        public var recurring: InlineV1PricesPostRequestFormRecurringXac885c5d? = null

        /**
         * Only required if a [default tax
         * behavior](https://docs.stripe.com/tax/products-prices-tax-categories-tax-behavior#setting-a-default-tax-behavior-
         * (recommended)) was not provided in the Stripe Tax settings. Specifies whether the price is considered inclusive
         * of taxes or exclusive of taxes. One of `inclusive`, `exclusive`, or `unspecified`. Once specified as either
         * `inclusive` or `exclusive`, it cannot be changed.
         */
        public var taxBehavior: InlineV1PricesPostRequestFormTaxBehaviorX45616dab? = null

        /**
         * Each element represents a pricing tier. This parameter requires `billing_scheme` to be set to `tiered`. See also
         * the documentation for `billing_scheme`.
         */
        public var tiers: List<InlineV1PricesPostRequestFormTiersItemX4171cb99>? = null

        /**
         * Defines if the tiering price should be `graduated` or `volume` based. In `volume`-based tiering, the maximum
         * quantity within a period determines the per unit price, in `graduated` tiering pricing can successively change as
         * the quantity grows.
         */
        public var tiersMode: InlineV1PricesPostRequestFormTiersModeX7dd943f9? = null

        /**
         * If set to true, will atomically remove the lookup key from the existing price, and assign it to this price.
         */
        public var transferLookupKey: Boolean? = null

        /**
         * Apply a transformation to the reported usage or set quantity before computing the billed price. Cannot be
         * combined with `tiers`.
         */
        public var transformQuantity: InlineV1PricesPostRequestFormTransformQuantityXc0c69d44? = null

        /**
         * A positive integer in cents (or local equivalent) (or 0 for a free price) representing how much to charge. One of
         * `unit_amount`, `unit_amount_decimal`, or `custom_unit_amount` is required, unless `billing_scheme=tiered`.
         */
        public var unitAmount: Int? = null

        /**
         * Same as `unit_amount`, but accepts a decimal value in cents (or local equivalent) with at most 12 decimal places.
         * Only one of `unit_amount` and `unit_amount_decimal` can be set.
         */
        public var unitAmountDecimal: String? = null

        public fun build(): InlineV1PricesPostRequestFormX26912080 {
            check(currencyValue != null) { "currency is required" }
            return InlineV1PricesPostRequestFormX26912080(
                currency = currency,
                active = active,
                billingScheme = billingScheme,
                currencyOptions = currencyOptions,
                customUnitAmount = customUnitAmount,
                expand = expand,
                lookupKey = lookupKey,
                metadata = metadata,
                nickname = nickname,
                product = product,
                productData = productData,
                recurring = recurring,
                taxBehavior = taxBehavior,
                tiers = tiers,
                tiersMode = tiersMode,
                transferLookupKey = transferLookupKey,
                transformQuantity = transformQuantity,
                unitAmount = unitAmount,
                unitAmountDecimal = unitAmountDecimal,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1PricesPostRequestFormX26912080 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PricesPostRequestFormX26912080> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PricesPostRequestFormX26912080 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PricesPostRequestFormX26912080")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineV1PricesPostRequestFormX26912080 must be a JSON object")
            val currency = json.decodeRequired<String>(rawObject, "currency")
            return InlineV1PricesPostRequestFormX26912080(
                currency = currency,
                active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                billingScheme =
                    rawObject["billing_scheme"]?.let {
                        json.decodeFromJsonElement<InlineV1PricesPostRequestFormBillingSchemeX67bff49a>(it)
                    },
                currencyOptions =
                    rawObject["currency_options"]?.let {
                        json
                            .decodeFromJsonElement<Map<String, InlineV1PricesPostRequestFormCurrencyOptionsAdditionalValueX4584247f>>(
                                it,
                            )
                    },
                customUnitAmount =
                    rawObject["custom_unit_amount"]?.let {
                        json.decodeFromJsonElement<InlineV1PricesPostRequestFormCustomUnitAmountX8bb5f273>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                lookupKey = rawObject["lookup_key"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                nickname = rawObject["nickname"]?.let { json.decodeFromJsonElement<String>(it) },
                product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
                productData =
                    rawObject["product_data"]?.let {
                        json.decodeFromJsonElement<InlineV1PricesPostRequestFormProductDataX52465f20>(it)
                    },
                recurring =
                    rawObject["recurring"]?.let {
                        json.decodeFromJsonElement<InlineV1PricesPostRequestFormRecurringXac885c5d>(it)
                    },
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json.decodeFromJsonElement<InlineV1PricesPostRequestFormTaxBehaviorX45616dab>(it)
                    },
                tiers =
                    rawObject["tiers"]?.let {
                        json.decodeFromJsonElement<List<InlineV1PricesPostRequestFormTiersItemX4171cb99>>(it)
                    },
                tiersMode =
                    rawObject["tiers_mode"]?.let {
                        json.decodeFromJsonElement<InlineV1PricesPostRequestFormTiersModeX7dd943f9>(it)
                    },
                transferLookupKey =
                    rawObject["transfer_lookup_key"]?.let {
                        json
                            .decodeFromJsonElement<Boolean>(
                                it,
                            )
                    },
                transformQuantity =
                    rawObject["transform_quantity"]?.let {
                        json.decodeFromJsonElement<InlineV1PricesPostRequestFormTransformQuantityXc0c69d44>(it)
                    },
                unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PricesPostRequestFormX26912080,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1PricesPostRequestFormX26912080")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("currency", value.currency)
                    value.active?.let { put("active", json.encodeToJsonElement(it)) }
                    value.billingScheme?.let { put("billing_scheme", json.encodeToJsonElement(it)) }
                    value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
                    value.customUnitAmount?.let { put("custom_unit_amount", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.lookupKey?.let { put("lookup_key", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.nickname?.let { put("nickname", it) }
                    value.product?.let { put("product", it) }
                    value.productData?.let { put("product_data", json.encodeToJsonElement(it)) }
                    value.recurring?.let { put("recurring", json.encodeToJsonElement(it)) }
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.tiers?.let { put("tiers", json.encodeToJsonElement(it)) }
                    value.tiersMode?.let { put("tiers_mode", json.encodeToJsonElement(it)) }
                    value.transferLookupKey?.let { put("transfer_lookup_key", json.encodeToJsonElement(it)) }
                    value.transformQuantity?.let { put("transform_quantity", json.encodeToJsonElement(it)) }
                    value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PricesPostRequestFormX26912080(
    block: InlineV1PricesPostRequestFormX26912080.Builder.() -> Unit,
): InlineV1PricesPostRequestFormX26912080 = InlineV1PricesPostRequestFormX26912080.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PricesPostRequestFormX26912080 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
