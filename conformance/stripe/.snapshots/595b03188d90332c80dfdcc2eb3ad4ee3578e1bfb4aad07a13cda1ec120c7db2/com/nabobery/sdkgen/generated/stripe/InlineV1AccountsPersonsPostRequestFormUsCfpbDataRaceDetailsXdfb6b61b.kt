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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/us_cfpb_data/properties/race_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/us_cfpb_data/properties/race_details
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b(
    public val race: List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e>? = null,
    public val raceOther: String? = null,
) {
    public class Builder {
        public var race:
            List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e>? = null

        public var raceOther: String? = null

        public fun build(): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b =
            InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b(
                race = race,
                raceOther = raceOther,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b must be a JSON object",
                    )
            return InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b(
                race =
                    rawObject["race"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e>>(
                                it,
                            )
                    },
                raceOther = rawObject["race_other"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b",
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

public fun inlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b(
    block: InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b.Builder.() -> Unit,
): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b =
    InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsXdfb6b61b.build(block)
