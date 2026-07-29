package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/delivery_estimate/properties/maximum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1shipping_rates/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/delivery_estimate/properties/maximum
 */
@Serializable(with = InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba.Serializer::class)
public class InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba(
  public val unit: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumUnitXb6709287,
  public val `value`: Int,
) {
  public class Builder {
    private var unitValue: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumUnitXb6709287?
        = null

    public var unit: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumUnitXb6709287
      get() = requireNotNull(unitValue) { "unit is required" }
      set(`value`) {
        unitValue = value
      }

    private var valueValue: Int? = null

    public var `value`: Int
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba {
      check(unitValue != null) { "unit is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba(
        unit = unit,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba must be a JSON object")
      val unit = json.decodeRequired<InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumUnitXb6709287>(rawObject, "unit")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba(
        unit = unit,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("unit", json.encodeToJsonElement(value.unit))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba(block: InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba.Builder.() -> Unit): InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba = InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1ShippingRatesPostRequestFormDeliveryEstimateMaximumX351289ba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
