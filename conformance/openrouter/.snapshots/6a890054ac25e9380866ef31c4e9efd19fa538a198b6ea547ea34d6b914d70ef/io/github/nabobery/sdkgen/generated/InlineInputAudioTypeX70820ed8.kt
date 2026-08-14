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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputAudio/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/InputAudio/properties/type
 */
@Serializable(with = InlineInputAudioTypeX70820ed8.Serializer::class)
public sealed class InlineInputAudioTypeX70820ed8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_audio`.
   */
  public data object InputAudio : InlineInputAudioTypeX70820ed8() {
    public override val `value`: String = "input_audio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInputAudioTypeX70820ed8()

  public companion object {
    public fun fromValue(`value`: String): InlineInputAudioTypeX70820ed8 = when (value) {
      InputAudio.value -> InputAudio
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInputAudioTypeX70820ed8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineInputAudioTypeX70820ed8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInputAudioTypeX70820ed8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInputAudioTypeX70820ed8) {
      encoder.encodeString(value.value)
    }
  }
}
