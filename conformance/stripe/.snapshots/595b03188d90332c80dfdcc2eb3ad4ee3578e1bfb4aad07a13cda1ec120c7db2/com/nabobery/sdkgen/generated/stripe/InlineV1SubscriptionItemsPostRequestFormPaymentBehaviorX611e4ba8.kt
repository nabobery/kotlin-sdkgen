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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/payment_behavior
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8.Serializer::class)
public sealed class InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `allow_incomplete`.
     */
    public data object AllowIncomplete : InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8() {
        public override val `value`: String = "allow_incomplete"
    }

    /**
     * Documented value. Wire value: `default_incomplete`.
     */
    public data object DefaultIncomplete : InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8() {
        public override val `value`: String = "default_incomplete"
    }

    /**
     * Documented value. Wire value: `error_if_incomplete`.
     */
    public data object ErrorIfIncomplete : InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8() {
        public override val `value`: String = "error_if_incomplete"
    }

    /**
     * Documented value. Wire value: `pending_if_incomplete`.
     */
    public data object PendingIfIncomplete : InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8() {
        public override val `value`: String = "pending_if_incomplete"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8 =
            when (value) {
                AllowIncomplete.value -> AllowIncomplete
                DefaultIncomplete.value -> DefaultIncomplete
                ErrorIfIncomplete.value -> ErrorIfIncomplete
                PendingIfIncomplete.value -> PendingIfIncomplete
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsPostRequestFormPaymentBehaviorX611e4ba8,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
