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
 * An openrouter:text_editor server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputTextEditorServerToolItem
 */
@Serializable(with = OutputTextEditorServerToolItem.Serializer::class)
public class OutputTextEditorServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputTextEditorServerToolItemTypeXdeead8d2,
  public val command: InlineOutputTextEditorServerToolItemCommandXdbe8a59b? = null,
  public val filePath: String? = null,
  public val id: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputTextEditorServerToolItemTypeXdeead8d2? = null

    public var type: InlineOutputTextEditorServerToolItemTypeXdeead8d2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var command: InlineOutputTextEditorServerToolItemCommandXdbe8a59b? = null

    public var filePath: String? = null

    public var id: String? = null

    public fun build(): OutputTextEditorServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputTextEditorServerToolItem(
        status = status,
        type = type,
        command = command,
        filePath = filePath,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputTextEditorServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputTextEditorServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputTextEditorServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputTextEditorServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputTextEditorServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputTextEditorServerToolItemTypeXdeead8d2>(rawObject, "type")
      return OutputTextEditorServerToolItem(
        status = status,
        type = type,
        command = rawObject["command"]?.let { json.decodeFromJsonElement<InlineOutputTextEditorServerToolItemCommandXdbe8a59b>(it) },
        filePath = rawObject["filePath"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputTextEditorServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputTextEditorServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.command?.let { put("command", json.encodeToJsonElement(it)) }
        value.filePath?.let { put("filePath", it) }
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputTextEditorServerToolItem(block: OutputTextEditorServerToolItem.Builder.() -> Unit): OutputTextEditorServerToolItem = OutputTextEditorServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputTextEditorServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
