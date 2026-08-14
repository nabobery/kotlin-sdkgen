package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormX16d9e823.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormX16d9e823(
  /**
   * Details on the legal guardian's or authorizer's acceptance of the required Stripe agreements.
   */
  public val additionalTosAcceptances:
      InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52? = null,
  /**
   * The person's address.
   */
  public val address: InlineV1AccountsPeoplePostRequestFormAddressX591c679a? = null,
  /**
   * The Kana variation of the person's address (Japan only).
   */
  public val addressKana: InlineV1AccountsPeoplePostRequestFormAddressKanaX87d1bc9a? = null,
  /**
   * The Kanji variation of the person's address (Japan only).
   */
  public val addressKanji: InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37? = null,
  /**
   * The person's date of birth.
   */
  public val dob: InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e? = null,
  /**
   * Documents that may be submitted to satisfy various informational requests.
   */
  public val documents: InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a? = null,
  /**
   * The person's email address.
   */
  public val email: String? = null,
  expand: List<String>? = null,
  /**
   * The person's first name.
   */
  public val firstName: String? = null,
  /**
   * The Kana variation of the person's first name (Japan only).
   */
  public val firstNameKana: String? = null,
  /**
   * The Kanji variation of the person's first name (Japan only).
   */
  public val firstNameKanji: String? = null,
  /**
   * A list of alternate names or aliases that the person is known by.
   */
  public val fullNameAliases: InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816? = null,
  /**
   * The person's gender (International regulations require either "male" or "female").
   */
  public val gender: String? = null,
  /**
   * The person's ID number, as appropriate for their country. For example, a social security number in the U.S., social
   * insurance number in Canada, etc. Instead of the number itself, you can also provide a [PII token provided by
   * Stripe.js](https://docs.stripe.com/js/tokens/create_token?type=pii).
   */
  public val idNumber: String? = null,
  /**
   * The person's secondary ID number, as appropriate for their country, will be used for enhanced verification checks.
   * In Thailand, this would be the laser code found on the back of an ID card. Instead of the number itself, you can
   * also provide a [PII token provided by Stripe.js](https://docs.stripe.com/js/tokens/create_token?type=pii).
   */
  public val idNumberSecondary: String? = null,
  /**
   * The person's last name.
   */
  public val lastName: String? = null,
  /**
   * The Kana variation of the person's last name (Japan only).
   */
  public val lastNameKana: String? = null,
  /**
   * The Kanji variation of the person's last name (Japan only).
   */
  public val lastNameKanji: String? = null,
  /**
   * The person's maiden name.
   */
  public val maidenName: String? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec? = null,
  /**
   * The country where the person is a national. Two-letter country code ([ISO 3166-1
   * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)), or "XX" if unavailable.
   */
  public val nationality: String? = null,
  /**
   * A [person token](https://docs.stripe.com/connect/account-tokens), used to securely provide details to the person.
   */
  public val personToken: String? = null,
  /**
   * The person's phone number.
   */
  public val phone: String? = null,
  /**
   * Indicates if the person or any of their representatives, family members, or other closely related persons, declares
   * that they hold or have held an important public job or function, in any jurisdiction.
   */
  public val politicalExposure:
      InlineV1AccountsPeoplePostRequestFormPoliticalExposureX5c41dae4? = null,
  /**
   * The person's registered address.
   */
  public val registeredAddress:
      InlineV1AccountsPeoplePostRequestFormRegisteredAddressXa789c6e0? = null,
  /**
   * The relationship that this person has with the account's legal entity.
   */
  public val relationship: InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d? = null,
  /**
   * The last four digits of the person's Social Security number (U.S. only).
   */
  public val ssnLast4: String? = null,
  /**
   * Demographic data related to the person.
   */
  public val usCfpbData: InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa? = null,
  /**
   * The person's verification status.
   */
  public val verification: InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Details on the legal guardian's or authorizer's acceptance of the required Stripe agreements.
     */
    public var additionalTosAcceptances:
        InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52? = null

    /**
     * The person's address.
     */
    public var address: InlineV1AccountsPeoplePostRequestFormAddressX591c679a? = null

    /**
     * The Kana variation of the person's address (Japan only).
     */
    public var addressKana: InlineV1AccountsPeoplePostRequestFormAddressKanaX87d1bc9a? = null

    /**
     * The Kanji variation of the person's address (Japan only).
     */
    public var addressKanji: InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37? = null

    /**
     * The person's date of birth.
     */
    public var dob: InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e? = null

    /**
     * Documents that may be submitted to satisfy various informational requests.
     */
    public var documents: InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a? = null

    /**
     * The person's email address.
     */
    public var email: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The person's first name.
     */
    public var firstName: String? = null

    /**
     * The Kana variation of the person's first name (Japan only).
     */
    public var firstNameKana: String? = null

    /**
     * The Kanji variation of the person's first name (Japan only).
     */
    public var firstNameKanji: String? = null

    /**
     * A list of alternate names or aliases that the person is known by.
     */
    public var fullNameAliases: InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816? =
        null

    /**
     * The person's gender (International regulations require either "male" or "female").
     */
    public var gender: String? = null

    /**
     * The person's ID number, as appropriate for their country. For example, a social security number in the U.S.,
     * social insurance number in Canada, etc. Instead of the number itself, you can also provide a [PII token provided
     * by Stripe.js](https://docs.stripe.com/js/tokens/create_token?type=pii).
     */
    public var idNumber: String? = null

    /**
     * The person's secondary ID number, as appropriate for their country, will be used for enhanced verification
     * checks. In Thailand, this would be the laser code found on the back of an ID card. Instead of the number itself,
     * you can also provide a [PII token provided by
     * Stripe.js](https://docs.stripe.com/js/tokens/create_token?type=pii).
     */
    public var idNumberSecondary: String? = null

    /**
     * The person's last name.
     */
    public var lastName: String? = null

    /**
     * The Kana variation of the person's last name (Japan only).
     */
    public var lastNameKana: String? = null

    /**
     * The Kanji variation of the person's last name (Japan only).
     */
    public var lastNameKanji: String? = null

    /**
     * The person's maiden name.
     */
    public var maidenName: String? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec? = null

    /**
     * The country where the person is a national. Two-letter country code ([ISO 3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)), or "XX" if unavailable.
     */
    public var nationality: String? = null

    /**
     * A [person token](https://docs.stripe.com/connect/account-tokens), used to securely provide details to the person.
     */
    public var personToken: String? = null

    /**
     * The person's phone number.
     */
    public var phone: String? = null

    /**
     * Indicates if the person or any of their representatives, family members, or other closely related persons,
     * declares that they hold or have held an important public job or function, in any jurisdiction.
     */
    public var politicalExposure: InlineV1AccountsPeoplePostRequestFormPoliticalExposureX5c41dae4? =
        null

    /**
     * The person's registered address.
     */
    public var registeredAddress: InlineV1AccountsPeoplePostRequestFormRegisteredAddressXa789c6e0? =
        null

    /**
     * The relationship that this person has with the account's legal entity.
     */
    public var relationship: InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d? = null

    /**
     * The last four digits of the person's Social Security number (U.S. only).
     */
    public var ssnLast4: String? = null

    /**
     * Demographic data related to the person.
     */
    public var usCfpbData: InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa? = null

    /**
     * The person's verification status.
     */
    public var verification: InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d? = null

    public fun build(): InlineV1AccountsPeoplePostRequestFormX16d9e823 = InlineV1AccountsPeoplePostRequestFormX16d9e823(
      additionalTosAcceptances = additionalTosAcceptances,
      address = address,
      addressKana = addressKana,
      addressKanji = addressKanji,
      dob = dob,
      documents = documents,
      email = email,
      expand = expand,
      firstName = firstName,
      firstNameKana = firstNameKana,
      firstNameKanji = firstNameKanji,
      fullNameAliases = fullNameAliases,
      gender = gender,
      idNumber = idNumber,
      idNumberSecondary = idNumberSecondary,
      lastName = lastName,
      lastNameKana = lastNameKana,
      lastNameKanji = lastNameKanji,
      maidenName = maidenName,
      metadata = metadata,
      nationality = nationality,
      personToken = personToken,
      phone = phone,
      politicalExposure = politicalExposure,
      registeredAddress = registeredAddress,
      relationship = relationship,
      ssnLast4 = ssnLast4,
      usCfpbData = usCfpbData,
      verification = verification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormX16d9e823 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormX16d9e823> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormX16d9e823 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormX16d9e823")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPeoplePostRequestFormX16d9e823 must be a JSON object")
      return InlineV1AccountsPeoplePostRequestFormX16d9e823(
        additionalTosAcceptances = rawObject["additional_tos_acceptances"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesX35344a52>(it) },
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormAddressX591c679a>(it) },
        addressKana = rawObject["address_kana"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormAddressKanaX87d1bc9a>(it) },
        addressKanji = rawObject["address_kanji"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormAddressKanjiXff7cca37>(it) },
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e>(it) },
        documents = rawObject["documents"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDocumentsXd121043a>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        firstName = rawObject["first_name"]?.let { json.decodeFromJsonElement<String>(it) },
        firstNameKana = rawObject["first_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        firstNameKanji = rawObject["first_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        fullNameAliases = rawObject["full_name_aliases"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816>(it) },
        gender = rawObject["gender"]?.let { json.decodeFromJsonElement<String>(it) },
        idNumber = rawObject["id_number"]?.let { json.decodeFromJsonElement<String>(it) },
        idNumberSecondary = rawObject["id_number_secondary"]?.let { json.decodeFromJsonElement<String>(it) },
        lastName = rawObject["last_name"]?.let { json.decodeFromJsonElement<String>(it) },
        lastNameKana = rawObject["last_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        lastNameKanji = rawObject["last_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        maidenName = rawObject["maiden_name"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec>(it) },
        nationality = rawObject["nationality"]?.let { json.decodeFromJsonElement<String>(it) },
        personToken = rawObject["person_token"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        politicalExposure = rawObject["political_exposure"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormPoliticalExposureX5c41dae4>(it) },
        registeredAddress = rawObject["registered_address"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormRegisteredAddressXa789c6e0>(it) },
        relationship = rawObject["relationship"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormRelationshipX1f8d312d>(it) },
        ssnLast4 = rawObject["ssn_last_4"]?.let { json.decodeFromJsonElement<String>(it) },
        usCfpbData = rawObject["us_cfpb_data"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormUsCfpbDataX5223c4aa>(it) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormVerificationXb9b0d33d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormX16d9e823) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormX16d9e823")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalTosAcceptances?.let { put("additional_tos_acceptances", json.encodeToJsonElement(it)) }
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.addressKana?.let { put("address_kana", json.encodeToJsonElement(it)) }
        value.addressKanji?.let { put("address_kanji", json.encodeToJsonElement(it)) }
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
        value.documents?.let { put("documents", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.firstName?.let { put("first_name", it) }
        value.firstNameKana?.let { put("first_name_kana", it) }
        value.firstNameKanji?.let { put("first_name_kanji", it) }
        value.fullNameAliases?.let { put("full_name_aliases", json.encodeToJsonElement(it)) }
        value.gender?.let { put("gender", it) }
        value.idNumber?.let { put("id_number", it) }
        value.idNumberSecondary?.let { put("id_number_secondary", it) }
        value.lastName?.let { put("last_name", it) }
        value.lastNameKana?.let { put("last_name_kana", it) }
        value.lastNameKanji?.let { put("last_name_kanji", it) }
        value.maidenName?.let { put("maiden_name", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nationality?.let { put("nationality", it) }
        value.personToken?.let { put("person_token", it) }
        value.phone?.let { put("phone", it) }
        value.politicalExposure?.let { put("political_exposure", json.encodeToJsonElement(it)) }
        value.registeredAddress?.let { put("registered_address", json.encodeToJsonElement(it)) }
        value.relationship?.let { put("relationship", json.encodeToJsonElement(it)) }
        value.ssnLast4?.let { put("ssn_last_4", it) }
        value.usCfpbData?.let { put("us_cfpb_data", json.encodeToJsonElement(it)) }
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPeoplePostRequestFormX16d9e823(block: InlineV1AccountsPeoplePostRequestFormX16d9e823.Builder.() -> Unit): InlineV1AccountsPeoplePostRequestFormX16d9e823 = InlineV1AccountsPeoplePostRequestFormX16d9e823.build(block)
