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
 * Source: sdkgen://source/openapi.json#/components/schemas/source/properties/allow_redisplay
 */
@Serializable(with = InlineSourceAllowRedisplayX98b1333c.Serializer::class)
public sealed class InlineSourceAllowRedisplayX98b1333c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineSourceAllowRedisplayX98b1333c() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineSourceAllowRedisplayX98b1333c() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineSourceAllowRedisplayX98b1333c() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSourceAllowRedisplayX98b1333c()

  public companion object {
    public fun fromValue(`value`: String): InlineSourceAllowRedisplayX98b1333c = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSourceAllowRedisplayX98b1333c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSourceAllowRedisplayX98b1333c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSourceAllowRedisplayX98b1333c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSourceAllowRedisplayX98b1333c) {
      encoder.encodeString(value.value)
    }
  }
}
