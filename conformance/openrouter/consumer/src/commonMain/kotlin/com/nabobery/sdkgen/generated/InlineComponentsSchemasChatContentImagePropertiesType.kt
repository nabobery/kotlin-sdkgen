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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatContentImage/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatContentImagePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatContentImagePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_url`.
   */
  public data object ImageUrl : InlineComponentsSchemasChatContentImagePropertiesType() {
    public override val `value`: String = "image_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatContentImagePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatContentImagePropertiesType = when (value) {
      ImageUrl.value -> ImageUrl
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatContentImagePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatContentImagePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatContentImagePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatContentImagePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
