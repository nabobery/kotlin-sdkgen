package com.nabobery.sdkgen.generated.stripe

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
import kotlin.Unit

/**
 * Documents that may be submitted to satisfy various informational requests.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/documents
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsXe7387a38.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsXe7387a38(
    public val bankAccountOwnershipVerification:
        InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eX9d88d873? = null,
    public val companyLicense: InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6? = null,
    public val companyMemorandumOfAssociation:
        InlineV1AccountsPostRequestFormDocumentsCompanyMemorandumOfAssociationX80949ef2? = null,
    public val companyMinisterialDecree:
        InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX4c2fa998? = null,
    public val companyRegistrationVerification:
        InlineV1AccountsPostRequestFormDocumentsCompanyRegistrationVerificationXff986ea0? = null,
    public val companyTaxIdVerification:
        InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX110cc135? = null,
    public val proofOfAddress: InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3? = null,
    public val proofOfRegistration: InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXe7e0491e? = null,
    public val proofOfUltimateBeneficialOwnership:
        InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4? = null,
) {
    public class Builder {
        public var bankAccountOwnershipVerification:
            InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eX9d88d873? = null

        public var companyLicense: InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6? =
            null

        public var companyMemorandumOfAssociation:
            InlineV1AccountsPostRequestFormDocumentsCompanyMemorandumOfAssociationX80949ef2? = null

        public var companyMinisterialDecree:
            InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX4c2fa998? = null

        public var companyRegistrationVerification:
            InlineV1AccountsPostRequestFormDocumentsCompanyRegistrationVerificationXff986ea0? = null

        public var companyTaxIdVerification:
            InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX110cc135? = null

        public var proofOfAddress: InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3? =
            null

        public var proofOfRegistration:
            InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXe7e0491e? = null

        public var proofOfUltimateBeneficialOwnership:
            InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4? = null

        public fun build(): InlineV1AccountsPostRequestFormDocumentsXe7387a38 =
            InlineV1AccountsPostRequestFormDocumentsXe7387a38(
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
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsXe7387a38 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsXe7387a38> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormDocumentsXe7387a38 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormDocumentsXe7387a38")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormDocumentsXe7387a38 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormDocumentsXe7387a38(
                bankAccountOwnershipVerification =
                    rawObject["bank_account_ownership_verification"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsBankAccountOwnership2a7eX9d88d873>(
                                it,
                            )
                    },
                companyLicense =
                    rawObject["company_license"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyLicenseX39466ea6>(it)
                    },
                companyMemorandumOfAssociation =
                    rawObject["company_memorandum_of_association"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyMemorandumOfAssociationX80949ef2>(
                                it,
                            )
                    },
                companyMinisterialDecree =
                    rawObject["company_ministerial_decree"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyMinisterialDecreeX4c2fa998>(
                                it,
                            )
                    },
                companyRegistrationVerification =
                    rawObject["company_registration_verification"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyRegistrationVerificationXff986ea0>(
                                it,
                            )
                    },
                companyTaxIdVerification =
                    rawObject["company_tax_id_verification"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsCompanyTaxIdVerificationX110cc135>(
                                it,
                            )
                    },
                proofOfAddress =
                    rawObject["proof_of_address"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsProofOfAddressX19ec63f3>(it)
                    },
                proofOfRegistration =
                    rawObject["proof_of_registration"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXe7e0491e>(
                                it,
                            )
                    },
                proofOfUltimateBeneficialOwnership =
                    rawObject["proof_of_ultimate_beneficial_ownership"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsProofOfUltimateBenefebd6Xf05366c4>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormDocumentsXe7387a38,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormDocumentsXe7387a38")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bankAccountOwnershipVerification?.let {
                        put(
                            "bank_account_ownership_verification",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.companyLicense?.let { put("company_license", json.encodeToJsonElement(it)) }
                    value.companyMemorandumOfAssociation?.let {
                        put(
                            "company_memorandum_of_association",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.companyMinisterialDecree?.let {
                        put(
                            "company_ministerial_decree",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.companyRegistrationVerification?.let {
                        put(
                            "company_registration_verification",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.companyTaxIdVerification?.let {
                        put(
                            "company_tax_id_verification",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.proofOfAddress?.let { put("proof_of_address", json.encodeToJsonElement(it)) }
                    value.proofOfRegistration?.let { put("proof_of_registration", json.encodeToJsonElement(it)) }
                    value.proofOfUltimateBeneficialOwnership?.let {
                        put("proof_of_ultimate_beneficial_ownership", json.encodeToJsonElement(it))
                    }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormDocumentsXe7387a38(
    block: InlineV1AccountsPostRequestFormDocumentsXe7387a38.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormDocumentsXe7387a38 = InlineV1AccountsPostRequestFormDocumentsXe7387a38.build(block)
