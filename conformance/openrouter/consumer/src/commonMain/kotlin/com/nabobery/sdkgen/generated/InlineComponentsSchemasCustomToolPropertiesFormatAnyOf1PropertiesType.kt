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
 * sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/1/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `grammar`.
   */
  public data object Grammar : InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType() {
    public override val `value`: String = "grammar"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType =
      when (value) {
      Grammar.value -> Grammar
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
