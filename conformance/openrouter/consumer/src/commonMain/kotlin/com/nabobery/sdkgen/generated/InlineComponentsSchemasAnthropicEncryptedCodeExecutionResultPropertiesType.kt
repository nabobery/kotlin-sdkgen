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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicEncryptedCodeExecutionResult/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `encrypted_code_execution_result`.
   */
  public data object EncryptedCodeExecutionResult : InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType() {
    public override val `value`: String = "encrypted_code_execution_result"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType =
      when (value) {
      EncryptedCodeExecutionResult.value -> EncryptedCodeExecutionResult
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicEncryptedCodeExecutionResultPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
