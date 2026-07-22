package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Either `now` or `unchanged`. Setting the value to `now` resets the subscription's billing cycle anchor to the current
 * time (in UTC). For more information, see the billing cycle
 * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_cycle_anchor
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `now`.
     */
    public data object Now : InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be() {
        public override val `value`: String = "now"
    }

    /**
     * Documented value. Wire value: `unchanged`.
     */
    public data object Unchanged : InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be() {
        public override val `value`: String = "unchanged"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be =
            when (value) {
                Now.value -> Now
                Unchanged.value -> Unchanged
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormBillingCycleAnchorXf25ed5be,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
