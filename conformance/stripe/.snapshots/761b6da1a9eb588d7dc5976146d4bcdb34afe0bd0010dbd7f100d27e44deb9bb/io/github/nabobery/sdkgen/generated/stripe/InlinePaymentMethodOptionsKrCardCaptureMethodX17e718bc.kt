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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_kr_card/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsKrCardCaptureMethodX17e718bc.Serializer::class)
public sealed class InlinePaymentMethodOptionsKrCardCaptureMethodX17e718bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentMethodOptionsKrCardCaptureMethodX17e718bc() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsKrCardCaptureMethodX17e718bc()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsKrCardCaptureMethodX17e718bc = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsKrCardCaptureMethodX17e718bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsKrCardCaptureMethodX17e718bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsKrCardCaptureMethodX17e718bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsKrCardCaptureMethodX17e718bc) {
      encoder.encodeString(value.value)
    }
  }
}
