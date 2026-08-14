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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/p
 * ayment_method_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/p
 * ayment_method_options
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b(
  public val card:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa? = null,
  public val cardPresent:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCardPresentX10011ed1? = null,
  public val klarna:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsKlarnaXa13e35da? = null,
  public val paypal:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b? = null,
) {
  public class Builder {
    public var card:
        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa? = null

    public var cardPresent:
        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCardPresentX10011ed1? = null

    public var klarna: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsKlarnaXa13e35da? =
        null

    public var paypal: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b? =
        null

    public fun build(): InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b = InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b(
      card = card,
      cardPresent = cardPresent,
      klarna = klarna,
      paypal = paypal,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b must be a JSON object")
      return InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b(
        card = rawObject["card"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa>(it) },
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsCardPresentX10011ed1>(it) },
        klarna = rawObject["klarna"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsKlarnaXa13e35da>(it) },
        paypal = rawObject["paypal"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsPaypalX1f50456b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b")
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

public fun inlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b(block: InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b.Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b = InlineV1PaymentIntentsIncra167PostRequestFormPaymentMethodOptionsX7aff839b.build(block)
