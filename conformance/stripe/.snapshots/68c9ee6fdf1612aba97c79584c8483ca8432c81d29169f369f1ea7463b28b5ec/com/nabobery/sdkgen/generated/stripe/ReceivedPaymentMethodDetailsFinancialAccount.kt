package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/received_payment_method_details_financial_account
 */
@Serializable(with = ReceivedPaymentMethodDetailsFinancialAccount.Serializer::class)
public class ReceivedPaymentMethodDetailsFinancialAccount(
  /**
   * The FinancialAccount ID.
   */
  public val id: String,
  /**
   * The rails the ReceivedCredit was sent over. A FinancialAccount can only send funds over `stripe`.
   */
  public val network: InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var networkValue: InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f? =
        null

    public var network: InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f
      get() = requireNotNull(networkValue) { "network is required" }
      set(`value`) {
        networkValue = value
      }

    public fun build(): ReceivedPaymentMethodDetailsFinancialAccount {
      check(idValue != null) { "id is required" }
      check(networkValue != null) { "network is required" }
      return ReceivedPaymentMethodDetailsFinancialAccount(
        id = id,
        network = network,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReceivedPaymentMethodDetailsFinancialAccount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReceivedPaymentMethodDetailsFinancialAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReceivedPaymentMethodDetailsFinancialAccount {
      val jsonDecoder = decoder.requireJsonDecoder("ReceivedPaymentMethodDetailsFinancialAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReceivedPaymentMethodDetailsFinancialAccount must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val network = json.decodeRequired<InlineReceivedPaymentMethodDetailsFinancialAccountNetworkX4044139f>(rawObject, "network")
      return ReceivedPaymentMethodDetailsFinancialAccount(
        id = id,
        network = network,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReceivedPaymentMethodDetailsFinancialAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("ReceivedPaymentMethodDetailsFinancialAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("network", json.encodeToJsonElement(value.network))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun receivedPaymentMethodDetailsFinancialAccount(block: ReceivedPaymentMethodDetailsFinancialAccount.Builder.() -> Unit): ReceivedPaymentMethodDetailsFinancialAccount = ReceivedPaymentMethodDetailsFinancialAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReceivedPaymentMethodDetailsFinancialAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
