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
public data class NetworksView internal constructor(
  public val available: List<String>,
  public val preferred: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/networks
 */
@Serializable(with = Networks.Serializer::class)
public class Networks(
  available: List<String>,
  /**
   * The preferred network for co-branded cards. Can be `cartes_bancaires`, `mastercard`, `visa` or `invalid_preference`
   * if requested network is not valid for the card.
   */
  public val preferred: String? = null,
) {
  /**
   * All networks available for selection via
   * [payment_method_options.card.network](/api/payment_intents/confirm#confirm_payment_intent-payment_method_options-ca
   * rd-network).
   */
  public val available: List<String> = available.toList()

  public class Builder {
    private var availableValue: List<String>? = null

    public var available: List<String>
      get() = requireNotNull(availableValue) { "available is required" }.toList()
      set(`value`) {
        availableValue = value.toList()
      }

    /**
     * The preferred network for co-branded cards. Can be `cartes_bancaires`, `mastercard`, `visa` or
     * `invalid_preference` if requested network is not valid for the card.
     */
    public var preferred: String? = null

    public fun build(): Networks {
      check(availableValue != null) { "available is required" }
      return Networks(
        available = available,
        preferred = preferred,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Networks = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Networks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Networks {
      val jsonDecoder = decoder.requireJsonDecoder("Networks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Networks must be a JSON object")
      val available = json.decodeRequired<List<String>>(rawObject, "available")
      return Networks(
        available = available,
        preferred = rawObject["preferred"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Networks) {
      val jsonEncoder = encoder.requireJsonEncoder("Networks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("available", json.encodeToJsonElement(value.available))
        value.preferred?.let { put("preferred", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun networks(block: Networks.Builder.() -> Unit): Networks = Networks.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Networks is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
