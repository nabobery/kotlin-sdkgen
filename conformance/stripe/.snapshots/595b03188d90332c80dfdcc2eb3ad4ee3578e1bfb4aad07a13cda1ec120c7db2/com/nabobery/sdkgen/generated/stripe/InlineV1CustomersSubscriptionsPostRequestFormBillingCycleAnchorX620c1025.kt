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
 * time. For more information, see the billing cycle
 * [documentation](https://docs.stripe.com/billing/subscriptions/billing-cycle).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/billing_cycle_anchor
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `now`.
     */
    public data object Now : InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025() {
        public override val `value`: String = "now"
    }

    /**
     * Documented value. Wire value: `unchanged`.
     */
    public data object Unchanged : InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025() {
        public override val `value`: String = "unchanged"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025 =
            when (value) {
                Now.value -> Now
                Unchanged.value -> Unchanged
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormBillingCycleAnchorX620c1025,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
