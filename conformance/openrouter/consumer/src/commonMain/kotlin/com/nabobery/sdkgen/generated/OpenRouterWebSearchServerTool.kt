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
public data class OpenRouterWebSearchServerToolView(
  public val parameters: WebSearchConfig? = null,
  public val type: InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType,
)

/**
 * OpenRouter built-in server tool: searches the web for current information
 */
@Serializable(with = OpenRouterWebSearchServerTool.Serializer::class)
public class OpenRouterWebSearchServerTool(
  public val type: InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType,
  public val parameters: WebSearchConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType? =
        null

    public var type: InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: WebSearchConfig? = null

    public fun build(): OpenRouterWebSearchServerTool {
      check(typeValue != null) { "type is required" }
      return OpenRouterWebSearchServerTool(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OpenRouterWebSearchServerTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OpenRouterWebSearchServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OpenRouterWebSearchServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("OpenRouterWebSearchServerTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("OpenRouterWebSearchServerTool must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasOpenRouterWebSearchServerToolPropertiesType>(raw, "type")
      return OpenRouterWebSearchServerTool(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<WebSearchConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OpenRouterWebSearchServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("OpenRouterWebSearchServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun openRouterWebSearchServerTool(block: OpenRouterWebSearchServerTool.Builder.() ->
  Unit): OpenRouterWebSearchServerTool = OpenRouterWebSearchServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("OpenRouterWebSearchServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
