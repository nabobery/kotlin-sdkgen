package com.nabobery.sdkgen.generated

import kotlin.Int
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
 * An openrouter:web_fetch server tool output item
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputWebFetchServerToolItem
 */
@Serializable(with = OutputWebFetchServerToolItem.Serializer::class)
public class OutputWebFetchServerToolItem(
  public val status: ToolCallStatus,
  public val type: InlineOutputWebFetchServerToolItemTypeXad27afcc,
  public val content: String? = null,
  /**
   * The error message if the fetch failed.
   */
  public val error: String? = null,
  /**
   * The HTTP status code returned by the upstream URL fetch.
   */
  public val httpStatus: Int? = null,
  public val id: String? = null,
  public val title: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    private var statusValue: ToolCallStatus? = null

    public var status: ToolCallStatus
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var typeValue: InlineOutputWebFetchServerToolItemTypeXad27afcc? = null

    public var type: InlineOutputWebFetchServerToolItemTypeXad27afcc
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var content: String? = null

    /**
     * The error message if the fetch failed.
     */
    public var error: String? = null

    /**
     * The HTTP status code returned by the upstream URL fetch.
     */
    public var httpStatus: Int? = null

    public var id: String? = null

    public var title: String? = null

    public var url: String? = null

    public fun build(): OutputWebFetchServerToolItem {
      check(statusValue != null) { "status is required" }
      check(typeValue != null) { "type is required" }
      return OutputWebFetchServerToolItem(
        status = status,
        type = type,
        content = content,
        error = error,
        httpStatus = httpStatus,
        id = id,
        title = title,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutputWebFetchServerToolItem = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OutputWebFetchServerToolItem> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutputWebFetchServerToolItem {
      val jsonDecoder = decoder.requireJsonDecoder("OutputWebFetchServerToolItem")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutputWebFetchServerToolItem must be a JSON object")
      val status = json.decodeRequired<ToolCallStatus>(rawObject, "status")
      val type = json.decodeRequired<InlineOutputWebFetchServerToolItemTypeXad27afcc>(rawObject, "type")
      return OutputWebFetchServerToolItem(
        status = status,
        type = type,
        content = rawObject["content"]?.let { json.decodeFromJsonElement<String>(it) },
        error = rawObject["error"]?.let { json.decodeFromJsonElement<String>(it) },
        httpStatus = rawObject["httpStatus"]?.let { json.decodeFromJsonElement<Int>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
        title = rawObject["title"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutputWebFetchServerToolItem) {
      val jsonEncoder = encoder.requireJsonEncoder("OutputWebFetchServerToolItem")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("status", json.encodeToJsonElement(value.status))
        put("type", json.encodeToJsonElement(value.type))
        value.content?.let { put("content", it) }
        value.error?.let { put("error", it) }
        value.httpStatus?.let { put("httpStatus", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", it) }
        value.title?.let { put("title", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outputWebFetchServerToolItem(block: OutputWebFetchServerToolItem.Builder.() -> Unit): OutputWebFetchServerToolItem = OutputWebFetchServerToolItem.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutputWebFetchServerToolItem is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
