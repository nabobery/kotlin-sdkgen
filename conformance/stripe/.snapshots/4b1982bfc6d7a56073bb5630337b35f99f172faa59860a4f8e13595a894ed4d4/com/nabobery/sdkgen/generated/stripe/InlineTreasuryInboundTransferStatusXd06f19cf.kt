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
 * Status of the InboundTransfer: `processing`, `succeeded`, `failed`, and `canceled`. An InboundTransfer is
 * `processing` if it is created and pending. The status changes to `succeeded` once the funds have been "confirmed" and
 * a `transaction` is created and posted. The status changes to `failed` if the transfer fails.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.inbound_transfer/properties/status
 */
@Serializable(with = InlineTreasuryInboundTransferStatusXd06f19cf.Serializer::class)
public sealed class InlineTreasuryInboundTransferStatusXd06f19cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineTreasuryInboundTransferStatusXd06f19cf() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineTreasuryInboundTransferStatusXd06f19cf() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineTreasuryInboundTransferStatusXd06f19cf() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineTreasuryInboundTransferStatusXd06f19cf() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryInboundTransferStatusXd06f19cf()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryInboundTransferStatusXd06f19cf = when (value) {
      Canceled.value -> Canceled
      Failed.value -> Failed
      Processing.value -> Processing
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryInboundTransferStatusXd06f19cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineTreasuryInboundTransferStatusXd06f19cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryInboundTransferStatusXd06f19cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryInboundTransferStatusXd06f19cf) {
      encoder.encodeString(value.value)
    }
  }
}
