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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormX6e71422d.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormX6e71422d(
    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. Pass an
     * empty string to remove previously-defined thresholds.
     */
    public val billingThresholds: InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0? = null,
    /**
     * The coupons to redeem into discounts for the subscription item.
     */
    public val discounts: InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2? = null,
    /**
     * Indicates if a customer is on or off-session while an invoice payment is attempted. Defaults to `false`
     * (on-session).
     */
    public val offSession: Boolean? = null,
    /**
     * Controls how Stripe handles payment when a subscription update requires payment and
     * `collection_method=charge_automatically`.
     */
    public val paymentBehavior: InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8? = null,
    /**
     * The ID of the price object. One of `price` or `price_data` is required. When changing a subscription item's price,
     * `quantity` is set to 1 unless a `quantity` parameter is provided.
     */
    public val price: String? = null,
    /**
     * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline. One of `price` or
     * `price_data` is required.
     */
    public val priceData: InlineV1SubscriptionItemsPostRequestFormPriceDataX31e93d4c? = null,
    /**
     * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) when the billing
     * cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an
     * item's `quantity` changes. The default value is `create_prorations`.
     */
    public val prorationBehavior: InlineV1SubscriptionItemsPostRequestFormProrationBehaviorX91f5fe9a? = null,
    /**
     * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used
     * to apply the same proration that was previewed with the [upcoming invoice](/api/invoices/create_preview) endpoint.
     */
    public val prorationDate: Int? = null,
    /**
     * The quantity you'd like to apply to the subscription item you're creating.
     */
    public val quantity: Int? = null,
    /**
     * A list of [Tax Rate](https://docs.stripe.com/api/tax_rates) ids. These Tax Rates will override the
     * [`default_tax_rates`](https://docs.stripe.com/api/subscriptions/create#create_subscription-default_tax_rates) on
     * the Subscription. When updating, pass an empty string to remove previously-defined tax rates.
     */
    public val taxRates: InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef? = null,
) {
    public class Builder {
        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. Pass
         * an empty string to remove previously-defined thresholds.
         */
        public var billingThresholds:
            InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0? = null

        /**
         * The coupons to redeem into discounts for the subscription item.
         */
        public var discounts: InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2? = null

        /**
         * Indicates if a customer is on or off-session while an invoice payment is attempted. Defaults to `false`
         * (on-session).
         */
        public var offSession: Boolean? = null

        /**
         * Controls how Stripe handles payment when a subscription update requires payment and
         * `collection_method=charge_automatically`.
         */
        public var paymentBehavior: InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8? =
            null

        /**
         * The ID of the price object. One of `price` or `price_data` is required. When changing a subscription item's
         * price, `quantity` is set to 1 unless a `quantity` parameter is provided.
         */
        public var price: String? = null

        /**
         * Data used to generate a new [Price](https://docs.stripe.com/api/prices) object inline. One of `price` or
         * `price_data` is required.
         */
        public var priceData: InlineV1SubscriptionItemsPostRequestFormPriceDataX31e93d4c? = null

        /**
         * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) when the billing
         * cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an
         * item's `quantity` changes. The default value is `create_prorations`.
         */
        public var prorationBehavior:
            InlineV1SubscriptionItemsPostRequestFormProrationBehaviorX91f5fe9a? = null

        /**
         * If set, the proration will be calculated as though the subscription was updated at the given time. This can be
         * used to apply the same proration that was previewed with the [upcoming invoice](/api/invoices/create_preview)
         * endpoint.
         */
        public var prorationDate: Int? = null

        /**
         * The quantity you'd like to apply to the subscription item you're creating.
         */
        public var quantity: Int? = null

        /**
         * A list of [Tax Rate](https://docs.stripe.com/api/tax_rates) ids. These Tax Rates will override the
         * [`default_tax_rates`](https://docs.stripe.com/api/subscriptions/create#create_subscription-default_tax_rates) on
         * the Subscription. When updating, pass an empty string to remove previously-defined tax rates.
         */
        public var taxRates: InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef? = null

        public fun build(): InlineV1SubscriptionItemsPostRequestFormX6e71422d =
            InlineV1SubscriptionItemsPostRequestFormX6e71422d(
                billingThresholds = billingThresholds,
                discounts = discounts,
                expand = expand,
                metadata = metadata,
                offSession = offSession,
                paymentBehavior = paymentBehavior,
                price = price,
                priceData = priceData,
                prorationBehavior = prorationBehavior,
                prorationDate = prorationDate,
                quantity = quantity,
                taxRates = taxRates,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SubscriptionItemsPostRequestFormX6e71422d =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormX6e71422d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormX6e71422d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormX6e71422d")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionItemsPostRequestFormX6e71422d must be a JSON object",
                    )
            return InlineV1SubscriptionItemsPostRequestFormX6e71422d(
                billingThresholds =
                    rawObject["billing_thresholds"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormBillingThresholdsX4c87d8a0>(
                            it,
                        )
                    },
                discounts =
                    rawObject["discounts"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormDiscountsX16c6ebe1>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormMetadataXd0db8ca2>(it)
                    },
                offSession = rawObject["off_session"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                paymentBehavior =
                    rawObject["payment_behavior"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8>(it)
                    },
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
                priceData =
                    rawObject["price_data"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormPriceDataX31e93d4c>(it)
                    },
                prorationBehavior =
                    rawObject["proration_behavior"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormProrationBehaviorX91f5fe9a>(
                            it,
                        )
                    },
                prorationDate = rawObject["proration_date"]?.let { json.decodeFromJsonElement<Int>(it) },
                quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
                taxRates =
                    rawObject["tax_rates"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormTaxRatesX59bfd0ef>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsPostRequestFormX6e71422d,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionItemsPostRequestFormX6e71422d")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.offSession?.let { put("off_session", json.encodeToJsonElement(it)) }
                    value.paymentBehavior?.let { put("payment_behavior", json.encodeToJsonElement(it)) }
                    value.price?.let { put("price", it) }
                    value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
                    value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
                    value.prorationDate?.let { put("proration_date", json.encodeToJsonElement(it)) }
                    value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
                    value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionItemsPostRequestFormX6e71422d(
    block: InlineV1SubscriptionItemsPostRequestFormX6e71422d.Builder.() -> Unit,
): InlineV1SubscriptionItemsPostRequestFormX6e71422d = InlineV1SubscriptionItemsPostRequestFormX6e71422d.build(block)
