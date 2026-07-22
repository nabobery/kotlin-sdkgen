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
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual/properties/card_issuing/properties/user_terms_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual/properties/card_issuing/properties/user_terms_acceptance
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c(
    public val date: Int? = null,
    public val ip: String? = null,
    public val userAgent: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900? = null,
) {
    public class Builder {
        public var date: Int? = null

        public var ip: String? = null

        public var userAgent:
            InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900? = null

        public fun build(): InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c =
            InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c(
                date = date,
                ip = ip,
                userAgent = userAgent,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c must be a JSON object",
                    )
            return InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c(
                date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
                ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
                userAgent =
                    rawObject["user_agent"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingUserAgentX56a94900>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.date?.let { put("date", json.encodeToJsonElement(it)) }
                    value.ip?.let { put("ip", it) }
                    value.userAgent?.let { put("user_agent", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c(
    block: InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c.Builder.() -> Unit,
): InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c =
    InlineV1IssuingCardholdersPostRequestFormIndividualUserTermsAcceptanceXc3b8f00c.build(block)
