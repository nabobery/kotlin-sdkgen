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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/trial_settings/properties/end_behavior/properties/missing_payment_
 * method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/trial_settings/properties/end_behavior/properties/missing_payment_
 * method
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancel`.
   */
  public data object Cancel : InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e() {
    public override val `value`: String = "cancel"
  }

  /**
   * Documented value. Wire value: `create_invoice`.
   */
  public data object CreateInvoice : InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e() {
    public override val `value`: String = "create_invoice"
  }

  /**
   * Documented value. Wire value: `pause`.
   */
  public data object Pause : InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e() {
    public override val `value`: String = "pause"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e = when (value) {
      Cancel.value -> Cancel
      CreateInvoice.value -> CreateInvoice
      Pause.value -> Pause
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormMissingPaymentMethodX2ce1d29e) {
      encoder.encodeString(value.value)
    }
  }
}
