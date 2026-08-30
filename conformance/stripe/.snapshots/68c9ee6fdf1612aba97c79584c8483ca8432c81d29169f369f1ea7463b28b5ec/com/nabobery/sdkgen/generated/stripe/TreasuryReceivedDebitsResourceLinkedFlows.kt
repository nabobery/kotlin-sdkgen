package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_received_debits_resource_linked_flows
 */
@Serializable(with = TreasuryReceivedDebitsResourceLinkedFlows.Serializer::class)
public class TreasuryReceivedDebitsResourceLinkedFlows(
  /**
   * The DebitReversal created as a result of this ReceivedDebit being reversed.
   */
  public val debitReversal: String? = null,
  /**
   * Set if the ReceivedDebit is associated with an InboundTransfer's return of funds.
   */
  public val inboundTransfer: String? = null,
  /**
   * Set if the ReceivedDebit was created due to an [Issuing
   * Authorization](https://api.stripe.com#issuing_authorizations) object.
   */
  public val issuingAuthorization: String? = null,
  /**
   * Set if the ReceivedDebit is also viewable as an [Issuing Dispute](https://api.stripe.com#issuing_disputes) object.
   */
  public val issuingTransaction: String? = null,
  /**
   * Set if the ReceivedDebit was created due to a [Payout](https://api.stripe.com#payouts) object.
   */
  public val payout: String? = null,
  /**
   * Set if the ReceivedDebit was created due to a [Topup](https://api.stripe.com#topups) object.
   */
  public val topup: String? = null,
) {
  public class Builder {
    /**
     * The DebitReversal created as a result of this ReceivedDebit being reversed.
     */
    public var debitReversal: String? = null

    /**
     * Set if the ReceivedDebit is associated with an InboundTransfer's return of funds.
     */
    public var inboundTransfer: String? = null

    /**
     * Set if the ReceivedDebit was created due to an [Issuing
     * Authorization](https://api.stripe.com#issuing_authorizations) object.
     */
    public var issuingAuthorization: String? = null

    /**
     * Set if the ReceivedDebit is also viewable as an [Issuing Dispute](https://api.stripe.com#issuing_disputes)
     * object.
     */
    public var issuingTransaction: String? = null

    /**
     * Set if the ReceivedDebit was created due to a [Payout](https://api.stripe.com#payouts) object.
     */
    public var payout: String? = null

    /**
     * Set if the ReceivedDebit was created due to a [Topup](https://api.stripe.com#topups) object.
     */
    public var topup: String? = null

    public fun build(): TreasuryReceivedDebitsResourceLinkedFlows = TreasuryReceivedDebitsResourceLinkedFlows(
      debitReversal = debitReversal,
      inboundTransfer = inboundTransfer,
      issuingAuthorization = issuingAuthorization,
      issuingTransaction = issuingTransaction,
      payout = payout,
      topup = topup,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryReceivedDebitsResourceLinkedFlows = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryReceivedDebitsResourceLinkedFlows> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryReceivedDebitsResourceLinkedFlows {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedDebitsResourceLinkedFlows")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryReceivedDebitsResourceLinkedFlows must be a JSON object")
      return TreasuryReceivedDebitsResourceLinkedFlows(
        debitReversal = rawObject["debit_reversal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        inboundTransfer = rawObject["inbound_transfer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        issuingAuthorization = rawObject["issuing_authorization"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        issuingTransaction = rawObject["issuing_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        payout = rawObject["payout"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        topup = rawObject["topup"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryReceivedDebitsResourceLinkedFlows) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedDebitsResourceLinkedFlows")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.debitReversal?.let { put("debit_reversal", it) }
        value.inboundTransfer?.let { put("inbound_transfer", it) }
        value.issuingAuthorization?.let { put("issuing_authorization", it) }
        value.issuingTransaction?.let { put("issuing_transaction", it) }
        value.payout?.let { put("payout", it) }
        value.topup?.let { put("topup", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryReceivedDebitsResourceLinkedFlows(block: TreasuryReceivedDebitsResourceLinkedFlows.Builder.() -> Unit): TreasuryReceivedDebitsResourceLinkedFlows = TreasuryReceivedDebitsResourceLinkedFlows.build(block)
