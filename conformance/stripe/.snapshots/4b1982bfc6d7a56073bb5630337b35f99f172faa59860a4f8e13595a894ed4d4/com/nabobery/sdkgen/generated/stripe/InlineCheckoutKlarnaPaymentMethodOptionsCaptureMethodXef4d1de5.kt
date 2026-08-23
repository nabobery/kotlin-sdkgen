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
 * sdkgen://source/openapi.json#/components/schemas/checkout_klarna_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutKlarnaPaymentMethodOptionsCaptureMethodXef4d1de5.Serializer::class)
public sealed class InlineCheckoutKlarnaPaymentMethodOptionsCaptureMethodXef4d1de5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutKlarnaPaymentMethodOptionsCaptureMethodXef4d1de5() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutKlarnaPaymentMethodOptionsCaptureMethodXef4d1de5()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutKlarnaPaymentMethodOptionsCaptureMethodXef4d1de5 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutKlarnaPaymentMethodOptionsCaptureMethodXef4d1de5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutKlarnaPaymentMethodOptionsCaptureMethodXef4d1de5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutKlarnaPaymentMethodOptionsCaptureMethodXef4d1de5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutKlarnaPaymentMethodOptionsCaptureMethodXef4d1de5) {
      encoder.encodeString(value.value)
    }
  }
}
