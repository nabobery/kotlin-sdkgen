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
 * The type of promotion.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/promotion_codes_resource_promotion/properties/type
 */
@Serializable(with = InlinePromotionCodesResourcePromotionTypeX59a75996.Serializer::class)
public sealed class InlinePromotionCodesResourcePromotionTypeX59a75996 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coupon`.
   */
  public data object Coupon : InlinePromotionCodesResourcePromotionTypeX59a75996() {
    public override val `value`: String = "coupon"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePromotionCodesResourcePromotionTypeX59a75996()

  public companion object {
    public fun fromValue(`value`: String): InlinePromotionCodesResourcePromotionTypeX59a75996 = when (value) {
      Coupon.value -> Coupon
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePromotionCodesResourcePromotionTypeX59a75996> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePromotionCodesResourcePromotionTypeX59a75996", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePromotionCodesResourcePromotionTypeX59a75996 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePromotionCodesResourcePromotionTypeX59a75996) {
      encoder.encodeString(value.value)
    }
  }
}
