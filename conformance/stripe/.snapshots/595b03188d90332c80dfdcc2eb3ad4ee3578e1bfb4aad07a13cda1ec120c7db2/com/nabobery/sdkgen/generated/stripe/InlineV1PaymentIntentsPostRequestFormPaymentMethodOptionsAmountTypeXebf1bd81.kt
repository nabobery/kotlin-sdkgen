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
 * /schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/amount_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/properties/amount_type
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: ``.
     */
    public data object Value : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81() {
        public override val `value`: String = ""
    }

    /**
     * Documented value. Wire value: `fixed`.
     */
    public data object Fixed : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81() {
        public override val `value`: String = "fixed"
    }

    /**
     * Documented value. Wire value: `maximum`.
     */
    public data object Maximum : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81() {
        public override val `value`: String = "maximum"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81 =
            when (value) {
                Value.value -> Value
                Fixed.value -> Fixed
                Maximum.value -> Maximum
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmountTypeXebf1bd81,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
