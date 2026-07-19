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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_code_execution_tool_result`.
   */
  public data object TextEditorCodeExecutionToolResult : InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType() {
    public override val `value`: String = "text_editor_code_execution_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType = when (value) {
      TextEditorCodeExecutionToolResult.value -> TextEditorCodeExecutionToolResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
