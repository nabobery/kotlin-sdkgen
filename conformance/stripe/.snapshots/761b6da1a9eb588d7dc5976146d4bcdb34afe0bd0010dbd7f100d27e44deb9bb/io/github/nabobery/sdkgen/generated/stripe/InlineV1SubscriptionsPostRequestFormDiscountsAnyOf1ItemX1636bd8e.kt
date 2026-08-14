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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/discounts/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/discounts/anyOf/0/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e(
  public val coupon: String? = null,
  public val discount: String? = null,
  public val promotionCode: String? = null,
) {
  public class Builder {
    public var coupon: String? = null

    public var discount: String? = null

    public var promotionCode: String? = null

    public fun build(): InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e = InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e(
      coupon = coupon,
      discount = discount,
      promotionCode = promotionCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e must be a JSON object")
      return InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e(
        coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
        discount = rawObject["discount"]?.let { json.decodeFromJsonElement<String>(it) },
        promotionCode = rawObject["promotion_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e")
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

public fun inlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e(block: InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e = InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e.build(block)
