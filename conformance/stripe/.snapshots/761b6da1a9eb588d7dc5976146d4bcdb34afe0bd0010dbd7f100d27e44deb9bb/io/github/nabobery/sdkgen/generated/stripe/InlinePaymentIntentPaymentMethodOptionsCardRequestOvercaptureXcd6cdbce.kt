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
 * Request ability to [overcapture](https://docs.stripe.com/payments/overcapture) for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_card/properties/request_overca
 * pture
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `if_available`.
   */
  public data object IfAvailable : InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce() {
    public override val `value`: String = "if_available"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce = when (value) {
      IfAvailable.value -> IfAvailable
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsCardRequestOvercaptureXcd6cdbce) {
      encoder.encodeString(value.value)
    }
  }
}
