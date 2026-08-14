package io.github.nabobery.sdkgen.generated.stripe

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
 * The estimated range for how long shipping will take, meant to be displayable to the customer. This will appear on
 * CheckoutSessions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/delivery_estimate
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37.Serializer::class)
public class InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37(
  public val maximum: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba? = null,
  public val minimum: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumXe7e0a3f9? = null,
) {
  public class Builder {
    public var maximum: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba? = null

    public var minimum: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumXe7e0a3f9? = null

    public fun build(): InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37 = InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37(
      maximum = maximum,
      minimum = minimum,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37 must be a JSON object")
      return InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37(
        maximum = rawObject["maximum"]?.let { json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba>(it) },
        minimum = rawObject["minimum"]?.let { json.decodeFromJsonElement<InlineV1ShippingRatesPostRequestFormDeliveryEstimateMinimumXe7e0a3f9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
        value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37(block: InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37.Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37 = InlineV1ShippingRatesPostRequestFormDeliveryEstimateX04154e37.build(block)
