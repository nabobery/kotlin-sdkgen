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
 * sdkgen://source/openapi.json#/components/schemas/checkout_billie_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44.Serializer::class)
public sealed class InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutBilliePaymentMethodOptionsCaptureMethodXfbb7eb44) {
      encoder.encodeString(value.value)
    }
  }
}
