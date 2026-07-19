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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ChatFormatJsonSchemaConfig/properties/type.
 */
@Serializable(with = InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_schema`.
   */
  public data object JsonSchema : InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType() {
    public override val `value`: String = "json_schema"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType =
      when (value) {
      JsonSchema.value -> JsonSchema
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasChatFormatJsonSchemaConfigPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
