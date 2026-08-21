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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionToolResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionToolResult/properties/type
 */
@Serializable(with = InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6.Serializer::class)
public sealed class InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bash_code_execution_tool_result`.
   */
  public data object BashCodeExecutionToolResult : InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6() {
    public override val `value`: String = "bash_code_execution_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6 = when (value) {
      BashCodeExecutionToolResult.value -> BashCodeExecutionToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicBashCodeExecutionToolResultTypeXf5f082e6) {
      encoder.encodeString(value.value)
    }
  }
}
