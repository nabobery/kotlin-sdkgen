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
 * Controls how Stripe handles payment when a subscription update requires payment and
 * `collection_method=charge_automatically`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/delete/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/payment_behavior
 */
@Serializable(with = InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d.Serializer::class)
public sealed class InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `allow_incomplete`.
     */
    public data object AllowIncomplete : InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d() {
        public override val `value`: String = "allow_incomplete"
    }

    /**
     * Documented value. Wire value: `default_incomplete`.
     */
    public data object DefaultIncomplete : InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d() {
        public override val `value`: String = "default_incomplete"
    }

    /**
     * Documented value. Wire value: `error_if_incomplete`.
     */
    public data object ErrorIfIncomplete : InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d() {
        public override val `value`: String = "error_if_incomplete"
    }

    /**
     * Documented value. Wire value: `pending_if_incomplete`.
     */
    public data object PendingIfIncomplete : InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d() {
        public override val `value`: String = "pending_if_incomplete"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d =
            when (value) {
                AllowIncomplete.value -> AllowIncomplete
                DefaultIncomplete.value -> DefaultIncomplete
                ErrorIfIncomplete.value -> ErrorIfIncomplete
                PendingIfIncomplete.value -> PendingIfIncomplete
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsDeleteRequestFormPaymentBehaviorX2591788d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
