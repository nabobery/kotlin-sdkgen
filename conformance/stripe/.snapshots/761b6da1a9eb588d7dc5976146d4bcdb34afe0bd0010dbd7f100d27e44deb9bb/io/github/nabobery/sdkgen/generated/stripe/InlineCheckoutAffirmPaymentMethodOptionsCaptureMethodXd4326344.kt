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
 * sdkgen://source/openapi.json#/components/schemas/checkout_affirm_payment_method_options/properties/capture_method
 */
@Serializable(with = InlineCheckoutAffirmPaymentMethodOptionsCaptureMethodXd4326344.Serializer::class)
public sealed class InlineCheckoutAffirmPaymentMethodOptionsCaptureMethodXd4326344 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineCheckoutAffirmPaymentMethodOptionsCaptureMethodXd4326344() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutAffirmPaymentMethodOptionsCaptureMethodXd4326344()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutAffirmPaymentMethodOptionsCaptureMethodXd4326344 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutAffirmPaymentMethodOptionsCaptureMethodXd4326344> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineCheckoutAffirmPaymentMethodOptionsCaptureMethodXd4326344", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutAffirmPaymentMethodOptionsCaptureMethodXd4326344 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutAffirmPaymentMethodOptionsCaptureMethodXd4326344) {
      encoder.encodeString(value.value)
    }
  }
}
