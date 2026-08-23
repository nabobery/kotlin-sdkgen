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
 * Information about the company or business. This field is available for any `business_type`. Once you create an
 * [Account Link](/api/account_links) or [Account Session](/api/account_sessions), this property can only be updated for
 * accounts where
 * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
 * `application`, which includes Custom accounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/company
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyXa0d80ea7.Serializer::class)
public class InlineV1AccountsPostRequestFormCompanyXa0d80ea7(
  public val address: InlineV1AccountsPostRequestFormCompanyAddressX82dc9803? = null,
  public val addressKana: InlineV1AccountsPostRequestFormCompanyAddressKanaX48a5d4fb? = null,
  public val addressKanji: InlineV1AccountsPostRequestFormCompanyAddressKanjiX7feb192a? = null,
  public val directorsProvided: Boolean? = null,
  public val directorshipDeclaration:
      InlineV1AccountsPostRequestFormCompanyDirectorshipDeclarationX283f0f23? = null,
  public val executivesProvided: Boolean? = null,
  public val exportLicenseId: String? = null,
  public val exportPurposeCode: String? = null,
  public val name: String? = null,
  public val nameKana: String? = null,
  public val nameKanji: String? = null,
  public val ownersProvided: Boolean? = null,
  public val ownershipDeclaration:
      InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationX2961bcc2? = null,
  public val ownershipExemptionReason:
      InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372? = null,
  public val phone: String? = null,
  public val registrationDate:
      InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf? = null,
  public val registrationNumber: String? = null,
  public val representativeDeclaration:
      InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationXfb9255a1? = null,
  public val structure: InlineV1AccountsPostRequestFormCompanyStructureXcf7a7919? = null,
  public val taxId: String? = null,
  public val taxIdRegistrar: String? = null,
  public val vatId: String? = null,
  public val verification: InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04? = null,
) {
  public class Builder {
    public var address: InlineV1AccountsPostRequestFormCompanyAddressX82dc9803? = null

    public var addressKana: InlineV1AccountsPostRequestFormCompanyAddressKanaX48a5d4fb? = null

    public var addressKanji: InlineV1AccountsPostRequestFormCompanyAddressKanjiX7feb192a? = null

    public var directorsProvided: Boolean? = null

    public var directorshipDeclaration:
        InlineV1AccountsPostRequestFormCompanyDirectorshipDeclarationX283f0f23? = null

    public var executivesProvided: Boolean? = null

    public var exportLicenseId: String? = null

    public var exportPurposeCode: String? = null

    public var name: String? = null

    public var nameKana: String? = null

    public var nameKanji: String? = null

    public var ownersProvided: Boolean? = null

    public var ownershipDeclaration:
        InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationX2961bcc2? = null

    public var ownershipExemptionReason:
        InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372? = null

    public var phone: String? = null

    public var registrationDate: InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf? =
        null

    public var registrationNumber: String? = null

    public var representativeDeclaration:
        InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationXfb9255a1? = null

    public var structure: InlineV1AccountsPostRequestFormCompanyStructureXcf7a7919? = null

    public var taxId: String? = null

    public var taxIdRegistrar: String? = null

    public var vatId: String? = null

    public var verification: InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04? = null

    public fun build(): InlineV1AccountsPostRequestFormCompanyXa0d80ea7 = InlineV1AccountsPostRequestFormCompanyXa0d80ea7(
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
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyXa0d80ea7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyXa0d80ea7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCompanyXa0d80ea7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCompanyXa0d80ea7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCompanyXa0d80ea7 must be a JSON object")
      return InlineV1AccountsPostRequestFormCompanyXa0d80ea7(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyAddressX82dc9803>(it) },
        addressKana = rawObject["address_kana"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyAddressKanaX48a5d4fb>(it) },
        addressKanji = rawObject["address_kanji"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyAddressKanjiX7feb192a>(it) },
        directorsProvided = rawObject["directors_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        directorshipDeclaration = rawObject["directorship_declaration"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyDirectorshipDeclarationX283f0f23>(it) },
        executivesProvided = rawObject["executives_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        exportLicenseId = rawObject["export_license_id"]?.let { json.decodeFromJsonElement<String>(it) },
        exportPurposeCode = rawObject["export_purpose_code"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        nameKana = rawObject["name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        nameKanji = rawObject["name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        ownersProvided = rawObject["owners_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        ownershipDeclaration = rawObject["ownership_declaration"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyOwnershipDeclarationX2961bcc2>(it) },
        ownershipExemptionReason = rawObject["ownership_exemption_reason"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyOwnershipExemptionReasonX853ea372>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        registrationDate = rawObject["registration_date"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf>(it) },
        registrationNumber = rawObject["registration_number"]?.let { json.decodeFromJsonElement<String>(it) },
        representativeDeclaration = rawObject["representative_declaration"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyRepresentativeDeclarationXfb9255a1>(it) },
        structure = rawObject["structure"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyStructureXcf7a7919>(it) },
        taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
        taxIdRegistrar = rawObject["tax_id_registrar"]?.let { json.decodeFromJsonElement<String>(it) },
        vatId = rawObject["vat_id"]?.let { json.decodeFromJsonElement<String>(it) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyVerificationXb377cb04>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCompanyXa0d80ea7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCompanyXa0d80ea7")
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

public fun inlineV1AccountsPostRequestFormCompanyXa0d80ea7(block: InlineV1AccountsPostRequestFormCompanyXa0d80ea7.Builder.() -> Unit): InlineV1AccountsPostRequestFormCompanyXa0d80ea7 = InlineV1AccountsPostRequestFormCompanyXa0d80ea7.build(block)
