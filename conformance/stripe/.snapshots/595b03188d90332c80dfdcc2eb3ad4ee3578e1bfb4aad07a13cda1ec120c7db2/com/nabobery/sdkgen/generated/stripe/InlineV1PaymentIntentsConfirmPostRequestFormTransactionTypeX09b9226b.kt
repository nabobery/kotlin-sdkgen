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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options
 * /properties/transaction_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/acss_debit/anyOf/0/properties/mandate_options
 * /properties/transaction_type
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `business`.
     */
    public data object Business : InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b() {
        public override val `value`: String = "business"
    }

    /**
     * Documented value. Wire value: `personal`.
     */
    public data object Personal : InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b() {
        public override val `value`: String = "personal"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b =
            when (value) {
                Business.value -> Business
                Personal.value -> Personal
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormTransactionTypeX09b9226b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
