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
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/add_invoice_items/items
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd(
    public val discountable: Boolean? = null,
    public val discounts: List<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d>? = null,
    public val metadata: Map<String, String>? = null,
    public val period: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf? = null,
    public val price: String? = null,
    public val priceData: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsPriceDataX69bcf9f9? = null,
    public val quantity: Int? = null,
    public val taxRates: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1? = null,
) {
    public class Builder {
        public var discountable: Boolean? = null

        public var discounts:
            List<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d>? = null

        public var metadata: Map<String, String>? = null

        public var period:
            InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf? = null

        public var price: String? = null

        public var priceData:
            InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsPriceDataX69bcf9f9? = null

        public var quantity: Int? = null

        public var taxRates:
            InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd =
            InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd(
                discountable = discountable,
                discounts = discounts,
                metadata = metadata,
                period = period,
                price = price,
                priceData = priceData,
                quantity = quantity,
                taxRates = taxRates,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd(
                discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                discounts =
                    rawObject["discounts"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX396a252d>>(
                                it,
                            )
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                period =
                    rawObject["period"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodXfec0f0bf>(
                                it,
                            )
                    },
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
                priceData =
                    rawObject["price_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsPriceDataX69bcf9f9>(
                                it,
                            )
                    },
                quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
                taxRates =
                    rawObject["tax_rates"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesX881a4aa1>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
                    value.discounts?.let { put("discounts", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.period?.let { put("period", json.encodeToJsonElement(it)) }
                    value.price?.let { put("price", it) }
                    value.priceData?.let { put("price_data", json.encodeToJsonElement(it)) }
                    value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
                    value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd(
    block: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd =
    InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemX80b22ddd.build(block)
