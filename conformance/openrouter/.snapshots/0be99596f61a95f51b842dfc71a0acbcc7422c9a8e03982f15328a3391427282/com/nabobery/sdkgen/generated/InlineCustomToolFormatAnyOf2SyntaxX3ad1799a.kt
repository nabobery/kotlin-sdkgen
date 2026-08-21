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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/1/properties/syntax
 */
@Serializable(with = InlineCustomToolFormatAnyOf2SyntaxX3ad1799a.Serializer::class)
public sealed class InlineCustomToolFormatAnyOf2SyntaxX3ad1799a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `lark`.
   */
  public data object Lark : InlineCustomToolFormatAnyOf2SyntaxX3ad1799a() {
    public override val `value`: String = "lark"
  }

  /**
   * Documented value. Wire value: `regex`.
   */
  public data object Regex : InlineCustomToolFormatAnyOf2SyntaxX3ad1799a() {
    public override val `value`: String = "regex"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomToolFormatAnyOf2SyntaxX3ad1799a()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomToolFormatAnyOf2SyntaxX3ad1799a = when (value) {
      Lark.value -> Lark
      Regex.value -> Regex
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomToolFormatAnyOf2SyntaxX3ad1799a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineCustomToolFormatAnyOf2SyntaxX3ad1799a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomToolFormatAnyOf2SyntaxX3ad1799a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolFormatAnyOf2SyntaxX3ad1799a) {
      encoder.encodeString(value.value)
    }
  }
}
