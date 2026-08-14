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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUseBlock/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicToolUseBlock/properties/type
 */
@Serializable(with = InlineAnthropicToolUseBlockTypeX0d530418.Serializer::class)
public sealed class InlineAnthropicToolUseBlockTypeX0d530418 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tool_use`.
   */
  public data object ToolUse : InlineAnthropicToolUseBlockTypeX0d530418() {
    public override val `value`: String = "tool_use"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicToolUseBlockTypeX0d530418()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicToolUseBlockTypeX0d530418 = when (value) {
      ToolUse.value -> ToolUse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicToolUseBlockTypeX0d530418> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicToolUseBlockTypeX0d530418", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicToolUseBlockTypeX0d530418 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicToolUseBlockTypeX0d530418) {
      encoder.encodeString(value.value)
    }
  }
}
