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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecution20250825Caller/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_20250825`.
   */
  public data object CodeExecution20250825 : InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType() {
    public override val `value`: String = "code_execution_20250825"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType =
      when (value) {
      CodeExecution20250825.value -> CodeExecution20250825
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCodeExecution20250825CallerPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
