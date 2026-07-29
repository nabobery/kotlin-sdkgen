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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/delivery_estimate.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/delivery_estimate
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080(
  public val maximum:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0? = null,
  public val minimum:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9? = null,
) {
  public class Builder {
    public var maximum: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0?
        = null

    public var minimum: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9?
        = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080 = InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080(
      maximum = maximum,
      minimum = minimum,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080(
        maximum = rawObject["maximum"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0>(it) },
        minimum = rawObject["minimum"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
        value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080 = InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX23317080.build(block)
