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
 * Demographic data related to the person.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/us_cfpb_data
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934(
    public val ethnicityDetails: InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX923c55c2? = null,
    public val raceDetails: InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78? = null,
    public val selfIdentifiedGender: String? = null,
) {
    public class Builder {
        public var ethnicityDetails:
            InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX923c55c2? = null

        public var raceDetails: InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78? =
            null

        public var selfIdentifiedGender: String? = null

        public fun build(): InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934 =
            InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934(
                ethnicityDetails = ethnicityDetails,
                raceDetails = raceDetails,
                selfIdentifiedGender = selfIdentifiedGender,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934 must be a JSON object",
                    )
            return InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934(
                ethnicityDetails =
                    rawObject["ethnicity_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsX923c55c2>(
                                it,
                            )
                    },
                raceDetails =
                    rawObject["race_details"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXac08eb78>(
                                it,
                            )
                    },
                selfIdentifiedGender =
                    rawObject["self_identified_gender"]?.let {
                        json
                            .decodeFromJsonElement<String>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.ethnicityDetails?.let { put("ethnicity_details", json.encodeToJsonElement(it)) }
                    value.raceDetails?.let { put("race_details", json.encodeToJsonElement(it)) }
                    value.selfIdentifiedGender?.let { put("self_identified_gender", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934(
    block: InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934.Builder.() -> Unit,
): InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934 =
    InlineV1AccountsPersonsPostRequestFormUsCfpbDataXd05aa934.build(block)
