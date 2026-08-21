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
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1inbound_transfers/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1inbound_transfers/get/parameters/5/schema
 */
@Serializable(with = InlineV1TreasuryInboundTransfersGetParameterX74be2205.Serializer::class)
public sealed class InlineV1TreasuryInboundTransfersGetParameterX74be2205 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1TreasuryInboundTransfersGetParameterX74be2205() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineV1TreasuryInboundTransfersGetParameterX74be2205() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineV1TreasuryInboundTransfersGetParameterX74be2205() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineV1TreasuryInboundTransfersGetParameterX74be2205() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryInboundTransfersGetParameterX74be2205()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryInboundTransfersGetParameterX74be2205 = when (value) {
      Canceled.value -> Canceled
      Failed.value -> Failed
      Processing.value -> Processing
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryInboundTransfersGetParameterX74be2205> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1TreasuryInboundTransfersGetParameterX74be2205", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryInboundTransfersGetParameterX74be2205 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryInboundTransfersGetParameterX74be2205) {
      encoder.encodeString(value.value)
    }
  }
}
