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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_payment_method_preview/properties/allow
 * _redisplay
 */
@Serializable(with = InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4.Serializer::class)
public sealed class InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `limited`.
   */
  public data object Limited : InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4() {
    public override val `value`: String = "limited"
  }

  /**
   * Documented value. Wire value: `unspecified`.
   */
  public data object Unspecified : InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4() {
    public override val `value`: String = "unspecified"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4()

  public companion object {
    public fun fromValue(`value`: String): InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4 = when (value) {
      Always.value -> Always
      Limited.value -> Limited
      Unspecified.value -> Unspecified
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineConfirmationTokensResourcePaymentMethodPreviewAllowRedisplayX2508abd4) {
      encoder.encodeString(value.value)
    }
  }
}
