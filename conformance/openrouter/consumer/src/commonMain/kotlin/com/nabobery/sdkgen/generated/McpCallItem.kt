package com.nabobery.sdkgen.generated

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

/**
 * An MCP tool call with its output or error
 */
@Serializable(with = McpCallItem.Serializer::class)
public class McpCallItem(
  public val arguments: String,
  public val id: String,
  public val name: String,
  public val serverLabel: String,
  public val type: InlineComponentsSchemasMcpCallItemPropertiesType,
  public val error: String? = null,
  public val output: String? = null,
) {
  public class Builder {
    private var argumentsValue: String? = null

    public var arguments: String
      get() = requireNotNull(argumentsValue) { "arguments is required" }
      set(`value`) {
        argumentsValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var serverLabelValue: String? = null

    public var serverLabel: String
      get() = requireNotNull(serverLabelValue) { "serverLabel is required" }
      set(`value`) {
        serverLabelValue = value
      }

    private var typeValue: InlineComponentsSchemasMcpCallItemPropertiesType? = null

    public var type: InlineComponentsSchemasMcpCallItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var error: String? = null

    public var output: String? = null

    public fun build(): McpCallItem {
      check(argumentsValue != null) { "arguments is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(serverLabelValue != null) { "serverLabel is required" }
      check(typeValue != null) { "type is required" }
      return McpCallItem(
        arguments = arguments,
        id = id,
        name = name,
        serverLabel = serverLabel,
        type = type,
        error = error,
        output = output,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): McpCallItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<McpCallItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): McpCallItem {
      val jsonDecoder = decoder.requireJsonDecoder("McpCallItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("McpCallItem must be a JSON object")
      val arguments = json.decodeRequired<String>(raw, "arguments")
      val id = json.decodeRequired<String>(raw, "id")
      val name = json.decodeRequired<String>(raw, "name")
      val serverLabel = json.decodeRequired<String>(raw, "server_label")
      val type = json.decodeRequired<InlineComponentsSchemasMcpCallItemPropertiesType>(raw, "type")
      return McpCallItem(
        arguments = arguments,
        id = id,
        name = name,
        serverLabel = serverLabel,
        type = type,
        error = raw["error"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        output = raw["output"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: McpCallItem) {
      val jsonEncoder = encoder.requireJsonEncoder("McpCallItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("arguments", value.arguments)
        put("id", value.id)
        put("name", value.name)
        put("server_label", value.serverLabel)
        put("type", json.encodeToJsonElement(value.type))
        value.error?.let { put("error", it) }
        value.output?.let { put("output", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mcpCallItem(block: McpCallItem.Builder.() -> Unit): McpCallItem = McpCallItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("McpCallItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
