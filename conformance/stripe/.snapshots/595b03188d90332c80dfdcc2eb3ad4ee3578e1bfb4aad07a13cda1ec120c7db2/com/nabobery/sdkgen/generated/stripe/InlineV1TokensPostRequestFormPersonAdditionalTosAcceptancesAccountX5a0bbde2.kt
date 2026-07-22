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
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/additional_tos_acceptances/properties/account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/person/properties/additional_tos_acceptances/properties/account
 */
@Serializable(with = InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2.Serializer::class)
public class InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2(
    public val date: Int? = null,
    public val ip: String? = null,
    public val userAgent: InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e? = null,
) {
    public class Builder {
        public var date: Int? = null

        public var ip: String? = null

        public var userAgent:
            InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e? = null

        public fun build(): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2 =
            InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2(
                date = date,
                ip = ip,
                userAgent = userAgent,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2 must be a JSON object",
                    )
            return InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2(
                date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
                ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
                userAgent =
                    rawObject["user_agent"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesUserAgentX941a863e>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2",
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

public fun inlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2(
    block: InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2.Builder.() -> Unit,
): InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2 =
    InlineV1TokensPostRequestFormPersonAdditionalTosAcceptancesAccountX5a0bbde2.build(block)
