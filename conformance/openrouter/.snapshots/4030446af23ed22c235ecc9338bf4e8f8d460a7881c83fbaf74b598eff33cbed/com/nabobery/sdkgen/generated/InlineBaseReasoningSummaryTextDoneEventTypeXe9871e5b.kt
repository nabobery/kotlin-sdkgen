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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryTextDoneEvent/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryTextDoneEvent/properties/type
 */
@Serializable(with = InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b.Serializer::class)
public sealed class InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_summary_text.done`.
   */
  public data object ResponseReasoningSummaryTextDone : InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b() {
    public override val `value`: String = "response.reasoning_summary_text.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b()

  public companion object {
    public fun fromValue(`value`: String): InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b = when (value) {
      ResponseReasoningSummaryTextDone.value -> ResponseReasoningSummaryTextDone
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineBaseReasoningSummaryTextDoneEventTypeXe9871e5b) {
      encoder.encodeString(value.value)
    }
  }
}
