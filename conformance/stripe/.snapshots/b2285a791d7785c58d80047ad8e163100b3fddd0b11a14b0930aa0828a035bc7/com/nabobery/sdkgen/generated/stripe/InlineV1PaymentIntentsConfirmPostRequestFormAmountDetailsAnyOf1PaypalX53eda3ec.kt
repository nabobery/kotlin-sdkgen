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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_m
 * ethod_options/properties/paypal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_m
 * ethod_options/properties/paypal
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec(
  public val category:
      InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1CategoryX9afe92c1? = null,
  public val description: String? = null,
  public val soldBy: String? = null,
) {
  public class Builder {
    public var category:
        InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1CategoryX9afe92c1? = null

    public var description: String? = null

    public var soldBy: String? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec(
      category = category,
      description = description,
      soldBy = soldBy,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec(
        category = rawObject["category"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1CategoryX9afe92c1>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        soldBy = rawObject["sold_by"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.category?.let { put("category", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.soldBy?.let { put("sold_by", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec(block: InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec = InlineV1PaymentIntentsConfirmPostRequestFormAmountDetailsAnyOf1PaypalX53eda3ec.build(block)
