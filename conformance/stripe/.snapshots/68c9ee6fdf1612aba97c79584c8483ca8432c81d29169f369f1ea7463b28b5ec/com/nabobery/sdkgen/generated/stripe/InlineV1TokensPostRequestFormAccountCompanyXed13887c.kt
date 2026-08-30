package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/company
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountCompanyXed13887c.Serializer::class)
public class InlineV1TokensPostRequestFormAccountCompanyXed13887c(
  public val address: InlineV1TokensPostRequestFormAccountCompanyAddressX1110443c? = null,
  public val addressKana: InlineV1TokensPostRequestFormAccountCompanyAddressKanaXc691bf16? = null,
  public val addressKanji: InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4? = null,
  public val directorsProvided: Boolean? = null,
  public val directorshipDeclaration:
      InlineV1TokensPostRequestFormAccountCompanyDirectorshipDeclarationX1b280f45? = null,
  public val executivesProvided: Boolean? = null,
  public val exportLicenseId: String? = null,
  public val exportPurposeCode: String? = null,
  public val name: String? = null,
  public val nameKana: String? = null,
  public val nameKanji: String? = null,
  public val ownersProvided: Boolean? = null,
  public val ownershipDeclaration:
      InlineV1TokensPostRequestFormAccountCompanyOwnershipDeclarationX626d044c? = null,
  public val ownershipDeclarationShownAndSigned: Boolean? = null,
  public val ownershipExemptionReason:
      InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988? = null,
  public val phone: String? = null,
  public val registrationDate:
      InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b? = null,
  public val registrationNumber: String? = null,
  public val representativeDeclaration:
      InlineV1TokensPostRequestFormAccountCompanyRepresentativeDeclarationXdf264256? = null,
  public val structure: InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343? = null,
  public val taxId: String? = null,
  public val taxIdRegistrar: String? = null,
  public val vatId: String? = null,
  public val verification: InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec? = null,
) {
  public class Builder {
    public var address: InlineV1TokensPostRequestFormAccountCompanyAddressX1110443c? = null

    public var addressKana: InlineV1TokensPostRequestFormAccountCompanyAddressKanaXc691bf16? = null

    public var addressKanji: InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4? =
        null

    public var directorsProvided: Boolean? = null

    public var directorshipDeclaration:
        InlineV1TokensPostRequestFormAccountCompanyDirectorshipDeclarationX1b280f45? = null

    public var executivesProvided: Boolean? = null

    public var exportLicenseId: String? = null

    public var exportPurposeCode: String? = null

    public var name: String? = null

    public var nameKana: String? = null

    public var nameKanji: String? = null

    public var ownersProvided: Boolean? = null

    public var ownershipDeclaration:
        InlineV1TokensPostRequestFormAccountCompanyOwnershipDeclarationX626d044c? = null

    public var ownershipDeclarationShownAndSigned: Boolean? = null

    public var ownershipExemptionReason:
        InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988? = null

    public var phone: String? = null

    public var registrationDate:
        InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b? = null

    public var registrationNumber: String? = null

    public var representativeDeclaration:
        InlineV1TokensPostRequestFormAccountCompanyRepresentativeDeclarationXdf264256? = null

    public var structure: InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343? = null

    public var taxId: String? = null

    public var taxIdRegistrar: String? = null

    public var vatId: String? = null

    public var verification: InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec? =
        null

    public fun build(): InlineV1TokensPostRequestFormAccountCompanyXed13887c = InlineV1TokensPostRequestFormAccountCompanyXed13887c(
      address = address,
      addressKana = addressKana,
      addressKanji = addressKanji,
      directorsProvided = directorsProvided,
      directorshipDeclaration = directorshipDeclaration,
      executivesProvided = executivesProvided,
      exportLicenseId = exportLicenseId,
      exportPurposeCode = exportPurposeCode,
      name = name,
      nameKana = nameKana,
      nameKanji = nameKanji,
      ownersProvided = ownersProvided,
      ownershipDeclaration = ownershipDeclaration,
      ownershipDeclarationShownAndSigned = ownershipDeclarationShownAndSigned,
      ownershipExemptionReason = ownershipExemptionReason,
      phone = phone,
      registrationDate = registrationDate,
      registrationNumber = registrationNumber,
      representativeDeclaration = representativeDeclaration,
      structure = structure,
      taxId = taxId,
      taxIdRegistrar = taxIdRegistrar,
      vatId = vatId,
      verification = verification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormAccountCompanyXed13887c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountCompanyXed13887c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountCompanyXed13887c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountCompanyXed13887c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormAccountCompanyXed13887c must be a JSON object")
      return InlineV1TokensPostRequestFormAccountCompanyXed13887c(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyAddressX1110443c>(it) },
        addressKana = rawObject["address_kana"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyAddressKanaXc691bf16>(it) },
        addressKanji = rawObject["address_kanji"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyAddressKanjiX000c8ab4>(it) },
        directorsProvided = rawObject["directors_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        directorshipDeclaration = rawObject["directorship_declaration"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyDirectorshipDeclarationX1b280f45>(it) },
        executivesProvided = rawObject["executives_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        exportLicenseId = rawObject["export_license_id"]?.let { json.decodeFromJsonElement<String>(it) },
        exportPurposeCode = rawObject["export_purpose_code"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nameKana = rawObject["name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        nameKanji = rawObject["name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        ownersProvided = rawObject["owners_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        ownershipDeclaration = rawObject["ownership_declaration"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyOwnershipDeclarationX626d044c>(it) },
        ownershipDeclarationShownAndSigned = rawObject["ownership_declaration_shown_and_signed"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        ownershipExemptionReason = rawObject["ownership_exemption_reason"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyOwnershipExemptionReasonX9abd2988>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        registrationDate = rawObject["registration_date"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyRegistrationDateX9134620b>(it) },
        registrationNumber = rawObject["registration_number"]?.let { json.decodeFromJsonElement<String>(it) },
        representativeDeclaration = rawObject["representative_declaration"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyRepresentativeDeclarationXdf264256>(it) },
        structure = rawObject["structure"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyStructureXdcad5343>(it) },
        taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
        taxIdRegistrar = rawObject["tax_id_registrar"]?.let { json.decodeFromJsonElement<String>(it) },
        vatId = rawObject["vat_id"]?.let { json.decodeFromJsonElement<String>(it) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountCompanyVerificationX23f97bec>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountCompanyXed13887c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountCompanyXed13887c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.addressKana?.let { put("address_kana", json.encodeToJsonElement(it)) }
        value.addressKanji?.let { put("address_kanji", json.encodeToJsonElement(it)) }
        value.directorsProvided?.let { put("directors_provided", json.encodeToJsonElement(it)) }
        value.directorshipDeclaration?.let { put("directorship_declaration", json.encodeToJsonElement(it)) }
        value.executivesProvided?.let { put("executives_provided", json.encodeToJsonElement(it)) }
        value.exportLicenseId?.let { put("export_license_id", it) }
        value.exportPurposeCode?.let { put("export_purpose_code", it) }
        value.name?.let { put("name", it) }
        value.nameKana?.let { put("name_kana", it) }
        value.nameKanji?.let { put("name_kanji", it) }
        value.ownersProvided?.let { put("owners_provided", json.encodeToJsonElement(it)) }
        value.ownershipDeclaration?.let { put("ownership_declaration", json.encodeToJsonElement(it)) }
        value.ownershipDeclarationShownAndSigned?.let { put("ownership_declaration_shown_and_signed", json.encodeToJsonElement(it)) }
        value.ownershipExemptionReason?.let { put("ownership_exemption_reason", json.encodeToJsonElement(it)) }
        value.phone?.let { put("phone", it) }
        value.registrationDate?.let { put("registration_date", json.encodeToJsonElement(it)) }
        value.registrationNumber?.let { put("registration_number", it) }
        value.representativeDeclaration?.let { put("representative_declaration", json.encodeToJsonElement(it)) }
        value.structure?.let { put("structure", json.encodeToJsonElement(it)) }
        value.taxId?.let { put("tax_id", it) }
        value.taxIdRegistrar?.let { put("tax_id_registrar", it) }
        value.vatId?.let { put("vat_id", it) }
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormAccountCompanyXed13887c(block: InlineV1TokensPostRequestFormAccountCompanyXed13887c.Builder.() -> Unit): InlineV1TokensPostRequestFormAccountCompanyXed13887c = InlineV1TokensPostRequestFormAccountCompanyXed13887c.build(block)
