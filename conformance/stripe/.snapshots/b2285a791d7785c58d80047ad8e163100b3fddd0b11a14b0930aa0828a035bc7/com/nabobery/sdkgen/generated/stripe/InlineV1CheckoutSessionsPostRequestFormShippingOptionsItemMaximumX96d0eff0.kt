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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/delivery_estimate/properties/ma
 * ximum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/delivery_estimate/properties/ma
 * ximum
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0(
  public val unit: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitX08900d1a,
  public val `value`: Int,
) {
  public class Builder {
    private var unitValue: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitX08900d1a?
        = null

    public var unit: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitX08900d1a
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

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0 {
      check(unitValue != null) { "unit is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0(
        unit = unit,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0 must be a JSON object")
      val unit = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitX08900d1a>(rawObject, "unit")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0(
        unit = unit,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("unit", json.encodeToJsonElement(value.unit))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0 = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMaximumX96d0eff0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
