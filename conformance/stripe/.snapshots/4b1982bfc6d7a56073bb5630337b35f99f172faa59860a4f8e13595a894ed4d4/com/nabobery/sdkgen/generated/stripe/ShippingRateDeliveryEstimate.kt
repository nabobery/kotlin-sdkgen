package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class ShippingRateDeliveryEstimateView(
  public val maximum: InlineShippingRateDeliveryEstimateMaximumXeb077f32? = null,
  public val minimum: InlineShippingRateDeliveryEstimateMinimumX4d9cece9? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate_delivery_estimate
 */
@Serializable(with = ShippingRateDeliveryEstimate.Serializer::class)
public class ShippingRateDeliveryEstimate(
  /**
   * The upper bound of the estimated range. If empty, represents no upper bound i.e., infinite.
   */
  public val maximum: InlineShippingRateDeliveryEstimateMaximumXeb077f32? = null,
  /**
   * The lower bound of the estimated range. If empty, represents no lower bound.
   */
  public val minimum: InlineShippingRateDeliveryEstimateMinimumX4d9cece9? = null,
) {
  public class Builder {
    /**
     * The upper bound of the estimated range. If empty, represents no upper bound i.e., infinite.
     */
    public var maximum: InlineShippingRateDeliveryEstimateMaximumXeb077f32? = null

    /**
     * The lower bound of the estimated range. If empty, represents no lower bound.
     */
    public var minimum: InlineShippingRateDeliveryEstimateMinimumX4d9cece9? = null

    public fun build(): ShippingRateDeliveryEstimate = ShippingRateDeliveryEstimate(
      maximum = maximum,
      minimum = minimum,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShippingRateDeliveryEstimate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ShippingRateDeliveryEstimate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShippingRateDeliveryEstimate {
      val jsonDecoder = decoder.requireJsonDecoder("ShippingRateDeliveryEstimate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ShippingRateDeliveryEstimate must be a JSON object")
      return ShippingRateDeliveryEstimate(
        maximum = rawObject["maximum"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineShippingRateDeliveryEstimateMaximumXeb077f32?>(element) },
        minimum = rawObject["minimum"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineShippingRateDeliveryEstimateMinimumX4d9cece9?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShippingRateDeliveryEstimate) {
      val jsonEncoder = encoder.requireJsonEncoder("ShippingRateDeliveryEstimate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
        value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shippingRateDeliveryEstimate(block: ShippingRateDeliveryEstimate.Builder.() -> Unit): ShippingRateDeliveryEstimate = ShippingRateDeliveryEstimate.build(block)
