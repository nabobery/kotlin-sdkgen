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
 * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) when the billing
 * cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an
 * item's `quantity` changes. The default value is `create_prorations`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/proration_behavior
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `always_invoice`.
   */
  public data object AlwaysInvoice : InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4() {
    public override val `value`: String = "always_invoice"
  }

  /**
   * Documented value. Wire value: `create_prorations`.
   */
  public data object CreateProrations : InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4() {
    public override val `value`: String = "create_prorations"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4 = when (value) {
      AlwaysInvoice.value -> AlwaysInvoice
      CreateProrations.value -> CreateProrations
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormProrationBehaviorXf24d74b4) {
      encoder.encodeString(value.value)
    }
  }
}
