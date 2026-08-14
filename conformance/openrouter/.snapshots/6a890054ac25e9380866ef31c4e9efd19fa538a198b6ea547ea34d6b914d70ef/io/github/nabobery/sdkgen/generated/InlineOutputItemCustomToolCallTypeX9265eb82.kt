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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemCustomToolCall/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemCustomToolCall/properties/type
 */
@Serializable(with = InlineOutputItemCustomToolCallTypeX9265eb82.Serializer::class)
public sealed class InlineOutputItemCustomToolCallTypeX9265eb82 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call`.
   */
  public data object CustomToolCall : InlineOutputItemCustomToolCallTypeX9265eb82() {
    public override val `value`: String = "custom_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputItemCustomToolCallTypeX9265eb82()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputItemCustomToolCallTypeX9265eb82 = when (value) {
      CustomToolCall.value -> CustomToolCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemCustomToolCallTypeX9265eb82> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputItemCustomToolCallTypeX9265eb82", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputItemCustomToolCallTypeX9265eb82 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemCustomToolCallTypeX9265eb82) {
      encoder.encodeString(value.value)
    }
  }
}
