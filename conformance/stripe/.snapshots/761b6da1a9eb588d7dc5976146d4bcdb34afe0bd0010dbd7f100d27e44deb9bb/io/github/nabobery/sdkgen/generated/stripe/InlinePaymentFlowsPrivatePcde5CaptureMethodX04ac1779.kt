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
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_private_payment_methods_samsung_pay_payment_method_opt
 * ions/properties/capture_method
 */
@Serializable(with = InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779.Serializer::class)
public sealed class InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779 = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsPrivatePcde5CaptureMethodX04ac1779) {
      encoder.encodeString(value.value)
    }
  }
}
