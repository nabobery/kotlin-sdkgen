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
 * Determines the value to use for the billing cycle anchor on subscription updates. Valid values are `now` or
 * `unchanged`, and the default value is `unchanged`. Setting the value to `now` resets the subscription's billing cycle
 * anchor to the current time (in UTC). For more information, see the billing cycle
 * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_subscription_update/properties/billing_cycle_anchor
 */
@Serializable(with = InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd.Serializer::class)
public sealed class InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `now`.
   */
  public data object Now : InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd() {
    public override val `value`: String = "now"
  }

  /**
   * Documented value. Wire value: `unchanged`.
   */
  public data object Unchanged : InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd() {
    public override val `value`: String = "unchanged"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd()

  public companion object {
    public fun fromValue(`value`: String): InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd = when (value) {
      Now.value -> Now
      Unchanged.value -> Unchanged
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePortalSubscriptionUpdateBillingCycleAnchorXb8f51ecd) {
      encoder.encodeString(value.value)
    }
  }
}
