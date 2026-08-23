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
 * Audio output format
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/SpeechRequest/properties/response_format
 */
@Serializable(with = InlineSpeechRequestResponseFormatX95a6cd91.Serializer::class)
public sealed class InlineSpeechRequestResponseFormatX95a6cd91 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mp3`.
   */
  public data object Mp3 : InlineSpeechRequestResponseFormatX95a6cd91() {
    public override val `value`: String = "mp3"
  }

  /**
   * Documented value. Wire value: `pcm`.
   */
  public data object Pcm : InlineSpeechRequestResponseFormatX95a6cd91() {
    public override val `value`: String = "pcm"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSpeechRequestResponseFormatX95a6cd91()

  public companion object {
    public fun fromValue(`value`: String): InlineSpeechRequestResponseFormatX95a6cd91 = when (value) {
      Mp3.value -> Mp3
      Pcm.value -> Pcm
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSpeechRequestResponseFormatX95a6cd91> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineSpeechRequestResponseFormatX95a6cd91", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSpeechRequestResponseFormatX95a6cd91 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSpeechRequestResponseFormatX95a6cd91) {
      encoder.encodeString(value.value)
    }
  }
}
