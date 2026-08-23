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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e(
  items: List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX73822a73>,
  addInvoiceItems: List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemXf5e68c73>? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val applicationFeePercent: Double? = null,
  public val automaticTax:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsAutomaticTaxX0eb98988? = null,
  public val billingCycleAnchor:
      InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d? = null,
  public val billingThresholds:
      InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec? = null,
  public val collectionMethod:
      InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea? = null,
  public val defaultPaymentMethod: String? = null,
  public val defaultTaxRates:
      InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX58684e98? = null,
  public val description:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDescriptionX7a0440a8? = null,
  public val discounts:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsX0522b826? = null,
  public val duration:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670? = null,
  public val endDate:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndDateX467b95e3? = null,
  public val invoiceSettings:
      InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9? = null,
  metadata: Map<String, String>? = null,
  public val onBehalfOf: String? = null,
  public val prorationBehavior:
      InlineV1InvoicesCreatePreviewPostRequestFormProrationBehaviorX5d5993e1? = null,
  public val startDate:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9? = null,
  public val transferData:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da? = null,
  public val trial: Boolean? = null,
  public val trialEnd:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTrialEndX2b7a8305? = null,
) {
  public val items:
      List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX73822a73> =
      items.toList()

  public val addInvoiceItems:
      List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemXf5e68c73>? =
      addInvoiceItems?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var itemsValue:
        List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX73822a73>? = null

    public var items:
        List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX73822a73>
      get() = requireNotNull(itemsValue) { "items is required" }.toList()
      set(`value`) {
        itemsValue = value.toList()
      }

    private var addInvoiceItemsValue:
        List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemXf5e68c73>? = null

    public var addInvoiceItems:
        List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemXf5e68c73>?
      get() = addInvoiceItemsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        addInvoiceItemsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var applicationFeePercent: Double? = null

    public var automaticTax:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsAutomaticTaxX0eb98988? = null

    public var billingCycleAnchor:
        InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d? = null

    public var billingThresholds:
        InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec? = null

    public var collectionMethod:
        InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea? = null

    public var defaultPaymentMethod: String? = null

    public var defaultTaxRates:
        InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX58684e98? = null

    public var description:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDescriptionX7a0440a8? = null

    public var discounts:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsX0522b826? = null

    public var duration:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670? = null

    public var endDate: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndDateX467b95e3?
        = null

    public var invoiceSettings:
        InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var onBehalfOf: String? = null

    public var prorationBehavior:
        InlineV1InvoicesCreatePreviewPostRequestFormProrationBehaviorX5d5993e1? = null

    public var startDate:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9? = null

    public var transferData:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da? = null

    public var trial: Boolean? = null

    public var trialEnd:
        InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTrialEndX2b7a8305? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e {
      check(itemsValue != null) { "items is required" }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e(
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
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e must be a JSON object")
      val items = json.decodeRequired<List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX73822a73>>(rawObject, "items")
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e(
        items = items,
        addInvoiceItems = rawObject["add_invoice_items"]?.let { json.decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemXf5e68c73>>(it) },
        applicationFeePercent = rawObject["application_fee_percent"]?.let { json.decodeFromJsonElement<Double>(it) },
        automaticTax = rawObject["automatic_tax"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsAutomaticTaxX0eb98988>(it) },
        billingCycleAnchor = rawObject["billing_cycle_anchor"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormBillingCycleAnchorX57f0df0d>(it) },
        billingThresholds = rawObject["billing_thresholds"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec>(it) },
        collectionMethod = rawObject["collection_method"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCollectionMethodX4a6e76ea>(it) },
        defaultPaymentMethod = rawObject["default_payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        defaultTaxRates = rawObject["default_tax_rates"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormDefaultTaxRatesX58684e98>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDescriptionX7a0440a8>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsX0522b826>(it) },
        duration = rawObject["duration"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDurationX9d9dc670>(it) },
        endDate = rawObject["end_date"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsEndDateX467b95e3>(it) },
        invoiceSettings = rawObject["invoice_settings"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormInvoiceSettingsXfdd1b9d9>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
        prorationBehavior = rawObject["proration_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormProrationBehaviorX5d5993e1>(it) },
        startDate = rawObject["start_date"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTransferDataXa0b383da>(it) },
        trial = rawObject["trial"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        trialEnd = rawObject["trial_end"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTrialEndX2b7a8305>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e")
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

public fun inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e(block: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemX0bd6ad4e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
