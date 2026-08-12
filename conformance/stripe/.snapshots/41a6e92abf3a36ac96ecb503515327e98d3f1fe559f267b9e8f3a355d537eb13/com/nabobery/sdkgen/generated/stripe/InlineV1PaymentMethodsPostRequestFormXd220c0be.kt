package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormXd220c0be.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormXd220c0be(
  /**
   * If this is an `acss_debit` PaymentMethod, this hash contains details about the ACSS Debit payment method.
   */
  public val acssDebit: InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f? = null,
  /**
   * If this is an `affirm` PaymentMethod, this hash contains details about the Affirm payment method.
   */
  public val affirm: JsonObject? = null,
  /**
   * If this is an `AfterpayClearpay` PaymentMethod, this hash contains details about the AfterpayClearpay payment
   * method.
   */
  public val afterpayClearpay: JsonObject? = null,
  /**
   * If this is an `Alipay` PaymentMethod, this hash contains details about the Alipay payment method.
   */
  public val alipay: JsonObject? = null,
  /**
   * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
   * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a saved
   * payment method in a checkout flow. The field defaults to `unspecified`.
   */
  public val allowRedisplay: InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d? = null,
  /**
   * If this is a Alma PaymentMethod, this hash contains details about the Alma payment method.
   */
  public val alma: JsonObject? = null,
  /**
   * If this is a AmazonPay PaymentMethod, this hash contains details about the AmazonPay payment method.
   */
  public val amazonPay: JsonObject? = null,
  /**
   * If this is an `au_becs_debit` PaymentMethod, this hash contains details about the bank account.
   */
  public val auBecsDebit: InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d? = null,
  /**
   * If this is a `bacs_debit` PaymentMethod, this hash contains details about the Bacs Direct Debit bank account.
   */
  public val bacsDebit: InlineV1PaymentMethodsPostRequestFormBacsDebitX3bb09b39? = null,
  /**
   * If this is a `bancontact` PaymentMethod, this hash contains details about the Bancontact payment method.
   */
  public val bancontact: JsonObject? = null,
  /**
   * If this is a `billie` PaymentMethod, this hash contains details about the Billie payment method.
   */
  public val billie: JsonObject? = null,
  /**
   * Billing information associated with the PaymentMethod that may be used or required by particular types of payment
   * methods.
   */
  public val billingDetails: InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975? = null,
  /**
   * If this is a `bizum` PaymentMethod, this hash contains details about the Bizum payment method.
   */
  public val bizum: JsonObject? = null,
  /**
   * If this is a `blik` PaymentMethod, this hash contains details about the BLIK payment method.
   */
  public val blik: JsonObject? = null,
  /**
   * If this is a `boleto` PaymentMethod, this hash contains details about the Boleto payment method.
   */
  public val boleto: InlineV1PaymentMethodsPostRequestFormBoletoX9bbbad6b? = null,
  /**
   * If this is a `card` PaymentMethod, this hash contains the user's card details. For backwards compatibility, you can
   * alternatively provide a Stripe token (e.g., for Apple Pay, Amex Express Checkout, or legacy Checkout) into the card
   * hash with format `card: {token: "tok_visa"}`. When providing a card number, you must meet the requirements for [PCI
   * compliance](https://stripe.com/docs/security#validating-pci-compliance). We strongly recommend using Stripe.js
   * instead of interacting with this API directly.
   */
  public val card: InlineV1PaymentMethodsPostRequestFormCardXb44ab44c? = null,
  /**
   * If this is a `cashapp` PaymentMethod, this hash contains details about the Cash App Pay payment method.
   */
  public val cashapp: JsonObject? = null,
  /**
   * If this is a Crypto PaymentMethod, this hash contains details about the Crypto payment method.
   */
  public val crypto: JsonObject? = null,
  /**
   * If this is a `custom` PaymentMethod, this hash contains details about the Custom payment method.
   */
  public val custom: InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd? = null,
  /**
   * The `Customer` to whom the original PaymentMethod is attached.
   */
  public val customer: String? = null,
  /**
   * If this is a `customer_balance` PaymentMethod, this hash contains details about the CustomerBalance payment method.
   */
  public val customerBalance: JsonObject? = null,
  /**
   * If this is an `eps` PaymentMethod, this hash contains details about the EPS payment method.
   */
  public val eps: InlineV1PaymentMethodsPostRequestFormEpsXf1913613? = null,
  expand: List<String>? = null,
  /**
   * If this is an `fpx` PaymentMethod, this hash contains details about the FPX payment method.
   */
  public val fpx: InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd? = null,
  /**
   * If this is a `giropay` PaymentMethod, this hash contains details about the Giropay payment method.
   */
  public val giropay: JsonObject? = null,
  /**
   * If this is a `grabpay` PaymentMethod, this hash contains details about the GrabPay payment method.
   */
  public val grabpay: JsonObject? = null,
  /**
   * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
   */
  public val ideal: InlineV1PaymentMethodsPostRequestFormIdealX0958d761? = null,
  /**
   * If this is an `interac_present` PaymentMethod, this hash contains details about the Interac Present payment method.
   */
  public val interacPresent: JsonObject? = null,
  /**
   * If this is a `kakao_pay` PaymentMethod, this hash contains details about the Kakao Pay payment method.
   */
  public val kakaoPay: JsonObject? = null,
  /**
   * If this is a `klarna` PaymentMethod, this hash contains details about the Klarna payment method.
   */
  public val klarna: InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15? = null,
  /**
   * If this is a `konbini` PaymentMethod, this hash contains details about the Konbini payment method.
   */
  public val konbini: JsonObject? = null,
  /**
   * If this is a `kr_card` PaymentMethod, this hash contains details about the Korean Card payment method.
   */
  public val krCard: JsonObject? = null,
  /**
   * If this is an `Link` PaymentMethod, this hash contains details about the Link payment method (Link is also known as
   * Onelink in the UK).
   */
  public val link: JsonObject? = null,
  /**
   * If this is a MB WAY PaymentMethod, this hash contains details about the MB WAY payment method.
   */
  public val mbWay: JsonObject? = null,
  metadata: Map<String, String>? = null,
  /**
   * If this is a `mobilepay` PaymentMethod, this hash contains details about the MobilePay payment method.
   */
  public val mobilepay: JsonObject? = null,
  /**
   * If this is a `multibanco` PaymentMethod, this hash contains details about the Multibanco payment method.
   */
  public val multibanco: JsonObject? = null,
  /**
   * If this is a `naver_pay` PaymentMethod, this hash contains details about the Naver Pay payment method.
   */
  public val naverPay: InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041? = null,
  /**
   * If this is an nz_bank_account PaymentMethod, this hash contains details about the nz_bank_account payment method.
   */
  public val nzBankAccount: InlineV1PaymentMethodsPostRequestFormNzBankAccountX261d52f6? = null,
  /**
   * If this is an `oxxo` PaymentMethod, this hash contains details about the OXXO payment method.
   */
  public val oxxo: JsonObject? = null,
  /**
   * If this is a `p24` PaymentMethod, this hash contains details about the P24 payment method.
   */
  public val p24: InlineV1PaymentMethodsPostRequestFormP24X1456d1cc? = null,
  /**
   * If this is a `pay_by_bank` PaymentMethod, this hash contains details about the PayByBank payment method.
   */
  public val payByBank: JsonObject? = null,
  /**
   * If this is a `payco` PaymentMethod, this hash contains details about the PAYCO payment method.
   */
  public val payco: JsonObject? = null,
  /**
   * The PaymentMethod to share.
   */
  public val paymentMethod: String? = null,
  /**
   * If this is a `paynow` PaymentMethod, this hash contains details about the PayNow payment method.
   */
  public val paynow: JsonObject? = null,
  /**
   * If this is a `paypal` PaymentMethod, this hash contains details about the PayPal payment method.
   */
  public val paypal: JsonObject? = null,
  /**
   * If this is a `payto` PaymentMethod, this hash contains details about the PayTo payment method.
   */
  public val payto: InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806? = null,
  /**
   * If this is a `pix` PaymentMethod, this hash contains details about the Pix payment method.
   */
  public val pix: JsonObject? = null,
  /**
   * If this is a `promptpay` PaymentMethod, this hash contains details about the PromptPay payment method.
   */
  public val promptpay: JsonObject? = null,
  /**
   * Options to configure Radar. See [Radar Session](https://docs.stripe.com/radar/radar-session) for more information.
   */
  public val radarOptions: InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01? = null,
  /**
   * If this is a `revolut_pay` PaymentMethod, this hash contains details about the Revolut Pay payment method.
   */
  public val revolutPay: JsonObject? = null,
  /**
   * If this is a `samsung_pay` PaymentMethod, this hash contains details about the SamsungPay payment method.
   */
  public val samsungPay: JsonObject? = null,
  /**
   * If this is a `satispay` PaymentMethod, this hash contains details about the Satispay payment method.
   */
  public val satispay: JsonObject? = null,
  /**
   * If this is a Scalapay PaymentMethod, this hash contains details about the Scalapay payment method.
   */
  public val scalapay: JsonObject? = null,
  /**
   * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
   */
  public val sepaDebit: InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a? = null,
  /**
   * If this is a `sofort` PaymentMethod, this hash contains details about the SOFORT payment method.
   */
  public val sofort: InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76? = null,
  /**
   * If this is a `sunbit` PaymentMethod, this hash contains details about the Sunbit payment method.
   */
  public val sunbit: JsonObject? = null,
  /**
   * If this is a `swish` PaymentMethod, this hash contains details about the Swish payment method.
   */
  public val swish: JsonObject? = null,
  /**
   * If this is a TWINT PaymentMethod, this hash contains details about the TWINT payment method.
   */
  public val twint: JsonObject? = null,
  /**
   * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name matching this value.
   * It contains additional information specific to the PaymentMethod type.
   */
  public val type: InlineV1PaymentMethodsPostRequestFormTypeXcd37f93b? = null,
  /**
   * If this is a `upi` PaymentMethod, this hash contains details about the UPI payment method.
   */
  public val upi: InlineV1PaymentMethodsPostRequestFormUpiX90d92384? = null,
  /**
   * If this is an `us_bank_account` PaymentMethod, this hash contains details about the US bank account payment method.
   */
  public val usBankAccount: InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511? = null,
  /**
   * If this is an `wechat_pay` PaymentMethod, this hash contains details about the wechat_pay payment method.
   */
  public val wechatPay: JsonObject? = null,
  /**
   * If this is a `zip` PaymentMethod, this hash contains details about the Zip payment method.
   */
  public val zip: JsonObject? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    /**
     * If this is an `acss_debit` PaymentMethod, this hash contains details about the ACSS Debit payment method.
     */
    public var acssDebit: InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f? = null

    /**
     * If this is an `affirm` PaymentMethod, this hash contains details about the Affirm payment method.
     */
    public var affirm: JsonObject? = null

    /**
     * If this is an `AfterpayClearpay` PaymentMethod, this hash contains details about the AfterpayClearpay payment
     * method.
     */
    public var afterpayClearpay: JsonObject? = null

    /**
     * If this is an `Alipay` PaymentMethod, this hash contains details about the Alipay payment method.
     */
    public var alipay: JsonObject? = null

    /**
     * This field indicates whether this payment method can be shown again to its customer in a checkout flow. Stripe
     * products such as Checkout and Elements use this field to determine whether a payment method can be shown as a
     * saved payment method in a checkout flow. The field defaults to `unspecified`.
     */
    public var allowRedisplay: InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d? = null

    /**
     * If this is a Alma PaymentMethod, this hash contains details about the Alma payment method.
     */
    public var alma: JsonObject? = null

    /**
     * If this is a AmazonPay PaymentMethod, this hash contains details about the AmazonPay payment method.
     */
    public var amazonPay: JsonObject? = null

    /**
     * If this is an `au_becs_debit` PaymentMethod, this hash contains details about the bank account.
     */
    public var auBecsDebit: InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d? = null

    /**
     * If this is a `bacs_debit` PaymentMethod, this hash contains details about the Bacs Direct Debit bank account.
     */
    public var bacsDebit: InlineV1PaymentMethodsPostRequestFormBacsDebitX3bb09b39? = null

    /**
     * If this is a `bancontact` PaymentMethod, this hash contains details about the Bancontact payment method.
     */
    public var bancontact: JsonObject? = null

    /**
     * If this is a `billie` PaymentMethod, this hash contains details about the Billie payment method.
     */
    public var billie: JsonObject? = null

    /**
     * Billing information associated with the PaymentMethod that may be used or required by particular types of payment
     * methods.
     */
    public var billingDetails: InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975? = null

    /**
     * If this is a `bizum` PaymentMethod, this hash contains details about the Bizum payment method.
     */
    public var bizum: JsonObject? = null

    /**
     * If this is a `blik` PaymentMethod, this hash contains details about the BLIK payment method.
     */
    public var blik: JsonObject? = null

    /**
     * If this is a `boleto` PaymentMethod, this hash contains details about the Boleto payment method.
     */
    public var boleto: InlineV1PaymentMethodsPostRequestFormBoletoX9bbbad6b? = null

    /**
     * If this is a `card` PaymentMethod, this hash contains the user's card details. For backwards compatibility, you
     * can alternatively provide a Stripe token (e.g., for Apple Pay, Amex Express Checkout, or legacy Checkout) into
     * the card hash with format `card: {token: "tok_visa"}`. When providing a card number, you must meet the
     * requirements for [PCI compliance](https://stripe.com/docs/security#validating-pci-compliance). We strongly
     * recommend using Stripe.js instead of interacting with this API directly.
     */
    public var card: InlineV1PaymentMethodsPostRequestFormCardXb44ab44c? = null

    /**
     * If this is a `cashapp` PaymentMethod, this hash contains details about the Cash App Pay payment method.
     */
    public var cashapp: JsonObject? = null

    /**
     * If this is a Crypto PaymentMethod, this hash contains details about the Crypto payment method.
     */
    public var crypto: JsonObject? = null

    /**
     * If this is a `custom` PaymentMethod, this hash contains details about the Custom payment method.
     */
    public var custom: InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd? = null

    /**
     * The `Customer` to whom the original PaymentMethod is attached.
     */
    public var customer: String? = null

    /**
     * If this is a `customer_balance` PaymentMethod, this hash contains details about the CustomerBalance payment
     * method.
     */
    public var customerBalance: JsonObject? = null

    /**
     * If this is an `eps` PaymentMethod, this hash contains details about the EPS payment method.
     */
    public var eps: InlineV1PaymentMethodsPostRequestFormEpsXf1913613? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * If this is an `fpx` PaymentMethod, this hash contains details about the FPX payment method.
     */
    public var fpx: InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd? = null

    /**
     * If this is a `giropay` PaymentMethod, this hash contains details about the Giropay payment method.
     */
    public var giropay: JsonObject? = null

    /**
     * If this is a `grabpay` PaymentMethod, this hash contains details about the GrabPay payment method.
     */
    public var grabpay: JsonObject? = null

    /**
     * If this is an `ideal` PaymentMethod, this hash contains details about the iDEAL payment method.
     */
    public var ideal: InlineV1PaymentMethodsPostRequestFormIdealX0958d761? = null

    /**
     * If this is an `interac_present` PaymentMethod, this hash contains details about the Interac Present payment
     * method.
     */
    public var interacPresent: JsonObject? = null

    /**
     * If this is a `kakao_pay` PaymentMethod, this hash contains details about the Kakao Pay payment method.
     */
    public var kakaoPay: JsonObject? = null

    /**
     * If this is a `klarna` PaymentMethod, this hash contains details about the Klarna payment method.
     */
    public var klarna: InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15? = null

    /**
     * If this is a `konbini` PaymentMethod, this hash contains details about the Konbini payment method.
     */
    public var konbini: JsonObject? = null

    /**
     * If this is a `kr_card` PaymentMethod, this hash contains details about the Korean Card payment method.
     */
    public var krCard: JsonObject? = null

    /**
     * If this is an `Link` PaymentMethod, this hash contains details about the Link payment method (Link is also known
     * as Onelink in the UK).
     */
    public var link: JsonObject? = null

    /**
     * If this is a MB WAY PaymentMethod, this hash contains details about the MB WAY payment method.
     */
    public var mbWay: JsonObject? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * If this is a `mobilepay` PaymentMethod, this hash contains details about the MobilePay payment method.
     */
    public var mobilepay: JsonObject? = null

    /**
     * If this is a `multibanco` PaymentMethod, this hash contains details about the Multibanco payment method.
     */
    public var multibanco: JsonObject? = null

    /**
     * If this is a `naver_pay` PaymentMethod, this hash contains details about the Naver Pay payment method.
     */
    public var naverPay: InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041? = null

    /**
     * If this is an nz_bank_account PaymentMethod, this hash contains details about the nz_bank_account payment method.
     */
    public var nzBankAccount: InlineV1PaymentMethodsPostRequestFormNzBankAccountX261d52f6? = null

    /**
     * If this is an `oxxo` PaymentMethod, this hash contains details about the OXXO payment method.
     */
    public var oxxo: JsonObject? = null

    /**
     * If this is a `p24` PaymentMethod, this hash contains details about the P24 payment method.
     */
    public var p24: InlineV1PaymentMethodsPostRequestFormP24X1456d1cc? = null

    /**
     * If this is a `pay_by_bank` PaymentMethod, this hash contains details about the PayByBank payment method.
     */
    public var payByBank: JsonObject? = null

    /**
     * If this is a `payco` PaymentMethod, this hash contains details about the PAYCO payment method.
     */
    public var payco: JsonObject? = null

    /**
     * The PaymentMethod to share.
     */
    public var paymentMethod: String? = null

    /**
     * If this is a `paynow` PaymentMethod, this hash contains details about the PayNow payment method.
     */
    public var paynow: JsonObject? = null

    /**
     * If this is a `paypal` PaymentMethod, this hash contains details about the PayPal payment method.
     */
    public var paypal: JsonObject? = null

    /**
     * If this is a `payto` PaymentMethod, this hash contains details about the PayTo payment method.
     */
    public var payto: InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806? = null

    /**
     * If this is a `pix` PaymentMethod, this hash contains details about the Pix payment method.
     */
    public var pix: JsonObject? = null

    /**
     * If this is a `promptpay` PaymentMethod, this hash contains details about the PromptPay payment method.
     */
    public var promptpay: JsonObject? = null

    /**
     * Options to configure Radar. See [Radar Session](https://docs.stripe.com/radar/radar-session) for more
     * information.
     */
    public var radarOptions: InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01? = null

    /**
     * If this is a `revolut_pay` PaymentMethod, this hash contains details about the Revolut Pay payment method.
     */
    public var revolutPay: JsonObject? = null

    /**
     * If this is a `samsung_pay` PaymentMethod, this hash contains details about the SamsungPay payment method.
     */
    public var samsungPay: JsonObject? = null

    /**
     * If this is a `satispay` PaymentMethod, this hash contains details about the Satispay payment method.
     */
    public var satispay: JsonObject? = null

    /**
     * If this is a Scalapay PaymentMethod, this hash contains details about the Scalapay payment method.
     */
    public var scalapay: JsonObject? = null

    /**
     * If this is a `sepa_debit` PaymentMethod, this hash contains details about the SEPA debit bank account.
     */
    public var sepaDebit: InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a? = null

    /**
     * If this is a `sofort` PaymentMethod, this hash contains details about the SOFORT payment method.
     */
    public var sofort: InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76? = null

    /**
     * If this is a `sunbit` PaymentMethod, this hash contains details about the Sunbit payment method.
     */
    public var sunbit: JsonObject? = null

    /**
     * If this is a `swish` PaymentMethod, this hash contains details about the Swish payment method.
     */
    public var swish: JsonObject? = null

    /**
     * If this is a TWINT PaymentMethod, this hash contains details about the TWINT payment method.
     */
    public var twint: JsonObject? = null

    /**
     * The type of the PaymentMethod. An additional hash is included on the PaymentMethod with a name matching this
     * value. It contains additional information specific to the PaymentMethod type.
     */
    public var type: InlineV1PaymentMethodsPostRequestFormTypeXcd37f93b? = null

    /**
     * If this is a `upi` PaymentMethod, this hash contains details about the UPI payment method.
     */
    public var upi: InlineV1PaymentMethodsPostRequestFormUpiX90d92384? = null

    /**
     * If this is an `us_bank_account` PaymentMethod, this hash contains details about the US bank account payment
     * method.
     */
    public var usBankAccount: InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511? = null

    /**
     * If this is an `wechat_pay` PaymentMethod, this hash contains details about the wechat_pay payment method.
     */
    public var wechatPay: JsonObject? = null

    /**
     * If this is a `zip` PaymentMethod, this hash contains details about the Zip payment method.
     */
    public var zip: JsonObject? = null

    public fun build(): InlineV1PaymentMethodsPostRequestFormXd220c0be = InlineV1PaymentMethodsPostRequestFormXd220c0be(
      acssDebit = acssDebit,
      affirm = affirm,
      afterpayClearpay = afterpayClearpay,
      alipay = alipay,
      allowRedisplay = allowRedisplay,
      alma = alma,
      amazonPay = amazonPay,
      auBecsDebit = auBecsDebit,
      bacsDebit = bacsDebit,
      bancontact = bancontact,
      billie = billie,
      billingDetails = billingDetails,
      bizum = bizum,
      blik = blik,
      boleto = boleto,
      card = card,
      cashapp = cashapp,
      crypto = crypto,
      custom = custom,
      customer = customer,
      customerBalance = customerBalance,
      eps = eps,
      expand = expand,
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
      metadata = metadata,
      mobilepay = mobilepay,
      multibanco = multibanco,
      naverPay = naverPay,
      nzBankAccount = nzBankAccount,
      oxxo = oxxo,
      p24 = p24,
      payByBank = payByBank,
      payco = payco,
      paymentMethod = paymentMethod,
      paynow = paynow,
      paypal = paypal,
      payto = payto,
      pix = pix,
      promptpay = promptpay,
      radarOptions = radarOptions,
      revolutPay = revolutPay,
      samsungPay = samsungPay,
      satispay = satispay,
      scalapay = scalapay,
      sepaDebit = sepaDebit,
      sofort = sofort,
      sunbit = sunbit,
      swish = swish,
      twint = twint,
      type = type,
      upi = upi,
      usBankAccount = usBankAccount,
      wechatPay = wechatPay,
      zip = zip,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormXd220c0be = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormXd220c0be> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormXd220c0be {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormXd220c0be")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormXd220c0be must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormXd220c0be(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormAcssDebitX9cb3cc2f>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        allowRedisplay = rawObject["allow_redisplay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormAllowRedisplayXb1e5a64d>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormAuBecsDebitX9e169e4d>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBacsDebitX3bb09b39>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        billingDetails = rawObject["billing_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBillingDetailsXab324975>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormBoletoX9bbbad6b>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormCardXb44ab44c>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        custom = rawObject["custom"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormEpsXf1913613>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormFpxXb8e6acfd>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormIdealX0958d761>(it) },
        interacPresent = rawObject["interac_present"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormKlarnaX73a2ab15>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormNaverPayX82f49041>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormNzBankAccountX261d52f6>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormP24X1456d1cc>(it) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paymentMethod = rawObject["payment_method"]?.let { json.decodeFromJsonElement<String>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormPaytoX4cef6806>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        promptpay = rawObject["promptpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        radarOptions = rawObject["radar_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormRadarOptionsX0857dd01>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormSepaDebitXb60dc83a>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormSofortXeb3d6e76>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormTypeXcd37f93b>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormUpiX90d92384>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormUsBankAccountX76c2a511>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormXd220c0be) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormXd220c0be")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.affirm?.let { put("affirm", json.encodeToJsonElement(it)) }
        value.afterpayClearpay?.let { put("afterpay_clearpay", json.encodeToJsonElement(it)) }
        value.alipay?.let { put("alipay", json.encodeToJsonElement(it)) }
        value.allowRedisplay?.let { put("allow_redisplay", json.encodeToJsonElement(it)) }
        value.alma?.let { put("alma", json.encodeToJsonElement(it)) }
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.auBecsDebit?.let { put("au_becs_debit", json.encodeToJsonElement(it)) }
        value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
        value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
        value.billie?.let { put("billie", json.encodeToJsonElement(it)) }
        value.billingDetails?.let { put("billing_details", json.encodeToJsonElement(it)) }
        value.bizum?.let { put("bizum", json.encodeToJsonElement(it)) }
        value.blik?.let { put("blik", json.encodeToJsonElement(it)) }
        value.boleto?.let { put("boleto", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cashapp?.let { put("cashapp", json.encodeToJsonElement(it)) }
        value.crypto?.let { put("crypto", json.encodeToJsonElement(it)) }
        value.custom?.let { put("custom", json.encodeToJsonElement(it)) }
        value.customer?.let { put("customer", it) }
        value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
        value.eps?.let { put("eps", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
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
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.mobilepay?.let { put("mobilepay", json.encodeToJsonElement(it)) }
        value.multibanco?.let { put("multibanco", json.encodeToJsonElement(it)) }
        value.naverPay?.let { put("naver_pay", json.encodeToJsonElement(it)) }
        value.nzBankAccount?.let { put("nz_bank_account", json.encodeToJsonElement(it)) }
        value.oxxo?.let { put("oxxo", json.encodeToJsonElement(it)) }
        value.p24?.let { put("p24", json.encodeToJsonElement(it)) }
        value.payByBank?.let { put("pay_by_bank", json.encodeToJsonElement(it)) }
        value.payco?.let { put("payco", json.encodeToJsonElement(it)) }
        value.paymentMethod?.let { put("payment_method", it) }
        value.paynow?.let { put("paynow", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
        value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
        value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
        value.promptpay?.let { put("promptpay", json.encodeToJsonElement(it)) }
        value.radarOptions?.let { put("radar_options", json.encodeToJsonElement(it)) }
        value.revolutPay?.let { put("revolut_pay", json.encodeToJsonElement(it)) }
        value.samsungPay?.let { put("samsung_pay", json.encodeToJsonElement(it)) }
        value.satispay?.let { put("satispay", json.encodeToJsonElement(it)) }
        value.scalapay?.let { put("scalapay", json.encodeToJsonElement(it)) }
        value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
        value.sofort?.let { put("sofort", json.encodeToJsonElement(it)) }
        value.sunbit?.let { put("sunbit", json.encodeToJsonElement(it)) }
        value.swish?.let { put("swish", json.encodeToJsonElement(it)) }
        value.twint?.let { put("twint", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", json.encodeToJsonElement(it)) }
        value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
        value.wechatPay?.let { put("wechat_pay", json.encodeToJsonElement(it)) }
        value.zip?.let { put("zip", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormXd220c0be(block: InlineV1PaymentMethodsPostRequestFormXd220c0be.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormXd220c0be = InlineV1PaymentMethodsPostRequestFormXd220c0be.build(block)
