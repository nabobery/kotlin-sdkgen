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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionToolResult/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionToolResult/properties/type
 */
@Serializable(with = InlineAnthropicCodeExecutionToolResultTypeXa2888711.Serializer::class)
public sealed class InlineAnthropicCodeExecutionToolResultTypeXa2888711 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_tool_result`.
   */
  public data object CodeExecutionToolResult : InlineAnthropicCodeExecutionToolResultTypeXa2888711() {
    public override val `value`: String = "code_execution_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCodeExecutionToolResultTypeXa2888711()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCodeExecutionToolResultTypeXa2888711 = when (value) {
      CodeExecutionToolResult.value -> CodeExecutionToolResult
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCodeExecutionToolResultTypeXa2888711> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCodeExecutionToolResultTypeXa2888711", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCodeExecutionToolResultTypeXa2888711 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCodeExecutionToolResultTypeXa2888711) {
      encoder.encodeString(value.value)
    }
  }
}
