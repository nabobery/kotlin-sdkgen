package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2(
  public val billingThresholds:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a? = null,
  public val discounts:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsXc5e8fd19? = null,
  metadata: Map<String, String>? = null,
  public val price: String? = null,
  public val priceData:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe? = null,
  public val quantity: Int? = null,
  public val taxRates:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var billingThresholds:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a? = null

    public var discounts:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsXc5e8fd19? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var price: String? = null

    public var priceData:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe? = null

    public var quantity: Int? = null

    public var taxRates:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2(
      billingThresholds = billingThresholds,
      discounts = discounts,
      metadata = metadata,
      price = price,
      priceData = priceData,
      quantity = quantity,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2 must be a JSON object")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2(
        billingThresholds = rawObject["billing_thresholds"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsDiscountsXc5e8fd19>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsPriceDataX0085aebe>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemTaxRatesX06a02a0b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.price?.let { put("price", it) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemXf5921ae2.build(block)
