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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputAudio/properties/type.
 */
@Serializable(with = InlineComponentsSchemasContentPartInputAudioPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasContentPartInputAudioPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_audio`.
   */
  public data object InputAudio : InlineComponentsSchemasContentPartInputAudioPropertiesType() {
    public override val `value`: String = "input_audio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContentPartInputAudioPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContentPartInputAudioPropertiesType = when (value) {
      InputAudio.value -> InputAudio
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContentPartInputAudioPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContentPartInputAudioPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContentPartInputAudioPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContentPartInputAudioPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
