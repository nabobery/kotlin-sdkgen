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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_billie/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6.Serializer::class)
public sealed class InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsBillieCaptureMethodX4f9e40c6) {
      encoder.encodeString(value.value)
    }
  }
}
