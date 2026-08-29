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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatContentFile/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentFile/properties/type
 */
@Serializable(with = InlineChatContentFileTypeX2b25f967.Serializer::class)
public sealed class InlineChatContentFileTypeX2b25f967 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineChatContentFileTypeX2b25f967() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatContentFileTypeX2b25f967()

  public companion object {
    public fun fromValue(`value`: String): InlineChatContentFileTypeX2b25f967 = when (value) {
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatContentFileTypeX2b25f967> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatContentFileTypeX2b25f967", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatContentFileTypeX2b25f967 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatContentFileTypeX2b25f967) {
      encoder.encodeString(value.value)
    }
  }
}
