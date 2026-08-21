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
 * sdkgen://source/openapi.json#/components/schemas/checkout_revolut_pay_payment_method_options/properties/capture_metho
 * d
 */
@Serializable(with = InlineCheckoutRevolutPayPaymentMethodOptionsCaptureMethodXc60b0b31.Serializer::class)
public sealed class InlineCheckoutRevolutPayPaymentMethodOptionsCaptureMethodXc60b0b31 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutRevolutPayPaymentMethodOptionsCaptureMethodXc60b0b31() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutRevolutPayPaymentMethodOptionsCaptureMethodXc60b0b31()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutRevolutPayPaymentMethodOptionsCaptureMethodXc60b0b31 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutRevolutPayPaymentMethodOptionsCaptureMethodXc60b0b31> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutRevolutPayPaymentMethodOptionsCaptureMethodXc60b0b31", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutRevolutPayPaymentMethodOptionsCaptureMethodXc60b0b31 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutRevolutPayPaymentMethodOptionsCaptureMethodXc60b0b31) {
      encoder.encodeString(value.value)
    }
  }
}
