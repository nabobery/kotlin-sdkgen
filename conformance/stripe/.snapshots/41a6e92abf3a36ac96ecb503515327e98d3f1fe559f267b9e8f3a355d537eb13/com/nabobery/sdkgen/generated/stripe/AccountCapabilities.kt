package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_capabilities
 */
@Serializable(with = AccountCapabilities.Serializer::class)
public class AccountCapabilities(
  /**
   * The status of the Canadian pre-authorized debits payments capability of the account, or whether the account can
   * directly process Canadian pre-authorized debits charges.
   */
  public val acssDebitPayments: InlineAccountCapabilitiesAcssDebitPaymentsX9230943b? = null,
  /**
   * The status of the Affirm capability of the account, or whether the account can directly process Affirm charges.
   */
  public val affirmPayments: InlineAccountCapabilitiesAffirmPaymentsX27b94e41? = null,
  /**
   * The status of the Afterpay Clearpay capability of the account, or whether the account can directly process Afterpay
   * Clearpay charges.
   */
  public val afterpayClearpayPayments:
      InlineAccountCapabilitiesAfterpayClearpayPaymentsXb5295fb7? = null,
  /**
   * The status of the Alma capability of the account, or whether the account can directly process Alma payments.
   */
  public val almaPayments: InlineAccountCapabilitiesAlmaPaymentsXf85c336d? = null,
  /**
   * The status of the AmazonPay capability of the account, or whether the account can directly process AmazonPay
   * payments.
   */
  public val amazonPayPayments: InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d? = null,
  /**
   * The status of the `app_distribution` capability of the account, or whether the platform can distribute apps to
   * other accounts.
   */
  public val appDistribution: InlineAccountCapabilitiesAppDistributionX29b556d0? = null,
  /**
   * The status of the BECS Direct Debit (AU) payments capability of the account, or whether the account can directly
   * process BECS Direct Debit (AU) charges.
   */
  public val auBecsDebitPayments: InlineAccountCapabilitiesAuBecsDebitPaymentsXf2a0004f? = null,
  /**
   * The status of the Bacs Direct Debits payments capability of the account, or whether the account can directly
   * process Bacs Direct Debits charges.
   */
  public val bacsDebitPayments: InlineAccountCapabilitiesBacsDebitPaymentsX656445cd? = null,
  /**
   * The status of the Bancontact payments capability of the account, or whether the account can directly process
   * Bancontact charges.
   */
  public val bancontactPayments: InlineAccountCapabilitiesBancontactPaymentsXba86145d? = null,
  /**
   * The status of the customer_balance payments capability of the account, or whether the account can directly process
   * customer_balance charges.
   */
  public val bankTransferPayments: InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c? = null,
  /**
   * The status of the Billie capability of the account, or whether the account can directly process Billie payments.
   */
  public val billiePayments: InlineAccountCapabilitiesBilliePaymentsX11afbe60? = null,
  /**
   * The status of the Bizum capability of the account, or whether the account can directly process Bizum payments.
   */
  public val bizumPayments: InlineAccountCapabilitiesBizumPaymentsX8f9e0a66? = null,
  /**
   * The status of the blik payments capability of the account, or whether the account can directly process blik
   * charges.
   */
  public val blikPayments: InlineAccountCapabilitiesBlikPaymentsXccd9d2f2? = null,
  /**
   * The status of the boleto payments capability of the account, or whether the account can directly process boleto
   * charges.
   */
  public val boletoPayments: InlineAccountCapabilitiesBoletoPaymentsX12b24742? = null,
  /**
   * The status of the card issuing capability of the account, or whether you can use Issuing to distribute funds on
   * cards
   */
  public val cardIssuing: InlineAccountCapabilitiesCardIssuingX84b0d7d1? = null,
  /**
   * The status of the card payments capability of the account, or whether the account can directly process credit and
   * debit card charges.
   */
  public val cardPayments: InlineAccountCapabilitiesCardPaymentsX303e4dae? = null,
  /**
   * The status of the Cartes Bancaires payments capability of the account, or whether the account can directly process
   * Cartes Bancaires card charges in EUR currency.
   */
  public val cartesBancairesPayments:
      InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3? = null,
  /**
   * The status of the Cash App Pay capability of the account, or whether the account can directly process Cash App Pay
   * payments.
   */
  public val cashappPayments: InlineAccountCapabilitiesCashappPaymentsXf1cb2861? = null,
  /**
   * The status of the Crypto capability of the account, or whether the account can directly process Crypto payments.
   */
  public val cryptoPayments: InlineAccountCapabilitiesCryptoPaymentsXa11984a6? = null,
  /**
   * The status of the EPS payments capability of the account, or whether the account can directly process EPS charges.
   */
  public val epsPayments: InlineAccountCapabilitiesEpsPaymentsX4ad26a74? = null,
  /**
   * The status of the FPX payments capability of the account, or whether the account can directly process FPX charges.
   */
  public val fpxPayments: InlineAccountCapabilitiesFpxPaymentsX8ac2b899? = null,
  /**
   * The status of the GB customer_balance payments (GBP currency) capability of the account, or whether the account can
   * directly process GB customer_balance charges.
   */
  public val gbBankTransferPayments:
      InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067? = null,
  /**
   * The status of the giropay payments capability of the account, or whether the account can directly process giropay
   * charges.
   */
  public val giropayPayments: InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e? = null,
  /**
   * The status of the GrabPay payments capability of the account, or whether the account can directly process GrabPay
   * charges.
   */
  public val grabpayPayments: InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c? = null,
  /**
   * The status of the iDEAL payments capability of the account, or whether the account can directly process iDEAL
   * charges.
   */
  public val idealPayments: InlineAccountCapabilitiesIdealPaymentsXbb683bd9? = null,
  /**
   * The status of the india_international_payments capability of the account, or whether the account can process
   * international charges (non INR) in India.
   */
  public val indiaInternationalPayments:
      InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58? = null,
  /**
   * The status of the JCB payments capability of the account, or whether the account (Japan only) can directly process
   * JCB credit card charges in JPY currency.
   */
  public val jcbPayments: InlineAccountCapabilitiesJcbPaymentsXce99a2f0? = null,
  /**
   * The status of the Japanese customer_balance payments (JPY currency) capability of the account, or whether the
   * account can directly process Japanese customer_balance charges.
   */
  public val jpBankTransferPayments:
      InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54? = null,
  /**
   * The status of the KakaoPay capability of the account, or whether the account can directly process KakaoPay
   * payments.
   */
  public val kakaoPayPayments: InlineAccountCapabilitiesKakaoPayPaymentsXc2958402? = null,
  /**
   * The status of the Klarna payments capability of the account, or whether the account can directly process Klarna
   * charges.
   */
  public val klarnaPayments: InlineAccountCapabilitiesKlarnaPaymentsX12f964c5? = null,
  /**
   * The status of the konbini payments capability of the account, or whether the account can directly process konbini
   * charges.
   */
  public val konbiniPayments: InlineAccountCapabilitiesKonbiniPaymentsXae40db25? = null,
  /**
   * The status of the KrCard capability of the account, or whether the account can directly process KrCard payments.
   */
  public val krCardPayments: InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e? = null,
  /**
   * The status of the legacy payments capability of the account.
   */
  public val legacyPayments: InlineAccountCapabilitiesLegacyPaymentsX98086295? = null,
  /**
   * The status of the link_payments capability of the account, or whether the account can directly process Link
   * charges.
   */
  public val linkPayments: InlineAccountCapabilitiesLinkPaymentsXfb58cb1a? = null,
  /**
   * The status of the MB WAY payments capability of the account, or whether the account can directly process MB WAY
   * charges.
   */
  public val mbWayPayments: InlineAccountCapabilitiesMbWayPaymentsX82cdbce6? = null,
  /**
   * The status of the MobilePay capability of the account, or whether the account can directly process MobilePay
   * charges.
   */
  public val mobilepayPayments: InlineAccountCapabilitiesMobilepayPaymentsXb3763aad? = null,
  /**
   * The status of the Multibanco payments capability of the account, or whether the account can directly process
   * Multibanco charges.
   */
  public val multibancoPayments: InlineAccountCapabilitiesMultibancoPaymentsX9247b418? = null,
  /**
   * The status of the Mexican customer_balance payments (MXN currency) capability of the account, or whether the
   * account can directly process Mexican customer_balance charges.
   */
  public val mxBankTransferPayments:
      InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982? = null,
  /**
   * The status of the NaverPay capability of the account, or whether the account can directly process NaverPay
   * payments.
   */
  public val naverPayPayments: InlineAccountCapabilitiesNaverPayPaymentsX4d152196? = null,
  /**
   * The status of the New Zealand BECS Direct Debit payments capability of the account, or whether the account can
   * directly process New Zealand BECS Direct Debit charges.
   */
  public val nzBankAccountBecsDebitPayments:
      InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848? = null,
  /**
   * The status of the OXXO payments capability of the account, or whether the account can directly process OXXO
   * charges.
   */
  public val oxxoPayments: InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b? = null,
  /**
   * The status of the P24 payments capability of the account, or whether the account can directly process P24 charges.
   */
  public val p24Payments: InlineAccountCapabilitiesP24PaymentsXe9b36672? = null,
  /**
   * The status of the pay_by_bank payments capability of the account, or whether the account can directly process
   * pay_by_bank charges.
   */
  public val payByBankPayments: InlineAccountCapabilitiesPayByBankPaymentsX093ea529? = null,
  /**
   * The status of the Payco capability of the account, or whether the account can directly process Payco payments.
   */
  public val paycoPayments: InlineAccountCapabilitiesPaycoPaymentsX7855c286? = null,
  /**
   * The status of the paynow payments capability of the account, or whether the account can directly process paynow
   * charges.
   */
  public val paynowPayments: InlineAccountCapabilitiesPaynowPaymentsXdce3eda9? = null,
  /**
   * The status of the PayTo capability of the account, or whether the account can directly process PayTo charges.
   */
  public val paytoPayments: InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa? = null,
  /**
   * The status of the pix payments capability of the account, or whether the account can directly process pix charges.
   */
  public val pixPayments: InlineAccountCapabilitiesPixPaymentsXac0ef8e1? = null,
  /**
   * The status of the promptpay payments capability of the account, or whether the account can directly process
   * promptpay charges.
   */
  public val promptpayPayments: InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff? = null,
  /**
   * The status of the RevolutPay capability of the account, or whether the account can directly process RevolutPay
   * payments.
   */
  public val revolutPayPayments: InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94? = null,
  /**
   * The status of the SamsungPay capability of the account, or whether the account can directly process SamsungPay
   * payments.
   */
  public val samsungPayPayments: InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902? = null,
  /**
   * The status of the Satispay capability of the account, or whether the account can directly process Satispay
   * payments.
   */
  public val satispayPayments: InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80? = null,
  /**
   * The status of the Scalapay capability of the account, or whether the account can directly process Scalapay
   * payments.
   */
  public val scalapayPayments: InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4? = null,
  /**
   * The status of the SEPA customer_balance payments (EUR currency) capability of the account, or whether the account
   * can directly process SEPA customer_balance charges.
   */
  public val sepaBankTransferPayments:
      InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e? = null,
  /**
   * The status of the SEPA Direct Debits payments capability of the account, or whether the account can directly
   * process SEPA Direct Debits charges.
   */
  public val sepaDebitPayments: InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f? = null,
  /**
   * The status of the Sofort payments capability of the account, or whether the account can directly process Sofort
   * charges.
   */
  public val sofortPayments: InlineAccountCapabilitiesSofortPaymentsX833a4c46? = null,
  /**
   * The status of the Sunbit capability of the account, or whether the account can directly process Sunbit payments.
   */
  public val sunbitPayments: InlineAccountCapabilitiesSunbitPaymentsX2f50af72? = null,
  /**
   * The status of the Swish capability of the account, or whether the account can directly process Swish payments.
   */
  public val swishPayments: InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd? = null,
  /**
   * The status of the tax reporting 1099-K (US) capability of the account.
   */
  public val taxReportingUs1099K: InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9? = null,
  /**
   * The status of the tax reporting 1099-MISC (US) capability of the account.
   */
  public val taxReportingUs1099Misc:
      InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4? = null,
  /**
   * The status of the transfers capability of the account, or whether your platform can transfer funds to the account.
   */
  public val transfers: InlineAccountCapabilitiesTransfersXf1e84c29? = null,
  /**
   * The status of the banking capability, or whether the account can have bank accounts.
   */
  public val treasury: InlineAccountCapabilitiesTreasuryX4b955612? = null,
  /**
   * The status of the TWINT capability of the account, or whether the account can directly process TWINT charges.
   */
  public val twintPayments: InlineAccountCapabilitiesTwintPaymentsXa9dbfff6? = null,
  /**
   * The status of the upi payments capability of the account, or whether the account can directly process upi charges.
   */
  public val upiPayments: InlineAccountCapabilitiesUpiPaymentsXaa0dc75d? = null,
  /**
   * The status of the US bank account ACH payments capability of the account, or whether the account can directly
   * process US bank account charges.
   */
  public val usBankAccountAchPayments:
      InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee? = null,
  /**
   * The status of the US customer_balance payments (USD currency) capability of the account, or whether the account can
   * directly process US customer_balance charges.
   */
  public val usBankTransferPayments:
      InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834? = null,
  /**
   * The status of the Zip capability of the account, or whether the account can directly process Zip charges.
   */
  public val zipPayments: InlineAccountCapabilitiesZipPaymentsXbb9872a8? = null,
) {
  public class Builder {
    /**
     * The status of the Canadian pre-authorized debits payments capability of the account, or whether the account can
     * directly process Canadian pre-authorized debits charges.
     */
    public var acssDebitPayments: InlineAccountCapabilitiesAcssDebitPaymentsX9230943b? = null

    /**
     * The status of the Affirm capability of the account, or whether the account can directly process Affirm charges.
     */
    public var affirmPayments: InlineAccountCapabilitiesAffirmPaymentsX27b94e41? = null

    /**
     * The status of the Afterpay Clearpay capability of the account, or whether the account can directly process
     * Afterpay Clearpay charges.
     */
    public var afterpayClearpayPayments: InlineAccountCapabilitiesAfterpayClearpayPaymentsXb5295fb7?
        = null

    /**
     * The status of the Alma capability of the account, or whether the account can directly process Alma payments.
     */
    public var almaPayments: InlineAccountCapabilitiesAlmaPaymentsXf85c336d? = null

    /**
     * The status of the AmazonPay capability of the account, or whether the account can directly process AmazonPay
     * payments.
     */
    public var amazonPayPayments: InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d? = null

    /**
     * The status of the `app_distribution` capability of the account, or whether the platform can distribute apps to
     * other accounts.
     */
    public var appDistribution: InlineAccountCapabilitiesAppDistributionX29b556d0? = null

    /**
     * The status of the BECS Direct Debit (AU) payments capability of the account, or whether the account can directly
     * process BECS Direct Debit (AU) charges.
     */
    public var auBecsDebitPayments: InlineAccountCapabilitiesAuBecsDebitPaymentsXf2a0004f? = null

    /**
     * The status of the Bacs Direct Debits payments capability of the account, or whether the account can directly
     * process Bacs Direct Debits charges.
     */
    public var bacsDebitPayments: InlineAccountCapabilitiesBacsDebitPaymentsX656445cd? = null

    /**
     * The status of the Bancontact payments capability of the account, or whether the account can directly process
     * Bancontact charges.
     */
    public var bancontactPayments: InlineAccountCapabilitiesBancontactPaymentsXba86145d? = null

    /**
     * The status of the customer_balance payments capability of the account, or whether the account can directly
     * process customer_balance charges.
     */
    public var bankTransferPayments: InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c? = null

    /**
     * The status of the Billie capability of the account, or whether the account can directly process Billie payments.
     */
    public var billiePayments: InlineAccountCapabilitiesBilliePaymentsX11afbe60? = null

    /**
     * The status of the Bizum capability of the account, or whether the account can directly process Bizum payments.
     */
    public var bizumPayments: InlineAccountCapabilitiesBizumPaymentsX8f9e0a66? = null

    /**
     * The status of the blik payments capability of the account, or whether the account can directly process blik
     * charges.
     */
    public var blikPayments: InlineAccountCapabilitiesBlikPaymentsXccd9d2f2? = null

    /**
     * The status of the boleto payments capability of the account, or whether the account can directly process boleto
     * charges.
     */
    public var boletoPayments: InlineAccountCapabilitiesBoletoPaymentsX12b24742? = null

    /**
     * The status of the card issuing capability of the account, or whether you can use Issuing to distribute funds on
     * cards
     */
    public var cardIssuing: InlineAccountCapabilitiesCardIssuingX84b0d7d1? = null

    /**
     * The status of the card payments capability of the account, or whether the account can directly process credit and
     * debit card charges.
     */
    public var cardPayments: InlineAccountCapabilitiesCardPaymentsX303e4dae? = null

    /**
     * The status of the Cartes Bancaires payments capability of the account, or whether the account can directly
     * process Cartes Bancaires card charges in EUR currency.
     */
    public var cartesBancairesPayments: InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3? =
        null

    /**
     * The status of the Cash App Pay capability of the account, or whether the account can directly process Cash App
     * Pay payments.
     */
    public var cashappPayments: InlineAccountCapabilitiesCashappPaymentsXf1cb2861? = null

    /**
     * The status of the Crypto capability of the account, or whether the account can directly process Crypto payments.
     */
    public var cryptoPayments: InlineAccountCapabilitiesCryptoPaymentsXa11984a6? = null

    /**
     * The status of the EPS payments capability of the account, or whether the account can directly process EPS
     * charges.
     */
    public var epsPayments: InlineAccountCapabilitiesEpsPaymentsX4ad26a74? = null

    /**
     * The status of the FPX payments capability of the account, or whether the account can directly process FPX
     * charges.
     */
    public var fpxPayments: InlineAccountCapabilitiesFpxPaymentsX8ac2b899? = null

    /**
     * The status of the GB customer_balance payments (GBP currency) capability of the account, or whether the account
     * can directly process GB customer_balance charges.
     */
    public var gbBankTransferPayments: InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067? =
        null

    /**
     * The status of the giropay payments capability of the account, or whether the account can directly process giropay
     * charges.
     */
    public var giropayPayments: InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e? = null

    /**
     * The status of the GrabPay payments capability of the account, or whether the account can directly process GrabPay
     * charges.
     */
    public var grabpayPayments: InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c? = null

    /**
     * The status of the iDEAL payments capability of the account, or whether the account can directly process iDEAL
     * charges.
     */
    public var idealPayments: InlineAccountCapabilitiesIdealPaymentsXbb683bd9? = null

    /**
     * The status of the india_international_payments capability of the account, or whether the account can process
     * international charges (non INR) in India.
     */
    public var indiaInternationalPayments:
        InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58? = null

    /**
     * The status of the JCB payments capability of the account, or whether the account (Japan only) can directly
     * process JCB credit card charges in JPY currency.
     */
    public var jcbPayments: InlineAccountCapabilitiesJcbPaymentsXce99a2f0? = null

    /**
     * The status of the Japanese customer_balance payments (JPY currency) capability of the account, or whether the
     * account can directly process Japanese customer_balance charges.
     */
    public var jpBankTransferPayments: InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54? =
        null

    /**
     * The status of the KakaoPay capability of the account, or whether the account can directly process KakaoPay
     * payments.
     */
    public var kakaoPayPayments: InlineAccountCapabilitiesKakaoPayPaymentsXc2958402? = null

    /**
     * The status of the Klarna payments capability of the account, or whether the account can directly process Klarna
     * charges.
     */
    public var klarnaPayments: InlineAccountCapabilitiesKlarnaPaymentsX12f964c5? = null

    /**
     * The status of the konbini payments capability of the account, or whether the account can directly process konbini
     * charges.
     */
    public var konbiniPayments: InlineAccountCapabilitiesKonbiniPaymentsXae40db25? = null

    /**
     * The status of the KrCard capability of the account, or whether the account can directly process KrCard payments.
     */
    public var krCardPayments: InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e? = null

    /**
     * The status of the legacy payments capability of the account.
     */
    public var legacyPayments: InlineAccountCapabilitiesLegacyPaymentsX98086295? = null

    /**
     * The status of the link_payments capability of the account, or whether the account can directly process Link
     * charges.
     */
    public var linkPayments: InlineAccountCapabilitiesLinkPaymentsXfb58cb1a? = null

    /**
     * The status of the MB WAY payments capability of the account, or whether the account can directly process MB WAY
     * charges.
     */
    public var mbWayPayments: InlineAccountCapabilitiesMbWayPaymentsX82cdbce6? = null

    /**
     * The status of the MobilePay capability of the account, or whether the account can directly process MobilePay
     * charges.
     */
    public var mobilepayPayments: InlineAccountCapabilitiesMobilepayPaymentsXb3763aad? = null

    /**
     * The status of the Multibanco payments capability of the account, or whether the account can directly process
     * Multibanco charges.
     */
    public var multibancoPayments: InlineAccountCapabilitiesMultibancoPaymentsX9247b418? = null

    /**
     * The status of the Mexican customer_balance payments (MXN currency) capability of the account, or whether the
     * account can directly process Mexican customer_balance charges.
     */
    public var mxBankTransferPayments: InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982? =
        null

    /**
     * The status of the NaverPay capability of the account, or whether the account can directly process NaverPay
     * payments.
     */
    public var naverPayPayments: InlineAccountCapabilitiesNaverPayPaymentsX4d152196? = null

    /**
     * The status of the New Zealand BECS Direct Debit payments capability of the account, or whether the account can
     * directly process New Zealand BECS Direct Debit charges.
     */
    public var nzBankAccountBecsDebitPayments:
        InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848? = null

    /**
     * The status of the OXXO payments capability of the account, or whether the account can directly process OXXO
     * charges.
     */
    public var oxxoPayments: InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b? = null

    /**
     * The status of the P24 payments capability of the account, or whether the account can directly process P24
     * charges.
     */
    public var p24Payments: InlineAccountCapabilitiesP24PaymentsXe9b36672? = null

    /**
     * The status of the pay_by_bank payments capability of the account, or whether the account can directly process
     * pay_by_bank charges.
     */
    public var payByBankPayments: InlineAccountCapabilitiesPayByBankPaymentsX093ea529? = null

    /**
     * The status of the Payco capability of the account, or whether the account can directly process Payco payments.
     */
    public var paycoPayments: InlineAccountCapabilitiesPaycoPaymentsX7855c286? = null

    /**
     * The status of the paynow payments capability of the account, or whether the account can directly process paynow
     * charges.
     */
    public var paynowPayments: InlineAccountCapabilitiesPaynowPaymentsXdce3eda9? = null

    /**
     * The status of the PayTo capability of the account, or whether the account can directly process PayTo charges.
     */
    public var paytoPayments: InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa? = null

    /**
     * The status of the pix payments capability of the account, or whether the account can directly process pix
     * charges.
     */
    public var pixPayments: InlineAccountCapabilitiesPixPaymentsXac0ef8e1? = null

    /**
     * The status of the promptpay payments capability of the account, or whether the account can directly process
     * promptpay charges.
     */
    public var promptpayPayments: InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff? = null

    /**
     * The status of the RevolutPay capability of the account, or whether the account can directly process RevolutPay
     * payments.
     */
    public var revolutPayPayments: InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94? = null

    /**
     * The status of the SamsungPay capability of the account, or whether the account can directly process SamsungPay
     * payments.
     */
    public var samsungPayPayments: InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902? = null

    /**
     * The status of the Satispay capability of the account, or whether the account can directly process Satispay
     * payments.
     */
    public var satispayPayments: InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80? = null

    /**
     * The status of the Scalapay capability of the account, or whether the account can directly process Scalapay
     * payments.
     */
    public var scalapayPayments: InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4? = null

    /**
     * The status of the SEPA customer_balance payments (EUR currency) capability of the account, or whether the account
     * can directly process SEPA customer_balance charges.
     */
    public var sepaBankTransferPayments: InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e?
        = null

    /**
     * The status of the SEPA Direct Debits payments capability of the account, or whether the account can directly
     * process SEPA Direct Debits charges.
     */
    public var sepaDebitPayments: InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f? = null

    /**
     * The status of the Sofort payments capability of the account, or whether the account can directly process Sofort
     * charges.
     */
    public var sofortPayments: InlineAccountCapabilitiesSofortPaymentsX833a4c46? = null

    /**
     * The status of the Sunbit capability of the account, or whether the account can directly process Sunbit payments.
     */
    public var sunbitPayments: InlineAccountCapabilitiesSunbitPaymentsX2f50af72? = null

    /**
     * The status of the Swish capability of the account, or whether the account can directly process Swish payments.
     */
    public var swishPayments: InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd? = null

    /**
     * The status of the tax reporting 1099-K (US) capability of the account.
     */
    public var taxReportingUs1099K: InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9? = null

    /**
     * The status of the tax reporting 1099-MISC (US) capability of the account.
     */
    public var taxReportingUs1099Misc: InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4? =
        null

    /**
     * The status of the transfers capability of the account, or whether your platform can transfer funds to the
     * account.
     */
    public var transfers: InlineAccountCapabilitiesTransfersXf1e84c29? = null

    /**
     * The status of the banking capability, or whether the account can have bank accounts.
     */
    public var treasury: InlineAccountCapabilitiesTreasuryX4b955612? = null

    /**
     * The status of the TWINT capability of the account, or whether the account can directly process TWINT charges.
     */
    public var twintPayments: InlineAccountCapabilitiesTwintPaymentsXa9dbfff6? = null

    /**
     * The status of the upi payments capability of the account, or whether the account can directly process upi
     * charges.
     */
    public var upiPayments: InlineAccountCapabilitiesUpiPaymentsXaa0dc75d? = null

    /**
     * The status of the US bank account ACH payments capability of the account, or whether the account can directly
     * process US bank account charges.
     */
    public var usBankAccountAchPayments: InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee?
        = null

    /**
     * The status of the US customer_balance payments (USD currency) capability of the account, or whether the account
     * can directly process US customer_balance charges.
     */
    public var usBankTransferPayments: InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834? =
        null

    /**
     * The status of the Zip capability of the account, or whether the account can directly process Zip charges.
     */
    public var zipPayments: InlineAccountCapabilitiesZipPaymentsXbb9872a8? = null

    public fun build(): AccountCapabilities = AccountCapabilities(
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
    public fun build(block: Builder.() -> Unit): AccountCapabilities = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountCapabilities> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountCapabilities {
      val jsonDecoder = decoder.requireJsonDecoder("AccountCapabilities")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountCapabilities must be a JSON object")
      return AccountCapabilities(
        acssDebitPayments = rawObject["acss_debit_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesAcssDebitPaymentsX9230943b>(it) },
        affirmPayments = rawObject["affirm_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesAffirmPaymentsX27b94e41>(it) },
        afterpayClearpayPayments = rawObject["afterpay_clearpay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesAfterpayClearpayPaymentsXb5295fb7>(it) },
        almaPayments = rawObject["alma_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesAlmaPaymentsXf85c336d>(it) },
        amazonPayPayments = rawObject["amazon_pay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesAmazonPayPaymentsXefe1641d>(it) },
        appDistribution = rawObject["app_distribution"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesAppDistributionX29b556d0>(it) },
        auBecsDebitPayments = rawObject["au_becs_debit_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesAuBecsDebitPaymentsXf2a0004f>(it) },
        bacsDebitPayments = rawObject["bacs_debit_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesBacsDebitPaymentsX656445cd>(it) },
        bancontactPayments = rawObject["bancontact_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesBancontactPaymentsXba86145d>(it) },
        bankTransferPayments = rawObject["bank_transfer_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesBankTransferPaymentsX22b0b51c>(it) },
        billiePayments = rawObject["billie_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesBilliePaymentsX11afbe60>(it) },
        bizumPayments = rawObject["bizum_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesBizumPaymentsX8f9e0a66>(it) },
        blikPayments = rawObject["blik_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesBlikPaymentsXccd9d2f2>(it) },
        boletoPayments = rawObject["boleto_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesBoletoPaymentsX12b24742>(it) },
        cardIssuing = rawObject["card_issuing"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesCardIssuingX84b0d7d1>(it) },
        cardPayments = rawObject["card_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesCardPaymentsX303e4dae>(it) },
        cartesBancairesPayments = rawObject["cartes_bancaires_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesCartesBancairesPaymentsX839701e3>(it) },
        cashappPayments = rawObject["cashapp_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesCashappPaymentsXf1cb2861>(it) },
        cryptoPayments = rawObject["crypto_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesCryptoPaymentsXa11984a6>(it) },
        epsPayments = rawObject["eps_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesEpsPaymentsX4ad26a74>(it) },
        fpxPayments = rawObject["fpx_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesFpxPaymentsX8ac2b899>(it) },
        gbBankTransferPayments = rawObject["gb_bank_transfer_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesGbBankTransferPaymentsX277a5067>(it) },
        giropayPayments = rawObject["giropay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesGiropayPaymentsX9c3ada7e>(it) },
        grabpayPayments = rawObject["grabpay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesGrabpayPaymentsX4fe9238c>(it) },
        idealPayments = rawObject["ideal_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesIdealPaymentsXbb683bd9>(it) },
        indiaInternationalPayments = rawObject["india_international_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesIndiaInternationalPaymentsX739ccc58>(it) },
        jcbPayments = rawObject["jcb_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesJcbPaymentsXce99a2f0>(it) },
        jpBankTransferPayments = rawObject["jp_bank_transfer_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesJpBankTransferPaymentsXf08aab54>(it) },
        kakaoPayPayments = rawObject["kakao_pay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesKakaoPayPaymentsXc2958402>(it) },
        klarnaPayments = rawObject["klarna_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesKlarnaPaymentsX12f964c5>(it) },
        konbiniPayments = rawObject["konbini_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesKonbiniPaymentsXae40db25>(it) },
        krCardPayments = rawObject["kr_card_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesKrCardPaymentsXe49dbe6e>(it) },
        legacyPayments = rawObject["legacy_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesLegacyPaymentsX98086295>(it) },
        linkPayments = rawObject["link_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesLinkPaymentsXfb58cb1a>(it) },
        mbWayPayments = rawObject["mb_way_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesMbWayPaymentsX82cdbce6>(it) },
        mobilepayPayments = rawObject["mobilepay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesMobilepayPaymentsXb3763aad>(it) },
        multibancoPayments = rawObject["multibanco_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesMultibancoPaymentsX9247b418>(it) },
        mxBankTransferPayments = rawObject["mx_bank_transfer_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesMxBankTransferPaymentsX2a9ab982>(it) },
        naverPayPayments = rawObject["naver_pay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesNaverPayPaymentsX4d152196>(it) },
        nzBankAccountBecsDebitPayments = rawObject["nz_bank_account_becs_debit_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesNzBankAccountBecsDebitPaymentsX3e997848>(it) },
        oxxoPayments = rawObject["oxxo_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesOxxoPaymentsX1aa67b0b>(it) },
        p24Payments = rawObject["p24_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesP24PaymentsXe9b36672>(it) },
        payByBankPayments = rawObject["pay_by_bank_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesPayByBankPaymentsX093ea529>(it) },
        paycoPayments = rawObject["payco_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesPaycoPaymentsX7855c286>(it) },
        paynowPayments = rawObject["paynow_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesPaynowPaymentsXdce3eda9>(it) },
        paytoPayments = rawObject["payto_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesPaytoPaymentsX7aefdcaa>(it) },
        pixPayments = rawObject["pix_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesPixPaymentsXac0ef8e1>(it) },
        promptpayPayments = rawObject["promptpay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesPromptpayPaymentsX63eae3ff>(it) },
        revolutPayPayments = rawObject["revolut_pay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesRevolutPayPaymentsX26d4ac94>(it) },
        samsungPayPayments = rawObject["samsung_pay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesSamsungPayPaymentsXe41ba902>(it) },
        satispayPayments = rawObject["satispay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesSatispayPaymentsXdb5d9f80>(it) },
        scalapayPayments = rawObject["scalapay_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesScalapayPaymentsX3cd8a7f4>(it) },
        sepaBankTransferPayments = rawObject["sepa_bank_transfer_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesSepaBankTransferPaymentsX9cfc437e>(it) },
        sepaDebitPayments = rawObject["sepa_debit_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesSepaDebitPaymentsX2c568d4f>(it) },
        sofortPayments = rawObject["sofort_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesSofortPaymentsX833a4c46>(it) },
        sunbitPayments = rawObject["sunbit_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesSunbitPaymentsX2f50af72>(it) },
        swishPayments = rawObject["swish_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesSwishPaymentsX7f4ed8cd>(it) },
        taxReportingUs1099K = rawObject["tax_reporting_us_1099_k"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesTaxReportingUs1099KXb46ba7e9>(it) },
        taxReportingUs1099Misc = rawObject["tax_reporting_us_1099_misc"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesTaxReportingUs1099MiscX0df3d0a4>(it) },
        transfers = rawObject["transfers"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesTransfersXf1e84c29>(it) },
        treasury = rawObject["treasury"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesTreasuryX4b955612>(it) },
        twintPayments = rawObject["twint_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesTwintPaymentsXa9dbfff6>(it) },
        upiPayments = rawObject["upi_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesUpiPaymentsXaa0dc75d>(it) },
        usBankAccountAchPayments = rawObject["us_bank_account_ach_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesUsBankAccountAchPaymentsXe23b6dee>(it) },
        usBankTransferPayments = rawObject["us_bank_transfer_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesUsBankTransferPaymentsXbbe78834>(it) },
        zipPayments = rawObject["zip_payments"]?.let { json.decodeFromJsonElement<InlineAccountCapabilitiesZipPaymentsXbb9872a8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountCapabilities) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountCapabilities")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acssDebitPayments?.let { put("acss_debit_payments", json.encodeToJsonElement(it)) }
        value.affirmPayments?.let { put("affirm_payments", json.encodeToJsonElement(it)) }
        value.afterpayClearpayPayments?.let { put("afterpay_clearpay_payments", json.encodeToJsonElement(it)) }
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
        value.cartesBancairesPayments?.let { put("cartes_bancaires_payments", json.encodeToJsonElement(it)) }
        value.cashappPayments?.let { put("cashapp_payments", json.encodeToJsonElement(it)) }
        value.cryptoPayments?.let { put("crypto_payments", json.encodeToJsonElement(it)) }
        value.epsPayments?.let { put("eps_payments", json.encodeToJsonElement(it)) }
        value.fpxPayments?.let { put("fpx_payments", json.encodeToJsonElement(it)) }
        value.gbBankTransferPayments?.let { put("gb_bank_transfer_payments", json.encodeToJsonElement(it)) }
        value.giropayPayments?.let { put("giropay_payments", json.encodeToJsonElement(it)) }
        value.grabpayPayments?.let { put("grabpay_payments", json.encodeToJsonElement(it)) }
        value.idealPayments?.let { put("ideal_payments", json.encodeToJsonElement(it)) }
        value.indiaInternationalPayments?.let { put("india_international_payments", json.encodeToJsonElement(it)) }
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
        value.nzBankAccountBecsDebitPayments?.let { put("nz_bank_account_becs_debit_payments", json.encodeToJsonElement(it)) }
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
        value.sepaBankTransferPayments?.let { put("sepa_bank_transfer_payments", json.encodeToJsonElement(it)) }
        value.sepaDebitPayments?.let { put("sepa_debit_payments", json.encodeToJsonElement(it)) }
        value.sofortPayments?.let { put("sofort_payments", json.encodeToJsonElement(it)) }
        value.sunbitPayments?.let { put("sunbit_payments", json.encodeToJsonElement(it)) }
        value.swishPayments?.let { put("swish_payments", json.encodeToJsonElement(it)) }
        value.taxReportingUs1099K?.let { put("tax_reporting_us_1099_k", json.encodeToJsonElement(it)) }
        value.taxReportingUs1099Misc?.let { put("tax_reporting_us_1099_misc", json.encodeToJsonElement(it)) }
        value.transfers?.let { put("transfers", json.encodeToJsonElement(it)) }
        value.treasury?.let { put("treasury", json.encodeToJsonElement(it)) }
        value.twintPayments?.let { put("twint_payments", json.encodeToJsonElement(it)) }
        value.upiPayments?.let { put("upi_payments", json.encodeToJsonElement(it)) }
        value.usBankAccountAchPayments?.let { put("us_bank_account_ach_payments", json.encodeToJsonElement(it)) }
        value.usBankTransferPayments?.let { put("us_bank_transfer_payments", json.encodeToJsonElement(it)) }
        value.zipPayments?.let { put("zip_payments", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountCapabilities(block: AccountCapabilities.Builder.() -> Unit): AccountCapabilities = AccountCapabilities.build(block)
