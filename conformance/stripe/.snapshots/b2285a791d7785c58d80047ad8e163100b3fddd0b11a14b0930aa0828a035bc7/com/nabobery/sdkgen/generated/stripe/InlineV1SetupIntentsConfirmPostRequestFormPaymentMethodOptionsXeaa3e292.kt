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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292(
  public val acssDebit:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b? = null,
  public val amazonPay: JsonObject? = null,
  public val bacsDebit:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a? = null,
  public val bizum: JsonObject? = null,
  public val card:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae? = null,
  public val cardPresent: JsonObject? = null,
  public val klarna:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd? = null,
  public val link: JsonObject? = null,
  public val paypal:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPaypalXa6ffb8a4? = null,
  public val payto:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPaytoX25621288? = null,
  public val pix:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad? = null,
  public val sepaDebit:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsSepaDebitX776132b5? = null,
  public val upi:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934? = null,
  public val usBankAccount:
      InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d? = null,
) {
  public class Builder {
    public var acssDebit:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b? = null

    public var amazonPay: JsonObject? = null

    public var bacsDebit:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a? = null

    public var bizum: JsonObject? = null

    public var card: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae? =
        null

    public var cardPresent: JsonObject? = null

    public var klarna:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd? = null

    public var link: JsonObject? = null

    public var paypal:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPaypalXa6ffb8a4? = null

    public var payto: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPaytoX25621288?
        = null

    public var pix: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad? =
        null

    public var sepaDebit:
        InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsSepaDebitX776132b5? = null

    public var upi: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934? =
        null

    public var usBankAccount: InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d? =
        null

    public fun build(): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292(
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
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292 must be a JSON object")
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292(
        acssDebit = rawObject["acss_debit"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAcssDebitX8bf7378b>(it) },
        amazonPay = rawObject["amazon_pay"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        bacsDebit = rawObject["bacs_debit"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsBacsDebitX8306070a>(it) },
        bizum = rawObject["bizum"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsCardXf7411bae>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsKlarnaXe99e1cdd>(it) },
        link = rawObject["link"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPaypalXa6ffb8a4>(it) },
        payto = rawObject["payto"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPaytoX25621288>(it) },
        pix = rawObject["pix"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsPixXd9ba9bad>(it) },
        sepaDebit = rawObject["sepa_debit"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsSepaDebitX776132b5>(it) },
        upi = rawObject["upi"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsUpiX3787f934>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormUsBankAccountX86ed8f4d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292")
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

public fun inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292(block: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292.Builder.() -> Unit): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292 = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsXeaa3e292.build(block)
