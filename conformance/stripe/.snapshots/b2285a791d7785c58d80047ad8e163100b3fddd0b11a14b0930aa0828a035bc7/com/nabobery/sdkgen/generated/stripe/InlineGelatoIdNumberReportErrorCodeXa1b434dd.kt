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
 * A short machine-readable string giving the reason for the verification failure.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_id_number_report_error/properties/code
 */
@Serializable(with = InlineGelatoIdNumberReportErrorCodeXa1b434dd.Serializer::class)
public sealed class InlineGelatoIdNumberReportErrorCodeXa1b434dd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `id_number_insufficient_document_data`.
   */
  public data object IdNumberInsufficientDocumentData : InlineGelatoIdNumberReportErrorCodeXa1b434dd() {
    public override val `value`: String = "id_number_insufficient_document_data"
  }

  /**
   * Documented value. Wire value: `id_number_mismatch`.
   */
  public data object IdNumberMismatch : InlineGelatoIdNumberReportErrorCodeXa1b434dd() {
    public override val `value`: String = "id_number_mismatch"
  }

  /**
   * Documented value. Wire value: `id_number_unverified_other`.
   */
  public data object IdNumberUnverifiedOther : InlineGelatoIdNumberReportErrorCodeXa1b434dd() {
    public override val `value`: String = "id_number_unverified_other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoIdNumberReportErrorCodeXa1b434dd()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoIdNumberReportErrorCodeXa1b434dd = when (value) {
      IdNumberInsufficientDocumentData.value -> IdNumberInsufficientDocumentData
      IdNumberMismatch.value -> IdNumberMismatch
      IdNumberUnverifiedOther.value -> IdNumberUnverifiedOther
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineGelatoIdNumberReportErrorCodeXa1b434dd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoIdNumberReportErrorCodeXa1b434dd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoIdNumberReportErrorCodeXa1b434dd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoIdNumberReportErrorCodeXa1b434dd) {
      encoder.encodeString(value.value)
    }
  }
}
