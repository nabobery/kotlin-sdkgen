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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A subset of parameters to be passed to subscription creation for Checkout Sessions in `subscription` mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val applicationFeePercent: Double? = null,
  public val billingCycleAnchor: Int? = null,
  public val billingCycleAnchorConfig:
      InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629? = null,
  public val billingMode:
      InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66? = null,
  defaultTaxRates: List<String>? = null,
  public val description: String? = null,
  public val invoiceSettings:
      InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd? = null,
  metadata: Map<String, String>? = null,
  public val onBehalfOf: String? = null,
  public val pendingInvoiceItemInterval:
      InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124? = null,
  public val prorationBehavior:
      InlineV1CheckoutSessionsPostRequestFormProrationBehaviorXd7bc27d7? = null,
  public val transferData:
      InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf? = null,
  public val trialEnd: Int? = null,
  public val trialPeriodDays: Int? = null,
  public val trialSettings:
      InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f? = null,
) {
  public val defaultTaxRates: List<String>? =
      defaultTaxRates?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var applicationFeePercent: Double? = null

    public var billingCycleAnchor: Int? = null

    public var billingCycleAnchorConfig:
        InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629? = null

    public var billingMode:
        InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66? = null

    private var defaultTaxRatesValue: List<String>? = null

    public var defaultTaxRates: List<String>?
      get() = defaultTaxRatesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultTaxRatesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var description: String? = null

    public var invoiceSettings:
        InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var onBehalfOf: String? = null

    public var pendingInvoiceItemInterval:
        InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124? = null

    public var prorationBehavior: InlineV1CheckoutSessionsPostRequestFormProrationBehaviorXd7bc27d7?
        = null

    public var transferData:
        InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf? = null

    public var trialEnd: Int? = null

    public var trialPeriodDays: Int? = null

    public var trialSettings:
        InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5 = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5(
      applicationFeePercent = applicationFeePercent,
      billingCycleAnchor = billingCycleAnchor,
      billingCycleAnchorConfig = billingCycleAnchorConfig,
      billingMode = billingMode,
      defaultTaxRates = defaultTaxRates,
      description = description,
      invoiceSettings = invoiceSettings,
      metadata = metadata,
      onBehalfOf = onBehalfOf,
      pendingInvoiceItemInterval = pendingInvoiceItemInterval,
      prorationBehavior = prorationBehavior,
      transferData = transferData,
      trialEnd = trialEnd,
      trialPeriodDays = trialPeriodDays,
      trialSettings = trialSettings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5(
        applicationFeePercent = rawObject["application_fee_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
        billingCycleAnchor = rawObject["billing_cycle_anchor"]?.let { json.decodeFromJsonElement<Int>(it) },
        billingCycleAnchorConfig = rawObject["billing_cycle_anchor_config"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormBillingCycleAnchorConfigX06b36629>(it) },
        billingMode = rawObject["billing_mode"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeXd60ebc66>(it) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceSettings = rawObject["invoice_settings"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataInvoiceSettingsX1a0222bd>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
        pendingInvoiceItemInterval = rawObject["pending_invoice_item_interval"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPendingInvoiceItemIne05dX50036124>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormProrationBehaviorXd7bc27d7>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTransferDataX26f9cdcf>(it) },
        trialEnd = rawObject["trial_end"]?.let { json.decodeFromJsonElement<Int>(it) },
        trialPeriodDays = rawObject["trial_period_days"]?.let { json.decodeFromJsonElement<Int>(it) },
        trialSettings = rawObject["trial_settings"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTrialSettingsX3ed2fa0f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
        value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
        value.billingCycleAnchorConfig?.let { put("billing_cycle_anchor_config", json.encodeToJsonElement(it)) }
        value.billingMode?.let { put("billing_mode", json.encodeToJsonElement(it)) }
        value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", it) }
        value.pendingInvoiceItemInterval?.let { put("pending_invoice_item_interval", json.encodeToJsonElement(it)) }
        value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
        value.trialEnd?.let { put("trial_end", json.encodeToJsonElement(it)) }
        value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
        value.trialSettings?.let { put("trial_settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5(block: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5 = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataX72b0f8c5.build(block)
