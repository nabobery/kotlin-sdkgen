package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/treasury.financial_account/properties/active_features/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.financial_account/properties/active_features/items
 */
@Serializable(with = InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf.Serializer::class)
public sealed class InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `card_issuing`.
     */
    public data object CardIssuing : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "card_issuing"
    }

    /**
     * Documented value. Wire value: `deposit_insurance`.
     */
    public data object DepositInsurance : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "deposit_insurance"
    }

    /**
     * Documented value. Wire value: `financial_addresses.aba`.
     */
    public data object FinancialAddressesAba : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "financial_addresses.aba"
    }

    /**
     * Documented value. Wire value: `financial_addresses.aba.forwarding`.
     */
    public data object FinancialAddressesAbaForwarding : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "financial_addresses.aba.forwarding"
    }

    /**
     * Documented value. Wire value: `inbound_transfers.ach`.
     */
    public data object InboundTransfersAch : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "inbound_transfers.ach"
    }

    /**
     * Documented value. Wire value: `intra_stripe_flows`.
     */
    public data object IntraStripeFlows : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "intra_stripe_flows"
    }

    /**
     * Documented value. Wire value: `outbound_payments.ach`.
     */
    public data object OutboundPaymentsAch : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "outbound_payments.ach"
    }

    /**
     * Documented value. Wire value: `outbound_payments.us_domestic_wire`.
     */
    public data object OutboundPaymentsUsDomesticWire : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "outbound_payments.us_domestic_wire"
    }

    /**
     * Documented value. Wire value: `outbound_transfers.ach`.
     */
    public data object OutboundTransfersAch : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "outbound_transfers.ach"
    }

    /**
     * Documented value. Wire value: `outbound_transfers.us_domestic_wire`.
     */
    public data object OutboundTransfersUsDomesticWire : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "outbound_transfers.us_domestic_wire"
    }

    /**
     * Documented value. Wire value: `remote_deposit_capture`.
     */
    public data object RemoteDepositCapture : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf() {
        public override val `value`: String = "remote_deposit_capture"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf()

    public companion object {
        public fun fromValue(`value`: String): InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf =
            when (value) {
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

    public object Serializer : KSerializer<InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
