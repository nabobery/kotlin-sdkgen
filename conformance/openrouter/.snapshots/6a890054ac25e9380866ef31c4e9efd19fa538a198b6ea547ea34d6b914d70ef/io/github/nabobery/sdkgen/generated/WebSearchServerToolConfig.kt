package io.github.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for the openrouter:web_search server tool
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchServerToolConfig
 */
@Serializable(with = WebSearchServerToolConfig.Serializer::class)
public class WebSearchServerToolConfig(
  allowedDomains: List<String>? = null,
  public val engine: WebSearchEngineEnum? = null,
  excludedDomains: List<String>? = null,
  /**
   * Exact maximum number of characters of content per search result. Applies to the Exa, Parallel, and Perplexity
   * engines; ignored with native provider search and Firecrawl. For Exa, caps highlight content per result. For
   * Parallel, caps excerpt content per result (default 1,500 when omitted). For Perplexity, maps to the native
   * `max_tokens_per_page` parameter (converted from characters to tokens) and trims the response to the exact character
   * cap. When both `max_characters` and `search_context_size` are set, `max_characters` takes precedence. When omitted,
   * falls back to `search_context_size` mapping (Exa) or engine defaults (Parallel, Perplexity).
   */
  public val maxCharacters: Int? = null,
  /**
   * Maximum number of search results to return per search call. Defaults to 5. Applies to Exa, Firecrawl, Parallel, and
   * Perplexity engines; ignored with native provider search. Perplexity supports a maximum of 20; values above 20 are
   * clamped.
   */
  public val maxResults: Int? = null,
  /**
   * Maximum total number of search results across all search calls in a single request. Once this limit is reached, the
   * tool will stop returning new results. Useful for controlling cost and context size in agentic loops. Defaults to 50
   * when not specified.
   */
  public val maxTotalResults: Int? = null,
  public val searchContextSize: SearchQualityLevel? = null,
  public val userLocation: WebSearchUserLocationServerTool? = null,
) {
  /**
   * Limit search results to these domains. Supported by Exa, Firecrawl, Parallel, Perplexity, and most native providers
   * (Anthropic, OpenAI, xAI). Cannot be used with excluded_domains.
   */
  public val allowedDomains: List<String>? =
      allowedDomains?.let { collection0 -> collection0.toList() }

  /**
   * Exclude search results from these domains. Supported by Exa, Firecrawl, Parallel, Perplexity, Anthropic, and xAI.
   * Not supported with OpenAI (silently ignored). Cannot be used with allowed_domains.
   */
  public val excludedDomains: List<String>? =
      excludedDomains?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var allowedDomainsValue: List<String>? = null

    /**
     * Limit search results to these domains. Supported by Exa, Firecrawl, Parallel, Perplexity, and most native
     * providers (Anthropic, OpenAI, xAI). Cannot be used with excluded_domains.
     */
    public var allowedDomains: List<String>?
      get() = allowedDomainsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedDomainsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var engine: WebSearchEngineEnum? = null

    private var excludedDomainsValue: List<String>? = null

    /**
     * Exclude search results from these domains. Supported by Exa, Firecrawl, Parallel, Perplexity, Anthropic, and xAI.
     * Not supported with OpenAI (silently ignored). Cannot be used with allowed_domains.
     */
    public var excludedDomains: List<String>?
      get() = excludedDomainsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludedDomainsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Exact maximum number of characters of content per search result. Applies to the Exa, Parallel, and Perplexity
     * engines; ignored with native provider search and Firecrawl. For Exa, caps highlight content per result. For
     * Parallel, caps excerpt content per result (default 1,500 when omitted). For Perplexity, maps to the native
     * `max_tokens_per_page` parameter (converted from characters to tokens) and trims the response to the exact
     * character cap. When both `max_characters` and `search_context_size` are set, `max_characters` takes precedence.
     * When omitted, falls back to `search_context_size` mapping (Exa) or engine defaults (Parallel, Perplexity).
     */
    public var maxCharacters: Int? = null

    /**
     * Maximum number of search results to return per search call. Defaults to 5. Applies to Exa, Firecrawl, Parallel,
     * and Perplexity engines; ignored with native provider search. Perplexity supports a maximum of 20; values above 20
     * are clamped.
     */
    public var maxResults: Int? = null

    /**
     * Maximum total number of search results across all search calls in a single request. Once this limit is reached,
     * the tool will stop returning new results. Useful for controlling cost and context size in agentic loops. Defaults
     * to 50 when not specified.
     */
    public var maxTotalResults: Int? = null

    public var searchContextSize: SearchQualityLevel? = null

    public var userLocation: WebSearchUserLocationServerTool? = null

    public fun build(): WebSearchServerToolConfig = WebSearchServerToolConfig(
      allowedDomains = allowedDomains,
      engine = engine,
      excludedDomains = excludedDomains,
      maxCharacters = maxCharacters,
      maxResults = maxResults,
      maxTotalResults = maxTotalResults,
      searchContextSize = searchContextSize,
      userLocation = userLocation,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebSearchServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebSearchServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebSearchServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("WebSearchServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebSearchServerToolConfig must be a JSON object")
      return WebSearchServerToolConfig(
        allowedDomains = rawObject["allowed_domains"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        engine = rawObject["engine"]?.let { json.decodeFromJsonElement<WebSearchEngineEnum>(it) },
        excludedDomains = rawObject["excluded_domains"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        maxCharacters = rawObject["max_characters"]?.let { json.decodeFromJsonElement<Int>(it) },
        maxResults = rawObject["max_results"]?.let { json.decodeFromJsonElement<Int>(it) },
        maxTotalResults = rawObject["max_total_results"]?.let { json.decodeFromJsonElement<Int>(it) },
        searchContextSize = rawObject["search_context_size"]?.let { json.decodeFromJsonElement<SearchQualityLevel>(it) },
        userLocation = rawObject["user_location"]?.let { json.decodeFromJsonElement<WebSearchUserLocationServerTool>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebSearchServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("WebSearchServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowedDomains?.let { put("allowed_domains", json.encodeToJsonElement(it)) }
        value.engine?.let { put("engine", json.encodeToJsonElement(it)) }
        value.excludedDomains?.let { put("excluded_domains", json.encodeToJsonElement(it)) }
        value.maxCharacters?.let { put("max_characters", json.encodeToJsonElement(it)) }
        value.maxResults?.let { put("max_results", json.encodeToJsonElement(it)) }
        value.maxTotalResults?.let { put("max_total_results", json.encodeToJsonElement(it)) }
        value.searchContextSize?.let { put("search_context_size", json.encodeToJsonElement(it)) }
        value.userLocation?.let { put("user_location", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webSearchServerToolConfig(block: WebSearchServerToolConfig.Builder.() -> Unit): WebSearchServerToolConfig = WebSearchServerToolConfig.build(block)
