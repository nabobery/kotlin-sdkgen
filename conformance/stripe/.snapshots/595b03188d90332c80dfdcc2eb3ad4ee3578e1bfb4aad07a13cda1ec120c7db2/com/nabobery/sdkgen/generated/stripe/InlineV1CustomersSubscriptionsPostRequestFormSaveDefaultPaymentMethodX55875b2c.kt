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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/save_default_payment_m
 * ethod.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/save_default_payment_m
 * ethod
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `off`.
     */
    public data object Off : InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c() {
        public override val `value`: String = "off"
    }

    /**
     * Documented value. Wire value: `on_subscription`.
     */
    public data object OnSubscription : InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c() {
        public override val `value`: String = "on_subscription"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c =
            when (value) {
                Off.value -> Off
                OnSubscription.value -> OnSubscription
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormSaveDefaultPaymentMethodX55875b2c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
