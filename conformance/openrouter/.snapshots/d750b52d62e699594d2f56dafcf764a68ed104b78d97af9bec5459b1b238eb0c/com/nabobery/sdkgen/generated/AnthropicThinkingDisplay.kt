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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicThinkingDisplay.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicThinkingDisplay
 */
@Serializable(with = AnthropicThinkingDisplay.Serializer::class)
public sealed class AnthropicThinkingDisplay {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `summarized`.
   */
  public data object Summarized : AnthropicThinkingDisplay() {
    public override val `value`: String = "summarized"
  }

  /**
   * Documented value. Wire value: `omitted`.
   */
  public data object Omitted : AnthropicThinkingDisplay() {
    public override val `value`: String = "omitted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : AnthropicThinkingDisplay()

  public companion object {
    public fun fromValue(`value`: String): AnthropicThinkingDisplay = when (value) {
      Summarized.value -> Summarized
      Omitted.value -> Omitted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<AnthropicThinkingDisplay> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.AnthropicThinkingDisplay", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): AnthropicThinkingDisplay = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: AnthropicThinkingDisplay) {
      encoder.encodeString(value.value)
    }
  }
}
