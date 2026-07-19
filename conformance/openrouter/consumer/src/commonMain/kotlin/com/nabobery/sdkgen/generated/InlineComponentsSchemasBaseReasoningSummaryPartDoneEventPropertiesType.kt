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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryPartDoneEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_summary_part.done`.
   */
  public data object ResponseReasoningSummaryPartDone : InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType() {
    public override val `value`: String = "response.reasoning_summary_part.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType =
      when (value) {
      ResponseReasoningSummaryPartDone.value -> ResponseReasoningSummaryPartDone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseReasoningSummaryPartDoneEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
