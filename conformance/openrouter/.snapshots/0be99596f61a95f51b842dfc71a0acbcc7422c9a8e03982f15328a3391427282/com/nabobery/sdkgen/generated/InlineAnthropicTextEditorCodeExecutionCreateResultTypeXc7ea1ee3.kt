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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionCreateResult/properties/type
 */
@Serializable(with = InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3.Serializer::class)
public sealed class InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text_editor_code_execution_create_result`.
   */
  public data object TextEditorCodeExecutionCreateResult : InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3() {
    public override val `value`: String = "text_editor_code_execution_create_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3 = when (value) {
      TextEditorCodeExecutionCreateResult.value -> TextEditorCodeExecutionCreateResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicTextEditorCodeExecutionCreateResultTypeXc7ea1ee3) {
      encoder.encodeString(value.value)
    }
  }
}
