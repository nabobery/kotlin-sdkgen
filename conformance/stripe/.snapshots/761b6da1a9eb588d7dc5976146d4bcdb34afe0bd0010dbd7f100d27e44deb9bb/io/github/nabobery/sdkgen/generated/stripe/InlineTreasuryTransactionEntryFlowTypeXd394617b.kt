package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Type of the flow associated with the TransactionEntry.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.transaction_entry/properties/flow_type
 */
@Serializable(with = InlineTreasuryTransactionEntryFlowTypeXd394617b.Serializer::class)
public sealed class InlineTreasuryTransactionEntryFlowTypeXd394617b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_reversal`.
   */
  public data object CreditReversal : InlineTreasuryTransactionEntryFlowTypeXd394617b() {
    public override val `value`: String = "credit_reversal"
  }

  /**
   * Documented value. Wire value: `debit_reversal`.
   */
  public data object DebitReversal : InlineTreasuryTransactionEntryFlowTypeXd394617b() {
    public override val `value`: String = "debit_reversal"
  }

  /**
   * Documented value. Wire value: `inbound_transfer`.
   */
  public data object InboundTransfer : InlineTreasuryTransactionEntryFlowTypeXd394617b() {
    public override val `value`: String = "inbound_transfer"
  }

  /**
   * Documented value. Wire value: `issuing_authorization`.
   */
  public data object IssuingAuthorization : InlineTreasuryTransactionEntryFlowTypeXd394617b() {
    public override val `value`: String = "issuing_authorization"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryTransactionEntryFlowTypeXd394617b() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `outbound_payment`.
   */
  public data object OutboundPayment : InlineTreasuryTransactionEntryFlowTypeXd394617b() {
    public override val `value`: String = "outbound_payment"
  }

  /**
   * Documented value. Wire value: `outbound_transfer`.
   */
  public data object OutboundTransfer : InlineTreasuryTransactionEntryFlowTypeXd394617b() {
    public override val `value`: String = "outbound_transfer"
  }

  /**
   * Documented value. Wire value: `received_credit`.
   */
  public data object ReceivedCredit : InlineTreasuryTransactionEntryFlowTypeXd394617b() {
    public override val `value`: String = "received_credit"
  }

  /**
   * Documented value. Wire value: `received_debit`.
   */
  public data object ReceivedDebit : InlineTreasuryTransactionEntryFlowTypeXd394617b() {
    public override val `value`: String = "received_debit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryTransactionEntryFlowTypeXd394617b()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryTransactionEntryFlowTypeXd394617b = when (value) {
      CreditReversal.value -> CreditReversal
      DebitReversal.value -> DebitReversal
      InboundTransfer.value -> InboundTransfer
      IssuingAuthorization.value -> IssuingAuthorization
      Other.value -> Other
      OutboundPayment.value -> OutboundPayment
      OutboundTransfer.value -> OutboundTransfer
      ReceivedCredit.value -> ReceivedCredit
      ReceivedDebit.value -> ReceivedDebit
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryTransactionEntryFlowTypeXd394617b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryTransactionEntryFlowTypeXd394617b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryTransactionEntryFlowTypeXd394617b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryTransactionEntryFlowTypeXd394617b) {
      encoder.encodeString(value.value)
    }
  }
}
