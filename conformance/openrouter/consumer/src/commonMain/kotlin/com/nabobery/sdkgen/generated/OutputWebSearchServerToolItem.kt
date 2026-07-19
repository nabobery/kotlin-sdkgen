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
 * An openrouter:web_search server tool output item
 */
@Serializable(with = OutputWebSearchServerToolItem.Serializer::class)
public class OutputWebSearchServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType,
  /**
   * The search action performed, matching OpenAI web_search_call.action shape. Includes the query the model issued and
   * optional source URLs returned by the search provider.
   */
  public val action: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction? = null,
  public val id: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType? =
        null

    public var type: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * The search action performed, matching OpenAI web_search_call.action shape. Includes the query the model issued
     * and optional source URLs returned by the search provider.
     */
    public var action: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction? = null

    public var id: String? = null

    public fun build(): OutputWebSearchServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputWebSearchServerToolItem(
        status = status,
        type = type,
        action = action,
        id = id,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputWebSearchServerToolItem = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutputWebSearchServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputWebSearchServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputWebSearchServerToolItem")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OutputWebSearchServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(raw, "status")
      val type = json.decodeRequired<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType>(raw, "type")
      return OutputWebSearchServerToolItem(
        status = status,
        type = type,
        action = raw["action"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesAction>(it) },
        id = raw["id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputWebSearchServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputWebSearchServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.action?.let { put("action", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputWebSearchServerToolItem(block: OutputWebSearchServerToolItem.Builder.() ->
  Unit): OutputWebSearchServerToolItem = OutputWebSearchServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("OutputWebSearchServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
