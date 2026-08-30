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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings/anyOf/0/properties/end_behavior/properti
 * es/missing_payment_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data/properties/trial_settings/anyOf/0/properties/end_behavior/properti
 * es/missing_payment_method
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancel`.
   */
  public data object Cancel : InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef() {
    public override val `value`: String = "cancel"
  }

  /**
   * Documented value. Wire value: `create_invoice`.
   */
  public data object CreateInvoice : InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef() {
    public override val `value`: String = "create_invoice"
  }

  /**
   * Documented value. Wire value: `pause`.
   */
  public data object Pause : InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef() {
    public override val `value`: String = "pause"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef = when (value) {
      Cancel.value -> Cancel
      CreateInvoice.value -> CreateInvoice
      Pause.value -> Pause
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataMissingPaymentMethodX800d18ef) {
      encoder.encodeString(value.value)
    }
  }
}
