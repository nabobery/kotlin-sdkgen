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
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_mobilepay/properties/capture_m
 * ethod
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsMobilepayCaptureMethodX6a16f03c.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsMobilepayCaptureMethodX6a16f03c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlinePaymentIntentPaymentMethodOptionsMobilepayCaptureMethodX6a16f03c() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPaymentMethodOptionsMobilepayCaptureMethodX6a16f03c()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsMobilepayCaptureMethodX6a16f03c = when (value) {
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsMobilepayCaptureMethodX6a16f03c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsMobilepayCaptureMethodX6a16f03c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsMobilepayCaptureMethodX6a16f03c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsMobilepayCaptureMethodX6a16f03c) {
      encoder.encodeString(value.value)
    }
  }
}
