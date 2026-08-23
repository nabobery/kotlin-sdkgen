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
 * The billing cycle anchor that applies when the subscription is resumed. Either `now` or `unchanged`. The default is
 * `now`. For more information, see the billing cycle
 * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1resume/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/billing_cycle_anchor
 */
@Serializable(with = InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e.Serializer::class)
public sealed class InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e() {
    public override val `value`: String = "now"
  }

  /**
   * Documented value. Wire value: `unchanged`.
   */
  public data object Unchanged : InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e() {
    public override val `value`: String = "unchanged"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e()

  public companion object {
    public fun fromValue(`value`: String): InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e = when (value) {
      Now.value -> Now
      Unchanged.value -> Unchanged
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsResumePostRequestFormBillingCycleAnchorXbcb7599e) {
      encoder.encodeString(value.value)
    }
  }
}
