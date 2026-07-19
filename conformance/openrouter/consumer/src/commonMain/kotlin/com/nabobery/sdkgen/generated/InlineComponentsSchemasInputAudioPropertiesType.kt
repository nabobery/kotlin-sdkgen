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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/InputAudio/properties/type.
 */
@Serializable(with = InlineComponentsSchemasInputAudioPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasInputAudioPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_audio`.
   */
  public data object InputAudio : InlineComponentsSchemasInputAudioPropertiesType() {
    public override val `value`: String = "input_audio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasInputAudioPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasInputAudioPropertiesType = when (value) {
      InputAudio.value -> InputAudio
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasInputAudioPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasInputAudioPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasInputAudioPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasInputAudioPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
