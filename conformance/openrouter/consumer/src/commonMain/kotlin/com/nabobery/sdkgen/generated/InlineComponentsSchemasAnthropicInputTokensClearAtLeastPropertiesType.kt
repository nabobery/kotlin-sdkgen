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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicInputTokensClearAtLeast/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicInputTokensClearAtLeastPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicInputTokensClearAtLeastPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_tokens`.
   */
  public data object InputTokens : InlineComponentsSchemasAnthropicInputTokensClearAtLeastPropertiesType() {
    public override val `value`: String = "input_tokens"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicInputTokensClearAtLeastPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicInputTokensClearAtLeastPropertiesType =
      when (value) {
      InputTokens.value -> InputTokens
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicInputTokensClearAtLeastPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicInputTokensClearAtLeastPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicInputTokensClearAtLeastPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicInputTokensClearAtLeastPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
