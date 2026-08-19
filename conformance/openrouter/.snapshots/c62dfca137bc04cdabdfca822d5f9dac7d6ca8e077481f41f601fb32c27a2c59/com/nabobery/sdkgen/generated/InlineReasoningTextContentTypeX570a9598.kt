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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningTextContent/properties/type
 */
@Serializable(with = InlineReasoningTextContentTypeX570a9598.Serializer::class)
public sealed class InlineReasoningTextContentTypeX570a9598 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning_text`.
   */
  public data object ReasoningText : InlineReasoningTextContentTypeX570a9598() {
    public override val `value`: String = "reasoning_text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReasoningTextContentTypeX570a9598()

  public companion object {
    public fun fromValue(`value`: String): InlineReasoningTextContentTypeX570a9598 = when (value) {
      ReasoningText.value -> ReasoningText
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReasoningTextContentTypeX570a9598> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineReasoningTextContentTypeX570a9598", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReasoningTextContentTypeX570a9598 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReasoningTextContentTypeX570a9598) {
      encoder.encodeString(value.value)
    }
  }
}
