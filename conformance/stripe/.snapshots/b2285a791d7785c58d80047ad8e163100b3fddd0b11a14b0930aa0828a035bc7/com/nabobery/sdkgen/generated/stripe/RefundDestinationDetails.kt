package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/refund_destination_details
 */
@Serializable(with = RefundDestinationDetails.Serializer::class)
public class RefundDestinationDetails(
  /**
   * The type of transaction-specific details of the payment method used in the refund (e.g., `card`). An additional
   * hash is included on `destination_details` with a name matching this value. It contains information specific to the
   * refund transaction.
   */
  public val type: String,
  public val affirm: JsonObject? = null,
  public val afterpayClearpay: JsonObject? = null,
  public val alipay: JsonObject? = null,
  public val alma: JsonObject? = null,
  public val amazonPay: JsonObject? = null,
  public val auBankTransfer: JsonObject? = null,
  public val blik: RefundDestinationDetailsBlik? = null,
  public val brBankTransfer: RefundDestinationDetailsBrBankTransfer? = null,
  public val card: RefundDestinationDetailsCard? = null,
  public val cashapp: JsonObject? = null,
  public val crypto: RefundDestinationDetailsCrypto? = null,
  public val customerCashBalance: JsonObject? = null,
  public val eps: JsonObject? = null,
  public val euBankTransfer: RefundDestinationDetailsEuBankTransfer? = null,
  public val gbBankTransfer: RefundDestinationDetailsGbBankTransfer? = null,
  public val giropay: JsonObject? = null,
  public val grabpay: JsonObject? = null,
  public val jpBankTransfer: RefundDestinationDetailsJpBankTransfer? = null,
  public val klarna: JsonObject? = null,
  public val mbWay: RefundDestinationDetailsMbWay? = null,
  public val multibanco: RefundDestinationDetailsMultibanco? = null,
  public val mxBankTransfer: RefundDestinationDetailsMxBankTransfer? = null,
  public val nzBankTransfer: JsonObject? = null,
  public val p24: RefundDestinationDetailsP24? = null,
  public val paynow: JsonObject? = null,
  public val paypal: RefundDestinationDetailsPaypal? = null,
  public val pix: JsonObject? = null,
  public val revolut: JsonObject? = null,
  public val scalapay: JsonObject? = null,
  public val sofort: JsonObject? = null,
  public val swish: RefundDestinationDetailsSwish? = null,
  public val thBankTransfer: RefundDestinationDetailsThBankTransfer? = null,
  public val twint: JsonObject? = null,
  public val usBankTransfer: RefundDestinationDetailsUsBankTransfer? = null,
  public val wechatPay: JsonObject? = null,
  public val zip: JsonObject? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var affirm: JsonObject? = null

    public var afterpayClearpay: JsonObject? = null

    public var alipay: JsonObject? = null

    public var alma: JsonObject? = null

    public var amazonPay: JsonObject? = null

    public var auBankTransfer: JsonObject? = null

    public var blik: RefundDestinationDetailsBlik? = null

    public var brBankTransfer: RefundDestinationDetailsBrBankTransfer? = null

    public var card: RefundDestinationDetailsCard? = null

    public var cashapp: JsonObject? = null

    public var crypto: RefundDestinationDetailsCrypto? = null

    public var customerCashBalance: JsonObject? = null

    public var eps: JsonObject? = null

    public var euBankTransfer: RefundDestinationDetailsEuBankTransfer? = null

    public var gbBankTransfer: RefundDestinationDetailsGbBankTransfer? = null

    public var giropay: JsonObject? = null

    public var grabpay: JsonObject? = null

    public var jpBankTransfer: RefundDestinationDetailsJpBankTransfer? = null

    public var klarna: JsonObject? = null

    public var mbWay: RefundDestinationDetailsMbWay? = null

    public var multibanco: RefundDestinationDetailsMultibanco? = null

    public var mxBankTransfer: RefundDestinationDetailsMxBankTransfer? = null

    public var nzBankTransfer: JsonObject? = null

    public var p24: RefundDestinationDetailsP24? = null

    public var paynow: JsonObject? = null

    public var paypal: RefundDestinationDetailsPaypal? = null

    public var pix: JsonObject? = null

    public var revolut: JsonObject? = null

    public var scalapay: JsonObject? = null

    public var sofort: JsonObject? = null

    public var swish: RefundDestinationDetailsSwish? = null

    public var thBankTransfer: RefundDestinationDetailsThBankTransfer? = null

    public var twint: JsonObject? = null

    public var usBankTransfer: RefundDestinationDetailsUsBankTransfer? = null

    public var wechatPay: JsonObject? = null

    public var zip: JsonObject? = null

    public fun build(): RefundDestinationDetails {
      check(typeValue != null) { "type is required" }
      return RefundDestinationDetails(
        type = type,
        affirm = affirm,
        afterpayClearpay = afterpayClearpay,
        alipay = alipay,
        alma = alma,
        amazonPay = amazonPay,
        auBankTransfer = auBankTransfer,
        blik = blik,
        brBankTransfer = brBankTransfer,
        card = card,
        cashapp = cashapp,
        crypto = crypto,
        customerCashBalance = customerCashBalance,
        eps = eps,
        euBankTransfer = euBankTransfer,
        gbBankTransfer = gbBankTransfer,
        giropay = giropay,
        grabpay = grabpay,
        jpBankTransfer = jpBankTransfer,
        klarna = klarna,
        mbWay = mbWay,
        multibanco = multibanco,
        mxBankTransfer = mxBankTransfer,
        nzBankTransfer = nzBankTransfer,
        p24 = p24,
        paynow = paynow,
        paypal = paypal,
        pix = pix,
        revolut = revolut,
        scalapay = scalapay,
        sofort = sofort,
        swish = swish,
        thBankTransfer = thBankTransfer,
        twint = twint,
        usBankTransfer = usBankTransfer,
        wechatPay = wechatPay,
        zip = zip,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RefundDestinationDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RefundDestinationDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RefundDestinationDetails {
      val jsonDecoder = decoder.requireJsonDecoder("RefundDestinationDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RefundDestinationDetails must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return RefundDestinationDetails(
        type = type,
        affirm = rawObject["affirm"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        afterpayClearpay = rawObject["afterpay_clearpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        alipay = rawObject["alipay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        alma = rawObject["alma"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        auBankTransfer = rawObject["au_bank_transfer"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        blik = rawObject["blik"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsBlik>(it) },
        brBankTransfer = rawObject["br_bank_transfer"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsBrBankTransfer>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsCard>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        crypto = rawObject["crypto"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsCrypto>(it) },
        customerCashBalance = rawObject["customer_cash_balance"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        eps = rawObject["eps"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        euBankTransfer = rawObject["eu_bank_transfer"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsEuBankTransfer>(it) },
        gbBankTransfer = rawObject["gb_bank_transfer"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsGbBankTransfer>(it) },
        giropay = rawObject["giropay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        grabpay = rawObject["grabpay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        jpBankTransfer = rawObject["jp_bank_transfer"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsJpBankTransfer>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        mbWay = rawObject["mb_way"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsMbWay>(it) },
        multibanco = rawObject["multibanco"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsMultibanco>(it) },
        mxBankTransfer = rawObject["mx_bank_transfer"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsMxBankTransfer>(it) },
        nzBankTransfer = rawObject["nz_bank_transfer"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        p24 = rawObject["p24"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsP24>(it) },
        paynow = rawObject["paynow"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsPaypal>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        revolut = rawObject["revolut"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        scalapay = rawObject["scalapay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        swish = rawObject["swish"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsSwish>(it) },
        thBankTransfer = rawObject["th_bank_transfer"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsThBankTransfer>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        usBankTransfer = rawObject["us_bank_transfer"]?.let { json.decodeFromJsonElement<RefundDestinationDetailsUsBankTransfer>(it) },
        wechatPay = rawObject["wechat_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        zip = rawObject["zip"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RefundDestinationDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("RefundDestinationDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.affirm?.let { put("affirm", json.encodeToJsonElement(it)) }
        value.afterpayClearpay?.let { put("afterpay_clearpay", json.encodeToJsonElement(it)) }
        value.alipay?.let { put("alipay", json.encodeToJsonElement(it)) }
        value.alma?.let { put("alma", json.encodeToJsonElement(it)) }
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.auBankTransfer?.let { put("au_bank_transfer", json.encodeToJsonElement(it)) }
        value.blik?.let { put("blik", json.encodeToJsonElement(it)) }
        value.brBankTransfer?.let { put("br_bank_transfer", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cashapp?.let { put("cashapp", json.encodeToJsonElement(it)) }
        value.crypto?.let { put("crypto", json.encodeToJsonElement(it)) }
        value.customerCashBalance?.let { put("customer_cash_balance", json.encodeToJsonElement(it)) }
        value.eps?.let { put("eps", json.encodeToJsonElement(it)) }
        value.euBankTransfer?.let { put("eu_bank_transfer", json.encodeToJsonElement(it)) }
        value.gbBankTransfer?.let { put("gb_bank_transfer", json.encodeToJsonElement(it)) }
        value.giropay?.let { put("giropay", json.encodeToJsonElement(it)) }
        value.grabpay?.let { put("grabpay", json.encodeToJsonElement(it)) }
        value.jpBankTransfer?.let { put("jp_bank_transfer", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.mbWay?.let { put("mb_way", json.encodeToJsonElement(it)) }
        value.multibanco?.let { put("multibanco", json.encodeToJsonElement(it)) }
        value.mxBankTransfer?.let { put("mx_bank_transfer", json.encodeToJsonElement(it)) }
        value.nzBankTransfer?.let { put("nz_bank_transfer", json.encodeToJsonElement(it)) }
        value.p24?.let { put("p24", json.encodeToJsonElement(it)) }
        value.paynow?.let { put("paynow", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
        value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
        value.revolut?.let { put("revolut", json.encodeToJsonElement(it)) }
        value.scalapay?.let { put("scalapay", json.encodeToJsonElement(it)) }
        value.sofort?.let { put("sofort", json.encodeToJsonElement(it)) }
        value.swish?.let { put("swish", json.encodeToJsonElement(it)) }
        value.thBankTransfer?.let { put("th_bank_transfer", json.encodeToJsonElement(it)) }
        value.twint?.let { put("twint", json.encodeToJsonElement(it)) }
        value.usBankTransfer?.let { put("us_bank_transfer", json.encodeToJsonElement(it)) }
        value.wechatPay?.let { put("wechat_pay", json.encodeToJsonElement(it)) }
        value.zip?.let { put("zip", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun refundDestinationDetails(block: RefundDestinationDetails.Builder.() -> Unit): RefundDestinationDetails = RefundDestinationDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RefundDestinationDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
