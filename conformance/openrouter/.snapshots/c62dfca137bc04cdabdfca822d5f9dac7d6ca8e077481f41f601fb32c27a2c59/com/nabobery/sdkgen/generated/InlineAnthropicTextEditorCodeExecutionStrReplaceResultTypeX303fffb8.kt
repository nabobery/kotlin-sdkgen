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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionStrReplaceResult/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionStrReplaceResult/properties/type
 */
@Serializable(with = InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8.Serializer::class)
public sealed class InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_code_execution_str_replace_result`.
   */
  public data object TextEditorCodeExecutionStrReplaceResult : InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8() {
    public override val `value`: String = "text_editor_code_execution_str_replace_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8 = when (value) {
      TextEditorCodeExecutionStrReplaceResult.value -> TextEditorCodeExecutionStrReplaceResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicTextEditorCodeExecutionStrReplaceResultTypeX303fffb8) {
      encoder.encodeString(value.value)
    }
  }
}
