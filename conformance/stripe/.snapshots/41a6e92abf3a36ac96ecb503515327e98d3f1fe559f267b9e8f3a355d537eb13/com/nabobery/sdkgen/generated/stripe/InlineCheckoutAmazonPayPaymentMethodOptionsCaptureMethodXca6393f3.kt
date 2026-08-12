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
 * Controls when the funds will be captured from the customer's account.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_amazon_pay_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutAmazonPayPaymentMethodOptionsCaptureMethodXca6393f3.Serializer::class)
public sealed class InlineCheckoutAmazonPayPaymentMethodOptionsCaptureMethodXca6393f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutAmazonPayPaymentMethodOptionsCaptureMethodXca6393f3() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutAmazonPayPaymentMethodOptionsCaptureMethodXca6393f3()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutAmazonPayPaymentMethodOptionsCaptureMethodXca6393f3 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutAmazonPayPaymentMethodOptionsCaptureMethodXca6393f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutAmazonPayPaymentMethodOptionsCaptureMethodXca6393f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutAmazonPayPaymentMethodOptionsCaptureMethodXca6393f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutAmazonPayPaymentMethodOptionsCaptureMethodXca6393f3) {
      encoder.encodeString(value.value)
    }
  }
}
