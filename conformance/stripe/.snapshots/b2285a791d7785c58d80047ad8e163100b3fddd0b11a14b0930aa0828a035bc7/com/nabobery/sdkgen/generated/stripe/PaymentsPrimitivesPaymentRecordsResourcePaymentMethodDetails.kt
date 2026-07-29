package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetailsView(
  @SerialName("ach_credit_transfer")
  public val achCreditTransfer: PaymentMethodDetailsAchCreditTransfer? = null,
  @SerialName("ach_debit")
  public val achDebit: PaymentMethodDetailsAchDebit? = null,
  @SerialName("acss_debit")
  public val acssDebit: PaymentMethodDetailsPaymentRecordAcssDebit? = null,
  public val affirm: PaymentMethodDetailsPaymentRecordAffirm? = null,
  @SerialName("afterpay_clearpay")
  public val afterpayClearpay: PaymentMethodDetailsPaymentRecordAfterpayClearpay? = null,
  public val alipay: PaymentFlowsPrivatePaymentMethodsAlipayDetails? = null,
  public val alma: PaymentMethodDetailsPaymentRecordAlma? = null,
  @SerialName("amazon_pay")
  public val amazonPay: PaymentMethodDetailsPaymentRecordAmazonPay? = null,
  @SerialName("au_becs_debit")
  public val auBecsDebit: PaymentMethodDetailsAuBecsDebit? = null,
  @SerialName("bacs_debit")
  public val bacsDebit: PaymentMethodDetailsBacsDebit? = null,
  public val bancontact: PaymentMethodDetailsPaymentRecordBancontact? = null,
  public val billie: PaymentMethodDetailsPaymentRecordBillie? = null,
  @SerialName("billing_details")
  public val billingDetails: InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12? = null,
  public val bizum: PaymentMethodDetailsPaymentRecordBizum? = null,
  public val blik: PaymentMethodDetailsPaymentRecordBlik? = null,
  public val boleto: PaymentMethodDetailsPaymentRecordBoleto? = null,
  public val card: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails? = null,
  @SerialName("card_present")
  public val cardPresent: PaymentMethodDetailsCardPresent? = null,
  public val cashapp: PaymentMethodDetailsPaymentRecordCashapp? = null,
  public val crypto: PaymentMethodDetailsCrypto? = null,
  public val custom: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails? = null,
  @SerialName("customer_balance")
  public val customerBalance: JsonObject? = null,
  public val eps: PaymentMethodDetailsPaymentRecordEps? = null,
  public val fpx: PaymentMethodDetailsFpx? = null,
  public val giropay: PaymentMethodDetailsPaymentRecordGiropay? = null,
  public val grabpay: PaymentMethodDetailsGrabpay? = null,
  public val ideal: PaymentMethodDetailsPaymentRecordIdeal? = null,
  @SerialName("interac_present")
  public val interacPresent: PaymentMethodDetailsInteracPresent? = null,
  @SerialName("kakao_pay")
  public val kakaoPay: PaymentMethodDetailsPaymentRecordKakaoPay? = null,
  public val klarna: PaymentMethodDetailsPaymentRecordKlarna? = null,
  public val konbini: PaymentMethodDetailsPaymentRecordKonbini? = null,
  @SerialName("kr_card")
  public val krCard: PaymentMethodDetailsKrCard? = null,
  public val link: PaymentMethodDetailsPaymentRecordLink? = null,
  @SerialName("mb_way")
  public val mbWay: JsonObject? = null,
  public val mobilepay: PaymentMethodDetailsPaymentRecordMobilepay? = null,
  public val multibanco: PaymentMethodDetailsPaymentRecordMultibanco? = null,
  @SerialName("naver_pay")
  public val naverPay: PaymentMethodDetailsPaymentRecordNaverPay? = null,
  @SerialName("nz_bank_account")
  public val nzBankAccount: PaymentMethodDetailsNzBankAccount? = null,
  public val oxxo: PaymentMethodDetailsPaymentRecordOxxo? = null,
  public val p24: PaymentMethodDetailsPaymentRecordP24? = null,
  @SerialName("pay_by_bank")
  public val payByBank: JsonObject? = null,
  public val payco: PaymentMethodDetailsPaymentRecordPayco? = null,
  @SerialName("payment_method")
  public val paymentMethod: String? = null,
  public val paynow: PaymentMethodDetailsPaymentRecordPaynow? = null,
  public val paypal: PaymentMethodDetailsPaypal? = null,
  public val payto: PaymentMethodDetailsPaymentRecordPayto? = null,
  public val pix: PaymentMethodDetailsPaymentRecordPix? = null,
  public val promptpay: PaymentMethodDetailsPaymentRecordPromptpay? = null,
  @SerialName("revolut_pay")
  public val revolutPay: PaymentMethodDetailsPaymentRecordRevolutPay? = null,
  @SerialName("samsung_pay")
  public val samsungPay: PaymentMethodDetailsPaymentRecordSamsungPay? = null,
  public val satispay: PaymentMethodDetailsPaymentRecordSatispay? = null,
  public val scalapay: PaymentMethodDetailsPaymentRecordScalapay? = null,
  @SerialName("sepa_debit")
  public val sepaDebit: PaymentMethodDetailsPaymentRecordSepaDebit? = null,
  public val sofort: PaymentMethodDetailsPaymentRecordSofort? = null,
  @SerialName("stripe_account")
  public val stripeAccount: JsonObject? = null,
  public val sunbit: PaymentMethodDetailsPaymentRecordSunbit? = null,
  public val swish: PaymentMethodDetailsPaymentRecordSwish? = null,
  public val twint: PaymentMethodDetailsPaymentRecordTwint? = null,
  public val type: String,
  public val upi: PaymentMethodDetailsPaymentRecordUpi? = null,
  @SerialName("us_bank_account")
  public val usBankAccount: PaymentMethodDetailsPaymentRecordUsBankAccount? = null,
  public val wechat: JsonObject? = null,
  @SerialName("wechat_pay")
  public val wechatPay: PaymentMethodDetailsPaymentRecordWechatPay? = null,
  public val zip: JsonObject? = null,
)

