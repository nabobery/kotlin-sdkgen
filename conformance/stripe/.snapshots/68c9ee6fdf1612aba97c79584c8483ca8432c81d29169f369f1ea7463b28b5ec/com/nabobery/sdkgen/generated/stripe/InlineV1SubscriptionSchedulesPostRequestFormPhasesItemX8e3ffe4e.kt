package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e(
  items: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2>,
  addInvoiceItems: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629>? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val applicationFeePercent: Double? = null,
  public val automaticTax:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348? = null,
  public val billingCycleAnchor:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXcf0fdea9? = null,
  public val billingThresholds:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a? = null,
  public val collectionMethod:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemCollectionMethodX02b84968? = null,
  public val defaultPaymentMethod: String? = null,
  public val defaultTaxRates:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0? = null,
  public val description:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc48b234c? = null,
  public val discounts:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09? = null,
  public val duration:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4? = null,
  public val endDate:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4? = null,
  public val invoiceSettings:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e? = null,
  metadata: Map<String, String>? = null,
  public val onBehalfOf: String? = null,
  public val prorationBehavior:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f? = null,
  public val startDate:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e? = null,
  public val transferData:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataXe7b42f13? = null,
  public val trial: Boolean? = null,
  public val trialEnd:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca? = null,
) {
  public val items: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2> =
      items.toList()

  public val addInvoiceItems:
      List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629>? =
      addInvoiceItems?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var itemsValue:
        List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2>? = null

    public var items: List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2>
      get() = requireNotNull(itemsValue) { "items is required" }.toList()
      set(`value`) {
        itemsValue = value.toList()
      }

    private var addInvoiceItemsValue:
        List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629>? = null

    public var addInvoiceItems:
        List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629>?
      get() = addInvoiceItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        addInvoiceItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var applicationFeePercent: Double? = null

    public var automaticTax:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348? = null

    public var billingCycleAnchor:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXcf0fdea9? = null

    public var billingThresholds:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a? = null

    public var collectionMethod:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemCollectionMethodX02b84968? = null

    public var defaultPaymentMethod: String? = null

    public var defaultTaxRates:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0? = null

    public var description:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc48b234c? = null

    public var discounts: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09?
        = null

    public var duration: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4? =
        null

    public var endDate: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4? =
        null

    public var invoiceSettings:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var onBehalfOf: String? = null

    public var prorationBehavior:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f? = null

    public var startDate: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e?
        = null

    public var transferData:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataXe7b42f13? = null

    public var trial: Boolean? = null

    public var trialEnd: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca? =
        null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e {
      check(itemsValue != null) { "items is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e(
        items = items,
        addInvoiceItems = addInvoiceItems,
        applicationFeePercent = applicationFeePercent,
        automaticTax = automaticTax,
        billingCycleAnchor = billingCycleAnchor,
        billingThresholds = billingThresholds,
        collectionMethod = collectionMethod,
        defaultPaymentMethod = defaultPaymentMethod,
        defaultTaxRates = defaultTaxRates,
        description = description,
        discounts = discounts,
        duration = duration,
        endDate = endDate,
        invoiceSettings = invoiceSettings,
        metadata = metadata,
        onBehalfOf = onBehalfOf,
        prorationBehavior = prorationBehavior,
        startDate = startDate,
        transferData = transferData,
        trial = trial,
        trialEnd = trialEnd,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e must be a JSON object")
      val items = json.decodeRequired<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2>>(rawObject, "items")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e(
        items = items,
        addInvoiceItems = rawObject["add_invoice_items"]?.let { json.decodeFromJsonElement<List<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemXd9f3d629>>(it) },
        applicationFeePercent = rawObject["application_fee_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348>(it) },
        billingCycleAnchor = rawObject["billing_cycle_anchor"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesBillingCycleAnchorXcf0fdea9>(it) },
        billingThresholds = rawObject["billing_thresholds"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsX7ffe534a>(it) },
        collectionMethod = rawObject["collection_method"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemCollectionMethodX02b84968>(it) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDefaultTaxRatesXe886c7c0>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDescriptionXc48b234c>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsX594a2a09>(it) },
        duration = rawObject["duration"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDurationXd0942da4>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemEndDateXa02e08c4>(it) },
        invoiceSettings = rawObject["invoice_settings"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemInvoiceSettingsX2181c43e>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemProrationBehaviorXa341370f>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemStartDateX1bc3509e>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTransferDataXe7b42f13>(it) },
        trial = rawObject["trial"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        trialEnd = rawObject["trial_end"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTrialEndXcd12e5ca>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("items", json.encodeToJsonElement(value.items))
        value.addInvoiceItems?.let { put("add_invoice_items", json.encodeToJsonElement(it)) }
        value.applicationFeePercent?.let { put("application_fee_percent", json.encodeToJsonElement(it)) }
        value.automaticTax?.let { put("automatic_tax", json.encodeToJsonElement(it)) }
        value.billingCycleAnchor?.let { put("billing_cycle_anchor", json.encodeToJsonElement(it)) }
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
        value.defaultPaymentMethod?.let { put("default_payment_method", it) }
        value.defaultTaxRates?.let { put("default_tax_rates", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.duration?.let { put("duration", json.encodeToJsonElement(it)) }
        value.endDate?.let { put("end_date", json.encodeToJsonElement(it)) }
        value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", it) }
        value.prorationBehavior?.let { put("proration_behavior", json.encodeToJsonElement(it)) }
        value.startDate?.let { put("start_date", json.encodeToJsonElement(it)) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
        value.trial?.let { put("trial", json.encodeToJsonElement(it)) }
        value.trialEnd?.let { put("trial_end", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemX8e3ffe4e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
