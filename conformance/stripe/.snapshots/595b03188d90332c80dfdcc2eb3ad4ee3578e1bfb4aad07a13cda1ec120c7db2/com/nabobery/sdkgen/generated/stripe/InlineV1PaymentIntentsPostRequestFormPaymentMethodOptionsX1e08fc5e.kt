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
 * Payment-method-specific configuration for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e(
    public val acssDebit: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b? = null,
    public val affirm: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f? = null,
    public val afterpayClearpay: InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6? = null,
    public val alipay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857? = null,
    public val alma: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c? = null,
    public val amazonPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b? = null,
    public val auBecsDebit: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33? = null,
    public val bacsDebit: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd? = null,
    public val bancontact: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab? = null,
    public val billie: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93? = null,
    public val bizum: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279? = null,
    public val blik: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475? = null,
    public val boleto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb? = null,
    public val card: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f? = null,
    public val cardPresent: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce? = null,
    public val cashapp: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394? = null,
    public val crypto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoXaf261f95? = null,
    public val customerBalance: InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256? = null,
    public val eps: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002? = null,
    public val fpx: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062? = null,
    public val giropay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7? = null,
    public val grabpay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365? = null,
    public val ideal: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a? = null,
    public val interacPresent: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32? = null,
    public val kakaoPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b? = null,
    public val klarna: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c? = null,
    public val konbini: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXe8ab309b? = null,
    public val krCard: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa? = null,
    public val link: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a? = null,
    public val mbWay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2? = null,
    public val mobilepay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b? = null,
    public val multibanco: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b? = null,
    public val naverPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735? = null,
    public val nzBankAccount: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941? = null,
    public val oxxo: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318? = null,
    public val p24: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb? = null,
    public val payByBank: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749? = null,
    public val payco: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a? = null,
    public val paynow: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21? = null,
    public val paypal: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d? = null,
    public val payto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30? = null,
    public val pix: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506? = null,
    public val promptpay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd? = null,
    public val revolutPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb? = null,
    public val samsungPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c? = null,
    public val satispay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17? = null,
    public val scalapay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b? = null,
    public val sepaDebit: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688? = null,
    public val sofort: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5? = null,
    public val sunbit: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f? = null,
    public val swish: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98? = null,
    public val twint: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2? = null,
    public val upi: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977? = null,
    public val usBankAccount: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d? = null,
    public val wechatPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab? = null,
    public val zip: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82? = null,
) {
    public class Builder {
        public var acssDebit:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b? = null

        public var affirm: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f? =
            null

        public var afterpayClearpay: InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6? =
            null

        public var alipay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857? =
            null

        public var alma: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c? = null

        public var amazonPay:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b? = null

        public var auBecsDebit:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33? = null

        public var bacsDebit:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd? = null

        public var bancontact:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab? = null

        public var billie: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93? =
            null

        public var bizum: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279? =
            null

        public var blik: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475? = null

        public var boleto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb? =
            null

        public var card: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f? = null

        public var cardPresent:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce? = null

        public var cashapp: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394? =
            null

        public var crypto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoXaf261f95? =
            null

        public var customerBalance: InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256? =
            null

        public var eps: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002? = null

        public var fpx: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062? = null

        public var giropay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7? =
            null

        public var grabpay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365? =
            null

        public var ideal: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a? =
            null

        public var interacPresent:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32? = null

        public var kakaoPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b? =
            null

        public var klarna: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c? =
            null

        public var konbini: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXe8ab309b? =
            null

        public var krCard: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa? =
            null

        public var link: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a? = null

        public var mbWay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2? =
            null

        public var mobilepay:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b? = null

        public var multibanco:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b? = null

        public var naverPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735? =
            null

        public var nzBankAccount:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941? = null

        public var oxxo: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318? = null

        public var p24: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb? = null

        public var payByBank:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749? = null

        public var payco: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a? =
            null

        public var paynow: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21? =
            null

        public var paypal: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d? =
            null

        public var payto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30? =
            null

        public var pix: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506? = null

        public var promptpay:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd? = null

        public var revolutPay:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb? = null

        public var samsungPay:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c? = null

        public var satispay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17? =
            null

        public var scalapay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b? =
            null

        public var sepaDebit:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688? = null

        public var sofort: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5? =
            null

        public var sunbit: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f? =
            null

        public var swish: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98? =
            null

        public var twint: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2? =
            null

        public var upi: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977? = null

        public var usBankAccount:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d? = null

        public var wechatPay:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab? = null

        public var zip: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e(
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
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e(
                acssDebit =
                    rawObject["acss_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXadb3736b>(
                                it,
                            )
                    },
                affirm =
                    rawObject["affirm"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f>(
                                it,
                            )
                    },
                afterpayClearpay =
                    rawObject["afterpay_clearpay"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX6b0e7ef6>(it)
                    },
                alipay =
                    rawObject["alipay"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayX38de3857>(
                                it,
                            )
                    },
                alma =
                    rawObject["alma"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXbf4acc1c>(
                                it,
                            )
                    },
                amazonPay =
                    rawObject["amazon_pay"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayX37380d7b>(
                                it,
                            )
                    },
                auBecsDebit =
                    rawObject["au_becs_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitXd59e6e33>(
                                it,
                            )
                    },
                bacsDebit =
                    rawObject["bacs_debit"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX28ffc4fd>(
                                it,
                            )
                    },
                bancontact =
                    rawObject["bancontact"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab>(
                                it,
                            )
                    },
                billie =
                    rawObject["billie"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieXa8d91d93>(
                                it,
                            )
                    },
                bizum =
                    rawObject["bizum"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXede2a279>(
                                it,
                            )
                    },
                blik =
                    rawObject["blik"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX0f5e8475>(
                                it,
                            )
                    },
                boleto =
                    rawObject["boleto"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXc328cbeb>(
                                it,
                            )
                    },
                card =
                    rawObject["card"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX2d3e097f>(
                                it,
                            )
                    },
                cardPresent =
                    rawObject["card_present"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentX59c2a9ce>(
                                it,
                            )
                    },
                cashapp =
                    rawObject["cashapp"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappX9c19f394>(
                                it,
                            )
                    },
                crypto =
                    rawObject["crypto"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoXaf261f95>(
                                it,
                            )
                    },
                customerBalance =
                    rawObject["customer_balance"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCustomerBalanceX17714256>(
                                it,
                            )
                        },
                eps =
                    rawObject["eps"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX2981f002>(
                                it,
                            )
                    },
                fpx =
                    rawObject["fpx"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxX22e07062>(
                                it,
                            )
                    },
                giropay =
                    rawObject["giropay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayX53e72dc7>(
                                    it,
                                )
                        },
                grabpay =
                    rawObject["grabpay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayXf2d95365>(
                                    it,
                                )
                        },
                ideal =
                    rawObject["ideal"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXdfa7bf6a>(
                                    it,
                                )
                        },
                interacPresent =
                    rawObject["interac_present"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX58af8d32>(
                                    it,
                                )
                        },
                kakaoPay =
                    rawObject["kakao_pay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayXe838832b>(
                                    it,
                                )
                        },
                klarna =
                    rawObject["klarna"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaXa532cb7c>(
                                    it,
                                )
                        },
                konbini =
                    rawObject["konbini"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXe8ab309b>(
                                    it,
                                )
                        },
                krCard =
                    rawObject["kr_card"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXe9f82caa>(
                                    it,
                                )
                        },
                link =
                    rawObject["link"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX8626f40a>(
                                    it,
                                )
                        },
                mbWay =
                    rawObject["mb_way"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX6a77d8f2>(
                                    it,
                                )
                        },
                mobilepay =
                    rawObject["mobilepay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX14f3580b>(
                                    it,
                                )
                        },
                multibanco =
                    rawObject["multibanco"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX248e507b>(
                                    it,
                                )
                        },
                naverPay =
                    rawObject["naver_pay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX78865735>(
                                    it,
                                )
                        },
                nzBankAccount =
                    rawObject["nz_bank_account"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountX38a59941>(
                                    it,
                                )
                        },
                oxxo =
                    rawObject["oxxo"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXe73bd318>(
                                    it,
                                )
                        },
                p24 =
                    rawObject["p24"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24Xc874aadb>(
                                    it,
                                )
                        },
                payByBank =
                    rawObject["pay_by_bank"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa2da8749>(
                                    it,
                                )
                        },
                payco =
                    rawObject["payco"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX1cb2fa2a>(
                                    it,
                                )
                        },
                paynow =
                    rawObject["paynow"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowX462e2f21>(
                                    it,
                                )
                        },
                paypal =
                    rawObject["paypal"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX6cc3fb8d>(
                                    it,
                                )
                        },
                payto =
                    rawObject["payto"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoXc6ed2c30>(
                                    it,
                                )
                        },
                pix =
                    rawObject["pix"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX2680e506>(
                                    it,
                                )
                        },
                promptpay =
                    rawObject["promptpay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayX421583bd>(
                                    it,
                                )
                        },
                revolutPay =
                    rawObject["revolut_pay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXb9b28deb>(
                                    it,
                                )
                        },
                samsungPay =
                    rawObject["samsung_pay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayXeaadb66c>(
                                    it,
                                )
                        },
                satispay =
                    rawObject["satispay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX76831b17>(
                                    it,
                                )
                        },
                scalapay =
                    rawObject["scalapay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX53b5a46b>(
                                    it,
                                )
                        },
                sepaDebit =
                    rawObject["sepa_debit"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX39257688>(
                                    it,
                                )
                        },
                sofort =
                    rawObject["sofort"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX0d9038d5>(
                                    it,
                                )
                        },
                sunbit =
                    rawObject["sunbit"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXe1de5f4f>(
                                    it,
                                )
                        },
                swish =
                    rawObject["swish"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishXa96f5b98>(
                                    it,
                                )
                        },
                twint =
                    rawObject["twint"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintXe92cccd2>(
                                    it,
                                )
                        },
                upi =
                    rawObject["upi"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiX1e35b977>(
                                    it,
                                )
                        },
                usBankAccount =
                    rawObject["us_bank_account"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX3f2e943d>(
                                    it,
                                )
                        },
                wechatPay =
                    rawObject["wechat_pay"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayX19b781ab>(
                                    it,
                                )
                        },
                zip =
                    rawObject["zip"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX65f56a82>(
                                    it,
                                )
                        },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX1e08fc5e.build(block)
