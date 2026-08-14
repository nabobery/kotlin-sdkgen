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
 * The current processing status of this settlement.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.settlement/properties/status
 */
@Serializable(with = InlineIssuingSettlementStatusX0d8287a0.Serializer::class)
public sealed class InlineIssuingSettlementStatusX0d8287a0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `complete`.
   */
  public data object Complete : InlineIssuingSettlementStatusX0d8287a0() {
    public override val `value`: String = "complete"
  }

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineIssuingSettlementStatusX0d8287a0() {
    public override val `value`: String = "pending"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingSettlementStatusX0d8287a0()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingSettlementStatusX0d8287a0 = when (value) {
      Complete.value -> Complete
      Pending.value -> Pending
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingSettlementStatusX0d8287a0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingSettlementStatusX0d8287a0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingSettlementStatusX0d8287a0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingSettlementStatusX0d8287a0) {
      encoder.encodeString(value.value)
    }
  }
}
