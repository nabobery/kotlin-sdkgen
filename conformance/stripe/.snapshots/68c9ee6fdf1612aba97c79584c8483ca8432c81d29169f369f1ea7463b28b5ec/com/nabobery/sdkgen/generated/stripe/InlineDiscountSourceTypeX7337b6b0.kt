package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The source type of the discount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/discount_source/properties/type
 */
@Serializable(with = InlineDiscountSourceTypeX7337b6b0.Serializer::class)
public sealed class InlineDiscountSourceTypeX7337b6b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coupon`.
   */
  public data object Coupon : InlineDiscountSourceTypeX7337b6b0() {
    public override val `value`: String = "coupon"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDiscountSourceTypeX7337b6b0()

  public companion object {
    public fun fromValue(`value`: String): InlineDiscountSourceTypeX7337b6b0 = when (value) {
      Coupon.value -> Coupon
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDiscountSourceTypeX7337b6b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDiscountSourceTypeX7337b6b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDiscountSourceTypeX7337b6b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDiscountSourceTypeX7337b6b0) {
      encoder.encodeString(value.value)
    }
  }
}
