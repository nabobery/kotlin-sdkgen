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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningSummaryPartAddedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseReasoningSummaryPartAddedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseReasoningSummaryPartAddedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_summary_part.added`.
   */
  public data object ResponseReasoningSummaryPartAdded : InlineComponentsSchemasBaseReasoningSummaryPartAddedEventPropertiesType() {
    public override val `value`: String = "response.reasoning_summary_part.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseReasoningSummaryPartAddedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseReasoningSummaryPartAddedEventPropertiesType =
      when (value) {
      ResponseReasoningSummaryPartAdded.value -> ResponseReasoningSummaryPartAdded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseReasoningSummaryPartAddedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseReasoningSummaryPartAddedEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseReasoningSummaryPartAddedEventPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseReasoningSummaryPartAddedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
