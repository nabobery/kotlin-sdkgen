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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionOutput/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicBashCodeExecutionOutputPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicBashCodeExecutionOutputPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bash_code_execution_output`.
   */
  public data object BashCodeExecutionOutput : InlineComponentsSchemasAnthropicBashCodeExecutionOutputPropertiesType() {
    public override val `value`: String = "bash_code_execution_output"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicBashCodeExecutionOutputPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicBashCodeExecutionOutputPropertiesType =
      when (value) {
      BashCodeExecutionOutput.value -> BashCodeExecutionOutput
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicBashCodeExecutionOutputPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicBashCodeExecutionOutputPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicBashCodeExecutionOutputPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicBashCodeExecutionOutputPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
