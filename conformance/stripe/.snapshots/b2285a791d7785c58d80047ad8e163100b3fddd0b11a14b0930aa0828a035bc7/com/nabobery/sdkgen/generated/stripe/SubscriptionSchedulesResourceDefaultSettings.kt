package com.nabobery.sdkgen.generated.stripe

import kotlin.Double
import kotlin.String
import kotlin.Unit
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings
 */
@Serializable(with = SubscriptionSchedulesResourceDefaultSettings.Serializer::class)
public class SubscriptionSchedulesResourceDefaultSettings(
  /**
   * Possible values are `phase_start` or `automatic`. If `phase_start` then billing cycle anchor of the subscription is
   * set to the start of the phase when entering the phase. If `automatic` then the billing cycle anchor is
   * automatically modified as needed when entering the phase. For more information, see the billing cycle
   * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
   */
  public val billingCycleAnchor:
      InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5,
  public val invoiceSettings: InvoiceSettingSubscriptionScheduleSetting,
  /**
   * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
   * subscription invoice total that will be transferred to the application owner's Stripe account during this phase of
   * the schedule.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val applicationFeePercent: Double? = null,
  public val automaticTax: SubscriptionSchedulesResourceDefaultSettingsAutomaticTax? = null,
  /**
   * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period
   */
  public val billingThresholds:
      InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede? = null,
  /**
   * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay the
   * underlying subscription at the end of each billing cycle using the default source attached to the customer. When
   * sending an invoice, Stripe will email your customer an invoice with payment instructions and mark the subscription
   * as `active`.
   */
  public val collectionMethod:
      InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53? = null,
  /**
   * ID of the default payment method for the subscription schedule. If not set, invoices will use the default payment
   * method in the customer's invoice settings.
   */
  public val defaultPaymentMethod:
      InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0? = null,
  /**
   * Subscription description, meant to be displayable to the customer. Use this field to optionally store an
   * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
   */
  public val description: String? = null,
  /**
   * The account (if any) the charge was made on behalf of for charges associated with the schedule's subscription. See
   * the Connect documentation for details.
   */
  public val onBehalfOf:
      InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a? = null,
  /**
   * The account (if any) the associated subscription's payments will be attributed to for tax reporting, and where
   * funds from each payment will be transferred to for each of the subscription's invoices.
   */
  public val transferData:
      InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf? = null,
) {
  public class Builder {
    private var billingCycleAnchorValue:
        InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5? = null

    public var billingCycleAnchor:
        InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5
      get() = requireNotNull(billingCycleAnchorValue) { "billingCycleAnchor is required" }
      set(`value`) {
        billingCycleAnchorValue = value
      }

    private var invoiceSettingsValue: InvoiceSettingSubscriptionScheduleSetting? = null

    public var invoiceSettings: InvoiceSettingSubscriptionScheduleSetting
      get() = requireNotNull(invoiceSettingsValue) { "invoiceSettings is required" }
      set(`value`) {
        invoiceSettingsValue = value
      }

    /**
     * A non-negative decimal between 0 and 100, with at most two decimal places. This represents the percentage of the
     * subscription invoice total that will be transferred to the application owner's Stripe account during this phase
     * of the schedule.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var applicationFeePercent: Double? = null

    public var automaticTax: SubscriptionSchedulesResourceDefaultSettingsAutomaticTax? = null

    /**
     * Define thresholds at which an invoice will be sent, and the subscription advanced to a new billing period
     */
    public var billingThresholds:
        InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede? = null

    /**
     * Either `charge_automatically`, or `send_invoice`. When charging automatically, Stripe will attempt to pay the
     * underlying subscription at the end of each billing cycle using the default source attached to the customer. When
     * sending an invoice, Stripe will email your customer an invoice with payment instructions and mark the
     * subscription as `active`.
     */
    public var collectionMethod:
        InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53? = null

    /**
     * ID of the default payment method for the subscription schedule. If not set, invoices will use the default payment
     * method in the customer's invoice settings.
     */
    public var defaultPaymentMethod:
        InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0? = null

    /**
     * Subscription description, meant to be displayable to the customer. Use this field to optionally store an
     * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
     */
    public var description: String? = null

    /**
     * The account (if any) the charge was made on behalf of for charges associated with the schedule's subscription.
     * See the Connect documentation for details.
     */
    public var onBehalfOf: InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a? =
        null

    /**
     * The account (if any) the associated subscription's payments will be attributed to for tax reporting, and where
     * funds from each payment will be transferred to for each of the subscription's invoices.
     */
    public var transferData:
        InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf? = null

    public fun build(): SubscriptionSchedulesResourceDefaultSettings {
      check(billingCycleAnchorValue != null) { "billingCycleAnchor is required" }
      check(invoiceSettingsValue != null) { "invoiceSettings is required" }
      return SubscriptionSchedulesResourceDefaultSettings(
        billingCycleAnchor = billingCycleAnchor,
        invoiceSettings = invoiceSettings,
        applicationFeePercent = applicationFeePercent,
        automaticTax = automaticTax,
        billingThresholds = billingThresholds,
        collectionMethod = collectionMethod,
        defaultPaymentMethod = defaultPaymentMethod,
        description = description,
        onBehalfOf = onBehalfOf,
        transferData = transferData,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SubscriptionSchedulesResourceDefaultSettings = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SubscriptionSchedulesResourceDefaultSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SubscriptionSchedulesResourceDefaultSettings {
      val jsonDecoder = decoder.requireJsonDecoder("SubscriptionSchedulesResourceDefaultSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SubscriptionSchedulesResourceDefaultSettings must be a JSON object")
      val billingCycleAnchor = json.decodeRequired<InlineSubscriptionSchedulesResourceDefaultSettingsBillingCycleAnchorXe33112b5>(rawObject, "billing_cycle_anchor")
      val invoiceSettings = json.decodeRequired<InvoiceSettingSubscriptionScheduleSetting>(rawObject, "invoice_settings")
      return SubscriptionSchedulesResourceDefaultSettings(
        billingCycleAnchor = billingCycleAnchor,
        invoiceSettings = invoiceSettings,
        applicationFeePercent = rawObject["application_fee_percent"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<SubscriptionSchedulesResourceDefaultSettingsAutomaticTax>(it) },
        billingThresholds = rawObject["billing_thresholds"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulesResourceDefaultSettingsBillingThresholdsXf52a0ede?>(element) },
        collectionMethod = rawObject["collection_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulesResourceDefaultSettingsCollectionMethodXede0db53?>(element) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulesResourceDefaultSettingsOnBehalfOfXca035d5a?>(element) },
        transferData = rawObject["transfer_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSubscriptionSchedulesResourceDefaultSettingsTransferDataX6aa83edf?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SubscriptionSchedulesResourceDefaultSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("SubscriptionSchedulesResourceDefaultSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing_cycle_anchor", json.encodeToJsonElement(value.billingCycleAnchor))
        put("invoice_settings", json.encodeToJsonElement(value.invoiceSettings))
        value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
        value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
        value.defaultPaymentMethod?.let { put("default_payment_method", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.onBehalfOf?.let { put("on_behalf_of", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun subscriptionSchedulesResourceDefaultSettings(block: SubscriptionSchedulesResourceDefaultSettings.Builder.() -> Unit): SubscriptionSchedulesResourceDefaultSettings = SubscriptionSchedulesResourceDefaultSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SubscriptionSchedulesResourceDefaultSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
