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
 * Current status of the OutboundTransfer: `processing`, `failed`, `canceled`, `posted`, `returned`. An OutboundTransfer
 * is `processing` if it has been created and is pending. The status changes to `posted` once the OutboundTransfer has
 * been "confirmed" and funds have left the account, or to `failed` or `canceled`. If an OutboundTransfer fails to
 * arrive at its destination, its status will change to `returned`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_transfer/properties/status
 */
@Serializable(with = InlineTreasuryOutboundTransferStatusX846ab535.Serializer::class)
public sealed class InlineTreasuryOutboundTransferStatusX846ab535 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineTreasuryOutboundTransferStatusX846ab535() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineTreasuryOutboundTransferStatusX846ab535() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `posted`.
   */
  public data object Posted : InlineTreasuryOutboundTransferStatusX846ab535() {
    public override val `value`: String = "posted"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineTreasuryOutboundTransferStatusX846ab535() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `returned`.
   */
  public data object Returned : InlineTreasuryOutboundTransferStatusX846ab535() {
    public override val `value`: String = "returned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryOutboundTransferStatusX846ab535()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryOutboundTransferStatusX846ab535 = when (value) {
      Canceled.value -> Canceled
      Failed.value -> Failed
      Posted.value -> Posted
      Processing.value -> Processing
      Returned.value -> Returned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryOutboundTransferStatusX846ab535> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryOutboundTransferStatusX846ab535", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryOutboundTransferStatusX846ab535 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryOutboundTransferStatusX846ab535) {
      encoder.encodeString(value.value)
    }
  }
}
