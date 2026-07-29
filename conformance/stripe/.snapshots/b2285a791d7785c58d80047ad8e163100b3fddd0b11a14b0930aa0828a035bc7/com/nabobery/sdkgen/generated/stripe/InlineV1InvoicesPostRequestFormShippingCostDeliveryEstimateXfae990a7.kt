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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/delivery_estimate.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/delivery_estimate
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7(
  public val maximum:
      InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07? = null,
  public val minimum:
      InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e? = null,
) {
  public class Builder {
    public var maximum: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07?
        = null

    public var minimum: InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e?
        = null

    public fun build(): InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7 = InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7(
      maximum = maximum,
      minimum = minimum,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7 must be a JSON object")
      return InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7(
        maximum = rawObject["maximum"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMaximumXde2d3d07>(it) },
        minimum = rawObject["minimum"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataMinimumX73ff067e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
        value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7(block: InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7 = InlineV1InvoicesPostRequestFormShippingCostDeliveryEstimateXfae990a7.build(block)
