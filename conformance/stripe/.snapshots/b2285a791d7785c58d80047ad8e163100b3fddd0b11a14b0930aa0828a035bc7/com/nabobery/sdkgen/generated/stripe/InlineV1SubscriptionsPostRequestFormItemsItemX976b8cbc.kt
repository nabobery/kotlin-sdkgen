package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/items/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc(
  public val billingThresholds:
      InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f? = null,
  public val clearUsage: Boolean? = null,
  public val deleted: Boolean? = null,
  public val discounts: InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX155b0ce2? = null,
  public val id: String? = null,
  public val metadata: InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98? = null,
  public val price: String? = null,
  public val priceData: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataXc4828e3e? = null,
  public val quantity: Int? = null,
  public val taxRates: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f? = null,
) {
  public class Builder {
    public var billingThresholds:
        InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f? = null

    public var clearUsage: Boolean? = null

    public var deleted: Boolean? = null

    public var discounts: InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX155b0ce2? = null

    public var id: String? = null

    public var metadata: InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98? = null

    public var price: String? = null

    public var priceData: InlineV1SubscriptionsPostRequestFormItemsItemPriceDataXc4828e3e? = null

    public var quantity: Int? = null

    public var taxRates: InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc = InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc(
      billingThresholds = billingThresholds,
      clearUsage = clearUsage,
      deleted = deleted,
      discounts = discounts,
      id = id,
      metadata = metadata,
      price = price,
      priceData = priceData,
      quantity = quantity,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc(
        billingThresholds = rawObject["billing_thresholds"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemBillingThresholdsXc768c06f>(it) },
        clearUsage = rawObject["clear_usage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX155b0ce2>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemMetadataX51509d98>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemPriceDataXc4828e3e>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemTaxRatesXd9e2bf4f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
        value.clearUsage?.let { put("clear_usage", json.encodeToJsonElement(it)) }
        value.deleted?.let { put("deleted", json.encodeToJsonElement(it)) }
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
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

public fun inlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc(block: InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc = InlineV1SubscriptionsPostRequestFormItemsItemX976b8cbc.build(block)
