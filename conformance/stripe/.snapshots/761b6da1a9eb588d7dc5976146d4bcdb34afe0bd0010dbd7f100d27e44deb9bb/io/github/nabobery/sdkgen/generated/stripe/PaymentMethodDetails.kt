package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentMethodDetailsView(
  @SerialName("ach_credit_transfer")
  public val achCreditTransfer: PaymentMethodDetailsAchCreditTransfer? = null,
  @SerialName("ach_debit")
  public val achDebit: PaymentMethodDetailsAchDebit? = null,
  @SerialName("acss_debit")
  public val acssDebit: PaymentMethodDetailsAcssDebit? = null,
  public val affirm: PaymentMethodDetailsAffirm? = null,
  @SerialName("afterpay_clearpay")
  public val afterpayClearpay: PaymentMethodDetailsAfterpayClearpay? = null,
  public val alipay: PaymentFlowsPrivatePaymentMethodsAlipayDetails? = null,
  public val alma: PaymentMethodDetailsAlma? = null,
  @SerialName("amazon_pay")
  public val amazonPay: PaymentMethodDetailsAmazonPay? = null,
  @SerialName("au_becs_debit")
  public val auBecsDebit: PaymentMethodDetailsAuBecsDebit? = null,
  @SerialName("bacs_debit")
  public val bacsDebit: PaymentMethodDetailsBacsDebit? = null,
  public val bancontact: PaymentMethodDetailsBancontact? = null,
  public val billie: PaymentMethodDetailsBillie? = null,
  public val bizum: PaymentMethodDetailsBizum? = null,
  public val blik: PaymentMethodDetailsBlik? = null,
  public val boleto: PaymentMethodDetailsBoleto? = null,
  public val card: PaymentMethodDetailsCard? = null,
  @SerialName("card_present")
  public val cardPresent: PaymentMethodDetailsCardPresent? = null,
  public val cashapp: PaymentMethodDetailsCashapp? = null,
  public val crypto: PaymentMethodDetailsCrypto? = null,
  @SerialName("customer_balance")
  public val customerBalance: JsonObject? = null,
  public val eps: PaymentMethodDetailsEps? = null,
  public val fpx: PaymentMethodDetailsFpx? = null,
  public val giropay: PaymentMethodDetailsGiropay? = null,
  public val grabpay: PaymentMethodDetailsGrabpay? = null,
  public val ideal: PaymentMethodDetailsIdeal? = null,
  @SerialName("interac_present")
  public val interacPresent: PaymentMethodDetailsInteracPresent? = null,
  @SerialName("kakao_pay")
  public val kakaoPay: PaymentMethodDetailsKakaoPay? = null,
  public val klarna: PaymentMethodDetailsKlarna? = null,
  public val konbini: PaymentMethodDetailsKonbini? = null,
  @SerialName("kr_card")
  public val krCard: PaymentMethodDetailsKrCard? = null,
  public val link: PaymentMethodDetailsLink? = null,
  @SerialName("mb_way")
  public val mbWay: JsonObject? = null,
  public val mobilepay: PaymentMethodDetailsMobilepay? = null,
  public val multibanco: PaymentMethodDetailsMultibanco? = null,
  @SerialName("naver_pay")
  public val naverPay: PaymentMethodDetailsNaverPay? = null,
  @SerialName("nz_bank_account")
  public val nzBankAccount: PaymentMethodDetailsNzBankAccount? = null,
  public val oxxo: PaymentMethodDetailsOxxo? = null,
  public val p24: PaymentMethodDetailsP24? = null,
  @SerialName("pay_by_bank")
  public val payByBank: JsonObject? = null,
  public val payco: PaymentMethodDetailsPayco? = null,
  public val paynow: PaymentMethodDetailsPaynow? = null,
  public val paypal: PaymentMethodDetailsPaypal? = null,
  public val payto: PaymentMethodDetailsPayto? = null,
  public val pix: PaymentMethodDetailsPix? = null,
  public val promptpay: PaymentMethodDetailsPromptpay? = null,
  @SerialName("revolut_pay")
  public val revolutPay: PaymentMethodDetailsRevolutPay? = null,
  @SerialName("samsung_pay")
  public val samsungPay: PaymentMethodDetailsSamsungPay? = null,
  public val satispay: PaymentMethodDetailsSatispay? = null,
  public val scalapay: PaymentMethodDetailsScalapay? = null,
  @SerialName("sepa_debit")
  public val sepaDebit: PaymentMethodDetailsSepaDebit? = null,
  public val sofort: PaymentMethodDetailsSofort? = null,
  @SerialName("stripe_account")
  public val stripeAccount: JsonObject? = null,
  public val sunbit: PaymentMethodDetailsSunbit? = null,
  public val swish: PaymentMethodDetailsSwish? = null,
  public val twint: PaymentMethodDetailsTwint? = null,
  public val type: String,
  public val upi: PaymentMethodDetailsUpi? = null,
  @SerialName("us_bank_account")
  public val usBankAccount: PaymentMethodDetailsUsBankAccount? = null,
  public val wechat: JsonObject? = null,
  @SerialName("wechat_pay")
  public val wechatPay: PaymentMethodDetailsWechatPay? = null,
  public val zip: JsonObject? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details
 */
@Serializable(with = PaymentMethodDetails.Serializer::class)
public class PaymentMethodDetails(
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
  public val acssDebit: PaymentMethodDetailsAcssDebit? = null,
  public val affirm: PaymentMethodDetailsAffirm? = null,
  public val afterpayClearpay: PaymentMethodDetailsAfterpayClearpay? = null,
  public val alipay: PaymentFlowsPrivatePaymentMethodsAlipayDetails? = null,
  public val alma: PaymentMethodDetailsAlma? = null,
  public val amazonPay: PaymentMethodDetailsAmazonPay? = null,
  public val auBecsDebit: PaymentMethodDetailsAuBecsDebit? = null,
  public val bacsDebit: PaymentMethodDetailsBacsDebit? = null,
  public val bancontact: PaymentMethodDetailsBancontact? = null,
  public val billie: PaymentMethodDetailsBillie? = null,
  public val bizum: PaymentMethodDetailsBizum? = null,
  public val blik: PaymentMethodDetailsBlik? = null,
  public val boleto: PaymentMethodDetailsBoleto? = null,
  public val card: PaymentMethodDetailsCard? = null,
  public val cardPresent: PaymentMethodDetailsCardPresent? = null,
  public val cashapp: PaymentMethodDetailsCashapp? = null,
  public val crypto: PaymentMethodDetailsCrypto? = null,
  public val customerBalance: JsonObject? = null,
  public val eps: PaymentMethodDetailsEps? = null,
  public val fpx: PaymentMethodDetailsFpx? = null,
  public val giropay: PaymentMethodDetailsGiropay? = null,
  public val grabpay: PaymentMethodDetailsGrabpay? = null,
  public val ideal: PaymentMethodDetailsIdeal? = null,
  public val interacPresent: PaymentMethodDetailsInteracPresent? = null,
  public val kakaoPay: PaymentMethodDetailsKakaoPay? = null,
  public val klarna: PaymentMethodDetailsKlarna? = null,
  public val konbini: PaymentMethodDetailsKonbini? = null,
  public val krCard: PaymentMethodDetailsKrCard? = null,
  public val link: PaymentMethodDetailsLink? = null,
  public val mbWay: JsonObject? = null,
  public val mobilepay: PaymentMethodDetailsMobilepay? = null,
  public val multibanco: PaymentMethodDetailsMultibanco? = null,
  public val naverPay: PaymentMethodDetailsNaverPay? = null,
  public val nzBankAccount: PaymentMethodDetailsNzBankAccount? = null,
  public val oxxo: PaymentMethodDetailsOxxo? = null,
  public val p24: PaymentMethodDetailsP24? = null,
  public val payByBank: JsonObject? = null,
  public val payco: PaymentMethodDetailsPayco? = null,
  public val paynow: PaymentMethodDetailsPaynow? = null,
  public val paypal: PaymentMethodDetailsPaypal? = null,
  public val payto: PaymentMethodDetailsPayto? = null,
  public val pix: PaymentMethodDetailsPix? = null,
  public val promptpay: PaymentMethodDetailsPromptpay? = null,
  public val revolutPay: PaymentMethodDetailsRevolutPay? = null,
  public val samsungPay: PaymentMethodDetailsSamsungPay? = null,
  public val satispay: PaymentMethodDetailsSatispay? = null,
  public val scalapay: PaymentMethodDetailsScalapay? = null,
  public val sepaDebit: PaymentMethodDetailsSepaDebit? = null,
  public val sofort: PaymentMethodDetailsSofort? = null,
  public val stripeAccount: JsonObject? = null,
  public val sunbit: PaymentMethodDetailsSunbit? = null,
  public val swish: PaymentMethodDetailsSwish? = null,
  public val twint: PaymentMethodDetailsTwint? = null,
  public val upi: PaymentMethodDetailsUpi? = null,
  public val usBankAccount: PaymentMethodDetailsUsBankAccount? = null,
  public val wechat: JsonObject? = null,
  public val wechatPay: PaymentMethodDetailsWechatPay? = null,
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

    public var acssDebit: PaymentMethodDetailsAcssDebit? = null

    public var affirm: PaymentMethodDetailsAffirm? = null

    public var afterpayClearpay: PaymentMethodDetailsAfterpayClearpay? = null

    public var alipay: PaymentFlowsPrivatePaymentMethodsAlipayDetails? = null

    public var alma: PaymentMethodDetailsAlma? = null

    public var amazonPay: PaymentMethodDetailsAmazonPay? = null

    public var auBecsDebit: PaymentMethodDetailsAuBecsDebit? = null

    public var bacsDebit: PaymentMethodDetailsBacsDebit? = null

    public var bancontact: PaymentMethodDetailsBancontact? = null

    public var billie: PaymentMethodDetailsBillie? = null

    public var bizum: PaymentMethodDetailsBizum? = null

    public var blik: PaymentMethodDetailsBlik? = null

    public var boleto: PaymentMethodDetailsBoleto? = null

    public var card: PaymentMethodDetailsCard? = null

    public var cardPresent: PaymentMethodDetailsCardPresent? = null

    public var cashapp: PaymentMethodDetailsCashapp? = null

    public var crypto: PaymentMethodDetailsCrypto? = null

    public var customerBalance: JsonObject? = null

    public var eps: PaymentMethodDetailsEps? = null

    public var fpx: PaymentMethodDetailsFpx? = null

    public var giropay: PaymentMethodDetailsGiropay? = null

    public var grabpay: PaymentMethodDetailsGrabpay? = null

    public var ideal: PaymentMethodDetailsIdeal? = null

    public var interacPresent: PaymentMethodDetailsInteracPresent? = null

    public var kakaoPay: PaymentMethodDetailsKakaoPay? = null

    public var klarna: PaymentMethodDetailsKlarna? = null

    public var konbini: PaymentMethodDetailsKonbini? = null

    public var krCard: PaymentMethodDetailsKrCard? = null

    public var link: PaymentMethodDetailsLink? = null

    public var mbWay: JsonObject? = null

    public var mobilepay: PaymentMethodDetailsMobilepay? = null

    public var multibanco: PaymentMethodDetailsMultibanco? = null

    public var naverPay: PaymentMethodDetailsNaverPay? = null

    public var nzBankAccount: PaymentMethodDetailsNzBankAccount? = null

    public var oxxo: PaymentMethodDetailsOxxo? = null

    public var p24: PaymentMethodDetailsP24? = null

    public var payByBank: JsonObject? = null

    public var payco: PaymentMethodDetailsPayco? = null

    public var paynow: PaymentMethodDetailsPaynow? = null

    public var paypal: PaymentMethodDetailsPaypal? = null

    public var payto: PaymentMethodDetailsPayto? = null

    public var pix: PaymentMethodDetailsPix? = null

    public var promptpay: PaymentMethodDetailsPromptpay? = null

    public var revolutPay: PaymentMethodDetailsRevolutPay? = null

    public var samsungPay: PaymentMethodDetailsSamsungPay? = null

    public var satispay: PaymentMethodDetailsSatispay? = null

    public var scalapay: PaymentMethodDetailsScalapay? = null

    public var sepaDebit: PaymentMethodDetailsSepaDebit? = null

    public var sofort: PaymentMethodDetailsSofort? = null

    public var stripeAccount: JsonObject? = null

    public var sunbit: PaymentMethodDetailsSunbit? = null

    public var swish: PaymentMethodDetailsSwish? = null

    public var twint: PaymentMethodDetailsTwint? = null

    public var upi: PaymentMethodDetailsUpi? = null

    public var usBankAccount: PaymentMethodDetailsUsBankAccount? = null

    public var wechat: JsonObject? = null

    public var wechatPay: PaymentMethodDetailsWechatPay? = null

    public var zip: JsonObject? = null

    public fun build(): PaymentMethodDetails {
      check(typeValue != null) { "type is required" }
      return PaymentMethodDetails(
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
    public fun build(block: Builder.() -> Unit): PaymentMethodDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetails must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return PaymentMethodDetails(
        type = type,
        achCreditTransfer = rawObject["ach_credit_transfer"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAchCreditTransfer>(it) },
        achDebit = rawObject["ach_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAchDebit>(it) },
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAcssDebit>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAffirm>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAfterpayClearpay>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<PaymentFlowsPrivatePaymentMethodsAlipayDetails>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAlma>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAmazonPay>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsAuBecsDebit>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsBacsDebit>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsBancontact>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsBillie>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsBizum>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsBlik>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsBoleto>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCard>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCardPresent>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCashapp>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCrypto>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsEps>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsFpx>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsGiropay>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsGrabpay>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsIdeal>(it) },
        interacPresent = rawObject["interac_present"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsInteracPresent>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsKakaoPay>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsKlarna>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsKonbini>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsKrCard>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsLink>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsMobilepay>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsMultibanco>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsNaverPay>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsNzBankAccount>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsOxxo>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsP24>(it) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPayco>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaynow>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPaypal>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPayto>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPix>(it) },
        promptpay = rawObject["promptpay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsPromptpay>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsRevolutPay>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsSamsungPay>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsSatispay>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsScalapay>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsSepaDebit>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsSofort>(it) },
        stripeAccount = rawObject["stripe_account"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsSunbit>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsSwish>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsTwint>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsUpi>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsUsBankAccount>(it) },
        wechat = rawObject["wechat"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsWechatPay>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetails")
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

public fun paymentMethodDetails(block: PaymentMethodDetails.Builder.() -> Unit): PaymentMethodDetails = PaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
