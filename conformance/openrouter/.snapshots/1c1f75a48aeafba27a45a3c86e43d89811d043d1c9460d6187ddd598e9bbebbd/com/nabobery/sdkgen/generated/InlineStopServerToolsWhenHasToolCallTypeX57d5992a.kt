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
 * sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenHasToolCall/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StopServerToolsWhenHasToolCall/properties/type
 */
@Serializable(with = InlineStopServerToolsWhenHasToolCallTypeX57d5992a.Serializer::class)
public sealed class InlineStopServerToolsWhenHasToolCallTypeX57d5992a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `has_tool_call`.
   */
  public data object HasToolCall : InlineStopServerToolsWhenHasToolCallTypeX57d5992a() {
    public override val `value`: String = "has_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineStopServerToolsWhenHasToolCallTypeX57d5992a()

  public companion object {
    public fun fromValue(`value`: String): InlineStopServerToolsWhenHasToolCallTypeX57d5992a = when (value) {
      HasToolCall.value -> HasToolCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineStopServerToolsWhenHasToolCallTypeX57d5992a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineStopServerToolsWhenHasToolCallTypeX57d5992a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineStopServerToolsWhenHasToolCallTypeX57d5992a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineStopServerToolsWhenHasToolCallTypeX57d5992a) {
      encoder.encodeString(value.value)
    }
  }
}
