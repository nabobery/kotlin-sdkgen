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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailSummary/properties/type.
 */
@Serializable(with = InlineComponentsSchemasReasoningDetailSummaryPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasReasoningDetailSummaryPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning.summary`.
   */
  public data object ReasoningSummary : InlineComponentsSchemasReasoningDetailSummaryPropertiesType() {
    public override val `value`: String = "reasoning.summary"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasReasoningDetailSummaryPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasReasoningDetailSummaryPropertiesType = when (value) {
      ReasoningSummary.value -> ReasoningSummary
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasReasoningDetailSummaryPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasReasoningDetailSummaryPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasReasoningDetailSummaryPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasReasoningDetailSummaryPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
