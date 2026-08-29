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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/cashapp/anyOf/0/properties/capture_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/cashapp/anyOf/0/properties/capture_method
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `manual`.
   */
  public data object Manual : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2() {
    public override val `value`: String = "manual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2 = when (value) {
      Value.value -> Value
      Manual.value -> Manual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXfc3f76c2) {
      encoder.encodeString(value.value)
    }
  }
}
