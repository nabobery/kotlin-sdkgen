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
 */
@Serializable(with = InlineComponentsSchemasAnthropicRedactedThinkingBlockPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicRedactedThinkingBlockPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `redacted_thinking`.
   */
  public data object RedactedThinking : InlineComponentsSchemasAnthropicRedactedThinkingBlockPropertiesType() {
    public override val `value`: String = "redacted_thinking"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicRedactedThinkingBlockPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicRedactedThinkingBlockPropertiesType =
      when (value) {
      RedactedThinking.value -> RedactedThinking
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicRedactedThinkingBlockPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicRedactedThinkingBlockPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicRedactedThinkingBlockPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicRedactedThinkingBlockPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
