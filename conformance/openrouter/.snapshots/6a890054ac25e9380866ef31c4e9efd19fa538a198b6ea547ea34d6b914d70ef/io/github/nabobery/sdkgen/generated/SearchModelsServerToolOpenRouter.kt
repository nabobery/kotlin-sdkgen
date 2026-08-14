package io.github.nabobery.sdkgen.generated

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
  public val type: InlineSearchModelsServerToolOpenRouterTypeXdc204ff5,
)

/**
 * OpenRouter built-in server tool: searches and filters AI models available on OpenRouter
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SearchModelsServerTool_OpenRouter
 */
@Serializable(with = SearchModelsServerToolOpenRouter.Serializer::class)
public class SearchModelsServerToolOpenRouter(
  public val type: InlineSearchModelsServerToolOpenRouterTypeXdc204ff5,
  public val parameters: SearchModelsServerToolConfig? = null,
) {
  public class Builder {
    private var typeValue: InlineSearchModelsServerToolOpenRouterTypeXdc204ff5? = null

    public var type: InlineSearchModelsServerToolOpenRouterTypeXdc204ff5
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

  internal object Serializer : KSerializer<SearchModelsServerToolOpenRouter> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SearchModelsServerToolOpenRouter {
      val jsonDecoder = decoder.requireJsonDecoder("SearchModelsServerToolOpenRouter")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SearchModelsServerToolOpenRouter must be a JSON object")
      val type = json.decodeRequired<InlineSearchModelsServerToolOpenRouterTypeXdc204ff5>(rawObject, "type")
      return SearchModelsServerToolOpenRouter(
        type = type,
        parameters = rawObject["parameters"]?.let { json.decodeFromJsonElement<SearchModelsServerToolConfig>(it) },
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

public fun searchModelsServerToolOpenRouter(block: SearchModelsServerToolOpenRouter.Builder.() -> Unit): SearchModelsServerToolOpenRouter = SearchModelsServerToolOpenRouter.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SearchModelsServerToolOpenRouter is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
