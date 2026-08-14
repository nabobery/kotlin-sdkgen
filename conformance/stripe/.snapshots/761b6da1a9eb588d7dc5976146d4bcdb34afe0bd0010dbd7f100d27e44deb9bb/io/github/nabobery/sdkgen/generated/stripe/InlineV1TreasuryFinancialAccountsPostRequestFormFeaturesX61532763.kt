package io.github.nabobery.sdkgen.generated.stripe

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
 * Encodes whether a FinancialAccount has access to a particular feature, with a status enum and associated
 * `status_details`. Stripe or the platform may control features via the requested field.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1financial_accounts~1{financial_account}/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema/properties/features
 */
@Serializable(with = InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763.Serializer::class)
public class InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763(
  public val cardIssuing:
      InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXb9b6d958? = null,
  public val depositInsurance:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceX4c10a294? = null,
  public val financialAddresses:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb? = null,
  public val inboundTransfers:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca? = null,
  public val intraStripeFlows:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesIntraStripeFlowsX4de6efdc? = null,
  public val outboundPayments:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e? = null,
  public val outboundTransfers:
      InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5? = null,
) {
  public class Builder {
    public var cardIssuing:
        InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXb9b6d958? = null

    public var depositInsurance:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceX4c10a294? = null

    public var financialAddresses:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb? = null

    public var inboundTransfers:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca? = null

    public var intraStripeFlows:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesIntraStripeFlowsX4de6efdc? = null

    public var outboundPayments:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e? = null

    public var outboundTransfers:
        InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5? = null

    public fun build(): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763 = InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763(
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
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763 must be a JSON object")
      return InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763(
        cardIssuing = rawObject["card_issuing"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesCardIssuingXb9b6d958>(it) },
        depositInsurance = rawObject["deposit_insurance"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesDepositInsuranceX4c10a294>(it) },
        financialAddresses = rawObject["financial_addresses"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesFinancialAddressesX66e40cbb>(it) },
        inboundTransfers = rawObject["inbound_transfers"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesInboundTransfersXcb8649ca>(it) },
        intraStripeFlows = rawObject["intra_stripe_flows"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesIntraStripeFlowsX4de6efdc>(it) },
        outboundPayments = rawObject["outbound_payments"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundPaymentsX3583f33e>(it) },
        outboundTransfers = rawObject["outbound_transfers"]?.let { json.decodeFromJsonElement<InlineV1TreasuryFinancialAc862PostRequestFormFeaturesOutboundTransfersXa626e7a5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763")
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

public fun inlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763(block: InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763.Builder.() -> Unit): InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763 = InlineV1TreasuryFinancialAccountsPostRequestFormFeaturesX61532763.build(block)
