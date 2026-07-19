package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class McpServerToolView(
  @SerialName("allowed_tools")
  public val allowedTools: InlineComponentsSchemasMcpServerToolPropertiesAllowedTools? = null,
  public val authorization: String? = null,
  @SerialName("connector_id")
  public val connectorId: InlineComponentsSchemasMcpServerToolPropertiesConnectorId? = null,
  public val headers: Map<String, String>? = null,
  @SerialName("require_approval")
  public val requireApproval: InlineComponentsSchemasMcpServerToolPropertiesRequireApproval? = null,
  @SerialName("server_description")
  public val serverDescription: String? = null,
  @SerialName("server_label")
  public val serverLabel: String,
  @SerialName("server_url")
  public val serverUrl: String? = null,
  public val type: InlineComponentsSchemasMcpServerToolPropertiesType,
)

/**
 * MCP (Model Context Protocol) tool configuration
 */
@Serializable(with = McpServerTool.Serializer::class)
public class McpServerTool(
  public val serverLabel: String,
  public val type: InlineComponentsSchemasMcpServerToolPropertiesType,
  public val allowedTools: InlineComponentsSchemasMcpServerToolPropertiesAllowedTools? = null,
  public val authorization: String? = null,
  public val connectorId: InlineComponentsSchemasMcpServerToolPropertiesConnectorId? = null,
  public val headers: Map<String, String>? = null,
  public val requireApproval: InlineComponentsSchemasMcpServerToolPropertiesRequireApproval? = null,
  public val serverDescription: String? = null,
  public val serverUrl: String? = null,
) {
  public class Builder {
    private var serverLabelValue: String? = null

    public var serverLabel: String
      get() = requireNotNull(serverLabelValue) { "serverLabel is required" }
      set(`value`) {
        serverLabelValue = value
      }

    private var typeValue: InlineComponentsSchemasMcpServerToolPropertiesType? = null

    public var type: InlineComponentsSchemasMcpServerToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var allowedTools: InlineComponentsSchemasMcpServerToolPropertiesAllowedTools? = null

    public var authorization: String? = null

    public var connectorId: InlineComponentsSchemasMcpServerToolPropertiesConnectorId? = null

    public var headers: Map<String, String>? = null

    public var requireApproval: InlineComponentsSchemasMcpServerToolPropertiesRequireApproval? =
        null

    public var serverDescription: String? = null

    public var serverUrl: String? = null

    public fun build(): McpServerTool {
      check(serverLabelValue != null) { "serverLabel is required" }
      check(typeValue != null) { "type is required" }
      return McpServerTool(
        serverLabel = serverLabel,
        type = type,
        allowedTools = allowedTools,
        authorization = authorization,
        connectorId = connectorId,
        headers = headers,
        requireApproval = requireApproval,
        serverDescription = serverDescription,
        serverUrl = serverUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): McpServerTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<McpServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): McpServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("McpServerTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("McpServerTool must be a JSON object")
      val serverLabel = json.decodeRequired<String>(raw, "server_label")
      val type = json.decodeRequired<InlineComponentsSchemasMcpServerToolPropertiesType>(raw, "type")
      return McpServerTool(
        serverLabel = serverLabel,
        type = type,
        allowedTools = raw["allowed_tools"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesAllowedTools?>(element) },
        authorization = raw["authorization"]?.let { json.decodeFromJsonElement<String>(it) },
        connectorId = raw["connector_id"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesConnectorId>(it) },
        headers = raw["headers"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Map<String, String>?>(element) },
        requireApproval = raw["require_approval"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasMcpServerToolPropertiesRequireApproval?>(element) },
        serverDescription = raw["server_description"]?.let { json.decodeFromJsonElement<String>(it) },
        serverUrl = raw["server_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: McpServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("McpServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("server_label", value.serverLabel)
        put("type", json.encodeToJsonElement(value.type))
        value.allowedTools?.let { put("allowed_tools", json.encodeToJsonElement(it)) }
        value.authorization?.let { put("authorization", it) }
        value.connectorId?.let { put("connector_id", json.encodeToJsonElement(it)) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
        value.requireApproval?.let { put("require_approval", json.encodeToJsonElement(it)) }
        value.serverDescription?.let { put("server_description", it) }
        value.serverUrl?.let { put("server_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mcpServerTool(block: McpServerTool.Builder.() -> Unit): McpServerTool = McpServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("McpServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
