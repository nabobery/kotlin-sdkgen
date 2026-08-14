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
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseInputMessageItem/properties/type
 */
@Serializable(with = InlineOpenAiResponseInputMessageItemTypeX5c4fbad8.Serializer::class)
public sealed class InlineOpenAiResponseInputMessageItemTypeX5c4fbad8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineOpenAiResponseInputMessageItemTypeX5c4fbad8() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiResponseInputMessageItemTypeX5c4fbad8()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiResponseInputMessageItemTypeX5c4fbad8 = when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseInputMessageItemTypeX5c4fbad8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOpenAiResponseInputMessageItemTypeX5c4fbad8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseInputMessageItemTypeX5c4fbad8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseInputMessageItemTypeX5c4fbad8) {
      encoder.encodeString(value.value)
    }
  }
}
