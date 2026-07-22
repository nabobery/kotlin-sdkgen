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
 * /schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/verification_method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/verification_method
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `automatic`.
     */
    public data object Automatic : InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05() {
        public override val `value`: String = "automatic"
    }

    /**
     * Documented value. Wire value: `instant`.
     */
    public data object Instant : InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05() {
        public override val `value`: String = "instant"
    }

    /**
     * Documented value. Wire value: `microdeposits`.
     */
    public data object Microdeposits : InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05() {
        public override val `value`: String = "microdeposits"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05 =
            when (value) {
                Automatic.value -> Automatic
                Instant.value -> Instant
                Microdeposits.value -> Microdeposits
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormVerificationMethodX807b8a05,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
