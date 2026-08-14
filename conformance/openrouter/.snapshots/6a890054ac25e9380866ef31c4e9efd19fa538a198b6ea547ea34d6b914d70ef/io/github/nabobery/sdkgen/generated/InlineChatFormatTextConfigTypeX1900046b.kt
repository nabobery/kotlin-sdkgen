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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatFormatTextConfig/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatFormatTextConfig/properties/type
 */
@Serializable(with = InlineChatFormatTextConfigTypeX1900046b.Serializer::class)
public sealed class InlineChatFormatTextConfigTypeX1900046b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineChatFormatTextConfigTypeX1900046b() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatFormatTextConfigTypeX1900046b()

  public companion object {
    public fun fromValue(`value`: String): InlineChatFormatTextConfigTypeX1900046b = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatFormatTextConfigTypeX1900046b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineChatFormatTextConfigTypeX1900046b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatFormatTextConfigTypeX1900046b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatFormatTextConfigTypeX1900046b) {
      encoder.encodeString(value.value)
    }
  }
}
