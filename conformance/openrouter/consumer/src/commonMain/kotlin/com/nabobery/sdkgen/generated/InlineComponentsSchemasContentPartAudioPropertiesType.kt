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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartAudio/properties/type.
 */
@Serializable(with = InlineComponentsSchemasContentPartAudioPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasContentPartAudioPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `audio_url`.
   */
  public data object AudioUrl : InlineComponentsSchemasContentPartAudioPropertiesType() {
    public override val `value`: String = "audio_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContentPartAudioPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContentPartAudioPropertiesType = when (value) {
      AudioUrl.value -> AudioUrl
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContentPartAudioPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContentPartAudioPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContentPartAudioPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContentPartAudioPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
