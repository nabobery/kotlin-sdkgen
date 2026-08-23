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
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1files/post/requestBody/content/multipart~1form-data/schema/properties/purpo
 * se
 */
@Serializable(with = InlineV1FilesPostRequestMultipartPurposeX06371c52.Serializer::class)
public sealed class InlineV1FilesPostRequestMultipartPurposeX06371c52 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account_requirement`.
   */
  public data object AccountRequirement : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "account_requirement"
  }

  /**
   * Documented value. Wire value: `additional_verification`.
   */
  public data object AdditionalVerification : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "additional_verification"
  }

  /**
   * Documented value. Wire value: `business_icon`.
   */
  public data object BusinessIcon : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "business_icon"
  }

  /**
   * Documented value. Wire value: `business_logo`.
   */
  public data object BusinessLogo : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "business_logo"
  }

  /**
   * Documented value. Wire value: `customer_signature`.
   */
  public data object CustomerSignature : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "customer_signature"
  }

  /**
   * Documented value. Wire value: `dispute_evidence`.
   */
  public data object DisputeEvidence : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "dispute_evidence"
  }

  /**
   * Documented value. Wire value: `identity_document`.
   */
  public data object IdentityDocument : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "identity_document"
  }

  /**
   * Documented value. Wire value: `issuing_regulatory_reporting`.
   */
  public data object IssuingRegulatoryReporting : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "issuing_regulatory_reporting"
  }

  /**
   * Documented value. Wire value: `pci_document`.
   */
  public data object PciDocument : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "pci_document"
  }

  /**
   * Documented value. Wire value: `platform_terms_of_service`.
   */
  public data object PlatformTermsOfService : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "platform_terms_of_service"
  }

  /**
   * Documented value. Wire value: `tax_document_user_upload`.
   */
  public data object TaxDocumentUserUpload : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "tax_document_user_upload"
  }

  /**
   * Documented value. Wire value: `terminal_android_apk`.
   */
  public data object TerminalAndroidApk : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "terminal_android_apk"
  }

  /**
   * Documented value. Wire value: `terminal_reader_splashscreen`.
   */
  public data object TerminalReaderSplashscreen : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "terminal_reader_splashscreen"
  }

  /**
   * Documented value. Wire value: `terminal_wifi_certificate`.
   */
  public data object TerminalWifiCertificate : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "terminal_wifi_certificate"
  }

  /**
   * Documented value. Wire value: `terminal_wifi_private_key`.
   */
  public data object TerminalWifiPrivateKey : InlineV1FilesPostRequestMultipartPurposeX06371c52() {
    public override val `value`: String = "terminal_wifi_private_key"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1FilesPostRequestMultipartPurposeX06371c52()

  public companion object {
    public fun fromValue(`value`: String): InlineV1FilesPostRequestMultipartPurposeX06371c52 = when (value) {
      AccountRequirement.value -> AccountRequirement
      AdditionalVerification.value -> AdditionalVerification
      BusinessIcon.value -> BusinessIcon
      BusinessLogo.value -> BusinessLogo
      CustomerSignature.value -> CustomerSignature
      DisputeEvidence.value -> DisputeEvidence
      IdentityDocument.value -> IdentityDocument
      IssuingRegulatoryReporting.value -> IssuingRegulatoryReporting
      PciDocument.value -> PciDocument
      PlatformTermsOfService.value -> PlatformTermsOfService
      TaxDocumentUserUpload.value -> TaxDocumentUserUpload
      TerminalAndroidApk.value -> TerminalAndroidApk
      TerminalReaderSplashscreen.value -> TerminalReaderSplashscreen
      TerminalWifiCertificate.value -> TerminalWifiCertificate
      TerminalWifiPrivateKey.value -> TerminalWifiPrivateKey
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1FilesPostRequestMultipartPurposeX06371c52> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1FilesPostRequestMultipartPurposeX06371c52", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1FilesPostRequestMultipartPurposeX06371c52 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1FilesPostRequestMultipartPurposeX06371c52) {
      encoder.encodeString(value.value)
    }
  }
}
