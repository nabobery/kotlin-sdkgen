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
 * sdkgen://source/openapi.json#/components/schemas/checkout_cashapp_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutCashappPaymentMethodOptionsCaptureMethodXc921e582.Serializer::class)
public sealed class InlineCheckoutCashappPaymentMethodOptionsCaptureMethodXc921e582 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutCashappPaymentMethodOptionsCaptureMethodXc921e582() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCashappPaymentMethodOptionsCaptureMethodXc921e582()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCashappPaymentMethodOptionsCaptureMethodXc921e582 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutCashappPaymentMethodOptionsCaptureMethodXc921e582> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutCashappPaymentMethodOptionsCaptureMethodXc921e582", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCashappPaymentMethodOptionsCaptureMethodXc921e582 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCashappPaymentMethodOptionsCaptureMethodXc921e582) {
      encoder.encodeString(value.value)
    }
  }
}
