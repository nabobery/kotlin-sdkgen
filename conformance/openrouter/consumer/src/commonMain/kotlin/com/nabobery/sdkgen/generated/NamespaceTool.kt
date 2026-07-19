package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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

@Serializable
public data class NamespaceToolView(
  public val description: String,
  public val name: String,
  public val tools: List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems>,
  public val type: InlineComponentsSchemasNamespaceToolPropertiesType,
)

/**
 * Groups function/custom tools under a shared namespace
 */
@Serializable(with = NamespaceTool.Serializer::class)
public class NamespaceTool(
  public val description: String,
  public val name: String,
  tools: List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems>,
  public val type: InlineComponentsSchemasNamespaceToolPropertiesType,
) {
  public val tools: List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems> = tools.toList()

  public class Builder {
    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var toolsValue: List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems>? = null

    public var tools: List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems>
      get() = requireNotNull(toolsValue) { "tools is required" }
      set(`value`) {
        toolsValue = value
      }

    private var typeValue: InlineComponentsSchemasNamespaceToolPropertiesType? = null

    public var type: InlineComponentsSchemasNamespaceToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): NamespaceTool {
      check(descriptionValue != null) { "description is required" }
      check(nameValue != null) { "name is required" }
      check(toolsValue != null) { "tools is required" }
      check(typeValue != null) { "type is required" }
      return NamespaceTool(
        description = description,
        name = name,
        tools = tools,
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NamespaceTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<NamespaceTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NamespaceTool {
      val jsonDecoder = decoder.requireJsonDecoder("NamespaceTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("NamespaceTool must be a JSON object")
      val description = json.decodeRequired<String>(raw, "description")
      val name = json.decodeRequired<String>(raw, "name")
      val tools = json.decodeRequired<List<InlineComponentsSchemasNamespaceToolPropertiesToolsItems>>(raw, "tools")
      val type = json.decodeRequired<InlineComponentsSchemasNamespaceToolPropertiesType>(raw, "type")
      return NamespaceTool(
        description = description,
        name = name,
        tools = tools,
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: NamespaceTool) {
      val jsonEncoder = encoder.requireJsonEncoder("NamespaceTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("description", value.description)
        put("name", value.name)
        put("tools", json.encodeToJsonElement(value.tools))
        put("type", json.encodeToJsonElement(value.type))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun namespaceTool(block: NamespaceTool.Builder.() -> Unit): NamespaceTool = NamespaceTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NamespaceTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
