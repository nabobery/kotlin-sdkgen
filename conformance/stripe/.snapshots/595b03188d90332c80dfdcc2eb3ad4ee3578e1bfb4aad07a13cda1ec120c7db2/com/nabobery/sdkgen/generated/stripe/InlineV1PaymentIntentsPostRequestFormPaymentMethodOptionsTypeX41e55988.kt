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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer/prop
 * erties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer/prop
 * erties/type
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `eu_bank_transfer`.
     */
    public data object EuBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988() {
        public override val `value`: String = "eu_bank_transfer"
    }

    /**
     * Documented value. Wire value: `gb_bank_transfer`.
     */
    public data object GbBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988() {
        public override val `value`: String = "gb_bank_transfer"
    }

    /**
     * Documented value. Wire value: `jp_bank_transfer`.
     */
    public data object JpBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988() {
        public override val `value`: String = "jp_bank_transfer"
    }

    /**
     * Documented value. Wire value: `mx_bank_transfer`.
     */
    public data object MxBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988() {
        public override val `value`: String = "mx_bank_transfer"
    }

    /**
     * Documented value. Wire value: `us_bank_transfer`.
     */
    public data object UsBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988() {
        public override val `value`: String = "us_bank_transfer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988 =
            when (value) {
                EuBankTransfer.value -> EuBankTransfer
                GbBankTransfer.value -> GbBankTransfer
                JpBankTransfer.value -> JpBankTransfer
                MxBankTransfer.value -> MxBankTransfer
                UsBankTransfer.value -> UsBankTransfer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeX41e55988,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
