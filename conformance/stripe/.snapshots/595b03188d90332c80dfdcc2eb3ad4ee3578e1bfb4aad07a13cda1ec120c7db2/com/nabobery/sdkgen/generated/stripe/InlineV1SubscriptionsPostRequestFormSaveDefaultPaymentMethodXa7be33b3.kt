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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/save_default_payment_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/payment_settings/properties/save_default_payment_method
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `off`.
     */
    public data object Off : InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3() {
        public override val `value`: String = "off"
    }

    /**
     * Documented value. Wire value: `on_subscription`.
     */
    public data object OnSubscription : InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3() {
        public override val `value`: String = "on_subscription"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3 =
            when (value) {
                Off.value -> Off
                OnSubscription.value -> OnSubscription
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodXa7be33b3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
