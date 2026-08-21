package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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

@ConsistentCopyVisibility
@Serializable
public data class SubscriptionView internal constructor(
  public val application: InlineSubscriptionApplicationX28439c61? = null,
  @SerialName("application_fee_percent")
  public val applicationFeePercent: Double? = null,
  @SerialName("automatic_tax")
  public val automaticTax: SubscriptionAutomaticTax,
  @SerialName("billing_cycle_anchor")
  public val billingCycleAnchor: Int,
  @SerialName("billing_cycle_anchor_config")
  public val billingCycleAnchorConfig: InlineSubscriptionBillingCycleAnchorConfigXea24da68? = null,
  @SerialName("billing_mode")
  public val billingMode: SubscriptionsResourceBillingMode,
  @SerialName("billing_schedules")
  public val billingSchedules: List<SubscriptionsResourceBillingSchedules>,
  @SerialName("billing_thresholds")
  public val billingThresholds: InlineSubscriptionBillingThresholdsX6e690ced? = null,
  @SerialName("cancel_at")
  public val cancelAt: Int? = null,
  @SerialName("cancel_at_period_end")
  public val cancelAtPeriodEnd: Boolean,
  @SerialName("canceled_at")
  public val canceledAt: Int? = null,
  @SerialName("cancellation_details")
  public val cancellationDetails: InlineSubscriptionCancellationDetailsX0e11eeaf? = null,
  @SerialName("collection_method")
  public val collectionMethod: InlineSubscriptionCollectionMethodX68775f71,
  public val created: Int,
  public val currency: String,
  public val customer: InlineSubscriptionCustomerX412ed7e8,
  @SerialName("customer_account")
  public val customerAccount: String? = null,
  @SerialName("days_until_due")
  public val daysUntilDue: Int? = null,
  @SerialName("default_payment_method")
  public val defaultPaymentMethod: InlineSubscriptionDefaultPaymentMethodX14c25b83? = null,
  @SerialName("default_source")
  public val defaultSource: InlineSubscriptionDefaultSourceXf0c66116? = null,
  @SerialName("default_tax_rates")
  public val defaultTaxRates: List<TaxRate>? = null,
  public val description: String? = null,
  public val discounts: List<InlineSubscriptionDiscountsItemX69962ce0>,
  @SerialName("ended_at")
  public val endedAt: Int? = null,
  public val id: String,
  @SerialName("invoice_settings")
  public val invoiceSettings: SubscriptionsResourceSubscriptionInvoiceSettings,
  public val items: InlineSubscriptionItemsX9b172b6f,
  @SerialName("latest_invoice")
  public val latestInvoice: InlineSubscriptionLatestInvoiceX182fda92? = null,
  public val livemode: Boolean,
  @SerialName("managed_payments")
  public val managedPayments: InlineSubscriptionManagedPaymentsX33f1992e? = null,
  public val metadata: Map<String, String>,
  @SerialName("next_pending_invoice_item_invoice")
  public val nextPendingInvoiceItemInvoice: Int? = null,
  @SerialName("object")
  public val objectValue: InlineSubscriptionObjectValueX9137bb29,
  @SerialName("on_behalf_of")
  public val onBehalfOf: InlineSubscriptionOnBehalfOfXc7863d56? = null,
  @SerialName("pause_collection")
  public val pauseCollection: InlineSubscriptionPauseCollectionXf3d09645? = null,
  @SerialName("payment_settings")
  public val paymentSettings: InlineSubscriptionPaymentSettingsXcb421fa6? = null,
  @SerialName("pending_invoice_item_interval")
  public val pendingInvoiceItemInterval:
      InlineSubscriptionPendingInvoiceItemIntervalXe65def85? = null,
  @SerialName("pending_setup_intent")
  public val pendingSetupIntent: InlineSubscriptionPendingSetupIntentXec0dee4e? = null,
  @SerialName("pending_update")
  public val pendingUpdate: InlineSubscriptionPendingUpdateXa60c9b03? = null,
  @SerialName("presentment_details")
  public val presentmentDetails: SubscriptionsResourceSubscriptionPresentmentDetails? = null,
  public val schedule: InlineSubscriptionScheduleX6d170f2a? = null,
  @SerialName("start_date")
  public val startDate: Int,
  public val status: InlineSubscriptionStatusXc06e66c3,
  @SerialName("test_clock")
  public val testClock: InlineSubscriptionTestClockXbc391647? = null,
  @SerialName("transfer_data")
  public val transferData: InlineSubscriptionTransferDataX382db867? = null,
  @SerialName("trial_end")
  public val trialEnd: Int? = null,
  @SerialName("trial_settings")
  public val trialSettings: InlineSubscriptionTrialSettingsXb02f1582? = null,
  @SerialName("trial_start")
  public val trialStart: Int? = null,
)

