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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/UpdateObservabilityDestinationRequest.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UpdateObservabilityDestinationRequest
 */
@Serializable(with = UpdateObservabilityDestinationRequest.Serializer::class)
public class UpdateObservabilityDestinationRequest internal constructor(
  apiKeyHashesState: FieldState<List<String>?>,
  configState: FieldState<Map<String, JsonElement?>>,
  private val enabledState: FieldState<Boolean>,
  private val filterRulesState: FieldState<ObservabilityFilterRulesConfigNullable?>,
  private val nameState: FieldState<String>,
  private val privacyModeState: FieldState<Boolean>,
  private val samplingRateState: FieldState<Double>,
) {
  private val apiKeyHashesState: FieldState<List<String>?> =
      apiKeyHashesState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val configState: FieldState<Map<String, JsonElement?>> =
      configState.copyValue { fieldValue -> fieldValue.toMap() }

  /**
   * Optional allowlist of OpenRouter API key hashes. `null` clears the filter (all keys). Omitting leaves the current
   * value. Must contain at least one hash if provided.
   */
  public val apiKeyHashes: List<String>?
    get() = apiKeyHashesState.valueOrNull()

  /**
   * Provider-specific configuration fields to update. Masked values are ignored; unset fields keep their current value.
   */
  public val config: Map<String, JsonElement?>?
    get() = configState.valueOrNull()

  /**
   * Whether the destination is enabled.
   */
  public val enabled: Boolean?
    get() = enabledState.valueOrNull()

  public val filterRules: ObservabilityFilterRulesConfigNullable?
    get() = filterRulesState.valueOrNull()

  /**
   * Human-readable name for the destination.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * When true, request/response bodies are not forwarded — only metadata.
   */
  public val privacyMode: Boolean?
    get() = privacyModeState.valueOrNull()

  /**
   * Sampling rate between 0.0001 and 1 (1 = 100%).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val samplingRate: Double?
    get() = samplingRateState.valueOrNull()

  public constructor() : this(apiKeyHashesState = FieldState.Absent,
  configState = FieldState.Absent,
  enabledState = FieldState.Absent,
  filterRulesState = FieldState.Absent,
  nameState = FieldState.Absent,
  privacyModeState = FieldState.Absent,
  samplingRateState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `api_key_hashes`.
   */
  public fun apiKeyHashesPresence(): FieldPresence = apiKeyHashesState.presence

  /**
   * Returns the wire presence of `config`.
   */
  public fun configPresence(): FieldPresence = configState.presence

  /**
   * Returns the wire presence of `enabled`.
   */
  public fun enabledPresence(): FieldPresence = enabledState.presence

  /**
   * Returns the wire presence of `filter_rules`.
   */
  public fun filterRulesPresence(): FieldPresence = filterRulesState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `privacy_mode`.
   */
  public fun privacyModePresence(): FieldPresence = privacyModeState.presence

  /**
   * Returns the wire presence of `sampling_rate`.
   */
  public fun samplingRatePresence(): FieldPresence = samplingRateState.presence

  public class Builder {
    private var apiKeyHashesState: FieldState<List<String>?> = FieldState.Absent

    /**
     * Optional allowlist of OpenRouter API key hashes. `null` clears the filter (all keys). Omitting leaves the current
     * value. Must contain at least one hash if provided.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var apiKeyHashes: List<String>?
      get() = apiKeyHashesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        apiKeyHashesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var configState: FieldState<Map<String, JsonElement?>> = FieldState.Absent

    /**
     * Provider-specific configuration fields to update. Masked values are ignored; unset fields keep their current
     * value.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var config: Map<String, JsonElement?>?
      get() = configState.valueOrNull()?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        val present = requireNotNull(value) { "config is not nullable; call unsetConfig() to omit it" }
        configState = FieldState.Value(present.toMap())
      }

    private var enabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether the destination is enabled.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enabled: Boolean?
      get() = enabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enabled is not nullable; call unsetEnabled() to omit it" }
        enabledState = FieldState.Value(present)
      }

    private var filterRulesState: FieldState<ObservabilityFilterRulesConfigNullable?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var filterRules: ObservabilityFilterRulesConfigNullable?
      get() = filterRulesState.valueOrNull()
      set(`value`) {
        filterRulesState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * Human-readable name for the destination.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var privacyModeState: FieldState<Boolean> = FieldState.Absent

    /**
     * When true, request/response bodies are not forwarded — only metadata.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var privacyMode: Boolean?
      get() = privacyModeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "privacyMode is not nullable; call unsetPrivacyMode() to omit it" }
        privacyModeState = FieldState.Value(present)
      }

    private var samplingRateState: FieldState<Double> = FieldState.Absent

    /**
     * Sampling rate between 0.0001 and 1 (1 = 100%).
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var samplingRate: Double?
      get() = samplingRateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "samplingRate is not nullable; call unsetSamplingRate() to omit it" }
        samplingRateState = FieldState.Value(present)
      }

    /**
     * Omits `api_key_hashes` from serialized output.
     */
    public fun unsetApiKeyHashes() {
      apiKeyHashesState = FieldState.Absent
    }

    /**
     * Omits `config` from serialized output.
     */
    public fun unsetConfig() {
      configState = FieldState.Absent
    }

    /**
     * Omits `enabled` from serialized output.
     */
    public fun unsetEnabled() {
      enabledState = FieldState.Absent
    }

    /**
     * Omits `filter_rules` from serialized output.
     */
    public fun unsetFilterRules() {
      filterRulesState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `privacy_mode` from serialized output.
     */
    public fun unsetPrivacyMode() {
      privacyModeState = FieldState.Absent
    }

    /**
     * Omits `sampling_rate` from serialized output.
     */
    public fun unsetSamplingRate() {
      samplingRateState = FieldState.Absent
    }

    public fun build(): UpdateObservabilityDestinationRequest = UpdateObservabilityDestinationRequest(
      apiKeyHashesState = apiKeyHashesState,
      configState = configState,
      enabledState = enabledState,
      filterRulesState = filterRulesState,
      nameState = nameState,
      privacyModeState = privacyModeState,
      samplingRateState = samplingRateState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UpdateObservabilityDestinationRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UpdateObservabilityDestinationRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UpdateObservabilityDestinationRequest {
      val jsonDecoder = decoder.requireJsonDecoder("UpdateObservabilityDestinationRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UpdateObservabilityDestinationRequest must be a JSON object")
      return UpdateObservabilityDestinationRequest(
        apiKeyHashesState = json.decodeOptional(rawObject, "api_key_hashes", nullable = true),
        configState = json.decodeOptional(rawObject, "config", nullable = false),
        enabledState = json.decodeOptional(rawObject, "enabled", nullable = false),
        filterRulesState = json.decodeOptional(rawObject, "filter_rules", nullable = true),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        privacyModeState = json.decodeOptional(rawObject, "privacy_mode", nullable = false),
        samplingRateState = json.decodeOptional(rawObject, "sampling_rate", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: UpdateObservabilityDestinationRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("UpdateObservabilityDestinationRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("api_key_hashes", value.apiKeyHashesState, json::encodeToJsonElement)
        putState("config", value.configState, json::encodeToJsonElement)
        putState("enabled", value.enabledState, json::encodeToJsonElement)
        putState("filter_rules", value.filterRulesState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("privacy_mode", value.privacyModeState, json::encodeToJsonElement)
        putState("sampling_rate", value.samplingRateState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun updateObservabilityDestinationRequest(block: UpdateObservabilityDestinationRequest.Builder.() -> Unit): UpdateObservabilityDestinationRequest = UpdateObservabilityDestinationRequest.build(block)

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
    if (!nullable) throw SerializationException("UpdateObservabilityDestinationRequest property '" + name + "' is not nullable")
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
