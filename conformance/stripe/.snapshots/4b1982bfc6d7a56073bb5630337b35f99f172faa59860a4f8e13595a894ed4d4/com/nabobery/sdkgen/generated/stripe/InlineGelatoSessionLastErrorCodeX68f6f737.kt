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
 * A short machine-readable string giving the reason for the verification or user-session failure.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_session_last_error/properties/code
 */
@Serializable(with = InlineGelatoSessionLastErrorCodeX68f6f737.Serializer::class)
public sealed class InlineGelatoSessionLastErrorCodeX68f6f737 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `abandoned`.
   */
  public data object Abandoned : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "abandoned"
  }

  /**
   * Documented value. Wire value: `consent_declined`.
   */
  public data object ConsentDeclined : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "consent_declined"
  }

  /**
   * Documented value. Wire value: `country_not_supported`.
   */
  public data object CountryNotSupported : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "country_not_supported"
  }

  /**
   * Documented value. Wire value: `device_not_supported`.
   */
  public data object DeviceNotSupported : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "device_not_supported"
  }

  /**
   * Documented value. Wire value: `document_expired`.
   */
  public data object DocumentExpired : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "document_expired"
  }

  /**
   * Documented value. Wire value: `document_type_not_supported`.
   */
  public data object DocumentTypeNotSupported : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "document_type_not_supported"
  }

  /**
   * Documented value. Wire value: `document_unverified_other`.
   */
  public data object DocumentUnverifiedOther : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "document_unverified_other"
  }

  /**
   * Documented value. Wire value: `email_unverified_other`.
   */
  public data object EmailUnverifiedOther : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "email_unverified_other"
  }

  /**
   * Documented value. Wire value: `email_verification_declined`.
   */
  public data object EmailVerificationDeclined : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "email_verification_declined"
  }

  /**
   * Documented value. Wire value: `id_number_insufficient_document_data`.
   */
  public data object IdNumberInsufficientDocumentData : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "id_number_insufficient_document_data"
  }

  /**
   * Documented value. Wire value: `id_number_mismatch`.
   */
  public data object IdNumberMismatch : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "id_number_mismatch"
  }

  /**
   * Documented value. Wire value: `id_number_unverified_other`.
   */
  public data object IdNumberUnverifiedOther : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "id_number_unverified_other"
  }

  /**
   * Documented value. Wire value: `phone_unverified_other`.
   */
  public data object PhoneUnverifiedOther : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "phone_unverified_other"
  }

  /**
   * Documented value. Wire value: `phone_verification_declined`.
   */
  public data object PhoneVerificationDeclined : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "phone_verification_declined"
  }

  /**
   * Documented value. Wire value: `selfie_document_missing_photo`.
   */
  public data object SelfieDocumentMissingPhoto : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "selfie_document_missing_photo"
  }

  /**
   * Documented value. Wire value: `selfie_face_mismatch`.
   */
  public data object SelfieFaceMismatch : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "selfie_face_mismatch"
  }

  /**
   * Documented value. Wire value: `selfie_manipulated`.
   */
  public data object SelfieManipulated : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "selfie_manipulated"
  }

  /**
   * Documented value. Wire value: `selfie_unverified_other`.
   */
  public data object SelfieUnverifiedOther : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "selfie_unverified_other"
  }

  /**
   * Documented value. Wire value: `under_supported_age`.
   */
  public data object UnderSupportedAge : InlineGelatoSessionLastErrorCodeX68f6f737() {
    public override val `value`: String = "under_supported_age"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineGelatoSessionLastErrorCodeX68f6f737()

  public companion object {
    public fun fromValue(`value`: String): InlineGelatoSessionLastErrorCodeX68f6f737 = when (value) {
      Abandoned.value -> Abandoned
      ConsentDeclined.value -> ConsentDeclined
      CountryNotSupported.value -> CountryNotSupported
      DeviceNotSupported.value -> DeviceNotSupported
      DocumentExpired.value -> DocumentExpired
      DocumentTypeNotSupported.value -> DocumentTypeNotSupported
      DocumentUnverifiedOther.value -> DocumentUnverifiedOther
      EmailUnverifiedOther.value -> EmailUnverifiedOther
      EmailVerificationDeclined.value -> EmailVerificationDeclined
      IdNumberInsufficientDocumentData.value -> IdNumberInsufficientDocumentData
      IdNumberMismatch.value -> IdNumberMismatch
      IdNumberUnverifiedOther.value -> IdNumberUnverifiedOther
      PhoneUnverifiedOther.value -> PhoneUnverifiedOther
      PhoneVerificationDeclined.value -> PhoneVerificationDeclined
      SelfieDocumentMissingPhoto.value -> SelfieDocumentMissingPhoto
      SelfieFaceMismatch.value -> SelfieFaceMismatch
      SelfieManipulated.value -> SelfieManipulated
      SelfieUnverifiedOther.value -> SelfieUnverifiedOther
      UnderSupportedAge.value -> UnderSupportedAge
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoSessionLastErrorCodeX68f6f737> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineGelatoSessionLastErrorCodeX68f6f737", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineGelatoSessionLastErrorCodeX68f6f737 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineGelatoSessionLastErrorCodeX68f6f737) {
      encoder.encodeString(value.value)
    }
  }
}
