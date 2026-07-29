package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Sex of the person in the document.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report/properties/sex
 */
@Serializable(with = InlineGelatoDocumentReportSexX65e79c91.Serializer::class)
public sealed class InlineGelatoDocumentReportSexX65e79c91 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `[redacted]`.
   */
  public data object Redacted : InlineGelatoDocumentReportSexX65e79c91() {
    public override val `value`: String = "[redacted]"
  }

  /**
   * Documented value. Wire value: `female`.
   */
  public data object Female : InlineGelatoDocumentReportSexX65e79c91() {
    public override val `value`: String = "female"
  }

  /**
   * Documented value. Wire value: `male`.
   */
  public data object Male : InlineGelatoDocumentReportSexX65e79c91() {
    public override val `value`: String = "male"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineGelatoDocumentReportSexX65e79c91() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoDocumentReportSexX65e79c91()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoDocumentReportSexX65e79c91 = when (value) {
      Redacted.value -> Redacted
      Female.value -> Female
      Male.value -> Male
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGelatoDocumentReportSexX65e79c91> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoDocumentReportSexX65e79c91", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoDocumentReportSexX65e79c91 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoDocumentReportSexX65e79c91) {
      encoder.encodeString(value.value)
    }
  }
}
