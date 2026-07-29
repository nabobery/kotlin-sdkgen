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
 * Source: sdkgen://source/openapi.json#/components/schemas/outbound_transfers_payment_method_details_financial_account
 */
@Serializable(with = OutboundTransfersPaymentMethodDetailsFinancialAccount.Serializer::class)
public class OutboundTransfersPaymentMethodDetailsFinancialAccount(
  /**
   * Token of the FinancialAccount.
   */
  public val id: String,
  /**
   * The rails used to send funds.
   */
  public val network: InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce,
) {
  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var networkValue:
        InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce? = null

    public var network: InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce
      get() = requireNotNull(networkValue) { "network is required" }
      set(`value`) {
        networkValue = value
      }

    public fun build(): OutboundTransfersPaymentMethodDetailsFinancialAccount {
      check(idValue != null) { "id is required" }
      check(networkValue != null) { "network is required" }
      return OutboundTransfersPaymentMethodDetailsFinancialAccount(
        id = id,
        network = network,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OutboundTransfersPaymentMethodDetailsFinancialAccount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OutboundTransfersPaymentMethodDetailsFinancialAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OutboundTransfersPaymentMethodDetailsFinancialAccount {
      val jsonDecoder = decoder.requireJsonDecoder("OutboundTransfersPaymentMethodDetailsFinancialAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OutboundTransfersPaymentMethodDetailsFinancialAccount must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      val network = json.decodeRequired<InlineOutboundTransfersPaymentMethodDetailsFinancialAccountNetworkX4de06dce>(rawObject, "network")
      return OutboundTransfersPaymentMethodDetailsFinancialAccount(
        id = id,
        network = network,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OutboundTransfersPaymentMethodDetailsFinancialAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("OutboundTransfersPaymentMethodDetailsFinancialAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        put("network", json.encodeToJsonElement(value.network))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun outboundTransfersPaymentMethodDetailsFinancialAccount(block: OutboundTransfersPaymentMethodDetailsFinancialAccount.Builder.() -> Unit): OutboundTransfersPaymentMethodDetailsFinancialAccount = OutboundTransfersPaymentMethodDetailsFinancialAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OutboundTransfersPaymentMethodDetailsFinancialAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
