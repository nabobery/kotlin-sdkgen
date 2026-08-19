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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCall/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCall/properties/type
 */
@Serializable(with = InlineOpenAiResponseFunctionToolCallTypeXef7600c6.Serializer::class)
public sealed class InlineOpenAiResponseFunctionToolCallTypeXef7600c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function_call`.
   */
  public data object FunctionCall : InlineOpenAiResponseFunctionToolCallTypeXef7600c6() {
    public override val `value`: String = "function_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponseFunctionToolCallTypeXef7600c6()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponseFunctionToolCallTypeXef7600c6 = when (value) {
      FunctionCall.value -> FunctionCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseFunctionToolCallTypeXef7600c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiResponseFunctionToolCallTypeXef7600c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseFunctionToolCallTypeXef7600c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseFunctionToolCallTypeXef7600c6) {
      encoder.encodeString(value.value)
    }
  }
}
