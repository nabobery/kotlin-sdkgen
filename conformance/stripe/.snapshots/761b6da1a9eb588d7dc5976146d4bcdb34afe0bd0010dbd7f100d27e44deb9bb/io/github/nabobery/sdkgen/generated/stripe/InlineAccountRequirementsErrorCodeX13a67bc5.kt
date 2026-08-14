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
 * The code for the type of error.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_requirements_error/properties/code
 */
@Serializable(with = InlineAccountRequirementsErrorCodeX13a67bc5.Serializer::class)
public sealed class InlineAccountRequirementsErrorCodeX13a67bc5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `external_request`.
   */
  public data object ExternalRequest : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "external_request"
  }

  /**
   * Documented value. Wire value: `information_missing`.
   */
  public data object InformationMissing : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "information_missing"
  }

  /**
   * Documented value. Wire value: `invalid_address_city_state_postal_code`.
   */
  public data object InvalidAddressCityStatePostalCode : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_address_city_state_postal_code"
  }

  /**
   * Documented value. Wire value: `invalid_address_highway_contract_box`.
   */
  public data object InvalidAddressHighwayContractBox : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_address_highway_contract_box"
  }

  /**
   * Documented value. Wire value: `invalid_address_private_mailbox`.
   */
  public data object InvalidAddressPrivateMailbox : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_address_private_mailbox"
  }

  /**
   * Documented value. Wire value: `invalid_business_profile_name`.
   */
  public data object InvalidBusinessProfileName : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_business_profile_name"
  }

  /**
   * Documented value. Wire value: `invalid_business_profile_name_denylisted`.
   */
  public data object InvalidBusinessProfileNameDenylisted : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_business_profile_name_denylisted"
  }

  /**
   * Documented value. Wire value: `invalid_company_name_denylisted`.
   */
  public data object InvalidCompanyNameDenylisted : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_company_name_denylisted"
  }

  /**
   * Documented value. Wire value: `invalid_dob_age_over_maximum`.
   */
  public data object InvalidDobAgeOverMaximum : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_dob_age_over_maximum"
  }

  /**
   * Documented value. Wire value: `invalid_dob_age_under_18`.
   */
  public data object InvalidDobAgeUnder18 : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_dob_age_under_18"
  }

  /**
   * Documented value. Wire value: `invalid_dob_age_under_minimum`.
   */
  public data object InvalidDobAgeUnderMinimum : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_dob_age_under_minimum"
  }

  /**
   * Documented value. Wire value: `invalid_product_description_length`.
   */
  public data object InvalidProductDescriptionLength : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_product_description_length"
  }

  /**
   * Documented value. Wire value: `invalid_product_description_url_match`.
   */
  public data object InvalidProductDescriptionUrlMatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_product_description_url_match"
  }

  /**
   * Documented value. Wire value: `invalid_representative_country`.
   */
  public data object InvalidRepresentativeCountry : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_representative_country"
  }

  /**
   * Documented value. Wire value: `invalid_signator`.
   */
  public data object InvalidSignator : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_signator"
  }

  /**
   * Documented value. Wire value: `invalid_statement_descriptor_business_mismatch`.
   */
  public data object InvalidStatementDescriptorBusinessMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_statement_descriptor_business_mismatch"
  }

  /**
   * Documented value. Wire value: `invalid_statement_descriptor_denylisted`.
   */
  public data object InvalidStatementDescriptorDenylisted : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_statement_descriptor_denylisted"
  }

  /**
   * Documented value. Wire value: `invalid_statement_descriptor_length`.
   */
  public data object InvalidStatementDescriptorLength : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_statement_descriptor_length"
  }

  /**
   * Documented value. Wire value: `invalid_statement_descriptor_prefix_denylisted`.
   */
  public data object InvalidStatementDescriptorPrefixDenylisted : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_statement_descriptor_prefix_denylisted"
  }

  /**
   * Documented value. Wire value: `invalid_statement_descriptor_prefix_mismatch`.
   */
  public data object InvalidStatementDescriptorPrefixMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_statement_descriptor_prefix_mismatch"
  }

  /**
   * Documented value. Wire value: `invalid_street_address`.
   */
  public data object InvalidStreetAddress : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_street_address"
  }

  /**
   * Documented value. Wire value: `invalid_tax_id`.
   */
  public data object InvalidTaxId : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_tax_id"
  }

  /**
   * Documented value. Wire value: `invalid_tax_id_format`.
   */
  public data object InvalidTaxIdFormat : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_tax_id_format"
  }

  /**
   * Documented value. Wire value: `invalid_tos_acceptance`.
   */
  public data object InvalidTosAcceptance : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_tos_acceptance"
  }

  /**
   * Documented value. Wire value: `invalid_url_denylisted`.
   */
  public data object InvalidUrlDenylisted : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_denylisted"
  }

  /**
   * Documented value. Wire value: `invalid_url_format`.
   */
  public data object InvalidUrlFormat : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_format"
  }

  /**
   * Documented value. Wire value: `invalid_url_web_presence_detected`.
   */
  public data object InvalidUrlWebPresenceDetected : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_web_presence_detected"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_business_information_mismatch`.
   */
  public data object InvalidUrlWebsiteBusinessInformationMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_business_information_mismatch"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_empty`.
   */
  public data object InvalidUrlWebsiteEmpty : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_empty"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_inaccessible`.
   */
  public data object InvalidUrlWebsiteInaccessible : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_inaccessible"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_inaccessible_geoblocked`.
   */
  public data object InvalidUrlWebsiteInaccessibleGeoblocked : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_inaccessible_geoblocked"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_inaccessible_password_protected`.
   */
  public data object InvalidUrlWebsiteInaccessiblePasswordProtected : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_inaccessible_password_protected"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_incomplete`.
   */
  public data object InvalidUrlWebsiteIncomplete : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_incomplete"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_incomplete_cancellation_policy`.
   */
  public data object InvalidUrlWebsiteIncompleteCancellationPolicy : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_incomplete_cancellation_policy"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_incomplete_customer_service_details`.
   */
  public data object InvalidUrlWebsiteIncompleteCustomerServiceDetails : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_incomplete_customer_service_details"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_incomplete_legal_restrictions`.
   */
  public data object InvalidUrlWebsiteIncompleteLegalRestrictions : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_incomplete_legal_restrictions"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_incomplete_refund_policy`.
   */
  public data object InvalidUrlWebsiteIncompleteRefundPolicy : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_incomplete_refund_policy"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_incomplete_return_policy`.
   */
  public data object InvalidUrlWebsiteIncompleteReturnPolicy : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_incomplete_return_policy"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_incomplete_terms_and_conditions`.
   */
  public data object InvalidUrlWebsiteIncompleteTermsAndConditions : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_incomplete_terms_and_conditions"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_incomplete_under_construction`.
   */
  public data object InvalidUrlWebsiteIncompleteUnderConstruction : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_incomplete_under_construction"
  }

  /**
   * Documented value. Wire value: `invalid_url_website_other`.
   */
  public data object InvalidUrlWebsiteOther : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_url_website_other"
  }

  /**
   * Documented value. Wire value: `invalid_value_other`.
   */
  public data object InvalidValueOther : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "invalid_value_other"
  }

  /**
   * Documented value. Wire value: `unsupported_business_type`.
   */
  public data object UnsupportedBusinessType : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "unsupported_business_type"
  }

  /**
   * Documented value. Wire value: `verification_directors_mismatch`.
   */
  public data object VerificationDirectorsMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_directors_mismatch"
  }

  /**
   * Documented value. Wire value: `verification_document_address_mismatch`.
   */
  public data object VerificationDocumentAddressMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_address_mismatch"
  }

  /**
   * Documented value. Wire value: `verification_document_address_missing`.
   */
  public data object VerificationDocumentAddressMissing : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_address_missing"
  }

  /**
   * Documented value. Wire value: `verification_document_corrupt`.
   */
  public data object VerificationDocumentCorrupt : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_corrupt"
  }

  /**
   * Documented value. Wire value: `verification_document_country_not_supported`.
   */
  public data object VerificationDocumentCountryNotSupported : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_country_not_supported"
  }

  /**
   * Documented value. Wire value: `verification_document_directors_mismatch`.
   */
  public data object VerificationDocumentDirectorsMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_directors_mismatch"
  }

  /**
   * Documented value. Wire value: `verification_document_dob_mismatch`.
   */
  public data object VerificationDocumentDobMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_dob_mismatch"
  }

  /**
   * Documented value. Wire value: `verification_document_duplicate_type`.
   */
  public data object VerificationDocumentDuplicateType : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_duplicate_type"
  }

  /**
   * Documented value. Wire value: `verification_document_expired`.
   */
  public data object VerificationDocumentExpired : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_expired"
  }

  /**
   * Documented value. Wire value: `verification_document_failed_copy`.
   */
  public data object VerificationDocumentFailedCopy : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_failed_copy"
  }

  /**
   * Documented value. Wire value: `verification_document_failed_greyscale`.
   */
  public data object VerificationDocumentFailedGreyscale : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_failed_greyscale"
  }

  /**
   * Documented value. Wire value: `verification_document_failed_other`.
   */
  public data object VerificationDocumentFailedOther : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_failed_other"
  }

  /**
   * Documented value. Wire value: `verification_document_failed_test_mode`.
   */
  public data object VerificationDocumentFailedTestMode : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_failed_test_mode"
  }

  /**
   * Documented value. Wire value: `verification_document_fraudulent`.
   */
  public data object VerificationDocumentFraudulent : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_fraudulent"
  }

  /**
   * Documented value. Wire value: `verification_document_id_number_mismatch`.
   */
  public data object VerificationDocumentIdNumberMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_id_number_mismatch"
  }

  /**
   * Documented value. Wire value: `verification_document_id_number_missing`.
   */
  public data object VerificationDocumentIdNumberMissing : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_id_number_missing"
  }

  /**
   * Documented value. Wire value: `verification_document_incomplete`.
   */
  public data object VerificationDocumentIncomplete : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_incomplete"
  }

  /**
   * Documented value. Wire value: `verification_document_invalid`.
   */
  public data object VerificationDocumentInvalid : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_invalid"
  }

  /**
   * Documented value. Wire value: `verification_document_issue_or_expiry_date_missing`.
   */
  public data object VerificationDocumentIssueOrExpiryDateMissing : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_issue_or_expiry_date_missing"
  }

  /**
   * Documented value. Wire value: `verification_document_manipulated`.
   */
  public data object VerificationDocumentManipulated : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_manipulated"
  }

  /**
   * Documented value. Wire value: `verification_document_missing_back`.
   */
  public data object VerificationDocumentMissingBack : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_missing_back"
  }

  /**
   * Documented value. Wire value: `verification_document_missing_front`.
   */
  public data object VerificationDocumentMissingFront : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_missing_front"
  }

  /**
   * Documented value. Wire value: `verification_document_name_mismatch`.
   */
  public data object VerificationDocumentNameMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_name_mismatch"
  }

  /**
   * Documented value. Wire value: `verification_document_name_missing`.
   */
  public data object VerificationDocumentNameMissing : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_name_missing"
  }

  /**
   * Documented value. Wire value: `verification_document_nationality_mismatch`.
   */
  public data object VerificationDocumentNationalityMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_nationality_mismatch"
  }

  /**
   * Documented value. Wire value: `verification_document_not_readable`.
   */
  public data object VerificationDocumentNotReadable : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_not_readable"
  }

  /**
   * Documented value. Wire value: `verification_document_not_signed`.
   */
  public data object VerificationDocumentNotSigned : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_not_signed"
  }

  /**
   * Documented value. Wire value: `verification_document_not_uploaded`.
   */
  public data object VerificationDocumentNotUploaded : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_not_uploaded"
  }

  /**
   * Documented value. Wire value: `verification_document_photo_mismatch`.
   */
  public data object VerificationDocumentPhotoMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_photo_mismatch"
  }

  /**
   * Documented value. Wire value: `verification_document_too_large`.
   */
  public data object VerificationDocumentTooLarge : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_too_large"
  }

  /**
   * Documented value. Wire value: `verification_document_type_not_supported`.
   */
  public data object VerificationDocumentTypeNotSupported : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_document_type_not_supported"
  }

  /**
   * Documented value. Wire value: `verification_extraneous_directors`.
   */
  public data object VerificationExtraneousDirectors : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_extraneous_directors"
  }

  /**
   * Documented value. Wire value: `verification_failed_address_match`.
   */
  public data object VerificationFailedAddressMatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_address_match"
  }

  /**
   * Documented value. Wire value: `verification_failed_authorizer_authority`.
   */
  public data object VerificationFailedAuthorizerAuthority : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_authorizer_authority"
  }

  /**
   * Documented value. Wire value: `verification_failed_business_iec_number`.
   */
  public data object VerificationFailedBusinessIecNumber : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_business_iec_number"
  }

  /**
   * Documented value. Wire value: `verification_failed_document_match`.
   */
  public data object VerificationFailedDocumentMatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_document_match"
  }

  /**
   * Documented value. Wire value: `verification_failed_id_number_match`.
   */
  public data object VerificationFailedIdNumberMatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_id_number_match"
  }

  /**
   * Documented value. Wire value: `verification_failed_keyed_identity`.
   */
  public data object VerificationFailedKeyedIdentity : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_keyed_identity"
  }

  /**
   * Documented value. Wire value: `verification_failed_keyed_match`.
   */
  public data object VerificationFailedKeyedMatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_keyed_match"
  }

  /**
   * Documented value. Wire value: `verification_failed_name_match`.
   */
  public data object VerificationFailedNameMatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_name_match"
  }

  /**
   * Documented value. Wire value: `verification_failed_other`.
   */
  public data object VerificationFailedOther : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_other"
  }

  /**
   * Documented value. Wire value: `verification_failed_representative_authority`.
   */
  public data object VerificationFailedRepresentativeAuthority : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_representative_authority"
  }

  /**
   * Documented value. Wire value: `verification_failed_residential_address`.
   */
  public data object VerificationFailedResidentialAddress : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_residential_address"
  }

  /**
   * Documented value. Wire value: `verification_failed_tax_id_match`.
   */
  public data object VerificationFailedTaxIdMatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_tax_id_match"
  }

  /**
   * Documented value. Wire value: `verification_failed_tax_id_not_issued`.
   */
  public data object VerificationFailedTaxIdNotIssued : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_failed_tax_id_not_issued"
  }

  /**
   * Documented value. Wire value: `verification_legal_entity_structure_mismatch`.
   */
  public data object VerificationLegalEntityStructureMismatch : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_legal_entity_structure_mismatch"
  }

  /**
   * Documented value. Wire value: `verification_missing_directors`.
   */
  public data object VerificationMissingDirectors : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_missing_directors"
  }

  /**
   * Documented value. Wire value: `verification_missing_executives`.
   */
  public data object VerificationMissingExecutives : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_missing_executives"
  }

  /**
   * Documented value. Wire value: `verification_missing_owners`.
   */
  public data object VerificationMissingOwners : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_missing_owners"
  }

  /**
   * Documented value. Wire value: `verification_rejected_ownership_exemption_reason`.
   */
  public data object VerificationRejectedOwnershipExemptionReason : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_rejected_ownership_exemption_reason"
  }

  /**
   * Documented value. Wire value: `verification_requires_additional_memorandum_of_associations`.
   */
  public data object VerificationRequiresAdditionalMemorandumOfAssociations : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String =
        "verification_requires_additional_memorandum_of_associations"
  }

  /**
   * Documented value. Wire value: `verification_requires_additional_proof_of_registration`.
   */
  public data object VerificationRequiresAdditionalProofOfRegistration : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_requires_additional_proof_of_registration"
  }

  /**
   * Documented value. Wire value: `verification_supportability`.
   */
  public data object VerificationSupportability : InlineAccountRequirementsErrorCodeX13a67bc5() {
    public override val `value`: String = "verification_supportability"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountRequirementsErrorCodeX13a67bc5()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountRequirementsErrorCodeX13a67bc5 = when (value) {
      ExternalRequest.value -> ExternalRequest
      InformationMissing.value -> InformationMissing
      InvalidAddressCityStatePostalCode.value -> InvalidAddressCityStatePostalCode
      InvalidAddressHighwayContractBox.value -> InvalidAddressHighwayContractBox
      InvalidAddressPrivateMailbox.value -> InvalidAddressPrivateMailbox
      InvalidBusinessProfileName.value -> InvalidBusinessProfileName
      InvalidBusinessProfileNameDenylisted.value -> InvalidBusinessProfileNameDenylisted
      InvalidCompanyNameDenylisted.value -> InvalidCompanyNameDenylisted
      InvalidDobAgeOverMaximum.value -> InvalidDobAgeOverMaximum
      InvalidDobAgeUnder18.value -> InvalidDobAgeUnder18
      InvalidDobAgeUnderMinimum.value -> InvalidDobAgeUnderMinimum
      InvalidProductDescriptionLength.value -> InvalidProductDescriptionLength
      InvalidProductDescriptionUrlMatch.value -> InvalidProductDescriptionUrlMatch
      InvalidRepresentativeCountry.value -> InvalidRepresentativeCountry
      InvalidSignator.value -> InvalidSignator
      InvalidStatementDescriptorBusinessMismatch.value -> InvalidStatementDescriptorBusinessMismatch
      InvalidStatementDescriptorDenylisted.value -> InvalidStatementDescriptorDenylisted
      InvalidStatementDescriptorLength.value -> InvalidStatementDescriptorLength
      InvalidStatementDescriptorPrefixDenylisted.value -> InvalidStatementDescriptorPrefixDenylisted
      InvalidStatementDescriptorPrefixMismatch.value -> InvalidStatementDescriptorPrefixMismatch
      InvalidStreetAddress.value -> InvalidStreetAddress
      InvalidTaxId.value -> InvalidTaxId
      InvalidTaxIdFormat.value -> InvalidTaxIdFormat
      InvalidTosAcceptance.value -> InvalidTosAcceptance
      InvalidUrlDenylisted.value -> InvalidUrlDenylisted
      InvalidUrlFormat.value -> InvalidUrlFormat
      InvalidUrlWebPresenceDetected.value -> InvalidUrlWebPresenceDetected
      InvalidUrlWebsiteBusinessInformationMismatch.value -> InvalidUrlWebsiteBusinessInformationMismatch
      InvalidUrlWebsiteEmpty.value -> InvalidUrlWebsiteEmpty
      InvalidUrlWebsiteInaccessible.value -> InvalidUrlWebsiteInaccessible
      InvalidUrlWebsiteInaccessibleGeoblocked.value -> InvalidUrlWebsiteInaccessibleGeoblocked
      InvalidUrlWebsiteInaccessiblePasswordProtected.value -> InvalidUrlWebsiteInaccessiblePasswordProtected
      InvalidUrlWebsiteIncomplete.value -> InvalidUrlWebsiteIncomplete
      InvalidUrlWebsiteIncompleteCancellationPolicy.value -> InvalidUrlWebsiteIncompleteCancellationPolicy
      InvalidUrlWebsiteIncompleteCustomerServiceDetails.value -> InvalidUrlWebsiteIncompleteCustomerServiceDetails
      InvalidUrlWebsiteIncompleteLegalRestrictions.value -> InvalidUrlWebsiteIncompleteLegalRestrictions
      InvalidUrlWebsiteIncompleteRefundPolicy.value -> InvalidUrlWebsiteIncompleteRefundPolicy
      InvalidUrlWebsiteIncompleteReturnPolicy.value -> InvalidUrlWebsiteIncompleteReturnPolicy
      InvalidUrlWebsiteIncompleteTermsAndConditions.value -> InvalidUrlWebsiteIncompleteTermsAndConditions
      InvalidUrlWebsiteIncompleteUnderConstruction.value -> InvalidUrlWebsiteIncompleteUnderConstruction
      InvalidUrlWebsiteOther.value -> InvalidUrlWebsiteOther
      InvalidValueOther.value -> InvalidValueOther
      UnsupportedBusinessType.value -> UnsupportedBusinessType
      VerificationDirectorsMismatch.value -> VerificationDirectorsMismatch
      VerificationDocumentAddressMismatch.value -> VerificationDocumentAddressMismatch
      VerificationDocumentAddressMissing.value -> VerificationDocumentAddressMissing
      VerificationDocumentCorrupt.value -> VerificationDocumentCorrupt
      VerificationDocumentCountryNotSupported.value -> VerificationDocumentCountryNotSupported
      VerificationDocumentDirectorsMismatch.value -> VerificationDocumentDirectorsMismatch
      VerificationDocumentDobMismatch.value -> VerificationDocumentDobMismatch
      VerificationDocumentDuplicateType.value -> VerificationDocumentDuplicateType
      VerificationDocumentExpired.value -> VerificationDocumentExpired
      VerificationDocumentFailedCopy.value -> VerificationDocumentFailedCopy
      VerificationDocumentFailedGreyscale.value -> VerificationDocumentFailedGreyscale
      VerificationDocumentFailedOther.value -> VerificationDocumentFailedOther
      VerificationDocumentFailedTestMode.value -> VerificationDocumentFailedTestMode
      VerificationDocumentFraudulent.value -> VerificationDocumentFraudulent
      VerificationDocumentIdNumberMismatch.value -> VerificationDocumentIdNumberMismatch
      VerificationDocumentIdNumberMissing.value -> VerificationDocumentIdNumberMissing
      VerificationDocumentIncomplete.value -> VerificationDocumentIncomplete
      VerificationDocumentInvalid.value -> VerificationDocumentInvalid
      VerificationDocumentIssueOrExpiryDateMissing.value -> VerificationDocumentIssueOrExpiryDateMissing
      VerificationDocumentManipulated.value -> VerificationDocumentManipulated
      VerificationDocumentMissingBack.value -> VerificationDocumentMissingBack
      VerificationDocumentMissingFront.value -> VerificationDocumentMissingFront
      VerificationDocumentNameMismatch.value -> VerificationDocumentNameMismatch
      VerificationDocumentNameMissing.value -> VerificationDocumentNameMissing
      VerificationDocumentNationalityMismatch.value -> VerificationDocumentNationalityMismatch
      VerificationDocumentNotReadable.value -> VerificationDocumentNotReadable
      VerificationDocumentNotSigned.value -> VerificationDocumentNotSigned
      VerificationDocumentNotUploaded.value -> VerificationDocumentNotUploaded
      VerificationDocumentPhotoMismatch.value -> VerificationDocumentPhotoMismatch
      VerificationDocumentTooLarge.value -> VerificationDocumentTooLarge
      VerificationDocumentTypeNotSupported.value -> VerificationDocumentTypeNotSupported
      VerificationExtraneousDirectors.value -> VerificationExtraneousDirectors
      VerificationFailedAddressMatch.value -> VerificationFailedAddressMatch
      VerificationFailedAuthorizerAuthority.value -> VerificationFailedAuthorizerAuthority
      VerificationFailedBusinessIecNumber.value -> VerificationFailedBusinessIecNumber
      VerificationFailedDocumentMatch.value -> VerificationFailedDocumentMatch
      VerificationFailedIdNumberMatch.value -> VerificationFailedIdNumberMatch
      VerificationFailedKeyedIdentity.value -> VerificationFailedKeyedIdentity
      VerificationFailedKeyedMatch.value -> VerificationFailedKeyedMatch
      VerificationFailedNameMatch.value -> VerificationFailedNameMatch
      VerificationFailedOther.value -> VerificationFailedOther
      VerificationFailedRepresentativeAuthority.value -> VerificationFailedRepresentativeAuthority
      VerificationFailedResidentialAddress.value -> VerificationFailedResidentialAddress
      VerificationFailedTaxIdMatch.value -> VerificationFailedTaxIdMatch
      VerificationFailedTaxIdNotIssued.value -> VerificationFailedTaxIdNotIssued
      VerificationLegalEntityStructureMismatch.value -> VerificationLegalEntityStructureMismatch
      VerificationMissingDirectors.value -> VerificationMissingDirectors
      VerificationMissingExecutives.value -> VerificationMissingExecutives
      VerificationMissingOwners.value -> VerificationMissingOwners
      VerificationRejectedOwnershipExemptionReason.value -> VerificationRejectedOwnershipExemptionReason
      VerificationRequiresAdditionalMemorandumOfAssociations.value -> VerificationRequiresAdditionalMemorandumOfAssociations
      VerificationRequiresAdditionalProofOfRegistration.value -> VerificationRequiresAdditionalProofOfRegistration
      VerificationSupportability.value -> VerificationSupportability
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAccountRequirementsErrorCodeX13a67bc5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineAccountRequirementsErrorCodeX13a67bc5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountRequirementsErrorCodeX13a67bc5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountRequirementsErrorCodeX13a67bc5) {
      encoder.encodeString(value.value)
    }
  }
}
