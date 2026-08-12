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
 * Request ability to make [multiple captures](https://docs.stripe.com/payments/multicapture) for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_card/properties/request_multic
 * apture
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsCardRequestMulticaptureXcbbc4e7e) {
      encoder.encodeString(value.value)
    }
  }
}
