package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/promotion_codes_resource_promotion
 */
@Serializable(with = PromotionCodesResourcePromotion.Serializer::class)
public class PromotionCodesResourcePromotion(
  /**
   * The type of promotion.
   */
  public val type: InlinePromotionCodesResourcePromotionTypeX59a75996,
  /**
   * If promotion `type` is `coupon`, the coupon for this promotion.
   */
  public val coupon: InlinePromotionCodesResourcePromotionCouponX428da822? = null,
) {
  public class Builder {
    private var typeValue: InlinePromotionCodesResourcePromotionTypeX59a75996? = null

    public var type: InlinePromotionCodesResourcePromotionTypeX59a75996
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * If promotion `type` is `coupon`, the coupon for this promotion.
     */
    public var coupon: InlinePromotionCodesResourcePromotionCouponX428da822? = null

    public fun build(): PromotionCodesResourcePromotion {
      check(typeValue != null) { "type is required" }
      return PromotionCodesResourcePromotion(
        type = type,
        coupon = coupon,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PromotionCodesResourcePromotion = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PromotionCodesResourcePromotion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PromotionCodesResourcePromotion {
      val jsonDecoder = decoder.requireJsonDecoder("PromotionCodesResourcePromotion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PromotionCodesResourcePromotion must be a JSON object")
      val type = json.decodeRequired<InlinePromotionCodesResourcePromotionTypeX59a75996>(rawObject, "type")
      return PromotionCodesResourcePromotion(
        type = type,
        coupon = rawObject["coupon"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePromotionCodesResourcePromotionCouponX428da822?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PromotionCodesResourcePromotion) {
      val jsonEncoder = encoder.requireJsonEncoder("PromotionCodesResourcePromotion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.coupon?.let { put("coupon", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun promotionCodesResourcePromotion(block: PromotionCodesResourcePromotion.Builder.() -> Unit): PromotionCodesResourcePromotion = PromotionCodesResourcePromotion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PromotionCodesResourcePromotion is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
