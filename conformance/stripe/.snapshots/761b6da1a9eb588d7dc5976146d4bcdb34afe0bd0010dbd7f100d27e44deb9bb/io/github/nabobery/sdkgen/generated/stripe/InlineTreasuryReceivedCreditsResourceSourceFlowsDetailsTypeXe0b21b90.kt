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
 * The type of the source flow that originated the ReceivedCredit.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/treasury_received_credits_resource_source_flows_details/properties/t
 * ype
 */
@Serializable(with = InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90.Serializer::class)
public sealed class InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_reversal`.
   */
  public data object CreditReversal : InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90() {
    public override val `value`: String = "credit_reversal"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `outbound_payment`.
   */
  public data object OutboundPayment : InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90() {
    public override val `value`: String = "outbound_payment"
  }

  /**
   * Documented value. Wire value: `outbound_transfer`.
   */
  public data object OutboundTransfer : InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90() {
    public override val `value`: String = "outbound_transfer"
  }

  /**
   * Documented value. Wire value: `payout`.
   */
  public data object Payout : InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90() {
    public override val `value`: String = "payout"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90 = when (value) {
      CreditReversal.value -> CreditReversal
      Other.value -> Other
      OutboundPayment.value -> OutboundPayment
      OutboundTransfer.value -> OutboundTransfer
      Payout.value -> Payout
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryReceivedCreditsResourceSourceFlowsDetailsTypeXe0b21b90) {
      encoder.encodeString(value.value)
    }
  }
}
