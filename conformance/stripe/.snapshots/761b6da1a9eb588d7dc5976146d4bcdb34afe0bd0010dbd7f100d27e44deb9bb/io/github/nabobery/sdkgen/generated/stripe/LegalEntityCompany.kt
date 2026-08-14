package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_company
 */
@Serializable(with = LegalEntityCompany.Serializer::class)
public class LegalEntityCompany(
  public val address: Address? = null,
  /**
   * The Kana variation of the company's primary address (Japan only).
   */
  public val addressKana: InlineLegalEntityCompanyAddressKanaX7ebf9838? = null,
  /**
   * The Kanji variation of the company's primary address (Japan only).
   */
  public val addressKanji: InlineLegalEntityCompanyAddressKanjiX8e147090? = null,
  /**
   * Whether the company's directors have been provided. This Boolean will be `true` if you've manually indicated that
   * all directors are provided via [the `directors_provided`
   * parameter](https://docs.stripe.com/api/accounts/update#update_account-company-directors_provided).
   */
  public val directorsProvided: Boolean? = null,
  /**
   * This hash is used to attest that the director information provided to Stripe is both current and correct.
   */
  public val directorshipDeclaration:
      InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f? = null,
  /**
   * Whether the company's executives have been provided. This Boolean will be `true` if you've manually indicated that
   * all executives are provided via [the `executives_provided`
   * parameter](https://docs.stripe.com/api/accounts/update#update_account-company-executives_provided), or if Stripe
   * determined that sufficient executives were provided.
   */
  public val executivesProvided: Boolean? = null,
  /**
   * The export license ID number of the company, also referred as Import Export Code (India only).
   */
  public val exportLicenseId: String? = null,
  /**
   * The purpose code to use for export transactions (India only).
   */
  public val exportPurposeCode: String? = null,
  /**
   * The company's legal name. Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val name: String? = null,
  /**
   * The Kana variation of the company's legal name (Japan only). Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val nameKana: String? = null,
  /**
   * The Kanji variation of the company's legal name (Japan only). Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val nameKanji: String? = null,
  /**
   * Whether the company's owners have been provided. This Boolean will be `true` if you've manually indicated that all
   * owners are provided via [the `owners_provided`
   * parameter](https://docs.stripe.com/api/accounts/update#update_account-company-owners_provided), or if Stripe
   * determined that sufficient owners were provided. Stripe determines ownership requirements using both the number of
   * owners provided and their total percent ownership (calculated by adding the `percent_ownership` of each owner
   * together).
   */
  public val ownersProvided: Boolean? = null,
  /**
   * This hash is used to attest that the beneficial owner information provided to Stripe is both current and correct.
   */
  public val ownershipDeclaration: InlineLegalEntityCompanyOwnershipDeclarationXa6540302? = null,
  /**
   * This value is used to determine if a business is exempt from providing ultimate beneficial owners. See [this
   * support article](https://support.stripe.com/questions/exemption-from-providing-ownership-details) and
   * [changelog](https://docs.stripe.com/changelog/acacia/2025-01-27/ownership-exemption-reason-accounts-api) for more
   * details.
   */
  public val ownershipExemptionReason:
      InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628? = null,
  /**
   * The company's phone number (used for verification).
   */
  public val phone: String? = null,
  public val registrationDate: LegalEntityRegistrationDate? = null,
  /**
   * This hash is used to attest that the representative is authorized to act as the representative of their legal
   * entity.
   */
  public val representativeDeclaration:
      InlineLegalEntityCompanyRepresentativeDeclarationXb8056469? = null,
  /**
   * The category identifying the legal structure of the company or legal entity. Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`. See [Business structure](https://docs.stripe.com/connect/identity-verification#business-structure) for
   * more details.
   */
  public val structure: InlineLegalEntityCompanyStructureX496bc498? = null,
  /**
   * Whether the company's business ID number was provided.
   */
  public val taxIdProvided: Boolean? = null,
  /**
   * The jurisdiction in which the `tax_id` is registered (Germany-based companies only).
   */
  public val taxIdRegistrar: String? = null,
  /**
   * Whether the company's business VAT number was provided.
   */
  public val vatIdProvided: Boolean? = null,
  /**
   * Information on the verification state of the company.
   */
  public val verification: InlineLegalEntityCompanyVerificationX01f25840? = null,
) {
  public class Builder {
    public var address: Address? = null

    /**
     * The Kana variation of the company's primary address (Japan only).
     */
    public var addressKana: InlineLegalEntityCompanyAddressKanaX7ebf9838? = null

    /**
     * The Kanji variation of the company's primary address (Japan only).
     */
    public var addressKanji: InlineLegalEntityCompanyAddressKanjiX8e147090? = null

    /**
     * Whether the company's directors have been provided. This Boolean will be `true` if you've manually indicated that
     * all directors are provided via [the `directors_provided`
     * parameter](https://docs.stripe.com/api/accounts/update#update_account-company-directors_provided).
     */
    public var directorsProvided: Boolean? = null

    /**
     * This hash is used to attest that the director information provided to Stripe is both current and correct.
     */
    public var directorshipDeclaration: InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f? =
        null

    /**
     * Whether the company's executives have been provided. This Boolean will be `true` if you've manually indicated
     * that all executives are provided via [the `executives_provided`
     * parameter](https://docs.stripe.com/api/accounts/update#update_account-company-executives_provided), or if Stripe
     * determined that sufficient executives were provided.
     */
    public var executivesProvided: Boolean? = null

    /**
     * The export license ID number of the company, also referred as Import Export Code (India only).
     */
    public var exportLicenseId: String? = null

    /**
     * The purpose code to use for export transactions (India only).
     */
    public var exportPurposeCode: String? = null

    /**
     * The company's legal name. Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var name: String? = null

    /**
     * The Kana variation of the company's legal name (Japan only). Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var nameKana: String? = null

    /**
     * The Kanji variation of the company's legal name (Japan only). Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var nameKanji: String? = null

    /**
     * Whether the company's owners have been provided. This Boolean will be `true` if you've manually indicated that
     * all owners are provided via [the `owners_provided`
     * parameter](https://docs.stripe.com/api/accounts/update#update_account-company-owners_provided), or if Stripe
     * determined that sufficient owners were provided. Stripe determines ownership requirements using both the number
     * of owners provided and their total percent ownership (calculated by adding the `percent_ownership` of each owner
     * together).
     */
    public var ownersProvided: Boolean? = null

    /**
     * This hash is used to attest that the beneficial owner information provided to Stripe is both current and correct.
     */
    public var ownershipDeclaration: InlineLegalEntityCompanyOwnershipDeclarationXa6540302? = null

    /**
     * This value is used to determine if a business is exempt from providing ultimate beneficial owners. See [this
     * support article](https://support.stripe.com/questions/exemption-from-providing-ownership-details) and
     * [changelog](https://docs.stripe.com/changelog/acacia/2025-01-27/ownership-exemption-reason-accounts-api) for more
     * details.
     */
    public var ownershipExemptionReason: InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628?
        = null

    /**
     * The company's phone number (used for verification).
     */
    public var phone: String? = null

    public var registrationDate: LegalEntityRegistrationDate? = null

    /**
     * This hash is used to attest that the representative is authorized to act as the representative of their legal
     * entity.
     */
    public var representativeDeclaration:
        InlineLegalEntityCompanyRepresentativeDeclarationXb8056469? = null

    /**
     * The category identifying the legal structure of the company or legal entity. Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`. See [Business structure](https://docs.stripe.com/connect/identity-verification#business-structure) for
     * more details.
     */
    public var structure: InlineLegalEntityCompanyStructureX496bc498? = null

    /**
     * Whether the company's business ID number was provided.
     */
    public var taxIdProvided: Boolean? = null

    /**
     * The jurisdiction in which the `tax_id` is registered (Germany-based companies only).
     */
    public var taxIdRegistrar: String? = null

    /**
     * Whether the company's business VAT number was provided.
     */
    public var vatIdProvided: Boolean? = null

    /**
     * Information on the verification state of the company.
     */
    public var verification: InlineLegalEntityCompanyVerificationX01f25840? = null

    public fun build(): LegalEntityCompany = LegalEntityCompany(
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
      representativeDeclaration = representativeDeclaration,
      structure = structure,
      taxIdProvided = taxIdProvided,
      taxIdRegistrar = taxIdRegistrar,
      vatIdProvided = vatIdProvided,
      verification = verification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LegalEntityCompany = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LegalEntityCompany> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LegalEntityCompany {
      val jsonDecoder = decoder.requireJsonDecoder("LegalEntityCompany")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LegalEntityCompany must be a JSON object")
      return LegalEntityCompany(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<Address>(it) },
        addressKana = rawObject["address_kana"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityCompanyAddressKanaX7ebf9838?>(element) },
        addressKanji = rawObject["address_kanji"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityCompanyAddressKanjiX8e147090?>(element) },
        directorsProvided = rawObject["directors_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        directorshipDeclaration = rawObject["directorship_declaration"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityCompanyDirectorshipDeclarationX2b6baa8f?>(element) },
        executivesProvided = rawObject["executives_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        exportLicenseId = rawObject["export_license_id"]?.let { json.decodeFromJsonElement<String>(it) },
        exportPurposeCode = rawObject["export_purpose_code"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        nameKana = rawObject["name_kana"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        nameKanji = rawObject["name_kanji"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        ownersProvided = rawObject["owners_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        ownershipDeclaration = rawObject["ownership_declaration"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityCompanyOwnershipDeclarationXa6540302?>(element) },
        ownershipExemptionReason = rawObject["ownership_exemption_reason"]?.let { json.decodeFromJsonElement<InlineLegalEntityCompanyOwnershipExemptionReasonXfabbe628>(it) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        registrationDate = rawObject["registration_date"]?.let { json.decodeFromJsonElement<LegalEntityRegistrationDate>(it) },
        representativeDeclaration = rawObject["representative_declaration"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityCompanyRepresentativeDeclarationXb8056469?>(element) },
        structure = rawObject["structure"]?.let { json.decodeFromJsonElement<InlineLegalEntityCompanyStructureX496bc498>(it) },
        taxIdProvided = rawObject["tax_id_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        taxIdRegistrar = rawObject["tax_id_registrar"]?.let { json.decodeFromJsonElement<String>(it) },
        vatIdProvided = rawObject["vat_id_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        verification = rawObject["verification"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLegalEntityCompanyVerificationX01f25840?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LegalEntityCompany) {
      val jsonEncoder = encoder.requireJsonEncoder("LegalEntityCompany")
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
        value.representativeDeclaration?.let { put("representative_declaration", json.encodeToJsonElement(it)) }
        value.structure?.let { put("structure", json.encodeToJsonElement(it)) }
        value.taxIdProvided?.let { put("tax_id_provided", json.encodeToJsonElement(it)) }
        value.taxIdRegistrar?.let { put("tax_id_registrar", it) }
        value.vatIdProvided?.let { put("vat_id_provided", json.encodeToJsonElement(it)) }
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun legalEntityCompany(block: LegalEntityCompany.Builder.() -> Unit): LegalEntityCompany = LegalEntityCompany.build(block)
