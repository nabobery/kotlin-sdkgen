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
 * sdkgen://source/openapi.json#/components/schemas/checkout_card_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137.Serializer::class)
public sealed class InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutCardPaymentMethodOptionsCaptureMethodXffcd4137) {
      encoder.encodeString(value.value)
    }
  }
}
