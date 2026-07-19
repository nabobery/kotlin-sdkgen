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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailText/properties/type.
 */
@Serializable(with = InlineComponentsSchemasReasoningDetailTextPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasReasoningDetailTextPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning.text`.
   */
  public data object ReasoningText : InlineComponentsSchemasReasoningDetailTextPropertiesType() {
    public override val `value`: String = "reasoning.text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasReasoningDetailTextPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasReasoningDetailTextPropertiesType = when (value) {
      ReasoningText.value -> ReasoningText
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasReasoningDetailTextPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasReasoningDetailTextPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasReasoningDetailTextPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasReasoningDetailTextPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
