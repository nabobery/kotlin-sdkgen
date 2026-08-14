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
 * Controls whether this PaymentIntent will accept redirect-based payment methods.
 *
 * Redirect-based payment methods may require your customer to be redirected to a payment method's app or site for
 * authentication or additional steps. To [confirm](https://docs.stripe.com/api/payment_intents/confirm) this
 * PaymentIntent, you may be required to provide a `return_url` to redirect customers back to your site after they
 * authenticate or complete the payment.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_automatic_payment_methods_payment_intent/properties/al
 * low_redirects
 */
@Serializable(with = InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab.Serializer::class)
public sealed class InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsAutomaticPaymentMethodsPaymentIntentAllowRedirectsX4b260eab) {
      encoder.encodeString(value.value)
    }
  }
}
