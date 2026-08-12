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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatContentAudio/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatContentAudio/properties/type
 */
@Serializable(with = InlineChatContentAudioTypeXb902f56b.Serializer::class)
public sealed class InlineChatContentAudioTypeXb902f56b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_audio`.
   */
  public data object InputAudio : InlineChatContentAudioTypeXb902f56b() {
    public override val `value`: String = "input_audio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineChatContentAudioTypeXb902f56b()

  public companion object {
    public fun fromValue(`value`: String): InlineChatContentAudioTypeXb902f56b = when (value) {
      InputAudio.value -> InputAudio
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineChatContentAudioTypeXb902f56b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineChatContentAudioTypeXb902f56b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineChatContentAudioTypeXb902f56b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineChatContentAudioTypeXb902f56b) {
      encoder.encodeString(value.value)
    }
  }
}
