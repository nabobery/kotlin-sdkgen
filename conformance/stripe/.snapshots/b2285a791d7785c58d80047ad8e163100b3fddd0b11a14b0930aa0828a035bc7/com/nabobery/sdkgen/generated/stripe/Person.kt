package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * This is an object representing a person associated with a Stripe account.
 *
 * A platform can only access a subset of data in a person for an account where
 * [account.controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
 * `stripe`, which includes Standard and Express accounts, after creating an Account Link or Account Session to start
 * Connect onboarding.
 *
 * See the [Standard onboarding](/connect/standard-accounts) or [Express onboarding](/connect/express-accounts)
 * documentation for information about prefilling information and account onboarding steps. Learn more about [handling
 * identity verification with the API](/connect/handling-api-verification#person-information).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person
 */
@Serializable(with = Person.Serializer::class)
public class Person(
  /**
   * The account the person is associated with.
   */
  public val account: String,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlinePersonObjectValueXfffe50ab,
  public val additionalTosAcceptances: PersonAdditionalTosAcceptances? = null,
  public val address: Address? = null,
  public val addressKana: InlinePersonAddressKanaX281381e4? = null,
  public val addressKanji: InlinePersonAddressKanjiXf6c450b8? = null,
  public val dob: LegalEntityDob? = null,
  /**
   * The person's email address. Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val email: String? = null,
  /**
   * The person's first name. Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val firstName: String? = null,
  /**
   * The Kana variation of the person's first name (Japan only). Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val firstNameKana: String? = null,
  /**
   * The Kanji variation of the person's first name (Japan only). Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val firstNameKanji: String? = null,
  fullNameAliases: List<String>? = null,
  public val futureRequirements: InlinePersonFutureRequirementsXf1ad3575? = null,
  /**
   * The person's gender.
   */
  public val gender: String? = null,
  /**
   * Whether the person's `id_number` was provided. True if either the full ID number was provided or if only the
   * required part of the ID number was provided (ex. last four of an individual's SSN for the US indicated by
   * `ssn_last_4_provided`).
   */
  public val idNumberProvided: Boolean? = null,
  /**
   * Whether the person's `id_number_secondary` was provided.
   */
  public val idNumberSecondaryProvided: Boolean? = null,
  /**
   * The person's last name. Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val lastName: String? = null,
  /**
   * The Kana variation of the person's last name (Japan only). Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val lastNameKana: String? = null,
  /**
   * The Kanji variation of the person's last name (Japan only). Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val lastNameKanji: String? = null,
  /**
   * The person's maiden name.
   */
  public val maidenName: String? = null,
  metadata: Map<String, String>? = null,
  /**
   * The country where the person is a national.
   */
  public val nationality: String? = null,
  /**
   * The person's phone number.
   */
  public val phone: String? = null,
  /**
   * Indicates if the person or any of their representatives, family members, or other closely related persons, declares
   * that they hold or have held an important public job or function, in any jurisdiction.
   */
  public val politicalExposure: InlinePersonPoliticalExposureX1348f489? = null,
  public val registeredAddress: Address? = null,
  public val relationship: PersonRelationship? = null,
  public val requirements: InlinePersonRequirementsX4b681054? = null,
  /**
   * Whether the last four digits of the person's Social Security number have been provided (U.S. only).
   */
  public val ssnLast4Provided: Boolean? = null,
  /**
   * Demographic data related to the person.
   */
  public val usCfpbData: InlinePersonUsCfpbDataX411ab524? = null,
  public val verification: LegalEntityPersonVerification? = null,
) {
  /**
   * A list of alternate names or aliases that the person is known by. Also available for accounts where
   * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
   * `stripe`.
   */
  public val fullNameAliases: List<String>? =
      fullNameAliases?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var accountValue: String? = null

    public var account: String
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var objectValueValue: InlinePersonObjectValueXfffe50ab? = null

    public var objectValue: InlinePersonObjectValueXfffe50ab
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    public var additionalTosAcceptances: PersonAdditionalTosAcceptances? = null

    public var address: Address? = null

    public var addressKana: InlinePersonAddressKanaX281381e4? = null

    public var addressKanji: InlinePersonAddressKanjiXf6c450b8? = null

    public var dob: LegalEntityDob? = null

    /**
     * The person's email address. Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var email: String? = null

    /**
     * The person's first name. Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var firstName: String? = null

    /**
     * The Kana variation of the person's first name (Japan only). Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var firstNameKana: String? = null

    /**
     * The Kanji variation of the person's first name (Japan only). Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var firstNameKanji: String? = null

    private var fullNameAliasesValue: List<String>? = null

    /**
     * A list of alternate names or aliases that the person is known by. Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var fullNameAliases: List<String>?
      get() = fullNameAliasesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        fullNameAliasesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var futureRequirements: InlinePersonFutureRequirementsXf1ad3575? = null

    /**
     * The person's gender.
     */
    public var gender: String? = null

    /**
     * Whether the person's `id_number` was provided. True if either the full ID number was provided or if only the
     * required part of the ID number was provided (ex. last four of an individual's SSN for the US indicated by
     * `ssn_last_4_provided`).
     */
    public var idNumberProvided: Boolean? = null

    /**
     * Whether the person's `id_number_secondary` was provided.
     */
    public var idNumberSecondaryProvided: Boolean? = null

    /**
     * The person's last name. Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var lastName: String? = null

    /**
     * The Kana variation of the person's last name (Japan only). Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var lastNameKana: String? = null

    /**
     * The Kanji variation of the person's last name (Japan only). Also available for accounts where
     * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
     * `stripe`.
     */
    public var lastNameKanji: String? = null

    /**
     * The person's maiden name.
     */
    public var maidenName: String? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The country where the person is a national.
     */
    public var nationality: String? = null

    /**
     * The person's phone number.
     */
    public var phone: String? = null

    /**
     * Indicates if the person or any of their representatives, family members, or other closely related persons,
     * declares that they hold or have held an important public job or function, in any jurisdiction.
     */
    public var politicalExposure: InlinePersonPoliticalExposureX1348f489? = null

    public var registeredAddress: Address? = null

    public var relationship: PersonRelationship? = null

    public var requirements: InlinePersonRequirementsX4b681054? = null

    /**
     * Whether the last four digits of the person's Social Security number have been provided (U.S. only).
     */
    public var ssnLast4Provided: Boolean? = null

    /**
     * Demographic data related to the person.
     */
    public var usCfpbData: InlinePersonUsCfpbDataX411ab524? = null

    public var verification: LegalEntityPersonVerification? = null

    public fun build(): Person {
      check(accountValue != null) { "account is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(objectValueValue != null) { "objectValue is required" }
      return Person(
        account = account,
        created = created,
        id = id,
        objectValue = objectValue,
        additionalTosAcceptances = additionalTosAcceptances,
        address = address,
        addressKana = addressKana,
        addressKanji = addressKanji,
        dob = dob,
        email = email,
        firstName = firstName,
        firstNameKana = firstNameKana,
        firstNameKanji = firstNameKanji,
        fullNameAliases = fullNameAliases,
        futureRequirements = futureRequirements,
        gender = gender,
        idNumberProvided = idNumberProvided,
        idNumberSecondaryProvided = idNumberSecondaryProvided,
        lastName = lastName,
        lastNameKana = lastNameKana,
        lastNameKanji = lastNameKanji,
        maidenName = maidenName,
        metadata = metadata,
        nationality = nationality,
        phone = phone,
        politicalExposure = politicalExposure,
        registeredAddress = registeredAddress,
        relationship = relationship,
        requirements = requirements,
        ssnLast4Provided = ssnLast4Provided,
        usCfpbData = usCfpbData,
        verification = verification,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Person = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Person> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Person {
      val jsonDecoder = decoder.requireJsonDecoder("Person")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Person must be a JSON object")
      val account = json.decodeRequired<String>(rawObject, "account")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val objectValue = json.decodeRequired<InlinePersonObjectValueXfffe50ab>(rawObject, "object")
      return Person(
        account = account,
        created = created,
        id = id,
        objectValue = objectValue,
        additionalTosAcceptances = rawObject["additional_tos_acceptances"]?.let { json.decodeFromJsonElement<PersonAdditionalTosAcceptances>(it) },
        address = rawObject["address"]?.let { json.decodeFromJsonElement<Address>(it) },
        addressKana = rawObject["address_kana"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePersonAddressKanaX281381e4?>(element) },
        addressKanji = rawObject["address_kanji"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePersonAddressKanjiXf6c450b8?>(element) },
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<LegalEntityDob>(it) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        firstName = rawObject["first_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        firstNameKana = rawObject["first_name_kana"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        firstNameKanji = rawObject["first_name_kanji"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fullNameAliases = rawObject["full_name_aliases"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        futureRequirements = rawObject["future_requirements"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePersonFutureRequirementsXf1ad3575?>(element) },
        gender = rawObject["gender"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        idNumberProvided = rawObject["id_number_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        idNumberSecondaryProvided = rawObject["id_number_secondary_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        lastName = rawObject["last_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastNameKana = rawObject["last_name_kana"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastNameKanji = rawObject["last_name_kanji"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        maidenName = rawObject["maiden_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        nationality = rawObject["nationality"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        politicalExposure = rawObject["political_exposure"]?.let { json.decodeFromJsonElement<InlinePersonPoliticalExposureX1348f489>(it) },
        registeredAddress = rawObject["registered_address"]?.let { json.decodeFromJsonElement<Address>(it) },
        relationship = rawObject["relationship"]?.let { json.decodeFromJsonElement<PersonRelationship>(it) },
        requirements = rawObject["requirements"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePersonRequirementsX4b681054?>(element) },
        ssnLast4Provided = rawObject["ssn_last_4_provided"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        usCfpbData = rawObject["us_cfpb_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePersonUsCfpbDataX411ab524?>(element) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<LegalEntityPersonVerification>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: Person) {
      val jsonEncoder = encoder.requireJsonEncoder("Person")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", value.account)
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("object", json.encodeToJsonElement(value.objectValue))
        value.additionalTosAcceptances?.let { put("additional_tos_acceptances", json.encodeToJsonElement(it)) }
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.addressKana?.let { put("address_kana", json.encodeToJsonElement(it)) }
        value.addressKanji?.let { put("address_kanji", json.encodeToJsonElement(it)) }
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.firstName?.let { put("first_name", it) }
        value.firstNameKana?.let { put("first_name_kana", it) }
        value.firstNameKanji?.let { put("first_name_kanji", it) }
        value.fullNameAliases?.let { put("full_name_aliases", json.encodeToJsonElement(it)) }
        value.futureRequirements?.let { put("future_requirements", json.encodeToJsonElement(it)) }
        value.gender?.let { put("gender", it) }
        value.idNumberProvided?.let { put("id_number_provided", json.encodeToJsonElement(it)) }
        value.idNumberSecondaryProvided?.let { put("id_number_secondary_provided", json.encodeToJsonElement(it)) }
        value.lastName?.let { put("last_name", it) }
        value.lastNameKana?.let { put("last_name_kana", it) }
        value.lastNameKanji?.let { put("last_name_kanji", it) }
        value.maidenName?.let { put("maiden_name", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nationality?.let { put("nationality", it) }
        value.phone?.let { put("phone", it) }
        value.politicalExposure?.let { put("political_exposure", json.encodeToJsonElement(it)) }
        value.registeredAddress?.let { put("registered_address", json.encodeToJsonElement(it)) }
        value.relationship?.let { put("relationship", json.encodeToJsonElement(it)) }
        value.requirements?.let { put("requirements", json.encodeToJsonElement(it)) }
        value.ssnLast4Provided?.let { put("ssn_last_4_provided", json.encodeToJsonElement(it)) }
        value.usCfpbData?.let { put("us_cfpb_data", json.encodeToJsonElement(it)) }
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun person(block: Person.Builder.() -> Unit): Person = Person.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Person is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
