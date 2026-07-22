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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormX91d1b175.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormX91d1b175(
    /**
     * A list of prices and quantities that will generate invoice items appended to the next invoice for this
     * subscription. You may pass up to 20 items.
     */
    public val addInvoiceItems: List<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX887b9cd0>? = null,
    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the application owner's Stripe account. The request must be
     * made by a platform account on a connected account in order to set an application fee percentage. For more
     * information, see the application fees
     * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
     */
    public val applicationFeePercent: InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078? = null,
    /**
     * Automatic tax settings for this subscription.
     */
    public val automaticTax: InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd? = null,
    /**
     * A past timestamp to backdate the subscription's start date to. If set, the first invoice will contain line items
     * for the timespan between the start date and the current time. Can be combined with trials and the billing cycle
     * anchor.
     */
    public val backdateStartDate: Int? = null,
    /**
     * A future timestamp in UTC format to anchor the subscription's [billing
     * cycle](https://docs.stripe.com/subscriptions/billing-cycle). The anchor is the reference point that aligns future
     * billing cycle dates. It sets the day of week for `week` intervals, the day of month for `month` and `year`
     * intervals, and the month of year for `year` intervals.
     */
    public val billingCycleAnchor: Int? = null,
    /**
     * Mutually exclusive with billing_cycle_anchor and only valid with monthly and yearly price intervals. When provided,
     * the billing_cycle_anchor is set to the next occurrence of the day_of_month at the hour, minute, and second UTC.
     */
    public val billingCycleAnchorConfig: InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838? = null,
    /**
     * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
     */
    public val billingMode: InlineV1SubscriptionsPostRequestFormBillingModeX933573e8? = null,
    /**
     * Sets the billing schedules for the subscription.
     */
    public val billingSchedules: List<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c>? = null,
    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. When
     * updating, pass an empty string to remove previously-defined thresholds.
     */
    public val billingThresholds: InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751? = null,
    /**
     * A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will
     * cause a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this
     * will always cause a proration for that period.
     */
    public val cancelAt: InlineV1SubscriptionsPostRequestFormCancelAtX90e20647? = null,
    /**
     * Indicate whether this subscription should cancel at the end of the current period (`current_period_end`). Defaults
     * to `false`.
     */
    public val cancelAtPeriodEnd: Boolean? = null,
    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay this
     * subscription at the end of the cycle using the default source attached to the customer. When sending an invoice,
     * Stripe will email your customer an invoice with payment instructions and mark the subscription as `active`.
     * Defaults to `charge_automatically`.
     */
    public val collectionMethod: InlineV1SubscriptionsPostRequestFormCollectionMethodX000dc0ad? = null,
    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
     * [supported currency](https://stripe.com/docs/currencies).
     */
    public val currency: String? = null,
    /**
     * The identifier of the customer to subscribe.
     */
    public val customer: String? = null,
    /**
     * The identifier of the account representing the customer to subscribe.
     */
    public val customerAccount: String? = null,
    /**
     * Number of days a customer has to pay invoices generated by this subscription. Valid only for subscriptions where
     * `collection_method` is set to `send_invoice`.
     */
    public val daysUntilDue: Int? = null,
    /**
     * ID of the default payment method for the subscription. It must belong to the customer associated with the
     * subscription. This takes precedence over `default_source`. If neither are set, invoices will use the customer's
     * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_sett
     * ings-default_payment_method) or
     * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
     */
    public val defaultPaymentMethod: String? = null,
    /**
     * ID of the default payment source for the subscription. It must belong to the customer associated with the
     * subscription and be in a chargeable state. If `default_payment_method` is also set, `default_payment_method` will
     * take precedence. If neither are set, invoices will use the customer's
     * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_sett
     * ings-default_payment_method) or
     * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
     */
    public val defaultSource: String? = null,
    /**
     * The tax rates that will apply to any subscription item that does not have `tax_rates` set. Invoices created will
     * have their `default_tax_rates` populated from the subscription.
     */
    public val defaultTaxRates: InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX3d96bc44? = null,
    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to optionally store an
     * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
     */
    public val description: String? = null,
    /**
     * The coupons to redeem into discounts for the subscription. If not specified or empty, inherits the discount from
     * the subscription's customer.
     */
    public val discounts: InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * All invoices will be billed using the specified settings.
     */
    public val invoiceSettings: InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76? = null,
    /**
     * A list of up to 20 subscription items, each with an attached price.
     */
    public val items: List<InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836>? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format. Individual keys can be unset by posting
     * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public val metadata: InlineV1SubscriptionsPostRequestFormMetadataX303ca204? = null,
    /**
     * Indicates if a customer is on or off-session while an invoice payment is attempted. Defaults to `false`
     * (on-session).
     */
    public val offSession: Boolean? = null,
    /**
     * The account on behalf of which to charge, for each of the subscription's invoices.
     */
    public val onBehalfOf: InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa? = null,
    /**
     * Controls how Stripe handles the first invoice when payment is required and
     * `collection_method=charge_automatically`. Subscriptions with `collection_method=send_invoice` are automatically
     * activated regardless of the first Invoice status.
     */
    public val paymentBehavior: InlineV1SubscriptionsPostRequestFormPaymentBehaviorX62aac0c5? = null,
    /**
     * Payment settings to pass to invoices created by the subscription.
     */
    public val paymentSettings: InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44? = null,
    /**
     * Specifies an interval for how often to bill for any pending invoice items. It is analogous to calling [Create an
     * invoice](/api/invoices/create) for the given subscription at the specified interval.
     */
    public val pendingInvoiceItemInterval:
        InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af? = null,
    /**
     * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) resulting from the
     * `billing_cycle_anchor`. If no value is passed, the default is `create_prorations`.
     */
    public val prorationBehavior: InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4? = null,
    /**
     * If specified, the funds from the subscription's invoices will be transferred to the destination and the ID of the
     * resulting transfers will be found on the resulting charges.
     */
    public val transferData: InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b? = null,
    /**
     * Unix timestamp representing the end of the trial period the customer will get before being charged for the first
     * time. If set, trial_end will override the default trial period of the plan the customer is being subscribed to. The
     * special value `now` can be provided to end the customer's trial immediately. Can be at most two years from
     * `billing_cycle_anchor`. See [Using trial periods on
     * subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to learn more.
     */
    public val trialEnd: InlineV1SubscriptionsPostRequestFormTrialEndX48041713? = null,
    /**
     * Indicates if a plan's `trial_period_days` should be applied to the subscription. Setting `trial_end` per
     * subscription is preferred, and this defaults to `false`. Setting this flag to `true` together with `trial_end` is
     * not allowed. See [Using trial periods on subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to
     * learn more.
     */
    public val trialFromPlan: Boolean? = null,
    /**
     * Integer representing the number of trial period days before the customer is charged for the first time. This will
     * always overwrite any trials that might apply via a subscribed plan. See [Using trial periods on
     * subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to learn more.
     */
    public val trialPeriodDays: Int? = null,
    /**
     * Settings related to subscription trials.
     */
    public val trialSettings: InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9? = null,
) {
    public class Builder {
        /**
         * A list of prices and quantities that will generate invoice items appended to the next invoice for this
         * subscription. You may pass up to 20 items.
         */
        public var addInvoiceItems:
            List<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX887b9cd0>? = null

        /**
         * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
         * subscription invoice total that will be transferred to the application owner's Stripe account. The request must
         * be made by a platform account on a connected account in order to set an application fee percentage. For more
         * information, see the application fees
         * [documentation](https://stripe.com/docs/connect/subscriptions#collecting-fees-on-subscriptions).
         */
        public var applicationFeePercent:
            InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078? = null

        /**
         * Automatic tax settings for this subscription.
         */
        public var automaticTax: InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd? = null

        /**
         * A past timestamp to backdate the subscription's start date to. If set, the first invoice will contain line items
         * for the timespan between the start date and the current time. Can be combined with trials and the billing cycle
         * anchor.
         */
        public var backdateStartDate: Int? = null

        /**
         * A future timestamp in UTC format to anchor the subscription's [billing
         * cycle](https://docs.stripe.com/subscriptions/billing-cycle). The anchor is the reference point that aligns future
         * billing cycle dates. It sets the day of week for `week` intervals, the day of month for `month` and `year`
         * intervals, and the month of year for `year` intervals.
         */
        public var billingCycleAnchor: Int? = null

        /**
         * Mutually exclusive with billing_cycle_anchor and only valid with monthly and yearly price intervals. When
         * provided, the billing_cycle_anchor is set to the next occurrence of the day_of_month at the hour, minute, and
         * second UTC.
         */
        public var billingCycleAnchorConfig:
            InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838? = null

        /**
         * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
         */
        public var billingMode: InlineV1SubscriptionsPostRequestFormBillingModeX933573e8? = null

        /**
         * Sets the billing schedules for the subscription.
         */
        public var billingSchedules:
            List<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c>? = null

        /**
         * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period. When
         * updating, pass an empty string to remove previously-defined thresholds.
         */
        public var billingThresholds: InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751? =
            null

        /**
         * A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will
         * cause a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this
         * will always cause a proration for that period.
         */
        public var cancelAt: InlineV1SubscriptionsPostRequestFormCancelAtX90e20647? = null

        /**
         * Indicate whether this subscription should cancel at the end of the current period (`current_period_end`).
         * Defaults to `false`.
         */
        public var cancelAtPeriodEnd: Boolean? = null

        /**
         * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay this
         * subscription at the end of the cycle using the default source attached to the customer. When sending an invoice,
         * Stripe will email your customer an invoice with payment instructions and mark the subscription as `active`.
         * Defaults to `charge_automatically`.
         */
        public var collectionMethod: InlineV1SubscriptionsPostRequestFormCollectionMethodX000dc0ad? =
            null

        /**
         * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
         * [supported currency](https://stripe.com/docs/currencies).
         */
        public var currency: String? = null

        /**
         * The identifier of the customer to subscribe.
         */
        public var customer: String? = null

        /**
         * The identifier of the account representing the customer to subscribe.
         */
        public var customerAccount: String? = null

        /**
         * Number of days a customer has to pay invoices generated by this subscription. Valid only for subscriptions where
         * `collection_method` is set to `send_invoice`.
         */
        public var daysUntilDue: Int? = null

        /**
         * ID of the default payment method for the subscription. It must belong to the customer associated with the
         * subscription. This takes precedence over `default_source`. If neither are set, invoices will use the customer's
         * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_se
         * ttings-default_payment_method) or
         * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
         */
        public var defaultPaymentMethod: String? = null

        /**
         * ID of the default payment source for the subscription. It must belong to the customer associated with the
         * subscription and be in a chargeable state. If `default_payment_method` is also set, `default_payment_method` will
         * take precedence. If neither are set, invoices will use the customer's
         * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_se
         * ttings-default_payment_method) or
         * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
         */
        public var defaultSource: String? = null

        /**
         * The tax rates that will apply to any subscription item that does not have `tax_rates` set. Invoices created will
         * have their `default_tax_rates` populated from the subscription.
         */
        public var defaultTaxRates: InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX3d96bc44? = null

        /**
         * The subscription's description, meant to be displayable to the customer. Use this field to optionally store an
         * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
         */
        public var description: String? = null

        /**
         * The coupons to redeem into discounts for the subscription. If not specified or empty, inherits the discount from
         * the subscription's customer.
         */
        public var discounts: InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c? = null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * All invoices will be billed using the specified settings.
         */
        public var invoiceSettings: InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76? = null

        /**
         * A list of up to 20 subscription items, each with an attached price.
         */
        public var items: List<InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836>? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format. Individual keys can be unset
         * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
         */
        public var metadata: InlineV1SubscriptionsPostRequestFormMetadataX303ca204? = null

        /**
         * Indicates if a customer is on or off-session while an invoice payment is attempted. Defaults to `false`
         * (on-session).
         */
        public var offSession: Boolean? = null

        /**
         * The account on behalf of which to charge, for each of the subscription's invoices.
         */
        public var onBehalfOf: InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa? = null

        /**
         * Controls how Stripe handles the first invoice when payment is required and
         * `collection_method=charge_automatically`. Subscriptions with `collection_method=send_invoice` are automatically
         * activated regardless of the first Invoice status.
         */
        public var paymentBehavior: InlineV1SubscriptionsPostRequestFormPaymentBehaviorX62aac0c5? = null

        /**
         * Payment settings to pass to invoices created by the subscription.
         */
        public var paymentSettings: InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44? = null

        /**
         * Specifies an interval for how often to bill for any pending invoice items. It is analogous to calling [Create an
         * invoice](/api/invoices/create) for the given subscription at the specified interval.
         */
        public var pendingInvoiceItemInterval:
            InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af? = null

        /**
         * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) resulting from
         * the `billing_cycle_anchor`. If no value is passed, the default is `create_prorations`.
         */
        public var prorationBehavior: InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4? =
            null

        /**
         * If specified, the funds from the subscription's invoices will be transferred to the destination and the ID of the
         * resulting transfers will be found on the resulting charges.
         */
        public var transferData: InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b? = null

        /**
         * Unix timestamp representing the end of the trial period the customer will get before being charged for the first
         * time. If set, trial_end will override the default trial period of the plan the customer is being subscribed to.
         * The special value `now` can be provided to end the customer's trial immediately. Can be at most two years from
         * `billing_cycle_anchor`. See [Using trial periods on
         * subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to learn more.
         */
        public var trialEnd: InlineV1SubscriptionsPostRequestFormTrialEndX48041713? = null

        /**
         * Indicates if a plan's `trial_period_days` should be applied to the subscription. Setting `trial_end` per
         * subscription is preferred, and this defaults to `false`. Setting this flag to `true` together with `trial_end` is
         * not allowed. See [Using trial periods on subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to
         * learn more.
         */
        public var trialFromPlan: Boolean? = null

        /**
         * Integer representing the number of trial period days before the customer is charged for the first time. This will
         * always overwrite any trials that might apply via a subscribed plan. See [Using trial periods on
         * subscriptions](https://docs.stripe.com/billing/subscriptions/trials) to learn more.
         */
        public var trialPeriodDays: Int? = null

        /**
         * Settings related to subscription trials.
         */
        public var trialSettings: InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormX91d1b175 =
            InlineV1SubscriptionsPostRequestFormX91d1b175(
                addInvoiceItems = addInvoiceItems,
                applicationFeePercent = applicationFeePercent,
                automaticTax = automaticTax,
                backdateStartDate = backdateStartDate,
                billingCycleAnchor = billingCycleAnchor,
                billingCycleAnchorConfig = billingCycleAnchorConfig,
                billingMode = billingMode,
                billingSchedules = billingSchedules,
                billingThresholds = billingThresholds,
                cancelAt = cancelAt,
                cancelAtPeriodEnd = cancelAtPeriodEnd,
                collectionMethod = collectionMethod,
                currency = currency,
                customer = customer,
                customerAccount = customerAccount,
                daysUntilDue = daysUntilDue,
                defaultPaymentMethod = defaultPaymentMethod,
                defaultSource = defaultSource,
                defaultTaxRates = defaultTaxRates,
                description = description,
                discounts = discounts,
                expand = expand,
                invoiceSettings = invoiceSettings,
                items = items,
                metadata = metadata,
                offSession = offSession,
                onBehalfOf = onBehalfOf,
                paymentBehavior = paymentBehavior,
                paymentSettings = paymentSettings,
                pendingInvoiceItemInterval = pendingInvoiceItemInterval,
                prorationBehavior = prorationBehavior,
                transferData = transferData,
                trialEnd = trialEnd,
                trialFromPlan = trialFromPlan,
                trialPeriodDays = trialPeriodDays,
                trialSettings = trialSettings,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormX91d1b175 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormX91d1b175> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormX91d1b175 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormX91d1b175")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormX91d1b175 must be a JSON object",
                    )
            return InlineV1SubscriptionsPostRequestFormX91d1b175(
                addInvoiceItems =
                    rawObject["add_invoice_items"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemX887b9cd0>>(
                                it,
                            )
                    },
                applicationFeePercent =
                    rawObject["application_fee_percent"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormApplicationFeePercentXeea79078>(
                            it,
                        )
                    },
                automaticTax =
                    rawObject["automatic_tax"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormAutomaticTaxX2895c5fd>(it)
                    },
                backdateStartDate =
                    rawObject["backdate_start_date"]?.let {
                        json.decodeFromJsonElement<Int>(
                            it,
                        )
                    },
                billingCycleAnchor = rawObject["billing_cycle_anchor"]?.let { json.decodeFromJsonElement<Int>(it) },
                billingCycleAnchorConfig =
                    rawObject["billing_cycle_anchor_config"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingCycleAnchorConfigX18b8a838>(
                                it,
                            )
                    },
                billingMode =
                    rawObject["billing_mode"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingModeX933573e8>(it)
                    },
                billingSchedules =
                    rawObject["billing_schedules"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormBillingSchedulesItemX2aa4b98c>>(
                                it,
                            )
                    },
                billingThresholds =
                    rawObject["billing_thresholds"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormBillingThresholdsXc724c751>(it)
                    },
                cancelAt =
                    rawObject["cancel_at"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormCancelAtX90e20647>(it)
                    },
                cancelAtPeriodEnd =
                    rawObject["cancel_at_period_end"]?.let {
                        json
                            .decodeFromJsonElement<Boolean>(
                                it,
                            )
                    },
                collectionMethod =
                    rawObject["collection_method"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormCollectionMethodX000dc0ad>(it)
                    },
                currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
                customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
                customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
                daysUntilDue = rawObject["days_until_due"]?.let { json.decodeFromJsonElement<Int>(it) },
                defaultPaymentMethod =
                    rawObject["default_payment_method"]?.let {
                        json.decodeFromJsonElement<String>(
                            it,
                        )
                    },
                defaultSource = rawObject["default_source"]?.let { json.decodeFromJsonElement<String>(it) },
                defaultTaxRates =
                    rawObject["default_tax_rates"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormDefaultTaxRatesX3d96bc44>(it)
                    },
                description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
                discounts =
                    rawObject["discounts"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormDiscountsX04b76c3c>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                invoiceSettings =
                    rawObject["invoice_settings"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormInvoiceSettingsXba14be76>(it)
                    },
                items =
                    rawObject["items"]?.let {
                        json.decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836>>(it)
                    },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormMetadataX303ca204>(it)
                    },
                offSession = rawObject["off_session"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                onBehalfOf =
                    rawObject["on_behalf_of"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormOnBehalfOfXb0fbbfaa>(it)
                    },
                paymentBehavior =
                    rawObject["payment_behavior"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentBehaviorX62aac0c5>(it)
                    },
                paymentSettings =
                    rawObject["payment_settings"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPaymentSettingsX4fbccb44>(it)
                    },
                pendingInvoiceItemInterval =
                    rawObject["pending_invoice_item_interval"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormPendingInvoiceItemIntervalXa949b0af>(
                                it,
                            )
                    },
                prorationBehavior =
                    rawObject["proration_behavior"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormProrationBehaviorXebd81fe4>(it)
                    },
                transferData =
                    rawObject["transfer_data"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormTransferDataX3d77fe0b>(it)
                    },
                trialEnd =
                    rawObject["trial_end"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormTrialEndX48041713>(it)
                    },
                trialFromPlan =
                    rawObject["trial_from_plan"]?.let {
                        json
                            .decodeFromJsonElement<Boolean>(
                                it,
                            )
                    },
                trialPeriodDays = rawObject["trial_period_days"]?.let { json.decodeFromJsonElement<Int>(it) },
                trialSettings =
                    rawObject["trial_settings"]?.let {
                        json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormX91d1b175,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormX91d1b175")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.addInvoiceItems?.let { put("add_invoice_items", json.encodeToJsonElement(it)) }
                    value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
                    value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
                    value.backdateStartDate?.let { put("backdate_start_date", json.encodeToJsonElement(it)) }
                    value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
                    value.billingCycleAnchorConfig?.let {
                        put(
                            "billing_cycle_anchor_config",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.billingMode?.let { put("billing_mode", json.encodeToJsonElement(it)) }
                    value.billingSchedules?.let { put("billing_schedules", json.encodeToJsonElement(it)) }
                    value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
                    value.cancelAt?.let { put("cancel_at", json.encodeToJsonElement(it)) }
                    value.cancelAtPeriodEnd?.let { put("cancel_at_period_end", json.encodeToJsonElement(it)) }
                    value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
                    value.currency?.let { put("currency", it) }
                    value.customer?.let { put("customer", it) }
                    value.customerAccount?.let { put("customer_account", it) }
                    value.daysUntilDue?.let { put("days_until_due", json.encodeToJsonElement(it)) }
                    value.defaultPaymentMethod?.let { put("default_payment_method", it) }
                    value.defaultSource?.let { put("default_source", it) }
                    value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
                    value.description?.let { put("description", it) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
                    value.items?.let { put("items", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.offSession?.let { put("off_session", json.encodeToJsonElement(it)) }
                    value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
                    value.paymentBehavior?.let { put("payment_behavior", json.encodeToJsonElement(it)) }
                    value.paymentSettings?.let { put("payment_settings", json.encodeToJsonElement(it)) }
                    value.pendingInvoiceItemInterval?.let {
                        put(
                            "pending_invoice_item_interval",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
                    value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
                    value.trialEnd?.let { put("trial_end", json.encodeToJsonElement(it)) }
                    value.trialFromPlan?.let { put("trial_from_plan", json.encodeToJsonElement(it)) }
                    value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
                    value.trialSettings?.let { put("trial_settings", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormX91d1b175(
    block: InlineV1SubscriptionsPostRequestFormX91d1b175.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormX91d1b175 = InlineV1SubscriptionsPostRequestFormX91d1b175.build(block)
