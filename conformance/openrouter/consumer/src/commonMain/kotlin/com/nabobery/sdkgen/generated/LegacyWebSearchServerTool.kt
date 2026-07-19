package com.nabobery.sdkgen.generated

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
public data class LegacyWebSearchServerToolView(
  public val engine: WebSearchEngineEnum? = null,
  public val filters: WebSearchDomainFilter? = null,
  @SerialName("max_results")
  public val maxResults: Int? = null,
  @SerialName("search_context_size")
  public val searchContextSize: SearchContextSizeEnum? = null,
  public val type: InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType,
  @SerialName("user_location")
  public val userLocation: WebSearchUserLocation? = null,
)

/**
 * Web search tool configuration
 */
@Serializable(with = LegacyWebSearchServerTool.Serializer::class)
public class LegacyWebSearchServerTool(
  public val type: InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType,
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
    private var typeValue: InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType? = null

    public var type: InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType
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

    public fun build(): LegacyWebSearchServerTool {
      check(typeValue != null) { "type is required" }
      return LegacyWebSearchServerTool(
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
    public fun build(block: Builder.() -> Unit): LegacyWebSearchServerTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<LegacyWebSearchServerTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegacyWebSearchServerTool {
      val jsonDecoder = decoder.requireJsonDecoder("LegacyWebSearchServerTool")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("LegacyWebSearchServerTool must be a JSON object")
      val type = json.decodeRequired<InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType>(raw, "type")
      return LegacyWebSearchServerTool(
        type = type,
        engine = raw["engine"]?.let { json.decodeFromJsonElement<WebSearchEngineEnum>(it) },
        filters = raw["filters"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<WebSearchDomainFilter?>(element) },
        maxResults = raw["max_results"]?.let { json.decodeFromJsonElement<Int>(it) },
        searchContextSize = raw["search_context_size"]?.let { json.decodeFromJsonElement<SearchContextSizeEnum>(it) },
        userLocation = raw["user_location"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<WebSearchUserLocation?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegacyWebSearchServerTool) {
      val jsonEncoder = encoder.requireJsonEncoder("LegacyWebSearchServerTool")
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

public fun legacyWebSearchServerTool(block: LegacyWebSearchServerTool.Builder.() -> Unit): LegacyWebSearchServerTool =
  LegacyWebSearchServerTool.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LegacyWebSearchServerTool is missing required property '" +
    name + "'")
  return decodeFromJsonElement(element)
}
