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
public data class PersonRaceDetailsView(
    public val race: List<InlinePersonRaceDetailsRaceItemXef94ddcc>? = null,
    @SerialName("race_other")
    public val raceOther: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person_race_details
 */
@Serializable(with = PersonRaceDetails.Serializer::class)
public class PersonRaceDetails(
    /**
     * The persons race.
     */
    public val race: List<InlinePersonRaceDetailsRaceItemXef94ddcc>? = null,
    /**
     * Please specify your race, when other is selected.
     */
    public val raceOther: String? = null,
) {
    public class Builder {
        /**
         * The persons race.
         */
        public var race: List<InlinePersonRaceDetailsRaceItemXef94ddcc>? = null

        /**
         * Please specify your race, when other is selected.
         */
        public var raceOther: String? = null

        public fun build(): PersonRaceDetails =
            PersonRaceDetails(
                race = race,
                raceOther = raceOther,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PersonRaceDetails = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PersonRaceDetails> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PersonRaceDetails {
            val jsonDecoder = decoder.requireJsonDecoder("PersonRaceDetails")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PersonRaceDetails must be a JSON object")
            return PersonRaceDetails(
                race =
                    rawObject["race"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<InlinePersonRaceDetailsRaceItemXef94ddcc>?>(element)
                        }
                    },
                raceOther =
                    rawObject["race_other"]?.let { element ->
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
            `value`: PersonRaceDetails,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PersonRaceDetails")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.race?.let { put("race", json.encodeToJsonElement(it)) }
                    value.raceOther?.let { put("race_other", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun personRaceDetails(block: PersonRaceDetails.Builder.() -> Unit): PersonRaceDetails =
    PersonRaceDetails.build(block)
