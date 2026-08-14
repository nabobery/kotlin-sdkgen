package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailSummary/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailSummary/properties/type
 */
@Serializable(with = InlineReasoningDetailSummaryTypeX14c56c20.Serializer::class)
public sealed class InlineReasoningDetailSummaryTypeX14c56c20 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning.summary`.
   */
  public data object ReasoningSummary : InlineReasoningDetailSummaryTypeX14c56c20() {
    public override val `value`: String = "reasoning.summary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReasoningDetailSummaryTypeX14c56c20()

  public companion object {
    public fun fromValue(`value`: String): InlineReasoningDetailSummaryTypeX14c56c20 = when (value) {
      ReasoningSummary.value -> ReasoningSummary
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReasoningDetailSummaryTypeX14c56c20> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineReasoningDetailSummaryTypeX14c56c20", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReasoningDetailSummaryTypeX14c56c20 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReasoningDetailSummaryTypeX14c56c20) {
      encoder.encodeString(value.value)
    }
  }
}
