package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/discounts/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/line_items/items/properties/discounts/anyOf/0/items
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99.Serializer::class)
public class InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99(
  public val coupon: String? = null,
  public val discount: String? = null,
  public val promotionCode: String? = null,
) {
  public class Builder {
    public var coupon: String? = null

    public var discount: String? = null

    public var promotionCode: String? = null

    public fun build(): InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99 = InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99(
      coupon = coupon,
      discount = discount,
      promotionCode = promotionCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99 must be a JSON object")
      return InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99(
        coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
        discount = rawObject["discount"]?.let { json.decodeFromJsonElement<String>(it) },
        promotionCode = rawObject["promotion_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.coupon?.let { put("coupon", it) }
        value.discount?.let { put("discount", it) }
        value.promotionCode?.let { put("promotion_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99(block: InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99.Builder.() -> Unit): InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99 = InlineV1QuotesPostRequestFormLineItemsItemDiscountsAnyOf1ItemXb2d5dd99.build(block)
