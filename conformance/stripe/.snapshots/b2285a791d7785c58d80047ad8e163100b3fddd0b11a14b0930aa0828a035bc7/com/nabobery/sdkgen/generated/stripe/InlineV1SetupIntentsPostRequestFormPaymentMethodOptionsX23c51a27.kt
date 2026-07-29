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
 * Payment method-specific configuration for this SetupIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27(
  public val acssDebit:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550? = null,
  public val amazonPay: JsonObject? = null,
  public val bacsDebit:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2ae3143b? = null,
  public val bizum: JsonObject? = null,
  public val card: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e? = null,
  public val cardPresent: JsonObject? = null,
  public val klarna: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b? = null,
  public val link: JsonObject? = null,
  public val paypal: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee? = null,
  public val payto: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoXe13833dd? = null,
  public val pix: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXeb917509? = null,
  public val sepaDebit:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c? = null,
  public val upi: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122? = null,
  public val usBankAccount:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f? = null,
) {
  public class Builder {
    public var acssDebit: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550?
        = null

    public var amazonPay: JsonObject? = null

    public var bacsDebit: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2ae3143b?
        = null

    public var bizum: JsonObject? = null

    public var card: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e? = null

    public var cardPresent: JsonObject? = null

    public var klarna: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b? =
        null

    public var link: JsonObject? = null

    public var paypal: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee? =
        null

    public var payto: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoXe13833dd? = null

    public var pix: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXeb917509? = null

    public var sepaDebit: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c?
        = null

    public var upi: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122? = null

    public var usBankAccount:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27(
      acssDebit = acssDebit,
      amazonPay = amazonPay,
      bacsDebit = bacsDebit,
      bizum = bizum,
      card = card,
      cardPresent = cardPresent,
      klarna = klarna,
      link = link,
      paypal = paypal,
      payto = payto,
      pix = pix,
      sepaDebit = sepaDebit,
      upi = upi,
      usBankAccount = usBankAccount,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsAcssDebitX18c92550>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsBacsDebitX2ae3143b>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsCardX5a9b8b8e>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoXe13833dd>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPixXeb917509>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSepaDebitXfa2c9f6c>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUpiXe7418122>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsUsBankAccountXc479df7f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.acssDebit?.let { put("acss_debit", json.encodeToJsonElement(it)) }
        value.amazonPay?.let { put("amazon_pay", json.encodeToJsonElement(it)) }
        value.bacsDebit?.let { put("bacs_debit", json.encodeToJsonElement(it)) }
        value.bizum?.let { put("bizum", json.encodeToJsonElement(it)) }
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.link?.let { put("link", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
        value.payto?.let { put("payto", json.encodeToJsonElement(it)) }
        value.pix?.let { put("pix", json.encodeToJsonElement(it)) }
        value.sepaDebit?.let { put("sepa_debit", json.encodeToJsonElement(it)) }
        value.upi?.let { put("upi", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27 = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsX23c51a27.build(block)
