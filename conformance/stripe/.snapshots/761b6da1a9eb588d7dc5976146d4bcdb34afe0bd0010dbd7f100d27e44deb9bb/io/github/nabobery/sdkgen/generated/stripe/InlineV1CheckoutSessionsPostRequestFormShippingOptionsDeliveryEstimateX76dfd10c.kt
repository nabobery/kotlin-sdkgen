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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/delivery_est
 * imate.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/delivery_est
 * imate
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c(
  public val maximum:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19? = null,
  public val minimum:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMinimumX058275d2? = null,
) {
  public class Builder {
    public var maximum:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19? = null

    public var minimum:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMinimumX058275d2? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c = InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c(
      maximum = maximum,
      minimum = minimum,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c(
        maximum = rawObject["maximum"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19>(it) },
        minimum = rawObject["minimum"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMinimumX058275d2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
        value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c = InlineV1CheckoutSessionsPostRequestFormShippingOptionsDeliveryEstimateX76dfd10c.build(block)
