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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryTextDeltaEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseReasoningSummaryTextDeltaEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseReasoningSummaryTextDeltaEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_summary_text.delta`.
   */
  public data object ResponseReasoningSummaryTextDelta : InlineComponentsSchemasBaseReasoningSummaryTextDeltaEventPropertiesType() {
    public override val `value`: String = "response.reasoning_summary_text.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseReasoningSummaryTextDeltaEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseReasoningSummaryTextDeltaEventPropertiesType =
      when (value) {
      ResponseReasoningSummaryTextDelta.value -> ResponseReasoningSummaryTextDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseReasoningSummaryTextDeltaEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseReasoningSummaryTextDeltaEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseReasoningSummaryTextDeltaEventPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseReasoningSummaryTextDeltaEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
