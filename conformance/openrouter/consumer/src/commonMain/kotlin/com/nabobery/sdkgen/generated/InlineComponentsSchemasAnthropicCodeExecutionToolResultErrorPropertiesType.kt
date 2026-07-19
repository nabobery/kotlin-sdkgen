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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionToolResultError/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_tool_result_error`.
   */
  public data object CodeExecutionToolResultError : InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType() {
    public override val `value`: String = "code_execution_tool_result_error"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType =
      when (value) {
      CodeExecutionToolResultError.value -> CodeExecutionToolResultError
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCodeExecutionToolResultErrorPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
