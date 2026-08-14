package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Documents that may be submitted to satisfy various informational requests.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsX9ce2e389.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsX9ce2e389(
  public val bankAccountOwnershipVerification:
      InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28? = null,
  public val companyLicense:
      InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX6d61b7c1? = null,
  public val companyMemorandumOfAssociation:
      InlineV1AccountsPostRequestFormDocumentsCompanyMemorandumOfAssociationX750f32be? = null,
  public val companyMinisterialDecree:
      InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c? = null,
  public val companyRegistrationVerification:
      InlineV1AccountsPostRequestFormDocumentsCompanyRegistrationVerificationX1624a350? = null,
  public val companyTaxIdVerification:
      InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b? = null,
  public val proofOfAddress:
      InlineV1AccountsPostRequestFormDocumentsProofOfAddressXf0e6adb0? = null,
  public val proofOfRegistration:
      InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f? = null,
  public val proofOfUltimateBeneficialOwnership:
      InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6X359786cc? = null,
) {
  public class Builder {
    public var bankAccountOwnershipVerification:
        InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28? = null

    public var companyLicense: InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX6d61b7c1? =
        null

    public var companyMemorandumOfAssociation:
        InlineV1AccountsPostRequestFormDocumentsCompanyMemorandumOfAssociationX750f32be? = null

    public var companyMinisterialDecree:
        InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c? = null

    public var companyRegistrationVerification:
        InlineV1AccountsPostRequestFormDocumentsCompanyRegistrationVerificationX1624a350? = null

    public var companyTaxIdVerification:
        InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b? = null

    public var proofOfAddress: InlineV1AccountsPostRequestFormDocumentsProofOfAddressXf0e6adb0? =
        null

    public var proofOfRegistration:
        InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f? = null

    public var proofOfUltimateBeneficialOwnership:
        InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6X359786cc? = null

    public fun build(): InlineV1AccountsPostRequestFormDocumentsX9ce2e389 = InlineV1AccountsPostRequestFormDocumentsX9ce2e389(
      bankAccountOwnershipVerification = bankAccountOwnershipVerification,
      companyLicense = companyLicense,
      companyMemorandumOfAssociation = companyMemorandumOfAssociation,
      companyMinisterialDecree = companyMinisterialDecree,
      companyRegistrationVerification = companyRegistrationVerification,
      companyTaxIdVerification = companyTaxIdVerification,
      proofOfAddress = proofOfAddress,
      proofOfRegistration = proofOfRegistration,
      proofOfUltimateBeneficialOwnership = proofOfUltimateBeneficialOwnership,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsX9ce2e389 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsX9ce2e389> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormDocumentsX9ce2e389 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormDocumentsX9ce2e389")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormDocumentsX9ce2e389 must be a JSON object")
      return InlineV1AccountsPostRequestFormDocumentsX9ce2e389(
        bankAccountOwnershipVerification = rawObject["bank_account_ownership_verification"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eXedf86e28>(it) },
        companyLicense = rawObject["company_license"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX6d61b7c1>(it) },
        companyMemorandumOfAssociation = rawObject["company_memorandum_of_association"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyMemorandumOfAssociationX750f32be>(it) },
        companyMinisterialDecree = rawObject["company_ministerial_decree"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX15db2e3c>(it) },
        companyRegistrationVerification = rawObject["company_registration_verification"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyRegistrationVerificationX1624a350>(it) },
        companyTaxIdVerification = rawObject["company_tax_id_verification"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX446d7e1b>(it) },
        proofOfAddress = rawObject["proof_of_address"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsProofOfAddressXf0e6adb0>(it) },
        proofOfRegistration = rawObject["proof_of_registration"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f>(it) },
        proofOfUltimateBeneficialOwnership = rawObject["proof_of_ultimate_beneficial_ownership"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6X359786cc>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormDocumentsX9ce2e389) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormDocumentsX9ce2e389")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankAccountOwnershipVerification?.let { put("bank_account_ownership_verification", json.encodeToJsonElement(it)) }
        value.companyLicense?.let { put("company_license", json.encodeToJsonElement(it)) }
        value.companyMemorandumOfAssociation?.let { put("company_memorandum_of_association", json.encodeToJsonElement(it)) }
        value.companyMinisterialDecree?.let { put("company_ministerial_decree", json.encodeToJsonElement(it)) }
        value.companyRegistrationVerification?.let { put("company_registration_verification", json.encodeToJsonElement(it)) }
        value.companyTaxIdVerification?.let { put("company_tax_id_verification", json.encodeToJsonElement(it)) }
        value.proofOfAddress?.let { put("proof_of_address", json.encodeToJsonElement(it)) }
        value.proofOfRegistration?.let { put("proof_of_registration", json.encodeToJsonElement(it)) }
        value.proofOfUltimateBeneficialOwnership?.let { put("proof_of_ultimate_beneficial_ownership", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormDocumentsX9ce2e389(block: InlineV1AccountsPostRequestFormDocumentsX9ce2e389.Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsX9ce2e389 = InlineV1AccountsPostRequestFormDocumentsX9ce2e389.build(block)
