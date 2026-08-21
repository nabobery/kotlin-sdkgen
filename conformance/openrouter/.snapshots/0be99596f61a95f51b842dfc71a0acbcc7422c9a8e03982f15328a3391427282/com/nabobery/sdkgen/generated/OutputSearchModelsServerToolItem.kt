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
 * An openrouter:experimental__search_models server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputSearchModelsServerToolItem
 */
@Serializable(with = OutputSearchModelsServerToolItem.Serializer::class)
public class OutputSearchModelsServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputSearchModelsServerToolItemTypeX99374856,
  /**
   * The JSON arguments submitted to the search tool (e.g. {"query":"Claude"})
   */
  public val arguments: String? = null,
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

    private var typeValue: InlineOutputSearchModelsServerToolItemTypeX99374856? = null

    public var type: InlineOutputSearchModelsServerToolItemTypeX99374856
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The JSON arguments submitted to the search tool (e.g. {"query":"Claude"})
     */
    public var arguments: String? = null

    public var id: String? = null

    public var query: String? = null

    public fun build(): OutputSearchModelsServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputSearchModelsServerToolItem(
        status = status,
        type = type,
        arguments = arguments,
        id = id,
        query = query,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputSearchModelsServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputSearchModelsServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputSearchModelsServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputSearchModelsServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputSearchModelsServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputSearchModelsServerToolItemTypeX99374856>(rawObject, "type")
      return OutputSearchModelsServerToolItem(
        status = status,
        type = type,
        arguments = rawObject["arguments"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        query = rawObject["query"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputSearchModelsServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputSearchModelsServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.arguments?.let { put("arguments", it) }
        value.id?.let { put("id", it) }
        value.query?.let { put("query", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputSearchModelsServerToolItem(block: OutputSearchModelsServerToolItem.Builder.() -> Unit): OutputSearchModelsServerToolItem = OutputSearchModelsServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputSearchModelsServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
