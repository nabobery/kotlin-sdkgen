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
 * sdkgen://source/openapi.json#/components/schemas/checkout_satispay_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutSatispayPaymentMethodOptionsCaptureMethodX36bc42ad.Serializer::class)
public sealed class InlineCheckoutSatispayPaymentMethodOptionsCaptureMethodX36bc42ad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutSatispayPaymentMethodOptionsCaptureMethodX36bc42ad() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSatispayPaymentMethodOptionsCaptureMethodX36bc42ad()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSatispayPaymentMethodOptionsCaptureMethodX36bc42ad = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSatispayPaymentMethodOptionsCaptureMethodX36bc42ad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutSatispayPaymentMethodOptionsCaptureMethodX36bc42ad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSatispayPaymentMethodOptionsCaptureMethodX36bc42ad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSatispayPaymentMethodOptionsCaptureMethodX36bc42ad) {
      encoder.encodeString(value.value)
    }
  }
}
