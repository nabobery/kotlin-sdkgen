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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_received_credits_resource_linked_flows
 */
@Serializable(with = TreasuryReceivedCreditsResourceLinkedFlows.Serializer::class)
public class TreasuryReceivedCreditsResourceLinkedFlows(
  /**
   * The CreditReversal created as a result of this ReceivedCredit being reversed.
   */
  public val creditReversal: String? = null,
  /**
   * Set if the ReceivedCredit was created due to an [Issuing
   * Authorization](https://api.stripe.com#issuing_authorizations) object.
   */
  public val issuingAuthorization: String? = null,
  /**
   * Set if the ReceivedCredit is also viewable as an [Issuing transaction](https://api.stripe.com#issuing_transactions)
   * object.
   */
  public val issuingTransaction: String? = null,
  /**
   * ID of the source flow. Set if `network` is `stripe` and the source flow is visible to the user. Examples of source
   * flows include OutboundPayments, payouts, or CreditReversals.
   */
  public val sourceFlow: String? = null,
  /**
   * The expandable object of the source flow.
   */
  public val sourceFlowDetails:
      InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f? = null,
  /**
   * The type of flow that originated the ReceivedCredit (for example, `outbound_payment`).
   */
  public val sourceFlowType: String? = null,
) {
  public class Builder {
    /**
     * The CreditReversal created as a result of this ReceivedCredit being reversed.
     */
    public var creditReversal: String? = null

    /**
     * Set if the ReceivedCredit was created due to an [Issuing
     * Authorization](https://api.stripe.com#issuing_authorizations) object.
     */
    public var issuingAuthorization: String? = null

    /**
     * Set if the ReceivedCredit is also viewable as an [Issuing
     * transaction](https://api.stripe.com#issuing_transactions) object.
     */
    public var issuingTransaction: String? = null

    /**
     * ID of the source flow. Set if `network` is `stripe` and the source flow is visible to the user. Examples of
     * source flows include OutboundPayments, payouts, or CreditReversals.
     */
    public var sourceFlow: String? = null

    /**
     * The expandable object of the source flow.
     */
    public var sourceFlowDetails:
        InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f? = null

    /**
     * The type of flow that originated the ReceivedCredit (for example, `outbound_payment`).
     */
    public var sourceFlowType: String? = null

    public fun build(): TreasuryReceivedCreditsResourceLinkedFlows = TreasuryReceivedCreditsResourceLinkedFlows(
      creditReversal = creditReversal,
      issuingAuthorization = issuingAuthorization,
      issuingTransaction = issuingTransaction,
      sourceFlow = sourceFlow,
      sourceFlowDetails = sourceFlowDetails,
      sourceFlowType = sourceFlowType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryReceivedCreditsResourceLinkedFlows = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TreasuryReceivedCreditsResourceLinkedFlows> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryReceivedCreditsResourceLinkedFlows {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryReceivedCreditsResourceLinkedFlows")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryReceivedCreditsResourceLinkedFlows must be a JSON object")
      return TreasuryReceivedCreditsResourceLinkedFlows(
        creditReversal = rawObject["credit_reversal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        issuingAuthorization = rawObject["issuing_authorization"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        issuingTransaction = rawObject["issuing_transaction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        sourceFlow = rawObject["source_flow"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        sourceFlowDetails = rawObject["source_flow_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryReceivedCreditsResourceLinkedFlowsSourceFlowDetailsX3225982f?>(element) },
        sourceFlowType = rawObject["source_flow_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryReceivedCreditsResourceLinkedFlows) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryReceivedCreditsResourceLinkedFlows")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.creditReversal?.let { put("credit_reversal", it) }
        value.issuingAuthorization?.let { put("issuing_authorization", it) }
        value.issuingTransaction?.let { put("issuing_transaction", it) }
        value.sourceFlow?.let { put("source_flow", it) }
        value.sourceFlowDetails?.let { put("source_flow_details", json.encodeToJsonElement(it)) }
        value.sourceFlowType?.let { put("source_flow_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryReceivedCreditsResourceLinkedFlows(block: TreasuryReceivedCreditsResourceLinkedFlows.Builder.() -> Unit): TreasuryReceivedCreditsResourceLinkedFlows = TreasuryReceivedCreditsResourceLinkedFlows.build(block)
