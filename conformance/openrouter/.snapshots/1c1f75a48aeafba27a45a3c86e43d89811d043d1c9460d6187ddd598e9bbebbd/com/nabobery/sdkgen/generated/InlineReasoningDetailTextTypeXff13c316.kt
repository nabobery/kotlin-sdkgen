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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailText/properties/type
 */
@Serializable(with = InlineReasoningDetailTextTypeXff13c316.Serializer::class)
public sealed class InlineReasoningDetailTextTypeXff13c316 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning.text`.
   */
  public data object ReasoningText : InlineReasoningDetailTextTypeXff13c316() {
    public override val `value`: String = "reasoning.text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReasoningDetailTextTypeXff13c316()

  public companion object {
    public fun fromValue(`value`: String): InlineReasoningDetailTextTypeXff13c316 = when (value) {
      ReasoningText.value -> ReasoningText
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReasoningDetailTextTypeXff13c316> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineReasoningDetailTextTypeXff13c316", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReasoningDetailTextTypeXff13c316 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReasoningDetailTextTypeXff13c316) {
      encoder.encodeString(value.value)
    }
  }
}
