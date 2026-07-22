package com.nabobery.sdkgen.github.generated

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
 * A hosted compute network configuration.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/network-configuration
 */
@Serializable(with = NetworkConfiguration.Serializer::class)
public class NetworkConfiguration internal constructor(
  /**
   * The time at which the network configuration was created, in ISO 8601 format.
   */
  public val createdOn: String?,
  /**
   * The unique identifier of the network configuration.
   */
  public val id: String,
  /**
   * The name of the network configuration.
   */
  public val name: String,
  private val computeServiceState: FieldState<InlineNetworkConfigurationComputeServiceXcf2e9ec3>,
  private val failoverNetworkEnabledState: FieldState<Boolean>,
  private val failoverNetworkSettingsIdsState: FieldState<List<String>>,
  private val networkSettingsIdsState: FieldState<List<String>>,
) {
  /**
   * The hosted compute service the network configuration supports.
   */
  public val computeService: InlineNetworkConfigurationComputeServiceXcf2e9ec3?
    get() = computeServiceState.valueOrNull()

  /**
   * Indicates whether the failover network resource is enabled.
   */
  public val failoverNetworkEnabled: Boolean?
    get() = failoverNetworkEnabledState.valueOrNull()

  /**
   * The unique identifier of each failover network settings in the configuration.
   */
  public val failoverNetworkSettingsIds: List<String>?
    get() = failoverNetworkSettingsIdsState.valueOrNull()

  /**
   * The unique identifier of each network settings in the configuration.
   */
  public val networkSettingsIds: List<String>?
    get() = networkSettingsIdsState.valueOrNull()

  public constructor(
    createdOn: String?,
    id: String,
    name: String,
  ) : this(createdOn = createdOn,
  id = id,
  name = name,
  computeServiceState = FieldState.Absent,
  failoverNetworkEnabledState = FieldState.Absent,
  failoverNetworkSettingsIdsState = FieldState.Absent,
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
   * Returns the wire presence of `network_settings_ids`.
   */
  public fun networkSettingsIdsPresence(): FieldPresence = networkSettingsIdsState.presence

  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var createdOnState: FieldState<String?> = FieldState.Absent

    /**
     * The time at which the network configuration was created, in ISO 8601 format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdOn: String?
      get() = createdOnState.valueOrNull()
      set(`value`) {
        createdOnState = value.toNullableFieldState()
      }

    private var computeServiceState: FieldState<InlineNetworkConfigurationComputeServiceXcf2e9ec3> =
        FieldState.Absent

    /**
     * The hosted compute service the network configuration supports.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var computeService: InlineNetworkConfigurationComputeServiceXcf2e9ec3?
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
     * The unique identifier of each failover network settings in the configuration.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var failoverNetworkSettingsIds: List<String>?
      get() = failoverNetworkSettingsIdsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "failoverNetworkSettingsIds is not nullable; call unsetFailoverNetworkSettingsIds() to omit it" }
        failoverNetworkSettingsIdsState = FieldState.Value(present)
      }

    private var networkSettingsIdsState: FieldState<List<String>> = FieldState.Absent

    /**
     * The unique identifier of each network settings in the configuration.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var networkSettingsIds: List<String>?
      get() = networkSettingsIdsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "networkSettingsIds is not nullable; call unsetNetworkSettingsIds() to omit it" }
        networkSettingsIdsState = FieldState.Value(present)
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
     * Omits `network_settings_ids` from serialized output.
     */
    public fun unsetNetworkSettingsIds() {
      networkSettingsIdsState = FieldState.Absent
    }

    public fun build(): NetworkConfiguration {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(createdOnState !== FieldState.Absent) { "createdOn is required, even when null" }
      return NetworkConfiguration(
        createdOn = createdOnState.valueOrNull(),
        id = id,
        name = name,
        computeServiceState = computeServiceState,
        failoverNetworkEnabledState = failoverNetworkEnabledState,
        failoverNetworkSettingsIdsState = failoverNetworkSettingsIdsState,
        networkSettingsIdsState = networkSettingsIdsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NetworkConfiguration = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<NetworkConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NetworkConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("NetworkConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NetworkConfiguration must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      if (!rawObject.containsKey("created_on")) {
        throw SerializationException("NetworkConfiguration is missing required property 'created_on'")
      }
      val createdOn = rawObject["created_on"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return NetworkConfiguration(
        createdOn = createdOn,
        id = id,
        name = name,
        computeServiceState = json.decodeOptional(rawObject, "compute_service", nullable = false),
        failoverNetworkEnabledState = json.decodeOptional(rawObject, "failover_network_enabled", nullable = false),
        failoverNetworkSettingsIdsState = json.decodeOptional(rawObject, "failover_network_settings_ids", nullable = false),
        networkSettingsIdsState = json.decodeOptional(rawObject, "network_settings_ids", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: NetworkConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("NetworkConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_on", value.createdOn?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("name", value.name)
        putState("compute_service", value.computeServiceState, json::encodeToJsonElement)
        putState("failover_network_enabled", value.failoverNetworkEnabledState, json::encodeToJsonElement)
        putState("failover_network_settings_ids", value.failoverNetworkSettingsIdsState, json::encodeToJsonElement)
        putState("network_settings_ids", value.networkSettingsIdsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun networkConfiguration(block: NetworkConfiguration.Builder.() -> Unit): NetworkConfiguration = NetworkConfiguration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NetworkConfiguration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("NetworkConfiguration property '" + name + "' is not nullable")
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
