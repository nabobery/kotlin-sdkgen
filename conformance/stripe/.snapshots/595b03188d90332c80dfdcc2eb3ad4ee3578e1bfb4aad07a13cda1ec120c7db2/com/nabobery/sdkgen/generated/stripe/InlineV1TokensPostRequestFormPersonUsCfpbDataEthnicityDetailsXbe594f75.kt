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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/us_cfpb_data/properties/ethnicity_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/us_cfpb_data/properties/ethnicity_details
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75.Serializer::class)
public class InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75(
    public val ethnicity: List<InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsItemXb82765fd>? = null,
    public val ethnicityOther: String? = null,
) {
    public class Builder {
        public var ethnicity:
            List<InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsItemXb82765fd>? = null

        public var ethnicityOther: String? = null

        public fun build(): InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75 =
            InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75(
                ethnicity = ethnicity,
                ethnicityOther = ethnicityOther,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75 must be a JSON object",
                    )
            return InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75(
                ethnicity =
                    rawObject["ethnicity"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsItemXb82765fd>>(
                                it,
                            )
                    },
                ethnicityOther = rawObject["ethnicity_other"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75",
                )
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

public fun inlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75(
    block: InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75.Builder.() -> Unit,
): InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75 =
    InlineV1TokensPostRequestFormPersonUsCfpbDataEthnicityDetailsXbe594f75.build(block)
