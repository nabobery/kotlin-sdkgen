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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionToolResultError/properties/error_code.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionToolResultError/properties/error_code
 */
@Serializable(with = InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a.Serializer::class)
public sealed class InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invalid_tool_input`.
   */
  public data object InvalidToolInput : InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a() {
    public override val `value`: String = "invalid_tool_input"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `too_many_requests`.
   */
  public data object TooManyRequests : InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a() {
    public override val `value`: String = "too_many_requests"
  }

  /**
   * Documented value. Wire value: `execution_time_exceeded`.
   */
  public data object ExecutionTimeExceeded : InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a() {
    public override val `value`: String = "execution_time_exceeded"
  }

  /**
   * Documented value. Wire value: `output_file_too_large`.
   */
  public data object OutputFileTooLarge : InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a() {
    public override val `value`: String = "output_file_too_large"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a = when (value) {
      InvalidToolInput.value -> InvalidToolInput
      Unavailable.value -> Unavailable
      TooManyRequests.value -> TooManyRequests
      ExecutionTimeExceeded.value -> ExecutionTimeExceeded
      OutputFileTooLarge.value -> OutputFileTooLarge
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicBashCodeExecutionToolResultErrorErrorCodeX9aca0d5a) {
      encoder.encodeString(value.value)
    }
  }
}
