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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1QuotesPostRequestFormX99c4efb9.Serializer::class)
public class InlineV1QuotesPostRequestFormX99c4efb9(
    /**
     * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
     * the application owner's Stripe account. There cannot be any line items with recurring prices when using this field.
     */
    public val applicationFeeAmount: InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d? = null,
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the application owner's Stripe account. There must be at
     * least 1 line item with a recurring price to use this field.
     */
    public val applicationFeePercent: InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e? = null,
    /**
     * Settings for automatic tax lookup for this quote and resulting invoices and subscriptions.
     */
    public val automaticTax: InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca? = null,
    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay invoices
     * at the end of the subscription cycle or at invoice finalization using the default payment method attached to the
     * subscription or customer. When sending an invoice, Stripe will email your customer an invoice with payment
     * instructions and mark the subscription as `active`. Defaults to `charge_automatically`.
     */
    public val collectionMethod: InlineV1QuotesPostRequestFormCollectionMethodXf5619bcc? = null,
    /**
     * The customer for which this quote belongs to. A customer is required before finalizing the quote. Once specified,
     * it cannot be changed.
     */
    public val customer: String? = null,
    /**
     * The account for which this quote belongs to. A customer or account is required before finalizing the quote. Once
     * specified, it cannot be changed.
     */
    public val customerAccount: String? = null,
    /**
     * The tax rates that will apply to any line item that does not have `tax_rates` set.
     */
    public val defaultTaxRates: InlineV1QuotesPostRequestFormDefaultTaxRatesXd69b66d3? = null,
    /**
     * A description that will be displayed on the quote PDF. If no value is passed, the default description configured in
     * your [quote template settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
     */
    public val description: InlineV1QuotesPostRequestFormDescriptionX670239c2? = null,
    /**
     * The discounts applied to the quote.
     */
    public val discounts: InlineV1QuotesPostRequestFormDiscountsXcce02801? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * A future timestamp on which the quote will be canceled if in `open` or `draft` status. Measured in seconds since
     * the Unix epoch. If no value is passed, the default expiration date configured in your [quote template
     * settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
     */
    public val expiresAt: Int? = null,
    /**
     * A footer that will be displayed on the quote PDF. If no value is passed, the default footer configured in your
     * [quote template settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
     */
    public val footer: InlineV1QuotesPostRequestFormFooterXd71da30b? = null,
    /**
     * Clone an existing quote. The new quote will be created in `status=draft`. When using this parameter, you cannot
     * specify any other parameters except for `expires_at`.
     */
    public val fromQuote: InlineV1QuotesPostRequestFormFromQuoteXa868383a? = null,
    /**
     * A header that will be displayed on the quote PDF. If no value is passed, the default header configured in your
     * [quote template settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
     */
    public val `header`: InlineV1QuotesPostRequestFormHeaderX35374ae5? = null,
    /**
     * All invoices will be billed using the specified settings.
     */
    public val invoiceSettings: InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b? = null,
    /**
     * A list of line items the customer is being quoted for. Each line item includes information about the product, the
     * quantity, and the resulting cost.
     */
    public val lineItems: List<InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * The account on behalf of which to charge.
     */
    public val onBehalfOf: InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02? = null,
    /**
     * When creating a subscription or subscription schedule, the specified configuration data will be used. There must be
     * at least one line item with a recurring price for a subscription or subscription schedule to be created. A
     * subscription schedule is created if `subscription_data[effective_date]` is present and in the future, otherwise a
     * subscription is created.
     */
    public val subscriptionData: InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4? = null,
    /**
     * ID of the test clock to attach to the quote.
     */
    public val testClock: String? = null,
    /**
     * The data with which to automatically create a Transfer for each of the invoices.
     */
    public val transferData: InlineV1QuotesPostRequestFormTransferDataX3547f5d0? = null,
) {
    public class Builder {
        /**
         * The amount of the application fee (if any) that will be requested to be applied to the payment and transferred to
         * the application owner's Stripe account. There cannot be any line items with recurring prices when using this
         * field.
         */
        public var applicationFeeAmount: InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d? =
            null

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
         * subscription invoice total that will be transferred to the application owner's Stripe account. There must be at
         * least 1 line item with a recurring price to use this field.
         */
        public var applicationFeePercent: InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e? =
            null

        /**
         * Settings for automatic tax lookup for this quote and resulting invoices and subscriptions.
         */
        public var automaticTax: InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca? = null

        /**
         * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay
         * invoices at the end of the subscription cycle or at invoice finalization using the default payment method
         * attached to the subscription or customer. When sending an invoice, Stripe will email your customer an invoice
         * with payment instructions and mark the subscription as `active`. Defaults to `charge_automatically`.
         */
        public var collectionMethod: InlineV1QuotesPostRequestFormCollectionMethodXf5619bcc? = null

        /**
         * The customer for which this quote belongs to. A customer is required before finalizing the quote. Once specified,
         * it cannot be changed.
         */
        public var customer: String? = null

        /**
         * The account for which this quote belongs to. A customer or account is required before finalizing the quote. Once
         * specified, it cannot be changed.
         */
        public var customerAccount: String? = null

        /**
         * The tax rates that will apply to any line item that does not have `tax_rates` set.
         */
        public var defaultTaxRates: InlineV1QuotesPostRequestFormDefaultTaxRatesXd69b66d3? = null

        /**
         * A description that will be displayed on the quote PDF. If no value is passed, the default description configured
         * in your [quote template settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
         */
        public var description: InlineV1QuotesPostRequestFormDescriptionX670239c2? = null

        /**
         * The discounts applied to the quote.
         */
        public var discounts: InlineV1QuotesPostRequestFormDiscountsXcce02801? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * A future timestamp on which the quote will be canceled if in `open` or `draft` status. Measured in seconds since
         * the Unix epoch. If no value is passed, the default expiration date configured in your [quote template
         * settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
         */
        public var expiresAt: Int? = null

        /**
         * A footer that will be displayed on the quote PDF. If no value is passed, the default footer configured in your
         * [quote template settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
         */
        public var footer: InlineV1QuotesPostRequestFormFooterXd71da30b? = null

        /**
         * Clone an existing quote. The new quote will be created in `status=draft`. When using this parameter, you cannot
         * specify any other parameters except for `expires_at`.
         */
        public var fromQuote: InlineV1QuotesPostRequestFormFromQuoteXa868383a? = null

        /**
         * A header that will be displayed on the quote PDF. If no value is passed, the default header configured in your
         * [quote template settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
         */
        public var `header`: InlineV1QuotesPostRequestFormHeaderX35374ae5? = null

        /**
         * All invoices will be billed using the specified settings.
         */
        public var invoiceSettings: InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b? = null

        /**
         * A list of line items the customer is being quoted for. Each line item includes information about the product, the
         * quantity, and the resulting cost.
         */
        public var lineItems: List<InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: Map<String, String>? = null

        /**
         * The account on behalf of which to charge.
         */
        public var onBehalfOf: InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02? = null

        /**
         * When creating a subscription or subscription schedule, the specified configuration data will be used. There must
         * be at least one line item with a recurring price for a subscription or subscription schedule to be created. A
         * subscription schedule is created if `subscription_data[effective_date]` is present and in the future, otherwise a
         * subscription is created.
         */
        public var subscriptionData: InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4? = null

        /**
         * ID of the test clock to attach to the quote.
         */
        public var testClock: String? = null

        /**
         * The data with which to automatically create a Transfer for each of the invoices.
         */
        public var transferData: InlineV1QuotesPostRequestFormTransferDataX3547f5d0? = null

        public fun build(): InlineV1QuotesPostRequestFormX99c4efb9 =
            InlineV1QuotesPostRequestFormX99c4efb9(
                applicationFeeAmount = applicationFeeAmount,
                applicationFeePercent = applicationFeePercent,
                automaticTax = automaticTax,
                collectionMethod = collectionMethod,
                customer = customer,
                customerAccount = customerAccount,
                defaultTaxRates = defaultTaxRates,
                description = description,
                discounts = discounts,
                expand = expand,
                expiresAt = expiresAt,
                footer = footer,
                fromQuote = fromQuote,
                header = header,
                invoiceSettings = invoiceSettings,
                lineItems = lineItems,
                metadata = metadata,
                onBehalfOf = onBehalfOf,
                subscriptionData = subscriptionData,
                testClock = testClock,
                transferData = transferData,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormX99c4efb9 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormX99c4efb9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormX99c4efb9 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormX99c4efb9")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("InlineV1QuotesPostRequestFormX99c4efb9 must be a JSON object")
            return InlineV1QuotesPostRequestFormX99c4efb9(
                applicationFeeAmount =
                    rawObject["application_fee_amount"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormApplicationFeeAmountX3daeb39d>(it)
                    },
                applicationFeePercent =
                    rawObject["application_fee_percent"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormApplicationFeePercentXb102a83e>(it)
                    },
                automaticTax =
                    rawObject["automatic_tax"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormAutomaticTaxX2c209eca>(it)
                    },
                collectionMethod =
                    rawObject["collection_method"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormCollectionMethodXf5619bcc>(it)
                    },
                customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
                customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
                defaultTaxRates =
                    rawObject["default_tax_rates"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDefaultTaxRatesXd69b66d3>(it)
                    },
                description =
                    rawObject["description"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDescriptionX670239c2>(it)
                    },
                discounts =
                    rawObject["discounts"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormDiscountsXcce02801>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
                footer =
                    rawObject["footer"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormFooterXd71da30b>(
                            it,
                        )
                    },
                fromQuote =
                    rawObject["from_quote"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormFromQuoteXa868383a>(it)
                    },
                header =
                    rawObject["header"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormHeaderX35374ae5>(
                            it,
                        )
                    },
                invoiceSettings =
                    rawObject["invoice_settings"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormInvoiceSettingsX8baa645b>(it)
                    },
                lineItems =
                    rawObject["line_items"]?.let {
                        json.decodeFromJsonElement<List<InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70>>(it)
                    },
                metadata =
                    rawObject["metadata"]?.let {
                        json
                            .decodeFromJsonElement<Map<String, String>>(
                                it,
                            )
                    },
                onBehalfOf =
                    rawObject["on_behalf_of"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormOnBehalfOfX04b5ad02>(it)
                    },
                subscriptionData =
                    rawObject["subscription_data"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataXf3ca95d4>(it)
                    },
                testClock = rawObject["test_clock"]?.let { json.decodeFromJsonElement<String>(it) },
                transferData =
                    rawObject["transfer_data"]?.let {
                        json.decodeFromJsonElement<InlineV1QuotesPostRequestFormTransferDataX3547f5d0>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormX99c4efb9,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormX99c4efb9")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
                    value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
                    value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
                    value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
                    value.customer?.let { put("customer", it) }
                    value.customerAccount?.let { put("customer_account", it) }
                    value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", json.encodeToJsonElement(it)) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
                    value.footer?.let { put("footer", json.encodeToJsonElement(it)) }
                    value.fromQuote?.let { put("from_quote", json.encodeToJsonElement(it)) }
                    value.header?.let { put("header", json.encodeToJsonElement(it)) }
                    value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
                    value.lineItems?.let { put("line_items", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
                    value.subscriptionData?.let { put("subscription_data", json.encodeToJsonElement(it)) }
                    value.testClock?.let { put("test_clock", it) }
                    value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1QuotesPostRequestFormX99c4efb9(
    block: InlineV1QuotesPostRequestFormX99c4efb9.Builder.() -> Unit,
): InlineV1QuotesPostRequestFormX99c4efb9 = InlineV1QuotesPostRequestFormX99c4efb9.build(block)
