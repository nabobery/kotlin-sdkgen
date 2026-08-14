package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_op
 * tions/properties/paypal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/payment_method_op
 * tions/properties/paypal
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97(
  public val category:
      InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsCategoryX03b2426d? = null,
  public val description: String? = null,
  public val soldBy: String? = null,
) {
  public class Builder {
    public var category: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsCategoryX03b2426d?
        = null

    public var description: String? = null

    public var soldBy: String? = null

    public fun build(): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97 = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97(
      category = category,
      description = description,
      soldBy = soldBy,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97 must be a JSON object")
      return InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97(
        category = rawObject["category"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsCategoryX03b2426d>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        soldBy = rawObject["sold_by"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97")
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

public fun inlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97(block: InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97.Builder.() -> Unit): InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97 = InlineV1PaymentIntentsCapturePostRequestFormAmountDetailsPaypalX8a7c0f97.build(block)
