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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ReasoningTextContent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasReasoningTextContentPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasReasoningTextContentPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning_text`.
   */
  public data object ReasoningText : InlineComponentsSchemasReasoningTextContentPropertiesType() {
    public override val `value`: String = "reasoning_text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasReasoningTextContentPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasReasoningTextContentPropertiesType = when (value) {
      ReasoningText.value -> ReasoningText
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasReasoningTextContentPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasReasoningTextContentPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasReasoningTextContentPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasReasoningTextContentPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
