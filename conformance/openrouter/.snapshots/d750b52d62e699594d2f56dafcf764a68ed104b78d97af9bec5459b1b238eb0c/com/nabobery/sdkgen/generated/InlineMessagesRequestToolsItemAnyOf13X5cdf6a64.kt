package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/12.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/12
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf13X5cdf6a64.Serializer::class)
public class InlineMessagesRequestToolsItemAnyOf13X5cdf6a64(
  public val type: String,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateInlineMessagesRequestToolsItemAnyOf13X5cdf6a64AdditionalProperties(additionalProperties)

  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): InlineMessagesRequestToolsItemAnyOf13X5cdf6a64 {
      check(typeValue != null) { "type is required" }
      return InlineMessagesRequestToolsItemAnyOf13X5cdf6a64(
        type = type,
        additionalProperties = additionalProperties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf13X5cdf6a64 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf13X5cdf6a64> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf13X5cdf6a64 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemAnyOf13X5cdf6a64")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf13X5cdf6a64 must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineMessagesRequestToolsItemAnyOf13X5cdf6a64(
        type = type,
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf13X5cdf6a64) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolsItemAnyOf13X5cdf6a64")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("type")) { "InlineMessagesRequestToolsItemAnyOf13X5cdf6a64 additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateInlineMessagesRequestToolsItemAnyOf13X5cdf6a64AdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("type") }
  require(collision == null) { "InlineMessagesRequestToolsItemAnyOf13X5cdf6a64 additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun inlineMessagesRequestToolsItemAnyOf13X5cdf6a64(block: InlineMessagesRequestToolsItemAnyOf13X5cdf6a64.Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf13X5cdf6a64 = InlineMessagesRequestToolsItemAnyOf13X5cdf6a64.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf13X5cdf6a64 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
