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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecutionOutput/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCodeExecutionOutputPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCodeExecutionOutputPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_output`.
   */
  public data object CodeExecutionOutput : InlineComponentsSchemasAnthropicCodeExecutionOutputPropertiesType() {
    public override val `value`: String = "code_execution_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCodeExecutionOutputPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCodeExecutionOutputPropertiesType =
      when (value) {
      CodeExecutionOutput.value -> CodeExecutionOutput
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCodeExecutionOutputPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCodeExecutionOutputPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCodeExecutionOutputPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCodeExecutionOutputPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
