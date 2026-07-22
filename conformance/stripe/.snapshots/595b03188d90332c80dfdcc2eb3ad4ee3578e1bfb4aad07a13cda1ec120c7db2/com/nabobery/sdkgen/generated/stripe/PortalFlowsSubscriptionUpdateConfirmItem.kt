package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_subscription_update_confirm_item
 */
@Serializable(with = PortalFlowsSubscriptionUpdateConfirmItem.Serializer::class)
public class PortalFlowsSubscriptionUpdateConfirmItem(
    /**
     * The ID of the [subscription
     * item](https://docs.stripe.com/api/subscriptions/object#subscription_object-items-data-id) to be updated.
     */
    public val id: String? = null,
    /**
     * The price the customer should subscribe to through this flow. The price must also be included in the
     * configuration's
     * [`features.subscription_update.products`](https://docs.stripe.com/api/customer_portal/configuration#portal_configur
     * ation_object-features-subscription_update-products).
     */
    public val price: String? = null,
    /**
     * [Quantity](https://docs.stripe.com/subscriptions/quantities) for this item that the customer should subscribe to
     * through this flow.
     */
    public val quantity: Int? = null,
) {
    public class Builder {
        /**
         * The ID of the [subscription
         * item](https://docs.stripe.com/api/subscriptions/object#subscription_object-items-data-id) to be updated.
         */
        public var id: String? = null

        /**
         * The price the customer should subscribe to through this flow. The price must also be included in the
         * configuration's
         * [`features.subscription_update.products`](https://docs.stripe.com/api/customer_portal/configuration#portal_config
         * uration_object-features-subscription_update-products).
         */
        public var price: String? = null

        /**
         * [Quantity](https://docs.stripe.com/subscriptions/quantities) for this item that the customer should subscribe to
         * through this flow.
         */
        public var quantity: Int? = null

        public fun build(): PortalFlowsSubscriptionUpdateConfirmItem =
            PortalFlowsSubscriptionUpdateConfirmItem(
                id = id,
                price = price,
                quantity = quantity,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PortalFlowsSubscriptionUpdateConfirmItem =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PortalFlowsSubscriptionUpdateConfirmItem> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PortalFlowsSubscriptionUpdateConfirmItem {
            val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsSubscriptionUpdateConfirmItem")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PortalFlowsSubscriptionUpdateConfirmItem must be a JSON object")
            return PortalFlowsSubscriptionUpdateConfirmItem(
                id =
                    rawObject["id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                price =
                    rawObject["price"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PortalFlowsSubscriptionUpdateConfirmItem,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsSubscriptionUpdateConfirmItem")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.id?.let { put("id", it) }
                    value.price?.let { put("price", it) }
                    value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun portalFlowsSubscriptionUpdateConfirmItem(
    block: PortalFlowsSubscriptionUpdateConfirmItem.Builder.() -> Unit,
): PortalFlowsSubscriptionUpdateConfirmItem = PortalFlowsSubscriptionUpdateConfirmItem.build(block)
