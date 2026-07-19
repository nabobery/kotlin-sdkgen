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
public data class WebSearchServerToolOpenRouterView(
  public val parameters: WebSearchServerToolConfig? = null,
  public val type: InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType,
)

/**
 * OpenRouter built-in server tool: searches the web for current information
 */
@Serializable(with = WebSearchServerToolOpenRouter.Serializer::class)
public class WebSearchServerToolOpenRouter(
  public val type: InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType,
  public val parameters: WebSearchServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType? =
        null

    public var type: InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: WebSearchServerToolConfig? = null

    public fun build(): WebSearchServerToolOpenRouter {
      check(typeValue != null) { "type is required" }
      return WebSearchServerToolOpenRouter(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebSearchServerToolOpenRouter = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<WebSearchServerToolOpenRouter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebSearchServerToolOpenRouter {
      val jsonDecoder = decoder.requireJsonDecoder("WebSearchServerToolOpenRouter")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("WebSearchServerToolOpenRouter must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasWebSearchServerToolOpenRouterPropertiesType>(raw, "type")
      return WebSearchServerToolOpenRouter(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<WebSearchServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebSearchServerToolOpenRouter) {
      val jsonEncoder = encoder.requireJsonEncoder("WebSearchServerToolOpenRouter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webSearchServerToolOpenRouter(block: WebSearchServerToolOpenRouter.Builder.() ->
  Unit): WebSearchServerToolOpenRouter = WebSearchServerToolOpenRouter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("WebSearchServerToolOpenRouter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
