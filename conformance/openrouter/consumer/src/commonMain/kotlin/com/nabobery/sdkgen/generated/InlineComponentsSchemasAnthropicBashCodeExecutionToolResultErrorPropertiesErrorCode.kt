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
 */
@Serializable(with = InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode
  .Serializer::class)
public sealed class InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invalid_tool_input`.
   */
  public data object InvalidToolInput : InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "invalid_tool_input"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `too_many_requests`.
   */
  public data object TooManyRequests : InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "too_many_requests"
  }

  /**
   * Documented value. Wire value: `execution_time_exceeded`.
   */
  public data object ExecutionTimeExceeded : InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "execution_time_exceeded"
  }

  /**
   * Documented value. Wire value: `output_file_too_large`.
   */
  public data object OutputFileTooLarge : InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "output_file_too_large"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode = when (value) {
      InvalidToolInput.value -> InvalidToolInput
      Unavailable.value -> Unavailable
      TooManyRequests.value -> TooManyRequests
      ExecutionTimeExceeded.value -> ExecutionTimeExceeded
      OutputFileTooLarge.value -> OutputFileTooLarge
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicBashCodeExecutionToolResultErrorPropertiesErrorCode) {
      encoder.encodeString(value.value)
    }
  }
}
