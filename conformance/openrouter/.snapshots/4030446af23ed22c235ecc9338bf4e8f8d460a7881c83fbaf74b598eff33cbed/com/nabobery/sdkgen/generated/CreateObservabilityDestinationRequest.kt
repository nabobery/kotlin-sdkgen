package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/CreateObservabilityDestinationRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CreateObservabilityDestinationRequest
 */
@Serializable(with = CreateObservabilityDestinationRequest.Serializer::class)
public class CreateObservabilityDestinationRequest(
  config: Map<String, JsonElement?>,
  /**
   * Human-readable name for the destination.
   */
  public val name: String,
  /**
   * The destination type. Only stable destination types are accepted.
   */
  public val type: InlineCreateObservabilityDestinationRequestTypeX569a5ffb,
  apiKeyHashes: List<String>? = null,
  /**
   * Whether this destination should be enabled immediately.
   */
  public val enabled: Boolean? = null,
  public val filterRules: ObservabilityFilterRulesConfigNullable? = null,
  /**
   * When true, request/response bodies are not forwarded — only metadata.
   */
  public val privacyMode: Boolean? = null,
  /**
   * Sampling rate between 0.0001 and 1 (1 = 100%).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val samplingRate: Double? = null,
  /**
   * Optional workspace ID. Defaults to the authenticated entity's default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val workspaceId: String? = null,
) {
  /**
   * Provider-specific configuration. The shape depends on `type` and is validated server-side.
   */
  public val config: Map<String, JsonElement?> = config.toMap()

  /**
   * Optional allowlist of OpenRouter API key hashes whose traffic is forwarded. `null` or omitted means all keys. Must
   * contain at least one hash if provided.
   */
  public val apiKeyHashes: List<String>? = apiKeyHashes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var configValue: Map<String, JsonElement?>? = null

    public var config: Map<String, JsonElement?>
      get() = requireNotNull(configValue) { "config is required" }.toMap()
      set(`value`) {
        configValue = value.toMap()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var typeValue: InlineCreateObservabilityDestinationRequestTypeX569a5ffb? = null

    public var type: InlineCreateObservabilityDestinationRequestTypeX569a5ffb
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var apiKeyHashesValue: List<String>? = null

    /**
     * Optional allowlist of OpenRouter API key hashes whose traffic is forwarded. `null` or omitted means all keys.
     * Must contain at least one hash if provided.
     */
    public var apiKeyHashes: List<String>?
      get() = apiKeyHashesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        apiKeyHashesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Whether this destination should be enabled immediately.
     */
    public var enabled: Boolean? = null

    public var filterRules: ObservabilityFilterRulesConfigNullable? = null

    /**
     * When true, request/response bodies are not forwarded — only metadata.
     */
    public var privacyMode: Boolean? = null

    /**
     * Sampling rate between 0.0001 and 1 (1 = 100%).
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var samplingRate: Double? = null

    /**
     * Optional workspace ID. Defaults to the authenticated entity's default workspace.
     *
     * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var workspaceId: String? = null

    public fun build(): CreateObservabilityDestinationRequest {
      check(configValue != null) { "config is required" }
      check(nameValue != null) { "name is required" }
      check(typeValue != null) { "type is required" }
      return CreateObservabilityDestinationRequest(
        config = config,
        name = name,
        type = type,
        apiKeyHashes = apiKeyHashes,
        enabled = enabled,
        filterRules = filterRules,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        workspaceId = workspaceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CreateObservabilityDestinationRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CreateObservabilityDestinationRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CreateObservabilityDestinationRequest {
      val jsonDecoder = decoder.requireJsonDecoder("CreateObservabilityDestinationRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CreateObservabilityDestinationRequest must be a JSON object")
      val config = json.decodeRequired<Map<String, JsonElement?>>(rawObject, "config")
      val name = json.decodeRequired<String>(rawObject, "name")
      val type = json.decodeRequired<InlineCreateObservabilityDestinationRequestTypeX569a5ffb>(rawObject, "type")
      return CreateObservabilityDestinationRequest(
        config = config,
        name = name,
        type = type,
        apiKeyHashes = rawObject["api_key_hashes"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        filterRules = rawObject["filter_rules"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ObservabilityFilterRulesConfigNullable?>(element) },
        privacyMode = rawObject["privacy_mode"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        samplingRate = rawObject["sampling_rate"]?.let { json.decodeFromJsonElement<Double>(it) },
        workspaceId = rawObject["workspace_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CreateObservabilityDestinationRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("CreateObservabilityDestinationRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("config", json.encodeToJsonElement(value.config))
        put("name", value.name)
        put("type", json.encodeToJsonElement(value.type))
        value.apiKeyHashes?.let { put("api_key_hashes", json.encodeToJsonElement(it)) }
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.filterRules?.let { put("filter_rules", json.encodeToJsonElement(it)) }
        value.privacyMode?.let { put("privacy_mode", json.encodeToJsonElement(it)) }
        value.samplingRate?.let { put("sampling_rate", json.encodeToJsonElement(it)) }
        value.workspaceId?.let { put("workspace_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun createObservabilityDestinationRequest(block: CreateObservabilityDestinationRequest.Builder.() -> Unit): CreateObservabilityDestinationRequest = CreateObservabilityDestinationRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CreateObservabilityDestinationRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
