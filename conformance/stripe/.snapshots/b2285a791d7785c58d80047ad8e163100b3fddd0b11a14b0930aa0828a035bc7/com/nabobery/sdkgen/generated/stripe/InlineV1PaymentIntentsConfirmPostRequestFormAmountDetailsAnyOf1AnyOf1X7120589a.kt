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
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a(
  public val amount:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6? = null,
  public val fromPostalCode:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsFromPostalCodeX948aa199? = null,
  public val toPostalCode:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsToPostalCodeXa7b1dd82? = null,
) {
  public class Builder {
    public var amount:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6? = null

    public var fromPostalCode:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsFromPostalCodeX948aa199? = null

    public var toPostalCode:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsToPostalCodeXa7b1dd82? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a(
      amount = amount,
      fromPostalCode = fromPostalCode,
      toPostalCode = toPostalCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AmountX0c914aa6>(it) },
        fromPostalCode = rawObject["from_postal_code"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsFromPostalCodeX948aa199>(it) },
        toPostalCode = rawObject["to_postal_code"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsToPostalCodeXa7b1dd82>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a")
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

public fun inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a(block: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1AnyOf1X7120589a.build(block)
