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
public data class SearchModelsServerToolOpenRouterView(
  public val parameters: SearchModelsServerToolConfig? = null,
  public val type: InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType,
)

/**
 * OpenRouter built-in server tool: searches and filters AI models available on OpenRouter
 */
@Serializable(with = SearchModelsServerToolOpenRouter.Serializer::class)
public class SearchModelsServerToolOpenRouter(
  public val type: InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType,
  public val parameters: SearchModelsServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType? =
        null

    public var type: InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var parameters: SearchModelsServerToolConfig? = null

    public fun build(): SearchModelsServerToolOpenRouter {
      check(typeValue != null) { "type is required" }
      return SearchModelsServerToolOpenRouter(
        type = type,
        parameters = parameters,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SearchModelsServerToolOpenRouter = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SearchModelsServerToolOpenRouter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SearchModelsServerToolOpenRouter {
      val jsonDecoder = decoder.requireJsonDecoder("SearchModelsServerToolOpenRouter")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("SearchModelsServerToolOpenRouter must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasSearchModelsServerToolOpenRouterPropertiesType>(raw, "type")
      return SearchModelsServerToolOpenRouter(
        type = type,
        parameters = raw["parameters"]?.let { json.decodeFromJsonElement<SearchModelsServerToolConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SearchModelsServerToolOpenRouter) {
      val jsonEncoder = encoder.requireJsonEncoder("SearchModelsServerToolOpenRouter")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.parameters?.let { put("parameters", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun searchModelsServerToolOpenRouter(block: SearchModelsServerToolOpenRouter.Builder.() ->
  Unit): SearchModelsServerToolOpenRouter = SearchModelsServerToolOpenRouter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("SearchModelsServerToolOpenRouter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
