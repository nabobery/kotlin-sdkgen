package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicInputTokensTrigger/properties/type
 */
@Serializable(with = InlineAnthropicInputTokensTriggerTypeX8451559b.Serializer::class)
public sealed class InlineAnthropicInputTokensTriggerTypeX8451559b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_tokens`.
   */
  public data object InputTokens : InlineAnthropicInputTokensTriggerTypeX8451559b() {
    public override val `value`: String = "input_tokens"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicInputTokensTriggerTypeX8451559b()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicInputTokensTriggerTypeX8451559b = when (value) {
      InputTokens.value -> InputTokens
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicInputTokensTriggerTypeX8451559b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicInputTokensTriggerTypeX8451559b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicInputTokensTriggerTypeX8451559b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicInputTokensTriggerTypeX8451559b) {
      encoder.encodeString(value.value)
    }
  }
}
