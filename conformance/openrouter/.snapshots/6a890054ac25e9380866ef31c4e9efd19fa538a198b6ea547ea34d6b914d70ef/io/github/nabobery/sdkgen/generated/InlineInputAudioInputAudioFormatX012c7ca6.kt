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
 * sdkgen://source/openapi.yaml#/components/schemas/InputAudio/properties/input_audio/properties/format.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputAudio/properties/input_audio/properties/format
 */
@Serializable(with = InlineInputAudioInputAudioFormatX012c7ca6.Serializer::class)
public sealed class InlineInputAudioInputAudioFormatX012c7ca6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mp3`.
   */
  public data object Mp3 : InlineInputAudioInputAudioFormatX012c7ca6() {
    public override val `value`: String = "mp3"
  }

  /**
   * Documented value. Wire value: `wav`.
   */
  public data object Wav : InlineInputAudioInputAudioFormatX012c7ca6() {
    public override val `value`: String = "wav"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputAudioInputAudioFormatX012c7ca6()

  public companion object {
    public fun fromValue(`value`: String): InlineInputAudioInputAudioFormatX012c7ca6 = when (value) {
      Mp3.value -> Mp3
      Wav.value -> Wav
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputAudioInputAudioFormatX012c7ca6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineInputAudioInputAudioFormatX012c7ca6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputAudioInputAudioFormatX012c7ca6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputAudioInputAudioFormatX012c7ca6) {
      encoder.encodeString(value.value)
    }
  }
}
