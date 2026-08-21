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
 * The [purpose](https://docs.stripe.com/file-upload#uploading-a-file) of the uploaded file.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/file/properties/purpose
 */
@Serializable(with = InlineFilePurposeX13abeddc.Serializer::class)
public sealed class InlineFilePurposeX13abeddc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_requirement`.
   */
  public data object AccountRequirement : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "account_requirement"
  }

  /**
   * Documented value. Wire value: `additional_verification`.
   */
  public data object AdditionalVerification : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "additional_verification"
  }

  /**
   * Documented value. Wire value: `business_icon`.
   */
  public data object BusinessIcon : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "business_icon"
  }

  /**
   * Documented value. Wire value: `business_logo`.
   */
  public data object BusinessLogo : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "business_logo"
  }

  /**
   * Documented value. Wire value: `customer_signature`.
   */
  public data object CustomerSignature : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "customer_signature"
  }

  /**
   * Documented value. Wire value: `dispute_evidence`.
   */
  public data object DisputeEvidence : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "dispute_evidence"
  }

  /**
   * Documented value. Wire value: `document_provider_identity_document`.
   */
  public data object DocumentProviderIdentityDocument : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "document_provider_identity_document"
  }

  /**
   * Documented value. Wire value: `finance_report_run`.
   */
  public data object FinanceReportRun : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "finance_report_run"
  }

  /**
   * Documented value. Wire value: `financial_account_statement`.
   */
  public data object FinancialAccountStatement : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "financial_account_statement"
  }

  /**
   * Documented value. Wire value: `identity_document`.
   */
  public data object IdentityDocument : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "identity_document"
  }

  /**
   * Documented value. Wire value: `identity_document_downloadable`.
   */
  public data object IdentityDocumentDownloadable : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "identity_document_downloadable"
  }

  /**
   * Documented value. Wire value: `issuing_regulatory_reporting`.
   */
  public data object IssuingRegulatoryReporting : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "issuing_regulatory_reporting"
  }

  /**
   * Documented value. Wire value: `pci_document`.
   */
  public data object PciDocument : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "pci_document"
  }

  /**
   * Documented value. Wire value: `platform_terms_of_service`.
   */
  public data object PlatformTermsOfService : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "platform_terms_of_service"
  }

  /**
   * Documented value. Wire value: `selfie`.
   */
  public data object Selfie : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "selfie"
  }

  /**
   * Documented value. Wire value: `sigma_scheduled_query`.
   */
  public data object SigmaScheduledQuery : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "sigma_scheduled_query"
  }

  /**
   * Documented value. Wire value: `tax_document_user_upload`.
   */
  public data object TaxDocumentUserUpload : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "tax_document_user_upload"
  }

  /**
   * Documented value. Wire value: `terminal_android_apk`.
   */
  public data object TerminalAndroidApk : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "terminal_android_apk"
  }

  /**
   * Documented value. Wire value: `terminal_reader_splashscreen`.
   */
  public data object TerminalReaderSplashscreen : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "terminal_reader_splashscreen"
  }

  /**
   * Documented value. Wire value: `terminal_wifi_certificate`.
   */
  public data object TerminalWifiCertificate : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "terminal_wifi_certificate"
  }

  /**
   * Documented value. Wire value: `terminal_wifi_private_key`.
   */
  public data object TerminalWifiPrivateKey : InlineFilePurposeX13abeddc() {
    public override val `value`: String = "terminal_wifi_private_key"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFilePurposeX13abeddc()

  public companion object {
    public fun fromValue(`value`: String): InlineFilePurposeX13abeddc = when (value) {
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

  internal object Serializer : KSerializer<InlineFilePurposeX13abeddc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineFilePurposeX13abeddc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFilePurposeX13abeddc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFilePurposeX13abeddc) {
      encoder.encodeString(value.value)
    }
  }
}
