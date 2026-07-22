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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/off_session/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/off_session/anyOf/1
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `one_off`.
     */
    public data object OneOff : InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c() {
        public override val `value`: String = "one_off"
    }

    /**
     * Documented value. Wire value: `recurring`.
     */
    public data object Recurring : InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c() {
        public override val `value`: String = "recurring"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c =
            when (value) {
                OneOff.value -> OneOff
                Recurring.value -> Recurring
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
