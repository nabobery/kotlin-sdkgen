package io.github.nabobery.sdkgen.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionViewResult/properties/file_type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionViewResult/properties/file_type
 */
@Serializable(with = InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c.Serializer::class)
public sealed class InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `pdf`.
   */
  public data object Pdf : InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c() {
    public override val `value`: String = "pdf"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c = when (value) {
      Text.value -> Text
      Image.value -> Image
      Pdf.value -> Pdf
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicTextEditorCodeExecutionViewResultFileTypeX93a9dd3c) {
      encoder.encodeString(value.value)
    }
  }
}
