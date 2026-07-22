package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/mandate_data/anyOf/0/properties/customer_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/mandate_data/anyOf/0/properties/customer_acceptance
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4(
    public val type: InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54,
    public val acceptedAt: Int? = null,
    public val offline: JsonObject? = null,
    public val online: InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1OnlineXdd0ef976? = null,
) {
    public class Builder {
        private var typeValue: InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54? =
            null

        public var type: InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var acceptedAt: Int? = null

        public var offline: JsonObject? = null

        public var online: InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1OnlineXdd0ef976? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4 {
            check(typeValue != null) { "type is required" }
            return InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4(
                type = type,
                acceptedAt = acceptedAt,
                offline = offline,
                online = online,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1TypeX463bae54>(
                    rawObject,
                    "type",
                )
            return InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4(
                type = type,
                acceptedAt = rawObject["accepted_at"]?.let { json.decodeFromJsonElement<Int>(it) },
                offline = rawObject["offline"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
                online =
                    rawObject["online"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormMandateDataAnyOf1OnlineXdd0ef976>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.acceptedAt?.let { put("accepted_at", json.encodeToJsonElement(it)) }
                    value.offline?.let { put("offline", json.encodeToJsonElement(it)) }
                    value.online?.let { put("online", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4(
    block: InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4 =
    InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentIntentsPostRequestFormMandateDataCustomerAcceptanceXab5ae0e4 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
