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
 * Type of the flow that created the Transaction. Set to the same value as `flow_type`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury_transactions_resource_flow_details/properties/type
 */
@Serializable(with = InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71.Serializer::class)
public sealed class InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_reversal`.
   */
  public data object CreditReversal : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71() {
    public override val `value`: String = "credit_reversal"
  }

  /**
   * Documented value. Wire value: `debit_reversal`.
   */
  public data object DebitReversal : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71() {
    public override val `value`: String = "debit_reversal"
  }

  /**
   * Documented value. Wire value: `inbound_transfer`.
   */
  public data object InboundTransfer : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71() {
    public override val `value`: String = "inbound_transfer"
  }

  /**
   * Documented value. Wire value: `issuing_authorization`.
   */
  public data object IssuingAuthorization : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71() {
    public override val `value`: String = "issuing_authorization"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `outbound_payment`.
   */
  public data object OutboundPayment : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71() {
    public override val `value`: String = "outbound_payment"
  }

  /**
   * Documented value. Wire value: `outbound_transfer`.
   */
  public data object OutboundTransfer : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71() {
    public override val `value`: String = "outbound_transfer"
  }

  /**
   * Documented value. Wire value: `received_credit`.
   */
  public data object ReceivedCredit : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71() {
    public override val `value`: String = "received_credit"
  }

  /**
   * Documented value. Wire value: `received_debit`.
   */
  public data object ReceivedDebit : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71() {
    public override val `value`: String = "received_debit"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71 = when (value) {
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

  internal object Serializer : KSerializer<InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryTransactionsResourceFlowDetailsTypeX471eba71) {
      encoder.encodeString(value.value)
    }
  }
}
