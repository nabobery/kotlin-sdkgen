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
public data class TreasuryTransactionsResourceFlowDetailsView(
  @SerialName("credit_reversal")
  public val creditReversal: TreasuryCreditReversal? = null,
  @SerialName("debit_reversal")
  public val debitReversal: TreasuryDebitReversal? = null,
  @SerialName("inbound_transfer")
  public val inboundTransfer: TreasuryInboundTransfer? = null,
  @SerialName("issuing_authorization")
  public val issuingAuthorization: IssuingAuthorization? = null,
  @SerialName("outbound_payment")
  public val outboundPayment: TreasuryOutboundPayment? = null,
  @SerialName("outbound_transfer")
  public val outboundTransfer: TreasuryOutboundTransfer? = null,
  @SerialName("received_credit")
  public val receivedCredit: TreasuryReceivedCredit? = null,
  @SerialName("received_debit")
  public val receivedDebit: TreasuryReceivedDebit? = null,
  public val type: InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_transactions_resource_flow_details
 */
@Serializable(with = TreasuryTransactionsResourceFlowDetails.Serializer::class)
public class TreasuryTransactionsResourceFlowDetails(
  /**
   * Type of the flow that created the Transaction. Set to the same value as `flow_type`.
   */
  public val type: InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71,
  public val creditReversal: TreasuryCreditReversal? = null,
  public val debitReversal: TreasuryDebitReversal? = null,
  public val inboundTransfer: TreasuryInboundTransfer? = null,
  public val issuingAuthorization: IssuingAuthorization? = null,
  public val outboundPayment: TreasuryOutboundPayment? = null,
  public val outboundTransfer: TreasuryOutboundTransfer? = null,
  public val receivedCredit: TreasuryReceivedCredit? = null,
  public val receivedDebit: TreasuryReceivedDebit? = null,
) {
  public class Builder {
    private var typeValue: InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71? = null

    public var type: InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var creditReversal: TreasuryCreditReversal? = null

    public var debitReversal: TreasuryDebitReversal? = null

    public var inboundTransfer: TreasuryInboundTransfer? = null

    public var issuingAuthorization: IssuingAuthorization? = null

    public var outboundPayment: TreasuryOutboundPayment? = null

    public var outboundTransfer: TreasuryOutboundTransfer? = null

    public var receivedCredit: TreasuryReceivedCredit? = null

    public var receivedDebit: TreasuryReceivedDebit? = null

    public fun build(): TreasuryTransactionsResourceFlowDetails {
      check(typeValue != null) { "type is required" }
      return TreasuryTransactionsResourceFlowDetails(
        type = type,
        creditReversal = creditReversal,
        debitReversal = debitReversal,
        inboundTransfer = inboundTransfer,
        issuingAuthorization = issuingAuthorization,
        outboundPayment = outboundPayment,
        outboundTransfer = outboundTransfer,
        receivedCredit = receivedCredit,
        receivedDebit = receivedDebit,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryTransactionsResourceFlowDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryTransactionsResourceFlowDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryTransactionsResourceFlowDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryTransactionsResourceFlowDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryTransactionsResourceFlowDetails must be a JSON object")
      val type = json.decodeRequired<InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71>(rawObject, "type")
      return TreasuryTransactionsResourceFlowDetails(
        type = type,
        creditReversal = rawObject["credit_reversal"]?.let { json.decodeFromJsonElement<TreasuryCreditReversal>(it) },
        debitReversal = rawObject["debit_reversal"]?.let { json.decodeFromJsonElement<TreasuryDebitReversal>(it) },
        inboundTransfer = rawObject["inbound_transfer"]?.let { json.decodeFromJsonElement<TreasuryInboundTransfer>(it) },
        issuingAuthorization = rawObject["issuing_authorization"]?.let { json.decodeFromJsonElement<IssuingAuthorization>(it) },
        outboundPayment = rawObject["outbound_payment"]?.let { json.decodeFromJsonElement<TreasuryOutboundPayment>(it) },
        outboundTransfer = rawObject["outbound_transfer"]?.let { json.decodeFromJsonElement<TreasuryOutboundTransfer>(it) },
        receivedCredit = rawObject["received_credit"]?.let { json.decodeFromJsonElement<TreasuryReceivedCredit>(it) },
        receivedDebit = rawObject["received_debit"]?.let { json.decodeFromJsonElement<TreasuryReceivedDebit>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryTransactionsResourceFlowDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryTransactionsResourceFlowDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.creditReversal?.let { put("credit_reversal", json.encodeToJsonElement(it)) }
        value.debitReversal?.let { put("debit_reversal", json.encodeToJsonElement(it)) }
        value.inboundTransfer?.let { put("inbound_transfer", json.encodeToJsonElement(it)) }
        value.issuingAuthorization?.let { put("issuing_authorization", json.encodeToJsonElement(it)) }
        value.outboundPayment?.let { put("outbound_payment", json.encodeToJsonElement(it)) }
        value.outboundTransfer?.let { put("outbound_transfer", json.encodeToJsonElement(it)) }
        value.receivedCredit?.let { put("received_credit", json.encodeToJsonElement(it)) }
        value.receivedDebit?.let { put("received_debit", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryTransactionsResourceFlowDetails(block: TreasuryTransactionsResourceFlowDetails.Builder.() -> Unit): TreasuryTransactionsResourceFlowDetails = TreasuryTransactionsResourceFlowDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryTransactionsResourceFlowDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
