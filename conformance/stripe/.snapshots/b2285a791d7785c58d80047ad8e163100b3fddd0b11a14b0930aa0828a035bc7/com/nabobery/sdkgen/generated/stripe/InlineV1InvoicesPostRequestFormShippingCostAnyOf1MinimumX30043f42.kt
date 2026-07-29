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
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/delivery_estimate/properties/mi
 * nimum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/delivery_estimate/properties/mi
 * nimum
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42(
  public val unit: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c,
  public val `value`: Int,
) {
  public class Builder {
    private var unitValue:
        InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c? = null

    public var unit: InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c
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

    public fun build(): InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42 {
      check(unitValue != null) { "unit is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42(
        unit = unit,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42 must be a JSON object")
      val unit = json.decodeRequired<InlineV1InvoicesPostRequestFormShippingCostAnyOf1ShippingRateDataUnitXb4dc372c>(rawObject, "unit")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42(
        unit = unit,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("unit", json.encodeToJsonElement(value.unit))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42(block: InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42 = InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAnyOf1MinimumX30043f42 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
