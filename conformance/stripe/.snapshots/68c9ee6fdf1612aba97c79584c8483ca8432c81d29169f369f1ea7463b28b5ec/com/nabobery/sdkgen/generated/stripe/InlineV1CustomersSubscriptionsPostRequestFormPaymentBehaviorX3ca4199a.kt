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
 * Controls how Stripe handles the first invoice when payment is required and `collection_method=charge_automatically`.
 * Subscriptions with `collection_method=send_invoice` are automatically activated regardless of the first Invoice
 * status.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_behavior
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `allow_incomplete`.
   */
  public data object AllowIncomplete : InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a() {
    public override val `value`: String = "allow_incomplete"
  }

  /**
   * Documented value. Wire value: `default_incomplete`.
   */
  public data object DefaultIncomplete : InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a() {
    public override val `value`: String = "default_incomplete"
  }

  /**
   * Documented value. Wire value: `error_if_incomplete`.
   */
  public data object ErrorIfIncomplete : InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a() {
    public override val `value`: String = "error_if_incomplete"
  }

  /**
   * Documented value. Wire value: `pending_if_incomplete`.
   */
  public data object PendingIfIncomplete : InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a() {
    public override val `value`: String = "pending_if_incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a = when (value) {
      AllowIncomplete.value -> AllowIncomplete
      DefaultIncomplete.value -> DefaultIncomplete
      ErrorIfIncomplete.value -> ErrorIfIncomplete
      PendingIfIncomplete.value -> PendingIfIncomplete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentBehaviorX3ca4199a) {
      encoder.encodeString(value.value)
    }
  }
}
