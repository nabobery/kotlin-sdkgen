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
 * Controls whether this SetupIntent will accept redirect-based payment methods.
 *
 * Redirect-based payment methods may require your customer to be redirected to a payment method's app or site for
 * authentication or additional steps. To [confirm](https://docs.stripe.com/api/setup_intents/confirm) this SetupIntent,
 * you may be required to provide a `return_url` to redirect customers back to your site after they authenticate or
 * complete the setup.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_flows_automatic_payment_methods_setup_intent/properties/allo
 * w_redirects
 */
@Serializable(with = InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb.Serializer::class)
public sealed class InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always`.
   */
  public data object Always : InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb() {
    public override val `value`: String = "always"
  }

  /**
   * Documented value. Wire value: `never`.
   */
  public data object Never : InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb() {
    public override val `value`: String = "never"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb = when (value) {
      Always.value -> Always
      Never.value -> Never
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentFlowsAutomaticPaymentMethodsSetupIntentAllowRedirectsXdba377fb) {
      encoder.encodeString(value.value)
    }
  }
}
