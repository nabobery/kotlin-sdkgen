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
 * Transaction type: `tax_fund`, `adjustment`, `advance`, `advance_funding`, `anticipation_repayment`,
 * `application_fee`, `application_fee_refund`, `charge`, `climate_order_purchase`, `climate_order_refund`,
 * `connect_collection_transfer`, `contribution`, `inbound_transfer`, `inbound_transfer_reversal`,
 * `issuing_authorization_hold`, `issuing_authorization_release`, `issuing_dispute`, `issuing_transaction`,
 * `obligation_outbound`, `obligation_reversal_inbound`, `payment`, `payment_failure_refund`,
 * `payment_network_reserve_hold`, `payment_network_reserve_release`, `payment_refund`, `payment_reversal`,
 * `payment_unreconciled`, `payout`, `payout_cancel`, `payout_failure`, `payout_minimum_balance_hold`,
 * `payout_minimum_balance_release`, `refund`, `refund_failure`, `reserve_transaction`, `reserved_funds`,
 * `reserve_hold`, `reserve_release`, `stripe_fee`, `stripe_fx_fee`, `stripe_balance_payment_debit`,
 * `stripe_balance_payment_debit_reversal`, `tax_fee`, `topup`, `topup_reversal`, `transfer`, `transfer_cancel`,
 * `transfer_failure`, `transfer_refund`, or `fee_credit_funding`. Learn more about [balance transaction types and what
 * they represent](https://stripe.com/docs/reports/balance-transaction-types). To classify transactions for accounting
 * purposes, consider `reporting_category` instead.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_transaction/properties/type
 */
@Serializable(with = InlineBalanceTransactionTypeXf875c7aa.Serializer::class)
public sealed class InlineBalanceTransactionTypeXf875c7aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adjustment`.
   */
  public data object Adjustment : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "adjustment"
  }

  /**
   * Documented value. Wire value: `advance`.
   */
  public data object Advance : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "advance"
  }

  /**
   * Documented value. Wire value: `advance_funding`.
   */
  public data object AdvanceFunding : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "advance_funding"
  }

  /**
   * Documented value. Wire value: `anticipation_repayment`.
   */
  public data object AnticipationRepayment : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "anticipation_repayment"
  }

  /**
   * Documented value. Wire value: `application_fee`.
   */
  public data object ApplicationFee : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "application_fee"
  }

  /**
   * Documented value. Wire value: `application_fee_refund`.
   */
  public data object ApplicationFeeRefund : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "application_fee_refund"
  }

  /**
   * Documented value. Wire value: `charge`.
   */
  public data object Charge : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "charge"
  }

  /**
   * Documented value. Wire value: `climate_order_purchase`.
   */
  public data object ClimateOrderPurchase : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "climate_order_purchase"
  }

  /**
   * Documented value. Wire value: `climate_order_refund`.
   */
  public data object ClimateOrderRefund : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "climate_order_refund"
  }

  /**
   * Documented value. Wire value: `connect_collection_transfer`.
   */
  public data object ConnectCollectionTransfer : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "connect_collection_transfer"
  }

  /**
   * Documented value. Wire value: `contribution`.
   */
  public data object Contribution : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "contribution"
  }

  /**
   * Documented value. Wire value: `fee_credit_funding`.
   */
  public data object FeeCreditFunding : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "fee_credit_funding"
  }

  /**
   * Documented value. Wire value: `inbound_transfer`.
   */
  public data object InboundTransfer : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "inbound_transfer"
  }

  /**
   * Documented value. Wire value: `inbound_transfer_reversal`.
   */
  public data object InboundTransferReversal : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "inbound_transfer_reversal"
  }

  /**
   * Documented value. Wire value: `issuing_authorization_hold`.
   */
  public data object IssuingAuthorizationHold : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "issuing_authorization_hold"
  }

  /**
   * Documented value. Wire value: `issuing_authorization_release`.
   */
  public data object IssuingAuthorizationRelease : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "issuing_authorization_release"
  }

  /**
   * Documented value. Wire value: `issuing_dispute`.
   */
  public data object IssuingDispute : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "issuing_dispute"
  }

  /**
   * Documented value. Wire value: `issuing_transaction`.
   */
  public data object IssuingTransaction : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "issuing_transaction"
  }

  /**
   * Documented value. Wire value: `obligation_outbound`.
   */
  public data object ObligationOutbound : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "obligation_outbound"
  }

  /**
   * Documented value. Wire value: `obligation_reversal_inbound`.
   */
  public data object ObligationReversalInbound : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "obligation_reversal_inbound"
  }

  /**
   * Documented value. Wire value: `payment`.
   */
  public data object Payment : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payment"
  }

  /**
   * Documented value. Wire value: `payment_failure_refund`.
   */
  public data object PaymentFailureRefund : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payment_failure_refund"
  }

  /**
   * Documented value. Wire value: `payment_network_reserve_hold`.
   */
  public data object PaymentNetworkReserveHold : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payment_network_reserve_hold"
  }

  /**
   * Documented value. Wire value: `payment_network_reserve_release`.
   */
  public data object PaymentNetworkReserveRelease : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payment_network_reserve_release"
  }

  /**
   * Documented value. Wire value: `payment_refund`.
   */
  public data object PaymentRefund : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payment_refund"
  }

  /**
   * Documented value. Wire value: `payment_reversal`.
   */
  public data object PaymentReversal : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payment_reversal"
  }

  /**
   * Documented value. Wire value: `payment_unreconciled`.
   */
  public data object PaymentUnreconciled : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payment_unreconciled"
  }

  /**
   * Documented value. Wire value: `payout`.
   */
  public data object Payout : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payout"
  }

  /**
   * Documented value. Wire value: `payout_cancel`.
   */
  public data object PayoutCancel : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payout_cancel"
  }

  /**
   * Documented value. Wire value: `payout_failure`.
   */
  public data object PayoutFailure : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payout_failure"
  }

  /**
   * Documented value. Wire value: `payout_minimum_balance_hold`.
   */
  public data object PayoutMinimumBalanceHold : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payout_minimum_balance_hold"
  }

  /**
   * Documented value. Wire value: `payout_minimum_balance_release`.
   */
  public data object PayoutMinimumBalanceRelease : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "payout_minimum_balance_release"
  }

  /**
   * Documented value. Wire value: `refund`.
   */
  public data object Refund : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "refund"
  }

  /**
   * Documented value. Wire value: `refund_failure`.
   */
  public data object RefundFailure : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "refund_failure"
  }

  /**
   * Documented value. Wire value: `reserve_hold`.
   */
  public data object ReserveHold : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "reserve_hold"
  }

  /**
   * Documented value. Wire value: `reserve_release`.
   */
  public data object ReserveRelease : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "reserve_release"
  }

  /**
   * Documented value. Wire value: `reserve_transaction`.
   */
  public data object ReserveTransaction : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "reserve_transaction"
  }

  /**
   * Documented value. Wire value: `reserved_funds`.
   */
  public data object ReservedFunds : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "reserved_funds"
  }

  /**
   * Documented value. Wire value: `stripe_balance_payment_debit`.
   */
  public data object StripeBalancePaymentDebit : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "stripe_balance_payment_debit"
  }

  /**
   * Documented value. Wire value: `stripe_balance_payment_debit_reversal`.
   */
  public data object StripeBalancePaymentDebitReversal : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "stripe_balance_payment_debit_reversal"
  }

  /**
   * Documented value. Wire value: `stripe_fee`.
   */
  public data object StripeFee : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "stripe_fee"
  }

  /**
   * Documented value. Wire value: `stripe_fx_fee`.
   */
  public data object StripeFxFee : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "stripe_fx_fee"
  }

  /**
   * Documented value. Wire value: `tax_fee`.
   */
  public data object TaxFee : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "tax_fee"
  }

  /**
   * Documented value. Wire value: `tax_fund`.
   */
  public data object TaxFund : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "tax_fund"
  }

  /**
   * Documented value. Wire value: `topup`.
   */
  public data object Topup : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "topup"
  }

  /**
   * Documented value. Wire value: `topup_reversal`.
   */
  public data object TopupReversal : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "topup_reversal"
  }

  /**
   * Documented value. Wire value: `transfer`.
   */
  public data object Transfer : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "transfer"
  }

  /**
   * Documented value. Wire value: `transfer_cancel`.
   */
  public data object TransferCancel : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "transfer_cancel"
  }

  /**
   * Documented value. Wire value: `transfer_failure`.
   */
  public data object TransferFailure : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "transfer_failure"
  }

  /**
   * Documented value. Wire value: `transfer_refund`.
   */
  public data object TransferRefund : InlineBalanceTransactionTypeXf875c7aa() {
    public override val `value`: String = "transfer_refund"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBalanceTransactionTypeXf875c7aa()

  public companion object {
    public fun fromValue(`value`: String): InlineBalanceTransactionTypeXf875c7aa = when (value) {
      Adjustment.value -> Adjustment
      Advance.value -> Advance
      AdvanceFunding.value -> AdvanceFunding
      AnticipationRepayment.value -> AnticipationRepayment
      ApplicationFee.value -> ApplicationFee
      ApplicationFeeRefund.value -> ApplicationFeeRefund
      Charge.value -> Charge
      ClimateOrderPurchase.value -> ClimateOrderPurchase
      ClimateOrderRefund.value -> ClimateOrderRefund
      ConnectCollectionTransfer.value -> ConnectCollectionTransfer
      Contribution.value -> Contribution
      FeeCreditFunding.value -> FeeCreditFunding
      InboundTransfer.value -> InboundTransfer
      InboundTransferReversal.value -> InboundTransferReversal
      IssuingAuthorizationHold.value -> IssuingAuthorizationHold
      IssuingAuthorizationRelease.value -> IssuingAuthorizationRelease
      IssuingDispute.value -> IssuingDispute
      IssuingTransaction.value -> IssuingTransaction
      ObligationOutbound.value -> ObligationOutbound
      ObligationReversalInbound.value -> ObligationReversalInbound
      Payment.value -> Payment
      PaymentFailureRefund.value -> PaymentFailureRefund
      PaymentNetworkReserveHold.value -> PaymentNetworkReserveHold
      PaymentNetworkReserveRelease.value -> PaymentNetworkReserveRelease
      PaymentRefund.value -> PaymentRefund
      PaymentReversal.value -> PaymentReversal
      PaymentUnreconciled.value -> PaymentUnreconciled
      Payout.value -> Payout
      PayoutCancel.value -> PayoutCancel
      PayoutFailure.value -> PayoutFailure
      PayoutMinimumBalanceHold.value -> PayoutMinimumBalanceHold
      PayoutMinimumBalanceRelease.value -> PayoutMinimumBalanceRelease
      Refund.value -> Refund
      RefundFailure.value -> RefundFailure
      ReserveHold.value -> ReserveHold
      ReserveRelease.value -> ReserveRelease
      ReserveTransaction.value -> ReserveTransaction
      ReservedFunds.value -> ReservedFunds
      StripeBalancePaymentDebit.value -> StripeBalancePaymentDebit
      StripeBalancePaymentDebitReversal.value -> StripeBalancePaymentDebitReversal
      StripeFee.value -> StripeFee
      StripeFxFee.value -> StripeFxFee
      TaxFee.value -> TaxFee
      TaxFund.value -> TaxFund
      Topup.value -> Topup
      TopupReversal.value -> TopupReversal
      Transfer.value -> Transfer
      TransferCancel.value -> TransferCancel
      TransferFailure.value -> TransferFailure
      TransferRefund.value -> TransferRefund
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBalanceTransactionTypeXf875c7aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineBalanceTransactionTypeXf875c7aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBalanceTransactionTypeXf875c7aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBalanceTransactionTypeXf875c7aa) {
      encoder.encodeString(value.value)
    }
  }
}
