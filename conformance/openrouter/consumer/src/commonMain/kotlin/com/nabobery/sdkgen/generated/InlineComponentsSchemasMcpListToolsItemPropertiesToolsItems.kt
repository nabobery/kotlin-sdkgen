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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/McpListToolsItem/properties/tools/items.
 */
@Serializable(with = InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems.Serializer::class)
public class InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems(
  public val inputSchema: Map<String, JsonElement?>,
  public val name: String,
  public val annotations: JsonElement? = null,
  public val description: String? = null,
) {
  public class Builder {
    private var inputSchemaValue: Map<String, JsonElement?>? = null

    public var inputSchema: Map<String, JsonElement?>
      get() = requireNotNull(inputSchemaValue) { "inputSchema is required" }
      set(`value`) {
        inputSchemaValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var annotations: JsonElement? = null

    public var description: String? = null

    public fun build(): InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems {
      check(inputSchemaValue != null) { "inputSchema is required" }
      check(nameValue != null) { "name is required" }
      return InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems(
        inputSchema = inputSchema,
        name = name,
        annotations = annotations,
        description = description,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems must be a JSON " +
          "object")
      val inputSchema = json.decodeRequired<Map<String, JsonElement?>>(raw, "input_schema")
      val name = json.decodeRequired<String>(raw, "name")
      return InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems(
        inputSchema = inputSchema,
        name = name,
        annotations = raw["annotations"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<JsonElement?>(element) },
        description = raw["description"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_schema", json.encodeToJsonElement(value.inputSchema))
        put("name", value.name)
        value.annotations?.let { put("annotations", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMcpListToolsItemPropertiesToolsItems(block: InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems.Builder.() -> Unit): InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems = InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems is missing required " +
      "property '" + name + "'")
  return decodeFromJsonElement(element)
}
