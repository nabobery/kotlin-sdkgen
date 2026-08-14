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
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_type_specific_payment_method_options_client/propertie
 * s/capture_method
 */
@Serializable(with = InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d.Serializer::class)
public sealed class InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic_delayed`.
   */
  public data object AutomaticDelayed : InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d() {
    public override val `value`: String = "automatic_delayed"
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d() {
    public override val `value`: String = "manual"
  }

  /**
   * Documented value. Wire value: `manual_preferred`.
   */
  public data object ManualPreferred : InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d() {
    public override val `value`: String = "manual_preferred"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d = when (value) {
      AutomaticDelayed.value -> AutomaticDelayed
      Manual.value -> Manual
      ManualPreferred.value -> ManualPreferred
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentTypeSpecificPaymentMethodOptionsClientCaptureMethodX008df07d) {
      encoder.encodeString(value.value)
    }
  }
}
