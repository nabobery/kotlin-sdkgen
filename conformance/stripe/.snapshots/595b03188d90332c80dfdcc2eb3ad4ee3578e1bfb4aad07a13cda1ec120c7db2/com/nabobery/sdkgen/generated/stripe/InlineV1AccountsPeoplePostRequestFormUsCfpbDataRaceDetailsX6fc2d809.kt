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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/us_cfpb_data/properties/race_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/us_cfpb_data/properties/race_details
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809(
    public val race: List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsRaceItemX15e5745b>? = null,
    public val raceOther: String? = null,
) {
    public class Builder {
        public var race:
            List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsRaceItemX15e5745b>? = null

        public var raceOther: String? = null

        public fun build(): InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809 =
            InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809(
                race = race,
                raceOther = raceOther,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809 must be a JSON object",
                    )
            return InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809(
                race =
                    rawObject["race"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsRaceItemX15e5745b>>(
                                it,
                            )
                    },
                raceOther = rawObject["race_other"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809",
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

public fun inlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809(
    block: InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809.Builder.() -> Unit,
): InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809 =
    InlineV1AccountsPeoplePostRequestFormUsCfpbDataRaceDetailsX6fc2d809.build(block)
