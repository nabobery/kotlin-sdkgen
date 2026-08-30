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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_paypal/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsPaypalCaptureMethodX0ff11584.Serializer::class)
public sealed class InlinePaymentMethodOptionsPaypalCaptureMethodX0ff11584 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentMethodOptionsPaypalCaptureMethodX0ff11584() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsPaypalCaptureMethodX0ff11584()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsPaypalCaptureMethodX0ff11584 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsPaypalCaptureMethodX0ff11584> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsPaypalCaptureMethodX0ff11584", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsPaypalCaptureMethodX0ff11584 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsPaypalCaptureMethodX0ff11584) {
      encoder.encodeString(value.value)
    }
  }
}
