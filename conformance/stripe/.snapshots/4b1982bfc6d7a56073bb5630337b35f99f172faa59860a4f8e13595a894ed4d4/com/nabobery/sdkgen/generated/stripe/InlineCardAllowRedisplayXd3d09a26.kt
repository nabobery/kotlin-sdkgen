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
 * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
 * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved
 * payment method in a checkout flow. The field defaults to “unspecified”.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/card/properties/allow_redisplay
 */
@Serializable(with = InlineCardAllowRedisplayXd3d09a26.Serializer::class)
public sealed class InlineCardAllowRedisplayXd3d09a26 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineCardAllowRedisplayXd3d09a26() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineCardAllowRedisplayXd3d09a26() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineCardAllowRedisplayXd3d09a26() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCardAllowRedisplayXd3d09a26()

  public companion object {
    public fun fromValue(`value`: String): InlineCardAllowRedisplayXd3d09a26 = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCardAllowRedisplayXd3d09a26> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCardAllowRedisplayXd3d09a26", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCardAllowRedisplayXd3d09a26 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCardAllowRedisplayXd3d09a26) {
      encoder.encodeString(value.value)
    }
  }
}
