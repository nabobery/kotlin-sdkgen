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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/losses/properties/payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/controller/properties/losses/properties/payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3.Serializer::class)
public sealed class InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `application`.
     */
    public data object Application : InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3() {
        public override val `value`: String = "application"
    }

    /**
     * Documented value. Wire value: `stripe`.
     */
    public data object Stripe : InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3() {
        public override val `value`: String = "stripe"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3()

    public companion object {
        public fun fromValue(`value`: String): InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3 =
            when (value) {
                Application.value -> Application
                Stripe.value -> Stripe
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormControllerLossesPaymentsX81ed4ed3,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
