package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Represents the entities that the billing schedule applies to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_billing_schedules_applies_to
 */
@Serializable(with = SubscriptionsResourceBillingSchedulesAppliesTo.Serializer::class)
public class SubscriptionsResourceBillingSchedulesAppliesTo(
    /**
     * Controls which subscription items the billing schedule applies to.
     */
    public val type: InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb,
    /**
     * The billing schedule will apply to the subscription item with the given price ID.
     */
    public val price: InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902? = null,
) {
    public class Builder {
        private var typeValue: InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb? = null

        public var type: InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * The billing schedule will apply to the subscription item with the given price ID.
         */
        public var price: InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902? = null

        public fun build(): SubscriptionsResourceBillingSchedulesAppliesTo {
            check(typeValue != null) { "type is required" }
            return SubscriptionsResourceBillingSchedulesAppliesTo(
                type = type,
                price = price,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SubscriptionsResourceBillingSchedulesAppliesTo =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SubscriptionsResourceBillingSchedulesAppliesTo> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SubscriptionsResourceBillingSchedulesAppliesTo {
            val jsonDecoder = decoder.requireJsonDecoder("SubscriptionsResourceBillingSchedulesAppliesTo")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "SubscriptionsResourceBillingSchedulesAppliesTo must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineSubscriptionsResourceBillingSchedulesAppliesToTypeX9085e4fb>(
                    rawObject,
                    "type",
                )
            return SubscriptionsResourceBillingSchedulesAppliesTo(
                type = type,
                price =
                    rawObject["price"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineSubscriptionsResourceBillingSchedulesAppliesToPriceXafa9c902?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SubscriptionsResourceBillingSchedulesAppliesTo,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SubscriptionsResourceBillingSchedulesAppliesTo")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.price?.let { put("price", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun subscriptionsResourceBillingSchedulesAppliesTo(
    block: SubscriptionsResourceBillingSchedulesAppliesTo.Builder.() -> Unit,
): SubscriptionsResourceBillingSchedulesAppliesTo = SubscriptionsResourceBillingSchedulesAppliesTo.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "SubscriptionsResourceBillingSchedulesAppliesTo is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
