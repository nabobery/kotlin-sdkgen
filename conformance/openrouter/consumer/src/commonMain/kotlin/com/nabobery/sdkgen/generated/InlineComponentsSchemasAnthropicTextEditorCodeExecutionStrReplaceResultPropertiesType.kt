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
 */
@Serializable(with = InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_code_execution_str_replace_result`.
   */
  public data object TextEditorCodeExecutionStrReplaceResult : InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType() {
    public override val `value`: String = "text_editor_code_execution_str_replace_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType = when (value) {
      TextEditorCodeExecutionStrReplaceResult.value -> TextEditorCodeExecutionStrReplaceResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicTextEditorCodeExecutionStrReplaceResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
