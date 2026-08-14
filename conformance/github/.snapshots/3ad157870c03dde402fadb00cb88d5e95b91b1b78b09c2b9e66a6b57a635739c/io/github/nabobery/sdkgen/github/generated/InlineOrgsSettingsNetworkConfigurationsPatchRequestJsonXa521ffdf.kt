package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1network-configurations~1{network_configuration_id}/patch
 * /requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1network-configurations~1{network_configuration_id}/patch
 * /requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf.Serializer::class)
public class InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf internal constructor(
  private val computeServiceState:
      FieldState<InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913>,
  private val failoverNetworkEnabledState: FieldState<Boolean>,
  failoverNetworkSettingsIdsState: FieldState<List<String>>,
  private val nameState: FieldState<String>,
  networkSettingsIdsState: FieldState<List<String>>,
) {
  private val failoverNetworkSettingsIdsState: FieldState<List<String>> =
      failoverNetworkSettingsIdsState.copyValue { fieldValue -> fieldValue.toList() }

  private val networkSettingsIdsState: FieldState<List<String>> =
      networkSettingsIdsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * The hosted compute service to use for the network configuration.
   */
  public val computeService:
      InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913?
    get() = computeServiceState.valueOrNull()

  /**
   * Indicates whether the failover network resource is enabled.
   */
  public val failoverNetworkEnabled: Boolean?
    get() = failoverNetworkEnabledState.valueOrNull()

  /**
   * A list of identifiers of the failover network settings resources to use for the network configuration. Exactly one
   * resource identifier must be specified in the list.
   */
  public val failoverNetworkSettingsIds: List<String>?
    get() = failoverNetworkSettingsIdsState.valueOrNull()

  /**
   * Name of the network configuration. Must be between 1 and 100 characters and may only contain upper and lowercase
   * letters a-z, numbers 0-9, '.', '-', and '_'.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * A list of identifiers of the network settings resources to use for the network configuration. Exactly one resource
   * identifier must be specified in the list.
   */
  public val networkSettingsIds: List<String>?
    get() = networkSettingsIdsState.valueOrNull()

  public constructor() : this(computeServiceState = FieldState.Absent,
  failoverNetworkEnabledState = FieldState.Absent,
  failoverNetworkSettingsIdsState = FieldState.Absent,
  nameState = FieldState.Absent,
  networkSettingsIdsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `compute_service`.
   */
  public fun computeServicePresence(): FieldPresence = computeServiceState.presence

  /**
   * Returns the wire presence of `failover_network_enabled`.
   */
  public fun failoverNetworkEnabledPresence(): FieldPresence = failoverNetworkEnabledState.presence

  /**
   * Returns the wire presence of `failover_network_settings_ids`.
   */
  public fun failoverNetworkSettingsIdsPresence(): FieldPresence = failoverNetworkSettingsIdsState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `network_settings_ids`.
   */
  public fun networkSettingsIdsPresence(): FieldPresence = networkSettingsIdsState.presence

  public class Builder {
    private var computeServiceState:
        FieldState<InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913> =
        FieldState.Absent

    /**
     * The hosted compute service to use for the network configuration.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var computeService:
        InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonComputeServiceXa53fe913?
      get() = computeServiceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "computeService is not nullable; call unsetComputeService() to omit it" }
        computeServiceState = FieldState.Value(present)
      }

    private var failoverNetworkEnabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Indicates whether the failover network resource is enabled.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var failoverNetworkEnabled: Boolean?
      get() = failoverNetworkEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "failoverNetworkEnabled is not nullable; call unsetFailoverNetworkEnabled() to omit it" }
        failoverNetworkEnabledState = FieldState.Value(present)
      }

    private var failoverNetworkSettingsIdsState: FieldState<List<String>> = FieldState.Absent

    /**
     * A list of identifiers of the failover network settings resources to use for the network configuration. Exactly
     * one resource identifier must be specified in the list.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var failoverNetworkSettingsIds: List<String>?
      get() = failoverNetworkSettingsIdsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "failoverNetworkSettingsIds is not nullable; call unsetFailoverNetworkSettingsIds() to omit it" }
        failoverNetworkSettingsIdsState = FieldState.Value(present.toList())
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * Name of the network configuration. Must be between 1 and 100 characters and may only contain upper and lowercase
     * letters a-z, numbers 0-9, '.', '-', and '_'.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var networkSettingsIdsState: FieldState<List<String>> = FieldState.Absent

    /**
     * A list of identifiers of the network settings resources to use for the network configuration. Exactly one
     * resource identifier must be specified in the list.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var networkSettingsIds: List<String>?
      get() = networkSettingsIdsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "networkSettingsIds is not nullable; call unsetNetworkSettingsIds() to omit it" }
        networkSettingsIdsState = FieldState.Value(present.toList())
      }

    /**
     * Omits `compute_service` from serialized output.
     */
    public fun unsetComputeService() {
      computeServiceState = FieldState.Absent
    }

    /**
     * Omits `failover_network_enabled` from serialized output.
     */
    public fun unsetFailoverNetworkEnabled() {
      failoverNetworkEnabledState = FieldState.Absent
    }

    /**
     * Omits `failover_network_settings_ids` from serialized output.
     */
    public fun unsetFailoverNetworkSettingsIds() {
      failoverNetworkSettingsIdsState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `network_settings_ids` from serialized output.
     */
    public fun unsetNetworkSettingsIds() {
      networkSettingsIdsState = FieldState.Absent
    }

    public fun build(): InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf = InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf(
      computeServiceState = computeServiceState,
      failoverNetworkEnabledState = failoverNetworkEnabledState,
      failoverNetworkSettingsIdsState = failoverNetworkSettingsIdsState,
      nameState = nameState,
      networkSettingsIdsState = networkSettingsIdsState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf must be a JSON object")
      return InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf(
        computeServiceState = json.decodeOptional(rawObject, "compute_service", nullable = false),
        failoverNetworkEnabledState = json.decodeOptional(rawObject, "failover_network_enabled", nullable = false),
        failoverNetworkSettingsIdsState = json.decodeOptional(rawObject, "failover_network_settings_ids", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        networkSettingsIdsState = json.decodeOptional(rawObject, "network_settings_ids", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("compute_service", value.computeServiceState, json::encodeToJsonElement)
        putState("failover_network_enabled", value.failoverNetworkEnabledState, json::encodeToJsonElement)
        putState("failover_network_settings_ids", value.failoverNetworkSettingsIdsState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("network_settings_ids", value.networkSettingsIdsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf(block: InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf.Builder.() -> Unit): InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf = InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf.build(block)

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
    if (!nullable) throw SerializationException("InlineOrgsSettingsNetworkConfigurationsPatchRequestJsonXa521ffdf property '" + name + "' is not nullable")
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
