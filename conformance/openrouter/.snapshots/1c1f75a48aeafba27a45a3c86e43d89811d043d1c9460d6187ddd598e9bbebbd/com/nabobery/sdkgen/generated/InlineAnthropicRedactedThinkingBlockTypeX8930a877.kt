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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicRedactedThinkingBlock/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicRedactedThinkingBlock/properties/type
 */
@Serializable(with = InlineAnthropicRedactedThinkingBlockTypeX8930a877.Serializer::class)
public sealed class InlineAnthropicRedactedThinkingBlockTypeX8930a877 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `redacted_thinking`.
   */
  public data object RedactedThinking : InlineAnthropicRedactedThinkingBlockTypeX8930a877() {
    public override val `value`: String = "redacted_thinking"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicRedactedThinkingBlockTypeX8930a877()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicRedactedThinkingBlockTypeX8930a877 = when (value) {
      RedactedThinking.value -> RedactedThinking
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicRedactedThinkingBlockTypeX8930a877> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicRedactedThinkingBlockTypeX8930a877", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicRedactedThinkingBlockTypeX8930a877 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicRedactedThinkingBlockTypeX8930a877) {
      encoder.encodeString(value.value)
    }
  }
}
