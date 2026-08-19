package com.nabobery.sdkgen.generated

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
 * Configuration for the openrouter:web_fetch server tool
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/WebFetchServerToolConfig
 */
@Serializable(with = WebFetchServerToolConfig.Serializer::class)
public class WebFetchServerToolConfig(
  allowedDomains: List<String>? = null,
  blockedDomains: List<String>? = null,
  public val engine: WebFetchEngineEnum? = null,
  /**
   * Maximum content length in approximate tokens. Content exceeding this limit is truncated.
   */
  public val maxContentTokens: Int? = null,
  /**
   * Maximum number of web fetches per request. Once exceeded, the tool returns an error.
   */
  public val maxUses: Int? = null,
) {
  /**
   * Only fetch from these domains.
   */
  public val allowedDomains: List<String>? =
      allowedDomains?.let { collection0 -> collection0.toList() }

  /**
   * Never fetch from these domains.
   */
  public val blockedDomains: List<String>? =
      blockedDomains?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var allowedDomainsValue: List<String>? = null

    /**
     * Only fetch from these domains.
     */
    public var allowedDomains: List<String>?
      get() = allowedDomainsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedDomainsValue = value?.let { collection0 -> collection0.toList() }
      }

    private var blockedDomainsValue: List<String>? = null

    /**
     * Never fetch from these domains.
     */
    public var blockedDomains: List<String>?
      get() = blockedDomainsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        blockedDomainsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var engine: WebFetchEngineEnum? = null

    /**
     * Maximum content length in approximate tokens. Content exceeding this limit is truncated.
     */
    public var maxContentTokens: Int? = null

    /**
     * Maximum number of web fetches per request. Once exceeded, the tool returns an error.
     */
    public var maxUses: Int? = null

    public fun build(): WebFetchServerToolConfig = WebFetchServerToolConfig(
      allowedDomains = allowedDomains,
      blockedDomains = blockedDomains,
      engine = engine,
      maxContentTokens = maxContentTokens,
      maxUses = maxUses,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): WebFetchServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<WebFetchServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): WebFetchServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("WebFetchServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("WebFetchServerToolConfig must be a JSON object")
      return WebFetchServerToolConfig(
        allowedDomains = rawObject["allowed_domains"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        blockedDomains = rawObject["blocked_domains"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        engine = rawObject["engine"]?.let { json.decodeFromJsonElement<WebFetchEngineEnum>(it) },
        maxContentTokens = rawObject["max_content_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        maxUses = rawObject["max_uses"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: WebFetchServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("WebFetchServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowedDomains?.let { put("allowed_domains", json.encodeToJsonElement(it)) }
        value.blockedDomains?.let { put("blocked_domains", json.encodeToJsonElement(it)) }
        value.engine?.let { put("engine", json.encodeToJsonElement(it)) }
        value.maxContentTokens?.let { put("max_content_tokens", json.encodeToJsonElement(it)) }
        value.maxUses?.let { put("max_uses", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun webFetchServerToolConfig(block: WebFetchServerToolConfig.Builder.() -> Unit): WebFetchServerToolConfig = WebFetchServerToolConfig.build(block)
