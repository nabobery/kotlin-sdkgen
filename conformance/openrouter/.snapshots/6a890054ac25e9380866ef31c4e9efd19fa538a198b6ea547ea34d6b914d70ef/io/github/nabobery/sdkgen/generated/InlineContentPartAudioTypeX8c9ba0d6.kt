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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartAudio/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartAudio/properties/type
 */
@Serializable(with = InlineContentPartAudioTypeX8c9ba0d6.Serializer::class)
public sealed class InlineContentPartAudioTypeX8c9ba0d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `audio_url`.
   */
  public data object AudioUrl : InlineContentPartAudioTypeX8c9ba0d6() {
    public override val `value`: String = "audio_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentPartAudioTypeX8c9ba0d6()

  public companion object {
    public fun fromValue(`value`: String): InlineContentPartAudioTypeX8c9ba0d6 = when (value) {
      AudioUrl.value -> AudioUrl
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContentPartAudioTypeX8c9ba0d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineContentPartAudioTypeX8c9ba0d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentPartAudioTypeX8c9ba0d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentPartAudioTypeX8c9ba0d6) {
      encoder.encodeString(value.value)
    }
  }
}
