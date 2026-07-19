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
 * sdkgen://source/openapi.yaml#/components/schemas/InputAudio/properties/input_audio/properties/format.
 */
@Serializable(with = InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat.Serializer::class)
public sealed class InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mp3`.
   */
  public data object Mp3 : InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat() {
    public override val `value`: String = "mp3"
  }

  /**
   * Documented value. Wire value: `wav`.
   */
  public data object Wav : InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat() {
    public override val `value`: String = "wav"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat =
      when (value) {
      Mp3.value -> Mp3
      Wav.value -> Wav
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasInputAudioPropertiesInputAudioPropertiesFormat) {
      encoder.encodeString(value.value)
    }
  }
}
