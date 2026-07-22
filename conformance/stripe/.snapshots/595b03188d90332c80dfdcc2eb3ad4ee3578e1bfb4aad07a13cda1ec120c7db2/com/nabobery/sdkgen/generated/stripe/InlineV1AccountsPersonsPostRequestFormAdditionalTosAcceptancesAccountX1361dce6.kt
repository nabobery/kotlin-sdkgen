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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/additional_tos_acceptances/properties/account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/additional_tos_acceptances/properties/account
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6(
    public val date: Int? = null,
    public val ip: String? = null,
    public val userAgent: InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22? = null,
) {
    public class Builder {
        public var date: Int? = null

        public var ip: String? = null

        public var userAgent:
            InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22? = null

        public fun build(): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6 =
            InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6(
                date = date,
                ip = ip,
                userAgent = userAgent,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6 must be a JSON object",
                    )
            return InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6(
                date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
                ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
                userAgent =
                    rawObject["user_agent"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesUserAgentXaba24b22>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6",
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

public fun inlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6(
    block: InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6.Builder.() -> Unit,
): InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6 =
    InlineV1AccountsPersonsPostRequestFormAdditionalTosAcceptancesAccountX1361dce6.build(block)
