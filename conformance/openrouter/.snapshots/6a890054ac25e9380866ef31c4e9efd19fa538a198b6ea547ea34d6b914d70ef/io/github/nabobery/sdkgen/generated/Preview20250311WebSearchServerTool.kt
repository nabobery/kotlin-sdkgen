package io.github.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class Preview20250311WebSearchServerToolView(
  public val engine: WebSearchEngineEnum? = null,
  public val filters: WebSearchDomainFilter? = null,
  @SerialName("max_results")
  public val maxResults: Int? = null,
  @SerialName("search_context_size")
  public val searchContextSize: SearchContextSizeEnum? = null,
  public val type: InlinePreview20250311WebSearchServerToolTypeX527f63bd,
  @SerialName("user_location")
  public val userLocation: PreviewWebSearchUserLocation? = null,
)

/**
 * Web search preview tool configuration (2025-03-11 version)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Preview_20250311_WebSearchServerTool
 */
@Serializable(with = Preview20250311WebSearchServerTool.Serializer::class)
public class Preview20250311WebSearchServerTool(
  public val type: InlinePreview20250311WebSearchServerToolTypeX527f63bd,
  public val engine: WebSearchEngineEnum? = null,
  public val filters: WebSearchDomainFilter? = null,
  /**
   * Maximum number of search results to return per search call. Defaults to 5. Applies to Exa, Firecrawl, Parallel, and
   * Perplexity engines; ignored with native provider search. Perplexity supports a maximum of 20; values above 20 are
   * clamped.
   */
  public val maxResults: Int? = null,
  public val searchContextSize: SearchContextSizeEnum? = null,
  public val userLocation: PreviewWebSearchUserLocation? = null,
) {
  public class Builder {
    private var typeValue: InlinePreview20250311WebSearchServerToolTypeX527f63bd? = null

    public var type: InlinePreview20250311WebSearchServerToolTypeX527f63bd
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var engine: WebSearchEngineEnum? = null

    public var filters: WebSearchDomainFilter? = null

    /**
     * Maximum number of search results to return per search call. Defaults to 5. Applies to Exa, Firecrawl, Parallel,
     * and Perplexity engines; ignored with native provider search. Perplexity supports a maximum of 20; values above 20
     * are clamped.
     */
    public var maxResults: Int? = null

    public var searchContextSize: SearchContextSizeEnum? = null

    public var userLocation: PreviewWebSearchUserLocation? = null

    public fun build(): Preview20250311WebSearchServerTool {
      check(typeValue != null) { "type is required" }
      return Preview20250311WebSearchServerTool(
        type = type,
        engine = engine,
        filters = filters,
        maxResults = maxResults,
        searchContextSize = searchContextSize,
        userLocation = userLocation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Preview20250311WebSearchServerTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Preview20250311WebSearchServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Preview20250311WebSearchServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("Preview20250311WebSearchServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Preview20250311WebSearchServerTool must be a JSON object")
      val type = json.decodeRequired<InlinePreview20250311WebSearchServerToolTypeX527f63bd>(rawObject, "type")
      return Preview20250311WebSearchServerTool(
        type = type,
        engine = rawObject["engine"]?.let { json.decodeFromJsonElement<WebSearchEngineEnum>(it) },
        filters = rawObject["filters"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebSearchDomainFilter?>(element) },
        maxResults = rawObject["max_results"]?.let { json.decodeFromJsonElement<Int>(it) },
        searchContextSize = rawObject["search_context_size"]?.let { json.decodeFromJsonElement<SearchContextSizeEnum>(it) },
        userLocation = rawObject["user_location"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<PreviewWebSearchUserLocation?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Preview20250311WebSearchServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("Preview20250311WebSearchServerTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.engine?.let { put("engine", json.encodeToJsonElement(it)) }
        value.filters?.let { put("filters", json.encodeToJsonElement(it)) }
        value.maxResults?.let { put("max_results", json.encodeToJsonElement(it)) }
        value.searchContextSize?.let { put("search_context_size", json.encodeToJsonElement(it)) }
        value.userLocation?.let { put("user_location", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun preview20250311WebSearchServerTool(block: Preview20250311WebSearchServerTool.Builder.() -> Unit): Preview20250311WebSearchServerTool = Preview20250311WebSearchServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Preview20250311WebSearchServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
