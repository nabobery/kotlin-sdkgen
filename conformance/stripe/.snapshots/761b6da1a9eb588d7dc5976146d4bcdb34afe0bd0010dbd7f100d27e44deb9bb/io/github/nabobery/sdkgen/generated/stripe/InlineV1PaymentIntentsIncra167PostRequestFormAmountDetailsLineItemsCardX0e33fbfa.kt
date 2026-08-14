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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/p
 * ayment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items/anyOf/0/items/properties/p
 * ayment_method_options/properties/card
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa(
  public val commodityCode: String? = null,
) {
  public class Builder {
    public var commodityCode: String? = null

    public fun build(): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa(
      commodityCode = commodityCode,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa must be a JSON object")
      return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa(
        commodityCode = rawObject["commodity_code"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.commodityCode?.let { put("commodity_code", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa(block: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa.Builder.() -> Unit): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsCardX0e33fbfa.build(block)
