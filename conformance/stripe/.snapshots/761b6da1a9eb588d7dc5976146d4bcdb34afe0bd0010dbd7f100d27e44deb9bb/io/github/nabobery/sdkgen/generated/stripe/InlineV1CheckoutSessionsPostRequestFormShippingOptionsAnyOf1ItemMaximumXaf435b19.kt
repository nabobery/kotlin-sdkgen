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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/delivery_est
 * imate/properties/maximum.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/delivery_est
 * imate/properties/maximum
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19(
  public val unit: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec,
  public val `value`: Int,
) {
  public class Builder {
    private var unitValue:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec? = null

    public var unit: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec
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

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19 {
      check(unitValue != null) { "unit is required" }
      check(valueValue != null) { "value is required" }
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19(
        unit = unit,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19 must be a JSON object")
      val unit = json.decodeRequired<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemUnitX79dcb7ec>(rawObject, "unit")
      val value = json.decodeRequired<Int>(rawObject, "value")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19(
        unit = unit,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("unit", json.encodeToJsonElement(value.unit))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19 = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1ItemMaximumXaf435b19 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
