package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
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

/**
 * If provided, this hash will be used to create a PaymentMethod. The new PaymentMethod will appear
 * in the [payment_method](https://docs.stripe.com/api/payment_intents/object#payment_intent_object-payment_method)
 * property on the PaymentIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_data
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba(
  public val type: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataTypeX2848ed54,
  public val acssDebit:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAcssDebitXfa05ea49? = null,
  public val affirm: JsonObject? = null,
  public val afterpayClearpay: JsonObject? = null,
  public val alipay: JsonObject? = null,
  public val allowRedisplay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAllowRedisplayXada9525b? = null,
  public val alma: JsonObject? = null,
  public val amazonPay: JsonObject? = null,
  public val auBecsDebit:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAuBecsDebitX80b01afd? = null,
  public val bacsDebit:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXafd7c9f2? = null,
  public val bancontact: JsonObject? = null,
  public val billie: JsonObject? = null,
  public val billingDetails:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e? = null,
  public val bizum: JsonObject? = null,
  public val blik: JsonObject? = null,
  public val boleto: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4? = null,
  public val cashapp: JsonObject? = null,
  public val crypto: JsonObject? = null,
  public val customerBalance: JsonObject? = null,
  public val eps: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsX78d815c7? = null,
  public val fpx: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d? = null,
  public val giropay: JsonObject? = null,
  public val grabpay: JsonObject? = null,
  public val ideal: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX9af01c84? = null,
  public val interacPresent: JsonObject? = null,
  public val kakaoPay: JsonObject? = null,
  public val klarna: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaXf43b26c3? = null,
  public val konbini: JsonObject? = null,
  public val krCard: JsonObject? = null,
  public val link: JsonObject? = null,
  public val mbWay: JsonObject? = null,
  metadata: Map<String, String>? = null,
  public val mobilepay: JsonObject? = null,
  public val multibanco: JsonObject? = null,
  public val naverPay:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayXd162f8c0? = null,
  public val nzBankAccount:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNzBankAccountXccf4ebef? = null,
  public val oxxo: JsonObject? = null,
  public val p24: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xa9c94549? = null,
  public val payByBank: JsonObject? = null,
  public val payco: JsonObject? = null,
  public val paynow: JsonObject? = null,
  public val paypal: JsonObject? = null,
  public val payto: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599? = null,
  public val pix: JsonObject? = null,
  public val promptpay: JsonObject? = null,
  public val radarOptions:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataRadarOptionsX04473462? = null,
  public val revolutPay: JsonObject? = null,
  public val samsungPay: JsonObject? = null,
  public val satispay: JsonObject? = null,
  public val scalapay: JsonObject? = null,
  public val sepaDebit:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d? = null,
  public val sofort: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortX4cae65f8? = null,
  public val sunbit: JsonObject? = null,
  public val swish: JsonObject? = null,
  public val twint: JsonObject? = null,
  public val upi: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7? = null,
  public val usBankAccount:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountXea50d12b? = null,
  public val wechatPay: JsonObject? = null,
  public val zip: JsonObject? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var typeValue: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataTypeX2848ed54? =
        null

    public var type: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataTypeX2848ed54
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var acssDebit: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAcssDebitXfa05ea49?
        = null

    public var affirm: JsonObject? = null

    public var afterpayClearpay: JsonObject? = null

    public var alipay: JsonObject? = null

    public var allowRedisplay:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAllowRedisplayXada9525b? = null

    public var alma: JsonObject? = null

    public var amazonPay: JsonObject? = null

    public var auBecsDebit:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAuBecsDebitX80b01afd? = null

    public var bacsDebit: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXafd7c9f2?
        = null

    public var bancontact: JsonObject? = null

    public var billie: JsonObject? = null

    public var billingDetails:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e? = null

    public var bizum: JsonObject? = null

    public var blik: JsonObject? = null

    public var boleto: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4? = null

    public var cashapp: JsonObject? = null

    public var crypto: JsonObject? = null

    public var customerBalance: JsonObject? = null

    public var eps: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsX78d815c7? = null

    public var fpx: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d? = null

    public var giropay: JsonObject? = null

    public var grabpay: JsonObject? = null

    public var ideal: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX9af01c84? = null

    public var interacPresent: JsonObject? = null

    public var kakaoPay: JsonObject? = null

    public var klarna: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaXf43b26c3? = null

    public var konbini: JsonObject? = null

    public var krCard: JsonObject? = null

    public var link: JsonObject? = null

    public var mbWay: JsonObject? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var mobilepay: JsonObject? = null

    public var multibanco: JsonObject? = null

    public var naverPay: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayXd162f8c0? =
        null

    public var nzBankAccount:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNzBankAccountXccf4ebef? = null

    public var oxxo: JsonObject? = null

    public var p24: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xa9c94549? = null

    public var payByBank: JsonObject? = null

    public var payco: JsonObject? = null

    public var paynow: JsonObject? = null

    public var paypal: JsonObject? = null

    public var payto: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599? = null

    public var pix: JsonObject? = null

    public var promptpay: JsonObject? = null

    public var radarOptions:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataRadarOptionsX04473462? = null

    public var revolutPay: JsonObject? = null

    public var samsungPay: JsonObject? = null

    public var satispay: JsonObject? = null

    public var scalapay: JsonObject? = null

    public var sepaDebit: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d?
        = null

    public var sofort: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortX4cae65f8? = null

    public var sunbit: JsonObject? = null

    public var swish: JsonObject? = null

    public var twint: JsonObject? = null

    public var upi: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7? = null

    public var usBankAccount:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountXea50d12b? = null

    public var wechatPay: JsonObject? = null

    public var zip: JsonObject? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba(
        type = type,
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
        metadata = metadata,
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
        upi = upi,
        usBankAccount = usBankAccount,
        wechatPay = wechatPay,
        zip = zip,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba must be a JSON object")
      val type = json.decodeRequired<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataTypeX2848ed54>(rawObject, "type")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba(
        type = type,
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAcssDebitXfa05ea49>(it) },
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        allowRedisplay = rawObject["allow_redisplay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAllowRedisplayXada9525b>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataAuBecsDebitX80b01afd>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBacsDebitXafd7c9f2>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        billie = rawObject["billie"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        billingDetails = rawObject["billing_details"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBillingDetailsX7150351e>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataBoletoX4f8ac3f4>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        customerBalance = rawObject["customer_balance"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataEpsX78d815c7>(it) },
        fpx = rawObject["fpx"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataFpxXa855808d>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataIdealX9af01c84>(it) },
        interacPresent = rawObject["interac_present"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataKlarnaXf43b26c3>(it) },
        konbini = rawObject["konbini"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        mobilepay = rawObject["mobilepay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNaverPayXd162f8c0>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataNzBankAccountXccf4ebef>(it) },
        oxxo = rawObject["oxxo"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataP24Xa9c94549>(it) },
        payByBank = rawObject["pay_by_bank"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        payco = rawObject["payco"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataPaytoXf7bd4599>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        promptpay = rawObject["promptpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        radarOptions = rawObject["radar_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataRadarOptionsX04473462>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        samsungPay = rawObject["samsung_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSepaDebitXb3187e7d>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataSofortX4cae65f8>(it) },
        sunbit = rawObject["sunbit"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUpiX270467f7>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodDataUsBankAccountXea50d12b>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
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
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
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
        value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
        value.wechatPay?.let { put("wechat_pay", json.encodeToJsonElement(it)) }
        value.zip?.let { put("zip", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba = InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodDataXe0bd76ba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
