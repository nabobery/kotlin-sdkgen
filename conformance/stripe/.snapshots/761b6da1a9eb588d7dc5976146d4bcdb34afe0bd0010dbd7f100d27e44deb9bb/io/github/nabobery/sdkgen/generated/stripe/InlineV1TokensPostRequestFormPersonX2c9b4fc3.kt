package io.github.nabobery.sdkgen.generated.stripe

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
 * Information for the person this token represents.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonX2c9b4fc3.Serializer::class)
public class InlineV1TokensPostRequestFormPersonX2c9b4fc3(
  public val additionalTosAcceptances:
      InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f? = null,
  public val address: InlineV1TokensPostRequestFormPersonAddressX0fca7f48? = null,
  public val addressKana: InlineV1TokensPostRequestFormPersonAddressKanaXe75e348e? = null,
  public val addressKanji: InlineV1TokensPostRequestFormPersonAddressKanjiX767496c0? = null,
  public val dob: InlineV1TokensPostRequestFormPersonDobXad0230b2? = null,
  public val documents: InlineV1TokensPostRequestFormPersonDocumentsX6cae069c? = null,
  public val email: String? = null,
  public val firstName: String? = null,
  public val firstNameKana: String? = null,
  public val firstNameKanji: String? = null,
  public val fullNameAliases: InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d? = null,
  public val gender: String? = null,
  public val idNumber: String? = null,
  public val idNumberSecondary: String? = null,
  public val lastName: String? = null,
  public val lastNameKana: String? = null,
  public val lastNameKanji: String? = null,
  public val maidenName: String? = null,
  public val metadata: InlineV1TokensPostRequestFormPersonMetadataX25e1fccd? = null,
  public val nationality: String? = null,
  public val phone: String? = null,
  public val politicalExposure:
      InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec? = null,
  public val registeredAddress:
      InlineV1TokensPostRequestFormPersonRegisteredAddressX52eaaf94? = null,
  public val relationship: InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2? = null,
  public val ssnLast4: String? = null,
  public val usCfpbData: InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0? = null,
  public val verification: InlineV1TokensPostRequestFormPersonVerificationX3434d302? = null,
) {
  public class Builder {
    public var additionalTosAcceptances:
        InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f? = null

    public var address: InlineV1TokensPostRequestFormPersonAddressX0fca7f48? = null

    public var addressKana: InlineV1TokensPostRequestFormPersonAddressKanaXe75e348e? = null

    public var addressKanji: InlineV1TokensPostRequestFormPersonAddressKanjiX767496c0? = null

    public var dob: InlineV1TokensPostRequestFormPersonDobXad0230b2? = null

    public var documents: InlineV1TokensPostRequestFormPersonDocumentsX6cae069c? = null

    public var email: String? = null

    public var firstName: String? = null

    public var firstNameKana: String? = null

    public var firstNameKanji: String? = null

    public var fullNameAliases: InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d? = null

    public var gender: String? = null

    public var idNumber: String? = null

    public var idNumberSecondary: String? = null

    public var lastName: String? = null

    public var lastNameKana: String? = null

    public var lastNameKanji: String? = null

    public var maidenName: String? = null

    public var metadata: InlineV1TokensPostRequestFormPersonMetadataX25e1fccd? = null

    public var nationality: String? = null

    public var phone: String? = null

    public var politicalExposure: InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec? =
        null

    public var registeredAddress: InlineV1TokensPostRequestFormPersonRegisteredAddressX52eaaf94? =
        null

    public var relationship: InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2? = null

    public var ssnLast4: String? = null

    public var usCfpbData: InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0? = null

    public var verification: InlineV1TokensPostRequestFormPersonVerificationX3434d302? = null

    public fun build(): InlineV1TokensPostRequestFormPersonX2c9b4fc3 = InlineV1TokensPostRequestFormPersonX2c9b4fc3(
      additionalTosAcceptances = additionalTosAcceptances,
      address = address,
      addressKana = addressKana,
      addressKanji = addressKanji,
      dob = dob,
      documents = documents,
      email = email,
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
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPersonX2c9b4fc3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonX2c9b4fc3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPersonX2c9b4fc3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPersonX2c9b4fc3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPersonX2c9b4fc3 must be a JSON object")
      return InlineV1TokensPostRequestFormPersonX2c9b4fc3(
        additionalTosAcceptances = rawObject["additional_tos_acceptances"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesXb8c9209f>(it) },
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonAddressX0fca7f48>(it) },
        addressKana = rawObject["address_kana"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonAddressKanaXe75e348e>(it) },
        addressKanji = rawObject["address_kanji"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonAddressKanjiX767496c0>(it) },
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonDobXad0230b2>(it) },
        documents = rawObject["documents"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonDocumentsX6cae069c>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        firstName = rawObject["first_name"]?.let { json.decodeFromJsonElement<String>(it) },
        firstNameKana = rawObject["first_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        firstNameKanji = rawObject["first_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        fullNameAliases = rawObject["full_name_aliases"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonFullNameAliasesX6f827c7d>(it) },
        gender = rawObject["gender"]?.let { json.decodeFromJsonElement<String>(it) },
        idNumber = rawObject["id_number"]?.let { json.decodeFromJsonElement<String>(it) },
        idNumberSecondary = rawObject["id_number_secondary"]?.let { json.decodeFromJsonElement<String>(it) },
        lastName = rawObject["last_name"]?.let { json.decodeFromJsonElement<String>(it) },
        lastNameKana = rawObject["last_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        lastNameKanji = rawObject["last_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        maidenName = rawObject["maiden_name"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonMetadataX25e1fccd>(it) },
        nationality = rawObject["nationality"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        politicalExposure = rawObject["political_exposure"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonPoliticalExposureXc153bfec>(it) },
        registeredAddress = rawObject["registered_address"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonRegisteredAddressX52eaaf94>(it) },
        relationship = rawObject["relationship"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonRelationshipXa53c81a2>(it) },
        ssnLast4 = rawObject["ssn_last_4"]?.let { json.decodeFromJsonElement<String>(it) },
        usCfpbData = rawObject["us_cfpb_data"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonUsCfpbDataX83866ef0>(it) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormPersonVerificationX3434d302>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPersonX2c9b4fc3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPersonX2c9b4fc3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.additionalTosAcceptances?.let { put("additional_tos_acceptances", json.encodeToJsonElement(it)) }
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.addressKana?.let { put("address_kana", json.encodeToJsonElement(it)) }
        value.addressKanji?.let { put("address_kanji", json.encodeToJsonElement(it)) }
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
        value.documents?.let { put("documents", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
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

public fun inlineV1TokensPostRequestFormPersonX2c9b4fc3(block: InlineV1TokensPostRequestFormPersonX2c9b4fc3.Builder.() -> Unit): InlineV1TokensPostRequestFormPersonX2c9b4fc3 = InlineV1TokensPostRequestFormPersonX2c9b4fc3.build(block)
