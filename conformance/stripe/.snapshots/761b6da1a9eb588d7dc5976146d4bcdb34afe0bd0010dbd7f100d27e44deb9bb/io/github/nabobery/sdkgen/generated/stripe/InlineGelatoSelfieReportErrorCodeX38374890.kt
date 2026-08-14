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
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_selfie_report_error/properties/code
 */
@Serializable(with = InlineGelatoSelfieReportErrorCodeX38374890.Serializer::class)
public sealed class InlineGelatoSelfieReportErrorCodeX38374890 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `selfie_document_missing_photo`.
   */
  public data object SelfieDocumentMissingPhoto : InlineGelatoSelfieReportErrorCodeX38374890() {
    public override val `value`: String = "selfie_document_missing_photo"
  }

  /**
   * Documented value. Wire value: `selfie_face_mismatch`.
   */
  public data object SelfieFaceMismatch : InlineGelatoSelfieReportErrorCodeX38374890() {
    public override val `value`: String = "selfie_face_mismatch"
  }

  /**
   * Documented value. Wire value: `selfie_manipulated`.
   */
  public data object SelfieManipulated : InlineGelatoSelfieReportErrorCodeX38374890() {
    public override val `value`: String = "selfie_manipulated"
  }

  /**
   * Documented value. Wire value: `selfie_unverified_other`.
   */
  public data object SelfieUnverifiedOther : InlineGelatoSelfieReportErrorCodeX38374890() {
    public override val `value`: String = "selfie_unverified_other"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoSelfieReportErrorCodeX38374890()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoSelfieReportErrorCodeX38374890 = when (value) {
      SelfieDocumentMissingPhoto.value -> SelfieDocumentMissingPhoto
      SelfieFaceMismatch.value -> SelfieFaceMismatch
      SelfieManipulated.value -> SelfieManipulated
      SelfieUnverifiedOther.value -> SelfieUnverifiedOther
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoSelfieReportErrorCodeX38374890> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineGelatoSelfieReportErrorCodeX38374890", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoSelfieReportErrorCodeX38374890 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoSelfieReportErrorCodeX38374890) {
      encoder.encodeString(value.value)
    }
  }
}
