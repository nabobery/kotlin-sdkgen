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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_alma/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d.Serializer::class)
public sealed class InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d) {
      encoder.encodeString(value.value)
    }
  }
}
