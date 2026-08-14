package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
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

@ConsistentCopyVisibility
@Serializable
public data class UsBankAccountNetworksView internal constructor(
  public val preferred: String? = null,
  public val supported: List<InlineUsBankAccountNetworksSupportedItemXc9194e8b>,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/us_bank_account_networks
 */
@Serializable(with = UsBankAccountNetworks.Serializer::class)
public class UsBankAccountNetworks(
  supported: List<InlineUsBankAccountNetworksSupportedItemXc9194e8b>,
  /**
   * The preferred network.
   */
  public val preferred: String? = null,
) {
  /**
   * All supported networks.
   */
  public val supported: List<InlineUsBankAccountNetworksSupportedItemXc9194e8b> = supported.toList()

  public class Builder {
    private var supportedValue: List<InlineUsBankAccountNetworksSupportedItemXc9194e8b>? = null

    public var supported: List<InlineUsBankAccountNetworksSupportedItemXc9194e8b>
      get() = requireNotNull(supportedValue) { "supported is required" }.toList()
      set(`value`) {
        supportedValue = value.toList()
      }

    /**
     * The preferred network.
     */
    public var preferred: String? = null

    public fun build(): UsBankAccountNetworks {
      check(supportedValue != null) { "supported is required" }
      return UsBankAccountNetworks(
        supported = supported,
        preferred = preferred,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UsBankAccountNetworks = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UsBankAccountNetworks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UsBankAccountNetworks {
      val jsonDecoder = decoder.requireJsonDecoder("UsBankAccountNetworks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UsBankAccountNetworks must be a JSON object")
      val supported = json.decodeRequired<List<InlineUsBankAccountNetworksSupportedItemXc9194e8b>>(rawObject, "supported")
      return UsBankAccountNetworks(
        supported = supported,
        preferred = rawObject["preferred"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: UsBankAccountNetworks) {
      val jsonEncoder = encoder.requireJsonEncoder("UsBankAccountNetworks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("supported", json.encodeToJsonElement(value.supported))
        value.preferred?.let { put("preferred", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun usBankAccountNetworks(block: UsBankAccountNetworks.Builder.() -> Unit): UsBankAccountNetworks = UsBankAccountNetworks.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UsBankAccountNetworks is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
