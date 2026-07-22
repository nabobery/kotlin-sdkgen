package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

@Serializable
public data class PersonEthnicityDetailsView(
    public val ethnicity: List<InlinePersonEthnicityDetailsEthnicityItemXc712579b>? = null,
    @SerialName("ethnicity_other")
    public val ethnicityOther: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person_ethnicity_details
 */
@Serializable(with = PersonEthnicityDetails.Serializer::class)
public class PersonEthnicityDetails(
    /**
     * The persons ethnicity
     */
    public val ethnicity: List<InlinePersonEthnicityDetailsEthnicityItemXc712579b>? = null,
    /**
     * Please specify your origin, when other is selected.
     */
    public val ethnicityOther: String? = null,
) {
    public class Builder {
        /**
         * The persons ethnicity
         */
        public var ethnicity: List<InlinePersonEthnicityDetailsEthnicityItemXc712579b>? = null

        /**
         * Please specify your origin, when other is selected.
         */
        public var ethnicityOther: String? = null

        public fun build(): PersonEthnicityDetails =
            PersonEthnicityDetails(
                ethnicity = ethnicity,
                ethnicityOther = ethnicityOther,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PersonEthnicityDetails = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PersonEthnicityDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PersonEthnicityDetails {
            val jsonDecoder = decoder.requireJsonDecoder("PersonEthnicityDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PersonEthnicityDetails must be a JSON object")
            return PersonEthnicityDetails(
                ethnicity =
                    rawObject["ethnicity"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<InlinePersonEthnicityDetailsEthnicityItemXc712579b>?>(
                                element,
                            )
                        }
                    },
                ethnicityOther =
                    rawObject["ethnicity_other"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PersonEthnicityDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PersonEthnicityDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.ethnicity?.let { put("ethnicity", json.encodeToJsonElement(it)) }
                    value.ethnicityOther?.let { put("ethnicity_other", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun personEthnicityDetails(block: PersonEthnicityDetails.Builder.() -> Unit): PersonEthnicityDetails =
    PersonEthnicityDetails.build(block)
