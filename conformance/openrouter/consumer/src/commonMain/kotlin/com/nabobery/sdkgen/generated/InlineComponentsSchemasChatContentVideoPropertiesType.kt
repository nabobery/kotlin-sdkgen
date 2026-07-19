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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatContentVideo/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatContentVideoPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatContentVideoPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `video_url`.
   */
  public data object VideoUrl : InlineComponentsSchemasChatContentVideoPropertiesType() {
    public override val `value`: String = "video_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatContentVideoPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatContentVideoPropertiesType = when (value) {
      VideoUrl.value -> VideoUrl
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatContentVideoPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatContentVideoPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatContentVideoPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatContentVideoPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
