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
 * payment method in a checkout flow. The field defaults to `unspecified`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/allow_redisplay
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d.Serializer::class)
public sealed class InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d) {
      encoder.encodeString(value.value)
    }
  }
}
