package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * A short machine-readable string giving the reason for the verification failure.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_document_report_error/properties/code
 */
@Serializable(with = InlineGelatoDocumentReportErrorCodeXcc31dbbe.Serializer::class)
public sealed class InlineGelatoDocumentReportErrorCodeXcc31dbbe {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `document_expired`.
   */
  public data object DocumentExpired : InlineGelatoDocumentReportErrorCodeXcc31dbbe() {
    public override val `value`: String = "document_expired"
  }

  /**
   * Documented value. Wire value: `document_type_not_supported`.
   */
  public data object DocumentTypeNotSupported : InlineGelatoDocumentReportErrorCodeXcc31dbbe() {
    public override val `value`: String = "document_type_not_supported"
  }

  /**
   * Documented value. Wire value: `document_unverified_other`.
   */
  public data object DocumentUnverifiedOther : InlineGelatoDocumentReportErrorCodeXcc31dbbe() {
    public override val `value`: String = "document_unverified_other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoDocumentReportErrorCodeXcc31dbbe()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoDocumentReportErrorCodeXcc31dbbe = when (value) {
      DocumentExpired.value -> DocumentExpired
      DocumentTypeNotSupported.value -> DocumentTypeNotSupported
      DocumentUnverifiedOther.value -> DocumentUnverifiedOther
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoDocumentReportErrorCodeXcc31dbbe> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineGelatoDocumentReportErrorCodeXcc31dbbe", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoDocumentReportErrorCodeXcc31dbbe = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoDocumentReportErrorCodeXcc31dbbe) {
      encoder.encodeString(value.value)
    }
  }
}
