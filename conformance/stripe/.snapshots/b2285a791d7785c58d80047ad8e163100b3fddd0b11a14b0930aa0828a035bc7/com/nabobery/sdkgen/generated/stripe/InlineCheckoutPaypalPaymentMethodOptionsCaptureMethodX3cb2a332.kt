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
 * sdkgen://source/openapi.json#/components/schemas/checkout_paypal_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332.Serializer::class)
public sealed class InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332) {
      encoder.encodeString(value.value)
    }
  }
}
