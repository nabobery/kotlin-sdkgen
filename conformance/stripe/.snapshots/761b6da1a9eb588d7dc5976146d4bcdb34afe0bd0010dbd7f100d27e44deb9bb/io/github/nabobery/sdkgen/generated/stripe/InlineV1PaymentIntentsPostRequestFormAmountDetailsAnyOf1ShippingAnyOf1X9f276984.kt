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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/shipping/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984(
  public val amount:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568? = null,
  public val fromPostalCode:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1FromPostalCodeX08f528d8? = null,
  public val toPostalCode:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0? = null,
) {
  public class Builder {
    public var amount:
        InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568? = null

    public var fromPostalCode:
        InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1FromPostalCodeX08f528d8? = null

    public var toPostalCode:
        InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984 = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984(
      amount = amount,
      fromPostalCode = fromPostalCode,
      toPostalCode = toPostalCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAmountX4d62e568>(it) },
        fromPostalCode = rawObject["from_postal_code"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1FromPostalCodeX08f528d8>(it) },
        toPostalCode = rawObject["to_postal_code"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ToPostalCodeX600183a0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984")
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

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984(block: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984 = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1ShippingAnyOf1X9f276984.build(block)
