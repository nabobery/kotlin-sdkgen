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
import kotlin.String
import kotlin.Unit

/**
 * Information about the person represented by the account. This field is null unless `business_type` is set to
 * `individual`. Once you create an [Account Link](/api/account_links) or [Account Session](/api/account_sessions), this
 * property can only be updated for accounts where
 * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
 * `application`, which includes Custom accounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/individual
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualX5383dde5.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualX5383dde5(
    public val address: InlineV1AccountsPostRequestFormIndividualAddressX85fda2d4? = null,
    public val addressKana: InlineV1AccountsPostRequestFormIndividualAddressKanaX6648cc74? = null,
    public val addressKanji: InlineV1AccountsPostRequestFormIndividualAddressKanjiX15cad2d0? = null,
    public val dob: InlineV1AccountsPostRequestFormIndividualDobXdc1057be? = null,
    public val email: String? = null,
    public val firstName: String? = null,
    public val firstNameKana: String? = null,
    public val firstNameKanji: String? = null,
    public val fullNameAliases: InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610? = null,
    public val gender: String? = null,
    public val idNumber: String? = null,
    public val idNumberSecondary: String? = null,
    public val lastName: String? = null,
    public val lastNameKana: String? = null,
    public val lastNameKanji: String? = null,
    public val maidenName: String? = null,
    public val metadata: InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3? = null,
    public val phone: String? = null,
    public val politicalExposure: InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a? = null,
    public val registeredAddress: InlineV1AccountsPostRequestFormIndividualRegisteredAddressXf099f458? = null,
    public val relationship: InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08? = null,
    public val ssnLast4: String? = null,
    public val verification: InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46? = null,
) {
    public class Builder {
        public var address: InlineV1AccountsPostRequestFormIndividualAddressX85fda2d4? = null

        public var addressKana: InlineV1AccountsPostRequestFormIndividualAddressKanaX6648cc74? = null

        public var addressKanji: InlineV1AccountsPostRequestFormIndividualAddressKanjiX15cad2d0? = null

        public var dob: InlineV1AccountsPostRequestFormIndividualDobXdc1057be? = null

        public var email: String? = null

        public var firstName: String? = null

        public var firstNameKana: String? = null

        public var firstNameKanji: String? = null

        public var fullNameAliases: InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610? =
            null

        public var gender: String? = null

        public var idNumber: String? = null

        public var idNumberSecondary: String? = null

        public var lastName: String? = null

        public var lastNameKana: String? = null

        public var lastNameKanji: String? = null

        public var maidenName: String? = null

        public var metadata: InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3? = null

        public var phone: String? = null

        public var politicalExposure:
            InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a? = null

        public var registeredAddress:
            InlineV1AccountsPostRequestFormIndividualRegisteredAddressXf099f458? = null

        public var relationship: InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08? = null

        public var ssnLast4: String? = null

        public var verification: InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46? = null

        public fun build(): InlineV1AccountsPostRequestFormIndividualX5383dde5 =
            InlineV1AccountsPostRequestFormIndividualX5383dde5(
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
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormIndividualX5383dde5 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualX5383dde5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualX5383dde5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualX5383dde5")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormIndividualX5383dde5 must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormIndividualX5383dde5(
                address =
                    rawObject["address"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualAddressX85fda2d4>(it)
                    },
                addressKana =
                    rawObject["address_kana"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualAddressKanaX6648cc74>(it)
                    },
                addressKanji =
                    rawObject["address_kanji"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualAddressKanjiX15cad2d0>(it)
                    },
                dob =
                    rawObject["dob"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualDobXdc1057be>(
                            it,
                        )
                    },
                email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
                firstName = rawObject["first_name"]?.let { json.decodeFromJsonElement<String>(it) },
                firstNameKana = rawObject["first_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
                firstNameKanji = rawObject["first_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
                fullNameAliases =
                    rawObject["full_name_aliases"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualFullNameAliasesXd2a66610>(
                            it,
                        )
                    },
                gender = rawObject["gender"]?.let { json.decodeFromJsonElement<String>(it) },
                idNumber = rawObject["id_number"]?.let { json.decodeFromJsonElement<String>(it) },
                idNumberSecondary = rawObject["id_number_secondary"]?.let { json.decodeFromJsonElement<String>(it) },
                lastName = rawObject["last_name"]?.let { json.decodeFromJsonElement<String>(it) },
                lastNameKana = rawObject["last_name_kana"]?.let { json.decodeFromJsonElement<String>(it) },
                lastNameKanji = rawObject["last_name_kanji"]?.let { json.decodeFromJsonElement<String>(it) },
                maidenName = rawObject["maiden_name"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualMetadataXbb2c33b3>(it)
                    },
                phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
                politicalExposure =
                    rawObject["political_exposure"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualPoliticalExposureXf6099d5a>(
                            it,
                        )
                    },
                registeredAddress =
                    rawObject["registered_address"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualRegisteredAddressXf099f458>(
                            it,
                        )
                    },
                relationship =
                    rawObject["relationship"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualRelationshipX76dece08>(it)
                    },
                ssnLast4 = rawObject["ssn_last_4"]?.let { json.decodeFromJsonElement<String>(it) },
                verification =
                    rawObject["verification"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualVerificationX641c7c46>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormIndividualX5383dde5,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualX5383dde5")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
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

public fun inlineV1AccountsPostRequestFormIndividualX5383dde5(
    block: InlineV1AccountsPostRequestFormIndividualX5383dde5.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormIndividualX5383dde5 = InlineV1AccountsPostRequestFormIndividualX5383dde5.build(block)
