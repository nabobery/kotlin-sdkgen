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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e(
    public val acssDebitPayments: InlineV1AccountsPostRequestFormCapabilitiesAcssDebitPaymentsX1623dcc7? = null,
    public val affirmPayments: InlineV1AccountsPostRequestFormCapabilitiesAffirmPaymentsX256980be? = null,
    public val afterpayClearpayPayments:
        InlineV1AccountsPostRequestFormCapabilitiesAfterpayClearpayPaymentsX4d3b7da9? = null,
    public val almaPayments: InlineV1AccountsPostRequestFormCapabilitiesAlmaPaymentsXe1c3036b? = null,
    public val amazonPayPayments: InlineV1AccountsPostRequestFormCapabilitiesAmazonPayPaymentsX6a456fef? = null,
    public val appDistribution: InlineV1AccountsPostRequestFormCapabilitiesAppDistributionXaa377c88? = null,
    public val auBecsDebitPayments: InlineV1AccountsPostRequestFormCapabilitiesAuBecsDebitPaymentsXe165e30c? = null,
    public val bacsDebitPayments: InlineV1AccountsPostRequestFormCapabilitiesBacsDebitPaymentsXe246c980? = null,
    public val bancontactPayments: InlineV1AccountsPostRequestFormCapabilitiesBancontactPaymentsX11889117? = null,
    public val bankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0? = null,
    public val billiePayments: InlineV1AccountsPostRequestFormCapabilitiesBilliePaymentsXc8d22aa1? = null,
    public val bizumPayments: InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXc415cc4e? = null,
    public val blikPayments: InlineV1AccountsPostRequestFormCapabilitiesBlikPaymentsXf5ff89c6? = null,
    public val boletoPayments: InlineV1AccountsPostRequestFormCapabilitiesBoletoPaymentsX9c195d50? = null,
    public val cardIssuing: InlineV1AccountsPostRequestFormCapabilitiesCardIssuingX9be954ad? = null,
    public val cardPayments: InlineV1AccountsPostRequestFormCapabilitiesCardPaymentsX561aec6f? = null,
    public val cartesBancairesPayments:
        InlineV1AccountsPostRequestFormCapabilitiesCartesBancairesPaymentsX03f2b845? = null,
    public val cashappPayments: InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b? = null,
    public val cryptoPayments: InlineV1AccountsPostRequestFormCapabilitiesCryptoPaymentsXb04ff1ec? = null,
    public val epsPayments: InlineV1AccountsPostRequestFormCapabilitiesEpsPaymentsX9760b813? = null,
    public val fpxPayments: InlineV1AccountsPostRequestFormCapabilitiesFpxPaymentsX92cd28b3? = null,
    public val gbBankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesGbBankTransferPaymentsX380fc838? = null,
    public val giropayPayments: InlineV1AccountsPostRequestFormCapabilitiesGiropayPaymentsXe077bd0c? = null,
    public val grabpayPayments: InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXa7bd7322? = null,
    public val idealPayments: InlineV1AccountsPostRequestFormCapabilitiesIdealPaymentsXf829ce96? = null,
    public val indiaInternationalPayments:
        InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930? = null,
    public val jcbPayments: InlineV1AccountsPostRequestFormCapabilitiesJcbPaymentsX9c20d6d4? = null,
    public val jpBankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesJpBankTransferPaymentsX43dcebec? = null,
    public val kakaoPayPayments: InlineV1AccountsPostRequestFormCapabilitiesKakaoPayPaymentsX931b29ff? = null,
    public val klarnaPayments: InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX57189c5d? = null,
    public val konbiniPayments: InlineV1AccountsPostRequestFormCapabilitiesKonbiniPaymentsX8f4f3073? = null,
    public val krCardPayments: InlineV1AccountsPostRequestFormCapabilitiesKrCardPaymentsX1f7e1459? = null,
    public val legacyPayments: InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX3e15fde5? = null,
    public val linkPayments: InlineV1AccountsPostRequestFormCapabilitiesLinkPaymentsXac4496f7? = null,
    public val mbWayPayments: InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c? = null,
    public val mobilepayPayments: InlineV1AccountsPostRequestFormCapabilitiesMobilepayPaymentsX20f65018? = null,
    public val multibancoPayments: InlineV1AccountsPostRequestFormCapabilitiesMultibancoPaymentsX1beb7b56? = null,
    public val mxBankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesMxBankTransferPaymentsX800e261d? = null,
    public val naverPayPayments: InlineV1AccountsPostRequestFormCapabilitiesNaverPayPaymentsXd105c462? = null,
    public val nzBankAccountBecsDebitPayments:
        InlineV1AccountsPostRequestFormCapabilitiesNzBankAccountBecsDebf2d0X4eac2b86? = null,
    public val oxxoPayments: InlineV1AccountsPostRequestFormCapabilitiesOxxoPaymentsX9a18bb6d? = null,
    public val p24Payments: InlineV1AccountsPostRequestFormCapabilitiesP24PaymentsX411bec04? = null,
    public val payByBankPayments: InlineV1AccountsPostRequestFormCapabilitiesPayByBankPaymentsX90952dc5? = null,
    public val paycoPayments: InlineV1AccountsPostRequestFormCapabilitiesPaycoPaymentsXe5fc30d5? = null,
    public val paynowPayments: InlineV1AccountsPostRequestFormCapabilitiesPaynowPaymentsX6fd2d9b9? = null,
    public val paytoPayments: InlineV1AccountsPostRequestFormCapabilitiesPaytoPaymentsXb34d8313? = null,
    public val pixPayments: InlineV1AccountsPostRequestFormCapabilitiesPixPaymentsX8ed85769? = null,
    public val promptpayPayments: InlineV1AccountsPostRequestFormCapabilitiesPromptpayPaymentsXbc3069f4? = null,
    public val revolutPayPayments: InlineV1AccountsPostRequestFormCapabilitiesRevolutPayPaymentsX967c2872? = null,
    public val samsungPayPayments: InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX2d08369f? = null,
    public val satispayPayments: InlineV1AccountsPostRequestFormCapabilitiesSatispayPaymentsX3b428cad? = null,
    public val scalapayPayments: InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e? = null,
    public val sepaBankTransferPayments:
        InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7? = null,
    public val sepaDebitPayments: InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa? = null,
    public val sofortPayments: InlineV1AccountsPostRequestFormCapabilitiesSofortPaymentsXf6bccc49? = null,
    public val sunbitPayments: InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXbc81da38? = null,
    public val swishPayments: InlineV1AccountsPostRequestFormCapabilitiesSwishPaymentsX86405c81? = null,
    public val taxReportingUs1099K: InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099KXf42c5fbd? = null,
    public val taxReportingUs1099Misc: InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX96b67f16? = null,
    public val transfers: InlineV1AccountsPostRequestFormCapabilitiesTransfersXe77a5a94? = null,
    public val treasury: InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b? = null,
    public val twintPayments: InlineV1AccountsPostRequestFormCapabilitiesTwintPaymentsX74d459fc? = null,
    public val upiPayments: InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef? = null,
    public val usBankAccountAchPayments:
        InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d? = null,
    public val usBankTransferPayments: InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf? = null,
    public val zipPayments: InlineV1AccountsPostRequestFormCapabilitiesZipPaymentsXe0ac6db6? = null,
) {
    public class Builder {
        public var acssDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesAcssDebitPaymentsX1623dcc7? = null

        public var affirmPayments: InlineV1AccountsPostRequestFormCapabilitiesAffirmPaymentsX256980be? =
            null

        public var afterpayClearpayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesAfterpayClearpayPaymentsX4d3b7da9? = null

        public var almaPayments: InlineV1AccountsPostRequestFormCapabilitiesAlmaPaymentsXe1c3036b? =
            null

        public var amazonPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesAmazonPayPaymentsX6a456fef? = null

        public var appDistribution: InlineV1AccountsPostRequestFormCapabilitiesAppDistributionXaa377c88? =
            null

        public var auBecsDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesAuBecsDebitPaymentsXe165e30c? = null

        public var bacsDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesBacsDebitPaymentsXe246c980? = null

        public var bancontactPayments:
            InlineV1AccountsPostRequestFormCapabilitiesBancontactPaymentsX11889117? = null

        public var bankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0? = null

        public var billiePayments: InlineV1AccountsPostRequestFormCapabilitiesBilliePaymentsXc8d22aa1? =
            null

        public var bizumPayments: InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXc415cc4e? =
            null

        public var blikPayments: InlineV1AccountsPostRequestFormCapabilitiesBlikPaymentsXf5ff89c6? =
            null

        public var boletoPayments: InlineV1AccountsPostRequestFormCapabilitiesBoletoPaymentsX9c195d50? =
            null

        public var cardIssuing: InlineV1AccountsPostRequestFormCapabilitiesCardIssuingX9be954ad? = null

        public var cardPayments: InlineV1AccountsPostRequestFormCapabilitiesCardPaymentsX561aec6f? =
            null

        public var cartesBancairesPayments:
            InlineV1AccountsPostRequestFormCapabilitiesCartesBancairesPaymentsX03f2b845? = null

        public var cashappPayments: InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b? =
            null

        public var cryptoPayments: InlineV1AccountsPostRequestFormCapabilitiesCryptoPaymentsXb04ff1ec? =
            null

        public var epsPayments: InlineV1AccountsPostRequestFormCapabilitiesEpsPaymentsX9760b813? = null

        public var fpxPayments: InlineV1AccountsPostRequestFormCapabilitiesFpxPaymentsX92cd28b3? = null

        public var gbBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesGbBankTransferPaymentsX380fc838? = null

        public var giropayPayments: InlineV1AccountsPostRequestFormCapabilitiesGiropayPaymentsXe077bd0c? =
            null

        public var grabpayPayments: InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXa7bd7322? =
            null

        public var idealPayments: InlineV1AccountsPostRequestFormCapabilitiesIdealPaymentsXf829ce96? =
            null

        public var indiaInternationalPayments:
            InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930? = null

        public var jcbPayments: InlineV1AccountsPostRequestFormCapabilitiesJcbPaymentsX9c20d6d4? = null

        public var jpBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesJpBankTransferPaymentsX43dcebec? = null

        public var kakaoPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesKakaoPayPaymentsX931b29ff? = null

        public var klarnaPayments: InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX57189c5d? =
            null

        public var konbiniPayments: InlineV1AccountsPostRequestFormCapabilitiesKonbiniPaymentsX8f4f3073? =
            null

        public var krCardPayments: InlineV1AccountsPostRequestFormCapabilitiesKrCardPaymentsX1f7e1459? =
            null

        public var legacyPayments: InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX3e15fde5? =
            null

        public var linkPayments: InlineV1AccountsPostRequestFormCapabilitiesLinkPaymentsXac4496f7? =
            null

        public var mbWayPayments: InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c? =
            null

        public var mobilepayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesMobilepayPaymentsX20f65018? = null

        public var multibancoPayments:
            InlineV1AccountsPostRequestFormCapabilitiesMultibancoPaymentsX1beb7b56? = null

        public var mxBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesMxBankTransferPaymentsX800e261d? = null

        public var naverPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesNaverPayPaymentsXd105c462? = null

        public var nzBankAccountBecsDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesNzBankAccountBecsDebf2d0X4eac2b86? = null

        public var oxxoPayments: InlineV1AccountsPostRequestFormCapabilitiesOxxoPaymentsX9a18bb6d? =
            null

        public var p24Payments: InlineV1AccountsPostRequestFormCapabilitiesP24PaymentsX411bec04? = null

        public var payByBankPayments:
            InlineV1AccountsPostRequestFormCapabilitiesPayByBankPaymentsX90952dc5? = null

        public var paycoPayments: InlineV1AccountsPostRequestFormCapabilitiesPaycoPaymentsXe5fc30d5? =
            null

        public var paynowPayments: InlineV1AccountsPostRequestFormCapabilitiesPaynowPaymentsX6fd2d9b9? =
            null

        public var paytoPayments: InlineV1AccountsPostRequestFormCapabilitiesPaytoPaymentsXb34d8313? =
            null

        public var pixPayments: InlineV1AccountsPostRequestFormCapabilitiesPixPaymentsX8ed85769? = null

        public var promptpayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesPromptpayPaymentsXbc3069f4? = null

        public var revolutPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesRevolutPayPaymentsX967c2872? = null

        public var samsungPayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX2d08369f? = null

        public var satispayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesSatispayPaymentsX3b428cad? = null

        public var scalapayPayments:
            InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e? = null

        public var sepaBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7? = null

        public var sepaDebitPayments:
            InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa? = null

        public var sofortPayments: InlineV1AccountsPostRequestFormCapabilitiesSofortPaymentsXf6bccc49? =
            null

        public var sunbitPayments: InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXbc81da38? =
            null

        public var swishPayments: InlineV1AccountsPostRequestFormCapabilitiesSwishPaymentsX86405c81? =
            null

        public var taxReportingUs1099K:
            InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099KXf42c5fbd? = null

        public var taxReportingUs1099Misc:
            InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX96b67f16? = null

        public var transfers: InlineV1AccountsPostRequestFormCapabilitiesTransfersXe77a5a94? = null

        public var treasury: InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b? = null

        public var twintPayments: InlineV1AccountsPostRequestFormCapabilitiesTwintPaymentsX74d459fc? =
            null

        public var upiPayments: InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef? = null

        public var usBankAccountAchPayments:
            InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d? = null

        public var usBankTransferPayments:
            InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf? = null

        public var zipPayments: InlineV1AccountsPostRequestFormCapabilitiesZipPaymentsXe0ac6db6? = null

        public fun build(): InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e =
            InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e(
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
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e(
                acssDebitPayments =
                    rawObject["acss_debit_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAcssDebitPaymentsX1623dcc7>(
                                it,
                            )
                    },
                affirmPayments =
                    rawObject["affirm_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAffirmPaymentsX256980be>(
                            it,
                        )
                    },
                afterpayClearpayPayments =
                    rawObject["afterpay_clearpay_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAfterpayClearpayPaymentsX4d3b7da9>(
                                it,
                            )
                    },
                almaPayments =
                    rawObject["alma_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAlmaPaymentsXe1c3036b>(it)
                    },
                amazonPayPayments =
                    rawObject["amazon_pay_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAmazonPayPaymentsX6a456fef>(
                                it,
                            )
                    },
                appDistribution =
                    rawObject["app_distribution"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAppDistributionXaa377c88>(
                            it,
                        )
                    },
                auBecsDebitPayments =
                    rawObject["au_becs_debit_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesAuBecsDebitPaymentsXe165e30c>(
                                it,
                            )
                    },
                bacsDebitPayments =
                    rawObject["bacs_debit_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBacsDebitPaymentsXe246c980>(
                                it,
                            )
                    },
                bancontactPayments =
                    rawObject["bancontact_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBancontactPaymentsX11889117>(
                                it,
                            )
                    },
                bankTransferPayments =
                    rawObject["bank_transfer_payments"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0>(
                                it,
                            )
                    },
                billiePayments =
                    rawObject["billie_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBilliePaymentsXc8d22aa1>(
                            it,
                        )
                    },
                bizumPayments =
                    rawObject["bizum_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBizumPaymentsXc415cc4e>(
                            it,
                        )
                    },
                blikPayments =
                    rawObject["blik_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBlikPaymentsXf5ff89c6>(it)
                    },
                boletoPayments =
                    rawObject["boleto_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesBoletoPaymentsX9c195d50>(
                            it,
                        )
                    },
                cardIssuing =
                    rawObject["card_issuing"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCardIssuingX9be954ad>(it)
                    },
                cardPayments =
                    rawObject["card_payments"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCardPaymentsX561aec6f>(it)
                    },
                cartesBancairesPayments =
                    rawObject["cartes_bancaires_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCartesBancairesPaymentsX03f2b845>(
                                    it,
                                )
                        },
                cashappPayments =
                    rawObject["cashapp_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b>(
                                    it,
                                )
                        },
                cryptoPayments =
                    rawObject["crypto_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesCryptoPaymentsXb04ff1ec>(
                                    it,
                                )
                        },
                epsPayments =
                    rawObject["eps_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesEpsPaymentsX9760b813>(
                                it,
                            )
                        },
                fpxPayments =
                    rawObject["fpx_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesFpxPaymentsX92cd28b3>(
                                it,
                            )
                        },
                gbBankTransferPayments =
                    rawObject["gb_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesGbBankTransferPaymentsX380fc838>(
                                    it,
                                )
                        },
                giropayPayments =
                    rawObject["giropay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesGiropayPaymentsXe077bd0c>(
                                    it,
                                )
                        },
                grabpayPayments =
                    rawObject["grabpay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXa7bd7322>(
                                    it,
                                )
                        },
                idealPayments =
                    rawObject["ideal_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesIdealPaymentsXf829ce96>(
                                    it,
                                )
                        },
                indiaInternationalPayments =
                    rawObject["india_international_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesIndiaInternationalPaymentsX83525930>(
                                    it,
                                )
                        },
                jcbPayments =
                    rawObject["jcb_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesJcbPaymentsX9c20d6d4>(
                                it,
                            )
                        },
                jpBankTransferPayments =
                    rawObject["jp_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesJpBankTransferPaymentsX43dcebec>(
                                    it,
                                )
                        },
                kakaoPayPayments =
                    rawObject["kakao_pay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesKakaoPayPaymentsX931b29ff>(
                                    it,
                                )
                        },
                klarnaPayments =
                    rawObject["klarna_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX57189c5d>(
                                    it,
                                )
                        },
                konbiniPayments =
                    rawObject["konbini_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesKonbiniPaymentsX8f4f3073>(
                                    it,
                                )
                        },
                krCardPayments =
                    rawObject["kr_card_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesKrCardPaymentsX1f7e1459>(
                                    it,
                                )
                        },
                legacyPayments =
                    rawObject["legacy_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesLegacyPaymentsX3e15fde5>(
                                    it,
                                )
                        },
                linkPayments =
                    rawObject["link_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesLinkPaymentsXac4496f7>(
                                    it,
                                )
                        },
                mbWayPayments =
                    rawObject["mb_way_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c>(
                                    it,
                                )
                        },
                mobilepayPayments =
                    rawObject["mobilepay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesMobilepayPaymentsX20f65018>(
                                    it,
                                )
                        },
                multibancoPayments =
                    rawObject["multibanco_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesMultibancoPaymentsX1beb7b56>(
                                    it,
                                )
                        },
                mxBankTransferPayments =
                    rawObject["mx_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesMxBankTransferPaymentsX800e261d>(
                                    it,
                                )
                        },
                naverPayPayments =
                    rawObject["naver_pay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesNaverPayPaymentsXd105c462>(
                                    it,
                                )
                        },
                nzBankAccountBecsDebitPayments =
                    rawObject["nz_bank_account_becs_debit_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesNzBankAccountBecsDebf2d0X4eac2b86>(
                                    it,
                                )
                        },
                oxxoPayments =
                    rawObject["oxxo_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesOxxoPaymentsX9a18bb6d>(
                                    it,
                                )
                        },
                p24Payments =
                    rawObject["p24_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesP24PaymentsX411bec04>(
                                it,
                            )
                        },
                payByBankPayments =
                    rawObject["pay_by_bank_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPayByBankPaymentsX90952dc5>(
                                    it,
                                )
                        },
                paycoPayments =
                    rawObject["payco_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPaycoPaymentsXe5fc30d5>(
                                    it,
                                )
                        },
                paynowPayments =
                    rawObject["paynow_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPaynowPaymentsX6fd2d9b9>(
                                    it,
                                )
                        },
                paytoPayments =
                    rawObject["payto_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPaytoPaymentsXb34d8313>(
                                    it,
                                )
                        },
                pixPayments =
                    rawObject["pix_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPixPaymentsX8ed85769>(
                                it,
                            )
                        },
                promptpayPayments =
                    rawObject["promptpay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesPromptpayPaymentsXbc3069f4>(
                                    it,
                                )
                        },
                revolutPayPayments =
                    rawObject["revolut_pay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesRevolutPayPaymentsX967c2872>(
                                    it,
                                )
                        },
                samsungPayPayments =
                    rawObject["samsung_pay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSamsungPayPaymentsX2d08369f>(
                                    it,
                                )
                        },
                satispayPayments =
                    rawObject["satispay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSatispayPaymentsX3b428cad>(
                                    it,
                                )
                        },
                scalapayPayments =
                    rawObject["scalapay_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e>(
                                    it,
                                )
                        },
                sepaBankTransferPayments =
                    rawObject["sepa_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSepaBankTransferPaymentsX83e48ff7>(
                                    it,
                                )
                        },
                sepaDebitPayments =
                    rawObject["sepa_debit_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa>(
                                    it,
                                )
                        },
                sofortPayments =
                    rawObject["sofort_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSofortPaymentsXf6bccc49>(
                                    it,
                                )
                        },
                sunbitPayments =
                    rawObject["sunbit_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSunbitPaymentsXbc81da38>(
                                    it,
                                )
                        },
                swishPayments =
                    rawObject["swish_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesSwishPaymentsX86405c81>(
                                    it,
                                )
                        },
                taxReportingUs1099K =
                    rawObject["tax_reporting_us_1099_k"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099KXf42c5fbd>(
                                    it,
                                )
                        },
                taxReportingUs1099Misc =
                    rawObject["tax_reporting_us_1099_misc"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTaxReportingUs1099MiscX96b67f16>(
                                    it,
                                )
                        },
                transfers =
                    rawObject["transfers"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTransfersXe77a5a94>(
                                it,
                            )
                        },
                treasury =
                    rawObject["treasury"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTreasuryX7cd7a96b>(it)
                        },
                twintPayments =
                    rawObject["twint_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesTwintPaymentsX74d459fc>(
                                    it,
                                )
                        },
                upiPayments =
                    rawObject["upi_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef>(
                                it,
                            )
                        },
                usBankAccountAchPayments =
                    rawObject["us_bank_account_ach_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesUsBankAccountAchPaymentsXf88de79d>(
                                    it,
                                )
                        },
                usBankTransferPayments =
                    rawObject["us_bank_transfer_payments"]
                        ?.let {
                            json
                                .decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesUsBankTransferPaymentsXe44a1faf>(
                                    it,
                                )
                        },
                zipPayments =
                    rawObject["zip_payments"]
                        ?.let {
                            json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCapabilitiesZipPaymentsXe0ac6db6>(
                                it,
                            )
                        },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e")
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

public fun inlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e(
    block: InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e =
    InlineV1AccountsPostRequestFormCapabilitiesX03ee7d3e.build(block)
