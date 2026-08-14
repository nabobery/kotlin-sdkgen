package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/items/items
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17(
  public val billingThresholds:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef? = null,
  public val discounts:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0? = null,
  metadata: Map<String, String>? = null,
  public val price: String? = null,
  public val priceData:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataX814be096? = null,
  public val quantity: Int? = null,
  public val taxRates:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesX38c93af9? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var billingThresholds:
        InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef? = null

    public var discounts: InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0?
        = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var price: String? = null

    public var priceData: InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataX814be096?
        = null

    public var quantity: Int? = null

    public var taxRates: InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesX38c93af9? =
        null

    public fun build(): InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17 = InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17(
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
    public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17 must be a JSON object")
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17(
        billingThresholds = rawObject["billing_thresholds"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsX569df5ef>(it) },
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataX814be096>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesX38c93af9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17")
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

public fun inlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17(block: InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17.Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17 = InlineV1CustomersSubscriptionsPostRequestFormItemsItemXdfdc9b17.build(block)
