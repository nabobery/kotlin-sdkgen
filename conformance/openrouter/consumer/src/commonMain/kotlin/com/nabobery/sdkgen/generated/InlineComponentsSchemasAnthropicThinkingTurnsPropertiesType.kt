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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicThinkingTurns/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `thinking_turns`.
   */
  public data object ThinkingTurns : InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType() {
    public override val `value`: String = "thinking_turns"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType = when (value) {
      ThinkingTurns.value -> ThinkingTurns
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasAnthropicThinkingTurnsPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
