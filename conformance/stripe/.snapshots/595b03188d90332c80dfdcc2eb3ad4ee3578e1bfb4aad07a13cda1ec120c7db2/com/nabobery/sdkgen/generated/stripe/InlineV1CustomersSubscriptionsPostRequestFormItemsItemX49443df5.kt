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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5(
    public val billingThresholds:
        InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41? = null,
    public val clearUsage: Boolean? = null,
    public val deleted: Boolean? = null,
    public val discounts: InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b? = null,
    public val id: String? = null,
    public val metadata: InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51? = null,
    public val price: String? = null,
    public val priceData: InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9? = null,
    public val quantity: Int? = null,
    public val taxRates: InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4? = null,
) {
    public class Builder {
        public var billingThresholds:
            InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41? = null

        public var clearUsage: Boolean? = null

        public var deleted: Boolean? = null

        public var discounts: InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b? =
            null

        public var id: String? = null

        public var metadata: InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51? =
            null

        public var price: String? = null

        public var priceData: InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9? =
            null

        public var quantity: Int? = null

        public var taxRates: InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4? =
            null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5 =
            InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5(
                billingThresholds = billingThresholds,
                clearUsage = clearUsage,
                deleted = deleted,
                discounts = discounts,
                id = id,
                metadata = metadata,
                price = price,
                priceData = priceData,
                quantity = quantity,
                taxRates = taxRates,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5 must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5(
                billingThresholds =
                    rawObject["billing_thresholds"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemBillingThresholdsXe48a9d41>(
                                it,
                            )
                    },
                clearUsage = rawObject["clear_usage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                deleted = rawObject["deleted"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                discounts =
                    rawObject["discounts"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX00f4e51b>(
                                it,
                            )
                    },
                id = rawObject["id"]?.let { json.decodeFromJsonElement<String>(it) },
                metadata =
                    rawObject["metadata"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemMetadataX7c14fd51>(
                                it,
                            )
                    },
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
                priceData =
                    rawObject["price_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemPriceDataXd9a91ba9>(
                                it,
                            )
                    },
                quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
                taxRates =
                    rawObject["tax_rates"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.billingThresholds?.let { put("billing_thresholds", json.encodeToJsonElement(it)) }
                    value.clearUsage?.let { put("clear_usage", json.encodeToJsonElement(it)) }
                    value.deleted?.let { put("deleted", json.encodeToJsonElement(it)) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.id?.let { put("id", it) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.price?.let { put("price", it) }
                    value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
                    value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
                    value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5(
    block: InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5 =
    InlineV1CustomersSubscriptionsPostRequestFormItemsItemX49443df5.build(block)
