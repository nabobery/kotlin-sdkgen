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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatContentAudio/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatContentAudioPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatContentAudioPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_audio`.
   */
  public data object InputAudio : InlineComponentsSchemasChatContentAudioPropertiesType() {
    public override val `value`: String = "input_audio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatContentAudioPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatContentAudioPropertiesType = when (value) {
      InputAudio.value -> InputAudio
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatContentAudioPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatContentAudioPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatContentAudioPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatContentAudioPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
