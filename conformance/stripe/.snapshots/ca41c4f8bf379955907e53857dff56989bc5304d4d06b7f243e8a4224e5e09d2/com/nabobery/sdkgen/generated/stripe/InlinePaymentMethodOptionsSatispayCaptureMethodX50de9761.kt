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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_satispay/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsSatispayCaptureMethodX50de9761.Serializer::class)
public sealed class InlinePaymentMethodOptionsSatispayCaptureMethodX50de9761 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentMethodOptionsSatispayCaptureMethodX50de9761() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsSatispayCaptureMethodX50de9761()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsSatispayCaptureMethodX50de9761 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsSatispayCaptureMethodX50de9761> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsSatispayCaptureMethodX50de9761", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsSatispayCaptureMethodX50de9761 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsSatispayCaptureMethodX50de9761) {
      encoder.encodeString(value.value)
    }
  }
}
