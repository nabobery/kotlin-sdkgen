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
 * Information about the person represented by the account. This field is null unless `business_type` is set to
 * `individual`. Once you create an [Account Link](/api/account_links) or [Account Session](/api/account_sessions), this
 * property can only be updated for accounts where
 * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
 * `application`, which includes Custom accounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualX0a2dcd83.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualX0a2dcd83(
  public val address: InlineV1AccountsPostRequestFormIndividualAddressXcc6c082f? = null,
  public val addressKana: InlineV1AccountsPostRequestFormIndividualAddressKanaX2bdbb77a? = null,
  public val addressKanji: InlineV1AccountsPostRequestFormIndividualAddressKanjiXe788baae? = null,
  public val dob: InlineV1AccountsPostRequestFormIndividualDobXf914b8b9? = null,
  public val email: String? = null,
  public val firstName: String? = null,
  public val firstNameKana: String? = null,
  public val firstNameKanji: String? = null,
  public val fullNameAliases:
      InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69? = null,
  public val gender: String? = null,
  public val idNumber: String? = null,
  public val idNumberSecondary: String? = null,
  public val lastName: String? = null,
  public val lastNameKana: String? = null,
  public val lastNameKanji: String? = null,
  public val maidenName: String? = null,
  public val metadata: InlineV1AccountsPostRequestFormIndividualMetadataX21c1a961? = null,
  public val phone: String? = null,
  public val politicalExposure:
      InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c? = null,
  public val registeredAddress:
      InlineV1AccountsPostRequestFormIndividualRegisteredAddressXc0de757d? = null,
  public val relationship: InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466? = null,
  public val ssnLast4: String? = null,
  public val verification: InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5? = null,
) {
  public class Builder {
    public var address: InlineV1AccountsPostRequestFormIndividualAddressXcc6c082f? = null

    public var addressKana: InlineV1AccountsPostRequestFormIndividualAddressKanaX2bdbb77a? = null

    public var addressKanji: InlineV1AccountsPostRequestFormIndividualAddressKanjiXe788baae? = null

    public var dob: InlineV1AccountsPostRequestFormIndividualDobXf914b8b9? = null

    public var email: String? = null

    public var firstName: String? = null

    public var firstNameKana: String? = null

    public var firstNameKanji: String? = null

    public var fullNameAliases: InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69? =
        null

    public var gender: String? = null

    public var idNumber: String? = null

    public var idNumberSecondary: String? = null

    public var lastName: String? = null

    public var lastNameKana: String? = null

    public var lastNameKanji: String? = null

    public var maidenName: String? = null

    public var metadata: InlineV1AccountsPostRequestFormIndividualMetadataX21c1a961? = null

    public var phone: String? = null

    public var politicalExposure:
        InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c? = null

    public var registeredAddress:
        InlineV1AccountsPostRequestFormIndividualRegisteredAddressXc0de757d? = null

    public var relationship: InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466? = null

    public var ssnLast4: String? = null

    public var verification: InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5? = null

    public fun build(): InlineV1AccountsPostRequestFormIndividualX0a2dcd83 = InlineV1AccountsPostRequestFormIndividualX0a2dcd83(
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
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualX0a2dcd83 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualX0a2dcd83> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualX0a2dcd83 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualX0a2dcd83")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormIndividualX0a2dcd83 must be a JSON object")
      return InlineV1AccountsPostRequestFormIndividualX0a2dcd83(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualAddressXcc6c082f>(it) },
        addressKana = rawObject["address_kana"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualAddressKanaX2bdbb77a>(it) },
        addressKanji = rawObject["address_kanji"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualAddressKanjiXe788baae>(it) },
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualDobXf914b8b9>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        firstName = rawObject["first_name"]?.let { json.decodeFromJsonElement<String>(it) },
        firstNameKana = rawObject["first_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        firstNameKanji = rawObject["first_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        fullNameAliases = rawObject["full_name_aliases"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualFullNameAliasesX7c7c6e69>(it) },
        gender = rawObject["gender"]?.let { json.decodeFromJsonElement<String>(it) },
        idNumber = rawObject["id_number"]?.let { json.decodeFromJsonElement<String>(it) },
        idNumberSecondary = rawObject["id_number_secondary"]?.let { json.decodeFromJsonElement<String>(it) },
        lastName = rawObject["last_name"]?.let { json.decodeFromJsonElement<String>(it) },
        lastNameKana = rawObject["last_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
        lastNameKanji = rawObject["last_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
        maidenName = rawObject["maiden_name"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualMetadataX21c1a961>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
        politicalExposure = rawObject["political_exposure"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualPoliticalExposureX1cdcc72c>(it) },
        registeredAddress = rawObject["registered_address"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualRegisteredAddressXc0de757d>(it) },
        relationship = rawObject["relationship"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualRelationshipX7feb9466>(it) },
        ssnLast4 = rawObject["ssn_last_4"]?.let { json.decodeFromJsonElement<String>(it) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualVerificationX19ee9ea5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualX0a2dcd83) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualX0a2dcd83")
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

public fun inlineV1AccountsPostRequestFormIndividualX0a2dcd83(block: InlineV1AccountsPostRequestFormIndividualX0a2dcd83.Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualX0a2dcd83 = InlineV1AccountsPostRequestFormIndividualX0a2dcd83.build(block)
