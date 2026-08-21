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
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_afterpay_clearpay/properties/capture_method
 */
@Serializable(with = InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb.Serializer::class)
public sealed class InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb) {
      encoder.encodeString(value.value)
    }
  }
}
