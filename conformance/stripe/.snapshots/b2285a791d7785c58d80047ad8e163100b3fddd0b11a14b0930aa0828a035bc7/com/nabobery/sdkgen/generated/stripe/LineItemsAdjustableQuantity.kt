package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class LineItemsAdjustableQuantityView(
  public val enabled: Boolean,
  public val maximum: Int? = null,
  public val minimum: Int? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/line_items_adjustable_quantity
 */
@Serializable(with = LineItemsAdjustableQuantity.Serializer::class)
public class LineItemsAdjustableQuantity(
  public val enabled: Boolean,
  public val maximum: Int? = null,
  public val minimum: Int? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var maximum: Int? = null

    public var minimum: Int? = null

    public fun build(): LineItemsAdjustableQuantity {
      check(enabledValue != null) { "enabled is required" }
      return LineItemsAdjustableQuantity(
        enabled = enabled,
        maximum = maximum,
        minimum = minimum,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LineItemsAdjustableQuantity = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<LineItemsAdjustableQuantity> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LineItemsAdjustableQuantity {
      val jsonDecoder = decoder.requireJsonDecoder("LineItemsAdjustableQuantity")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LineItemsAdjustableQuantity must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return LineItemsAdjustableQuantity(
        enabled = enabled,
        maximum = rawObject["maximum"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        minimum = rawObject["minimum"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LineItemsAdjustableQuantity) {
      val jsonEncoder = encoder.requireJsonEncoder("LineItemsAdjustableQuantity")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.maximum?.let { put("maximum", json.encodeToJsonElement(it)) }
        value.minimum?.let { put("minimum", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun lineItemsAdjustableQuantity(block: LineItemsAdjustableQuantity.Builder.() -> Unit): LineItemsAdjustableQuantity = LineItemsAdjustableQuantity.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LineItemsAdjustableQuantity is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
