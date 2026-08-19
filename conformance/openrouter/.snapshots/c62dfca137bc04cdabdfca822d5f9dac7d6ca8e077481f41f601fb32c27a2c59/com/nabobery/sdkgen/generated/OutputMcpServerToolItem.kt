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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * An openrouter:mcp server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMcpServerToolItem
 */
@Serializable(with = OutputMcpServerToolItem.Serializer::class)
public class OutputMcpServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputMcpServerToolItemTypeX4ef5a034,
  public val id: String? = null,
  public val serverLabel: String? = null,
  public val toolName: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputMcpServerToolItemTypeX4ef5a034? = null

    public var type: InlineOutputMcpServerToolItemTypeX4ef5a034
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public var serverLabel: String? = null

    public var toolName: String? = null

    public fun build(): OutputMcpServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputMcpServerToolItem(
        status = status,
        type = type,
        id = id,
        serverLabel = serverLabel,
        toolName = toolName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputMcpServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputMcpServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputMcpServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputMcpServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputMcpServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputMcpServerToolItemTypeX4ef5a034>(rawObject, "type")
      return OutputMcpServerToolItem(
        status = status,
        type = type,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        serverLabel = rawObject["serverLabel"]?.let { json.decodeFromJsonElement<String>(it) },
        toolName = rawObject["toolName"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputMcpServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputMcpServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.serverLabel?.let { put("serverLabel", it) }
        value.toolName?.let { put("toolName", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputMcpServerToolItem(block: OutputMcpServerToolItem.Builder.() -> Unit): OutputMcpServerToolItem = OutputMcpServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputMcpServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
