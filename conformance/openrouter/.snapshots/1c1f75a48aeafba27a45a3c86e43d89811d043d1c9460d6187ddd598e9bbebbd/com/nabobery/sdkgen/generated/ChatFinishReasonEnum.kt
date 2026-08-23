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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatFinishReasonEnum.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFinishReasonEnum
 */
@Serializable(with = ChatFinishReasonEnum.Serializer::class)
public sealed class ChatFinishReasonEnum {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_calls`.
   */
  public data object ToolCalls : ChatFinishReasonEnum() {
    public override val `value`: String = "tool_calls"
  }

  /**
   * Documented value. Wire value: `stop`.
   */
  public data object Stop : ChatFinishReasonEnum() {
    public override val `value`: String = "stop"
  }

  /**
   * Documented value. Wire value: `length`.
   */
  public data object Length : ChatFinishReasonEnum() {
    public override val `value`: String = "length"
  }

  /**
   * Documented value. Wire value: `content_filter`.
   */
  public data object ContentFilter : ChatFinishReasonEnum() {
    public override val `value`: String = "content_filter"
  }

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : ChatFinishReasonEnum() {
    public override val `value`: String = "error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : ChatFinishReasonEnum()

  public companion object {
    public fun fromValue(`value`: String): ChatFinishReasonEnum = when (value) {
      ToolCalls.value -> ToolCalls
      Stop.value -> Stop
      Length.value -> Length
      ContentFilter.value -> ContentFilter
      Error.value -> Error
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<ChatFinishReasonEnum> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.ChatFinishReasonEnum", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): ChatFinishReasonEnum = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: ChatFinishReasonEnum) {
      encoder.encodeString(value.value)
    }
  }
}
