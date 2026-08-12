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
 * sdkgen://source/openapi.json#/components/schemas/checkout_scalapay_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d.Serializer::class)
public sealed class InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutScalapayPaymentMethodOptionsCaptureMethodX47324b8d) {
      encoder.encodeString(value.value)
    }
  }
}
