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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items/properties/applies_to/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/billing_schedules/anyOf/0/items/properties/applies_to/items
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c(
    public val type: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4,
    public val price: String? = null,
) {
    public class Builder {
        private var typeValue:
            InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4? = null

        public var type: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var price: String? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c {
            check(typeValue != null) { "type is required" }
            return InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c(
                type = type,
                price = price,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemTypeX31f116f4>(
                    rawObject,
                    "type",
                )
            return InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c(
                type = type,
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.price?.let { put("price", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c(
    block: InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c =
    InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionsPostRequestFormBillingSchedulesAnyOf1ItemItemX44a9f51c is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
