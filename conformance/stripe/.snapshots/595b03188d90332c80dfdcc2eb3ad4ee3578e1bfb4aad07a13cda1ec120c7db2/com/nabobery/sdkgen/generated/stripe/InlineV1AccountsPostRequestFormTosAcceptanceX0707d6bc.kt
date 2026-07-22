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
 * Details on the account's acceptance of the [Stripe Services Agreement](/connect/updating-accounts#tos-acceptance).
 * This property can only be updated for accounts where
 * [controller.requirement_collection](/api/accounts/object#account_object-controller-requirement_collection) is
 * `application`, which includes Custom accounts. This property defaults to a `full` service agreement when empty.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/tos_acceptance
 */
@Serializable(with = InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc.Serializer::class)
public class InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc(
    public val date: Int? = null,
    public val ip: String? = null,
    public val serviceAgreement: String? = null,
    public val userAgent: String? = null,
) {
    public class Builder {
        public var date: Int? = null

        public var ip: String? = null

        public var serviceAgreement: String? = null

        public var userAgent: String? = null

        public fun build(): InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc =
            InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc(
                date = date,
                ip = ip,
                serviceAgreement = serviceAgreement,
                userAgent = userAgent,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc must be a JSON object",
                    )
            return InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc(
                date = rawObject["date"]?.let { json.decodeFromJsonElement<Int>(it) },
                ip = rawObject["ip"]?.let { json.decodeFromJsonElement<String>(it) },
                serviceAgreement = rawObject["service_agreement"]?.let { json.decodeFromJsonElement<String>(it) },
                userAgent = rawObject["user_agent"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.date?.let { put("date", json.encodeToJsonElement(it)) }
                    value.ip?.let { put("ip", it) }
                    value.serviceAgreement?.let { put("service_agreement", it) }
                    value.userAgent?.let { put("user_agent", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc(
    block: InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc.Builder.() -> Unit,
): InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc =
    InlineV1AccountsPostRequestFormTosAcceptanceX0707d6bc.build(block)
