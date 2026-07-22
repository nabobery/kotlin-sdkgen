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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/invoice_settings/properties/issuer/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/invoice_settings/properties/issuer/properties/type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `account`.
     */
    public data object Account : InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7() {
        public override val `value`: String = "account"
    }

    /**
     * Documented value. Wire value: `self`.
     */
    public data object Self : InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7() {
        public override val `value`: String = "self"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7()

    public companion object {
        public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7 =
            when (value) {
                Account.value -> Account
                Self.value -> Self
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataTypeX5d8856e7,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
