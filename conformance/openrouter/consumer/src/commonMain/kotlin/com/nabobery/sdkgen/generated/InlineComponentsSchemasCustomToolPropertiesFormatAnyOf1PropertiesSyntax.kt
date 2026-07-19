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
 * sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/1/properties/syntax.
 */
@Serializable(with = InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax.Serializer::class)
public sealed class InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `lark`.
   */
  public data object Lark : InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax() {
    public override val `value`: String = "lark"
  }

  /**
   * Documented value. Wire value: `regex`.
   */
  public data object Regex : InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax() {
    public override val `value`: String = "regex"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax =
      when (value) {
      Lark.value -> Lark
      Regex.value -> Regex
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCustomToolPropertiesFormatAnyOf1PropertiesSyntax) {
      encoder.encodeString(value.value)
    }
  }
}
