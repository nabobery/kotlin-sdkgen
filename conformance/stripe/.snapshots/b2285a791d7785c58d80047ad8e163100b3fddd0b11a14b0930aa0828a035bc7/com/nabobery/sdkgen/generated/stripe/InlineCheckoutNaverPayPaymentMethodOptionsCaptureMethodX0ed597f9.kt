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
 * sdkgen://source/openapi.json#/components/schemas/checkout_naver_pay_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutNaverPayPaymentMethodOptionsCaptureMethodX0ed597f9.Serializer::class)
public sealed class InlineCheckoutNaverPayPaymentMethodOptionsCaptureMethodX0ed597f9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutNaverPayPaymentMethodOptionsCaptureMethodX0ed597f9() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutNaverPayPaymentMethodOptionsCaptureMethodX0ed597f9()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutNaverPayPaymentMethodOptionsCaptureMethodX0ed597f9 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutNaverPayPaymentMethodOptionsCaptureMethodX0ed597f9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutNaverPayPaymentMethodOptionsCaptureMethodX0ed597f9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutNaverPayPaymentMethodOptionsCaptureMethodX0ed597f9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutNaverPayPaymentMethodOptionsCaptureMethodX0ed597f9) {
      encoder.encodeString(value.value)
    }
  }
}
