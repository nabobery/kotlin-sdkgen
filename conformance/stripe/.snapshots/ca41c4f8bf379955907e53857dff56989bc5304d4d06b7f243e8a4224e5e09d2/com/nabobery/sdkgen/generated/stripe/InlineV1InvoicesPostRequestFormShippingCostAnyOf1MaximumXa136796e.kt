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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/delivery_estimate/properties/ma
 * ximum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/delivery_estimate/properties/ma
 * ximum
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e(
  public val unit: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitX594e6a99,
  public val `value`: Int,
) {
  public class Builder {
    private var unitValue:
        InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitX594e6a99? = null

    public var unit: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitX594e6a99
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

    public fun build(): InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e {
      check(unitValue != null) { "unit is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e(
        unit = unit,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e must be a JSON object")
      val unit = json.decodeRequired<InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitX594e6a99>(rawObject, "unit")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e(
        unit = unit,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("unit", json.encodeToJsonElement(value.unit))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e(block: InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e = InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAnyOf1MaximumXa136796e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
