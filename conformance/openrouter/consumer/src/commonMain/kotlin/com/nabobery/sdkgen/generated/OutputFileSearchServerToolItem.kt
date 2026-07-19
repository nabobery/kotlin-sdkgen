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

/**
 * An openrouter:file_search server tool output item
 */
@Serializable(with = OutputFileSearchServerToolItem.Serializer::class)
public class OutputFileSearchServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType,
  public val id: String? = null,
  public val queries: List<String>? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType? =
        null

    public var type: InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public var queries: List<String>? = null

    public fun build(): OutputFileSearchServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputFileSearchServerToolItem(
        status = status,
        type = type,
        id = id,
        queries = queries,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputFileSearchServerToolItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputFileSearchServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputFileSearchServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputFileSearchServerToolItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputFileSearchServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType>(raw, "type")
      return OutputFileSearchServerToolItem(
        status = status,
        type = type,
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
        queries = raw["queries"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputFileSearchServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputFileSearchServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.queries?.let { put("queries", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputFileSearchServerToolItem(block: OutputFileSearchServerToolItem.Builder.() ->
  Unit): OutputFileSearchServerToolItem = OutputFileSearchServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("OutputFileSearchServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
