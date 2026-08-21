package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 * Encodes whether a FinancialAccount has access to a particular feature. Stripe or the platform can control features
 * via the requested field.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/features
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef.Serializer::class)
public class InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef(
  public val cardIssuing:
      InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3? = null,
  public val depositInsurance:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708? = null,
  public val financialAddresses:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962? = null,
  public val inboundTransfers:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd? = null,
  public val intraStripeFlows:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesIntraStripeFlowsX1d590b34? = null,
  public val outboundPayments:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8? = null,
  public val outboundTransfers:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d? = null,
) {
  public class Builder {
    public var cardIssuing:
        InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3? = null

    public var depositInsurance:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708? = null

    public var financialAddresses:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962? = null

    public var inboundTransfers:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd? = null

    public var intraStripeFlows:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesIntraStripeFlowsX1d590b34? = null

    public var outboundPayments:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8? = null

    public var outboundTransfers:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d? = null

    public fun build(): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef = InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef(
      cardIssuing = cardIssuing,
      depositInsurance = depositInsurance,
      financialAddresses = financialAddresses,
      inboundTransfers = inboundTransfers,
      intraStripeFlows = intraStripeFlows,
      outboundPayments = outboundPayments,
      outboundTransfers = outboundTransfers,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef must be a JSON object")
      return InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef(
        cardIssuing = rawObject["card_issuing"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXfc283de3>(it) },
        depositInsurance = rawObject["deposit_insurance"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceXce3cf708>(it) },
        financialAddresses = rawObject["financial_addresses"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesXbebbf962>(it) },
        inboundTransfers = rawObject["inbound_transfers"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXe1e3fdcd>(it) },
        intraStripeFlows = rawObject["intra_stripe_flows"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesIntraStripeFlowsX1d590b34>(it) },
        outboundPayments = rawObject["outbound_payments"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX4fad88c8>(it) },
        outboundTransfers = rawObject["outbound_transfers"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXccfef52d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardIssuing?.let { put("card_issuing", json.encodeToJsonElement(it)) }
        value.depositInsurance?.let { put("deposit_insurance", json.encodeToJsonElement(it)) }
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

public fun inlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef(block: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef.Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef = InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesXf3055bef.build(block)
