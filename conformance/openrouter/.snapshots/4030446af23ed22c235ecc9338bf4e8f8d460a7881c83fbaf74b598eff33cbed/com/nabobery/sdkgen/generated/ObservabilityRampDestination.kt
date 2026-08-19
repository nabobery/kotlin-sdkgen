package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityRampDestination.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityRampDestination
 */
@Serializable(with = ObservabilityRampDestination.Serializer::class)
public class ObservabilityRampDestination(
  apiKeyHashes: List<String>?,
  public val config: InlineObservabilityRampDestinationConfigX6c5677e2,
  /**
   * ISO timestamp of when the destination was created.
   */
  public val createdAt: String,
  /**
   * Whether this destination is currently enabled.
   */
  public val enabled: Boolean,
  public val filterRules: ObservabilityFilterRulesConfig?,
  /**
   * Stable public identifier for this destination.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val id: String,
  /**
   * Human-readable name for the destination.
   */
  public val name: String?,
  /**
   * When true, request/response bodies are not forwarded to this destination — only metadata.
   */
  public val privacyMode: Boolean,
  /**
   * Sampling rate for events sent to this destination, between 0.0001 and 1 (1 = 100%).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val samplingRate: Double,
  public val type: InlineObservabilityRampDestinationTypeX477e9e28,
  /**
   * ISO timestamp of when the destination was last updated.
   */
  public val updatedAt: String,
  /**
   * ID of the workspace this destination belongs to.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val workspaceId: String,
) {
  /**
   * Optional allowlist of OpenRouter API key hashes (`api_keys.hash`) whose traffic is forwarded to this destination.
   * `null` means all keys.
   */
  public val apiKeyHashes: List<String>? = apiKeyHashes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var configValue: InlineObservabilityRampDestinationConfigX6c5677e2? = null

    public var config: InlineObservabilityRampDestinationConfigX6c5677e2
      get() = requireNotNull(configValue) { "config is required" }
      set(`value`) {
        configValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var privacyModeValue: Boolean? = null

    public var privacyMode: Boolean
      get() = requireNotNull(privacyModeValue) { "privacyMode is required" }
      set(`value`) {
        privacyModeValue = value
      }

    private var samplingRateValue: Double? = null

    public var samplingRate: Double
      get() = requireNotNull(samplingRateValue) { "samplingRate is required" }
      set(`value`) {
        samplingRateValue = value
      }

    private var typeValue: InlineObservabilityRampDestinationTypeX477e9e28? = null

    public var type: InlineObservabilityRampDestinationTypeX477e9e28
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var workspaceIdValue: String? = null

    public var workspaceId: String
      get() = requireNotNull(workspaceIdValue) { "workspaceId is required" }
      set(`value`) {
        workspaceIdValue = value
      }

    private var apiKeyHashesState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Optional allowlist of OpenRouter API key hashes (`api_keys.hash`) whose traffic is forwarded to this destination.
     * `null` means all keys.
     * Required nullable field; assigning `null` records present-null.
     */
    public var apiKeyHashes: List<String>?
      get() = apiKeyHashesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        apiKeyHashesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var filterRulesState: FieldState<ObservabilityFilterRulesConfig?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var filterRules: ObservabilityFilterRulesConfig?
      get() = filterRulesState.valueOrNull()
      set(`value`) {
        filterRulesState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Human-readable name for the destination.
     * Required nullable field; assigning `null` records present-null.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    public fun build(): ObservabilityRampDestination {
      check(configValue != null) { "config is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(enabledValue != null) { "enabled is required" }
      check(idValue != null) { "id is required" }
      check(privacyModeValue != null) { "privacyMode is required" }
      check(samplingRateValue != null) { "samplingRate is required" }
      check(typeValue != null) { "type is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(workspaceIdValue != null) { "workspaceId is required" }
      check(apiKeyHashesState !== FieldState.Absent) { "apiKeyHashes is required, even when null" }
      check(filterRulesState !== FieldState.Absent) { "filterRules is required, even when null" }
      check(nameState !== FieldState.Absent) { "name is required, even when null" }
      return ObservabilityRampDestination(
        apiKeyHashes = apiKeyHashesState.valueOrNull(),
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRulesState.valueOrNull(),
        id = id,
        name = nameState.valueOrNull(),
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ObservabilityRampDestination = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ObservabilityRampDestination> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ObservabilityRampDestination {
      val jsonDecoder = decoder.requireJsonDecoder("ObservabilityRampDestination")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ObservabilityRampDestination must be a JSON object")
      val config = json.decodeRequired<InlineObservabilityRampDestinationConfigX6c5677e2>(rawObject, "config")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      val id = json.decodeRequired<String>(rawObject, "id")
      val privacyMode = json.decodeRequired<Boolean>(rawObject, "privacy_mode")
      val samplingRate = json.decodeRequired<Double>(rawObject, "sampling_rate")
      val type = json.decodeRequired<InlineObservabilityRampDestinationTypeX477e9e28>(rawObject, "type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val workspaceId = json.decodeRequired<String>(rawObject, "workspace_id")
      if (!rawObject.containsKey("api_key_hashes")) {
        throw SerializationException("ObservabilityRampDestination is missing required property 'api_key_hashes'")
      }
      val apiKeyHashes = rawObject["api_key_hashes"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("filter_rules")) {
        throw SerializationException("ObservabilityRampDestination is missing required property 'filter_rules'")
      }
      val filterRules = rawObject["filter_rules"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ObservabilityFilterRulesConfig?>(requireNotNull(element)) }
      if (!rawObject.containsKey("name")) {
        throw SerializationException("ObservabilityRampDestination is missing required property 'name'")
      }
      val name = rawObject["name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ObservabilityRampDestination(
        apiKeyHashes = apiKeyHashes,
        config = config,
        createdAt = createdAt,
        enabled = enabled,
        filterRules = filterRules,
        id = id,
        name = name,
        privacyMode = privacyMode,
        samplingRate = samplingRate,
        type = type,
        updatedAt = updatedAt,
        workspaceId = workspaceId,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ObservabilityRampDestination) {
      val jsonEncoder = encoder.requireJsonEncoder("ObservabilityRampDestination")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("api_key_hashes", value.apiKeyHashes?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("config", json.encodeToJsonElement(value.config))
        put("created_at", value.createdAt)
        put("enabled", json.encodeToJsonElement(value.enabled))
        put("filter_rules", value.filterRules?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("name", value.name?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("privacy_mode", json.encodeToJsonElement(value.privacyMode))
        put("sampling_rate", json.encodeToJsonElement(value.samplingRate))
        put("type", json.encodeToJsonElement(value.type))
        put("updated_at", value.updatedAt)
        put("workspace_id", value.workspaceId)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun observabilityRampDestination(block: ObservabilityRampDestination.Builder.() -> Unit): ObservabilityRampDestination = ObservabilityRampDestination.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ObservabilityRampDestination is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("ObservabilityRampDestination property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
