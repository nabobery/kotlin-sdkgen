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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionViewResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionViewResult/properties/type
 */
@Serializable(with = InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759.Serializer::class)
public sealed class InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_code_execution_view_result`.
   */
  public data object TextEditorCodeExecutionViewResult : InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759() {
    public override val `value`: String = "text_editor_code_execution_view_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759 = when (value) {
      TextEditorCodeExecutionViewResult.value -> TextEditorCodeExecutionViewResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicTextEditorCodeExecutionViewResultTypeXf03c7759) {
      encoder.encodeString(value.value)
    }
  }
}
