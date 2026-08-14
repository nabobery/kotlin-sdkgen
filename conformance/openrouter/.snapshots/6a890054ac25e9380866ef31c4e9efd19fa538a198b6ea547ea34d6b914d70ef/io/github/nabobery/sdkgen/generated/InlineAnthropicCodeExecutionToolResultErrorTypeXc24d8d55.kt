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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionToolResultError/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionToolResultError/properties/type
 */
@Serializable(with = InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55.Serializer::class)
public sealed class InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_tool_result_error`.
   */
  public data object CodeExecutionToolResultError : InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55() {
    public override val `value`: String = "code_execution_tool_result_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55 = when (value) {
      CodeExecutionToolResultError.value -> CodeExecutionToolResultError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCodeExecutionToolResultErrorTypeXc24d8d55) {
      encoder.encodeString(value.value)
    }
  }
}
