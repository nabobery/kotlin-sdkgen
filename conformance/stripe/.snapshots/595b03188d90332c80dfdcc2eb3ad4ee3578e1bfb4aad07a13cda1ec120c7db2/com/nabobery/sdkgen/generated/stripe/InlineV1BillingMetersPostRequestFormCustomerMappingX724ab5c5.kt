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
import kotlin.String
import kotlin.Unit

/**
 * Fields that specify how to map a meter event to a customer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/customer_mapping
 */
@Serializable(with = InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5.Serializer::class)
public class InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5(
    public val eventPayloadKey: String,
    public val type: InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8,
) {
    public class Builder {
        private var eventPayloadKeyValue: String? = null

        public var eventPayloadKey: String
            get() = requireNotNull(eventPayloadKeyValue) { "eventPayloadKey is required" }
            set(`value`) {
                eventPayloadKeyValue = value
            }

        private var typeValue: InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8? = null

        public var type: InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5 {
            check(eventPayloadKeyValue != null) { "eventPayloadKey is required" }
            check(typeValue != null) { "type is required" }
            return InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5(
                eventPayloadKey = eventPayloadKey,
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5 must be a JSON object",
                    )
            val eventPayloadKey = json.decodeRequired<String>(rawObject, "event_payload_key")
            val type =
                json.decodeRequired<InlineV1BillingMetersPostRequestFormCustomerMappingTypeX9591eda8>(
                    rawObject,
                    "type",
                )
            return InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5(
                eventPayloadKey = eventPayloadKey,
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("event_payload_key", value.eventPayloadKey)
                    put("type", json.encodeToJsonElement(value.type))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5(
    block: InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5.Builder.() -> Unit,
): InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5 =
    InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1BillingMetersPostRequestFormCustomerMappingX724ab5c5 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
