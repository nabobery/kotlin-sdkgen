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
 * The specific money movement that generated the TransactionEntry.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction_entry/properties/type
 */
@Serializable(with = InlineTreasuryTransactionEntryTypeXdb344cde.Serializer::class)
public sealed class InlineTreasuryTransactionEntryTypeXdb344cde {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_reversal`.
   */
  public data object CreditReversal : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "credit_reversal"
  }

  /**
   * Documented value. Wire value: `credit_reversal_posting`.
   */
  public data object CreditReversalPosting : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "credit_reversal_posting"
  }

  /**
   * Documented value. Wire value: `debit_reversal`.
   */
  public data object DebitReversal : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "debit_reversal"
  }

  /**
   * Documented value. Wire value: `inbound_transfer`.
   */
  public data object InboundTransfer : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "inbound_transfer"
  }

  /**
   * Documented value. Wire value: `inbound_transfer_return`.
   */
  public data object InboundTransferReturn : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "inbound_transfer_return"
  }

  /**
   * Documented value. Wire value: `issuing_authorization_hold`.
   */
  public data object IssuingAuthorizationHold : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "issuing_authorization_hold"
  }

  /**
   * Documented value. Wire value: `issuing_authorization_release`.
   */
  public data object IssuingAuthorizationRelease : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "issuing_authorization_release"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `outbound_payment`.
   */
  public data object OutboundPayment : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_payment"
  }

  /**
   * Documented value. Wire value: `outbound_payment_cancellation`.
   */
  public data object OutboundPaymentCancellation : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_payment_cancellation"
  }

  /**
   * Documented value. Wire value: `outbound_payment_failure`.
   */
  public data object OutboundPaymentFailure : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_payment_failure"
  }

  /**
   * Documented value. Wire value: `outbound_payment_posting`.
   */
  public data object OutboundPaymentPosting : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_payment_posting"
  }

  /**
   * Documented value. Wire value: `outbound_payment_return`.
   */
  public data object OutboundPaymentReturn : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_payment_return"
  }

  /**
   * Documented value. Wire value: `outbound_transfer`.
   */
  public data object OutboundTransfer : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_transfer"
  }

  /**
   * Documented value. Wire value: `outbound_transfer_cancellation`.
   */
  public data object OutboundTransferCancellation : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_transfer_cancellation"
  }

  /**
   * Documented value. Wire value: `outbound_transfer_failure`.
   */
  public data object OutboundTransferFailure : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_transfer_failure"
  }

  /**
   * Documented value. Wire value: `outbound_transfer_posting`.
   */
  public data object OutboundTransferPosting : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_transfer_posting"
  }

  /**
   * Documented value. Wire value: `outbound_transfer_return`.
   */
  public data object OutboundTransferReturn : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "outbound_transfer_return"
  }

  /**
   * Documented value. Wire value: `received_credit`.
   */
  public data object ReceivedCredit : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "received_credit"
  }

  /**
   * Documented value. Wire value: `received_debit`.
   */
  public data object ReceivedDebit : InlineTreasuryTransactionEntryTypeXdb344cde() {
    public override val `value`: String = "received_debit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryTransactionEntryTypeXdb344cde()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryTransactionEntryTypeXdb344cde = when (value) {
      CreditReversal.value -> CreditReversal
      CreditReversalPosting.value -> CreditReversalPosting
      DebitReversal.value -> DebitReversal
      InboundTransfer.value -> InboundTransfer
      InboundTransferReturn.value -> InboundTransferReturn
      IssuingAuthorizationHold.value -> IssuingAuthorizationHold
      IssuingAuthorizationRelease.value -> IssuingAuthorizationRelease
      Other.value -> Other
      OutboundPayment.value -> OutboundPayment
      OutboundPaymentCancellation.value -> OutboundPaymentCancellation
      OutboundPaymentFailure.value -> OutboundPaymentFailure
      OutboundPaymentPosting.value -> OutboundPaymentPosting
      OutboundPaymentReturn.value -> OutboundPaymentReturn
      OutboundTransfer.value -> OutboundTransfer
      OutboundTransferCancellation.value -> OutboundTransferCancellation
      OutboundTransferFailure.value -> OutboundTransferFailure
      OutboundTransferPosting.value -> OutboundTransferPosting
      OutboundTransferReturn.value -> OutboundTransferReturn
      ReceivedCredit.value -> ReceivedCredit
      ReceivedDebit.value -> ReceivedDebit
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineTreasuryTransactionEntryTypeXdb344cde> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryTransactionEntryTypeXdb344cde", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryTransactionEntryTypeXdb344cde = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryTransactionEntryTypeXdb344cde) {
      encoder.encodeString(value.value)
    }
  }
}
