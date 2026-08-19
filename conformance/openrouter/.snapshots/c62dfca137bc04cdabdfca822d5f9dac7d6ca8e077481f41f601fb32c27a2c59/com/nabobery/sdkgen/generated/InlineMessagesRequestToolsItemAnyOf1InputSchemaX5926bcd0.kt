package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/0/properties/input_sche
 * ma.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/tools/items/anyOf/0/properties/input_sche
 * ma
 */
@Serializable(with = InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0.Serializer::class)
public class InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0(
  public val properties: JsonElement? = null,
  required: List<String>? = null,
  public val type: String? = null,
  additionalProperties: Map<String, JsonElement> = emptyMap(),
) {
  public val required: List<String>? = required?.let { collection0 -> collection0.toList() }

  /**
   * Additional JSON object members not declared as fixed properties.
   */
  public val additionalProperties: Map<String, JsonElement> =
      copyAndValidateInlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0AdditionalProperties(additionalProperties)

  public class Builder {
    public var properties: JsonElement? = null

    private var requiredValue: List<String>? = null

    public var required: List<String>?
      get() = requiredValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        requiredValue = value?.let { collection0 -> collection0.toList() }
      }

    public var type: String? = null

    private var additionalPropertiesValue: Map<String, JsonElement> = emptyMap()

    /**
     * Additional JSON object members not declared as fixed properties.
     */
    public var additionalProperties: Map<String, JsonElement>
      get() = additionalPropertiesValue.toMap()
      set(`value`) {
        additionalPropertiesValue = value.toMap()
      }

    public fun build(): InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0 = InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0(
      properties = properties,
      required = required,
      type = type,
      additionalProperties = additionalProperties,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0 must be a JSON object")
      return InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0(
        properties = rawObject["properties"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<JsonElement?>(element) },
        required = rawObject["required"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
        additionalProperties = rawObject.filterKeys { key -> key !in setOf("properties", "required", "type") }.mapValues { (_, element) -> element }.toMap(),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.properties?.let { put("properties", json.encodeToJsonElement(it)) }
        value.required?.let { put("required", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
        value.additionalProperties.keys.sorted().forEach { key ->
          val additionalValue = value.additionalProperties.getValue(key)
          check(key !in setOf("properties", "required", "type")) { "InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0 additionalProperties key '" + key + "' collides with a fixed property" }
          put(key, additionalValue)
        }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

private fun copyAndValidateInlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0AdditionalProperties(additionalProperties: Map<String, JsonElement>): Map<String, JsonElement> {
  val copied = additionalProperties.toMap()
  val collision = copied.keys.sorted().firstOrNull { key -> key in setOf("properties", "required", "type") }
  require(collision == null) { "InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0 additionalProperties key '" + collision + "' collides with a fixed property" }
  return copied
}

public fun inlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0(block: InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0.Builder.() -> Unit): InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0 = InlineMessagesRequestToolsItemAnyOf1InputSchemaX5926bcd0.build(block)