/**
 * Subscriptions allow you to charge a customer on a recurring basis.
 *
 * Related guide: [Creating subscriptions](https://docs.stripe.com/billing/subscriptions/creating)
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription
 */
@Serializable(with = Subscription.Serializer::class)
public class Subscription(
  public val automaticTax: SubscriptionAutomaticTax,
  /**
   * The reference point that aligns future [billing cycle](https://docs.stripe.com/subscriptions/billing-cycle) dates.
   * It sets the day of week for `week` intervals, the day of month for `month` and `year` intervals, and the month of
   * year for `year` intervals. The timestamp is in UTC format.
   */
  public val billingCycleAnchor: Int,
  public val billingMode: SubscriptionsResourceBillingMode,
  billingSchedules: List<SubscriptionsResourceBillingSchedules>,
  /**
   * Whether this subscription will (if `status=active`) or did (if `status=canceled`) cancel at the end of the current
   * billing period.
   */
  public val cancelAtPeriodEnd: Boolean,
  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay this
   * subscription at the end of the cycle using the default source attached to the customer. When sending an invoice,
   * Stripe will email your customer an invoice with payment instructions and mark the subscription as `active`.
   */
  public val collectionMethod: InlineSubscriptionCollectionMethodX68775f71,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  /**
   * ID of the customer who owns the subscription.
   */
  public val customer: InlineSubscriptionCustomerX412ed7e8,
  discounts: List<InlineSubscriptionDiscountsItemX69962ce0>,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  public val invoiceSettings: SubscriptionsResourceSubscriptionInvoiceSettings,
  /**
   * List of subscription items, each with an attached price.
   */
  public val items: InlineSubscriptionItemsX9b172b6f,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  metadata: Map<String, String>,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineSubscriptionObjectValueX9137bb29,
  /**
   * Date when the subscription was first created. The date might differ from the `created` date due to backdating.
   */
  public val startDate: Int,
  /**
   * Possible values are `incomplete`, `incomplete_expired`, `trialing`, `active`, `past_due`, `canceled`, `unpaid`, or
   * `paused`.
   *
   * For `collection_method=charge_automatically` a subscription moves into `incomplete` if the initial payment attempt
   * fails. A subscription in this status can only have metadata and default_source updated. Once the first invoice is
   * paid, the subscription moves into an `active` status. If the first invoice is not paid within 23 hours, the
   * subscription transitions to `incomplete_expired`. This is a terminal status, the open invoice will be voided and no
   * further invoices will be generated.
   *
   * A subscription that is currently in a trial period is `trialing` and moves to `active` when the trial period is
   * over.
   *
   * A subscription can only enter a `paused` status [when a trial ends without a payment
   * method](https://docs.stripe.com/billing/subscriptions/trials#create-free-trials-without-payment). A `paused`
   * subscription doesn't generate invoices and can be resumed after your customer adds their payment method. The
   * `paused` status is different from [pausing
   * collection](https://docs.stripe.com/billing/subscriptions/pause-payment), which still generates invoices and leaves
   * the subscription's status unchanged.
   *
   * If subscription `collection_method=charge_automatically`, it becomes `past_due` when payment is required but cannot
   * be paid (due to failed payment or awaiting additional user actions). Once Stripe has exhausted all payment retry
   * attempts, the subscription will become `canceled` or `unpaid` (depending on your subscriptions settings).
   *
   * If subscription `collection_method=send_invoice` it becomes `past_due` when its invoice is not paid by the due
   * date, and `canceled` or `unpaid` if it is still not paid by an additional deadline after that. Note that when a
   * subscription has a status of `unpaid`, no subsequent invoices will be attempted (invoices will be created, but then
   * immediately automatically closed). After receiving updated payment information from a customer, you may choose to
   * reopen and pay their closed invoices.
   */
  public val status: InlineSubscriptionStatusXc06e66c3,
  /**
   * ID of the Connect Application that created the subscription.
   */
  public val application: InlineSubscriptionApplicationX28439c61? = null,
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
   * subscription invoice total that will be transferred to the application owner's Stripe account.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val applicationFeePercent: Double? = null,
  /**
   * The fixed values used to calculate the `billing_cycle_anchor`.
   */
  public val billingCycleAnchorConfig: InlineSubscriptionBillingCycleAnchorConfigXea24da68? = null,
  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period
   */
  public val billingThresholds: InlineSubscriptionBillingThresholdsX6e690ced? = null,
  /**
   * A date in the future at which the subscription will automatically get canceled
   */
  public val cancelAt: Int? = null,
  /**
   * If the subscription has been canceled, the date of that cancellation. If the subscription was canceled with
   * `cancel_at_period_end`, `canceled_at` will reflect the time of the most recent update request, not the end of the
   * subscription period when the subscription is automatically moved to a canceled state.
   */
  public val canceledAt: Int? = null,
  /**
   * Details about why this subscription was cancelled
   */
  public val cancellationDetails: InlineSubscriptionCancellationDetailsX0e11eeaf? = null,
  /**
   * ID of the account representing the customer who owns the subscription.
   */
  public val customerAccount: String? = null,
  /**
   * Number of days a customer has to pay invoices generated by this subscription. This value will be `null` for
   * subscriptions where `collection_method=charge_automatically`.
   */
  public val daysUntilDue: Int? = null,
  /**
   * ID of the default payment method for the subscription. It must belong to the customer associated with the
   * subscription. This takes precedence over `default_source`. If neither are set, invoices will use the customer's
   * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_sett
   * ings-default_payment_method) or
   * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
   */
  public val defaultPaymentMethod: InlineSubscriptionDefaultPaymentMethodX14c25b83? = null,
  /**
   * ID of the default payment source for the subscription. It must belong to the customer associated with the
   * subscription and be in a chargeable state. If `default_payment_method` is also set, `default_payment_method` will
   * take precedence. If neither are set, invoices will use the customer's
   * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_sett
   * ings-default_payment_method) or
   * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
   */
  public val defaultSource: InlineSubscriptionDefaultSourceXf0c66116? = null,
  defaultTaxRates: List<TaxRate>? = null,
  /**
   * The subscription's description, meant to be displayable to the customer. Use this field to optionally store an
   * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
   */
  public val description: String? = null,
  /**
   * If the subscription has ended, the date the subscription ended.
   */
  public val endedAt: Int? = null,
  /**
   * The most recent invoice this subscription has generated over its lifecycle (for example, when it cycles or is
   * updated).
   */
  public val latestInvoice: InlineSubscriptionLatestInvoiceX182fda92? = null,
  /**
   * Settings for Managed Payments for this Subscription and resulting [Invoices](/api/invoices/object) and
   * [PaymentIntents](/api/payment_intents/object).
   */
  public val managedPayments: InlineSubscriptionManagedPaymentsX33f1992e? = null,
  /**
   * Specifies the approximate timestamp on which any pending invoice items will be billed according to the schedule
   * provided at `pending_invoice_item_interval`.
   */
  public val nextPendingInvoiceItemInvoice: Int? = null,
  /**
   * The account (if any) the charge was made on behalf of for charges associated with this subscription. See the
   * [Connect documentation](https://docs.stripe.com/connect/subscriptions#on-behalf-of) for details.
   */
  public val onBehalfOf: InlineSubscriptionOnBehalfOfXc7863d56? = null,
  /**
   * If specified, payment collection for this subscription will be paused. Note that the subscription status will be
   * unchanged and will not be updated to `paused`. Learn more about [pausing
   * collection](https://docs.stripe.com/billing/subscriptions/pause-payment).
   */
  public val pauseCollection: InlineSubscriptionPauseCollectionXf3d09645? = null,
  /**
   * Payment settings passed on to invoices created by the subscription.
   */
  public val paymentSettings: InlineSubscriptionPaymentSettingsXcb421fa6? = null,
  /**
   * Specifies an interval for how often to bill for any pending invoice items. It is analogous to calling [Create an
   * invoice](/api/invoices/create) for the given subscription at the specified interval.
   */
  public val pendingInvoiceItemInterval:
      InlineSubscriptionPendingInvoiceItemIntervalXe65def85? = null,
  /**
   * You can use this [SetupIntent](https://docs.stripe.com/api/setup_intents) to collect user authentication when
   * creating a subscription without immediate payment or updating a subscription's payment method, allowing you to
   * optimize for off-session payments. Learn more in the [SCA Migration
   * Guide](https://docs.stripe.com/billing/migration/strong-customer-authentication#scenario-2).
   */
  public val pendingSetupIntent: InlineSubscriptionPendingSetupIntentXec0dee4e? = null,
  /**
   * If specified, [pending updates](https://docs.stripe.com/billing/subscriptions/pending-updates) that will be applied
   * to the subscription once the `latest_invoice` has been paid.
   */
  public val pendingUpdate: InlineSubscriptionPendingUpdateXa60c9b03? = null,
  public val presentmentDetails: SubscriptionsResourceSubscriptionPresentmentDetails? = null,
  /**
   * The schedule attached to the subscription
   */
  public val schedule: InlineSubscriptionScheduleX6d170f2a? = null,
  /**
   * ID of the test clock this subscription belongs to.
   */
  public val testClock: InlineSubscriptionTestClockXbc391647? = null,
  /**
   * The account (if any) the subscription's payments will be attributed to for tax reporting, and where funds from each
   * payment will be transferred to for each of the subscription's invoices.
   */
  public val transferData: InlineSubscriptionTransferDataX382db867? = null,
  /**
   * If the subscription has a trial, the end of that trial.
   */
  public val trialEnd: Int? = null,
  /**
   * Settings related to subscription trials.
   */
  public val trialSettings: InlineSubscriptionTrialSettingsXb02f1582? = null,
  /**
   * If the subscription has a trial, the beginning of that trial.
   */
  public val trialStart: Int? = null,
) {
  /**
   * Billing schedules for this subscription.
   */
  public val billingSchedules: List<SubscriptionsResourceBillingSchedules> =
      billingSchedules.toList()

  /**
   * The discounts applied to the subscription. Subscription item discounts are applied before subscription discounts.
   * Use `expand[]=discounts` to expand each discount.
   */
  public val discounts: List<InlineSubscriptionDiscountsItemX69962ce0> = discounts.toList()

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  /**
   * The tax rates that will apply to any subscription item that does not have `tax_rates` set. Invoices created will
   * have their `default_tax_rates` populated from the subscription.
   */
  public val defaultTaxRates: List<TaxRate>? =
      defaultTaxRates?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var automaticTaxValue: SubscriptionAutomaticTax? = null

    public var automaticTax: SubscriptionAutomaticTax
      get() = requireNotNull(automaticTaxValue) { "automaticTax is required" }
      set(`value`) {
        automaticTaxValue = value
      }

    private var billingCycleAnchorValue: Int? = null

    public var billingCycleAnchor: Int
      get() = requireNotNull(billingCycleAnchorValue) { "billingCycleAnchor is required" }
      set(`value`) {
        billingCycleAnchorValue = value
      }

    private var billingModeValue: SubscriptionsResourceBillingMode? = null

    public var billingMode: SubscriptionsResourceBillingMode
      get() = requireNotNull(billingModeValue) { "billingMode is required" }
      set(`value`) {
        billingModeValue = value
      }

    private var billingSchedulesValue: List<SubscriptionsResourceBillingSchedules>? = null

    public var billingSchedules: List<SubscriptionsResourceBillingSchedules>
      get() = requireNotNull(billingSchedulesValue) { "billingSchedules is required" }.toList()
      set(`value`) {
        billingSchedulesValue = value.toList()
      }

    private var cancelAtPeriodEndValue: Boolean? = null

    public var cancelAtPeriodEnd: Boolean
      get() = requireNotNull(cancelAtPeriodEndValue) { "cancelAtPeriodEnd is required" }
      set(`value`) {
        cancelAtPeriodEndValue = value
      }

    private var collectionMethodValue: InlineSubscriptionCollectionMethodX68775f71? = null

    public var collectionMethod: InlineSubscriptionCollectionMethodX68775f71
      get() = requireNotNull(collectionMethodValue) { "collectionMethod is required" }
      set(`value`) {
        collectionMethodValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var customerValue: InlineSubscriptionCustomerX412ed7e8? = null

    public var customer: InlineSubscriptionCustomerX412ed7e8
      get() = requireNotNull(customerValue) { "customer is required" }
      set(`value`) {
        customerValue = value
      }

    private var discountsValue: List<InlineSubscriptionDiscountsItemX69962ce0>? = null

    public var discounts: List<InlineSubscriptionDiscountsItemX69962ce0>
      get() = requireNotNull(discountsValue) { "discounts is required" }.toList()
      set(`value`) {
        discountsValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var invoiceSettingsValue: SubscriptionsResourceSubscriptionInvoiceSettings? = null

    public var invoiceSettings: SubscriptionsResourceSubscriptionInvoiceSettings
      get() = requireNotNull(invoiceSettingsValue) { "invoiceSettings is required" }
      set(`value`) {
        invoiceSettingsValue = value
      }

    private var itemsValue: InlineSubscriptionItemsX9b172b6f? = null

    public var items: InlineSubscriptionItemsX9b172b6f
      get() = requireNotNull(itemsValue) { "items is required" }
      set(`value`) {
        itemsValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    private var objectValueValue: InlineSubscriptionObjectValueX9137bb29? = null

    public var objectValue: InlineSubscriptionObjectValueX9137bb29
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var startDateValue: Int? = null

    public var startDate: Int
      get() = requireNotNull(startDateValue) { "startDate is required" }
      set(`value`) {
        startDateValue = value
      }

    private var statusValue: InlineSubscriptionStatusXc06e66c3? = null

    public var status: InlineSubscriptionStatusXc06e66c3
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * ID of the Connect Application that created the subscription.
     */
    public var application: InlineSubscriptionApplicationX28439c61? = null

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the application owner's Stripe account.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var applicationFeePercent: Double? = null

    /**
     * The fixed values used to calculate the `billing_cycle_anchor`.
     */
    public var billingCycleAnchorConfig: InlineSubscriptionBillingCycleAnchorConfigXea24da68? = null

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period
     */
    public var billingThresholds: InlineSubscriptionBillingThresholdsX6e690ced? = null

    /**
     * A date in the future at which the subscription will automatically get canceled
     */
    public var cancelAt: Int? = null

    /**
     * If the subscription has been canceled, the date of that cancellation. If the subscription was canceled with
     * `cancel_at_period_end`, `canceled_at` will reflect the time of the most recent update request, not the end of the
     * subscription period when the subscription is automatically moved to a canceled state.
     */
    public var canceledAt: Int? = null

    /**
     * Details about why this subscription was cancelled
     */
    public var cancellationDetails: InlineSubscriptionCancellationDetailsX0e11eeaf? = null

    /**
     * ID of the account representing the customer who owns the subscription.
     */
    public var customerAccount: String? = null

    /**
     * Number of days a customer has to pay invoices generated by this subscription. This value will be `null` for
     * subscriptions where `collection_method=charge_automatically`.
     */
    public var daysUntilDue: Int? = null

    /**
     * ID of the default payment method for the subscription. It must belong to the customer associated with the
     * subscription. This takes precedence over `default_source`. If neither are set, invoices will use the customer's
     * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_se
     * ttings-default_payment_method) or
     * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
     */
    public var defaultPaymentMethod: InlineSubscriptionDefaultPaymentMethodX14c25b83? = null

    /**
     * ID of the default payment source for the subscription. It must belong to the customer associated with the
     * subscription and be in a chargeable state. If `default_payment_method` is also set, `default_payment_method` will
     * take precedence. If neither are set, invoices will use the customer's
     * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_se
     * ttings-default_payment_method) or
     * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
     */
    public var defaultSource: InlineSubscriptionDefaultSourceXf0c66116? = null

    private var defaultTaxRatesValue: List<TaxRate>? = null

    /**
     * The tax rates that will apply to any subscription item that does not have `tax_rates` set. Invoices created will
     * have their `default_tax_rates` populated from the subscription.
     */
    public var defaultTaxRates: List<TaxRate>?
      get() = defaultTaxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultTaxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to optionally store an
     * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
     */
    public var description: String? = null

    /**
     * If the subscription has ended, the date the subscription ended.
     */
    public var endedAt: Int? = null

    /**
     * The most recent invoice this subscription has generated over its lifecycle (for example, when it cycles or is
     * updated).
     */
    public var latestInvoice: InlineSubscriptionLatestInvoiceX182fda92? = null

    /**
     * Settings for Managed Payments for this Subscription and resulting [Invoices](/api/invoices/object) and
     * [PaymentIntents](/api/payment_intents/object).
     */
    public var managedPayments: InlineSubscriptionManagedPaymentsX33f1992e? = null

    /**
     * Specifies the approximate timestamp on which any pending invoice items will be billed according to the schedule
     * provided at `pending_invoice_item_interval`.
     */
    public var nextPendingInvoiceItemInvoice: Int? = null

    /**
     * The account (if any) the charge was made on behalf of for charges associated with this subscription. See the
     * [Connect documentation](https://docs.stripe.com/connect/subscriptions#on-behalf-of) for details.
     */
    public var onBehalfOf: InlineSubscriptionOnBehalfOfXc7863d56? = null

    /**
     * If specified, payment collection for this subscription will be paused. Note that the subscription status will be
     * unchanged and will not be updated to `paused`. Learn more about [pausing
     * collection](https://docs.stripe.com/billing/subscriptions/pause-payment).
     */
    public var pauseCollection: InlineSubscriptionPauseCollectionXf3d09645? = null

    /**
     * Payment settings passed on to invoices created by the subscription.
     */
    public var paymentSettings: InlineSubscriptionPaymentSettingsXcb421fa6? = null

    /**
     * Specifies an interval for how often to bill for any pending invoice items. It is analogous to calling [Create an
     * invoice](/api/invoices/create) for the given subscription at the specified interval.
     */
    public var pendingInvoiceItemInterval: InlineSubscriptionPendingInvoiceItemIntervalXe65def85? =
        null

    /**
     * You can use this [SetupIntent](https://docs.stripe.com/api/setup_intents) to collect user authentication when
     * creating a subscription without immediate payment or updating a subscription's payment method, allowing you to
     * optimize for off-session payments. Learn more in the [SCA Migration
     * Guide](https://docs.stripe.com/billing/migration/strong-customer-authentication#scenario-2).
     */
    public var pendingSetupIntent: InlineSubscriptionPendingSetupIntentXec0dee4e? = null

    /**
     * If specified, [pending updates](https://docs.stripe.com/billing/subscriptions/pending-updates) that will be
     * applied to the subscription once the `latest_invoice` has been paid.
     */
    public var pendingUpdate: InlineSubscriptionPendingUpdateXa60c9b03? = null

    public var presentmentDetails: SubscriptionsResourceSubscriptionPresentmentDetails? = null

    /**
     * The schedule attached to the subscription
     */
    public var schedule: InlineSubscriptionScheduleX6d170f2a? = null

    /**
     * ID of the test clock this subscription belongs to.
     */
    public var testClock: InlineSubscriptionTestClockXbc391647? = null

    /**
     * The account (if any) the subscription's payments will be attributed to for tax reporting, and where funds from
     * each payment will be transferred to for each of the subscription's invoices.
     */
    public var transferData: InlineSubscriptionTransferDataX382db867? = null

    /**
     * If the subscription has a trial, the end of that trial.
     */
    public var trialEnd: Int? = null

    /**
     * Settings related to subscription trials.
     */
    public var trialSettings: InlineSubscriptionTrialSettingsXb02f1582? = null

    /**
     * If the subscription has a trial, the beginning of that trial.
     */
    public var trialStart: Int? = null

    public fun build(): Subscription {
      check(automaticTaxValue != null) { "automaticTax is required" }
      check(billingCycleAnchorValue != null) { "billingCycleAnchor is required" }
      check(billingModeValue != null) { "billingMode is required" }
      check(billingSchedulesValue != null) { "billingSchedules is required" }
      check(cancelAtPeriodEndValue != null) { "cancelAtPeriodEnd is required" }
      check(collectionMethodValue != null) { "collectionMethod is required" }
      check(createdValue != null) { "created is required" }
      check(currencyValue != null) { "currency is required" }
      check(customerValue != null) { "customer is required" }
      check(discountsValue != null) { "discounts is required" }
      check(idValue != null) { "id is required" }
      check(invoiceSettingsValue != null) { "invoiceSettings is required" }
      check(itemsValue != null) { "items is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(metadataValue != null) { "metadata is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(startDateValue != null) { "startDate is required" }
      check(statusValue != null) { "status is required" }
      return Subscription(
        automaticTax = automaticTax,
        billingCycleAnchor = billingCycleAnchor,
        billingMode = billingMode,
        billingSchedules = billingSchedules,
        cancelAtPeriodEnd = cancelAtPeriodEnd,
        collectionMethod = collectionMethod,
        created = created,
        currency = currency,
        customer = customer,
        discounts = discounts,
        id = id,
        invoiceSettings = invoiceSettings,
        items = items,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        startDate = startDate,
        status = status,
        application = application,
        applicationFeePercent = applicationFeePercent,
        billingCycleAnchorConfig = billingCycleAnchorConfig,
        billingThresholds = billingThresholds,
        cancelAt = cancelAt,
        canceledAt = canceledAt,
        cancellationDetails = cancellationDetails,
        customerAccount = customerAccount,
        daysUntilDue = daysUntilDue,
        defaultPaymentMethod = defaultPaymentMethod,
        defaultSource = defaultSource,
        defaultTaxRates = defaultTaxRates,
        description = description,
        endedAt = endedAt,
        latestInvoice = latestInvoice,
        managedPayments = managedPayments,
        nextPendingInvoiceItemInvoice = nextPendingInvoiceItemInvoice,
        onBehalfOf = onBehalfOf,
        pauseCollection = pauseCollection,
        paymentSettings = paymentSettings,
        pendingInvoiceItemInterval = pendingInvoiceItemInterval,
        pendingSetupIntent = pendingSetupIntent,
        pendingUpdate = pendingUpdate,
        presentmentDetails = presentmentDetails,
        schedule = schedule,
        testClock = testClock,
        transferData = transferData,
        trialEnd = trialEnd,
        trialSettings = trialSettings,
        trialStart = trialStart,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Subscription = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Subscription> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Subscription {
      val jsonDecoder = decoder.requireJsonDecoder("Subscription")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Subscription must be a JSON object")
      val automaticTax = json.decodeRequired<SubscriptionAutomaticTax>(rawObject, "automatic_tax")
      val billingCycleAnchor = json.decodeRequired<Int>(rawObject, "billing_cycle_anchor")
      val billingMode = json.decodeRequired<SubscriptionsResourceBillingMode>(rawObject, "billing_mode")
      val billingSchedules = json.decodeRequired<List<SubscriptionsResourceBillingSchedules>>(rawObject, "billing_schedules")
      val cancelAtPeriodEnd = json.decodeRequired<Boolean>(rawObject, "cancel_at_period_end")
      val collectionMethod = json.decodeRequired<InlineSubscriptionCollectionMethodX68775f71>(rawObject, "collection_method")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val customer = json.decodeRequired<InlineSubscriptionCustomerX412ed7e8>(rawObject, "customer")
      val discounts = json.decodeRequired<List<InlineSubscriptionDiscountsItemX69962ce0>>(rawObject, "discounts")
      val id = json.decodeRequired<String>(rawObject, "id")
      val invoiceSettings = json.decodeRequired<SubscriptionsResourceSubscriptionInvoiceSettings>(rawObject, "invoice_settings")
      val items = json.decodeRequired<InlineSubscriptionItemsX9b172b6f>(rawObject, "items")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      val objectValue = json.decodeRequired<InlineSubscriptionObjectValueX9137bb29>(rawObject, "object")
      val startDate = json.decodeRequired<Int>(rawObject, "start_date")
      val status = json.decodeRequired<InlineSubscriptionStatusXc06e66c3>(rawObject, "status")
      return Subscription(
        automaticTax = automaticTax,
        billingCycleAnchor = billingCycleAnchor,
        billingMode = billingMode,
        billingSchedules = billingSchedules,
        cancelAtPeriodEnd = cancelAtPeriodEnd,
        collectionMethod = collectionMethod,
        created = created,
        currency = currency,
        customer = customer,
        discounts = discounts,
        id = id,
        invoiceSettings = invoiceSettings,
        items = items,
        livemode = livemode,
        metadata = metadata,
        objectValue = objectValue,
        startDate = startDate,
        status = status,
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionApplicationX28439c61?>(element) },
        applicationFeePercent = rawObject["application_fee_percent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        billingCycleAnchorConfig = rawObject["billing_cycle_anchor_config"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionBillingCycleAnchorConfigXea24da68?>(element) },
        billingThresholds = rawObject["billing_thresholds"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionBillingThresholdsX6e690ced?>(element) },
        cancelAt = rawObject["cancel_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        canceledAt = rawObject["canceled_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        cancellationDetails = rawObject["cancellation_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionCancellationDetailsX0e11eeaf?>(element) },
        customerAccount = rawObject["customer_account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        daysUntilDue = rawObject["days_until_due"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionDefaultPaymentMethodX14c25b83?>(element) },
        defaultSource = rawObject["default_source"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionDefaultSourceXf0c66116?>(element) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<TaxRate>?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        endedAt = rawObject["ended_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        latestInvoice = rawObject["latest_invoice"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionLatestInvoiceX182fda92?>(element) },
        managedPayments = rawObject["managed_payments"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionManagedPaymentsX33f1992e?>(element) },
        nextPendingInvoiceItemInvoice = rawObject["next_pending_invoice_item_invoice"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionOnBehalfOfXc7863d56?>(element) },
        pauseCollection = rawObject["pause_collection"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionPauseCollectionXf3d09645?>(element) },
        paymentSettings = rawObject["payment_settings"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionPaymentSettingsXcb421fa6?>(element) },
        pendingInvoiceItemInterval = rawObject["pending_invoice_item_interval"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionPendingInvoiceItemIntervalXe65def85?>(element) },
        pendingSetupIntent = rawObject["pending_setup_intent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionPendingSetupIntentXec0dee4e?>(element) },
        pendingUpdate = rawObject["pending_update"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionPendingUpdateXa60c9b03?>(element) },
        presentmentDetails = rawObject["presentment_details"]?.let { json.decodeFromJsonElement<SubscriptionsResourceSubscriptionPresentmentDetails>(it) },
        schedule = rawObject["schedule"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionScheduleX6d170f2a?>(element) },
        testClock = rawObject["test_clock"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionTestClockXbc391647?>(element) },
        transferData = rawObject["transfer_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionTransferDataX382db867?>(element) },
        trialEnd = rawObject["trial_end"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        trialSettings = rawObject["trial_settings"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionTrialSettingsXb02f1582?>(element) },
        trialStart = rawObject["trial_start"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Subscription) {
      val jsonEncoder = encoder.requireJsonEncoder("Subscription")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("automatic_tax", json.encodeToJsonElement(value.automaticTax))
        put("billing_cycle_anchor", json.encodeToJsonElement(value.billingCycleAnchor))
        put("billing_mode", json.encodeToJsonElement(value.billingMode))
        put("billing_schedules", json.encodeToJsonElement(value.billingSchedules))
        put("cancel_at_period_end", json.encodeToJsonElement(value.cancelAtPeriodEnd))
        put("collection_method", json.encodeToJsonElement(value.collectionMethod))
        put("created", json.encodeToJsonElement(value.created))
        put("currency", value.currency)
        put("customer", json.encodeToJsonElement(value.customer))
        put("discounts", json.encodeToJsonElement(value.discounts))
        put("id", value.id)
        put("invoice_settings", json.encodeToJsonElement(value.invoiceSettings))
        put("items", json.encodeToJsonElement(value.items))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("metadata", json.encodeToJsonElement(value.metadata))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("start_date", json.encodeToJsonElement(value.startDate))
        put("status", json.encodeToJsonElement(value.status))
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
        value.billingCycleAnchorConfig?.let { put("billing_cycle_anchor_config", json.encodeToJsonElement(it)) }
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.cancelAt?.let { put("cancel_at", json.encodeToJsonElement(it)) }
        value.canceledAt?.let { put("canceled_at", json.encodeToJsonElement(it)) }
        value.cancellationDetails?.let { put("cancellation_details", json.encodeToJsonElement(it)) }
        value.customerAccount?.let { put("customer_account", it) }
        value.daysUntilDue?.let { put("days_until_due", json.encodeToJsonElement(it)) }
        value.defaultPaymentMethod?.let { put("default_payment_method", json.encodeToJsonElement(it)) }
        value.defaultSource?.let { put("default_source", json.encodeToJsonElement(it)) }
        value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.endedAt?.let { put("ended_at", json.encodeToJsonElement(it)) }
        value.latestInvoice?.let { put("latest_invoice", json.encodeToJsonElement(it)) }
        value.managedPayments?.let { put("managed_payments", json.encodeToJsonElement(it)) }
        value.nextPendingInvoiceItemInvoice?.let { put("next_pending_invoice_item_invoice", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.pauseCollection?.let { put("pause_collection", json.encodeToJsonElement(it)) }
        value.paymentSettings?.let { put("payment_settings", json.encodeToJsonElement(it)) }
        value.pendingInvoiceItemInterval?.let { put("pending_invoice_item_interval", json.encodeToJsonElement(it)) }
        value.pendingSetupIntent?.let { put("pending_setup_intent", json.encodeToJsonElement(it)) }
        value.pendingUpdate?.let { put("pending_update", json.encodeToJsonElement(it)) }
        value.presentmentDetails?.let { put("presentment_details", json.encodeToJsonElement(it)) }
        value.schedule?.let { put("schedule", json.encodeToJsonElement(it)) }
        value.testClock?.let { put("test_clock", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
        value.trialEnd?.let { put("trial_end", json.encodeToJsonElement(it)) }
        value.trialSettings?.let { put("trial_settings", json.encodeToJsonElement(it)) }
        value.trialStart?.let { put("trial_start", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscription(block: Subscription.Builder.() -> Unit): Subscription = Subscription.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Subscription is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
