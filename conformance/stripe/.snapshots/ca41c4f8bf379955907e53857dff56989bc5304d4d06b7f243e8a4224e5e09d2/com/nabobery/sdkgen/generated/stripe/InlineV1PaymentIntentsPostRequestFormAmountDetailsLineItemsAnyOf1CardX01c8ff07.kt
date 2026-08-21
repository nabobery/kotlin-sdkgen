package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options/properties/ca
 * rd.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_options/properties/ca
 * rd
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07(
  public val commodityCode: String? = null,
) {
  public class Builder {
    public var commodityCode: String? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07 = InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07(
      commodityCode = commodityCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07(
        commodityCode = rawObject["commodity_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.commodityCode?.let { put("commodity_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07(block: InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07 = InlineV1PaymentIntentsPostRequestFormAmountDetailsLineItemsAnyOf1CardX01c8ff07.build(block)
