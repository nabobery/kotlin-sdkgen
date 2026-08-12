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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicThinkingBlock/properties/type
 */
@Serializable(with = InlineAnthropicThinkingBlockTypeX4f592c6b.Serializer::class)
public sealed class InlineAnthropicThinkingBlockTypeX4f592c6b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `thinking`.
   */
  public data object Thinking : InlineAnthropicThinkingBlockTypeX4f592c6b() {
    public override val `value`: String = "thinking"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicThinkingBlockTypeX4f592c6b()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicThinkingBlockTypeX4f592c6b = when (value) {
      Thinking.value -> Thinking
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicThinkingBlockTypeX4f592c6b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicThinkingBlockTypeX4f592c6b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicThinkingBlockTypeX4f592c6b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicThinkingBlockTypeX4f592c6b) {
      encoder.encodeString(value.value)
    }
  }
}
