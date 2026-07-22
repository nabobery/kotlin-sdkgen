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
 * ded/schema/properties/subscription_data/properties/billing_mode/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/subscription_data/properties/billing_mode/properties/type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `classic`.
     */
    public data object Classic : InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2() {
        public override val `value`: String = "classic"
    }

    /**
     * Documented value. Wire value: `flexible`.
     */
    public data object Flexible : InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2() {
        public override val `value`: String = "flexible"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2 =
            when (value) {
                Classic.value -> Classic
                Flexible.value -> Flexible
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionDataBillingModeTypeX2a893bb2,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
