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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/trial_settings/properties/end_behavior/properties/missing_payment_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/trial_settings/properties/end_behavior/properties/missing_payment_method
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cancel`.
   */
  public data object Cancel : InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b() {
    public override val `value`: String = "cancel"
  }

  /**
   * Documented value. Wire value: `create_invoice`.
   */
  public data object CreateInvoice : InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b() {
    public override val `value`: String = "create_invoice"
  }

  /**
   * Documented value. Wire value: `pause`.
   */
  public data object Pause : InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b() {
    public override val `value`: String = "pause"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b = when (value) {
      Cancel.value -> Cancel
      CreateInvoice.value -> CreateInvoice
      Pause.value -> Pause
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormMissingPaymentMethodX2c3ded2b) {
      encoder.encodeString(value.value)
    }
  }
}
