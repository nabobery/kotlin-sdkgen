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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source/oneOf/2/properties/typ
 * e.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/source/oneOf/2/properties/typ
 * e
 */
@Serializable(with = InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7.Serializer::class)
public sealed class InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `content`.
   */
  public data object Content : InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7() {
    public override val `value`: String = "content"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7 = when (value) {
      Content.value -> Content
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicDocumentBlockParamSourceOneOf3TypeXcbc5a6c7) {
      encoder.encodeString(value.value)
    }
  }
}
