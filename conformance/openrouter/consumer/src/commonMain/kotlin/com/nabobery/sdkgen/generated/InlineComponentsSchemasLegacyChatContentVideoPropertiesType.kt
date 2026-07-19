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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/Legacy_ChatContentVideo/properties/type.
 */
@Serializable(with = InlineComponentsSchemasLegacyChatContentVideoPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasLegacyChatContentVideoPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_video`.
   */
  public data object InputVideo : InlineComponentsSchemasLegacyChatContentVideoPropertiesType() {
    public override val `value`: String = "input_video"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasLegacyChatContentVideoPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasLegacyChatContentVideoPropertiesType = when (value) {
      InputVideo.value -> InputVideo
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasLegacyChatContentVideoPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasLegacyChatContentVideoPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasLegacyChatContentVideoPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasLegacyChatContentVideoPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
