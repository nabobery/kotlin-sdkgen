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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * List of available MCP tools from a server
 */
@Serializable(with = McpListToolsItem.Serializer::class)
public class McpListToolsItem(
  public val id: String,
  public val serverLabel: String,
  tools: List<InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems>,
  public val type: InlineComponentsSchemasMcpListToolsItemPropertiesType,
  public val error: String? = null,
) {
  public val tools: List<InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems> =
      tools.toList()

  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var serverLabelValue: String? = null

    public var serverLabel: String
      get() = requireNotNull(serverLabelValue) { "serverLabel is required" }
      set(`value`) {
        serverLabelValue = value
      }

    private var toolsValue: List<InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems>? =
        null

    public var tools: List<InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems>
      get() = requireNotNull(toolsValue) { "tools is required" }
      set(`value`) {
        toolsValue = value
      }

    private var typeValue: InlineComponentsSchemasMcpListToolsItemPropertiesType? = null

    public var type: InlineComponentsSchemasMcpListToolsItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var error: String? = null

    public fun build(): McpListToolsItem {
      check(idValue != null) { "id is required" }
      check(serverLabelValue != null) { "serverLabel is required" }
      check(toolsValue != null) { "tools is required" }
      check(typeValue != null) { "type is required" }
      return McpListToolsItem(
        id = id,
        serverLabel = serverLabel,
        tools = tools,
        type = type,
        error = error,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): McpListToolsItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<McpListToolsItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): McpListToolsItem {
      val jsonDecoder = decoder.requireJsonDecoder("McpListToolsItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("McpListToolsItem must be a JSON object")
      val id = json.decodeRequired<String>(raw, "id")
      val serverLabel = json.decodeRequired<String>(raw, "server_label")
      val tools = json.decodeRequired<List<InlineComponentsSchemasMcpListToolsItemPropertiesToolsItems>>(raw, "tools")
      val type = json.decodeRequired<InlineComponentsSchemasMcpListToolsItemPropertiesType>(raw, "type")
      return McpListToolsItem(
        id = id,
        serverLabel = serverLabel,
        tools = tools,
        type = type,
        error = raw["error"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: McpListToolsItem) {
      val jsonEncoder = encoder.requireJsonEncoder("McpListToolsItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("server_label", value.serverLabel)
        put("tools", json.encodeToJsonElement(value.tools))
        put("type", json.encodeToJsonElement(value.type))
        value.error?.let { put("error", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mcpListToolsItem(block: McpListToolsItem.Builder.() -> Unit): McpListToolsItem = McpListToolsItem
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("McpListToolsItem is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
