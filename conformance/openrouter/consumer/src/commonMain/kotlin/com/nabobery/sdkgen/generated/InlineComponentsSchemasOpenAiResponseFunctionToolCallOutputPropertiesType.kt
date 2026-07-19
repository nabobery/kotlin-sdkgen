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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseFunctionToolCallOutput/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `function_call_output`.
   */
  public data object FunctionCallOutput : InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType() {
    public override val `value`: String = "function_call_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType =
      when (value) {
      FunctionCallOutput.value -> FunctionCallOutput
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOpenAiResponseFunctionToolCallOutputPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
