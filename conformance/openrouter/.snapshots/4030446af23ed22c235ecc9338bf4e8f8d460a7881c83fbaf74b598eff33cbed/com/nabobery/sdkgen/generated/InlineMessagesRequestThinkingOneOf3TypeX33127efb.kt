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
 * sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/2/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/thinking/oneOf/2/properties/type
 */
@Serializable(with = InlineMessagesRequestThinkingOneOf3TypeX33127efb.Serializer::class)
public sealed class InlineMessagesRequestThinkingOneOf3TypeX33127efb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `adaptive`.
   */
  public data object Adaptive : InlineMessagesRequestThinkingOneOf3TypeX33127efb() {
    public override val `value`: String = "adaptive"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMessagesRequestThinkingOneOf3TypeX33127efb()

  public companion object {
    public fun fromValue(`value`: String): InlineMessagesRequestThinkingOneOf3TypeX33127efb = when (value) {
      Adaptive.value -> Adaptive
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesRequestThinkingOneOf3TypeX33127efb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineMessagesRequestThinkingOneOf3TypeX33127efb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMessagesRequestThinkingOneOf3TypeX33127efb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestThinkingOneOf3TypeX33127efb) {
      encoder.encodeString(value.value)
    }
  }
}
