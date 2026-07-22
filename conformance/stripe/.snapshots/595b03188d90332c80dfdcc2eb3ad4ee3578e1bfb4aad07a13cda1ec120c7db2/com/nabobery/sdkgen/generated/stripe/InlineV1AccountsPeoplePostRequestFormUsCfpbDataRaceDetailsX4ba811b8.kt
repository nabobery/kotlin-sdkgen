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
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/us_cfpb_data/properties/race_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/us_cfpb_data/properties/race_details
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8(
    public val race: List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsRaceItemXd06b5917>? = null,
    public val raceOther: String? = null,
) {
    public class Builder {
        public var race:
            List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsRaceItemXd06b5917>? = null

        public var raceOther: String? = null

        public fun build(): InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8 =
            InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8(
                race = race,
                raceOther = raceOther,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8 must be a JSON object",
                    )
            return InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8(
                race =
                    rawObject["race"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsRaceItemXd06b5917>>(
                                it,
                            )
                    },
                raceOther = rawObject["race_other"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8",
                )
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

public fun inlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8(
    block: InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8.Builder.() -> Unit,
): InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8 =
    InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX4ba811b8.build(block)
