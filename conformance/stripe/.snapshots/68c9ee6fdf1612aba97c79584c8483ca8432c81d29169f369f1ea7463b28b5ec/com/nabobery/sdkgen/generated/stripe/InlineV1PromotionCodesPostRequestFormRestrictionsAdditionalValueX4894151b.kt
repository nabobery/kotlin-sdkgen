package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes~1{promotion_code}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/restrictions/properties/currency_options/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes~1{promotion_code}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/restrictions/properties/currency_options/additionalProperties
 */
@Serializable(with = InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b.Serializer::class)
public class InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b(
  public val minimumAmount: Int? = null,
) {
  public class Builder {
    public var minimumAmount: Int? = null

    public fun build(): InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b = InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b(
      minimumAmount = minimumAmount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b must be a JSON object")
      return InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b(
        minimumAmount = rawObject["minimum_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.minimumAmount?.let { put("minimum_amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b(block: InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b.Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b = InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b.build(block)
