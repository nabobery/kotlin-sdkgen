package io.github.nabobery.sdkgen.generated.stripe

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
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/delivery_estimate/properties/mi
 * nimum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/delivery_estimate/properties/mi
 * nimum
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9(
  public val unit: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27,
  public val `value`: Int,
) {
  public class Builder {
    private var unitValue: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27?
        = null

    public var unit: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27
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

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9 {
      check(unitValue != null) { "unit is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9(
        unit = unit,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9 must be a JSON object")
      val unit = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemUnitXe8d89e27>(rawObject, "unit")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9(
        unit = unit,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("unit", json.encodeToJsonElement(value.unit))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9 = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemMinimumXfe97c5a9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
