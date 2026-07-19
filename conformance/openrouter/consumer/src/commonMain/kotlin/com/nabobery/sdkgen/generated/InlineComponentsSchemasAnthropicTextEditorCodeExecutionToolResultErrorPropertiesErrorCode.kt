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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResultError/properties/error_cod
 * e.
 */
@Serializable(with = InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode
  .Serializer::class)
public sealed class InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invalid_tool_input`.
   */
  public data object InvalidToolInput : InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "invalid_tool_input"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `too_many_requests`.
   */
  public data object TooManyRequests : InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "too_many_requests"
  }

  /**
   * Documented value. Wire value: `execution_time_exceeded`.
   */
  public data object ExecutionTimeExceeded : InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "execution_time_exceeded"
  }

  /**
   * Documented value. Wire value: `file_not_found`.
   */
  public data object FileNotFound : InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode() {
    public override val `value`: String = "file_not_found"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode = when (value) {
      InvalidToolInput.value -> InvalidToolInput
      Unavailable.value -> Unavailable
      TooManyRequests.value -> TooManyRequests
      ExecutionTimeExceeded.value -> ExecutionTimeExceeded
      FileNotFound.value -> FileNotFound
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicTextEditorCodeExecutionToolResultErrorPropertiesErrorCode) {
      encoder.encodeString(value.value)
    }
  }
}
