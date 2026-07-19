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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionToolResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bash_code_execution_tool_result`.
   */
  public data object BashCodeExecutionToolResult : InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType() {
    public override val `value`: String = "bash_code_execution_tool_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType =
      when (value) {
      BashCodeExecutionToolResult.value -> BashCodeExecutionToolResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicBashCodeExecutionToolResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
