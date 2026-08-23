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
 * One of `forever`, `once`, or `repeating`. Describes how long a customer who applies this coupon will get the
 * discount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/coupon/properties/duration
 */
@Serializable(with = InlineCouponDurationX7e8fa5e4.Serializer::class)
public sealed class InlineCouponDurationX7e8fa5e4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `forever`.
   */
  public data object Forever : InlineCouponDurationX7e8fa5e4() {
    public override val `value`: String = "forever"
  }

  /**
   * Documented value. Wire value: `once`.
   */
  public data object Once : InlineCouponDurationX7e8fa5e4() {
    public override val `value`: String = "once"
  }

  /**
   * Documented value. Wire value: `repeating`.
   */
  public data object Repeating : InlineCouponDurationX7e8fa5e4() {
    public override val `value`: String = "repeating"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCouponDurationX7e8fa5e4()

  public companion object {
    public fun fromValue(`value`: String): InlineCouponDurationX7e8fa5e4 = when (value) {
      Forever.value -> Forever
      Once.value -> Once
      Repeating.value -> Repeating
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCouponDurationX7e8fa5e4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCouponDurationX7e8fa5e4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCouponDurationX7e8fa5e4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCouponDurationX7e8fa5e4) {
      encoder.encodeString(value.value)
    }
  }
}
