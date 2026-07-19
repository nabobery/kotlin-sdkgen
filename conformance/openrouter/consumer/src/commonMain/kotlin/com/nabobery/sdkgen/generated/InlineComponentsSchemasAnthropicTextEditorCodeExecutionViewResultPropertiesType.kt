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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionViewResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_code_execution_view_result`.
   */
  public data object TextEditorCodeExecutionViewResult : InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType() {
    public override val `value`: String = "text_editor_code_execution_view_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType = when (value) {
      TextEditorCodeExecutionViewResult.value -> TextEditorCodeExecutionViewResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicTextEditorCodeExecutionViewResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
