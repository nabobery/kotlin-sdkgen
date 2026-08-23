package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/treasury.financial_account/properties/restricted_features/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury.financial_account/properties/restricted_features/items
 */
@Serializable(with = InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21.Serializer::class)
public sealed class InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card_issuing`.
   */
  public data object CardIssuing : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "card_issuing"
  }

  /**
   * Documented value. Wire value: `deposit_insurance`.
   */
  public data object DepositInsurance : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "deposit_insurance"
  }

  /**
   * Documented value. Wire value: `financial_addresses.aba`.
   */
  public data object FinancialAddressesAba : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "financial_addresses.aba"
  }

  /**
   * Documented value. Wire value: `financial_addresses.aba.forwarding`.
   */
  public data object FinancialAddressesAbaForwarding : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "financial_addresses.aba.forwarding"
  }

  /**
   * Documented value. Wire value: `inbound_transfers.ach`.
   */
  public data object InboundTransfersAch : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "inbound_transfers.ach"
  }

  /**
   * Documented value. Wire value: `intra_stripe_flows`.
   */
  public data object IntraStripeFlows : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "intra_stripe_flows"
  }

  /**
   * Documented value. Wire value: `outbound_payments.ach`.
   */
  public data object OutboundPaymentsAch : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "outbound_payments.ach"
  }

  /**
   * Documented value. Wire value: `outbound_payments.us_domestic_wire`.
   */
  public data object OutboundPaymentsUsDomesticWire : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "outbound_payments.us_domestic_wire"
  }

  /**
   * Documented value. Wire value: `outbound_transfers.ach`.
   */
  public data object OutboundTransfersAch : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "outbound_transfers.ach"
  }

  /**
   * Documented value. Wire value: `outbound_transfers.us_domestic_wire`.
   */
  public data object OutboundTransfersUsDomesticWire : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "outbound_transfers.us_domestic_wire"
  }

  /**
   * Documented value. Wire value: `remote_deposit_capture`.
   */
  public data object RemoteDepositCapture : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21() {
    public override val `value`: String = "remote_deposit_capture"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21 = when (value) {
      CardIssuing.value -> CardIssuing
      DepositInsurance.value -> DepositInsurance
      FinancialAddressesAba.value -> FinancialAddressesAba
      FinancialAddressesAbaForwarding.value -> FinancialAddressesAbaForwarding
      InboundTransfersAch.value -> InboundTransfersAch
      IntraStripeFlows.value -> IntraStripeFlows
      OutboundPaymentsAch.value -> OutboundPaymentsAch
      OutboundPaymentsUsDomesticWire.value -> OutboundPaymentsUsDomesticWire
      OutboundTransfersAch.value -> OutboundTransfersAch
      OutboundTransfersUsDomesticWire.value -> OutboundTransfersUsDomesticWire
      RemoteDepositCapture.value -> RemoteDepositCapture
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21) {
      encoder.encodeString(value.value)
    }
  }
}
