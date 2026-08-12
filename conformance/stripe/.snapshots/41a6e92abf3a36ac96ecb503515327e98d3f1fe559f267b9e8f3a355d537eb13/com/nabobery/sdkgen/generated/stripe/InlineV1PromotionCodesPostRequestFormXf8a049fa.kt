package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * ww-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes~1{promotion_code}/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema
 */
@Serializable(with = InlineV1PromotionCodesPostRequestFormXf8a049fa.Serializer::class)
public class InlineV1PromotionCodesPostRequestFormXf8a049fa(
  /**
   * Whether the promotion code is currently active. A promotion code can only be reactivated when the coupon is still
   * valid and the promotion code is otherwise redeemable.
   */
  public val active: Boolean? = null,
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1PromotionCodesPostRequestFormMetadataX1f097777? = null,
  /**
   * Settings that restrict the redemption of the promotion code.
   */
  public val restrictions: InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Whether the promotion code is currently active. A promotion code can only be reactivated when the coupon is still
     * valid and the promotion code is otherwise redeemable.
     */
    public var active: Boolean? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1PromotionCodesPostRequestFormMetadataX1f097777? = null

    /**
     * Settings that restrict the redemption of the promotion code.
     */
    public var restrictions: InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e? = null

    public fun build(): InlineV1PromotionCodesPostRequestFormXf8a049fa = InlineV1PromotionCodesPostRequestFormXf8a049fa(
      active = active,
      expand = expand,
      metadata = metadata,
      restrictions = restrictions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormXf8a049fa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PromotionCodesPostRequestFormXf8a049fa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PromotionCodesPostRequestFormXf8a049fa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PromotionCodesPostRequestFormXf8a049fa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PromotionCodesPostRequestFormXf8a049fa must be a JSON object")
      return InlineV1PromotionCodesPostRequestFormXf8a049fa(
        active = rawObject["active"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PromotionCodesPostRequestFormMetadataX1f097777>(it) },
        restrictions = rawObject["restrictions"]?.let { json.decodeFromJsonElement<InlineV1PromotionCodesPostRequestFormRestrictionsX816e824e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PromotionCodesPostRequestFormXf8a049fa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PromotionCodesPostRequestFormXf8a049fa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.active?.let { put("active", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PromotionCodesPostRequestFormXf8a049fa(block: InlineV1PromotionCodesPostRequestFormXf8a049fa.Builder.() -> Unit): InlineV1PromotionCodesPostRequestFormXf8a049fa = InlineV1PromotionCodesPostRequestFormXf8a049fa.build(block)