/**
 * Details about the Payment Method used in this payment attempt.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_details
 */
@Serializable(with = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails.Serializer::class)
public class PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails(
  /**
   * The type of transaction-specific details of the payment method used in the payment. See
   * [PaymentMethod.type](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type) for the full
   * list of possible types.
   * An additional hash is included on `payment_method_details` with a name matching this value.
   * It contains information specific to the payment method.
   */
  public val type: String,
  public val achCreditTransfer: PaymentMethodDetailsAchCreditTransfer? = null,
  public val achDebit: PaymentMethodDetailsAchDebit? = null,
  public val acssDebit: PaymentMethodDetailsPaymentRecordAcssDebit? = null,
  public val affirm: PaymentMethodDetailsPaymentRecordAffirm? = null,
  public val afterpayClearpay: PaymentMethodDetailsPaymentRecordAfterpayClearpay? = null,
  public val alipay: PaymentFlowsPrivatePaymentMethodsAlipayDetails? = null,
  public val alma: PaymentMethodDetailsPaymentRecordAlma? = null,
  public val amazonPay: PaymentMethodDetailsPaymentRecordAmazonPay? = null,
  public val auBecsDebit: PaymentMethodDetailsAuBecsDebit? = null,
  public val bacsDebit: PaymentMethodDetailsBacsDebit? = null,
  public val bancontact: PaymentMethodDetailsPaymentRecordBancontact? = null,
  public val billie: PaymentMethodDetailsPaymentRecordBillie? = null,
  /**
   * The billing details associated with the method of payment.
   */
  public val billingDetails: InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12? = null,
  public val bizum: PaymentMethodDetailsPaymentRecordBizum? = null,
  public val blik: PaymentMethodDetailsPaymentRecordBlik? = null,
  public val boleto: PaymentMethodDetailsPaymentRecordBoleto? = null,
  public val card: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails? = null,
  public val cardPresent: PaymentMethodDetailsCardPresent? = null,
  public val cashapp: PaymentMethodDetailsPaymentRecordCashapp? = null,
  public val crypto: PaymentMethodDetailsCrypto? = null,
  public val custom: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails? = null,
  public val customerBalance: JsonObject? = null,
  public val eps: PaymentMethodDetailsPaymentRecordEps? = null,
  public val fpx: PaymentMethodDetailsFpx? = null,
  public val giropay: PaymentMethodDetailsPaymentRecordGiropay? = null,
  public val grabpay: PaymentMethodDetailsGrabpay? = null,
  public val ideal: PaymentMethodDetailsPaymentRecordIdeal? = null,
  public val interacPresent: PaymentMethodDetailsInteracPresent? = null,
  public val kakaoPay: PaymentMethodDetailsPaymentRecordKakaoPay? = null,
  public val klarna: PaymentMethodDetailsPaymentRecordKlarna? = null,
  public val konbini: PaymentMethodDetailsPaymentRecordKonbini? = null,
  public val krCard: PaymentMethodDetailsKrCard? = null,
  public val link: PaymentMethodDetailsPaymentRecordLink? = null,
  public val mbWay: JsonObject? = null,
  public val mobilepay: PaymentMethodDetailsPaymentRecordMobilepay? = null,
  public val multibanco: PaymentMethodDetailsPaymentRecordMultibanco? = null,
  public val naverPay: PaymentMethodDetailsPaymentRecordNaverPay? = null,
  public val nzBankAccount: PaymentMethodDetailsNzBankAccount? = null,
  public val oxxo: PaymentMethodDetailsPaymentRecordOxxo? = null,
  public val p24: PaymentMethodDetailsPaymentRecordP24? = null,
  public val payByBank: JsonObject? = null,
  public val payco: PaymentMethodDetailsPaymentRecordPayco? = null,
  /**
   * ID of the Stripe PaymentMethod used to make this payment.
   */
  public val paymentMethod: String? = null,
  public val paynow: PaymentMethodDetailsPaymentRecordPaynow? = null,
  public val paypal: PaymentMethodDetailsPaypal? = null,
  public val payto: PaymentMethodDetailsPaymentRecordPayto? = null,
  public val pix: PaymentMethodDetailsPaymentRecordPix? = null,
  public val promptpay: PaymentMethodDetailsPaymentRecordPromptpay? = null,
  public val revolutPay: PaymentMethodDetailsPaymentRecordRevolutPay? = null,
  public val samsungPay: PaymentMethodDetailsPaymentRecordSamsungPay? = null,
  public val satispay: PaymentMethodDetailsPaymentRecordSatispay? = null,
  public val scalapay: PaymentMethodDetailsPaymentRecordScalapay? = null,
  public val sepaDebit: PaymentMethodDetailsPaymentRecordSepaDebit? = null,
  public val sofort: PaymentMethodDetailsPaymentRecordSofort? = null,
  public val stripeAccount: JsonObject? = null,
  public val sunbit: PaymentMethodDetailsPaymentRecordSunbit? = null,
  public val swish: PaymentMethodDetailsPaymentRecordSwish? = null,
  public val twint: PaymentMethodDetailsPaymentRecordTwint? = null,
  public val upi: PaymentMethodDetailsPaymentRecordUpi? = null,
  public val usBankAccount: PaymentMethodDetailsPaymentRecordUsBankAccount? = null,
  public val wechat: JsonObject? = null,
  public val wechatPay: PaymentMethodDetailsPaymentRecordWechatPay? = null,
  public val zip: JsonObject? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var achCreditTransfer: PaymentMethodDetailsAchCreditTransfer? = null

    public var achDebit: PaymentMethodDetailsAchDebit? = null

    public var acssDebit: PaymentMethodDetailsPaymentRecordAcssDebit? = null

    public var affirm: PaymentMethodDetailsPaymentRecordAffirm? = null

    public var afterpayClearpay: PaymentMethodDetailsPaymentRecordAfterpayClearpay? = null

    public var alipay: PaymentFlowsPrivatePaymentMethodsAlipayDetails? = null

    public var alma: PaymentMethodDetailsPaymentRecordAlma? = null

    public var amazonPay: PaymentMethodDetailsPaymentRecordAmazonPay? = null

    public var auBecsDebit: PaymentMethodDetailsAuBecsDebit? = null

    public var bacsDebit: PaymentMethodDetailsBacsDebit? = null

    public var bancontact: PaymentMethodDetailsPaymentRecordBancontact? = null

    public var billie: PaymentMethodDetailsPaymentRecordBillie? = null

    /**
     * The billing details associated with the method of payment.
     */
    public var billingDetails: InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12? = null

    public var bizum: PaymentMethodDetailsPaymentRecordBizum? = null

    public var blik: PaymentMethodDetailsPaymentRecordBlik? = null

    public var boleto: PaymentMethodDetailsPaymentRecordBoleto? = null

    public var card: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails? = null

    public var cardPresent: PaymentMethodDetailsCardPresent? = null

    public var cashapp: PaymentMethodDetailsPaymentRecordCashapp? = null

    public var crypto: PaymentMethodDetailsCrypto? = null

    public var custom: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails? = null

    public var customerBalance: JsonObject? = null

    public var eps: PaymentMethodDetailsPaymentRecordEps? = null

    public var fpx: PaymentMethodDetailsFpx? = null

    public var giropay: PaymentMethodDetailsPaymentRecordGiropay? = null

    public var grabpay: PaymentMethodDetailsGrabpay? = null

    public var ideal: PaymentMethodDetailsPaymentRecordIdeal? = null

    public var interacPresent: PaymentMethodDetailsInteracPresent? = null

    public var kakaoPay: PaymentMethodDetailsPaymentRecordKakaoPay? = null

    public var klarna: PaymentMethodDetailsPaymentRecordKlarna? = null

    public var konbini: PaymentMethodDetailsPaymentRecordKonbini? = null

    public var krCard: PaymentMethodDetailsKrCard? = null

    public var link: PaymentMethodDetailsPaymentRecordLink? = null

    public var mbWay: JsonObject? = null

    public var mobilepay: PaymentMethodDetailsPaymentRecordMobilepay? = null

    public var multibanco: PaymentMethodDetailsPaymentRecordMultibanco? = null

    public var naverPay: PaymentMethodDetailsPaymentRecordNaverPay? = null

    public var nzBankAccount: PaymentMethodDetailsNzBankAccount? = null

    public var oxxo: PaymentMethodDetailsPaymentRecordOxxo? = null

    public var p24: PaymentMethodDetailsPaymentRecordP24? = null

    public var payByBank: JsonObject? = null

    public var payco: PaymentMethodDetailsPaymentRecordPayco? = null

    /**
     * ID of the Stripe PaymentMethod used to make this payment.
     */
    public var paymentMethod: String? = null

    public var paynow: PaymentMethodDetailsPaymentRecordPaynow? = null

    public var paypal: PaymentMethodDetailsPaypal? = null

    public var payto: PaymentMethodDetailsPaymentRecordPayto? = null

    public var pix: PaymentMethodDetailsPaymentRecordPix? = null

    public var promptpay: PaymentMethodDetailsPaymentRecordPromptpay? = null

    public var revolutPay: PaymentMethodDetailsPaymentRecordRevolutPay? = null

    public var samsungPay: PaymentMethodDetailsPaymentRecordSamsungPay? = null

    public var satispay: PaymentMethodDetailsPaymentRecordSatispay? = null

    public var scalapay: PaymentMethodDetailsPaymentRecordScalapay? = null

    public var sepaDebit: PaymentMethodDetailsPaymentRecordSepaDebit? = null

    public var sofort: PaymentMethodDetailsPaymentRecordSofort? = null

    public var stripeAccount: JsonObject? = null

    public var sunbit: PaymentMethodDetailsPaymentRecordSunbit? = null

    public var swish: PaymentMethodDetailsPaymentRecordSwish? = null

    public var twint: PaymentMethodDetailsPaymentRecordTwint? = null

    public var upi: PaymentMethodDetailsPaymentRecordUpi? = null

    public var usBankAccount: PaymentMethodDetailsPaymentRecordUsBankAccount? = null

    public var wechat: JsonObject? = null

    public var wechatPay: PaymentMethodDetailsPaymentRecordWechatPay? = null

    public var zip: JsonObject? = null

    public fun build(): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails {
      check(typeValue != null) { "type is required" }
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails(
        type = type,
        achCreditTransfer = achCreditTransfer,
        achDebit = achDebit,
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
        billingDetails = billingDetails,
        bizum = bizum,
        blik = blik,
        boleto = boleto,
        card = card,
        cardPresent = cardPresent,
        cashapp = cashapp,
        crypto = crypto,
        custom = custom,
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
        paymentMethod = paymentMethod,
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
        stripeAccount = stripeAccount,
        sunbit = sunbit,
        swish = swish,
        twint = twint,
        upi = upi,
        usBankAccount = usBankAccount,
        wechat = wechat,
        wechatPay = wechatPay,
        zip = zip,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails(
        type = type,
        achCreditTransfer = rawObject["ach_credit_transfer"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAchCreditTransfer>(it) },
        achDebit = rawObject["ach_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAchDebit>(it) },
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordAcssDebit>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordAffirm>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordAfterpayClearpay>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsAlipayDetails>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordAlma>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordAmazonPay>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAuBecsDebit>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsBacsDebit>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordBancontact>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordBillie>(it) },
        billingDetails = rawObject["billing_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentsPrimitivesPa1a22BillingDetailsX93fd2d12?>(element) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordBizum>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordBlik>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordBoleto>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCardDetails>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCardPresent>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordCashapp>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCrypto>(it) },
        custom = rawObject["custom"]?.let { json.decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodCustomDetails>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordEps>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsFpx>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordGiropay>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsGrabpay>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordIdeal>(it) },
        interacPresent = rawObject["interac_present"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsInteracPresent>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordKakaoPay>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordKlarna>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordKonbini>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsKrCard>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordLink>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordMobilepay>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordMultibanco>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordNaverPay>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsNzBankAccount>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordOxxo>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordP24>(it) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordPayco>(it) },
        paymentMethod = rawObject["payment_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordPaynow>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaypal>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordPayto>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordPix>(it) },
        promptpay = rawObject["promptpay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordPromptpay>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordRevolutPay>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordSamsungPay>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordSatispay>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordScalapay>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordSepaDebit>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordSofort>(it) },
        stripeAccount = rawObject["stripe_account"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordSunbit>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordSwish>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordTwint>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordUpi>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordUsBankAccount>(it) },
        wechat = rawObject["wechat"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaymentRecordWechatPay>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.achCreditTransfer?.let { put("ach_credit_transfer", json.encodeToJsonElement(it)) }
        value.achDebit?.let { put("ach_debit", json.encodeToJsonElement(it)) }
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
        value.billingDetails?.let { put("billing_details", json.encodeToJsonElement(it)) }
        value.bizum?.let { put("bizum", json.encodeToJsonElement(it)) }
        value.blik?.let { put("blik", json.encodeToJsonElement(it)) }
        value.boleto?.let { put("boleto", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
        value.cashapp?.let { put("cashapp", json.encodeToJsonElement(it)) }
        value.crypto?.let { put("crypto", json.encodeToJsonElement(it)) }
        value.custom?.let { put("custom", json.encodeToJsonElement(it)) }
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
        value.paymentMethod?.let { put("payment_method", it) }
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
        value.stripeAccount?.let { put("stripe_account", json.encodeToJsonElement(it)) }
        value.sunbit?.let { put("sunbit", json.encodeToJsonElement(it)) }
        value.swish?.let { put("swish", json.encodeToJsonElement(it)) }
        value.twint?.let { put("twint", json.encodeToJsonElement(it)) }
        value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
        value.wechat?.let { put("wechat", json.encodeToJsonElement(it)) }
        value.wechatPay?.let { put("wechat_pay", json.encodeToJsonElement(it)) }
        value.zip?.let { put("zip", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails(block: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails.Builder.() -> Unit): PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails = PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentsPrimitivesPaymentRecordsResourcePaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
