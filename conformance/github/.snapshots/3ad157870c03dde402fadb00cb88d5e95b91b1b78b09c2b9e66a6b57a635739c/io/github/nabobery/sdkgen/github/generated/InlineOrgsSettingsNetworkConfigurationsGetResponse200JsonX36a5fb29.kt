package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1network-configurations/get/responses/200/content/applica
 * tion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1settings~1network-configurations/get/responses/200/content/applica
 * tion~1json/schema
 */
@Serializable(with = InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29.Serializer::class)
public class InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29(
  networkConfigurations: List<NetworkConfiguration>,
  public val totalCount: Int,
) {
  public val networkConfigurations: List<NetworkConfiguration> = networkConfigurations.toList()

  public class Builder {
    private var networkConfigurationsValue: List<NetworkConfiguration>? = null

    public var networkConfigurations: List<NetworkConfiguration>
      get() = requireNotNull(networkConfigurationsValue) { "networkConfigurations is required" }.toList()
      set(`value`) {
        networkConfigurationsValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    public fun build(): InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29 {
      check(networkConfigurationsValue != null) { "networkConfigurations is required" }
      check(totalCountValue != null) { "totalCount is required" }
      return InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29(
        networkConfigurations = networkConfigurations,
        totalCount = totalCount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29 must be a JSON object")
      val networkConfigurations = json.decodeRequired<List<NetworkConfiguration>>(rawObject, "network_configurations")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      return InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29(
        networkConfigurations = networkConfigurations,
        totalCount = totalCount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("network_configurations", json.encodeToJsonElement(value.networkConfigurations))
        put("total_count", json.encodeToJsonElement(value.totalCount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29(block: InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29.Builder.() -> Unit): InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29 = InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsSettingsNetworkConfigurationsGetResponse200JsonX36a5fb29 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
