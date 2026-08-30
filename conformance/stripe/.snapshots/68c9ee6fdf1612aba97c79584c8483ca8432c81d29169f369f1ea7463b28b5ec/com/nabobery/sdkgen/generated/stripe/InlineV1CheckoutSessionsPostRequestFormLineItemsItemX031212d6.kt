package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6(
  public val adjustableQuantity:
      InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe? = null,
  public val id: String? = null,
  public val metadata:
      InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241? = null,
  public val price: String? = null,
  public val priceData:
      InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataX178785a7? = null,
  public val quantity: Int? = null,
  public val taxRates:
      InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf? = null,
) {
  public class Builder {
    public var adjustableQuantity:
        InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe? = null

    public var id: String? = null

    public var metadata: InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241? =
        null

    public var price: String? = null

    public var priceData: InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataX178785a7? =
        null

    public var quantity: Int? = null

    public var taxRates: InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf? =
        null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6 = InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6(
      adjustableQuantity = adjustableQuantity,
      id = id,
      metadata = metadata,
      price = price,
      priceData = priceData,
      quantity = quantity,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6(
        adjustableQuantity = rawObject["adjustable_quantity"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormLineItemsItemAdjustableQuantityX2d2b86fe>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormLineItemsItemMetadataXbce33241>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormLineItemsItemPriceDataX178785a7>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.adjustableQuantity?.let { put("adjustable_quantity", json.encodeToJsonElement(it)) }
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

public fun inlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6(block: InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6 = InlineV1CheckoutSessionsPostRequestFormLineItemsItemX031212d6.build(block)
