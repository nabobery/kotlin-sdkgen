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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b(
  public val amount:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba? = null,
  public val fromPostalCode:
      InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e? = null,
  public val toPostalCode:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsToPostalCodeXcb4c2c53? = null,
) {
  public class Builder {
    public var amount: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba? =
        null

    public var fromPostalCode: InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e?
        = null

    public var toPostalCode:
        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsToPostalCodeXcb4c2c53? = null

    public fun build(): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b(
      amount = amount,
      fromPostalCode = fromPostalCode,
      toPostalCode = toPostalCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b must be a JSON object")
      return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba>(it) },
        fromPostalCode = rawObject["from_postal_code"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e>(it) },
        toPostalCode = rawObject["to_postal_code"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsToPostalCodeXcb4c2c53>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.fromPostalCode?.let { put("from_postal_code", json.encodeToJsonElement(it)) }
        value.toPostalCode?.let { put("to_postal_code", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b(block: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b.Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf1Xbba0078b.build(block)
