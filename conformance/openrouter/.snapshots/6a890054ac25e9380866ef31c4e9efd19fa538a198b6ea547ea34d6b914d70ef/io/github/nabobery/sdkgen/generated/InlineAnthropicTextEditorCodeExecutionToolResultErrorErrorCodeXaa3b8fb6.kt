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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResultError/properties/error_cod
 * e.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicTextEditorCodeExecutionToolResultError/properties/error_cod
 * e
 */
@Serializable(with = InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6.Serializer::class)
public sealed class InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invalid_tool_input`.
   */
  public data object InvalidToolInput : InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6() {
    public override val `value`: String = "invalid_tool_input"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `too_many_requests`.
   */
  public data object TooManyRequests : InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6() {
    public override val `value`: String = "too_many_requests"
  }

  /**
   * Documented value. Wire value: `execution_time_exceeded`.
   */
  public data object ExecutionTimeExceeded : InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6() {
    public override val `value`: String = "execution_time_exceeded"
  }

  /**
   * Documented value. Wire value: `file_not_found`.
   */
  public data object FileNotFound : InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6() {
    public override val `value`: String = "file_not_found"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6 = when (value) {
      InvalidToolInput.value -> InvalidToolInput
      Unavailable.value -> Unavailable
      TooManyRequests.value -> TooManyRequests
      ExecutionTimeExceeded.value -> ExecutionTimeExceeded
      FileNotFound.value -> FileNotFound
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicTextEditorCodeExecutionToolResultErrorErrorCodeXaa3b8fb6) {
      encoder.encodeString(value.value)
    }
  }
}
