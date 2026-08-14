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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCall/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCall/properties/type
 */
@Serializable(with = InlineOpenAiResponseCustomToolCallTypeX82b88241.Serializer::class)
public sealed class InlineOpenAiResponseCustomToolCallTypeX82b88241 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `custom_tool_call`.
   */
  public data object CustomToolCall : InlineOpenAiResponseCustomToolCallTypeX82b88241() {
    public override val `value`: String = "custom_tool_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponseCustomToolCallTypeX82b88241()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponseCustomToolCallTypeX82b88241 = when (value) {
      CustomToolCall.value -> CustomToolCall
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseCustomToolCallTypeX82b88241> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponseCustomToolCallTypeX82b88241", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseCustomToolCallTypeX82b88241 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseCustomToolCallTypeX82b88241) {
      encoder.encodeString(value.value)
    }
  }
}
