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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_payment_method_details
 */
@Serializable(with = MandatePaymentMethodDetails.Serializer::class)
public class MandatePaymentMethodDetails(
  /**
   * This mandate corresponds with a specific payment method type. The `payment_method_details` includes an additional
   * hash with the same name and contains mandate information that's specific to that payment method.
   */
  public val type: String,
  public val acssDebit: MandateAcssDebit? = null,
  public val amazonPay: JsonObject? = null,
  public val auBecsDebit: MandateAuBecsDebit? = null,
  public val bacsDebit: MandateBacsDebit? = null,
  public val card: JsonObject? = null,
  public val cashapp: JsonObject? = null,
  public val kakaoPay: JsonObject? = null,
  public val klarna: JsonObject? = null,
  public val krCard: JsonObject? = null,
  public val link: JsonObject? = null,
  public val naverPay: JsonObject? = null,
  public val nzBankAccount: JsonObject? = null,
  public val paypal: MandatePaypal? = null,
  public val payto: MandatePayto? = null,
  public val pix: MandatePix? = null,
  public val revolutPay: JsonObject? = null,
  public val sepaDebit: MandateSepaDebit? = null,
  public val twint: JsonObject? = null,
  public val upi: MandateUpi? = null,
  public val usBankAccount: MandateUsBankAccount? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var acssDebit: MandateAcssDebit? = null

    public var amazonPay: JsonObject? = null

    public var auBecsDebit: MandateAuBecsDebit? = null

    public var bacsDebit: MandateBacsDebit? = null

    public var card: JsonObject? = null

    public var cashapp: JsonObject? = null

    public var kakaoPay: JsonObject? = null

    public var klarna: JsonObject? = null

    public var krCard: JsonObject? = null

    public var link: JsonObject? = null

    public var naverPay: JsonObject? = null

    public var nzBankAccount: JsonObject? = null

    public var paypal: MandatePaypal? = null

    public var payto: MandatePayto? = null

    public var pix: MandatePix? = null

    public var revolutPay: JsonObject? = null

    public var sepaDebit: MandateSepaDebit? = null

    public var twint: JsonObject? = null

    public var upi: MandateUpi? = null

    public var usBankAccount: MandateUsBankAccount? = null

    public fun build(): MandatePaymentMethodDetails {
      check(typeValue != null) { "type is required" }
      return MandatePaymentMethodDetails(
        type = type,
        acssDebit = acssDebit,
        amazonPay = amazonPay,
        auBecsDebit = auBecsDebit,
        bacsDebit = bacsDebit,
        card = card,
        cashapp = cashapp,
        kakaoPay = kakaoPay,
        klarna = klarna,
        krCard = krCard,
        link = link,
        naverPay = naverPay,
        nzBankAccount = nzBankAccount,
        paypal = paypal,
        payto = payto,
        pix = pix,
        revolutPay = revolutPay,
        sepaDebit = sepaDebit,
        twint = twint,
        upi = upi,
        usBankAccount = usBankAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MandatePaymentMethodDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<MandatePaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MandatePaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("MandatePaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MandatePaymentMethodDetails must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return MandatePaymentMethodDetails(
        type = type,
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<MandateAcssDebit>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<MandateAuBecsDebit>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<MandateBacsDebit>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<MandatePaypal>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<MandatePayto>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<MandatePix>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<MandateSepaDebit>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<MandateUpi>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<MandateUsBankAccount>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MandatePaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("MandatePaymentMethodDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.auBecsDebit?.let { put("au_becs_debit", json.encodeToJsonElement(it)) }
        value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cashapp?.let { put("cashapp", json.encodeToJsonElement(it)) }
        value.kakaoPay?.let { put("kakao_pay", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.krCard?.let { put("kr_card", json.encodeToJsonElement(it)) }
        value.link?.let { put("link", json.encodeToJsonElement(it)) }
        value.naverPay?.let { put("naver_pay", json.encodeToJsonElement(it)) }
        value.nzBankAccount?.let { put("nz_bank_account", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
        value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
        value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
        value.revolutPay?.let { put("revolut_pay", json.encodeToJsonElement(it)) }
        value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
        value.twint?.let { put("twint", json.encodeToJsonElement(it)) }
        value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mandatePaymentMethodDetails(block: MandatePaymentMethodDetails.Builder.() -> Unit): MandatePaymentMethodDetails = MandatePaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("MandatePaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
