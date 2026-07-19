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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicInputTokensTrigger/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_tokens`.
   */
  public data object InputTokens : InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType() {
    public override val `value`: String = "input_tokens"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType =
      when (value) {
      InputTokens.value -> InputTokens
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicInputTokensTriggerPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
