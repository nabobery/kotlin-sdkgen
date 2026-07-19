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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicBashCodeExecutionResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bash_code_execution_result`.
   */
  public data object BashCodeExecutionResult : InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType() {
    public override val `value`: String = "bash_code_execution_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType =
      when (value) {
      BashCodeExecutionResult.value -> BashCodeExecutionResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicBashCodeExecutionResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
