package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class CheckoutSessionPaymentMethodOptionsView(
  @SerialName("acss_debit")
  public val acssDebit: CheckoutAcssDebitPaymentMethodOptions? = null,
  public val affirm: CheckoutAffirmPaymentMethodOptions? = null,
  @SerialName("afterpay_clearpay")
  public val afterpayClearpay: CheckoutAfterpayClearpayPaymentMethodOptions? = null,
  public val alipay: CheckoutAlipayPaymentMethodOptions? = null,
  public val alma: CheckoutAlmaPaymentMethodOptions? = null,
  @SerialName("amazon_pay")
  public val amazonPay: CheckoutAmazonPayPaymentMethodOptions? = null,
  @SerialName("au_becs_debit")
  public val auBecsDebit: CheckoutAuBecsDebitPaymentMethodOptions? = null,
  @SerialName("bacs_debit")
  public val bacsDebit: CheckoutBacsDebitPaymentMethodOptions? = null,
  public val bancontact: CheckoutBancontactPaymentMethodOptions? = null,
  public val billie: CheckoutBilliePaymentMethodOptions? = null,
  public val boleto: CheckoutBoletoPaymentMethodOptions? = null,
  public val card: CheckoutCardPaymentMethodOptions? = null,
  public val cashapp: CheckoutCashappPaymentMethodOptions? = null,
  @SerialName("customer_balance")
  public val customerBalance: CheckoutCustomerBalancePaymentMethodOptions? = null,
  public val eps: CheckoutEpsPaymentMethodOptions? = null,
  public val fpx: CheckoutFpxPaymentMethodOptions? = null,
  public val giropay: CheckoutGiropayPaymentMethodOptions? = null,
  public val grabpay: CheckoutGrabPayPaymentMethodOptions? = null,
  public val ideal: CheckoutIdealPaymentMethodOptions? = null,
  @SerialName("kakao_pay")
  public val kakaoPay: CheckoutKakaoPayPaymentMethodOptions? = null,
  public val klarna: CheckoutKlarnaPaymentMethodOptions? = null,
  public val konbini: CheckoutKonbiniPaymentMethodOptions? = null,
  @SerialName("kr_card")
  public val krCard: CheckoutKrCardPaymentMethodOptions? = null,
  public val link: CheckoutLinkPaymentMethodOptions? = null,
  public val mobilepay: CheckoutMobilepayPaymentMethodOptions? = null,
  public val multibanco: CheckoutMultibancoPaymentMethodOptions? = null,
  @SerialName("naver_pay")
  public val naverPay: CheckoutNaverPayPaymentMethodOptions? = null,
  public val oxxo: CheckoutOxxoPaymentMethodOptions? = null,
  public val p24: CheckoutP24PaymentMethodOptions? = null,
  public val payco: CheckoutPaycoPaymentMethodOptions? = null,
  public val paynow: CheckoutPaynowPaymentMethodOptions? = null,
  public val paypal: CheckoutPaypalPaymentMethodOptions? = null,
  public val payto: CheckoutPaytoPaymentMethodOptions? = null,
  public val pix: CheckoutPixPaymentMethodOptions? = null,
  @SerialName("revolut_pay")
  public val revolutPay: CheckoutRevolutPayPaymentMethodOptions? = null,
  @SerialName("samsung_pay")
  public val samsungPay: CheckoutSamsungPayPaymentMethodOptions? = null,
  public val satispay: CheckoutSatispayPaymentMethodOptions? = null,
  public val scalapay: CheckoutScalapayPaymentMethodOptions? = null,
  @SerialName("sepa_debit")
  public val sepaDebit: CheckoutSepaDebitPaymentMethodOptions? = null,
  public val sofort: CheckoutSofortPaymentMethodOptions? = null,
  public val sunbit: CheckoutSunbitPaymentMethodOptions? = null,
  public val swish: CheckoutSwishPaymentMethodOptions? = null,
  public val twint: CheckoutTwintPaymentMethodOptions? = null,
  public val upi: CheckoutUpiPaymentMethodOptions? = null,
  @SerialName("us_bank_account")
  public val usBankAccount: CheckoutUsBankAccountPaymentMethodOptions? = null,
  @SerialName("wechat_pay")
  public val wechatPay: CheckoutWechatPayPaymentMethodOptions? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_session_payment_method_options
 */
@Serializable(with = CheckoutSessionPaymentMethodOptions.Serializer::class)
public class CheckoutSessionPaymentMethodOptions(
  public val acssDebit: CheckoutAcssDebitPaymentMethodOptions? = null,
  public val affirm: CheckoutAffirmPaymentMethodOptions? = null,
  public val afterpayClearpay: CheckoutAfterpayClearpayPaymentMethodOptions? = null,
  public val alipay: CheckoutAlipayPaymentMethodOptions? = null,
  public val alma: CheckoutAlmaPaymentMethodOptions? = null,
  public val amazonPay: CheckoutAmazonPayPaymentMethodOptions? = null,
  public val auBecsDebit: CheckoutAuBecsDebitPaymentMethodOptions? = null,
  public val bacsDebit: CheckoutBacsDebitPaymentMethodOptions? = null,
  public val bancontact: CheckoutBancontactPaymentMethodOptions? = null,
  public val billie: CheckoutBilliePaymentMethodOptions? = null,
  public val boleto: CheckoutBoletoPaymentMethodOptions? = null,
  public val card: CheckoutCardPaymentMethodOptions? = null,
  public val cashapp: CheckoutCashappPaymentMethodOptions? = null,
  public val customerBalance: CheckoutCustomerBalancePaymentMethodOptions? = null,
  public val eps: CheckoutEpsPaymentMethodOptions? = null,
  public val fpx: CheckoutFpxPaymentMethodOptions? = null,
  public val giropay: CheckoutGiropayPaymentMethodOptions? = null,
  public val grabpay: CheckoutGrabPayPaymentMethodOptions? = null,
  public val ideal: CheckoutIdealPaymentMethodOptions? = null,
  public val kakaoPay: CheckoutKakaoPayPaymentMethodOptions? = null,
  public val klarna: CheckoutKlarnaPaymentMethodOptions? = null,
  public val konbini: CheckoutKonbiniPaymentMethodOptions? = null,
  public val krCard: CheckoutKrCardPaymentMethodOptions? = null,
  public val link: CheckoutLinkPaymentMethodOptions? = null,
  public val mobilepay: CheckoutMobilepayPaymentMethodOptions? = null,
  public val multibanco: CheckoutMultibancoPaymentMethodOptions? = null,
  public val naverPay: CheckoutNaverPayPaymentMethodOptions? = null,
  public val oxxo: CheckoutOxxoPaymentMethodOptions? = null,
  public val p24: CheckoutP24PaymentMethodOptions? = null,
  public val payco: CheckoutPaycoPaymentMethodOptions? = null,
  public val paynow: CheckoutPaynowPaymentMethodOptions? = null,
  public val paypal: CheckoutPaypalPaymentMethodOptions? = null,
  public val payto: CheckoutPaytoPaymentMethodOptions? = null,
  public val pix: CheckoutPixPaymentMethodOptions? = null,
  public val revolutPay: CheckoutRevolutPayPaymentMethodOptions? = null,
  public val samsungPay: CheckoutSamsungPayPaymentMethodOptions? = null,
  public val satispay: CheckoutSatispayPaymentMethodOptions? = null,
  public val scalapay: CheckoutScalapayPaymentMethodOptions? = null,
  public val sepaDebit: CheckoutSepaDebitPaymentMethodOptions? = null,
  public val sofort: CheckoutSofortPaymentMethodOptions? = null,
  public val sunbit: CheckoutSunbitPaymentMethodOptions? = null,
  public val swish: CheckoutSwishPaymentMethodOptions? = null,
  public val twint: CheckoutTwintPaymentMethodOptions? = null,
  public val upi: CheckoutUpiPaymentMethodOptions? = null,
  public val usBankAccount: CheckoutUsBankAccountPaymentMethodOptions? = null,
  public val wechatPay: CheckoutWechatPayPaymentMethodOptions? = null,
) {
  public class Builder {
    public var acssDebit: CheckoutAcssDebitPaymentMethodOptions? = null

    public var affirm: CheckoutAffirmPaymentMethodOptions? = null

    public var afterpayClearpay: CheckoutAfterpayClearpayPaymentMethodOptions? = null

    public var alipay: CheckoutAlipayPaymentMethodOptions? = null

    public var alma: CheckoutAlmaPaymentMethodOptions? = null

    public var amazonPay: CheckoutAmazonPayPaymentMethodOptions? = null

    public var auBecsDebit: CheckoutAuBecsDebitPaymentMethodOptions? = null

    public var bacsDebit: CheckoutBacsDebitPaymentMethodOptions? = null

    public var bancontact: CheckoutBancontactPaymentMethodOptions? = null

    public var billie: CheckoutBilliePaymentMethodOptions? = null

    public var boleto: CheckoutBoletoPaymentMethodOptions? = null

    public var card: CheckoutCardPaymentMethodOptions? = null

    public var cashapp: CheckoutCashappPaymentMethodOptions? = null

    public var customerBalance: CheckoutCustomerBalancePaymentMethodOptions? = null

    public var eps: CheckoutEpsPaymentMethodOptions? = null

    public var fpx: CheckoutFpxPaymentMethodOptions? = null

    public var giropay: CheckoutGiropayPaymentMethodOptions? = null

    public var grabpay: CheckoutGrabPayPaymentMethodOptions? = null

    public var ideal: CheckoutIdealPaymentMethodOptions? = null

    public var kakaoPay: CheckoutKakaoPayPaymentMethodOptions? = null

    public var klarna: CheckoutKlarnaPaymentMethodOptions? = null

    public var konbini: CheckoutKonbiniPaymentMethodOptions? = null

    public var krCard: CheckoutKrCardPaymentMethodOptions? = null

    public var link: CheckoutLinkPaymentMethodOptions? = null

    public var mobilepay: CheckoutMobilepayPaymentMethodOptions? = null

    public var multibanco: CheckoutMultibancoPaymentMethodOptions? = null

    public var naverPay: CheckoutNaverPayPaymentMethodOptions? = null

    public var oxxo: CheckoutOxxoPaymentMethodOptions? = null

    public var p24: CheckoutP24PaymentMethodOptions? = null

    public var payco: CheckoutPaycoPaymentMethodOptions? = null

    public var paynow: CheckoutPaynowPaymentMethodOptions? = null

    public var paypal: CheckoutPaypalPaymentMethodOptions? = null

    public var payto: CheckoutPaytoPaymentMethodOptions? = null

    public var pix: CheckoutPixPaymentMethodOptions? = null

    public var revolutPay: CheckoutRevolutPayPaymentMethodOptions? = null

    public var samsungPay: CheckoutSamsungPayPaymentMethodOptions? = null

    public var satispay: CheckoutSatispayPaymentMethodOptions? = null

    public var scalapay: CheckoutScalapayPaymentMethodOptions? = null

    public var sepaDebit: CheckoutSepaDebitPaymentMethodOptions? = null

    public var sofort: CheckoutSofortPaymentMethodOptions? = null

    public var sunbit: CheckoutSunbitPaymentMethodOptions? = null

    public var swish: CheckoutSwishPaymentMethodOptions? = null

    public var twint: CheckoutTwintPaymentMethodOptions? = null

    public var upi: CheckoutUpiPaymentMethodOptions? = null

    public var usBankAccount: CheckoutUsBankAccountPaymentMethodOptions? = null

    public var wechatPay: CheckoutWechatPayPaymentMethodOptions? = null

    public fun build(): CheckoutSessionPaymentMethodOptions = CheckoutSessionPaymentMethodOptions(
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
      boleto = boleto,
      card = card,
      cashapp = cashapp,
      customerBalance = customerBalance,
      eps = eps,
      fpx = fpx,
      giropay = giropay,
      grabpay = grabpay,
      ideal = ideal,
      kakaoPay = kakaoPay,
      klarna = klarna,
      konbini = konbini,
      krCard = krCard,
      link = link,
      mobilepay = mobilepay,
      multibanco = multibanco,
      naverPay = naverPay,
      oxxo = oxxo,
      p24 = p24,
      payco = payco,
      paynow = paynow,
      paypal = paypal,
      payto = payto,
      pix = pix,
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
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckoutSessionPaymentMethodOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CheckoutSessionPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckoutSessionPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("CheckoutSessionPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckoutSessionPaymentMethodOptions must be a JSON object")
      return CheckoutSessionPaymentMethodOptions(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<CheckoutAcssDebitPaymentMethodOptions>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<CheckoutAffirmPaymentMethodOptions>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<CheckoutAfterpayClearpayPaymentMethodOptions>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<CheckoutAlipayPaymentMethodOptions>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<CheckoutAlmaPaymentMethodOptions>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<CheckoutAmazonPayPaymentMethodOptions>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<CheckoutAuBecsDebitPaymentMethodOptions>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<CheckoutBacsDebitPaymentMethodOptions>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<CheckoutBancontactPaymentMethodOptions>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<CheckoutBilliePaymentMethodOptions>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<CheckoutBoletoPaymentMethodOptions>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<CheckoutCardPaymentMethodOptions>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<CheckoutCashappPaymentMethodOptions>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<CheckoutCustomerBalancePaymentMethodOptions>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<CheckoutEpsPaymentMethodOptions>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<CheckoutFpxPaymentMethodOptions>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<CheckoutGiropayPaymentMethodOptions>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<CheckoutGrabPayPaymentMethodOptions>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<CheckoutIdealPaymentMethodOptions>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<CheckoutKakaoPayPaymentMethodOptions>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<CheckoutKlarnaPaymentMethodOptions>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<CheckoutKonbiniPaymentMethodOptions>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<CheckoutKrCardPaymentMethodOptions>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<CheckoutLinkPaymentMethodOptions>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<CheckoutMobilepayPaymentMethodOptions>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<CheckoutMultibancoPaymentMethodOptions>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<CheckoutNaverPayPaymentMethodOptions>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<CheckoutOxxoPaymentMethodOptions>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<CheckoutP24PaymentMethodOptions>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<CheckoutPaycoPaymentMethodOptions>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<CheckoutPaynowPaymentMethodOptions>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<CheckoutPaypalPaymentMethodOptions>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<CheckoutPaytoPaymentMethodOptions>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<CheckoutPixPaymentMethodOptions>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<CheckoutRevolutPayPaymentMethodOptions>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<CheckoutSamsungPayPaymentMethodOptions>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<CheckoutSatispayPaymentMethodOptions>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<CheckoutScalapayPaymentMethodOptions>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<CheckoutSepaDebitPaymentMethodOptions>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<CheckoutSofortPaymentMethodOptions>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<CheckoutSunbitPaymentMethodOptions>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<CheckoutSwishPaymentMethodOptions>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<CheckoutTwintPaymentMethodOptions>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<CheckoutUpiPaymentMethodOptions>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<CheckoutUsBankAccountPaymentMethodOptions>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<CheckoutWechatPayPaymentMethodOptions>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckoutSessionPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckoutSessionPaymentMethodOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
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
        value.boleto?.let { put("boleto", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cashapp?.let { put("cashapp", json.encodeToJsonElement(it)) }
        value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
        value.eps?.let { put("eps", json.encodeToJsonElement(it)) }
        value.fpx?.let { put("fpx", json.encodeToJsonElement(it)) }
        value.giropay?.let { put("giropay", json.encodeToJsonElement(it)) }
        value.grabpay?.let { put("grabpay", json.encodeToJsonElement(it)) }
        value.ideal?.let { put("ideal", json.encodeToJsonElement(it)) }
        value.kakaoPay?.let { put("kakao_pay", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.konbini?.let { put("konbini", json.encodeToJsonElement(it)) }
        value.krCard?.let { put("kr_card", json.encodeToJsonElement(it)) }
        value.link?.let { put("link", json.encodeToJsonElement(it)) }
        value.mobilepay?.let { put("mobilepay", json.encodeToJsonElement(it)) }
        value.multibanco?.let { put("multibanco", json.encodeToJsonElement(it)) }
        value.naverPay?.let { put("naver_pay", json.encodeToJsonElement(it)) }
        value.oxxo?.let { put("oxxo", json.encodeToJsonElement(it)) }
        value.p24?.let { put("p24", json.encodeToJsonElement(it)) }
        value.payco?.let { put("payco", json.encodeToJsonElement(it)) }
        value.paynow?.let { put("paynow", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
        value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
        value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
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
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkoutSessionPaymentMethodOptions(block: CheckoutSessionPaymentMethodOptions.Builder.() -> Unit): CheckoutSessionPaymentMethodOptions = CheckoutSessionPaymentMethodOptions.build(block)
