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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836(
  public val billingThresholds:
      InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145? = null,
  public val discounts: InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3? = null,
  metadata: Map<String, String>? = null,
  public val price: String? = null,
  public val priceData: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataX3932288c? = null,
  public val quantity: Int? = null,
  public val taxRates: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var billingThresholds:
        InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145? = null

    public var discounts: InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var price: String? = null

    public var priceData: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataX3932288c? = null

    public var quantity: Int? = null

    public var taxRates: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836 = InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836(
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
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836 must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836(
        billingThresholds = rawObject["billing_thresholds"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsX527d8145>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemPriceDataX3932288c>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesX0727b13e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836")
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

public fun inlineV1SubscriptionsPostRequestFormItemsItemX0aa31836(block: InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836 = InlineV1SubscriptionsPostRequestFormItemsItemX0aa31836.build(block)
