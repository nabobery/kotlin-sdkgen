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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ChatFormatTextConfig/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatFormatTextConfigPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatFormatTextConfigPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineComponentsSchemasChatFormatTextConfigPropertiesType() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatFormatTextConfigPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatFormatTextConfigPropertiesType = when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatFormatTextConfigPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatFormatTextConfigPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatFormatTextConfigPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatFormatTextConfigPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
