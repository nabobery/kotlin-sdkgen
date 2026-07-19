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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicThinkingBlock/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicThinkingBlockPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicThinkingBlockPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `thinking`.
   */
  public data object Thinking : InlineComponentsSchemasAnthropicThinkingBlockPropertiesType() {
    public override val `value`: String = "thinking"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicThinkingBlockPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicThinkingBlockPropertiesType = when (value) {
      Thinking.value -> Thinking
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicThinkingBlockPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicThinkingBlockPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicThinkingBlockPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicThinkingBlockPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
