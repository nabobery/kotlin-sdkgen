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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResult/properties/type
 */
@Serializable(with = InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294.Serializer::class)
public sealed class InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_code_execution_tool_result`.
   */
  public data object TextEditorCodeExecutionToolResult : InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294() {
    public override val `value`: String = "text_editor_code_execution_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294 = when (value) {
      TextEditorCodeExecutionToolResult.value -> TextEditorCodeExecutionToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicTextEditorCodeExecutionToolResultTypeX62bd7294) {
      encoder.encodeString(value.value)
    }
  }
}
