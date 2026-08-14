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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryPartDoneEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryPartDoneEvent/properties/type
 */
@Serializable(with = InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a.Serializer::class)
public sealed class InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_summary_part.done`.
   */
  public data object ResponseReasoningSummaryPartDone : InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a() {
    public override val `value`: String = "response.reasoning_summary_part.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a = when (value) {
      ResponseReasoningSummaryPartDone.value -> ResponseReasoningSummaryPartDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseReasoningSummaryPartDoneEventTypeXddb16b1a) {
      encoder.encodeString(value.value)
    }
  }
}
