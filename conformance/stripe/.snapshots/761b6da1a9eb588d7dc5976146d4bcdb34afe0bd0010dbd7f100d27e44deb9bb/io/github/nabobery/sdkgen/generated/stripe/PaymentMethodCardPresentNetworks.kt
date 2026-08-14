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
public data class PaymentMethodCardPresentNetworksView internal constructor(
  public val available: List<String>,
  public val preferred: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card_present_networks
 */
@Serializable(with = PaymentMethodCardPresentNetworks.Serializer::class)
public class PaymentMethodCardPresentNetworks(
  available: List<String>,
  /**
   * The preferred network for the card.
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
     * The preferred network for the card.
     */
    public var preferred: String? = null

    public fun build(): PaymentMethodCardPresentNetworks {
      check(availableValue != null) { "available is required" }
      return PaymentMethodCardPresentNetworks(
        available = available,
        preferred = preferred,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodCardPresentNetworks = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodCardPresentNetworks> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodCardPresentNetworks {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodCardPresentNetworks")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodCardPresentNetworks must be a JSON object")
      val available = json.decodeRequired<List<String>>(rawObject, "available")
      return PaymentMethodCardPresentNetworks(
        available = available,
        preferred = rawObject["preferred"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodCardPresentNetworks) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodCardPresentNetworks")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("available", json.encodeToJsonElement(value.available))
        value.preferred?.let { put("preferred", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodCardPresentNetworks(block: PaymentMethodCardPresentNetworks.Builder.() -> Unit): PaymentMethodCardPresentNetworks = PaymentMethodCardPresentNetworks.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodCardPresentNetworks is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
