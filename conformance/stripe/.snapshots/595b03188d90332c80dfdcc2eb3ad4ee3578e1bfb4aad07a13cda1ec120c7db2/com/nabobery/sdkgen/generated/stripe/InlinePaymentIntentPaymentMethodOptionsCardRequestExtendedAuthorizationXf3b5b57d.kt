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
 * Request ability to [capture beyond the standard authorization validity
 * window](https://docs.stripe.com/payments/extended-authorization) for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_card/properties/request_extend
 * ed_authorization
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `if_available`.
     */
    public data object IfAvailable : InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d() {
        public override val `value`: String = "if_available"
    }

    /**
     * Documented value. Wire value: `never`.
     */
    public data object Never : InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d() {
        public override val `value`: String = "never"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d =
            when (value) {
                IfAvailable.value -> IfAvailable
                Never.value -> Never
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsCardRequestExtendedAuthorizationXf3b5b57d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
