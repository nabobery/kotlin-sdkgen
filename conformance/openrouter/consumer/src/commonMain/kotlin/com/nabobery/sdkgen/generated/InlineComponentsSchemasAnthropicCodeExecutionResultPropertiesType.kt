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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_result`.
   */
  public data object CodeExecutionResult : InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType() {
    public override val `value`: String = "code_execution_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType =
      when (value) {
      CodeExecutionResult.value -> CodeExecutionResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCodeExecutionResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
