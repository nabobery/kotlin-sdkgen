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
 */
@Serializable(with = InlineComponentsSchemasReasoningSummaryTextPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasReasoningSummaryTextPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `summary_text`.
   */
  public data object SummaryText : InlineComponentsSchemasReasoningSummaryTextPropertiesType() {
    public override val `value`: String = "summary_text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasReasoningSummaryTextPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasReasoningSummaryTextPropertiesType = when (value) {
      SummaryText.value -> SummaryText
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasReasoningSummaryTextPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasReasoningSummaryTextPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasReasoningSummaryTextPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasReasoningSummaryTextPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
