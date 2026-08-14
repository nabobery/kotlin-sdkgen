package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/components/schemas/checkout_alma_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86.Serializer::class)
public sealed class InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutAlmaPaymentMethodOptionsCaptureMethodX27facc86) {
      encoder.encodeString(value.value)
    }
  }
}
