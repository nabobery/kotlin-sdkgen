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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/type
 */
@Serializable(with = InlineOutputMessageTypeXba66a1d6.Serializer::class)
public sealed class InlineOutputMessageTypeXba66a1d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineOutputMessageTypeXba66a1d6() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputMessageTypeXba66a1d6()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputMessageTypeXba66a1d6 = when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputMessageTypeXba66a1d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputMessageTypeXba66a1d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputMessageTypeXba66a1d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputMessageTypeXba66a1d6) {
      encoder.encodeString(value.value)
    }
  }
}
