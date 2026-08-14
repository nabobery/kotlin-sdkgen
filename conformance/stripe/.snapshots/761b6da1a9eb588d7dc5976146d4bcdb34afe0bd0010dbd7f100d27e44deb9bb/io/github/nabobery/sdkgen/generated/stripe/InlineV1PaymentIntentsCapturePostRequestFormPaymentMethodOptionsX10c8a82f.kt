package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_op
 * tions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_op
 * tions
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f(
  public val card:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214? = null,
  public val cardPresent:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsCardPresentX0e169525? = null,
  public val klarna:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsKlarnaX3e1160a4? = null,
  public val paypal:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97? = null,
) {
  public class Builder {
    public var card:
        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214? = null

    public var cardPresent:
        InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsCardPresentX0e169525? = null

    public var klarna: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsKlarnaX3e1160a4? =
        null

    public var paypal: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97? =
        null

    public fun build(): InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f = InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f(
      card = card,
      cardPresent = cardPresent,
      klarna = klarna,
      paypal = paypal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f must be a JSON object")
      return InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsLineItemsCardX9d259214>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsCardPresentX0e169525>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsKlarnaX3e1160a4>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f")
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

public fun inlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f(block: InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f.Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f = InlineV1PaymentIntentsCapturePostRequestFormPaymentMethodOptionsX10c8a82f.build(block)
