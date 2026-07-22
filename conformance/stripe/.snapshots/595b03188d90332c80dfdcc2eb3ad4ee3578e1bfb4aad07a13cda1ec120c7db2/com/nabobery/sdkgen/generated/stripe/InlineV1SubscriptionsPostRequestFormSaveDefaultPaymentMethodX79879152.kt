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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/save_default_payment_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_settings/properties/save_default_payment_method
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152.Serializer::class)
public sealed class InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `off`.
     */
    public data object Off : InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152() {
        public override val `value`: String = "off"
    }

    /**
     * Documented value. Wire value: `on_subscription`.
     */
    public data object OnSubscription : InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152() {
        public override val `value`: String = "on_subscription"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152()

    public companion object {
        public fun fromValue(`value`: String): InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152 =
            when (value) {
                Off.value -> Off
                OnSubscription.value -> OnSubscription
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormSaveDefaultPaymentMethodX79879152,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
