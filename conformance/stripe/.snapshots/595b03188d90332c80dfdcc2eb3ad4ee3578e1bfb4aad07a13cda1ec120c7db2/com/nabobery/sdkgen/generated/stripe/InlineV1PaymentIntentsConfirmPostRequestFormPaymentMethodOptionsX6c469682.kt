package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 * Payment method-specific configuration for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682(
    public val acssDebit: InlineV1PaymentIntentsConfirmPostRequestFormAcssDebitX9823bf9e? = null,
    public val affirm: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAffirmX1777df44? = null,
    public val afterpayClearpay: InlineV1PaymentIntentsConfirmPostRequestFormAfterpayClearpayX9e51f724? = null,
    public val alipay: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAlipayXea79c781? = null,
    public val alma: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAlmaX97e2e3b4? = null,
    public val amazonPay: InlineV1PaymentIntentsConfirmPostRequestFormAmazonPayXa11d3712? = null,
    public val auBecsDebit: InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX76406295? = null,
    public val bacsDebit: InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051? = null,
    public val bancontact: InlineV1PaymentIntentsConfirmPostRequestFormBancontactXa66ea5f6? = null,
    public val billie: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBillieX32e88b67? = null,
    public val bizum: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBizumX7ef6ee7a? = null,
    public val blik: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBlikX45497dc9? = null,
    public val boleto: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8? = null,
    public val card: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsCardX9c017d40? = null,
    public val cardPresent: InlineV1PaymentIntentsConfirmPostRequestFormCardPresentX4f5ce63c? = null,
    public val cashapp: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsCashappXc4cc1479? = null,
    public val crypto: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsCryptoX053de1bb? = null,
    public val customerBalance: InlineV1PaymentIntentsConfirmPostRequestFormCustomerBalanceXf3fe3e41? = null,
    public val eps: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEpsX98ca2c09? = null,
    public val fpx: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsFpxX6b77e675? = null,
    public val giropay: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsGiropayX8644b0b1? = null,
    public val grabpay: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsGrabpayXbf263228? = null,
    public val ideal: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsIdealX4d7a17b4? = null,
    public val interacPresent: InlineV1PaymentIntentsConfirmPostRequestFormInteracPresentXb4bf95ff? = null,
    public val kakaoPay: InlineV1PaymentIntentsConfirmPostRequestFormKakaoPayX5ea857cd? = null,
    public val klarna: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f? = null,
    public val konbini: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKonbiniX23baf1c9? = null,
    public val krCard: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKrCardXaab95c40? = null,
    public val link: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6? = null,
    public val mbWay: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsMbWayX2a552c6d? = null,
    public val mobilepay: InlineV1PaymentIntentsConfirmPostRequestFormMobilepayXe07a92f6? = null,
    public val multibanco: InlineV1PaymentIntentsConfirmPostRequestFormMultibancoXc08241b1? = null,
    public val naverPay: InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3? = null,
    public val nzBankAccount: InlineV1PaymentIntentsConfirmPostRequestFormNzBankAccountX57d5409b? = null,
    public val oxxo: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsOxxoX72a98763? = null,
    public val p24: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsP24Xd83dbf27? = null,
    public val payByBank: InlineV1PaymentIntentsConfirmPostRequestFormPayByBankXb4013665? = null,
    public val payco: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaycoX82a90d05? = null,
    public val paynow: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaynowXfb8ab0c7? = null,
    public val paypal: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaypalXbfc81675? = null,
    public val payto: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaytoXc78619dc? = null,
    public val pix: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPixX7d1df79c? = null,
    public val promptpay: InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac? = null,
    public val revolutPay: InlineV1PaymentIntentsConfirmPostRequestFormRevolutPayXb8176f68? = null,
    public val samsungPay: InlineV1PaymentIntentsConfirmPostRequestFormSamsungPayX17eff9a5? = null,
    public val satispay: InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c? = null,
    public val scalapay: InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69? = null,
    public val sepaDebit: InlineV1PaymentIntentsConfirmPostRequestFormSepaDebitX5a25910d? = null,
    public val sofort: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc? = null,
    public val sunbit: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSunbitX24d0999b? = null,
    public val swish: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSwishX5be3b295? = null,
    public val twint: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTwintXf98db25b? = null,
    public val upi: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX4a0aa888? = null,
    public val usBankAccount: InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX8ef36ba1? = null,
    public val wechatPay: InlineV1PaymentIntentsConfirmPostRequestFormWechatPayX7f95f49e? = null,
    public val zip: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsZipX095eb06f? = null,
) {
    public class Builder {
        public var acssDebit: InlineV1PaymentIntentsConfirmPostRequestFormAcssDebitX9823bf9e? = null

        public var affirm:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAffirmX1777df44? = null

        public var afterpayClearpay:
            InlineV1PaymentIntentsConfirmPostRequestFormAfterpayClearpayX9e51f724? = null

        public var alipay:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAlipayXea79c781? = null

        public var alma: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAlmaX97e2e3b4? =
            null

        public var amazonPay: InlineV1PaymentIntentsConfirmPostRequestFormAmazonPayXa11d3712? = null

        public var auBecsDebit: InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX76406295? = null

        public var bacsDebit: InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051? = null

        public var bancontact: InlineV1PaymentIntentsConfirmPostRequestFormBancontactXa66ea5f6? = null

        public var billie:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBillieX32e88b67? = null

        public var bizum:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBizumX7ef6ee7a? = null

        public var blik: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBlikX45497dc9? =
            null

        public var boleto:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8? = null

        public var card: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsCardX9c017d40? =
            null

        public var cardPresent: InlineV1PaymentIntentsConfirmPostRequestFormCardPresentX4f5ce63c? = null

        public var cashapp:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsCashappXc4cc1479? = null

        public var crypto:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsCryptoX053de1bb? = null

        public var customerBalance:
            InlineV1PaymentIntentsConfirmPostRequestFormCustomerBalanceXf3fe3e41? = null

        public var eps: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEpsX98ca2c09? =
            null

        public var fpx: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsFpxX6b77e675? =
            null

        public var giropay:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsGiropayX8644b0b1? = null

        public var grabpay:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsGrabpayXbf263228? = null

        public var ideal:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsIdealX4d7a17b4? = null

        public var interacPresent: InlineV1PaymentIntentsConfirmPostRequestFormInteracPresentXb4bf95ff? =
            null

        public var kakaoPay: InlineV1PaymentIntentsConfirmPostRequestFormKakaoPayX5ea857cd? = null

        public var klarna:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f? = null

        public var konbini:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKonbiniX23baf1c9? = null

        public var krCard:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKrCardXaab95c40? = null

        public var link: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6? =
            null

        public var mbWay:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsMbWayX2a552c6d? = null

        public var mobilepay: InlineV1PaymentIntentsConfirmPostRequestFormMobilepayXe07a92f6? = null

        public var multibanco: InlineV1PaymentIntentsConfirmPostRequestFormMultibancoXc08241b1? = null

        public var naverPay: InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3? = null

        public var nzBankAccount: InlineV1PaymentIntentsConfirmPostRequestFormNzBankAccountX57d5409b? =
            null

        public var oxxo: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsOxxoX72a98763? =
            null

        public var p24: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsP24Xd83dbf27? =
            null

        public var payByBank: InlineV1PaymentIntentsConfirmPostRequestFormPayByBankXb4013665? = null

        public var payco:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaycoX82a90d05? = null

        public var paynow:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaynowXfb8ab0c7? = null

        public var paypal:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaypalXbfc81675? = null

        public var payto:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaytoXc78619dc? = null

        public var pix: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPixX7d1df79c? =
            null

        public var promptpay: InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac? = null

        public var revolutPay: InlineV1PaymentIntentsConfirmPostRequestFormRevolutPayXb8176f68? = null

        public var samsungPay: InlineV1PaymentIntentsConfirmPostRequestFormSamsungPayX17eff9a5? = null

        public var satispay: InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c? = null

        public var scalapay: InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69? = null

        public var sepaDebit: InlineV1PaymentIntentsConfirmPostRequestFormSepaDebitX5a25910d? = null

        public var sofort:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc? = null

        public var sunbit:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSunbitX24d0999b? = null

        public var swish:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSwishX5be3b295? = null

        public var twint:
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTwintXf98db25b? = null

        public var upi: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX4a0aa888? =
            null

        public var usBankAccount: InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX8ef36ba1? =
            null

        public var wechatPay: InlineV1PaymentIntentsConfirmPostRequestFormWechatPayX7f95f49e? = null

        public var zip: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsZipX095eb06f? =
            null

        public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682 =
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682(
                acssDebit = acssDebit,
                affirm = affirm,
                afterpayClearpay = afterpayClearpay,
                alipay = alipay,
                alma = alma,
                amazonPay = amazonPay,
                auBecsDebit = auBecsDebit,
                bacsDebit = bacsDebit,
                bancontact = bancontact,
                billie = billie,
                bizum = bizum,
                blik = blik,
                boleto = boleto,
                card = card,
                cardPresent = cardPresent,
                cashapp = cashapp,
                crypto = crypto,
                customerBalance = customerBalance,
                eps = eps,
                fpx = fpx,
                giropay = giropay,
                grabpay = grabpay,
                ideal = ideal,
                interacPresent = interacPresent,
                kakaoPay = kakaoPay,
                klarna = klarna,
                konbini = konbini,
                krCard = krCard,
                link = link,
                mbWay = mbWay,
                mobilepay = mobilepay,
                multibanco = multibanco,
                naverPay = naverPay,
                nzBankAccount = nzBankAccount,
                oxxo = oxxo,
                p24 = p24,
                payByBank = payByBank,
                payco = payco,
                paynow = paynow,
                paypal = paypal,
                payto = payto,
                pix = pix,
                promptpay = promptpay,
                revolutPay = revolutPay,
                samsungPay = samsungPay,
                satispay = satispay,
                scalapay = scalapay,
                sepaDebit = sepaDebit,
                sofort = sofort,
                sunbit = sunbit,
                swish = swish,
                twint = twint,
                upi = upi,
                usBankAccount = usBankAccount,
                wechatPay = wechatPay,
                zip = zip,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682 must be a JSON object",
                    )
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682(
                acssDebit =
                    rawObject["acss_debit"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAcssDebitX9823bf9e>(it)
                    },
                affirm =
                    rawObject["affirm"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAffirmX1777df44>(
                                it,
                            )
                    },
                afterpayClearpay =
                    rawObject["afterpay_clearpay"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAfterpayClearpayX9e51f724>(
                                it,
                            )
                    },
                alipay =
                    rawObject["alipay"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAlipayXea79c781>(
                                it,
                            )
                    },
                alma =
                    rawObject["alma"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAlmaX97e2e3b4>(
                                it,
                            )
                    },
                amazonPay =
                    rawObject["amazon_pay"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmazonPayXa11d3712>(it)
                    },
                auBecsDebit =
                    rawObject["au_becs_debit"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAuBecsDebitX76406295>(it)
                    },
                bacsDebit =
                    rawObject["bacs_debit"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormBacsDebitX7b59b051>(it)
                    },
                bancontact =
                    rawObject["bancontact"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormBancontactXa66ea5f6>(it)
                    },
                billie =
                    rawObject["billie"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBillieX32e88b67>(
                                it,
                            )
                    },
                bizum =
                    rawObject["bizum"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBizumX7ef6ee7a>(
                                it,
                            )
                    },
                blik =
                    rawObject["blik"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBlikX45497dc9>(
                                it,
                            )
                    },
                boleto =
                    rawObject["boleto"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsBoletoX20ada7d8>(
                                it,
                            )
                    },
                card =
                    rawObject["card"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsCardX9c017d40>(
                                it,
                            )
                    },
                cardPresent =
                    rawObject["card_present"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCardPresentX4f5ce63c>(it)
                    },
                cashapp =
                    rawObject["cashapp"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsCashappXc4cc1479>(
                                it,
                            )
                    },
                crypto =
                    rawObject["crypto"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsCryptoX053de1bb>(
                                it,
                            )
                    },
                customerBalance =
                    rawObject["customer_balance"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCustomerBalanceXf3fe3e41>(
                                    it,
                                )
                        },
                eps =
                    rawObject["eps"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEpsX98ca2c09>(
                                it,
                            )
                    },
                fpx =
                    rawObject["fpx"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsFpxX6b77e675>(
                                it,
                            )
                    },
                giropay =
                    rawObject["giropay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsGiropayX8644b0b1>(
                                    it,
                                )
                        },
                grabpay =
                    rawObject["grabpay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsGrabpayXbf263228>(
                                    it,
                                )
                        },
                ideal =
                    rawObject["ideal"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsIdealX4d7a17b4>(
                                    it,
                                )
                        },
                interacPresent =
                    rawObject["interac_present"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormInteracPresentXb4bf95ff>(
                                    it,
                                )
                        },
                kakaoPay =
                    rawObject["kakao_pay"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormKakaoPayX5ea857cd>(
                                it,
                            )
                        },
                klarna =
                    rawObject["klarna"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXf39fea3f>(
                                    it,
                                )
                        },
                konbini =
                    rawObject["konbini"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKonbiniX23baf1c9>(
                                    it,
                                )
                        },
                krCard =
                    rawObject["kr_card"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsKrCardXaab95c40>(
                                    it,
                                )
                        },
                link =
                    rawObject["link"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsLinkX1a2873a6>(
                                    it,
                                )
                        },
                mbWay =
                    rawObject["mb_way"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsMbWayX2a552c6d>(
                                    it,
                                )
                        },
                mobilepay =
                    rawObject["mobilepay"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMobilepayXe07a92f6>(
                                it,
                            )
                        },
                multibanco =
                    rawObject["multibanco"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMultibancoXc08241b1>(
                                it,
                            )
                        },
                naverPay =
                    rawObject["naver_pay"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormNaverPayX354d8db3>(
                                it,
                            )
                        },
                nzBankAccount =
                    rawObject["nz_bank_account"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormNzBankAccountX57d5409b>(
                                    it,
                                )
                        },
                oxxo =
                    rawObject["oxxo"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsOxxoX72a98763>(
                                    it,
                                )
                        },
                p24 =
                    rawObject["p24"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsP24Xd83dbf27>(
                                    it,
                                )
                        },
                payByBank =
                    rawObject["pay_by_bank"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPayByBankXb4013665>(
                                it,
                            )
                        },
                payco =
                    rawObject["payco"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaycoX82a90d05>(
                                    it,
                                )
                        },
                paynow =
                    rawObject["paynow"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaynowXfb8ab0c7>(
                                    it,
                                )
                        },
                paypal =
                    rawObject["paypal"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaypalXbfc81675>(
                                    it,
                                )
                        },
                payto =
                    rawObject["payto"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPaytoXc78619dc>(
                                    it,
                                )
                        },
                pix =
                    rawObject["pix"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsPixX7d1df79c>(
                                    it,
                                )
                        },
                promptpay =
                    rawObject["promptpay"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPromptpayX99093fac>(
                                it,
                            )
                        },
                revolutPay =
                    rawObject["revolut_pay"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormRevolutPayXb8176f68>(
                                it,
                            )
                        },
                samsungPay =
                    rawObject["samsung_pay"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSamsungPayX17eff9a5>(
                                it,
                            )
                        },
                satispay =
                    rawObject["satispay"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSatispayX67af2a9c>(
                                it,
                            )
                        },
                scalapay =
                    rawObject["scalapay"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormScalapayX84751e69>(
                                it,
                            )
                        },
                sepaDebit =
                    rawObject["sepa_debit"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSepaDebitX5a25910d>(
                                it,
                            )
                        },
                sofort =
                    rawObject["sofort"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSofortXfe3a4bdc>(
                                    it,
                                )
                        },
                sunbit =
                    rawObject["sunbit"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSunbitX24d0999b>(
                                    it,
                                )
                        },
                swish =
                    rawObject["swish"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsSwishX5be3b295>(
                                    it,
                                )
                        },
                twint =
                    rawObject["twint"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsTwintXf98db25b>(
                                    it,
                                )
                        },
                upi =
                    rawObject["upi"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX4a0aa888>(
                                    it,
                                )
                        },
                usBankAccount =
                    rawObject["us_bank_account"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormUsBankAccountX8ef36ba1>(
                                    it,
                                )
                        },
                wechatPay =
                    rawObject["wechat_pay"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormWechatPayX7f95f49e>(
                                it,
                            )
                        },
                zip =
                    rawObject["zip"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsZipX095eb06f>(
                                    it,
                                )
                        },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
                    value.affirm?.let { put("affirm", json.encodeToJsonElement(it)) }
                    value.afterpayClearpay?.let { put("afterpay_clearpay", json.encodeToJsonElement(it)) }
                    value.alipay?.let { put("alipay", json.encodeToJsonElement(it)) }
                    value.alma?.let { put("alma", json.encodeToJsonElement(it)) }
                    value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
                    value.auBecsDebit?.let { put("au_becs_debit", json.encodeToJsonElement(it)) }
                    value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
                    value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
                    value.billie?.let { put("billie", json.encodeToJsonElement(it)) }
                    value.bizum?.let { put("bizum", json.encodeToJsonElement(it)) }
                    value.blik?.let { put("blik", json.encodeToJsonElement(it)) }
                    value.boleto?.let { put("boleto", json.encodeToJsonElement(it)) }
                    value.card?.let { put("card", json.encodeToJsonElement(it)) }
                    value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
                    value.cashapp?.let { put("cashapp", json.encodeToJsonElement(it)) }
                    value.crypto?.let { put("crypto", json.encodeToJsonElement(it)) }
                    value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
                    value.eps?.let { put("eps", json.encodeToJsonElement(it)) }
                    value.fpx?.let { put("fpx", json.encodeToJsonElement(it)) }
                    value.giropay?.let { put("giropay", json.encodeToJsonElement(it)) }
                    value.grabpay?.let { put("grabpay", json.encodeToJsonElement(it)) }
                    value.ideal?.let { put("ideal", json.encodeToJsonElement(it)) }
                    value.interacPresent?.let { put("interac_present", json.encodeToJsonElement(it)) }
                    value.kakaoPay?.let { put("kakao_pay", json.encodeToJsonElement(it)) }
                    value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
                    value.konbini?.let { put("konbini", json.encodeToJsonElement(it)) }
                    value.krCard?.let { put("kr_card", json.encodeToJsonElement(it)) }
                    value.link?.let { put("link", json.encodeToJsonElement(it)) }
                    value.mbWay?.let { put("mb_way", json.encodeToJsonElement(it)) }
                    value.mobilepay?.let { put("mobilepay", json.encodeToJsonElement(it)) }
                    value.multibanco?.let { put("multibanco", json.encodeToJsonElement(it)) }
                    value.naverPay?.let { put("naver_pay", json.encodeToJsonElement(it)) }
                    value.nzBankAccount?.let { put("nz_bank_account", json.encodeToJsonElement(it)) }
                    value.oxxo?.let { put("oxxo", json.encodeToJsonElement(it)) }
                    value.p24?.let { put("p24", json.encodeToJsonElement(it)) }
                    value.payByBank?.let { put("pay_by_bank", json.encodeToJsonElement(it)) }
                    value.payco?.let { put("payco", json.encodeToJsonElement(it)) }
                    value.paynow?.let { put("paynow", json.encodeToJsonElement(it)) }
                    value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
                    value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
                    value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
                    value.promptpay?.let { put("promptpay", json.encodeToJsonElement(it)) }
                    value.revolutPay?.let { put("revolut_pay", json.encodeToJsonElement(it)) }
                    value.samsungPay?.let { put("samsung_pay", json.encodeToJsonElement(it)) }
                    value.satispay?.let { put("satispay", json.encodeToJsonElement(it)) }
                    value.scalapay?.let { put("scalapay", json.encodeToJsonElement(it)) }
                    value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
                    value.sofort?.let { put("sofort", json.encodeToJsonElement(it)) }
                    value.sunbit?.let { put("sunbit", json.encodeToJsonElement(it)) }
                    value.swish?.let { put("swish", json.encodeToJsonElement(it)) }
                    value.twint?.let { put("twint", json.encodeToJsonElement(it)) }
                    value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
                    value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
                    value.wechatPay?.let { put("wechat_pay", json.encodeToJsonElement(it)) }
                    value.zip?.let { put("zip", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682(
    block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682.Builder.() -> Unit,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682 =
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsX6c469682.build(block)
