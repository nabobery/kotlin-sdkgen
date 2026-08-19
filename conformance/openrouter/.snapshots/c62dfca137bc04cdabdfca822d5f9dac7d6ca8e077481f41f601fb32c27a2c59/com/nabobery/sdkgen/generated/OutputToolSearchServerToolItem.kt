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
 * An openrouter:tool_search server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputToolSearchServerToolItem
 */
@Serializable(with = OutputToolSearchServerToolItem.Serializer::class)
public class OutputToolSearchServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputToolSearchServerToolItemTypeX5470ace1,
  public val id: String? = null,
  public val query: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputToolSearchServerToolItemTypeX5470ace1? = null

    public var type: InlineOutputToolSearchServerToolItemTypeX5470ace1
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var id: String? = null

    public var query: String? = null

    public fun build(): OutputToolSearchServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputToolSearchServerToolItem(
        status = status,
        type = type,
        id = id,
        query = query,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputToolSearchServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputToolSearchServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputToolSearchServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputToolSearchServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputToolSearchServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputToolSearchServerToolItemTypeX5470ace1>(rawObject, "type")
      return OutputToolSearchServerToolItem(
        status = status,
        type = type,
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        query = rawObject["query"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputToolSearchServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputToolSearchServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.id?.let { put("id", it) }
        value.query?.let { put("query", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputToolSearchServerToolItem(block: OutputToolSearchServerToolItem.Builder.() -> Unit): OutputToolSearchServerToolItem = OutputToolSearchServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputToolSearchServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
