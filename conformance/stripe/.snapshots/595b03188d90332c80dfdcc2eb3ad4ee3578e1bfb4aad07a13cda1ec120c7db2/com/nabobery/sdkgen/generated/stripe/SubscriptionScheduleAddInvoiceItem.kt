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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * An Add Invoice Item describes the prices and quantities that will be added as pending invoice items when entering a
 * phase.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule_add_invoice_item
 */
@Serializable(with = SubscriptionScheduleAddInvoiceItem.Serializer::class)
public class SubscriptionScheduleAddInvoiceItem(
    discounts: List<DiscountsResourceStackableDiscountWithDiscountEnd>,
    public val period: SubscriptionScheduleAddInvoiceItemPeriod,
    /**
     * ID of the price used to generate the invoice item.
     */
    public val price: InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2,
    /**
     * Controls whether discounts apply to this invoice item. Defaults to true if no value is provided.
     */
    public val discountable: Boolean? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * The quantity of the invoice item.
     */
    public val quantity: Int? = null,
    /**
     * The tax rates which apply to the item. When set, the `default_tax_rates` do not apply to this item.
     */
    public val taxRates: List<TaxRate>? = null,
) {
    /**
     * The stackable discounts that will be applied to the item.
     */
    public val discounts: List<DiscountsResourceStackableDiscountWithDiscountEnd> = discounts.toList()

    public class Builder {
        private var discountsValue: List<DiscountsResourceStackableDiscountWithDiscountEnd>? = null

        public var discounts: List<DiscountsResourceStackableDiscountWithDiscountEnd>
            get() = requireNotNull(discountsValue) { "discounts is required" }
            set(`value`) {
                discountsValue = value
            }

        private var periodValue: SubscriptionScheduleAddInvoiceItemPeriod? = null

        public var period: SubscriptionScheduleAddInvoiceItemPeriod
            get() = requireNotNull(periodValue) { "period is required" }
            set(`value`) {
                periodValue = value
            }

        private var priceValue: InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2? = null

        public var price: InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2
            get() = requireNotNull(priceValue) { "price is required" }
            set(`value`) {
                priceValue = value
            }

        /**
         * Controls whether discounts apply to this invoice item. Defaults to true if no value is provided.
         */
        public var discountable: Boolean? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        /**
         * The quantity of the invoice item.
         */
        public var quantity: Int? = null

        /**
         * The tax rates which apply to the item. When set, the `default_tax_rates` do not apply to this item.
         */
        public var taxRates: List<TaxRate>? = null

        public fun build(): SubscriptionScheduleAddInvoiceItem {
            check(discountsValue != null) { "discounts is required" }
            check(periodValue != null) { "period is required" }
            check(priceValue != null) { "price is required" }
            return SubscriptionScheduleAddInvoiceItem(
                discounts = discounts,
                period = period,
                price = price,
                discountable = discountable,
                metadata = metadata,
                quantity = quantity,
                taxRates = taxRates,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): SubscriptionScheduleAddInvoiceItem = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<SubscriptionScheduleAddInvoiceItem> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): SubscriptionScheduleAddInvoiceItem {
            val jsonDecoder = decoder.requireJsonDecoder("SubscriptionScheduleAddInvoiceItem")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("SubscriptionScheduleAddInvoiceItem must be a JSON object")
            val discounts =
                json.decodeRequired<List<DiscountsResourceStackableDiscountWithDiscountEnd>>(
                    rawObject,
                    "discounts",
                )
            val period = json.decodeRequired<SubscriptionScheduleAddInvoiceItemPeriod>(rawObject, "period")
            val price = json.decodeRequired<InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2>(rawObject, "price")
            return SubscriptionScheduleAddInvoiceItem(
                discounts = discounts,
                period = period,
                price = price,
                discountable =
                    rawObject["discountable"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Boolean?>(element)
                        }
                    },
                metadata =
                    rawObject["metadata"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Map<String, String>?>(element)
                        }
                    },
                quantity =
                    rawObject["quantity"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                taxRates =
                    rawObject["tax_rates"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<List<TaxRate>?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: SubscriptionScheduleAddInvoiceItem,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("SubscriptionScheduleAddInvoiceItem")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("discounts", json.encodeToJsonElement(value.discounts))
                    put("period", json.encodeToJsonElement(value.period))
                    put("price", json.encodeToJsonElement(value.price))
                    value.discountable?.let { put("discountable", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.quantity?.let { put("quantity", json.encodeToJsonElement(it)) }
                    value.taxRates?.let { put("tax_rates", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun subscriptionScheduleAddInvoiceItem(
    block: SubscriptionScheduleAddInvoiceItem.Builder.() -> Unit,
): SubscriptionScheduleAddInvoiceItem = SubscriptionScheduleAddInvoiceItem.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "SubscriptionScheduleAddInvoiceItem is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
