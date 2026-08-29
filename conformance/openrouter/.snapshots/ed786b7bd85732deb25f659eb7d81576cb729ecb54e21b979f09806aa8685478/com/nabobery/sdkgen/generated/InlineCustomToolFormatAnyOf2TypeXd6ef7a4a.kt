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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CustomTool/properties/format/anyOf/1/properties/type
 */
@Serializable(with = InlineCustomToolFormatAnyOf2TypeXd6ef7a4a.Serializer::class)
public sealed class InlineCustomToolFormatAnyOf2TypeXd6ef7a4a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `grammar`.
   */
  public data object Grammar : InlineCustomToolFormatAnyOf2TypeXd6ef7a4a() {
    public override val `value`: String = "grammar"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCustomToolFormatAnyOf2TypeXd6ef7a4a()

  public companion object {
    public fun fromValue(`value`: String): InlineCustomToolFormatAnyOf2TypeXd6ef7a4a = when (value) {
      Grammar.value -> Grammar
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCustomToolFormatAnyOf2TypeXd6ef7a4a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineCustomToolFormatAnyOf2TypeXd6ef7a4a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCustomToolFormatAnyOf2TypeXd6ef7a4a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCustomToolFormatAnyOf2TypeXd6ef7a4a) {
      encoder.encodeString(value.value)
    }
  }
}
