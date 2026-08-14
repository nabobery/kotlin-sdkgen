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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputAudio/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputAudio/properties/type
 */
@Serializable(with = InlineContentPartInputAudioTypeX3a806280.Serializer::class)
public sealed class InlineContentPartInputAudioTypeX3a806280 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_audio`.
   */
  public data object InputAudio : InlineContentPartInputAudioTypeX3a806280() {
    public override val `value`: String = "input_audio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentPartInputAudioTypeX3a806280()

  public companion object {
    public fun fromValue(`value`: String): InlineContentPartInputAudioTypeX3a806280 = when (value) {
      InputAudio.value -> InputAudio
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContentPartInputAudioTypeX3a806280> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineContentPartInputAudioTypeX3a806280", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentPartInputAudioTypeX3a806280 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentPartInputAudioTypeX3a806280) {
      encoder.encodeString(value.value)
    }
  }
}
