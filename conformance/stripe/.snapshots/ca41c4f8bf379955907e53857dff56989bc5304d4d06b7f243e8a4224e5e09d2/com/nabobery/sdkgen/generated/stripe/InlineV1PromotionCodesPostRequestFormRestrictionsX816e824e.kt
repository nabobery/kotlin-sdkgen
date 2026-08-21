package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * Settings that restrict the redemption of the promotion code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes~1{promotion_code}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/restrictions
 */
@Serializable(with = InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e.Serializer::class)
public class InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e(
  currencyOptions: Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b>? = null,
) {
  public val currencyOptions:
      Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b>? =
      currencyOptions?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var currencyOptionsValue:
        Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b>? =
        null

    public var currencyOptions:
        Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b>?
      get() = currencyOptionsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        currencyOptionsValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e = InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e(
      currencyOptions = currencyOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e must be a JSON object")
      return InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e(
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<Map<String, InlineV1PromotionCodesPostRequestFormRestrictionsAdditionalValueX4894151b>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PromotionCodesPostRequestFormRestrictionsX816e824e(block: InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e.Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e = InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e.build(block)
