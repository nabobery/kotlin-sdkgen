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
 * Determines how to handle [prorations](https://docs.stripe.com/billing/subscriptions/prorations) when the billing
 * cycle changes (e.g., when switching plans, resetting `billing_cycle_anchor=now`, or starting a trial), or if an
 * item's `quantity` changes. The default value is `create_prorations`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/delete/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/proration_behavior
 */
@Serializable(with = InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c.Serializer::class)
public sealed class InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `always_invoice`.
     */
    public data object AlwaysInvoice : InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c() {
        public override val `value`: String = "always_invoice"
    }

    /**
     * Documented value. Wire value: `create_prorations`.
     */
    public data object CreateProrations : InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c() {
        public override val `value`: String = "create_prorations"
    }

    /**
     * Documented value. Wire value: `none`.
     */
    public data object None : InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c() {
        public override val `value`: String = "none"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c =
            when (value) {
                AlwaysInvoice.value -> AlwaysInvoice
                CreateProrations.value -> CreateProrations
                None.value -> None
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsDeleteRequestFormProrationBehaviorX881f5c3c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
