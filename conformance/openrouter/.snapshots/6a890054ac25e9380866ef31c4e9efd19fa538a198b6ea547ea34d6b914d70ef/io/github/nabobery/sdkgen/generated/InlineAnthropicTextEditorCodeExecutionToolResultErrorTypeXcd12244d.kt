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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResultError/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResultError/properties/type
 */
@Serializable(with = InlineAnthropicTextEditorCodeExecutionToolResultErrorTypeXcd12244d.Serializer::class)
public sealed class InlineAnthropicTextEditorCodeExecutionToolResultErrorTypeXcd12244d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_code_execution_tool_result_error`.
   */
  public data object TextEditorCodeExecutionToolResultError : InlineAnthropicTextEditorCodeExecutionToolResultErrorTypeXcd12244d() {
    public override val `value`: String = "text_editor_code_execution_tool_result_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicTextEditorCodeExecutionToolResultErrorTypeXcd12244d()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicTextEditorCodeExecutionToolResultErrorTypeXcd12244d = when (value) {
      TextEditorCodeExecutionToolResultError.value -> TextEditorCodeExecutionToolResultError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicTextEditorCodeExecutionToolResultErrorTypeXcd12244d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicTextEditorCodeExecutionToolResultErrorTypeXcd12244d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicTextEditorCodeExecutionToolResultErrorTypeXcd12244d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicTextEditorCodeExecutionToolResultErrorTypeXcd12244d) {
      encoder.encodeString(value.value)
    }
  }
}
