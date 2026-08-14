package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PDFParserEngine/anyOf/1
 */
@Serializable(with = InlinePdfParserEngineAnyOf2X63c52ee1.Serializer::class)
public sealed class InlinePdfParserEngineAnyOf2X63c52ee1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pdf-text`.
   */
  public data object PdfText : InlinePdfParserEngineAnyOf2X63c52ee1() {
    public override val `value`: String = "pdf-text"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePdfParserEngineAnyOf2X63c52ee1()

  public companion object {
    public fun fromValue(`value`: String): InlinePdfParserEngineAnyOf2X63c52ee1 = when (value) {
      PdfText.value -> PdfText
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePdfParserEngineAnyOf2X63c52ee1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlinePdfParserEngineAnyOf2X63c52ee1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePdfParserEngineAnyOf2X63c52ee1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePdfParserEngineAnyOf2X63c52ee1) {
      encoder.encodeString(value.value)
    }
  }
}
