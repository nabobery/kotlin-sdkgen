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
  public val type: InlineWebFetchServerToolTypeX0b01fb42,
)

/**
 * OpenRouter built-in server tool: fetches full content from a URL (web page or PDF)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebFetchServerTool
 */
@Serializable(with = WebFetchServerTool.Serializer::class)
public class WebFetchServerTool(
  public val type: InlineWebFetchServerToolTypeX0b01fb42,
  public val parameters: WebFetchServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineWebFetchServerToolTypeX0b01fb42? = null

    public var type: InlineWebFetchServerToolTypeX0b01fb42
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

  internal object Serializer : KSerializer<WebFetchServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebFetchServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("WebFetchServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebFetchServerTool must be a JSON object")
      val type = json.decodeRequired<InlineWebFetchServerToolTypeX0b01fb42>(rawObject, "type")
      return WebFetchServerTool(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<WebFetchServerToolConfig>(it) },
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

public fun webFetchServerTool(block: WebFetchServerTool.Builder.() -> Unit): WebFetchServerTool = WebFetchServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebFetchServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
