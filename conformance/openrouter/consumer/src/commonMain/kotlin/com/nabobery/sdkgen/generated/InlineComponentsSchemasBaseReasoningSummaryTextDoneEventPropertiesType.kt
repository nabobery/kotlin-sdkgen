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
 */
@Serializable(with = InlineComponentsSchemasBaseReasoningSummaryTextDoneEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseReasoningSummaryTextDoneEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_summary_text.done`.
   */
  public data object ResponseReasoningSummaryTextDone : InlineComponentsSchemasBaseReasoningSummaryTextDoneEventPropertiesType() {
    public override val `value`: String = "response.reasoning_summary_text.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseReasoningSummaryTextDoneEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseReasoningSummaryTextDoneEventPropertiesType =
      when (value) {
      ResponseReasoningSummaryTextDone.value -> ResponseReasoningSummaryTextDone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseReasoningSummaryTextDoneEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseReasoningSummaryTextDoneEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseReasoningSummaryTextDoneEventPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseReasoningSummaryTextDoneEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
