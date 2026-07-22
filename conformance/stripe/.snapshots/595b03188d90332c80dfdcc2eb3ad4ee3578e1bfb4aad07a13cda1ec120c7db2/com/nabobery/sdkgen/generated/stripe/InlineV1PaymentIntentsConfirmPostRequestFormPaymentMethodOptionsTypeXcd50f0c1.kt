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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_tran
 * sfer/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_tran
 * sfer/properties/type
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `eu_bank_transfer`.
     */
    public data object EuBankTransfer : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1() {
        public override val `value`: String = "eu_bank_transfer"
    }

    /**
     * Documented value. Wire value: `gb_bank_transfer`.
     */
    public data object GbBankTransfer : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1() {
        public override val `value`: String = "gb_bank_transfer"
    }

    /**
     * Documented value. Wire value: `jp_bank_transfer`.
     */
    public data object JpBankTransfer : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1() {
        public override val `value`: String = "jp_bank_transfer"
    }

    /**
     * Documented value. Wire value: `mx_bank_transfer`.
     */
    public data object MxBankTransfer : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1() {
        public override val `value`: String = "mx_bank_transfer"
    }

    /**
     * Documented value. Wire value: `us_bank_transfer`.
     */
    public data object UsBankTransfer : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1() {
        public override val `value`: String = "us_bank_transfer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1 =
            when (value) {
                EuBankTransfer.value -> EuBankTransfer
                GbBankTransfer.value -> GbBankTransfer
                JpBankTransfer.value -> JpBankTransfer
                MxBankTransfer.value -> MxBankTransfer
                UsBankTransfer.value -> UsBankTransfer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTypeXcd50f0c1,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
