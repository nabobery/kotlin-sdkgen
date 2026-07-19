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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicServerToolErrorCode.
 */
@Serializable(with = AnthropicServerToolErrorCode.Serializer::class)
public sealed class AnthropicServerToolErrorCode {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invalid_tool_input`.
   */
  public data object InvalidToolInput : AnthropicServerToolErrorCode() {
    public override val `value`: String = "invalid_tool_input"
  }

  /**
   * Documented value. Wire value: `unavailable`.
   */
  public data object Unavailable : AnthropicServerToolErrorCode() {
    public override val `value`: String = "unavailable"
  }

  /**
   * Documented value. Wire value: `too_many_requests`.
   */
  public data object TooManyRequests : AnthropicServerToolErrorCode() {
    public override val `value`: String = "too_many_requests"
  }

  /**
   * Documented value. Wire value: `execution_time_exceeded`.
   */
  public data object ExecutionTimeExceeded : AnthropicServerToolErrorCode() {
    public override val `value`: String = "execution_time_exceeded"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : AnthropicServerToolErrorCode()

  public companion object {
    public fun fromValue(`value`: String): AnthropicServerToolErrorCode = when (value) {
      InvalidToolInput.value -> InvalidToolInput
      Unavailable.value -> Unavailable
      TooManyRequests.value -> TooManyRequests
      ExecutionTimeExceeded.value -> ExecutionTimeExceeded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<AnthropicServerToolErrorCode> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.AnthropicServerToolErrorCode", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): AnthropicServerToolErrorCode = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: AnthropicServerToolErrorCode) {
      encoder.encodeString(value.value)
    }
  }
}
