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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/billing_mode/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/billing_mode/properties/type
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c.Serializer::class)
public sealed class InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `classic`.
     */
    public data object Classic : InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c() {
        public override val `value`: String = "classic"
    }

    /**
     * Documented value. Wire value: `flexible`.
     */
    public data object Flexible : InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c() {
        public override val `value`: String = "flexible"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c()

    public companion object {
        public fun fromValue(`value`: String): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c =
            when (value) {
                Classic.value -> Classic
                Flexible.value -> Flexible
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
