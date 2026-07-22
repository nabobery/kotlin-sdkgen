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
 * The purpose of the transaction.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_us_bank_account/properties/tra
 * nsaction_purpose
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `goods`.
     */
    public data object Goods : InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb() {
        public override val `value`: String = "goods"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `services`.
     */
    public data object Services : InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb() {
        public override val `value`: String = "services"
    }

    /**
     * Documented value. Wire value: `unspecified`.
     */
    public data object Unspecified : InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb() {
        public override val `value`: String = "unspecified"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb =
            when (value) {
                Goods.value -> Goods
                Other.value -> Other
                Services.value -> Services
                Unspecified.value -> Unspecified
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentIntentPaymentMethodOptionsUsBankAccountTransactionPurposeX0ccb14eb,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
