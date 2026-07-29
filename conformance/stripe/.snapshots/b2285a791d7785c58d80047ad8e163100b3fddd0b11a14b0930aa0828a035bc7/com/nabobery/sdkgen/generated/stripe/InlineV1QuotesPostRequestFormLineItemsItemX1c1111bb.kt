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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb.Serializer::class)
public class InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb(
  public val discounts: InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc? = null,
  public val id: String? = null,
  public val price: String? = null,
  public val priceData: InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2? = null,
  public val quantity: Int? = null,
  public val taxRates: InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7? = null,
) {
  public class Builder {
    public var discounts: InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc? = null

    public var id: String? = null

    public var price: String? = null

    public var priceData: InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2? = null

    public var quantity: Int? = null

    public var taxRates: InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7? = null

    public fun build(): InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb = InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb(
      discounts = discounts,
      id = id,
      price = price,
      priceData = priceData,
      quantity = quantity,
      taxRates = taxRates,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb must be a JSON object")
      return InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb(
        discounts = rawObject["discounts"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemDiscountsXd7b55bdc>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
        priceData = rawObject["price_data"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2>(it) },
        quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
        taxRates = rawObject["tax_rates"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemTaxRatesX5f3cd9d7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.price?.let { put("price", it) }
        value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
        value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
        value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormLineItemsItemX1c1111bb(block: InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb.Builder.() -> Unit): InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb = InlineV1QuotesPostRequestFormLineItemsItemX1c1111bb.build(block)
