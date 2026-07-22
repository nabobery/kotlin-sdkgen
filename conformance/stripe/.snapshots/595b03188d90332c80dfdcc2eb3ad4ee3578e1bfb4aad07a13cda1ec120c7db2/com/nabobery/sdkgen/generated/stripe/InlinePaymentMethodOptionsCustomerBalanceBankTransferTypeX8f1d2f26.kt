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
 * The bank transfer type that this PaymentIntent is allowed to use for funding Permitted values include:
 * `eu_bank_transfer`, `gb_bank_transfer`, `jp_bank_transfer`, `mx_bank_transfer`, or `us_bank_transfer`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_customer_balance_bank_transfer/properties/typ
 * e
 */
@Serializable(with = InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26.Serializer::class)
public sealed class InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `eu_bank_transfer`.
     */
    public data object EuBankTransfer : InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26() {
        public override val `value`: String = "eu_bank_transfer"
    }

    /**
     * Documented value. Wire value: `gb_bank_transfer`.
     */
    public data object GbBankTransfer : InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26() {
        public override val `value`: String = "gb_bank_transfer"
    }

    /**
     * Documented value. Wire value: `jp_bank_transfer`.
     */
    public data object JpBankTransfer : InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26() {
        public override val `value`: String = "jp_bank_transfer"
    }

    /**
     * Documented value. Wire value: `mx_bank_transfer`.
     */
    public data object MxBankTransfer : InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26() {
        public override val `value`: String = "mx_bank_transfer"
    }

    /**
     * Documented value. Wire value: `us_bank_transfer`.
     */
    public data object UsBankTransfer : InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26() {
        public override val `value`: String = "us_bank_transfer"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26 =
            when (value) {
                EuBankTransfer.value -> EuBankTransfer
                GbBankTransfer.value -> GbBankTransfer
                JpBankTransfer.value -> JpBankTransfer
                MxBankTransfer.value -> MxBankTransfer
                UsBankTransfer.value -> UsBankTransfer
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsCustomerBalanceBankTransferTypeX8f1d2f26,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
