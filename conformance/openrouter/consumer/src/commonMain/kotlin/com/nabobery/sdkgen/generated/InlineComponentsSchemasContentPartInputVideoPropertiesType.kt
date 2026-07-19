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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartInputVideo/properties/type.
 */
@Serializable(with = InlineComponentsSchemasContentPartInputVideoPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasContentPartInputVideoPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `input_video`.
   */
  public data object InputVideo : InlineComponentsSchemasContentPartInputVideoPropertiesType() {
    public override val `value`: String = "input_video"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContentPartInputVideoPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContentPartInputVideoPropertiesType = when (value) {
      InputVideo.value -> InputVideo
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContentPartInputVideoPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContentPartInputVideoPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContentPartInputVideoPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContentPartInputVideoPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
