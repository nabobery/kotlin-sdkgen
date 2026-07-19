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
 */
@Serializable(with = InlineComponentsSchemasSpeechRequestPropertiesResponseFormat.Serializer::class)
public sealed class InlineComponentsSchemasSpeechRequestPropertiesResponseFormat {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `mp3`.
   */
  public data object Mp3 : InlineComponentsSchemasSpeechRequestPropertiesResponseFormat() {
    public override val `value`: String = "mp3"
  }

  /**
   * Documented value. Wire value: `pcm`.
   */
  public data object Pcm : InlineComponentsSchemasSpeechRequestPropertiesResponseFormat() {
    public override val `value`: String = "pcm"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasSpeechRequestPropertiesResponseFormat()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasSpeechRequestPropertiesResponseFormat = when (value) {
      Mp3.value -> Mp3
      Pcm.value -> Pcm
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasSpeechRequestPropertiesResponseFormat> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasSpeechRequestPropertiesResponseFormat", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasSpeechRequestPropertiesResponseFormat =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasSpeechRequestPropertiesResponseFormat) {
      encoder.encodeString(value.value)
    }
  }
}
