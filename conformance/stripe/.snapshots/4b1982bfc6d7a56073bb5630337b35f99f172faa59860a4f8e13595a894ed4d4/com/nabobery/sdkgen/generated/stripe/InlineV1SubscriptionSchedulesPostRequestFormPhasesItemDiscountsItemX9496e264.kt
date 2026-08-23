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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/discounts/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/discounts/anyOf/0/items
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264(
  public val coupon: String? = null,
  public val discount: String? = null,
  public val promotionCode: String? = null,
) {
  public class Builder {
    public var coupon: String? = null

    public var discount: String? = null

    public var promotionCode: String? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264(
      coupon = coupon,
      discount = discount,
      promotionCode = promotionCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264 must be a JSON object")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264(
        coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
        discount = rawObject["discount"]?.let { json.decodeFromJsonElement<String>(it) },
        promotionCode = rawObject["promotion_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264")
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

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemDiscountsItemX9496e264.build(block)
