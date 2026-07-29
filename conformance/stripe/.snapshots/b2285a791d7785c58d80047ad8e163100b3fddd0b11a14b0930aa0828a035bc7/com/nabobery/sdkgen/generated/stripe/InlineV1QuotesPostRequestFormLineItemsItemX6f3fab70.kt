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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70.Serializer::class)
public class InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70(
  public val discounts: InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df? = null,
  public val price: String? = null,
  public val priceData: InlineV1QuotesPostRequestFormLineItemsItemPriceDataX9ab56738? = null,
  public val quantity: Int? = null,
  public val taxRates: InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68? = null,
) {
  public class Builder {
    public var discounts: InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df? = null

    public var price: String? = null

    public var priceData: InlineV1QuotesPostRequestFormLineItemsItemPriceDataX9ab56738? = null

    public var quantity: Int? = null

    public var taxRates: InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68? = null

    public fun build(): InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70 = InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70(
      discounts = discounts,
      price = price,
      priceData = priceData,
      quantity = quantity,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70 must be a JSON object")
      return InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70(
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd211b5df>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemPriceDataX9ab56738>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX11a92a68>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.price?.let { put("price", it) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormLineItemsItemX6f3fab70(block: InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70.Builder.() -> Unit): InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70 = InlineV1QuotesPostRequestFormLineItemsItemX6f3fab70.build(block)
