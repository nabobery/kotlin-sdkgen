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
 * Describes whether we can confirm this PaymentIntent automatically, or if it requires customer action to confirm the
 * payment.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/confirmation_method
 */
@Serializable(with = InlinePaymentIntentConfirmationMethodX048d5232.Serializer::class)
public sealed class InlinePaymentIntentConfirmationMethodX048d5232 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlinePaymentIntentConfirmationMethodX048d5232() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `manual`.
     */
    public data object Manual : InlinePaymentIntentConfirmationMethodX048d5232() {
        public override val `value`: String = "manual"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentIntentConfirmationMethodX048d5232()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentIntentConfirmationMethodX048d5232 =
            when (value) {
                Automatic.value -> Automatic
                Manual.value -> Manual
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentIntentConfirmationMethodX048d5232> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentConfirmationMethodX048d5232",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentIntentConfirmationMethodX048d5232 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentConfirmationMethodX048d5232,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
