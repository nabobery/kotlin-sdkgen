package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/discounts/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/discounts/anyOf/0/items
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d(
  public val coupon: String? = null,
  public val discount: String? = null,
  public val promotionCode: String? = null,
) {
  public class Builder {
    public var coupon: String? = null

    public var discount: String? = null

    public var promotionCode: String? = null

    public fun build(): InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d = InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d(
      coupon = coupon,
      discount = discount,
      promotionCode = promotionCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d must be a JSON object")
      return InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d(
        coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
        discount = rawObject["discount"]?.let { json.decodeFromJsonElement<String>(it) },
        promotionCode = rawObject["promotion_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d")
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

public fun inlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d(block: InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d.Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d = InlineV1InvoiceitemsPostRequestFormDiscountsAnyOf1ItemX0a4f0e2d.build(block)
