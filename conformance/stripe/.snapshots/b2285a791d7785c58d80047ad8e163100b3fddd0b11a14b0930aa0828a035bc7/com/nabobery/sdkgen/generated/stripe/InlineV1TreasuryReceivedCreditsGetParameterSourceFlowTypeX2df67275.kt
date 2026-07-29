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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1received_credits/get/parameters/4/schema/properties/source_flow_t
 * ype.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1received_credits/get/parameters/4/schema/properties/source_flow_t
 * ype
 */
@Serializable(with = InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275.Serializer::class)
public sealed class InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `credit_reversal`.
   */
  public data object CreditReversal : InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275() {
    public override val `value`: String = "credit_reversal"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `outbound_payment`.
   */
  public data object OutboundPayment : InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275() {
    public override val `value`: String = "outbound_payment"
  }

  /**
   * Documented value. Wire value: `outbound_transfer`.
   */
  public data object OutboundTransfer : InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275() {
    public override val `value`: String = "outbound_transfer"
  }

  /**
   * Documented value. Wire value: `payout`.
   */
  public data object Payout : InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275() {
    public override val `value`: String = "payout"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275 = when (value) {
      CreditReversal.value -> CreditReversal
      Other.value -> Other
      OutboundPayment.value -> OutboundPayment
      OutboundTransfer.value -> OutboundTransfer
      Payout.value -> Payout
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryReceivedCreditsGetParameterSourceFlowTypeX2df67275) {
      encoder.encodeString(value.value)
    }
  }
}
