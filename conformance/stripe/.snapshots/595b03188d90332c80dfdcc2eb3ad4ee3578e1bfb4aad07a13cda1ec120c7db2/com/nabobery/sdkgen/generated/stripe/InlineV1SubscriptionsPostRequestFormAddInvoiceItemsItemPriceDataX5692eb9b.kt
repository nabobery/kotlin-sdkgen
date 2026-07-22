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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/price_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/price_data
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b(
    public val currency: String,
    public val product: String,
    public val taxBehavior: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxBehaviorXc1dea034? = null,
    public val unitAmount: Int? = null,
    public val unitAmountDecimal: String? = null,
) {
    public class Builder {
        private var currencyValue: String? = null

        public var currency: String
            get() = requireNotNull(currencyValue) { "currency is required" }
            set(`value`) {
                currencyValue = value
            }

        private var productValue: String? = null

        public var product: String
            get() = requireNotNull(productValue) { "product is required" }
            set(`value`) {
                productValue = value
            }

        public var taxBehavior:
            InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxBehaviorXc1dea034? = null

        public var unitAmount: Int? = null

        public var unitAmountDecimal: String? = null

        public fun build(): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b {
            check(currencyValue != null) { "currency is required" }
            check(productValue != null) { "product is required" }
            return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b(
                currency = currency,
                product = product,
                taxBehavior = taxBehavior,
                unitAmount = unitAmount,
                unitAmountDecimal = unitAmountDecimal,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b must be a JSON object",
                    )
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val product = json.decodeRequired<String>(rawObject, "product")
            return InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b(
                currency = currency,
                product = product,
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemTaxBehaviorXc1dea034>(
                                it,
                            )
                    },
                unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("currency", value.currency)
                    put("product", value.product)
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b(
    block: InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b.Builder.() -> Unit,
): InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b =
    InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1SubscriptionsPostRequestFormAddInvoiceItemsItemPriceDataX5692eb9b is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
