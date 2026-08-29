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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/coupon/properties/object
 */
@Serializable(with = InlineCouponObjectValueX72b6b420.Serializer::class)
public sealed class InlineCouponObjectValueX72b6b420 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `coupon`.
   */
  public data object Coupon : InlineCouponObjectValueX72b6b420() {
    public override val `value`: String = "coupon"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCouponObjectValueX72b6b420()

  public companion object {
    public fun fromValue(`value`: String): InlineCouponObjectValueX72b6b420 = when (value) {
      Coupon.value -> Coupon
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCouponObjectValueX72b6b420> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCouponObjectValueX72b6b420", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCouponObjectValueX72b6b420 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCouponObjectValueX72b6b420) {
      encoder.encodeString(value.value)
    }
  }
}
