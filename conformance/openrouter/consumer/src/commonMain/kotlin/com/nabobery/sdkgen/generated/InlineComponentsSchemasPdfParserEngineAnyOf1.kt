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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/PDFParserEngine/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasPdfParserEngineAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasPdfParserEngineAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pdf-text`.
   */
  public data object PdfText : InlineComponentsSchemasPdfParserEngineAnyOf1() {
    public override val `value`: String = "pdf-text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasPdfParserEngineAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasPdfParserEngineAnyOf1 = when (value) {
      PdfText.value -> PdfText
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPdfParserEngineAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasPdfParserEngineAnyOf1",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPdfParserEngineAnyOf1 = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasPdfParserEngineAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
