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
 * Forward-compatible enum for sdkgen://source/openapi.json#/paths/~1v1~1files/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1files/get/parameters/4/schema
 */
@Serializable(with = InlineV1FilesGetParameterX66bae549.Serializer::class)
public sealed class InlineV1FilesGetParameterX66bae549 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_requirement`.
   */
  public data object AccountRequirement : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "account_requirement"
  }

  /**
   * Documented value. Wire value: `additional_verification`.
   */
  public data object AdditionalVerification : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "additional_verification"
  }

  /**
   * Documented value. Wire value: `business_icon`.
   */
  public data object BusinessIcon : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "business_icon"
  }

  /**
   * Documented value. Wire value: `business_logo`.
   */
  public data object BusinessLogo : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "business_logo"
  }

  /**
   * Documented value. Wire value: `customer_signature`.
   */
  public data object CustomerSignature : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "customer_signature"
  }

  /**
   * Documented value. Wire value: `dispute_evidence`.
   */
  public data object DisputeEvidence : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "dispute_evidence"
  }

  /**
   * Documented value. Wire value: `document_provider_identity_document`.
   */
  public data object DocumentProviderIdentityDocument : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "document_provider_identity_document"
  }

  /**
   * Documented value. Wire value: `finance_report_run`.
   */
  public data object FinanceReportRun : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "finance_report_run"
  }

  /**
   * Documented value. Wire value: `financial_account_statement`.
   */
  public data object FinancialAccountStatement : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "financial_account_statement"
  }

  /**
   * Documented value. Wire value: `identity_document`.
   */
  public data object IdentityDocument : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "identity_document"
  }

  /**
   * Documented value. Wire value: `identity_document_downloadable`.
   */
  public data object IdentityDocumentDownloadable : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "identity_document_downloadable"
  }

  /**
   * Documented value. Wire value: `issuing_regulatory_reporting`.
   */
  public data object IssuingRegulatoryReporting : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "issuing_regulatory_reporting"
  }

  /**
   * Documented value. Wire value: `pci_document`.
   */
  public data object PciDocument : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "pci_document"
  }

  /**
   * Documented value. Wire value: `platform_terms_of_service`.
   */
  public data object PlatformTermsOfService : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "platform_terms_of_service"
  }

  /**
   * Documented value. Wire value: `selfie`.
   */
  public data object Selfie : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "selfie"
  }

  /**
   * Documented value. Wire value: `sigma_scheduled_query`.
   */
  public data object SigmaScheduledQuery : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "sigma_scheduled_query"
  }

  /**
   * Documented value. Wire value: `tax_document_user_upload`.
   */
  public data object TaxDocumentUserUpload : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "tax_document_user_upload"
  }

  /**
   * Documented value. Wire value: `terminal_android_apk`.
   */
  public data object TerminalAndroidApk : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "terminal_android_apk"
  }

  /**
   * Documented value. Wire value: `terminal_reader_splashscreen`.
   */
  public data object TerminalReaderSplashscreen : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "terminal_reader_splashscreen"
  }

  /**
   * Documented value. Wire value: `terminal_wifi_certificate`.
   */
  public data object TerminalWifiCertificate : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "terminal_wifi_certificate"
  }

  /**
   * Documented value. Wire value: `terminal_wifi_private_key`.
   */
  public data object TerminalWifiPrivateKey : InlineV1FilesGetParameterX66bae549() {
    public override val `value`: String = "terminal_wifi_private_key"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FilesGetParameterX66bae549()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FilesGetParameterX66bae549 = when (value) {
      AccountRequirement.value -> AccountRequirement
      AdditionalVerification.value -> AdditionalVerification
      BusinessIcon.value -> BusinessIcon
      BusinessLogo.value -> BusinessLogo
      CustomerSignature.value -> CustomerSignature
      DisputeEvidence.value -> DisputeEvidence
      DocumentProviderIdentityDocument.value -> DocumentProviderIdentityDocument
      FinanceReportRun.value -> FinanceReportRun
      FinancialAccountStatement.value -> FinancialAccountStatement
      IdentityDocument.value -> IdentityDocument
      IdentityDocumentDownloadable.value -> IdentityDocumentDownloadable
      IssuingRegulatoryReporting.value -> IssuingRegulatoryReporting
      PciDocument.value -> PciDocument
      PlatformTermsOfService.value -> PlatformTermsOfService
      Selfie.value -> Selfie
      SigmaScheduledQuery.value -> SigmaScheduledQuery
      TaxDocumentUserUpload.value -> TaxDocumentUserUpload
      TerminalAndroidApk.value -> TerminalAndroidApk
      TerminalReaderSplashscreen.value -> TerminalReaderSplashscreen
      TerminalWifiCertificate.value -> TerminalWifiCertificate
      TerminalWifiPrivateKey.value -> TerminalWifiPrivateKey
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1FilesGetParameterX66bae549> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1FilesGetParameterX66bae549", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FilesGetParameterX66bae549 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FilesGetParameterX66bae549) {
      encoder.encodeString(value.value)
    }
  }
}
