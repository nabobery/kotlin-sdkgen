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
 * sdkgen://source/openapi.json#/components/schemas/checkout_mobilepay_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutMobilepayPaymentMethodOptionsCaptureMethodXa98cf228.Serializer::class)
public sealed class InlineCheckoutMobilepayPaymentMethodOptionsCaptureMethodXa98cf228 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutMobilepayPaymentMethodOptionsCaptureMethodXa98cf228() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutMobilepayPaymentMethodOptionsCaptureMethodXa98cf228()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutMobilepayPaymentMethodOptionsCaptureMethodXa98cf228 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutMobilepayPaymentMethodOptionsCaptureMethodXa98cf228> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutMobilepayPaymentMethodOptionsCaptureMethodXa98cf228", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutMobilepayPaymentMethodOptionsCaptureMethodXa98cf228 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutMobilepayPaymentMethodOptionsCaptureMethodXa98cf228) {
      encoder.encodeString(value.value)
    }
  }
}
