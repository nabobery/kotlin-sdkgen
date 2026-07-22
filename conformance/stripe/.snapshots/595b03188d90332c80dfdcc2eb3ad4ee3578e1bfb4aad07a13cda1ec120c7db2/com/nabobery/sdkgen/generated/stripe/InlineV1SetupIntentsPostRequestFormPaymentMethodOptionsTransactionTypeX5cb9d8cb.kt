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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/transaction_type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/transaction_type
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb.Serializer::class)
public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `business`.
     */
    public data object Business : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb() {
        public override val `value`: String = "business"
    }

    /**
     * Documented value. Wire value: `personal`.
     */
    public data object Personal : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb() {
        public override val `value`: String = "personal"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb =
            when (value) {
                Business.value -> Business
                Personal.value -> Personal
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsTransactionTypeX5cb9d8cb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
