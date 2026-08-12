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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_scalapay/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371.Serializer::class)
public sealed class InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsScalapayCaptureMethodXcde90371) {
      encoder.encodeString(value.value)
    }
  }
}
