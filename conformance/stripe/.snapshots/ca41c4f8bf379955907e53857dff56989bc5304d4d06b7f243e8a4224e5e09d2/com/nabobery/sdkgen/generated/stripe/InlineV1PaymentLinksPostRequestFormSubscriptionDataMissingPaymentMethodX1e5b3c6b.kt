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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/trial_settings/properties/end_behavior/properties/missing_payment_metho
 * d.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data/properties/trial_settings/properties/end_behavior/properties/missing_payment_metho
 * d
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancel`.
   */
  public data object Cancel : InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b() {
    public override val `value`: String = "cancel"
  }

  /**
   * Documented value. Wire value: `create_invoice`.
   */
  public data object CreateInvoice : InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b() {
    public override val `value`: String = "create_invoice"
  }

  /**
   * Documented value. Wire value: `pause`.
   */
  public data object Pause : InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b() {
    public override val `value`: String = "pause"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b = when (value) {
      Cancel.value -> Cancel
      CreateInvoice.value -> CreateInvoice
      Pause.value -> Pause
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX1e5b3c6b) {
      encoder.encodeString(value.value)
    }
  }
}
