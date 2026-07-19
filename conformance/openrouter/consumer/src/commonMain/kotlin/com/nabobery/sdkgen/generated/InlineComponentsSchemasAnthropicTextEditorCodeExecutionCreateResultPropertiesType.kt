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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionCreateResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_code_execution_create_result`.
   */
  public data object TextEditorCodeExecutionCreateResult : InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType() {
    public override val `value`: String = "text_editor_code_execution_create_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType = when (value) {
      TextEditorCodeExecutionCreateResult.value -> TextEditorCodeExecutionCreateResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicTextEditorCodeExecutionCreateResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
