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
 * sdkgen://source/openapi.json#/components/schemas/checkout_sunbit_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutSunbitPaymentMethodOptionsCaptureMethodXd54e7609.Serializer::class)
public sealed class InlineCheckoutSunbitPaymentMethodOptionsCaptureMethodXd54e7609 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutSunbitPaymentMethodOptionsCaptureMethodXd54e7609() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutSunbitPaymentMethodOptionsCaptureMethodXd54e7609()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutSunbitPaymentMethodOptionsCaptureMethodXd54e7609 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSunbitPaymentMethodOptionsCaptureMethodXd54e7609> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutSunbitPaymentMethodOptionsCaptureMethodXd54e7609", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutSunbitPaymentMethodOptionsCaptureMethodXd54e7609 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSunbitPaymentMethodOptionsCaptureMethodXd54e7609) {
      encoder.encodeString(value.value)
    }
  }
}
