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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_types/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_types/anyOf/0/items
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591.Serializer::class)
public sealed class InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `affirm`.
     */
    public data object Affirm : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "affirm"
    }

    /**
     * Documented value. Wire value: `afterpay_clearpay`.
     */
    public data object AfterpayClearpay : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "afterpay_clearpay"
    }

    /**
     * Documented value. Wire value: `alipay`.
     */
    public data object Alipay : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "alipay"
    }

    /**
     * Documented value. Wire value: `alma`.
     */
    public data object Alma : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "alma"
    }

    /**
     * Documented value. Wire value: `au_becs_debit`.
     */
    public data object AuBecsDebit : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "au_becs_debit"
    }

    /**
     * Documented value. Wire value: `bacs_debit`.
     */
    public data object BacsDebit : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "bacs_debit"
    }

    /**
     * Documented value. Wire value: `bancontact`.
     */
    public data object Bancontact : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "bancontact"
    }

    /**
     * Documented value. Wire value: `billie`.
     */
    public data object Billie : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "billie"
    }

    /**
     * Documented value. Wire value: `bizum`.
     */
    public data object Bizum : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "bizum"
    }

    /**
     * Documented value. Wire value: `blik`.
     */
    public data object Blik : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "blik"
    }

    /**
     * Documented value. Wire value: `boleto`.
     */
    public data object Boleto : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "boleto"
    }

    /**
     * Documented value. Wire value: `card`.
     */
    public data object Card : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "card"
    }

    /**
     * Documented value. Wire value: `cashapp`.
     */
    public data object Cashapp : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "cashapp"
    }

    /**
     * Documented value. Wire value: `eps`.
     */
    public data object Eps : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "eps"
    }

    /**
     * Documented value. Wire value: `fpx`.
     */
    public data object Fpx : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "fpx"
    }

    /**
     * Documented value. Wire value: `giropay`.
     */
    public data object Giropay : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "giropay"
    }

    /**
     * Documented value. Wire value: `grabpay`.
     */
    public data object Grabpay : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "grabpay"
    }

    /**
     * Documented value. Wire value: `ideal`.
     */
    public data object Ideal : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "ideal"
    }

    /**
     * Documented value. Wire value: `klarna`.
     */
    public data object Klarna : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "klarna"
    }

    /**
     * Documented value. Wire value: `konbini`.
     */
    public data object Konbini : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "konbini"
    }

    /**
     * Documented value. Wire value: `link`.
     */
    public data object Link : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "link"
    }

    /**
     * Documented value. Wire value: `mb_way`.
     */
    public data object MbWay : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "mb_way"
    }

    /**
     * Documented value. Wire value: `mobilepay`.
     */
    public data object Mobilepay : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "mobilepay"
    }

    /**
     * Documented value. Wire value: `multibanco`.
     */
    public data object Multibanco : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "multibanco"
    }

    /**
     * Documented value. Wire value: `oxxo`.
     */
    public data object Oxxo : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "oxxo"
    }

    /**
     * Documented value. Wire value: `p24`.
     */
    public data object P24 : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "p24"
    }

    /**
     * Documented value. Wire value: `pay_by_bank`.
     */
    public data object PayByBank : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "pay_by_bank"
    }

    /**
     * Documented value. Wire value: `paynow`.
     */
    public data object Paynow : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "paynow"
    }

    /**
     * Documented value. Wire value: `paypal`.
     */
    public data object Paypal : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "paypal"
    }

    /**
     * Documented value. Wire value: `payto`.
     */
    public data object Payto : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "payto"
    }

    /**
     * Documented value. Wire value: `pix`.
     */
    public data object Pix : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "pix"
    }

    /**
     * Documented value. Wire value: `promptpay`.
     */
    public data object Promptpay : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "promptpay"
    }

    /**
     * Documented value. Wire value: `satispay`.
     */
    public data object Satispay : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "satispay"
    }

    /**
     * Documented value. Wire value: `sepa_debit`.
     */
    public data object SepaDebit : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "sepa_debit"
    }

    /**
     * Documented value. Wire value: `sofort`.
     */
    public data object Sofort : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "sofort"
    }

    /**
     * Documented value. Wire value: `sunbit`.
     */
    public data object Sunbit : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "sunbit"
    }

    /**
     * Documented value. Wire value: `swish`.
     */
    public data object Swish : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "swish"
    }

    /**
     * Documented value. Wire value: `twint`.
     */
    public data object Twint : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "twint"
    }

    /**
     * Documented value. Wire value: `upi`.
     */
    public data object Upi : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "upi"
    }

    /**
     * Documented value. Wire value: `us_bank_account`.
     */
    public data object UsBankAccount : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "us_bank_account"
    }

    /**
     * Documented value. Wire value: `wechat_pay`.
     */
    public data object WechatPay : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "wechat_pay"
    }

    /**
     * Documented value. Wire value: `zip`.
     */
    public data object Zip : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591() {
        public override val `value`: String = "zip"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591 =
            when (value) {
                Affirm.value -> Affirm
                AfterpayClearpay.value -> AfterpayClearpay
                Alipay.value -> Alipay
                Alma.value -> Alma
                AuBecsDebit.value -> AuBecsDebit
                BacsDebit.value -> BacsDebit
                Bancontact.value -> Bancontact
                Billie.value -> Billie
                Bizum.value -> Bizum
                Blik.value -> Blik
                Boleto.value -> Boleto
                Card.value -> Card
                Cashapp.value -> Cashapp
                Eps.value -> Eps
                Fpx.value -> Fpx
                Giropay.value -> Giropay
                Grabpay.value -> Grabpay
                Ideal.value -> Ideal
                Klarna.value -> Klarna
                Konbini.value -> Konbini
                Link.value -> Link
                MbWay.value -> MbWay
                Mobilepay.value -> Mobilepay
                Multibanco.value -> Multibanco
                Oxxo.value -> Oxxo
                P24.value -> P24
                PayByBank.value -> PayByBank
                Paynow.value -> Paynow
                Paypal.value -> Paypal
                Payto.value -> Payto
                Pix.value -> Pix
                Promptpay.value -> Promptpay
                Satispay.value -> Satispay
                SepaDebit.value -> SepaDebit
                Sofort.value -> Sofort
                Sunbit.value -> Sunbit
                Swish.value -> Swish
                Twint.value -> Twint
                Upi.value -> Upi
                UsBankAccount.value -> UsBankAccount
                WechatPay.value -> WechatPay
                Zip.value -> Zip
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591 = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodTypesAnyOf1ItemX5c826591,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
