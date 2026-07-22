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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc(
    public val discountable: Boolean? = null,
    public val discounts: List<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9>? = null,
    public val metadata: Map<String, String>? = null,
    public val period: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222? = null,
    public val price: String? = null,
    public val priceData: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsPriceDataX8eba0517? = null,
    public val quantity: Int? = null,
    public val taxRates: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9? = null,
) {
    public class Builder {
        public var discountable: Boolean? = null

        public var discounts:
            List<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9>? = null

        public var metadata: Map<String, String>? = null

        public var period:
            InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222? = null

        public var price: String? = null

        public var priceData:
            InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsPriceDataX8eba0517? = null

        public var quantity: Int? = null

        public var taxRates:
            InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc =
            InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc(
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
        ): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc(
                discountable = rawObject["discountable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
                discounts =
                    rawObject["discounts"]?.let {
                        json
                            .decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9>>(
                                it,
                            )
                    },
                metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
                period =
                    rawObject["period"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemPeriodX39bd0222>(
                                it,
                            )
                    },
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
                priceData =
                    rawObject["price_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsPriceDataX8eba0517>(
                                it,
                            )
                    },
                quantity = rawObject["quantity"]?.let { json.decodeFromJsonElement<Int>(it) },
                taxRates =
                    rawObject["tax_rates"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsTaxRatesXa5cce9b9>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc",
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

public fun inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc(
    block: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc =
    InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemXf39c2bdc.build(block)
