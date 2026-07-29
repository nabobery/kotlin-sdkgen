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
 * Specifies how long the discount will be in effect if used on a subscription. Defaults to `once`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1coupons/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/duration
 */
@Serializable(with = InlineV1CouponsPostRequestFormDurationX79d6e553.Serializer::class)
public sealed class InlineV1CouponsPostRequestFormDurationX79d6e553 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `forever`.
   */
  public data object Forever : InlineV1CouponsPostRequestFormDurationX79d6e553() {
    public override val `value`: String = "forever"
  }

  /**
   * Documented value. Wire value: `once`.
   */
  public data object Once : InlineV1CouponsPostRequestFormDurationX79d6e553() {
    public override val `value`: String = "once"
  }

  /**
   * Documented value. Wire value: `repeating`.
   */
  public data object Repeating : InlineV1CouponsPostRequestFormDurationX79d6e553() {
    public override val `value`: String = "repeating"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CouponsPostRequestFormDurationX79d6e553()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CouponsPostRequestFormDurationX79d6e553 = when (value) {
      Forever.value -> Forever
      Once.value -> Once
      Repeating.value -> Repeating
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CouponsPostRequestFormDurationX79d6e553> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CouponsPostRequestFormDurationX79d6e553", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CouponsPostRequestFormDurationX79d6e553 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CouponsPostRequestFormDurationX79d6e553) {
      encoder.encodeString(value.value)
    }
  }
}
