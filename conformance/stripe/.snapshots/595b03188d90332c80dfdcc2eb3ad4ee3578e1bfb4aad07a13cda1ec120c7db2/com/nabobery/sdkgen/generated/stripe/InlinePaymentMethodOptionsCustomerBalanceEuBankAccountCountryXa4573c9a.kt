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
 * The desired country code of the bank account information. Permitted values include: `DE`, `FR`, `IE`, or `NL`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_customer_balance_eu_bank_account/properties/c
 * ountry
 */
@Serializable(with = InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a.Serializer::class)
public sealed class InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `BE`.
     */
    public data object Be : InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a() {
        public override val `value`: String = "BE"
    }

    /**
     * Documented value. Wire value: `DE`.
     */
    public data object De : InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a() {
        public override val `value`: String = "DE"
    }

    /**
     * Documented value. Wire value: `ES`.
     */
    public data object Es : InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a() {
        public override val `value`: String = "ES"
    }

    /**
     * Documented value. Wire value: `FR`.
     */
    public data object Fr : InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a() {
        public override val `value`: String = "FR"
    }

    /**
     * Documented value. Wire value: `IE`.
     */
    public data object Ie : InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a() {
        public override val `value`: String = "IE"
    }

    /**
     * Documented value. Wire value: `NL`.
     */
    public data object Nl : InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a() {
        public override val `value`: String = "NL"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a()

    public companion object {
        public fun fromValue(`value`: String): InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a =
            when (value) {
                Be.value -> Be
                De.value -> De
                Es.value -> Es
                Fr.value -> Fr
                Ie.value -> Ie
                Nl.value -> Nl
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlinePaymentMethodOptionsCustomerBalanceEuBankAccountCountryXa4573c9a,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
