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
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function_call`.
   */
  public data object FunctionCall : InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType() {
    public override val `value`: String = "function_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType =
      when (value) {
      FunctionCall.value -> FunctionCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponseFunctionToolCallPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
