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
 * Status of the DebitReversal
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.debit_reversal/properties/status
 */
@Serializable(with = InlineTreasuryDebitReversalStatusX1d772209.Serializer::class)
public sealed class InlineTreasuryDebitReversalStatusX1d772209 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineTreasuryDebitReversalStatusX1d772209() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `processing`.
   */
  public data object Processing : InlineTreasuryDebitReversalStatusX1d772209() {
    public override val `value`: String = "processing"
  }

  /**
   * Documented value. Wire value: `succeeded`.
   */
  public data object Succeeded : InlineTreasuryDebitReversalStatusX1d772209() {
    public override val `value`: String = "succeeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTreasuryDebitReversalStatusX1d772209()

  public companion object {
    public fun fromValue(`value`: String): InlineTreasuryDebitReversalStatusX1d772209 = when (value) {
      Failed.value -> Failed
      Processing.value -> Processing
      Succeeded.value -> Succeeded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTreasuryDebitReversalStatusX1d772209> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTreasuryDebitReversalStatusX1d772209", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTreasuryDebitReversalStatusX1d772209 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTreasuryDebitReversalStatusX1d772209) {
      encoder.encodeString(value.value)
    }
  }
}
