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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/object
 */
@Serializable(with = InlinePaymentIntentObjectValueX7c59329b.Serializer::class)
public sealed class InlinePaymentIntentObjectValueX7c59329b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `payment_intent`.
     */
    public data object PaymentIntent : InlinePaymentIntentObjectValueX7c59329b() {
        public override val `value`: String = "payment_intent"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentIntentObjectValueX7c59329b()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentIntentObjectValueX7c59329b =
            when (value) {
                PaymentIntent.value -> PaymentIntent
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentIntentObjectValueX7c59329b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentObjectValueX7c59329b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentIntentObjectValueX7c59329b =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentObjectValueX7c59329b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
