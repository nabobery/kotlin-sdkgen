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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryPartAddedEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryPartAddedEvent/properties/type
 */
@Serializable(with = InlineBaseReasoningSummaryPartAddedEventTypeX94872cab.Serializer::class)
public sealed class InlineBaseReasoningSummaryPartAddedEventTypeX94872cab {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_summary_part.added`.
   */
  public data object ResponseReasoningSummaryPartAdded : InlineBaseReasoningSummaryPartAddedEventTypeX94872cab() {
    public override val `value`: String = "response.reasoning_summary_part.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseReasoningSummaryPartAddedEventTypeX94872cab()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseReasoningSummaryPartAddedEventTypeX94872cab = when (value) {
      ResponseReasoningSummaryPartAdded.value -> ResponseReasoningSummaryPartAdded
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseReasoningSummaryPartAddedEventTypeX94872cab> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseReasoningSummaryPartAddedEventTypeX94872cab", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseReasoningSummaryPartAddedEventTypeX94872cab = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseReasoningSummaryPartAddedEventTypeX94872cab) {
      encoder.encodeString(value.value)
    }
  }
}
