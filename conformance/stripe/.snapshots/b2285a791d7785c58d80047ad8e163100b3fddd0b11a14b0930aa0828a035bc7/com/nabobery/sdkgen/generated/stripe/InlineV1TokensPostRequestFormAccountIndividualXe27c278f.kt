package com.nabobery.sdkgen.generated.stripe

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
 * roperties/account/properties/individual.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/account/properties/individual
 */
@Serializable(with = InlineV1TokensPostRequestFormAccountIndividualXe27c278f.Serializer::class)
public class InlineV1TokensPostRequestFormAccountIndividualXe27c278f(
  public val address: InlineV1TokensPostRequestFormAccountIndividualAddressX477ac07e? = null,
  public val addressKana:
      InlineV1TokensPostRequestFormAccountIndividualAddressKanaX3c2317aa? = null,
  public val addressKanji:
      InlineV1TokensPostRequestFormAccountIndividualAddressKanjiX06d9eb46? = null,
  public val dob: InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4? = null,
  public val email: String? = null,
  public val firstName: String? = null,
  public val firstNameKana: String? = null,
  public val firstNameKanji: String? = null,
  public val fullNameAliases:
      InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8? = null,
  public val gender: String? = null,
  public val idNumber: String? = null,
  public val idNumberSecondary: String? = null,
  public val lastName: String? = null,
  public val lastNameKana: String? = null,
  public val lastNameKanji: String? = null,
  public val maidenName: String? = null,
  public val metadata: InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b? = null,
  public val phone: String? = null,
  public val politicalExposure:
      InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6? = null,
  public val registeredAddress:
      InlineV1TokensPostRequestFormAccountIndividualRegisteredAddressXf5ac159b? = null,
  public val relationship:
      InlineV1TokensPostRequestFormAccountIndividualRelationshipXa70a21f8? = null,
  public val ssnLast4: String? = null,
  public val verification:
      InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9? = null,
) {
  public class Builder {
    public var address: InlineV1TokensPostRequestFormAccountIndividualAddressX477ac07e? = null

    public var addressKana: InlineV1TokensPostRequestFormAccountIndividualAddressKanaX3c2317aa? =
        null

    public var addressKanji: InlineV1TokensPostRequestFormAccountIndividualAddressKanjiX06d9eb46? =
        null

    public var dob: InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4? = null

    public var email: String? = null

    public var firstName: String? = null

    public var firstNameKana: String? = null

    public var firstNameKanji: String? = null

    public var fullNameAliases:
        InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8? = null

    public var gender: String? = null

    public var idNumber: String? = null

    public var idNumberSecondary: String? = null

    public var lastName: String? = null

    public var lastNameKana: String? = null

    public var lastNameKanji: String? = null

    public var maidenName: String? = null

    public var metadata: InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b? = null

    public var phone: String? = null

    public var politicalExposure:
        InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6? = null

    public var registeredAddress:
        InlineV1TokensPostRequestFormAccountIndividualRegisteredAddressXf5ac159b? = null

    public var relationship: InlineV1TokensPostRequestFormAccountIndividualRelationshipXa70a21f8? =
        null

    public var ssnLast4: String? = null

    public var verification: InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9? =
        null

    public fun build(): InlineV1TokensPostRequestFormAccountIndividualXe27c278f = InlineV1TokensPostRequestFormAccountIndividualXe27c278f(
      address = address,
      addressKana = addressKana,
      addressKanji = addressKanji,
      dob = dob,
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
      phone = phone,
      politicalExposure = politicalExposure,
      registeredAddress = registeredAddress,
      relationship = relationship,
      ssnLast4 = ssnLast4,
      verification = verification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormAccountIndividualXe27c278f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TokensPostRequestFormAccountIndividualXe27c278f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormAccountIndividualXe27c278f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormAccountIndividualXe27c278f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormAccountIndividualXe27c278f must be a JSON object")
      return InlineV1TokensPostRequestFormAccountIndividualXe27c278f(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualAddressX477ac07e>(it) },
        addressKana = rawObject["address_kana"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualAddressKanaX3c2317aa>(it) },
        addressKanji = rawObject["address_kanji"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualAddressKanjiX06d9eb46>(it) },
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualDobX1dc512c4>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        firstName = rawObject["first_name"]?.let { json.decodeFromJsonElement<String>(it) },
        firstNameKana = rawObject["first_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        firstNameKanji = rawObject["first_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        fullNameAliases = rawObject["full_name_aliases"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualFullNameAliasesX310f21f8>(it) },
        gender = rawObject["gender"]?.let { json.decodeFromJsonElement<String>(it) },
        idNumber = rawObject["id_number"]?.let { json.decodeFromJsonElement<String>(it) },
        idNumberSecondary = rawObject["id_number_secondary"]?.let { json.decodeFromJsonElement<String>(it) },
        lastName = rawObject["last_name"]?.let { json.decodeFromJsonElement<String>(it) },
        lastNameKana = rawObject["last_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        lastNameKanji = rawObject["last_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        maidenName = rawObject["maiden_name"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualMetadataX5423e06b>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        politicalExposure = rawObject["political_exposure"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualPoliticalExposureX950cd3b6>(it) },
        registeredAddress = rawObject["registered_address"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualRegisteredAddressXf5ac159b>(it) },
        relationship = rawObject["relationship"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualRelationshipXa70a21f8>(it) },
        ssnLast4 = rawObject["ssn_last_4"]?.let { json.decodeFromJsonElement<String>(it) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<InlineV1TokensPostRequestFormAccountIndividualVerificationX1e0a3dd9>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormAccountIndividualXe27c278f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormAccountIndividualXe27c278f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.addressKana?.let { put("address_kana", json.encodeToJsonElement(it)) }
        value.addressKanji?.let { put("address_kanji", json.encodeToJsonElement(it)) }
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
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
        value.phone?.let { put("phone", it) }
        value.politicalExposure?.let { put("political_exposure", json.encodeToJsonElement(it)) }
        value.registeredAddress?.let { put("registered_address", json.encodeToJsonElement(it)) }
        value.relationship?.let { put("relationship", json.encodeToJsonElement(it)) }
        value.ssnLast4?.let { put("ssn_last_4", it) }
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormAccountIndividualXe27c278f(block: InlineV1TokensPostRequestFormAccountIndividualXe27c278f.Builder.() -> Unit): InlineV1TokensPostRequestFormAccountIndividualXe27c278f = InlineV1TokensPostRequestFormAccountIndividualXe27c278f.build(block)
