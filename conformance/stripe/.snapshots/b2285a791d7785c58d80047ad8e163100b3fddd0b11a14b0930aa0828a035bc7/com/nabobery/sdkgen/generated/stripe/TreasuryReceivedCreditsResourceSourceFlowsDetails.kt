package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class TreasuryReceivedCreditsResourceSourceFlowsDetailsView(
  @SerialName("credit_reversal")
  public val creditReversal: TreasuryCreditReversal? = null,
  @SerialName("outbound_payment")
  public val outboundPayment: TreasuryOutboundPayment? = null,
  @SerialName("outbound_transfer")
  public val outboundTransfer: TreasuryOutboundTransfer? = null,
  public val payout: Payout? = null,
  public val type: InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_received_credits_resource_source_flows_details
 */
@Serializable(with = TreasuryReceivedCreditsResourceSourceFlowsDetails.Serializer::class)
public class TreasuryReceivedCreditsResourceSourceFlowsDetails(
  /**
   * The type of the source flow that originated the ReceivedCredit.
   */
  public val type: InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90,
  public val creditReversal: TreasuryCreditReversal? = null,
  public val outboundPayment: TreasuryOutboundPayment? = null,
  public val outboundTransfer: TreasuryOutboundTransfer? = null,
  public val payout: Payout? = null,
) {
  public class Builder {
    private var typeValue: InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90? =
        null

    public var type: InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var creditReversal: TreasuryCreditReversal? = null

    public var outboundPayment: TreasuryOutboundPayment? = null

    public var outboundTransfer: TreasuryOutboundTransfer? = null

    public var payout: Payout? = null

    public fun build(): TreasuryReceivedCreditsResourceSourceFlowsDetails {
      check(typeValue != null) { "type is required" }
      return TreasuryReceivedCreditsResourceSourceFlowsDetails(
        type = type,
        creditReversal = creditReversal,
        outboundPayment = outboundPayment,
        outboundTransfer = outboundTransfer,
        payout = payout,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryReceivedCreditsResourceSourceFlowsDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryReceivedCreditsResourceSourceFlowsDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryReceivedCreditsResourceSourceFlowsDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedCreditsResourceSourceFlowsDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryReceivedCreditsResourceSourceFlowsDetails must be a JSON object")
      val type = json.decodeRequired<InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90>(rawObject, "type")
      return TreasuryReceivedCreditsResourceSourceFlowsDetails(
        type = type,
        creditReversal = rawObject["credit_reversal"]?.let { json.decodeFromJsonElement<TreasuryCreditReversal>(it) },
        outboundPayment = rawObject["outbound_payment"]?.let { json.decodeFromJsonElement<TreasuryOutboundPayment>(it) },
        outboundTransfer = rawObject["outbound_transfer"]?.let { json.decodeFromJsonElement<TreasuryOutboundTransfer>(it) },
        payout = rawObject["payout"]?.let { json.decodeFromJsonElement<Payout>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryReceivedCreditsResourceSourceFlowsDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedCreditsResourceSourceFlowsDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.creditReversal?.let { put("credit_reversal", json.encodeToJsonElement(it)) }
        value.outboundPayment?.let { put("outbound_payment", json.encodeToJsonElement(it)) }
        value.outboundTransfer?.let { put("outbound_transfer", json.encodeToJsonElement(it)) }
        value.payout?.let { put("payout", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryReceivedCreditsResourceSourceFlowsDetails(block: TreasuryReceivedCreditsResourceSourceFlowsDetails.Builder.() -> Unit): TreasuryReceivedCreditsResourceSourceFlowsDetails = TreasuryReceivedCreditsResourceSourceFlowsDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryReceivedCreditsResourceSourceFlowsDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
