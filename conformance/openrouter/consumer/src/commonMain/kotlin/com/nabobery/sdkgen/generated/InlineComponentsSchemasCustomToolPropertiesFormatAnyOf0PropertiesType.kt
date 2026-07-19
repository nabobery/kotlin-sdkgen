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
 * sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/0/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `text`.
   */
  public data object Text : InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType() {
    public override val `value`: String = "text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType =
      when (value) {
      Text.value -> Text
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf0PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
