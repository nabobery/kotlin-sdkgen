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
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/card/anyOf/0/properties/request_three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options
 * /properties/card/anyOf/0/properties/request_three_d_secure
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db.Serializer::class)
public sealed class InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `any`.
     */
    public data object Any : InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db() {
        public override val `value`: String = "any"
    }

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `challenge`.
     */
    public data object Challenge : InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db() {
        public override val `value`: String = "challenge"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db =
            when (value) {
                Any.value -> Any
                Automatic.value -> Automatic
                Challenge.value -> Challenge
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormRequestThreeDSecureX815619db,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
