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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/billing_thresholds/anyOf/0
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca(
    public val usageGte: Int,
) {
    public class Builder {
        private var usageGteValue: Int? = null

        public var usageGte: Int
            get() = requireNotNull(usageGteValue) { "usageGte is required" }
            set(`value`) {
                usageGteValue = value
            }

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca {
            check(usageGteValue != null) { "usageGte is required" }
            return InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca(
                usageGte = usageGte,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca must be a JSON object",
                    )
            val usageGte = json.decodeRequired<Int>(rawObject, "usage_gte")
            return InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca(
                usageGte = usageGte,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("usage_gte", json.encodeToJsonElement(value.usageGte))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca(
    block: InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca =
    InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1CustomersSubscriptionsPostRequestFormItemsItemAnyOf1X2ad461ca is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
