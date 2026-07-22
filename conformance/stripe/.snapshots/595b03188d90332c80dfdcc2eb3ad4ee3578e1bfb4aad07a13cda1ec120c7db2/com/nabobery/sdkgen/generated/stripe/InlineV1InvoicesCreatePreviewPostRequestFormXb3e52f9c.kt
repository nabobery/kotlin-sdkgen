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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c(
    /**
     * Settings for automatic tax lookup for this invoice preview.
     */
    public val automaticTax: InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14? = null,
    /**
     * The currency to preview this invoice in. Defaults to that of `customer` if not specified.
     */
    public val currency: String? = null,
    /**
     * The identifier of the customer whose upcoming invoice you're retrieving. If `automatic_tax` is enabled then one of
     * `customer`, `customer_details`, `subscription`, or `schedule` must be set.
     */
    public val customer: String? = null,
    /**
     * The identifier of the account representing the customer whose upcoming invoice you're retrieving. If
     * `automatic_tax` is enabled then one of `customer`, `customer_account`, `customer_details`, `subscription`, or
     * `schedule` must be set.
     */
    public val customerAccount: String? = null,
    /**
     * Details about the customer you want to invoice or overrides for an existing customer. If `automatic_tax` is enabled
     * then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
     */
    public val customerDetails: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b? = null,
    /**
     * The coupons to redeem into discounts for the invoice preview. If not specified, inherits the discount from the
     * subscription or customer. This works for both coupons directly applied to an invoice and coupons applied to a
     * subscription. Pass an empty string to avoid inheriting any discounts.
     */
    public val discounts: InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * List of invoice items to add or update in the upcoming invoice preview (up to 250).
     */
    public val invoiceItems: List<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944>? = null,
    /**
     * The connected account that issues the invoice. The invoice is presented with the branding and support information
     * of the specified account.
     */
    public val issuer: InlineV1InvoicesCreatePreviewPostRequestFormIssuerX5af905ce? = null,
    /**
     * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented
     * with the branding and support information of the specified account. See the [Invoices with
     * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
     */
    public val onBehalfOf: InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86? = null,
    /**
     * Customizes the types of values to include when calculating the invoice. Defaults to `next` if unspecified.
     */
    public val previewMode: InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30? = null,
    /**
     * The identifier of the schedule whose upcoming invoice you'd like to retrieve. Cannot be used with subscription or
     * subscription fields.
     */
    public val schedule: String? = null,
    /**
     * The schedule creation or modification params to apply as a preview. Cannot be used with `subscription` or
     * `subscription_` prefixed fields.
     */
    public val scheduleDetails: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1? = null,
    /**
     * The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If not provided, but a
     * `subscription_details.items` is provided, you will preview creating a subscription with those items. If neither
     * `subscription` nor `subscription_details.items` is provided, you will retrieve the next upcoming invoice from among
     * the customer's subscriptions.
     */
    public val subscription: String? = null,
    /**
     * The subscription creation or modification params to apply as a preview. Cannot be used with `schedule` or
     * `schedule_details` fields.
     */
    public val subscriptionDetails: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af? = null,
) {
    public class Builder {
        /**
         * Settings for automatic tax lookup for this invoice preview.
         */
        public var automaticTax: InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14? =
            null

        /**
         * The currency to preview this invoice in. Defaults to that of `customer` if not specified.
         */
        public var currency: String? = null

        /**
         * The identifier of the customer whose upcoming invoice you're retrieving. If `automatic_tax` is enabled then one
         * of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
         */
        public var customer: String? = null

        /**
         * The identifier of the account representing the customer whose upcoming invoice you're retrieving. If
         * `automatic_tax` is enabled then one of `customer`, `customer_account`, `customer_details`, `subscription`, or
         * `schedule` must be set.
         */
        public var customerAccount: String? = null

        /**
         * Details about the customer you want to invoice or overrides for an existing customer. If `automatic_tax` is
         * enabled then one of `customer`, `customer_details`, `subscription`, or `schedule` must be set.
         */
        public var customerDetails:
            InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b? = null

        /**
         * The coupons to redeem into discounts for the invoice preview. If not specified, inherits the discount from the
         * subscription or customer. This works for both coupons directly applied to an invoice and coupons applied to a
         * subscription. Pass an empty string to avoid inheriting any discounts.
         */
        public var discounts: InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * List of invoice items to add or update in the upcoming invoice preview (up to 250).
         */
        public var invoiceItems:
            List<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944>? = null

        /**
         * The connected account that issues the invoice. The invoice is presented with the branding and support information
         * of the specified account.
         */
        public var issuer: InlineV1InvoicesCreatePreviewPostRequestFormIssuerX5af905ce? = null

        /**
         * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be
         * presented with the branding and support information of the specified account. See the [Invoices with
         * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
         */
        public var onBehalfOf: InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86? = null

        /**
         * Customizes the types of values to include when calculating the invoice. Defaults to `next` if unspecified.
         */
        public var previewMode: InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30? = null

        /**
         * The identifier of the schedule whose upcoming invoice you'd like to retrieve. Cannot be used with subscription or
         * subscription fields.
         */
        public var schedule: String? = null

        /**
         * The schedule creation or modification params to apply as a preview. Cannot be used with `subscription` or
         * `subscription_` prefixed fields.
         */
        public var scheduleDetails:
            InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1? = null

        /**
         * The identifier of the subscription for which you'd like to retrieve the upcoming invoice. If not provided, but a
         * `subscription_details.items` is provided, you will preview creating a subscription with those items. If neither
         * `subscription` nor `subscription_details.items` is provided, you will retrieve the next upcoming invoice from
         * among the customer's subscriptions.
         */
        public var subscription: String? = null

        /**
         * The subscription creation or modification params to apply as a preview. Cannot be used with `schedule` or
         * `schedule_details` fields.
         */
        public var subscriptionDetails:
            InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af? = null

        public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c =
            InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c(
                automaticTax = automaticTax,
                currency = currency,
                customer = customer,
                customerAccount = customerAccount,
                customerDetails = customerDetails,
                discounts = discounts,
                expand = expand,
                invoiceItems = invoiceItems,
                issuer = issuer,
                onBehalfOf = onBehalfOf,
                previewMode = previewMode,
                schedule = schedule,
                scheduleDetails = scheduleDetails,
                subscription = subscription,
                subscriptionDetails = subscriptionDetails,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c must be a JSON object",
                    )
            return InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c(
                automaticTax =
                    rawObject["automatic_tax"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormAutomaticTaxX6aef3e14>(
                            it,
                        )
                    },
                currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
                customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
                customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
                customerDetails =
                    rawObject["customer_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsXf8694a9b>(
                                it,
                            )
                    },
                discounts =
                    rawObject["discounts"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa7616a1>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                invoiceItems =
                    rawObject["invoice_items"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceItemsItemX6688a944>>(
                                it,
                            )
                    },
                issuer =
                    rawObject["issuer"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormIssuerX5af905ce>(it)
                    },
                onBehalfOf =
                    rawObject["on_behalf_of"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormOnBehalfOfXaae62e86>(it)
                    },
                previewMode =
                    rawObject["preview_mode"]?.let {
                        json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormPreviewModeXcb77da30>(it)
                    },
                schedule = rawObject["schedule"]?.let { json.decodeFromJsonElement<String>(it) },
                scheduleDetails =
                    rawObject["schedule_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsXad6636e1>(
                                it,
                            )
                    },
                subscription = rawObject["subscription"]?.let { json.decodeFromJsonElement<String>(it) },
                subscriptionDetails =
                    rawObject["subscription_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsXd72553af>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
                    value.currency?.let { put("currency", it) }
                    value.customer?.let { put("customer", it) }
                    value.customerAccount?.let { put("customer_account", it) }
                    value.customerDetails?.let { put("customer_details", json.encodeToJsonElement(it)) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.invoiceItems?.let { put("invoice_items", json.encodeToJsonElement(it)) }
                    value.issuer?.let { put("issuer", json.encodeToJsonElement(it)) }
                    value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
                    value.previewMode?.let { put("preview_mode", json.encodeToJsonElement(it)) }
                    value.schedule?.let { put("schedule", it) }
                    value.scheduleDetails?.let { put("schedule_details", json.encodeToJsonElement(it)) }
                    value.subscription?.let { put("subscription", it) }
                    value.subscriptionDetails?.let { put("subscription_details", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c(
    block: InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c.Builder.() -> Unit,
): InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c =
    InlineV1InvoicesCreatePreviewPostRequestFormXb3e52f9c.build(block)
