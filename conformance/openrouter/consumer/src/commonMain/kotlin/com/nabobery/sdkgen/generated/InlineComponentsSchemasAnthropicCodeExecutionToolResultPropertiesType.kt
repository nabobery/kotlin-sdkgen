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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionToolResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_tool_result`.
   */
  public data object CodeExecutionToolResult : InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType() {
    public override val `value`: String = "code_execution_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType =
      when (value) {
      CodeExecutionToolResult.value -> CodeExecutionToolResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCodeExecutionToolResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
