package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1features/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}~1features/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2.Serializer::class)
public class InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2(
  /**
   * Encodes the FinancialAccount's ability to be used with the Issuing product, including attaching cards to and
   * drawing funds from the FinancialAccount.
   */
  public val cardIssuing:
      InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormCardIssuingX66029009? = null,
  /**
   * Represents whether this FinancialAccount is eligible for deposit insurance. Various factors determine the insurance
   * amount.
   */
  public val depositInsurance:
      InlineV1TreasuryFinancialA78aaPostRequestFormDepositInsuranceX81dc4708? = null,
  expand: List<String>? = null,
  /**
   * Contains Features that add FinancialAddresses to the FinancialAccount.
   */
  public val financialAddresses:
      InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa? = null,
  /**
   * Contains settings related to adding funds to a FinancialAccount from another Account with the same owner.
   */
  public val inboundTransfers:
      InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7? = null,
  /**
   * Represents the ability for the FinancialAccount to send money to, or receive money from other FinancialAccounts
   * (for example, via OutboundPayment).
   */
  public val intraStripeFlows:
      InlineV1TreasuryFinancialA78aaPostRequestFormIntraStripeFlowsX9dfb067d? = null,
  /**
   * Includes Features related to initiating money movement out of the FinancialAccount to someone else's bucket of
   * money.
   */
  public val outboundPayments:
      InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404? = null,
  /**
   * Contains a Feature and settings related to moving money out of the FinancialAccount into another Account with the
   * same owner.
   */
  public val outboundTransfers:
      InlineV1TreasuryFinancialA78aaPostRequestFormOutboundTransfersX968c6733? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Encodes the FinancialAccount's ability to be used with the Issuing product, including attaching cards to and
     * drawing funds from the FinancialAccount.
     */
    public var cardIssuing:
        InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormCardIssuingX66029009? = null

    /**
     * Represents whether this FinancialAccount is eligible for deposit insurance. Various factors determine the
     * insurance amount.
     */
    public var depositInsurance:
        InlineV1TreasuryFinancialA78aaPostRequestFormDepositInsuranceX81dc4708? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Contains Features that add FinancialAddresses to the FinancialAccount.
     */
    public var financialAddresses:
        InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa? = null

    /**
     * Contains settings related to adding funds to a FinancialAccount from another Account with the same owner.
     */
    public var inboundTransfers:
        InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7? = null

    /**
     * Represents the ability for the FinancialAccount to send money to, or receive money from other FinancialAccounts
     * (for example, via OutboundPayment).
     */
    public var intraStripeFlows:
        InlineV1TreasuryFinancialA78aaPostRequestFormIntraStripeFlowsX9dfb067d? = null

    /**
     * Includes Features related to initiating money movement out of the FinancialAccount to someone else's bucket of
     * money.
     */
    public var outboundPayments:
        InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404? = null

    /**
     * Contains a Feature and settings related to moving money out of the FinancialAccount into another Account with the
     * same owner.
     */
    public var outboundTransfers:
        InlineV1TreasuryFinancialA78aaPostRequestFormOutboundTransfersX968c6733? = null

    public fun build(): InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2 = InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2(
      cardIssuing = cardIssuing,
      depositInsurance = depositInsurance,
      expand = expand,
      financialAddresses = financialAddresses,
      inboundTransfers = inboundTransfers,
      intraStripeFlows = intraStripeFlows,
      outboundPayments = outboundPayments,
      outboundTransfers = outboundTransfers,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2 must be a JSON object")
      return InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2(
        cardIssuing = rawObject["card_issuing"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormCardIssuingX66029009>(it) },
        depositInsurance = rawObject["deposit_insurance"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormDepositInsuranceX81dc4708>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        financialAddresses = rawObject["financial_addresses"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormFinancialAddressesXa08234aa>(it) },
        inboundTransfers = rawObject["inbound_transfers"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormInboundTransfersX202312e7>(it) },
        intraStripeFlows = rawObject["intra_stripe_flows"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormIntraStripeFlowsX9dfb067d>(it) },
        outboundPayments = rawObject["outbound_payments"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormOutboundPaymentsXe1c23404>(it) },
        outboundTransfers = rawObject["outbound_transfers"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialA78aaPostRequestFormOutboundTransfersX968c6733>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardIssuing?.let { put("card_issuing", json.encodeToJsonElement(it)) }
        value.depositInsurance?.let { put("deposit_insurance", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.financialAddresses?.let { put("financial_addresses", json.encodeToJsonElement(it)) }
        value.inboundTransfers?.let { put("inbound_transfers", json.encodeToJsonElement(it)) }
        value.intraStripeFlows?.let { put("intra_stripe_flows", json.encodeToJsonElement(it)) }
        value.outboundPayments?.let { put("outbound_payments", json.encodeToJsonElement(it)) }
        value.outboundTransfers?.let { put("outbound_transfers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2(block: InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2.Builder.() -> Unit): InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2 = InlineV1TreasuryFinancialAccountsFeaturesPostRequestFormXa6be32c2.build(block)
