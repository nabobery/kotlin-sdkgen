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
 * sdkgen://source/openapi.json#/components/schemas/treasury.financial_account/properties/pending_features/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.financial_account/properties/pending_features/items
 */
@Serializable(with = InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9.Serializer::class)
public sealed class InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card_issuing`.
   */
  public data object CardIssuing : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "card_issuing"
  }

  /**
   * Documented value. Wire value: `deposit_insurance`.
   */
  public data object DepositInsurance : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "deposit_insurance"
  }

  /**
   * Documented value. Wire value: `financial_addresses.aba`.
   */
  public data object FinancialAddressesAba : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "financial_addresses.aba"
  }

  /**
   * Documented value. Wire value: `financial_addresses.aba.forwarding`.
   */
  public data object FinancialAddressesAbaForwarding : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "financial_addresses.aba.forwarding"
  }

  /**
   * Documented value. Wire value: `inbound_transfers.ach`.
   */
  public data object InboundTransfersAch : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "inbound_transfers.ach"
  }

  /**
   * Documented value. Wire value: `intra_stripe_flows`.
   */
  public data object IntraStripeFlows : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "intra_stripe_flows"
  }

  /**
   * Documented value. Wire value: `outbound_payments.ach`.
   */
  public data object OutboundPaymentsAch : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "outbound_payments.ach"
  }

  /**
   * Documented value. Wire value: `outbound_payments.us_domestic_wire`.
   */
  public data object OutboundPaymentsUsDomesticWire : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "outbound_payments.us_domestic_wire"
  }

  /**
   * Documented value. Wire value: `outbound_transfers.ach`.
   */
  public data object OutboundTransfersAch : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "outbound_transfers.ach"
  }

  /**
   * Documented value. Wire value: `outbound_transfers.us_domestic_wire`.
   */
  public data object OutboundTransfersUsDomesticWire : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "outbound_transfers.us_domestic_wire"
  }

  /**
   * Documented value. Wire value: `remote_deposit_capture`.
   */
  public data object RemoteDepositCapture : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9() {
    public override val `value`: String = "remote_deposit_capture"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9 = when (value) {
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

  internal object Serializer : KSerializer<InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9) {
      encoder.encodeString(value.value)
    }
  }
}
