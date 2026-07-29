package com.example.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.put

/**
 * A fixed property with open additional values.
 */
@Serializable(with = DynamicTool.Serializer::class)
public class DynamicTool(
  /**
   * Fixed wire type.
   */
  public val type: String,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Open JSON object members.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateDynamicToolAdditionalProperties(additionalProperties)

  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Open JSON object members.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): DynamicTool {
      check(typeValue != null) { "type is required" }
      return DynamicTool(
        type = type,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): DynamicTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<DynamicTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DynamicTool {
      val jsonDecoder = decoder.requireJsonDecoder("DynamicTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("DynamicTool must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return DynamicTool(
        type = type,
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: DynamicTool) {
      val jsonEncoder = encoder.requireJsonEncoder("DynamicTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("type")) { "DynamicTool additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateDynamicToolAdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("type") }
  require(collision == null) { "DynamicTool additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun dynamicTool(block: DynamicTool.Builder.() -> Unit): DynamicTool = DynamicTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("DynamicTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
