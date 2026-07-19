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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCodeExecution20260120Caller/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_execution_20260120`.
   */
  public data object CodeExecution20260120 : InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType() {
    public override val `value`: String = "code_execution_20260120"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType =
      when (value) {
      CodeExecution20260120.value -> CodeExecution20260120
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCodeExecution20260120CallerPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
