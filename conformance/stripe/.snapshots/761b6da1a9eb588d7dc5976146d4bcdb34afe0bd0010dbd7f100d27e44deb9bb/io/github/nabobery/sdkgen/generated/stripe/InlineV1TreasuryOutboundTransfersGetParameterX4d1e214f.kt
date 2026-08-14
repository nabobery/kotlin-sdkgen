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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/get/parameters/5/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_transfers/get/parameters/5/schema
 */
@Serializable(with = InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f.Serializer::class)
public sealed class InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `canceled`.
   */
  public data object Canceled : InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f() {
    public override val `value`: String = "canceled"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `posted`.
   */
  public data object Posted : InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f() {
    public override val `value`: String = "posted"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `returned`.
   */
  public data object Returned : InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f() {
    public override val `value`: String = "returned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f = when (value) {
      Canceled.value -> Canceled
      Failed.value -> Failed
      Posted.value -> Posted
      Processing.value -> Processing
      Returned.value -> Returned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundTransfersGetParameterX4d1e214f) {
      encoder.encodeString(value.value)
    }
  }
}
