package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/promotion/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1promotion_codes/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/promotion/properties/type
 */
@Serializable(with = InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c.Serializer::class)
public sealed class InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coupon`.
   */
  public data object Coupon : InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c() {
    public override val `value`: String = "coupon"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c = when (value) {
      Coupon.value -> Coupon
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PromotionCodesPostRequestFormPromotionTypeXb7e5197c) {
      encoder.encodeString(value.value)
    }
  }
}
