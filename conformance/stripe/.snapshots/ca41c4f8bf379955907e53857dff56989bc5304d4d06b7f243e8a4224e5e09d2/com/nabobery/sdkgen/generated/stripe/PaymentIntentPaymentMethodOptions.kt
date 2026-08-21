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
public data class PaymentIntentPaymentMethodOptionsView(
  @SerialName("acss_debit")
  public val acssDebit: InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253? = null,
  public val affirm: InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5? = null,
  @SerialName("afterpay_clearpay")
  public val afterpayClearpay:
      InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899? = null,
  public val alipay: InlinePaymentIntentPaymentMethodOptionsAlipayXdeb93223? = null,
  public val alma: InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba? = null,
  @SerialName("amazon_pay")
  public val amazonPay: InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec? = null,
  @SerialName("au_becs_debit")
  public val auBecsDebit: InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96? = null,
  @SerialName("bacs_debit")
  public val bacsDebit: InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956? = null,
  public val bancontact: InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d? = null,
  public val billie: InlinePaymentIntentPaymentMethodOptionsBillieXfc138a56? = null,
  public val bizum: InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb? = null,
  public val blik: InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2? = null,
  public val boleto: InlinePaymentIntentPaymentMethodOptionsBoletoXed2b1550? = null,
  public val card: InlinePaymentIntentPaymentMethodOptionsCardX377e78c2? = null,
  @SerialName("card_present")
  public val cardPresent: InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737? = null,
  public val cashapp: InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d? = null,
  public val crypto: InlinePaymentIntentPaymentMethodOptionsCryptoX5609dc30? = null,
  @SerialName("customer_balance")
  public val customerBalance:
      InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e? = null,
  public val eps: InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2? = null,
  public val fpx: InlinePaymentIntentPaymentMethodOptionsFpxX3f98c90f? = null,
  public val giropay: InlinePaymentIntentPaymentMethodOptionsGiropayX966a5a12? = null,
  public val grabpay: InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6? = null,
  public val ideal: InlinePaymentIntentPaymentMethodOptionsIdealXfeaa92f7? = null,
  @SerialName("interac_present")
  public val interacPresent: InlinePaymentIntentPaymentMethodOptionsInteracPresentX295231f8? = null,
  @SerialName("kakao_pay")
  public val kakaoPay: InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08? = null,
  public val klarna: InlinePaymentIntentPaymentMethodOptionsKlarnaXb088a347? = null,
  public val konbini: InlinePaymentIntentPaymentMethodOptionsKonbiniX76392664? = null,
  @SerialName("kr_card")
  public val krCard: InlinePaymentIntentPaymentMethodOptionsKrCardX43e82e0b? = null,
  public val link: InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7? = null,
  @SerialName("mb_way")
  public val mbWay: InlinePaymentIntentPaymentMethodOptionsMbWayX63f59805? = null,
  public val mobilepay: InlinePaymentIntentPaymentMethodOptionsMobilepayXa0143746? = null,
  public val multibanco: InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1? = null,
  @SerialName("naver_pay")
  public val naverPay: InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6? = null,
  @SerialName("nz_bank_account")
  public val nzBankAccount: InlinePaymentIntentPaymentMethodOptionsNzBankAccountX199bce43? = null,
  public val oxxo: InlinePaymentIntentPaymentMethodOptionsOxxoX81c4942d? = null,
  public val p24: InlinePaymentIntentPaymentMethodOptionsP24X0b1f4d64? = null,
  @SerialName("pay_by_bank")
  public val payByBank: InlinePaymentIntentPaymentMethodOptionsPayByBankXaf881de1? = null,
  public val payco: InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3? = null,
  public val paynow: InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32? = null,
  public val paypal: InlinePaymentIntentPaymentMethodOptionsPaypalX39208591? = null,
  public val payto: InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57? = null,
  public val pix: InlinePaymentIntentPaymentMethodOptionsPixXc9f24550? = null,
  public val promptpay: InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19? = null,
  @SerialName("revolut_pay")
  public val revolutPay: InlinePaymentIntentPaymentMethodOptionsRevolutPayX9ef48383? = null,
  @SerialName("samsung_pay")
  public val samsungPay: InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2? = null,
  public val satispay: InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3? = null,
  public val scalapay: InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c? = null,
  @SerialName("sepa_debit")
  public val sepaDebit: InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c? = null,
  public val sofort: InlinePaymentIntentPaymentMethodOptionsSofortX2c9e3d5f? = null,
  public val sunbit: InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0? = null,
  public val swish: InlinePaymentIntentPaymentMethodOptionsSwishXbae2c923? = null,
  public val twint: InlinePaymentIntentPaymentMethodOptionsTwintX7c420c5a? = null,
  public val upi: InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c? = null,
  @SerialName("us_bank_account")
  public val usBankAccount: InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc? = null,
  @SerialName("wechat_pay")
  public val wechatPay: InlinePaymentIntentPaymentMethodOptionsWechatPayX057241c0? = null,
  public val zip: InlinePaymentIntentPaymentMethodOptionsZipX24317875? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options
 */
@Serializable(with = PaymentIntentPaymentMethodOptions.Serializer::class)
public class PaymentIntentPaymentMethodOptions(
  public val acssDebit: InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253? = null,
  public val affirm: InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5? = null,
  public val afterpayClearpay:
      InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899? = null,
  public val alipay: InlinePaymentIntentPaymentMethodOptionsAlipayXdeb93223? = null,
  public val alma: InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba? = null,
  public val amazonPay: InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec? = null,
  public val auBecsDebit: InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96? = null,
  public val bacsDebit: InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956? = null,
  public val bancontact: InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d? = null,
  public val billie: InlinePaymentIntentPaymentMethodOptionsBillieXfc138a56? = null,
  public val bizum: InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb? = null,
  public val blik: InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2? = null,
  public val boleto: InlinePaymentIntentPaymentMethodOptionsBoletoXed2b1550? = null,
  public val card: InlinePaymentIntentPaymentMethodOptionsCardX377e78c2? = null,
  public val cardPresent: InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737? = null,
  public val cashapp: InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d? = null,
  public val crypto: InlinePaymentIntentPaymentMethodOptionsCryptoX5609dc30? = null,
  public val customerBalance:
      InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e? = null,
  public val eps: InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2? = null,
  public val fpx: InlinePaymentIntentPaymentMethodOptionsFpxX3f98c90f? = null,
  public val giropay: InlinePaymentIntentPaymentMethodOptionsGiropayX966a5a12? = null,
  public val grabpay: InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6? = null,
  public val ideal: InlinePaymentIntentPaymentMethodOptionsIdealXfeaa92f7? = null,
  public val interacPresent: InlinePaymentIntentPaymentMethodOptionsInteracPresentX295231f8? = null,
  public val kakaoPay: InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08? = null,
  public val klarna: InlinePaymentIntentPaymentMethodOptionsKlarnaXb088a347? = null,
  public val konbini: InlinePaymentIntentPaymentMethodOptionsKonbiniX76392664? = null,
  public val krCard: InlinePaymentIntentPaymentMethodOptionsKrCardX43e82e0b? = null,
  public val link: InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7? = null,
  public val mbWay: InlinePaymentIntentPaymentMethodOptionsMbWayX63f59805? = null,
  public val mobilepay: InlinePaymentIntentPaymentMethodOptionsMobilepayXa0143746? = null,
  public val multibanco: InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1? = null,
  public val naverPay: InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6? = null,
  public val nzBankAccount: InlinePaymentIntentPaymentMethodOptionsNzBankAccountX199bce43? = null,
  public val oxxo: InlinePaymentIntentPaymentMethodOptionsOxxoX81c4942d? = null,
  public val p24: InlinePaymentIntentPaymentMethodOptionsP24X0b1f4d64? = null,
  public val payByBank: InlinePaymentIntentPaymentMethodOptionsPayByBankXaf881de1? = null,
  public val payco: InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3? = null,
  public val paynow: InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32? = null,
  public val paypal: InlinePaymentIntentPaymentMethodOptionsPaypalX39208591? = null,
  public val payto: InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57? = null,
  public val pix: InlinePaymentIntentPaymentMethodOptionsPixXc9f24550? = null,
  public val promptpay: InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19? = null,
  public val revolutPay: InlinePaymentIntentPaymentMethodOptionsRevolutPayX9ef48383? = null,
  public val samsungPay: InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2? = null,
  public val satispay: InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3? = null,
  public val scalapay: InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c? = null,
  public val sepaDebit: InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c? = null,
  public val sofort: InlinePaymentIntentPaymentMethodOptionsSofortX2c9e3d5f? = null,
  public val sunbit: InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0? = null,
  public val swish: InlinePaymentIntentPaymentMethodOptionsSwishXbae2c923? = null,
  public val twint: InlinePaymentIntentPaymentMethodOptionsTwintX7c420c5a? = null,
  public val upi: InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c? = null,
  public val usBankAccount: InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc? = null,
  public val wechatPay: InlinePaymentIntentPaymentMethodOptionsWechatPayX057241c0? = null,
  public val zip: InlinePaymentIntentPaymentMethodOptionsZipX24317875? = null,
) {
  public class Builder {
    public var acssDebit: InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253? = null

    public var affirm: InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5? = null

    public var afterpayClearpay: InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899? =
        null

    public var alipay: InlinePaymentIntentPaymentMethodOptionsAlipayXdeb93223? = null

    public var alma: InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba? = null

    public var amazonPay: InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec? = null

    public var auBecsDebit: InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96? = null

    public var bacsDebit: InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956? = null

    public var bancontact: InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d? = null

    public var billie: InlinePaymentIntentPaymentMethodOptionsBillieXfc138a56? = null

    public var bizum: InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb? = null

    public var blik: InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2? = null

    public var boleto: InlinePaymentIntentPaymentMethodOptionsBoletoXed2b1550? = null

    public var card: InlinePaymentIntentPaymentMethodOptionsCardX377e78c2? = null

    public var cardPresent: InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737? = null

    public var cashapp: InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d? = null

    public var crypto: InlinePaymentIntentPaymentMethodOptionsCryptoX5609dc30? = null

    public var customerBalance: InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e? =
        null

    public var eps: InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2? = null

    public var fpx: InlinePaymentIntentPaymentMethodOptionsFpxX3f98c90f? = null

    public var giropay: InlinePaymentIntentPaymentMethodOptionsGiropayX966a5a12? = null

    public var grabpay: InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6? = null

    public var ideal: InlinePaymentIntentPaymentMethodOptionsIdealXfeaa92f7? = null

    public var interacPresent: InlinePaymentIntentPaymentMethodOptionsInteracPresentX295231f8? =
        null

    public var kakaoPay: InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08? = null

    public var klarna: InlinePaymentIntentPaymentMethodOptionsKlarnaXb088a347? = null

    public var konbini: InlinePaymentIntentPaymentMethodOptionsKonbiniX76392664? = null

    public var krCard: InlinePaymentIntentPaymentMethodOptionsKrCardX43e82e0b? = null

    public var link: InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7? = null

    public var mbWay: InlinePaymentIntentPaymentMethodOptionsMbWayX63f59805? = null

    public var mobilepay: InlinePaymentIntentPaymentMethodOptionsMobilepayXa0143746? = null

    public var multibanco: InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1? = null

    public var naverPay: InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6? = null

    public var nzBankAccount: InlinePaymentIntentPaymentMethodOptionsNzBankAccountX199bce43? = null

    public var oxxo: InlinePaymentIntentPaymentMethodOptionsOxxoX81c4942d? = null

    public var p24: InlinePaymentIntentPaymentMethodOptionsP24X0b1f4d64? = null

    public var payByBank: InlinePaymentIntentPaymentMethodOptionsPayByBankXaf881de1? = null

    public var payco: InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3? = null

    public var paynow: InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32? = null

    public var paypal: InlinePaymentIntentPaymentMethodOptionsPaypalX39208591? = null

    public var payto: InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57? = null

    public var pix: InlinePaymentIntentPaymentMethodOptionsPixXc9f24550? = null

    public var promptpay: InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19? = null

    public var revolutPay: InlinePaymentIntentPaymentMethodOptionsRevolutPayX9ef48383? = null

    public var samsungPay: InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2? = null

    public var satispay: InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3? = null

    public var scalapay: InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c? = null

    public var sepaDebit: InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c? = null

    public var sofort: InlinePaymentIntentPaymentMethodOptionsSofortX2c9e3d5f? = null

    public var sunbit: InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0? = null

    public var swish: InlinePaymentIntentPaymentMethodOptionsSwishXbae2c923? = null

    public var twint: InlinePaymentIntentPaymentMethodOptionsTwintX7c420c5a? = null

    public var upi: InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c? = null

    public var usBankAccount: InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc? = null

    public var wechatPay: InlinePaymentIntentPaymentMethodOptionsWechatPayX057241c0? = null

    public var zip: InlinePaymentIntentPaymentMethodOptionsZipX24317875? = null

    public fun build(): PaymentIntentPaymentMethodOptions = PaymentIntentPaymentMethodOptions(
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
    public fun build(block: Builder.() -> Unit): PaymentIntentPaymentMethodOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentIntentPaymentMethodOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentIntentPaymentMethodOptions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentPaymentMethodOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentIntentPaymentMethodOptions must be a JSON object")
      return PaymentIntentPaymentMethodOptions(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsAcssDebitXef264253>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsAffirmX05af83c5>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsAfterpayClearpayX1e0bc899>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsAlipayXdeb93223>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsAlmaXd2de18ba>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsAmazonPayX8ca371ec>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsAuBecsDebitX0c408c96>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsBacsDebitXdd6b2956>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsBancontactX57dfdb2d>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsBillieXfc138a56>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsBizumX6a07fbdb>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsBlikX94e475d2>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsBoletoXed2b1550>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardX377e78c2>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCardPresentX6c88b737>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCashappX0fe5ff7d>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCryptoX5609dc30>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsCustomerBalanceXa027f90e>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsEpsX37abbad2>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsFpxX3f98c90f>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsGiropayX966a5a12>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsGrabpayX698ab5c6>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsIdealXfeaa92f7>(it) },
        interacPresent = rawObject["interac_present"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsInteracPresentX295231f8>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsKakaoPayXb58e4a08>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsKlarnaXb088a347>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsKonbiniX76392664>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsKrCardX43e82e0b>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsLinkXfb2037f7>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsMbWayX63f59805>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsMobilepayXa0143746>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsMultibancoX3a8440b1>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsNaverPayXbb2d1bb6>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsNzBankAccountX199bce43>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsOxxoX81c4942d>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsP24X0b1f4d64>(it) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsPayByBankXaf881de1>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsPaycoX8c73e0e3>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsPaynowX5d11ac32>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsPaypalX39208591>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsPaytoXca12dd57>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsPixXc9f24550>(it) },
        promptpay = rawObject["promptpay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsPromptpayXecdd5e19>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsRevolutPayX9ef48383>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsSamsungPayXa21874a2>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsSatispayX7907b0b3>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsScalapayX4750ac7c>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsSepaDebitX34c6728c>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsSofortX2c9e3d5f>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsSunbitX86fca1f0>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsSwishXbae2c923>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsTwintX7c420c5a>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsUpiX6ae5eb7c>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsUsBankAccountX10f42ecc>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsWechatPayX057241c0>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<InlinePaymentIntentPaymentMethodOptionsZipX24317875>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentIntentPaymentMethodOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentPaymentMethodOptions")
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

public fun paymentIntentPaymentMethodOptions(block: PaymentIntentPaymentMethodOptions.Builder.() -> Unit): PaymentIntentPaymentMethodOptions = PaymentIntentPaymentMethodOptions.build(block)
