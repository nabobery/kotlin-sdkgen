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
 * Each key of the dictionary represents a capability, and each capability
 * maps to its settings (for example, whether it has been requested or not). Each
 * capability is inactive until you have provided its specific
 * requirements and Stripe has verified them. An account might have some
 * of its requested capabilities be active and some be inactive.
 *
 * Required when
 * [account.controller.stripe_dashboard.type](/api/accounts/create#create_account-controller-dashboard-type)
 * is `none`, which includes Custom accounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesXf340f39e.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesXf340f39e(
    public val acssDebitPayments: InlineV1AccountsPostRequestFormCapabilitiesAcssDebitPaymentsX724f9d12? = null,
    public val affirmPayments: InlineV1AccountsPostRequestFormCapabilitiesAffirmPaymentsXedbc71f8? = null,
    public val afterpayClearpayPayments:
        InlineV1AccountsPostRequestFormCapabilitiesAfterpayClearpayPaymentsXb5890880? = null,
    public val almaPayments: InlineV1AccountsPostRequestFormCapabilitiesAlmaPaymentsX8b8136d4? = null,
    public val amazonPayPayments: InlineV1AccountsPostRequestFormCapabilitiesAmazonPayPaymentsX11834d29? = null,
    public val appDistribution: InlineV1AccountsPostRequestFormCapabilitiesAppDistributionXe9a43394? = null,
    public val auBecsDebitPayments: InlineV1AccountsPostRequestFormCapabilitiesAuBecsDebitPaymentsXd01a531e? = null,
    public val bacsDebitPayments: InlineV1AccountsPostRequestFormCapabilitiesBacsDebitPaymentsXfb5737f1? = null,
    public val bancontactPayments: InlineV1AccountsPostRequestFormCapabilitiesBancontactPaymentsX0134babe? = null,
    public val bankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsXbe432317? = null,
    public val billiePayments: InlineV1AccountsPostRequestFormCapabilitiesBilliePaymentsX76b460e9? = null,
    public val bizumPayments: InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e? = null,
    public val blikPayments: InlineV1AccountsPostRequestFormCapabilitiesBlikPaymentsXf8e90a4a? = null,
    public val boletoPayments: InlineV1AccountsPostRequestFormCapabilitiesBoletoPaymentsX81f93101? = null,
    public val cardIssuing: InlineV1AccountsPostRequestFormCapabilitiesCardIssuingXce837811? = null,
    public val cardPayments: InlineV1AccountsPostRequestFormCapabilitiesCardPaymentsX8adba7e2? = null,
    public val cartesBancairesPayments:
        InlineV1AccountsPostRequestFormCapabilitiesCartesBancairesPaymentsXe4cf54c1? = null,
    public val cashappPayments: InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsX60bdaefb? = null,
    public val cryptoPayments: InlineV1AccountsPostRequestFormCapabilitiesCryptoPaymentsXe5b90934? = null,
    public val epsPayments: InlineV1AccountsPostRequestFormCapabilitiesEpsPaymentsXdf8d3460? = null,
    public val fpxPayments: InlineV1AccountsPostRequestFormCapabilitiesFpxPaymentsXb66c0cce? = null,
    public val gbBankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesGbBankTransferPaymentsX69c770d9? = null,
    public val giropayPayments: InlineV1AccountsPostRequestFormCapabilitiesGiropayPaymentsX021d94d9? = null,
    public val grabpayPayments: InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a? = null,
    public val idealPayments: InlineV1AccountsPostRequestFormCapabilitiesIdealPaymentsXa6d85acc? = null,
    public val indiaInternationalPayments:
        InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX4dd185a0? = null,
    public val jcbPayments: InlineV1AccountsPostRequestFormCapabilitiesJcbPaymentsXbefbb38d? = null,
    public val jpBankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesJpBankTransferPaymentsX85dbfa70? = null,
    public val kakaoPayPayments: InlineV1AccountsPostRequestFormCapabilitiesKakaoPayPaymentsX6cc74ae8? = null,
    public val klarnaPayments: InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c? = null,
    public val konbiniPayments: InlineV1AccountsPostRequestFormCapabilitiesKonbiniPaymentsX025c62b8? = null,
    public val krCardPayments: InlineV1AccountsPostRequestFormCapabilitiesKrCardPaymentsXb567e814? = null,
    public val legacyPayments: InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998? = null,
    public val linkPayments: InlineV1AccountsPostRequestFormCapabilitiesLinkPaymentsXe88bc220? = null,
    public val mbWayPayments: InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX4f5156ee? = null,
    public val mobilepayPayments: InlineV1AccountsPostRequestFormCapabilitiesMobilepayPaymentsX3f931952? = null,
    public val multibancoPayments: InlineV1AccountsPostRequestFormCapabilitiesMultibancoPaymentsX09e1acc5? = null,
    public val mxBankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesMxBankTransferPaymentsX4886d3a6? = null,
    public val naverPayPayments: InlineV1AccountsPostRequestFormCapabilitiesNaverPayPaymentsX6e78a2e2? = null,
    public val nzBankAccountBecsDebitPayments:
        InlineV1AccountsPostRequestFormCapabilitiesNzBankAccountBecsDebf2d0X0685edee? = null,
    public val oxxoPayments: InlineV1AccountsPostRequestFormCapabilitiesOxxoPaymentsX577fec32? = null,
    public val p24Payments: InlineV1AccountsPostRequestFormCapabilitiesP24PaymentsXe88a70c9? = null,
    public val payByBankPayments: InlineV1AccountsPostRequestFormCapabilitiesPayByBankPaymentsX71f69d6d? = null,
    public val paycoPayments: InlineV1AccountsPostRequestFormCapabilitiesPaycoPaymentsXc7fe29bb? = null,
    public val paynowPayments: InlineV1AccountsPostRequestFormCapabilitiesPaynowPaymentsXb8caaeaf? = null,
    public val paytoPayments: InlineV1AccountsPostRequestFormCapabilitiesPaytoPaymentsXc6a2d43d? = null,
    public val pixPayments: InlineV1AccountsPostRequestFormCapabilitiesPixPaymentsXad280602? = null,
    public val promptpayPayments: InlineV1AccountsPostRequestFormCapabilitiesPromptpayPaymentsX2cb29060? = null,
    public val revolutPayPayments: InlineV1AccountsPostRequestFormCapabilitiesRevolutPayPaymentsX91f6e2c5? = null,
    public val samsungPayPayments: InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce? = null,
    public val satispayPayments: InlineV1AccountsPostRequestFormCapabilitiesSatispayPaymentsX9bdc7473? = null,
    public val scalapayPayments: InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsX50e31d27? = null,
    public val sepaBankTransferPayments:
        InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsXadacac4a? = null,
    public val sepaDebitPayments: InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b? = null,
    public val sofortPayments: InlineV1AccountsPostRequestFormCapabilitiesSofortPaymentsX78d2a6ef? = null,
    public val sunbitPayments: InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720? = null,
    public val swishPayments: InlineV1AccountsPostRequestFormCapabilitiesSwishPaymentsX45d862be? = null,
    public val taxReportingUs1099K: InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099KXc94aa4c1? = null,
    public val taxReportingUs1099Misc: InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759? = null,
    public val transfers: InlineV1AccountsPostRequestFormCapabilitiesTransfersX62944fff? = null,
    public val treasury: InlineV1AccountsPostRequestFormCapabilitiesTreasuryXed3aa913? = null,
    public val twintPayments: InlineV1AccountsPostRequestFormCapabilitiesTwintPaymentsX5b4cc8fc? = null,
    public val upiPayments: InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsX35f080ee? = null,
    public val usBankAccountAchPayments:
        InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXacb45960? = null,
    public val usBankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsX6f7c2de5? = null,
    public val zipPayments: InlineV1AccountsPostRequestFormCapabilitiesZipPaymentsX7c0b350b? = null,
) {
    public class Builder {
        public var acssDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesAcssDebitPaymentsX724f9d12? = null

        public var affirmPayments: InlineV1AccountsPostRequestFormCapabilitiesAffirmPaymentsXedbc71f8? =
            null

        public var afterpayClearpayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesAfterpayClearpayPaymentsXb5890880? = null

        public var almaPayments: InlineV1AccountsPostRequestFormCapabilitiesAlmaPaymentsX8b8136d4? =
            null

        public var amazonPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesAmazonPayPaymentsX11834d29? = null

        public var appDistribution: InlineV1AccountsPostRequestFormCapabilitiesAppDistributionXe9a43394? =
            null

        public var auBecsDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesAuBecsDebitPaymentsXd01a531e? = null

        public var bacsDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesBacsDebitPaymentsXfb5737f1? = null

        public var bancontactPayments:
            InlineV1AccountsPostRequestFormCapabilitiesBancontactPaymentsX0134babe? = null

        public var bankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsXbe432317? = null

        public var billiePayments: InlineV1AccountsPostRequestFormCapabilitiesBilliePaymentsX76b460e9? =
            null

        public var bizumPayments: InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e? =
            null

        public var blikPayments: InlineV1AccountsPostRequestFormCapabilitiesBlikPaymentsXf8e90a4a? =
            null

        public var boletoPayments: InlineV1AccountsPostRequestFormCapabilitiesBoletoPaymentsX81f93101? =
            null

        public var cardIssuing: InlineV1AccountsPostRequestFormCapabilitiesCardIssuingXce837811? = null

        public var cardPayments: InlineV1AccountsPostRequestFormCapabilitiesCardPaymentsX8adba7e2? =
            null

        public var cartesBancairesPayments:
            InlineV1AccountsPostRequestFormCapabilitiesCartesBancairesPaymentsXe4cf54c1? = null

        public var cashappPayments: InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsX60bdaefb? =
            null

        public var cryptoPayments: InlineV1AccountsPostRequestFormCapabilitiesCryptoPaymentsXe5b90934? =
            null

        public var epsPayments: InlineV1AccountsPostRequestFormCapabilitiesEpsPaymentsXdf8d3460? = null

        public var fpxPayments: InlineV1AccountsPostRequestFormCapabilitiesFpxPaymentsXb66c0cce? = null

        public var gbBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesGbBankTransferPaymentsX69c770d9? = null

        public var giropayPayments: InlineV1AccountsPostRequestFormCapabilitiesGiropayPaymentsX021d94d9? =
            null

        public var grabpayPayments: InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a? =
            null

        public var idealPayments: InlineV1AccountsPostRequestFormCapabilitiesIdealPaymentsXa6d85acc? =
            null

        public var indiaInternationalPayments:
            InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX4dd185a0? = null

        public var jcbPayments: InlineV1AccountsPostRequestFormCapabilitiesJcbPaymentsXbefbb38d? = null

        public var jpBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesJpBankTransferPaymentsX85dbfa70? = null

        public var kakaoPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesKakaoPayPaymentsX6cc74ae8? = null

        public var klarnaPayments: InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c? =
            null

        public var konbiniPayments: InlineV1AccountsPostRequestFormCapabilitiesKonbiniPaymentsX025c62b8? =
            null

        public var krCardPayments: InlineV1AccountsPostRequestFormCapabilitiesKrCardPaymentsXb567e814? =
            null

        public var legacyPayments: InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998? =
            null

        public var linkPayments: InlineV1AccountsPostRequestFormCapabilitiesLinkPaymentsXe88bc220? =
            null

        public var mbWayPayments: InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX4f5156ee? =
            null

        public var mobilepayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesMobilepayPaymentsX3f931952? = null

        public var multibancoPayments:
            InlineV1AccountsPostRequestFormCapabilitiesMultibancoPaymentsX09e1acc5? = null

        public var mxBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesMxBankTransferPaymentsX4886d3a6? = null

        public var naverPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesNaverPayPaymentsX6e78a2e2? = null

        public var nzBankAccountBecsDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesNzBankAccountBecsDebf2d0X0685edee? = null

        public var oxxoPayments: InlineV1AccountsPostRequestFormCapabilitiesOxxoPaymentsX577fec32? =
            null

        public var p24Payments: InlineV1AccountsPostRequestFormCapabilitiesP24PaymentsXe88a70c9? = null

        public var payByBankPayments:
            InlineV1AccountsPostRequestFormCapabilitiesPayByBankPaymentsX71f69d6d? = null

        public var paycoPayments: InlineV1AccountsPostRequestFormCapabilitiesPaycoPaymentsXc7fe29bb? =
            null

        public var paynowPayments: InlineV1AccountsPostRequestFormCapabilitiesPaynowPaymentsXb8caaeaf? =
            null

        public var paytoPayments: InlineV1AccountsPostRequestFormCapabilitiesPaytoPaymentsXc6a2d43d? =
            null

        public var pixPayments: InlineV1AccountsPostRequestFormCapabilitiesPixPaymentsXad280602? = null

        public var promptpayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesPromptpayPaymentsX2cb29060? = null

        public var revolutPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesRevolutPayPaymentsX91f6e2c5? = null

        public var samsungPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce? = null

        public var satispayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesSatispayPaymentsX9bdc7473? = null

        public var scalapayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsX50e31d27? = null

        public var sepaBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsXadacac4a? = null

        public var sepaDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b? = null

        public var sofortPayments: InlineV1AccountsPostRequestFormCapabilitiesSofortPaymentsX78d2a6ef? =
            null

        public var sunbitPayments: InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720? =
            null

        public var swishPayments: InlineV1AccountsPostRequestFormCapabilitiesSwishPaymentsX45d862be? =
            null

        public var taxReportingUs1099K:
            InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099KXc94aa4c1? = null

        public var taxReportingUs1099Misc:
            InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759? = null

        public var transfers: InlineV1AccountsPostRequestFormCapabilitiesTransfersX62944fff? = null

        public var treasury: InlineV1AccountsPostRequestFormCapabilitiesTreasuryXed3aa913? = null

        public var twintPayments: InlineV1AccountsPostRequestFormCapabilitiesTwintPaymentsX5b4cc8fc? =
            null

        public var upiPayments: InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsX35f080ee? = null

        public var usBankAccountAchPayments:
            InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXacb45960? = null

        public var usBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsX6f7c2de5? = null

        public var zipPayments: InlineV1AccountsPostRequestFormCapabilitiesZipPaymentsX7c0b350b? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesXf340f39e =
            InlineV1AccountsPostRequestFormCapabilitiesXf340f39e(
                acssDebitPayments = acssDebitPayments,
                affirmPayments = affirmPayments,
                afterpayClearpayPayments = afterpayClearpayPayments,
                almaPayments = almaPayments,
                amazonPayPayments = amazonPayPayments,
                appDistribution = appDistribution,
                auBecsDebitPayments = auBecsDebitPayments,
                bacsDebitPayments = bacsDebitPayments,
                bancontactPayments = bancontactPayments,
                bankTransferPayments = bankTransferPayments,
                billiePayments = billiePayments,
                bizumPayments = bizumPayments,
                blikPayments = blikPayments,
                boletoPayments = boletoPayments,
                cardIssuing = cardIssuing,
                cardPayments = cardPayments,
                cartesBancairesPayments = cartesBancairesPayments,
                cashappPayments = cashappPayments,
                cryptoPayments = cryptoPayments,
                epsPayments = epsPayments,
                fpxPayments = fpxPayments,
                gbBankTransferPayments = gbBankTransferPayments,
                giropayPayments = giropayPayments,
                grabpayPayments = grabpayPayments,
                idealPayments = idealPayments,
                indiaInternationalPayments = indiaInternationalPayments,
                jcbPayments = jcbPayments,
                jpBankTransferPayments = jpBankTransferPayments,
                kakaoPayPayments = kakaoPayPayments,
                klarnaPayments = klarnaPayments,
                konbiniPayments = konbiniPayments,
                krCardPayments = krCardPayments,
                legacyPayments = legacyPayments,
                linkPayments = linkPayments,
                mbWayPayments = mbWayPayments,
                mobilepayPayments = mobilepayPayments,
                multibancoPayments = multibancoPayments,
                mxBankTransferPayments = mxBankTransferPayments,
                naverPayPayments = naverPayPayments,
                nzBankAccountBecsDebitPayments = nzBankAccountBecsDebitPayments,
                oxxoPayments = oxxoPayments,
                p24Payments = p24Payments,
                payByBankPayments = payByBankPayments,
                paycoPayments = paycoPayments,
                paynowPayments = paynowPayments,
                paytoPayments = paytoPayments,
                pixPayments = pixPayments,
                promptpayPayments = promptpayPayments,
                revolutPayPayments = revolutPayPayments,
                samsungPayPayments = samsungPayPayments,
                satispayPayments = satispayPayments,
                scalapayPayments = scalapayPayments,
                sepaBankTransferPayments = sepaBankTransferPayments,
                sepaDebitPayments = sepaDebitPayments,
                sofortPayments = sofortPayments,
                sunbitPayments = sunbitPayments,
                swishPayments = swishPayments,
                taxReportingUs1099K = taxReportingUs1099K,
                taxReportingUs1099Misc = taxReportingUs1099Misc,
                transfers = transfers,
                treasury = treasury,
                twintPayments = twintPayments,
                upiPayments = upiPayments,
                usBankAccountAchPayments = usBankAccountAchPayments,
                usBankTransferPayments = usBankTransferPayments,
                zipPayments = zipPayments,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesXf340f39e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesXf340f39e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesXf340f39e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesXf340f39e")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesXf340f39e must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesXf340f39e(
                acssDebitPayments =
                    rawObject["acss_debit_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAcssDebitPaymentsX724f9d12>(
                                it,
                            )
                    },
                affirmPayments =
                    rawObject["affirm_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAffirmPaymentsXedbc71f8>(
                            it,
                        )
                    },
                afterpayClearpayPayments =
                    rawObject["afterpay_clearpay_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAfterpayClearpayPaymentsXb5890880>(
                                it,
                            )
                    },
                almaPayments =
                    rawObject["alma_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAlmaPaymentsX8b8136d4>(it)
                    },
                amazonPayPayments =
                    rawObject["amazon_pay_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAmazonPayPaymentsX11834d29>(
                                it,
                            )
                    },
                appDistribution =
                    rawObject["app_distribution"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAppDistributionXe9a43394>(
                            it,
                        )
                    },
                auBecsDebitPayments =
                    rawObject["au_becs_debit_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAuBecsDebitPaymentsXd01a531e>(
                                it,
                            )
                    },
                bacsDebitPayments =
                    rawObject["bacs_debit_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBacsDebitPaymentsXfb5737f1>(
                                it,
                            )
                    },
                bancontactPayments =
                    rawObject["bancontact_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBancontactPaymentsX0134babe>(
                                it,
                            )
                    },
                bankTransferPayments =
                    rawObject["bank_transfer_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsXbe432317>(
                                it,
                            )
                    },
                billiePayments =
                    rawObject["billie_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBilliePaymentsX76b460e9>(
                            it,
                        )
                    },
                bizumPayments =
                    rawObject["bizum_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXbb41140e>(
                            it,
                        )
                    },
                blikPayments =
                    rawObject["blik_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBlikPaymentsXf8e90a4a>(it)
                    },
                boletoPayments =
                    rawObject["boleto_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBoletoPaymentsX81f93101>(
                            it,
                        )
                    },
                cardIssuing =
                    rawObject["card_issuing"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCardIssuingXce837811>(it)
                    },
                cardPayments =
                    rawObject["card_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCardPaymentsX8adba7e2>(it)
                    },
                cartesBancairesPayments =
                    rawObject["cartes_bancaires_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCartesBancairesPaymentsXe4cf54c1>(
                                    it,
                                )
                        },
                cashappPayments =
                    rawObject["cashapp_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsX60bdaefb>(
                                    it,
                                )
                        },
                cryptoPayments =
                    rawObject["crypto_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCryptoPaymentsXe5b90934>(
                                    it,
                                )
                        },
                epsPayments =
                    rawObject["eps_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesEpsPaymentsXdf8d3460>(
                                it,
                            )
                        },
                fpxPayments =
                    rawObject["fpx_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesFpxPaymentsXb66c0cce>(
                                it,
                            )
                        },
                gbBankTransferPayments =
                    rawObject["gb_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesGbBankTransferPaymentsX69c770d9>(
                                    it,
                                )
                        },
                giropayPayments =
                    rawObject["giropay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesGiropayPaymentsX021d94d9>(
                                    it,
                                )
                        },
                grabpayPayments =
                    rawObject["grabpay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a>(
                                    it,
                                )
                        },
                idealPayments =
                    rawObject["ideal_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesIdealPaymentsXa6d85acc>(
                                    it,
                                )
                        },
                indiaInternationalPayments =
                    rawObject["india_international_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX4dd185a0>(
                                    it,
                                )
                        },
                jcbPayments =
                    rawObject["jcb_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesJcbPaymentsXbefbb38d>(
                                it,
                            )
                        },
                jpBankTransferPayments =
                    rawObject["jp_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesJpBankTransferPaymentsX85dbfa70>(
                                    it,
                                )
                        },
                kakaoPayPayments =
                    rawObject["kakao_pay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesKakaoPayPaymentsX6cc74ae8>(
                                    it,
                                )
                        },
                klarnaPayments =
                    rawObject["klarna_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c>(
                                    it,
                                )
                        },
                konbiniPayments =
                    rawObject["konbini_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesKonbiniPaymentsX025c62b8>(
                                    it,
                                )
                        },
                krCardPayments =
                    rawObject["kr_card_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesKrCardPaymentsXb567e814>(
                                    it,
                                )
                        },
                legacyPayments =
                    rawObject["legacy_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX6941c998>(
                                    it,
                                )
                        },
                linkPayments =
                    rawObject["link_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesLinkPaymentsXe88bc220>(
                                    it,
                                )
                        },
                mbWayPayments =
                    rawObject["mb_way_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX4f5156ee>(
                                    it,
                                )
                        },
                mobilepayPayments =
                    rawObject["mobilepay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesMobilepayPaymentsX3f931952>(
                                    it,
                                )
                        },
                multibancoPayments =
                    rawObject["multibanco_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesMultibancoPaymentsX09e1acc5>(
                                    it,
                                )
                        },
                mxBankTransferPayments =
                    rawObject["mx_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesMxBankTransferPaymentsX4886d3a6>(
                                    it,
                                )
                        },
                naverPayPayments =
                    rawObject["naver_pay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesNaverPayPaymentsX6e78a2e2>(
                                    it,
                                )
                        },
                nzBankAccountBecsDebitPayments =
                    rawObject["nz_bank_account_becs_debit_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesNzBankAccountBecsDebf2d0X0685edee>(
                                    it,
                                )
                        },
                oxxoPayments =
                    rawObject["oxxo_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesOxxoPaymentsX577fec32>(
                                    it,
                                )
                        },
                p24Payments =
                    rawObject["p24_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesP24PaymentsXe88a70c9>(
                                it,
                            )
                        },
                payByBankPayments =
                    rawObject["pay_by_bank_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPayByBankPaymentsX71f69d6d>(
                                    it,
                                )
                        },
                paycoPayments =
                    rawObject["payco_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPaycoPaymentsXc7fe29bb>(
                                    it,
                                )
                        },
                paynowPayments =
                    rawObject["paynow_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPaynowPaymentsXb8caaeaf>(
                                    it,
                                )
                        },
                paytoPayments =
                    rawObject["payto_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPaytoPaymentsXc6a2d43d>(
                                    it,
                                )
                        },
                pixPayments =
                    rawObject["pix_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPixPaymentsXad280602>(
                                it,
                            )
                        },
                promptpayPayments =
                    rawObject["promptpay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPromptpayPaymentsX2cb29060>(
                                    it,
                                )
                        },
                revolutPayPayments =
                    rawObject["revolut_pay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesRevolutPayPaymentsX91f6e2c5>(
                                    it,
                                )
                        },
                samsungPayPayments =
                    rawObject["samsung_pay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX35d61fce>(
                                    it,
                                )
                        },
                satispayPayments =
                    rawObject["satispay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSatispayPaymentsX9bdc7473>(
                                    it,
                                )
                        },
                scalapayPayments =
                    rawObject["scalapay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsX50e31d27>(
                                    it,
                                )
                        },
                sepaBankTransferPayments =
                    rawObject["sepa_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsXadacac4a>(
                                    it,
                                )
                        },
                sepaDebitPayments =
                    rawObject["sepa_debit_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b>(
                                    it,
                                )
                        },
                sofortPayments =
                    rawObject["sofort_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSofortPaymentsX78d2a6ef>(
                                    it,
                                )
                        },
                sunbitPayments =
                    rawObject["sunbit_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXeb722720>(
                                    it,
                                )
                        },
                swishPayments =
                    rawObject["swish_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSwishPaymentsX45d862be>(
                                    it,
                                )
                        },
                taxReportingUs1099K =
                    rawObject["tax_reporting_us_1099_k"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099KXc94aa4c1>(
                                    it,
                                )
                        },
                taxReportingUs1099Misc =
                    rawObject["tax_reporting_us_1099_misc"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX1c32b759>(
                                    it,
                                )
                        },
                transfers =
                    rawObject["transfers"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTransfersX62944fff>(
                                it,
                            )
                        },
                treasury =
                    rawObject["treasury"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTreasuryXed3aa913>(it)
                        },
                twintPayments =
                    rawObject["twint_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTwintPaymentsX5b4cc8fc>(
                                    it,
                                )
                        },
                upiPayments =
                    rawObject["upi_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsX35f080ee>(
                                it,
                            )
                        },
                usBankAccountAchPayments =
                    rawObject["us_bank_account_ach_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXacb45960>(
                                    it,
                                )
                        },
                usBankTransferPayments =
                    rawObject["us_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsX6f7c2de5>(
                                    it,
                                )
                        },
                zipPayments =
                    rawObject["zip_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesZipPaymentsX7c0b350b>(
                                it,
                            )
                        },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesXf340f39e,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesXf340f39e")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.acssDebitPayments?.let { put("acss_debit_payments", json.encodeToJsonElement(it)) }
                    value.affirmPayments?.let { put("affirm_payments", json.encodeToJsonElement(it)) }
                    value.afterpayClearpayPayments?.let {
                        put(
                            "afterpay_clearpay_payments",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.almaPayments?.let { put("alma_payments", json.encodeToJsonElement(it)) }
                    value.amazonPayPayments?.let { put("amazon_pay_payments", json.encodeToJsonElement(it)) }
                    value.appDistribution?.let { put("app_distribution", json.encodeToJsonElement(it)) }
                    value.auBecsDebitPayments?.let { put("au_becs_debit_payments", json.encodeToJsonElement(it)) }
                    value.bacsDebitPayments?.let { put("bacs_debit_payments", json.encodeToJsonElement(it)) }
                    value.bancontactPayments?.let { put("bancontact_payments", json.encodeToJsonElement(it)) }
                    value.bankTransferPayments?.let { put("bank_transfer_payments", json.encodeToJsonElement(it)) }
                    value.billiePayments?.let { put("billie_payments", json.encodeToJsonElement(it)) }
                    value.bizumPayments?.let { put("bizum_payments", json.encodeToJsonElement(it)) }
                    value.blikPayments?.let { put("blik_payments", json.encodeToJsonElement(it)) }
                    value.boletoPayments?.let { put("boleto_payments", json.encodeToJsonElement(it)) }
                    value.cardIssuing?.let { put("card_issuing", json.encodeToJsonElement(it)) }
                    value.cardPayments?.let { put("card_payments", json.encodeToJsonElement(it)) }
                    value.cartesBancairesPayments?.let {
                        put(
                            "cartes_bancaires_payments",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.cashappPayments?.let { put("cashapp_payments", json.encodeToJsonElement(it)) }
                    value.cryptoPayments?.let { put("crypto_payments", json.encodeToJsonElement(it)) }
                    value.epsPayments?.let { put("eps_payments", json.encodeToJsonElement(it)) }
                    value.fpxPayments?.let { put("fpx_payments", json.encodeToJsonElement(it)) }
                    value.gbBankTransferPayments?.let { put("gb_bank_transfer_payments", json.encodeToJsonElement(it)) }
                    value.giropayPayments?.let { put("giropay_payments", json.encodeToJsonElement(it)) }
                    value.grabpayPayments?.let { put("grabpay_payments", json.encodeToJsonElement(it)) }
                    value.idealPayments?.let { put("ideal_payments", json.encodeToJsonElement(it)) }
                    value.indiaInternationalPayments?.let {
                        put(
                            "india_international_payments",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.jcbPayments?.let { put("jcb_payments", json.encodeToJsonElement(it)) }
                    value.jpBankTransferPayments?.let { put("jp_bank_transfer_payments", json.encodeToJsonElement(it)) }
                    value.kakaoPayPayments?.let { put("kakao_pay_payments", json.encodeToJsonElement(it)) }
                    value.klarnaPayments?.let { put("klarna_payments", json.encodeToJsonElement(it)) }
                    value.konbiniPayments?.let { put("konbini_payments", json.encodeToJsonElement(it)) }
                    value.krCardPayments?.let { put("kr_card_payments", json.encodeToJsonElement(it)) }
                    value.legacyPayments?.let { put("legacy_payments", json.encodeToJsonElement(it)) }
                    value.linkPayments?.let { put("link_payments", json.encodeToJsonElement(it)) }
                    value.mbWayPayments?.let { put("mb_way_payments", json.encodeToJsonElement(it)) }
                    value.mobilepayPayments?.let { put("mobilepay_payments", json.encodeToJsonElement(it)) }
                    value.multibancoPayments?.let { put("multibanco_payments", json.encodeToJsonElement(it)) }
                    value.mxBankTransferPayments?.let { put("mx_bank_transfer_payments", json.encodeToJsonElement(it)) }
                    value.naverPayPayments?.let { put("naver_pay_payments", json.encodeToJsonElement(it)) }
                    value.nzBankAccountBecsDebitPayments?.let {
                        put(
                            "nz_bank_account_becs_debit_payments",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.oxxoPayments?.let { put("oxxo_payments", json.encodeToJsonElement(it)) }
                    value.p24Payments?.let { put("p24_payments", json.encodeToJsonElement(it)) }
                    value.payByBankPayments?.let { put("pay_by_bank_payments", json.encodeToJsonElement(it)) }
                    value.paycoPayments?.let { put("payco_payments", json.encodeToJsonElement(it)) }
                    value.paynowPayments?.let { put("paynow_payments", json.encodeToJsonElement(it)) }
                    value.paytoPayments?.let { put("payto_payments", json.encodeToJsonElement(it)) }
                    value.pixPayments?.let { put("pix_payments", json.encodeToJsonElement(it)) }
                    value.promptpayPayments?.let { put("promptpay_payments", json.encodeToJsonElement(it)) }
                    value.revolutPayPayments?.let { put("revolut_pay_payments", json.encodeToJsonElement(it)) }
                    value.samsungPayPayments?.let { put("samsung_pay_payments", json.encodeToJsonElement(it)) }
                    value.satispayPayments?.let { put("satispay_payments", json.encodeToJsonElement(it)) }
                    value.scalapayPayments?.let { put("scalapay_payments", json.encodeToJsonElement(it)) }
                    value.sepaBankTransferPayments?.let {
                        put(
                            "sepa_bank_transfer_payments",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.sepaDebitPayments?.let { put("sepa_debit_payments", json.encodeToJsonElement(it)) }
                    value.sofortPayments?.let { put("sofort_payments", json.encodeToJsonElement(it)) }
                    value.sunbitPayments?.let { put("sunbit_payments", json.encodeToJsonElement(it)) }
                    value.swishPayments?.let { put("swish_payments", json.encodeToJsonElement(it)) }
                    value.taxReportingUs1099K?.let { put("tax_reporting_us_1099_k", json.encodeToJsonElement(it)) }
                    value.taxReportingUs1099Misc?.let {
                        put(
                            "tax_reporting_us_1099_misc",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.transfers?.let { put("transfers", json.encodeToJsonElement(it)) }
                    value.treasury?.let { put("treasury", json.encodeToJsonElement(it)) }
                    value.twintPayments?.let { put("twint_payments", json.encodeToJsonElement(it)) }
                    value.upiPayments?.let { put("upi_payments", json.encodeToJsonElement(it)) }
                    value.usBankAccountAchPayments?.let {
                        put(
                            "us_bank_account_ach_payments",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.usBankTransferPayments?.let { put("us_bank_transfer_payments", json.encodeToJsonElement(it)) }
                    value.zipPayments?.let { put("zip_payments", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesXf340f39e(
    block: InlineV1AccountsPostRequestFormCapabilitiesXf340f39e.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesXf340f39e =
    InlineV1AccountsPostRequestFormCapabilitiesXf340f39e.build(block)
