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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/delivery_estimate.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/delivery_estimate
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a(
  public val maximum: InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e? = null,
  public val minimum: InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42? = null,
) {
  public class Builder {
    public var maximum: InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e? = null

    public var minimum: InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42? = null

    public fun build(): InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a = InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a(
      maximum = maximum,
      minimum = minimum,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a must be a JSON object")
      return InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a(
        maximum = rawObject["maximum"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e>(it) },
        minimum = rawObject["minimum"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
        value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a(block: InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a = InlineV1InvoicesPostRequestFormShippingCostAnyOf1DeliveryEstimateX300ea68a.build(block)
