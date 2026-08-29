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
 * When shipping_cost contains the shipping_rate from the invoice, the shipping_cost is included in the credit note. One
 * of `amount`, `lines`, or `shipping_cost` must be provided.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/shipping_cost
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5.Serializer::class)
public class InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5(
  public val shippingRate: String? = null,
) {
  public class Builder {
    public var shippingRate: String? = null

    public fun build(): InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5 = InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5(
      shippingRate = shippingRate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5 must be a JSON object")
      return InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5(
        shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.shippingRate?.let { put("shipping_rate", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5(block: InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5.Builder.() -> Unit): InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5 = InlineV1CreditNotesPostRequestFormShippingCostX8cdba8f5.build(block)
