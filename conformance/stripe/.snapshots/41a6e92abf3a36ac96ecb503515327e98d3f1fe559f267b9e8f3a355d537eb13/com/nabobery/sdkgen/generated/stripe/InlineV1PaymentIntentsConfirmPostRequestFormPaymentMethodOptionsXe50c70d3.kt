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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_m
 * ethod_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_m
 * ethod_options
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3(
  public val card:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1CardX50dec5fc? = null,
  public val cardPresent:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsCardPresentX9892a765? = null,
  public val klarna:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1KlarnaX0608be17? = null,
  public val paypal:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec? = null,
) {
  public class Builder {
    public var card: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1CardX50dec5fc? =
        null

    public var cardPresent:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsCardPresentX9892a765? = null

    public var klarna:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1KlarnaX0608be17? = null

    public var paypal:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3(
      card = card,
      cardPresent = cardPresent,
      klarna = klarna,
      paypal = paypal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1CardX50dec5fc>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsCardPresentX9892a765>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1KlarnaX0608be17>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.card?.let { put("card", json.encodeToJsonElement(it)) }
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
        value.klarna?.let { put("klarna", json.encodeToJsonElement(it)) }
        value.paypal?.let { put("paypal", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsXe50c70d3.build(block)
