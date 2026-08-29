package com.nabobery.sdkgen.generated.stripe

import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
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

/**
 * A phase describes the plans, coupon, and trialing status of a subscription for a predefined time period.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule_phase_configuration
 */
@Serializable(with = SubscriptionSchedulePhaseConfiguration.Serializer::class)
public class SubscriptionSchedulePhaseConfiguration(
  addInvoiceItems: List<SubscriptionScheduleAddInvoiceItem>,
  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a
   * [supported currency](https://stripe.com/docs/currencies).
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  discounts: List<StackableDiscountWithDiscountSettingsAndDiscountEnd>,
  /**
   * The end of this phase of the subscription schedule.
   */
  public val endDate: Int,
  items: List<SubscriptionScheduleConfigurationItem>,
  /**
   * When transitioning phases, controls how prorations are handled (if any). Possible values are `create_prorations`,
   * `none`, and `always_invoice`.
   */
  public val prorationBehavior:
      InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419,
  /**
   * The start of this phase of the subscription schedule.
   */
  public val startDate: Int,
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
   * subscription invoice total that will be transferred to the application owner's Stripe account during this phase of
   * the schedule.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val applicationFeePercent: Double? = null,
  public val automaticTax: SchedulesPhaseAutomaticTax? = null,
  /**
   * Possible values are `phase_start` or `automatic`. If `phase_start` then billing cycle anchor of the subscription is
   * set to the start of the phase when entering the phase. If `automatic` then the billing cycle anchor is
   * automatically modified as needed when entering the phase. For more information, see the billing cycle
   * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
   */
  public val billingCycleAnchor:
      InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb? = null,
  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period
   */
  public val billingThresholds:
      InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827? = null,
  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay the
   * underlying subscription at the end of each billing cycle using the default source attached to the customer. When
   * sending an invoice, Stripe will email your customer an invoice with payment instructions and mark the subscription
   * as `active`.
   */
  public val collectionMethod:
      InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be? = null,
  /**
   * ID of the default payment method for the subscription schedule. It must belong to the customer associated with the
   * subscription schedule. If not set, invoices will use the default payment method in the customer's invoice settings.
   */
  public val defaultPaymentMethod:
      InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e? = null,
  defaultTaxRates: List<TaxRate>? = null,
  /**
   * Subscription description, meant to be displayable to the customer. Use this field to optionally store an
   * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
   */
  public val description: String? = null,
  /**
   * The invoice settings applicable during this phase.
   */
  public val invoiceSettings:
      InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1? = null,
  metadata: Map<String, String>? = null,
  /**
   * The account (if any) the charge was made on behalf of for charges associated with the schedule's subscription. See
   * the Connect documentation for details.
   */
  public val onBehalfOf: InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968? = null,
  /**
   * The account (if any) the associated subscription's payments will be attributed to for tax reporting, and where
   * funds from each payment will be transferred to for each of the subscription's invoices.
   */
  public val transferData:
      InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a? = null,
  /**
   * When the trial ends within the phase.
   */
  public val trialEnd: Int? = null,
) {
  /**
   * A list of prices and quantities that will generate invoice items appended to the next invoice for this phase.
   */
  public val addInvoiceItems: List<SubscriptionScheduleAddInvoiceItem> = addInvoiceItems.toList()

  /**
   * The stackable discounts that will be applied to the subscription on this phase. Subscription item discounts are
   * applied before subscription discounts.
   */
  public val discounts: List<StackableDiscountWithDiscountSettingsAndDiscountEnd> =
      discounts.toList()

  /**
   * Subscription items to configure the subscription to during this phase of the subscription schedule.
   */
  public val items: List<SubscriptionScheduleConfigurationItem> = items.toList()

  /**
   * The default tax rates to apply to the subscription during this phase of the subscription schedule.
   */
  public val defaultTaxRates: List<TaxRate>? =
      defaultTaxRates?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to a phase. Metadata on a
   * schedule's phase will update the underlying subscription's `metadata` when the phase is entered. Updating the
   * underlying subscription's `metadata` directly will not affect the current phase's `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var addInvoiceItemsValue: List<SubscriptionScheduleAddInvoiceItem>? = null

    public var addInvoiceItems: List<SubscriptionScheduleAddInvoiceItem>
      get() = requireNotNull(addInvoiceItemsValue) { "addInvoiceItems is required" }.toList()
      set(`value`) {
        addInvoiceItemsValue = value.toList()
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var discountsValue: List<StackableDiscountWithDiscountSettingsAndDiscountEnd>? = null

    public var discounts: List<StackableDiscountWithDiscountSettingsAndDiscountEnd>
      get() = requireNotNull(discountsValue) { "discounts is required" }.toList()
      set(`value`) {
        discountsValue = value.toList()
      }

    private var endDateValue: Int? = null

    public var endDate: Int
      get() = requireNotNull(endDateValue) { "endDate is required" }
      set(`value`) {
        endDateValue = value
      }

    private var itemsValue: List<SubscriptionScheduleConfigurationItem>? = null

    public var items: List<SubscriptionScheduleConfigurationItem>
      get() = requireNotNull(itemsValue) { "items is required" }.toList()
      set(`value`) {
        itemsValue = value.toList()
      }

    private var prorationBehaviorValue:
        InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419? = null

    public var prorationBehavior:
        InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419
      get() = requireNotNull(prorationBehaviorValue) { "prorationBehavior is required" }
      set(`value`) {
        prorationBehaviorValue = value
      }

    private var startDateValue: Int? = null

    public var startDate: Int
      get() = requireNotNull(startDateValue) { "startDate is required" }
      set(`value`) {
        startDateValue = value
      }

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the application owner's Stripe account during this phase
     * of the schedule.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var applicationFeePercent: Double? = null

    public var automaticTax: SchedulesPhaseAutomaticTax? = null

    /**
     * Possible values are `phase_start` or `automatic`. If `phase_start` then billing cycle anchor of the subscription
     * is set to the start of the phase when entering the phase. If `automatic` then the billing cycle anchor is
     * automatically modified as needed when entering the phase. For more information, see the billing cycle
     * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
     */
    public var billingCycleAnchor:
        InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb? = null

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period
     */
    public var billingThresholds:
        InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827? = null

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay the
     * underlying subscription at the end of each billing cycle using the default source attached to the customer. When
     * sending an invoice, Stripe will email your customer an invoice with payment instructions and mark the
     * subscription as `active`.
     */
    public var collectionMethod:
        InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be? = null

    /**
     * ID of the default payment method for the subscription schedule. It must belong to the customer associated with
     * the subscription schedule. If not set, invoices will use the default payment method in the customer's invoice
     * settings.
     */
    public var defaultPaymentMethod:
        InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e? = null

    private var defaultTaxRatesValue: List<TaxRate>? = null

    /**
     * The default tax rates to apply to the subscription during this phase of the subscription schedule.
     */
    public var defaultTaxRates: List<TaxRate>?
      get() = defaultTaxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultTaxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Subscription description, meant to be displayable to the customer. Use this field to optionally store an
     * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
     */
    public var description: String? = null

    /**
     * The invoice settings applicable during this phase.
     */
    public var invoiceSettings:
        InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to a phase. Metadata on a
     * schedule's phase will update the underlying subscription's `metadata` when the phase is entered. Updating the
     * underlying subscription's `metadata` directly will not affect the current phase's `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The account (if any) the charge was made on behalf of for charges associated with the schedule's subscription.
     * See the Connect documentation for details.
     */
    public var onBehalfOf: InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968? = null

    /**
     * The account (if any) the associated subscription's payments will be attributed to for tax reporting, and where
     * funds from each payment will be transferred to for each of the subscription's invoices.
     */
    public var transferData: InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a? =
        null

    /**
     * When the trial ends within the phase.
     */
    public var trialEnd: Int? = null

    public fun build(): SubscriptionSchedulePhaseConfiguration {
      check(addInvoiceItemsValue != null) { "addInvoiceItems is required" }
      check(currencyValue != null) { "currency is required" }
      check(discountsValue != null) { "discounts is required" }
      check(endDateValue != null) { "endDate is required" }
      check(itemsValue != null) { "items is required" }
      check(prorationBehaviorValue != null) { "prorationBehavior is required" }
      check(startDateValue != null) { "startDate is required" }
      return SubscriptionSchedulePhaseConfiguration(
        addInvoiceItems = addInvoiceItems,
        currency = currency,
        discounts = discounts,
        endDate = endDate,
        items = items,
        prorationBehavior = prorationBehavior,
        startDate = startDate,
        applicationFeePercent = applicationFeePercent,
        automaticTax = automaticTax,
        billingCycleAnchor = billingCycleAnchor,
        billingThresholds = billingThresholds,
        collectionMethod = collectionMethod,
        defaultPaymentMethod = defaultPaymentMethod,
        defaultTaxRates = defaultTaxRates,
        description = description,
        invoiceSettings = invoiceSettings,
        metadata = metadata,
        onBehalfOf = onBehalfOf,
        transferData = transferData,
        trialEnd = trialEnd,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionSchedulePhaseConfiguration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SubscriptionSchedulePhaseConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionSchedulePhaseConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionSchedulePhaseConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionSchedulePhaseConfiguration must be a JSON object")
      val addInvoiceItems = json.decodeRequired<List<SubscriptionScheduleAddInvoiceItem>>(rawObject, "add_invoice_items")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      val discounts = json.decodeRequired<List<StackableDiscountWithDiscountSettingsAndDiscountEnd>>(rawObject, "discounts")
      val endDate = json.decodeRequired<Int>(rawObject, "end_date")
      val items = json.decodeRequired<List<SubscriptionScheduleConfigurationItem>>(rawObject, "items")
      val prorationBehavior = json.decodeRequired<InlineSubscriptionSchedulePhaseConfigurationProrationBehaviorX75927419>(rawObject, "proration_behavior")
      val startDate = json.decodeRequired<Int>(rawObject, "start_date")
      return SubscriptionSchedulePhaseConfiguration(
        addInvoiceItems = addInvoiceItems,
        currency = currency,
        discounts = discounts,
        endDate = endDate,
        items = items,
        prorationBehavior = prorationBehavior,
        startDate = startDate,
        applicationFeePercent = rawObject["application_fee_percent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<SchedulesPhaseAutomaticTax>(it) },
        billingCycleAnchor = rawObject["billing_cycle_anchor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulePhaseConfigurationBillingCycleAnchorXdc0a44cb?>(element) },
        billingThresholds = rawObject["billing_thresholds"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulePhaseConfigurationBillingThresholdsXe926a827?>(element) },
        collectionMethod = rawObject["collection_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulePhaseConfigurationCollectionMethodX592878be?>(element) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e?>(element) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<TaxRate>?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        invoiceSettings = rawObject["invoice_settings"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulePhaseConfigurationInvoiceSettingsX552904e1?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulePhaseConfigurationOnBehalfOfX2e679968?>(element) },
        transferData = rawObject["transfer_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulePhaseConfigurationTransferDataXc4efc34a?>(element) },
        trialEnd = rawObject["trial_end"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionSchedulePhaseConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionSchedulePhaseConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("add_invoice_items", json.encodeToJsonElement(value.addInvoiceItems))
        put("currency", value.currency)
        put("discounts", json.encodeToJsonElement(value.discounts))
        put("end_date", json.encodeToJsonElement(value.endDate))
        put("items", json.encodeToJsonElement(value.items))
        put("proration_behavior", json.encodeToJsonElement(value.prorationBehavior))
        put("start_date", json.encodeToJsonElement(value.startDate))
        value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
        value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
        value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
        value.defaultPaymentMethod?.let { put("default_payment_method", json.encodeToJsonElement(it)) }
        value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
        value.trialEnd?.let { put("trial_end", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionSchedulePhaseConfiguration(block: SubscriptionSchedulePhaseConfiguration.Builder.() -> Unit): SubscriptionSchedulePhaseConfiguration = SubscriptionSchedulePhaseConfiguration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionSchedulePhaseConfiguration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
