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
 * sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailServerToolCall/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ReasoningDetailServerToolCall/properties/type
 */
@Serializable(with = InlineReasoningDetailServerToolCallTypeX5388f950.Serializer::class)
public sealed class InlineReasoningDetailServerToolCallTypeX5388f950 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `reasoning.server_tool_call`.
   */
  public data object ReasoningServerToolCall : InlineReasoningDetailServerToolCallTypeX5388f950() {
    public override val `value`: String = "reasoning.server_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReasoningDetailServerToolCallTypeX5388f950()

  public companion object {
    public fun fromValue(`value`: String): InlineReasoningDetailServerToolCallTypeX5388f950 = when (value) {
      ReasoningServerToolCall.value -> ReasoningServerToolCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReasoningDetailServerToolCallTypeX5388f950> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineReasoningDetailServerToolCallTypeX5388f950", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReasoningDetailServerToolCallTypeX5388f950 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReasoningDetailServerToolCallTypeX5388f950) {
      encoder.encodeString(value.value)
    }
  }
}
