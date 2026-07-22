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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1network-configurations/post/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1network-configurations/post/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6.Serializer::class)
public class InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6(
  /**
   * Name of the network configuration. Must be between 1 and 100 characters and may only contain upper and lowercase
   * letters a-z, numbers 0-9, '.', '-', and '_'.
   */
  public val name: String,
  networkSettingsIds: List<String>,
  /**
   * The hosted compute service to use for the network configuration.
   */
  public val computeService:
      InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816? = null,
  /**
   * Indicates whether the failover network resource is enabled.
   */
  public val failoverNetworkEnabled: Boolean? = null,
  /**
   * A list of identifiers of the failover network settings resources to use for the network configuration. Exactly one
   * resource identifier must be specified in the list.
   */
  public val failoverNetworkSettingsIds: List<String>? = null,
) {
  /**
   * A list of identifiers of the network settings resources to use for the network configuration. Exactly one resource
   * identifier must be specified in the list.
   */
  public val networkSettingsIds: List<String> = networkSettingsIds.toList()

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var networkSettingsIdsValue: List<String>? = null

    public var networkSettingsIds: List<String>
      get() = requireNotNull(networkSettingsIdsValue) { "networkSettingsIds is required" }
      set(`value`) {
        networkSettingsIdsValue = value
      }

    /**
     * The hosted compute service to use for the network configuration.
     */
    public var computeService:
        InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816? = null

    /**
     * Indicates whether the failover network resource is enabled.
     */
    public var failoverNetworkEnabled: Boolean? = null

    /**
     * A list of identifiers of the failover network settings resources to use for the network configuration. Exactly
     * one resource identifier must be specified in the list.
     */
    public var failoverNetworkSettingsIds: List<String>? = null

    public fun build(): InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6 {
      check(nameValue != null) { "name is required" }
      check(networkSettingsIdsValue != null) { "networkSettingsIds is required" }
      return InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6(
        name = name,
        networkSettingsIds = networkSettingsIds,
        computeService = computeService,
        failoverNetworkEnabled = failoverNetworkEnabled,
        failoverNetworkSettingsIds = failoverNetworkSettingsIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val networkSettingsIds = json.decodeRequired<List<String>>(rawObject, "network_settings_ids")
      return InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6(
        name = name,
        networkSettingsIds = networkSettingsIds,
        computeService = rawObject["compute_service"]?.let { json.decodeFromJsonElement<InlineOrgsSettingsNetworkConfigurationsPostRequestJsonComputeServiceX695ba816>(it) },
        failoverNetworkEnabled = rawObject["failover_network_enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        failoverNetworkSettingsIds = rawObject["failover_network_settings_ids"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        put("network_settings_ids", json.encodeToJsonElement(value.networkSettingsIds))
        value.computeService?.let { put("compute_service", json.encodeToJsonElement(it)) }
        value.failoverNetworkEnabled?.let { put("failover_network_enabled", json.encodeToJsonElement(it)) }
        value.failoverNetworkSettingsIds?.let { put("failover_network_settings_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6(block: InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6.Builder.() -> Unit): InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6 = InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsSettingsNetworkConfigurationsPostRequestJsonX1d548ca6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
