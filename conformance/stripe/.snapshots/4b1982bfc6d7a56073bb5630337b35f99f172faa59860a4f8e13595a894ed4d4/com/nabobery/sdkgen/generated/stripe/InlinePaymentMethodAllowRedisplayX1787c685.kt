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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method/properties/allow_redisplay
 */
@Serializable(with = InlinePaymentMethodAllowRedisplayX1787c685.Serializer::class)
public sealed class InlinePaymentMethodAllowRedisplayX1787c685 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlinePaymentMethodAllowRedisplayX1787c685() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlinePaymentMethodAllowRedisplayX1787c685() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlinePaymentMethodAllowRedisplayX1787c685() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodAllowRedisplayX1787c685()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodAllowRedisplayX1787c685 = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodAllowRedisplayX1787c685> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodAllowRedisplayX1787c685", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodAllowRedisplayX1787c685 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodAllowRedisplayX1787c685) {
      encoder.encodeString(value.value)
    }
  }
}
