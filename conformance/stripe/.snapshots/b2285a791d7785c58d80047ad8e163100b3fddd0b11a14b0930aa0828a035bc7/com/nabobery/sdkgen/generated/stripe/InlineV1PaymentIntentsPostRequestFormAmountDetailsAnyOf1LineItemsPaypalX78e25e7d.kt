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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_method_opt
 * ions/properties/paypal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/amount_details/anyOf/0/properties/line_items/anyOf/0/items/properties/payment_method_opt
 * ions/properties/paypal
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d(
  public val category:
      InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc? = null,
  public val description: String? = null,
  public val soldBy: String? = null,
) {
  public class Builder {
    public var category: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc?
        = null

    public var description: String? = null

    public var soldBy: String? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d(
      category = category,
      description = description,
      soldBy = soldBy,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d(
        category = rawObject["category"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1CategoryX3b0274cc>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        soldBy = rawObject["sold_by"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d")
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

public fun inlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d(block: InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d = InlineV1PaymentIntentsPostRequestFormAmountDetailsAnyOf1LineItemsPaypalX78e25e7d.build(block)
