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

@Serializable
public data class WebFetchServerToolView(
  public val parameters: WebFetchServerToolConfig? = null,
  public val type: InlineComponentsSchemasWebFetchServerToolPropertiesType,
)

/**
 * OpenRouter built-in server tool: fetches full content from a URL (web page or PDF)
 */
@Serializable(with = WebFetchServerTool.Serializer::class)
public class WebFetchServerTool(
  public val type: InlineComponentsSchemasWebFetchServerToolPropertiesType,
  public val parameters: WebFetchServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasWebFetchServerToolPropertiesType? = null

    public var type: InlineComponentsSchemasWebFetchServerToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: WebFetchServerToolConfig? = null

    public fun build(): WebFetchServerTool {
      check(typeValue != null) { "type is required" }
      return WebFetchServerTool(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebFetchServerTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebFetchServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebFetchServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("WebFetchServerTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("WebFetchServerTool must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasWebFetchServerToolPropertiesType>(raw, "type")
      return WebFetchServerTool(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<WebFetchServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebFetchServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("WebFetchServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webFetchServerTool(block: WebFetchServerTool.Builder.() -> Unit): WebFetchServerTool = WebFetchServerTool
  .build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebFetchServerTool is missing required property '" + name +
    "'")
  return decodeFromJsonElement(element)
}
