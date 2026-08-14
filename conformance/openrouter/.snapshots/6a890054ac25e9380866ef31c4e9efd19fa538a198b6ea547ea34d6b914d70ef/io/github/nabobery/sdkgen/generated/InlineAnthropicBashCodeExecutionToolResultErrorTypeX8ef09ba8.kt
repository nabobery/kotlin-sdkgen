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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionToolResultError/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionToolResultError/properties/type
 */
@Serializable(with = InlineAnthropicBashCodeExecutionToolResultErrorTypeX8ef09ba8.Serializer::class)
public sealed class InlineAnthropicBashCodeExecutionToolResultErrorTypeX8ef09ba8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bash_code_execution_tool_result_error`.
   */
  public data object BashCodeExecutionToolResultError : InlineAnthropicBashCodeExecutionToolResultErrorTypeX8ef09ba8() {
    public override val `value`: String = "bash_code_execution_tool_result_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicBashCodeExecutionToolResultErrorTypeX8ef09ba8()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicBashCodeExecutionToolResultErrorTypeX8ef09ba8 = when (value) {
      BashCodeExecutionToolResultError.value -> BashCodeExecutionToolResultError
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicBashCodeExecutionToolResultErrorTypeX8ef09ba8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicBashCodeExecutionToolResultErrorTypeX8ef09ba8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicBashCodeExecutionToolResultErrorTypeX8ef09ba8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicBashCodeExecutionToolResultErrorTypeX8ef09ba8) {
      encoder.encodeString(value.value)
    }
  }
}
