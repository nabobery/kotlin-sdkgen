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
 * Controls how Stripe handles payment when a subscription update requires payment and
 * `collection_method=charge_automatically`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_behavior
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `allow_incomplete`.
   */
  public data object AllowIncomplete : InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a() {
    public override val `value`: String = "allow_incomplete"
  }

  /**
   * Documented value. Wire value: `default_incomplete`.
   */
  public data object DefaultIncomplete : InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a() {
    public override val `value`: String = "default_incomplete"
  }

  /**
   * Documented value. Wire value: `error_if_incomplete`.
   */
  public data object ErrorIfIncomplete : InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a() {
    public override val `value`: String = "error_if_incomplete"
  }

  /**
   * Documented value. Wire value: `pending_if_incomplete`.
   */
  public data object PendingIfIncomplete : InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a() {
    public override val `value`: String = "pending_if_incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a = when (value) {
      AllowIncomplete.value -> AllowIncomplete
      DefaultIncomplete.value -> DefaultIncomplete
      ErrorIfIncomplete.value -> ErrorIfIncomplete
      PendingIfIncomplete.value -> PendingIfIncomplete
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormPaymentBehaviorX5db8ee6a) {
      encoder.encodeString(value.value)
    }
  }
}
