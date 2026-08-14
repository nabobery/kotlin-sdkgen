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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryTextDeltaEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryTextDeltaEvent/properties/type
 */
@Serializable(with = InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f.Serializer::class)
public sealed class InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_summary_text.delta`.
   */
  public data object ResponseReasoningSummaryTextDelta : InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f() {
    public override val `value`: String = "response.reasoning_summary_text.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f = when (value) {
      ResponseReasoningSummaryTextDelta.value -> ResponseReasoningSummaryTextDelta
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseReasoningSummaryTextDeltaEventTypeXf824160f) {
      encoder.encodeString(value.value)
    }
  }
}
