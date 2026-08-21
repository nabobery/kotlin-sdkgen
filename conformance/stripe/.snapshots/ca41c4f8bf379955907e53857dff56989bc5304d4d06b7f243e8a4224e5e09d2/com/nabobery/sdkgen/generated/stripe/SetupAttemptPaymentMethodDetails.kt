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
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_attempt_payment_method_details
 */
@Serializable(with = SetupAttemptPaymentMethodDetails.Serializer::class)
public class SetupAttemptPaymentMethodDetails(
  /**
   * The type of the payment method used in the SetupIntent (e.g., `card`). An additional hash is included on
   * `payment_method_details` with a name matching this value. It contains confirmation-specific information for the
   * payment method.
   */
  public val type: String,
  public val acssDebit: JsonObject? = null,
  public val amazonPay: JsonObject? = null,
  public val auBecsDebit: JsonObject? = null,
  public val bacsDebit: JsonObject? = null,
  public val bancontact: SetupAttemptPaymentMethodDetailsBancontact? = null,
  public val boleto: JsonObject? = null,
  public val card: SetupAttemptPaymentMethodDetailsCard? = null,
  public val cardPresent: SetupAttemptPaymentMethodDetailsCardPresent? = null,
  public val cashapp: JsonObject? = null,
  public val ideal: SetupAttemptPaymentMethodDetailsIdeal? = null,
  public val kakaoPay: JsonObject? = null,
  public val klarna: JsonObject? = null,
  public val krCard: JsonObject? = null,
  public val link: JsonObject? = null,
  public val naverPay: SetupAttemptPaymentMethodDetailsNaverPay? = null,
  public val nzBankAccount: JsonObject? = null,
  public val paypal: JsonObject? = null,
  public val payto: JsonObject? = null,
  public val pix: SetupAttemptPaymentMethodDetailsPix? = null,
  public val revolutPay: JsonObject? = null,
  public val satispay: JsonObject? = null,
  public val sepaDebit: JsonObject? = null,
  public val sofort: SetupAttemptPaymentMethodDetailsSofort? = null,
  public val twint: JsonObject? = null,
  public val upi: JsonObject? = null,
  public val usBankAccount: JsonObject? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var acssDebit: JsonObject? = null

    public var amazonPay: JsonObject? = null

    public var auBecsDebit: JsonObject? = null

    public var bacsDebit: JsonObject? = null

    public var bancontact: SetupAttemptPaymentMethodDetailsBancontact? = null

    public var boleto: JsonObject? = null

    public var card: SetupAttemptPaymentMethodDetailsCard? = null

    public var cardPresent: SetupAttemptPaymentMethodDetailsCardPresent? = null

    public var cashapp: JsonObject? = null

    public var ideal: SetupAttemptPaymentMethodDetailsIdeal? = null

    public var kakaoPay: JsonObject? = null

    public var klarna: JsonObject? = null

    public var krCard: JsonObject? = null

    public var link: JsonObject? = null

    public var naverPay: SetupAttemptPaymentMethodDetailsNaverPay? = null

    public var nzBankAccount: JsonObject? = null

    public var paypal: JsonObject? = null

    public var payto: JsonObject? = null

    public var pix: SetupAttemptPaymentMethodDetailsPix? = null

    public var revolutPay: JsonObject? = null

    public var satispay: JsonObject? = null

    public var sepaDebit: JsonObject? = null

    public var sofort: SetupAttemptPaymentMethodDetailsSofort? = null

    public var twint: JsonObject? = null

    public var upi: JsonObject? = null

    public var usBankAccount: JsonObject? = null

    public fun build(): SetupAttemptPaymentMethodDetails {
      check(typeValue != null) { "type is required" }
      return SetupAttemptPaymentMethodDetails(
        type = type,
        acssDebit = acssDebit,
        amazonPay = amazonPay,
        auBecsDebit = auBecsDebit,
        bacsDebit = bacsDebit,
        bancontact = bancontact,
        boleto = boleto,
        card = card,
        cardPresent = cardPresent,
        cashapp = cashapp,
        ideal = ideal,
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
        satispay = satispay,
        sepaDebit = sepaDebit,
        sofort = sofort,
        twint = twint,
        upi = upi,
        usBankAccount = usBankAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SetupAttemptPaymentMethodDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SetupAttemptPaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SetupAttemptPaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("SetupAttemptPaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SetupAttemptPaymentMethodDetails must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return SetupAttemptPaymentMethodDetails(
        type = type,
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        auBecsDebit = rawObject["au_becs_debit"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        bancontact = rawObject["bancontact"]?.let { json.decodeFromJsonElement<SetupAttemptPaymentMethodDetailsBancontact>(it) },
        boleto = rawObject["boleto"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<SetupAttemptPaymentMethodDetailsCard>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<SetupAttemptPaymentMethodDetailsCardPresent>(it) },
        cashapp = rawObject["cashapp"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        ideal = rawObject["ideal"]?.let { json.decodeFromJsonElement<SetupAttemptPaymentMethodDetailsIdeal>(it) },
        kakaoPay = rawObject["kakao_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        krCard = rawObject["kr_card"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        naverPay = rawObject["naver_pay"]?.let { json.decodeFromJsonElement<SetupAttemptPaymentMethodDetailsNaverPay>(it) },
        nzBankAccount = rawObject["nz_bank_account"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<SetupAttemptPaymentMethodDetailsPix>(it) },
        revolutPay = rawObject["revolut_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        satispay = rawObject["satispay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        sofort = rawObject["sofort"]?.let { json.decodeFromJsonElement<SetupAttemptPaymentMethodDetailsSofort>(it) },
        twint = rawObject["twint"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SetupAttemptPaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("SetupAttemptPaymentMethodDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.auBecsDebit?.let { put("au_becs_debit", json.encodeToJsonElement(it)) }
        value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
        value.bancontact?.let { put("bancontact", json.encodeToJsonElement(it)) }
        value.boleto?.let { put("boleto", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
        value.cashapp?.let { put("cashapp", json.encodeToJsonElement(it)) }
        value.ideal?.let { put("ideal", json.encodeToJsonElement(it)) }
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
        value.satispay?.let { put("satispay", json.encodeToJsonElement(it)) }
        value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
        value.sofort?.let { put("sofort", json.encodeToJsonElement(it)) }
        value.twint?.let { put("twint", json.encodeToJsonElement(it)) }
        value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun setupAttemptPaymentMethodDetails(block: SetupAttemptPaymentMethodDetails.Builder.() -> Unit): SetupAttemptPaymentMethodDetails = SetupAttemptPaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SetupAttemptPaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
