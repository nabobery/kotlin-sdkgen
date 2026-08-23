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
 * sdkgen://source/openapi.yaml#/components/schemas/ORAnthropicServerToolUseBlock/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ORAnthropicServerToolUseBlock/properties/type
 */
@Serializable(with = InlineOrAnthropicServerToolUseBlockTypeX72973005.Serializer::class)
public sealed class InlineOrAnthropicServerToolUseBlockTypeX72973005 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `server_tool_use`.
   */
  public data object ServerToolUse : InlineOrAnthropicServerToolUseBlockTypeX72973005() {
    public override val `value`: String = "server_tool_use"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrAnthropicServerToolUseBlockTypeX72973005()

  public companion object {
    public fun fromValue(`value`: String): InlineOrAnthropicServerToolUseBlockTypeX72973005 = when (value) {
      ServerToolUse.value -> ServerToolUse
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrAnthropicServerToolUseBlockTypeX72973005> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOrAnthropicServerToolUseBlockTypeX72973005", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrAnthropicServerToolUseBlockTypeX72973005 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrAnthropicServerToolUseBlockTypeX72973005) {
      encoder.encodeString(value.value)
    }
  }
}
