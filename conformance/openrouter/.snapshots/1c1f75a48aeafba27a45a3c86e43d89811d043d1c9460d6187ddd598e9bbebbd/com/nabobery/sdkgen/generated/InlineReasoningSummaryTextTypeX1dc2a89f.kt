package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ReasoningSummaryText/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningSummaryText/properties/type
 */
@Serializable(with = InlineReasoningSummaryTextTypeX1dc2a89f.Serializer::class)
public sealed class InlineReasoningSummaryTextTypeX1dc2a89f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `summary_text`.
   */
  public data object SummaryText : InlineReasoningSummaryTextTypeX1dc2a89f() {
    public override val `value`: String = "summary_text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReasoningSummaryTextTypeX1dc2a89f()

  public companion object {
    public fun fromValue(`value`: String): InlineReasoningSummaryTextTypeX1dc2a89f = when (value) {
      SummaryText.value -> SummaryText
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReasoningSummaryTextTypeX1dc2a89f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineReasoningSummaryTextTypeX1dc2a89f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReasoningSummaryTextTypeX1dc2a89f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReasoningSummaryTextTypeX1dc2a89f) {
      encoder.encodeString(value.value)
    }
  }
}
