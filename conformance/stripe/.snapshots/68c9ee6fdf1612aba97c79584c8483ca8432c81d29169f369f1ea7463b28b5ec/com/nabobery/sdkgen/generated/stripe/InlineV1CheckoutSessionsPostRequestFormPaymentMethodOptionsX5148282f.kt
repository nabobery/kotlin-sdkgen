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
 * Payment-method-specific configuration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f(
  public val acssDebit:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7? = null,
  public val affirm:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45? = null,
  public val afterpayClearpay:
      InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a? = null,
  public val alipay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAlipayX74621f22? = null,
  public val alma: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAlmaX35dadc0d? = null,
  public val amazonPay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmazonPayX2366cc50? = null,
  public val auBecsDebit:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAuBecsDebitX9262c279? = null,
  public val bacsDebit:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54? = null,
  public val bancontact:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c? = null,
  public val billie:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6? = null,
  public val boleto:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBoletoX535ddfd1? = null,
  public val card: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c? = null,
  public val cashapp:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCashappXf56d2f5f? = null,
  public val crypto:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCryptoX843f5fb1? = null,
  public val customerBalance:
      InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf? = null,
  public val demoPay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsDemoPayX3a603689? = null,
  public val eps: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a? = null,
  public val fpx: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFpxX16fa716c? = null,
  public val giropay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsGiropayX2a2d582d? = null,
  public val grabpay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsGrabpayXc45c1cfd? = null,
  public val ideal:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsIdealXbce53b95? = null,
  public val kakaoPay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKakaoPayXe8143348? = null,
  public val klarna:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11? = null,
  public val konbini:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9? = null,
  public val krCard:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2? = null,
  public val link: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsLinkX301dbc41? = null,
  public val mobilepay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsMobilepayX7ad839d8? = null,
  public val multibanco:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsMultibancoXbe7dbc98? = null,
  public val naverPay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsNaverPayX1ed8e0c4? = null,
  public val oxxo: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2? = null,
  public val p24: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2? = null,
  public val payByBank: JsonObject? = null,
  public val payco:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaycoX02d5a114? = null,
  public val paynow:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b? = null,
  public val paypal:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5? = null,
  public val payto:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c? = null,
  public val pix: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655? = null,
  public val revolutPay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59? = null,
  public val samsungPay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSamsungPayX974a76a3? = null,
  public val satispay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213? = null,
  public val scalapay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177? = null,
  public val sepaDebit:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9? = null,
  public val sofort:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea? = null,
  public val sunbit:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSunbitX6a9310d7? = null,
  public val swish:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976? = null,
  public val twint:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9? = null,
  public val upi: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd? = null,
  public val usBankAccount: InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff? = null,
  public val wechatPay:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e? = null,
) {
  public class Builder {
    public var acssDebit:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7? = null

    public var affirm: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45? =
        null

    public var afterpayClearpay: InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a? =
        null

    public var alipay: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAlipayX74621f22? =
        null

    public var alma: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAlmaX35dadc0d? =
        null

    public var amazonPay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmazonPayX2366cc50? = null

    public var auBecsDebit:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAuBecsDebitX9262c279? = null

    public var bacsDebit:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54? = null

    public var bancontact:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c? = null

    public var billie: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6? =
        null

    public var boleto: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBoletoX535ddfd1? =
        null

    public var card: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c? =
        null

    public var cashapp: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCashappXf56d2f5f?
        = null

    public var crypto: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCryptoX843f5fb1? =
        null

    public var customerBalance: InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf? =
        null

    public var demoPay: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsDemoPayX3a603689?
        = null

    public var eps: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a? = null

    public var fpx: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFpxX16fa716c? = null

    public var giropay: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsGiropayX2a2d582d?
        = null

    public var grabpay: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsGrabpayXc45c1cfd?
        = null

    public var ideal: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsIdealXbce53b95? =
        null

    public var kakaoPay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKakaoPayXe8143348? = null

    public var klarna: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11? =
        null

    public var konbini: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9?
        = null

    public var krCard: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2? =
        null

    public var link: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsLinkX301dbc41? =
        null

    public var mobilepay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsMobilepayX7ad839d8? = null

    public var multibanco:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsMultibancoXbe7dbc98? = null

    public var naverPay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsNaverPayX1ed8e0c4? = null

    public var oxxo: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2? =
        null

    public var p24: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2? = null

    public var payByBank: JsonObject? = null

    public var payco: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaycoX02d5a114? =
        null

    public var paynow: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b? =
        null

    public var paypal: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5? =
        null

    public var payto: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c? =
        null

    public var pix: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655? = null

    public var revolutPay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59? = null

    public var samsungPay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSamsungPayX974a76a3? = null

    public var satispay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213? = null

    public var scalapay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177? = null

    public var sepaDebit:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9? = null

    public var sofort: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea? =
        null

    public var sunbit: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSunbitX6a9310d7? =
        null

    public var swish: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976? =
        null

    public var twint: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9? =
        null

    public var upi: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd? = null

    public var usBankAccount: InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff? = null

    public var wechatPay:
        InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f(
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
      crypto = crypto,
      customerBalance = customerBalance,
      demoPay = demoPay,
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
      payByBank = payByBank,
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
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAcssDebitXac9f7ce7>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAffirmXde65fe45>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormAfterpayClearpayX1acb765a>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAlipayX74621f22>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAlmaX35dadc0d>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAmazonPayX2366cc50>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAuBecsDebitX9262c279>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBacsDebitXb013bd54>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBancontactX6629fa0c>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBoletoX535ddfd1>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardX201c881c>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCashappXf56d2f5f>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCryptoX843f5fb1>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomerBalanceX2dd87faf>(it) },
        demoPay = rawObject["demo_pay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsDemoPayX3a603689>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsEpsX97eef94a>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsFpxX16fa716c>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsGiropayX2a2d582d>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsGrabpayXc45c1cfd>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsIdealXbce53b95>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKakaoPayXe8143348>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaX42cdab11>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKonbiniX4dcc58b9>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKrCardX1e1d0fe2>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsLinkX301dbc41>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsMobilepayX7ad839d8>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsMultibancoXbe7dbc98>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsNaverPayX1ed8e0c4>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsOxxoXa5a230e2>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsP24X2fb436c2>(it) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaycoX02d5a114>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaynowX8c4dcd6b>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaypalXac29a9a5>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoX995b180c>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPixXd32d3655>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRevolutPayXd4e80b59>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSamsungPayX974a76a3>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsScalapayX0002d177>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSepaDebitXe692f7d9>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSofortX06aa01ea>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSunbitX6a9310d7>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSwishX76e8d976>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTwintX3c8dc3d9>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsUpiX1701d4cd>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormUsBankAccountX92a530ff>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsWechatPayXed5c510e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f")
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
        value.crypto?.let { put("crypto", json.encodeToJsonElement(it)) }
        value.customerBalance?.let { put("customer_balance", json.encodeToJsonElement(it)) }
        value.demoPay?.let { put("demo_pay", json.encodeToJsonElement(it)) }
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
        value.payByBank?.let { put("pay_by_bank", json.encodeToJsonElement(it)) }
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

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsX5148282f.build(block)
