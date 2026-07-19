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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionViewResult/properties/file_type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType
  .Serializer::class)
public sealed class InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType() {
    public override val `value`: String = "text"
  }

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType() {
    public override val `value`: String = "image"
  }

  /**
   * Documented value. Wire value: `pdf`.
   */
  public data object Pdf : InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType() {
    public override val `value`: String = "pdf"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType = when (value) {
      Text.value -> Text
      Image.value -> Image
      Pdf.value -> Pdf
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesFileType) {
      encoder.encodeString(value.value)
    }
  }
}
