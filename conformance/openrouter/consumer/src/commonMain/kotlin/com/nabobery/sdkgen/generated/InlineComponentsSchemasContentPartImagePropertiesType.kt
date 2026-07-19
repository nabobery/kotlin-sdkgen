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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ContentPartImage/properties/type.
 */
@Serializable(with = InlineComponentsSchemasContentPartImagePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasContentPartImagePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image_url`.
   */
  public data object ImageUrl : InlineComponentsSchemasContentPartImagePropertiesType() {
    public override val `value`: String = "image_url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasContentPartImagePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasContentPartImagePropertiesType = when (value) {
      ImageUrl.value -> ImageUrl
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasContentPartImagePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasContentPartImagePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasContentPartImagePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasContentPartImagePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
