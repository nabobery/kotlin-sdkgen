package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/WebSearchPlugin.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebSearchPlugin
 */
@Serializable(with = WebSearchPlugin.Serializer::class)
public class WebSearchPlugin(
  public val id: InlineWebSearchPluginIdX656406c7,
  /**
   * Set to false to disable the web-search plugin for this request. Defaults to true.
   */
  public val enabled: Boolean? = null,
  public val engine: WebSearchEngine? = null,
  excludeDomains: List<String>? = null,
  includeDomains: List<String>? = null,
  public val maxResults: Int? = null,
  /**
   * Maximum number of times the model can invoke web search in a single turn. Passed through to native providers that
   * support it (e.g. Anthropic).
   */
  public val maxUses: Int? = null,
  public val searchPrompt: String? = null,
  public val userLocation: WebSearchUserLocation? = null,
) {
  /**
   * A list of domains to exclude from web search results. Supports wildcards (e.g. "*.substack.com") and path filtering
   * (e.g. "openai.com/blog").
   */
  public val excludeDomains: List<String>? =
      excludeDomains?.let { collection0 -> collection0.toList() }

  /**
   * A list of domains to restrict web search results to. Supports wildcards (e.g. "*.substack.com") and path filtering
   * (e.g. "openai.com/blog").
   */
  public val includeDomains: List<String>? =
      includeDomains?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var idValue: InlineWebSearchPluginIdX656406c7? = null

    public var id: InlineWebSearchPluginIdX656406c7
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    /**
     * Set to false to disable the web-search plugin for this request. Defaults to true.
     */
    public var enabled: Boolean? = null

    public var engine: WebSearchEngine? = null

    private var excludeDomainsValue: List<String>? = null

    /**
     * A list of domains to exclude from web search results. Supports wildcards (e.g. "*.substack.com") and path
     * filtering (e.g. "openai.com/blog").
     */
    public var excludeDomains: List<String>?
      get() = excludeDomainsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        excludeDomainsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var includeDomainsValue: List<String>? = null

    /**
     * A list of domains to restrict web search results to. Supports wildcards (e.g. "*.substack.com") and path
     * filtering (e.g. "openai.com/blog").
     */
    public var includeDomains: List<String>?
      get() = includeDomainsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        includeDomainsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var maxResults: Int? = null

    /**
     * Maximum number of times the model can invoke web search in a single turn. Passed through to native providers that
     * support it (e.g. Anthropic).
     */
    public var maxUses: Int? = null

    public var searchPrompt: String? = null

    public var userLocation: WebSearchUserLocation? = null

    public fun build(): WebSearchPlugin {
      check(idValue != null) { "id is required" }
      return WebSearchPlugin(
        id = id,
        enabled = enabled,
        engine = engine,
        excludeDomains = excludeDomains,
        includeDomains = includeDomains,
        maxResults = maxResults,
        maxUses = maxUses,
        searchPrompt = searchPrompt,
        userLocation = userLocation,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebSearchPlugin = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebSearchPlugin> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebSearchPlugin {
      val jsonDecoder = decoder.requireJsonDecoder("WebSearchPlugin")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebSearchPlugin must be a JSON object")
      val id = json.decodeRequired<InlineWebSearchPluginIdX656406c7>(rawObject, "id")
      return WebSearchPlugin(
        id = id,
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        engine = rawObject["engine"]?.let { json.decodeFromJsonElement<WebSearchEngine>(it) },
        excludeDomains = rawObject["exclude_domains"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        includeDomains = rawObject["include_domains"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        maxResults = rawObject["max_results"]?.let { json.decodeFromJsonElement<Int>(it) },
        maxUses = rawObject["max_uses"]?.let { json.decodeFromJsonElement<Int>(it) },
        searchPrompt = rawObject["search_prompt"]?.let { json.decodeFromJsonElement<String>(it) },
        userLocation = rawObject["user_location"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<WebSearchUserLocation?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebSearchPlugin) {
      val jsonEncoder = encoder.requireJsonEncoder("WebSearchPlugin")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.engine?.let { put("engine", json.encodeToJsonElement(it)) }
        value.excludeDomains?.let { put("exclude_domains", json.encodeToJsonElement(it)) }
        value.includeDomains?.let { put("include_domains", json.encodeToJsonElement(it)) }
        value.maxResults?.let { put("max_results", json.encodeToJsonElement(it)) }
        value.maxUses?.let { put("max_uses", json.encodeToJsonElement(it)) }
        value.searchPrompt?.let { put("search_prompt", it) }
        value.userLocation?.let { put("user_location", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webSearchPlugin(block: WebSearchPlugin.Builder.() -> Unit): WebSearchPlugin = WebSearchPlugin.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("WebSearchPlugin is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
