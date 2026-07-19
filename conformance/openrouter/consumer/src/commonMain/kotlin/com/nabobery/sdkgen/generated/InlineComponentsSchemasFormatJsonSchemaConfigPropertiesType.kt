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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FormatJsonSchemaConfig/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFormatJsonSchemaConfigPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFormatJsonSchemaConfigPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `json_schema`.
   */
  public data object JsonSchema : InlineComponentsSchemasFormatJsonSchemaConfigPropertiesType() {
    public override val `value`: String = "json_schema"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFormatJsonSchemaConfigPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFormatJsonSchemaConfigPropertiesType = when (value) {
      JsonSchema.value -> JsonSchema
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFormatJsonSchemaConfigPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFormatJsonSchemaConfigPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFormatJsonSchemaConfigPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFormatJsonSchemaConfigPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
