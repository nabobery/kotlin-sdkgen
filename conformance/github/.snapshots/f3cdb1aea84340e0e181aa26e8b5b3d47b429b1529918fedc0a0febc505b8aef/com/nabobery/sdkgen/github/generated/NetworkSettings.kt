package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * A hosted compute network settings resource.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/network-settings
 */
@Serializable(with = NetworkSettings.Serializer::class)
public class NetworkSettings(
  /**
   * The unique identifier of the network settings resource.
   */
  public val id: String,
  /**
   * The name of the network settings resource.
   */
  public val name: String,
  /**
   * The location of the subnet this network settings resource is configured for.
   */
  public val region: String,
  /**
   * The subnet this network settings resource is configured for.
   */
  public val subnetId: String,
  /**
   * The identifier of the network configuration that is using this settings resource.
   */
  public val networkConfigurationId: String? = null,
) {
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

    private var regionValue: String? = null

    public var region: String
      get() = requireNotNull(regionValue) { "region is required" }
      set(`value`) {
        regionValue = value
      }

    private var subnetIdValue: String? = null

    public var subnetId: String
      get() = requireNotNull(subnetIdValue) { "subnetId is required" }
      set(`value`) {
        subnetIdValue = value
      }

    /**
     * The identifier of the network configuration that is using this settings resource.
     */
    public var networkConfigurationId: String? = null

    public fun build(): NetworkSettings {
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(regionValue != null) { "region is required" }
      check(subnetIdValue != null) { "subnetId is required" }
      return NetworkSettings(
        id = id,
        name = name,
        region = region,
        subnetId = subnetId,
        networkConfigurationId = networkConfigurationId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NetworkSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NetworkSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NetworkSettings {
      val jsonDecoder = decoder.requireJsonDecoder("NetworkSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NetworkSettings must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val region = json.decodeRequired<String>(rawObject, "region")
      val subnetId = json.decodeRequired<String>(rawObject, "subnet_id")
      return NetworkSettings(
        id = id,
        name = name,
        region = region,
        subnetId = subnetId,
        networkConfigurationId = rawObject["network_configuration_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: NetworkSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("NetworkSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("name", value.name)
        put("region", value.region)
        put("subnet_id", value.subnetId)
        value.networkConfigurationId?.let { put("network_configuration_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun networkSettings(block: NetworkSettings.Builder.() -> Unit): NetworkSettings = NetworkSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NetworkSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
