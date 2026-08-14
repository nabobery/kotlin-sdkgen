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
public data class WebSearchServerToolView(
  public val engine: WebSearchEngineEnum? = null,
  public val filters: WebSearchDomainFilter? = null,
  @SerialName("max_results")
  public val maxResults: Int? = null,
  @SerialName("search_context_size")
  public val searchContextSize: SearchContextSizeEnum? = null,
  public val type: InlineWebSearchServerToolTypeX7d2abf06,
  @SerialName("user_location")
  public val userLocation: WebSearchUserLocation? = null,
)

/**
 * Web search tool configuration (2025-08-26 version)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchServerTool
 */
@Serializable(with = WebSearchServerTool.Serializer::class)
public class WebSearchServerTool(
  public val type: InlineWebSearchServerToolTypeX7d2abf06,
  public val engine: WebSearchEngineEnum? = null,
  public val filters: WebSearchDomainFilter? = null,
  /**
   * Maximum number of search results to return per search call. Defaults to 5. Applies to Exa, Firecrawl, Parallel, and
   * Perplexity engines; ignored with native provider search. Perplexity supports a maximum of 20; values above 20 are
   * clamped.
   */
  public val maxResults: Int? = null,
  public val searchContextSize: SearchContextSizeEnum? = null,
  public val userLocation: WebSearchUserLocation? = null,
) {
  public class Builder {
    private var typeValue: InlineWebSearchServerToolTypeX7d2abf06? = null

    public var type: InlineWebSearchServerToolTypeX7d2abf06
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

    public var userLocation: WebSearchUserLocation? = null

    public fun build(): WebSearchServerTool {
      check(typeValue != null) { "type is required" }
      return WebSearchServerTool(
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
    public fun build(block: Builder.() -> Unit): WebSearchServerTool = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebSearchServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebSearchServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("WebSearchServerTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebSearchServerTool must be a JSON object")
      val type = json.decodeRequired<InlineWebSearchServerToolTypeX7d2abf06>(rawObject, "type")
      return WebSearchServerTool(
        type = type,
        engine = rawObject["engine"]?.let { json.decodeFromJsonElement<WebSearchEngineEnum>(it) },
        filters = rawObject["filters"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebSearchDomainFilter?>(element) },
        maxResults = rawObject["max_results"]?.let { json.decodeFromJsonElement<Int>(it) },
        searchContextSize = rawObject["search_context_size"]?.let { json.decodeFromJsonElement<SearchContextSizeEnum>(it) },
        userLocation = rawObject["user_location"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebSearchUserLocation?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebSearchServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("WebSearchServerTool")
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

public fun webSearchServerTool(block: WebSearchServerTool.Builder.() -> Unit): WebSearchServerTool = WebSearchServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebSearchServerTool is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
