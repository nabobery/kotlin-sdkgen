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
 * Payment method-specific configuration for this PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737(
  public val acssDebit:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9? = null,
  public val affirm:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b? = null,
  public val afterpayClearpay:
      InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4? = null,
  public val alipay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce? = null,
  public val alma: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6? = null,
  public val amazonPay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0? = null,
  public val auBecsDebit:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be? = null,
  public val bacsDebit:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc? = null,
  public val bancontact:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564? = null,
  public val billie:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3? = null,
  public val bizum: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3? = null,
  public val blik: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12? = null,
  public val boleto:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30? = null,
  public val card: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3? = null,
  public val cardPresent:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentXb81d8b27? = null,
  public val cashapp:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209? = null,
  public val crypto:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c? = null,
  public val customerBalance: InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419? = null,
  public val eps: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b? = null,
  public val fpx: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad? = null,
  public val giropay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee? = null,
  public val grabpay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060? = null,
  public val ideal: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4? = null,
  public val interacPresent:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f? = null,
  public val kakaoPay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034? = null,
  public val klarna:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e? = null,
  public val konbini:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c? = null,
  public val krCard:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977? = null,
  public val link: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab? = null,
  public val mbWay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94? = null,
  public val mobilepay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX5ec01cb8? = null,
  public val multibanco:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda? = null,
  public val naverPay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447? = null,
  public val nzBankAccount:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6? = null,
  public val oxxo: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXccb2ba58? = null,
  public val p24: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851? = null,
  public val payByBank:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa3b66701? = null,
  public val payco: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3? = null,
  public val paynow:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941? = null,
  public val paypal:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97? = null,
  public val payto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8? = null,
  public val pix: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953? = null,
  public val promptpay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d? = null,
  public val revolutPay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34? = null,
  public val samsungPay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5? = null,
  public val satispay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9? = null,
  public val scalapay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2? = null,
  public val sepaDebit:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6? = null,
  public val sofort:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442? = null,
  public val sunbit:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82? = null,
  public val swish: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishX165771d7? = null,
  public val twint: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed? = null,
  public val upi: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476? = null,
  public val usBankAccount:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX0e005de5? = null,
  public val wechatPay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff? = null,
  public val zip: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437? = null,
) {
  public class Builder {
    public var acssDebit:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9? = null

    public var affirm: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b? =
        null

    public var afterpayClearpay: InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4? =
        null

    public var alipay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce? =
        null

    public var alma: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6? = null

    public var amazonPay:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0? = null

    public var auBecsDebit:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be? = null

    public var bacsDebit:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc? = null

    public var bancontact:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564? = null

    public var billie: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3? =
        null

    public var bizum: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3? =
        null

    public var blik: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12? = null

    public var boleto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30? =
        null

    public var card: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3? = null

    public var cardPresent:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentXb81d8b27? = null

    public var cashapp: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209? =
        null

    public var crypto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c? =
        null

    public var customerBalance: InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419? =
        null

    public var eps: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b? = null

    public var fpx: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad? = null

    public var giropay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee? =
        null

    public var grabpay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060? =
        null

    public var ideal: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4? =
        null

    public var interacPresent:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f? = null

    public var kakaoPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034?
        = null

    public var klarna: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e? =
        null

    public var konbini: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c? =
        null

    public var krCard: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977? =
        null

    public var link: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab? = null

    public var mbWay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94? =
        null

    public var mobilepay:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX5ec01cb8? = null

    public var multibanco:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda? = null

    public var naverPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447?
        = null

    public var nzBankAccount:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6? = null

    public var oxxo: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXccb2ba58? = null

    public var p24: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851? = null

    public var payByBank:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa3b66701? = null

    public var payco: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3? =
        null

    public var paynow: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941? =
        null

    public var paypal: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97? =
        null

    public var payto: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8? =
        null

    public var pix: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953? = null

    public var promptpay:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d? = null

    public var revolutPay:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34? = null

    public var samsungPay:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5? = null

    public var satispay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9?
        = null

    public var scalapay: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2?
        = null

    public var sepaDebit:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6? = null

    public var sofort: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442? =
        null

    public var sunbit: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82? =
        null

    public var swish: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishX165771d7? =
        null

    public var twint: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed? =
        null

    public var upi: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476? = null

    public var usBankAccount:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX0e005de5? = null

    public var wechatPay:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff? = null

    public var zip: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737(
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
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAcssDebitXbdbb2dd9>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX176f345b>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAfterpayClearpayX604a81a4>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlipayXedb56fce>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAlmaXe8a717b6>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAmazonPayXf2706fb0>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAuBecsDebitX1eb797be>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBacsDebitX05efcacc>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactX1e927564>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBillieX6c325ab3>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBizumXbadc78a3>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBlikX617a3e12>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBoletoXd231be30>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardX80c94eb3>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCardPresentXb81d8b27>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCashappXd1bbc209>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCryptoX7208dd4c>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormCustomerBalanceX13b3a419>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsEpsX0005db1b>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsFpxXd72ec4ad>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGiropayXbaa417ee>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsGrabpayX02b90060>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsIdealXbce30ca4>(it) },
        interacPresent = rawObject["interac_present"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsInteracPresentX232e743f>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKakaoPayX08595034>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaX0330a20e>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniXfb8ad17c>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKrCardXca2cc977>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkX56a124ab>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMbWayX947abe94>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMobilepayX5ec01cb8>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMultibancoX172edcda>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNaverPayX92e80447>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsNzBankAccountXefc4c9d6>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsOxxoXccb2ba58>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsP24X0ac86851>(it) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPayByBankXa3b66701>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaycoX22cf2ae3>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaynowXad18c941>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaypalX972cbd97>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPaytoX6d5fd2b8>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPixX9933e953>(it) },
        promptpay = rawObject["promptpay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsPromptpayXa677617d>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRevolutPayXf5f80a34>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSamsungPayX706dade5>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSatispayX0e1297d9>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayX955bc8d2>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSepaDebitX3404f1a6>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSofortX47f21442>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitXd14ede82>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishX165771d7>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTwintX98b611ed>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUpiXe8f7c476>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsUsBankAccountX0e005de5>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsWechatPayXaae473ff>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsZipX44789437>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737")
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsX2fea4737.build(block)
