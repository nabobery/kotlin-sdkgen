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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicThinkingTurns/properties/type
 */
@Serializable(with = InlineAnthropicThinkingTurnsTypeXfd701969.Serializer::class)
public sealed class InlineAnthropicThinkingTurnsTypeXfd701969 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `thinking_turns`.
   */
  public data object ThinkingTurns : InlineAnthropicThinkingTurnsTypeXfd701969() {
    public override val `value`: String = "thinking_turns"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicThinkingTurnsTypeXfd701969()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicThinkingTurnsTypeXfd701969 = when (value) {
      ThinkingTurns.value -> ThinkingTurns
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicThinkingTurnsTypeXfd701969> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicThinkingTurnsTypeXfd701969", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicThinkingTurnsTypeXfd701969 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicThinkingTurnsTypeXfd701969) {
      encoder.encodeString(value.value)
    }
  }
}
