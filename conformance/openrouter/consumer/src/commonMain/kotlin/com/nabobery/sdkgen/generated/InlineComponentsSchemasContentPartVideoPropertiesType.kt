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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartVideo/properties/type.
 */
@Serializable(with = InlineComponentsSchemasContentPartVideoPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasContentPartVideoPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `video_url`.
   */
  public data object VideoUrl : InlineComponentsSchemasContentPartVideoPropertiesType() {
    public override val `value`: String = "video_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContentPartVideoPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContentPartVideoPropertiesType = when (value) {
      VideoUrl.value -> VideoUrl
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContentPartVideoPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContentPartVideoPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContentPartVideoPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContentPartVideoPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
