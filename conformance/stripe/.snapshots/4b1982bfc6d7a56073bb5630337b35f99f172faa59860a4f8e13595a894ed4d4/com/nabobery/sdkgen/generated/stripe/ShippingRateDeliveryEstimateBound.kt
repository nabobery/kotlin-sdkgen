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

@Serializable
public data class ShippingRateDeliveryEstimateBoundView(
  public val unit: InlineShippingRateDeliveryEstimateBoundUnitX84ce7044,
  public val `value`: Int,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/shipping_rate_delivery_estimate_bound
 */
@Serializable(with = ShippingRateDeliveryEstimateBound.Serializer::class)
public class ShippingRateDeliveryEstimateBound(
  /**
   * A unit of time.
   */
  public val unit: InlineShippingRateDeliveryEstimateBoundUnitX84ce7044,
  /**
   * Must be greater than 0.
   */
  public val `value`: Int,
) {
  public class Builder {
    private var unitValue: InlineShippingRateDeliveryEstimateBoundUnitX84ce7044? = null

    public var unit: InlineShippingRateDeliveryEstimateBoundUnitX84ce7044
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

    public fun build(): ShippingRateDeliveryEstimateBound {
      check(unitValue != null) { "unit is required" }
      check(valueValue != null) { "value is required" }
      return ShippingRateDeliveryEstimateBound(
        unit = unit,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ShippingRateDeliveryEstimateBound = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ShippingRateDeliveryEstimateBound> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ShippingRateDeliveryEstimateBound {
      val jsonDecoder = decoder.requireJsonDecoder("ShippingRateDeliveryEstimateBound")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ShippingRateDeliveryEstimateBound must be a JSON object")
      val unit = json.decodeRequired<InlineShippingRateDeliveryEstimateBoundUnitX84ce7044>(rawObject, "unit")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return ShippingRateDeliveryEstimateBound(
        unit = unit,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ShippingRateDeliveryEstimateBound) {
      val jsonEncoder = encoder.requireJsonEncoder("ShippingRateDeliveryEstimateBound")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("unit", json.encodeToJsonElement(value.unit))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun shippingRateDeliveryEstimateBound(block: ShippingRateDeliveryEstimateBound.Builder.() -> Unit): ShippingRateDeliveryEstimateBound = ShippingRateDeliveryEstimateBound.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ShippingRateDeliveryEstimateBound is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
