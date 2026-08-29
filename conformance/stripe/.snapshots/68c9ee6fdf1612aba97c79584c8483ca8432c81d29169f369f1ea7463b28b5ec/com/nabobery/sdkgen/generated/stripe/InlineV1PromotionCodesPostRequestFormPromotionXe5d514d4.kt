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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The promotion referenced by this promotion code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/promotion
 */
@Serializable(with = InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4.Serializer::class)
public class InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4(
  public val type: InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c,
  public val coupon: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c? = null

    public var type: InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var coupon: String? = null

    public fun build(): InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4 {
      check(typeValue != null) { "type is required" }
      return InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4(
        type = type,
        coupon = coupon,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4 must be a JSON object")
      val type = json.decodeRequired<InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c>(rawObject, "type")
      return InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4(
        type = type,
        coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.coupon?.let { put("coupon", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PromotionCodesPostRequestFormPromotionXe5d514d4(block: InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4.Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4 = InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PromotionCodesPostRequestFormPromotionXe5d514d4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
