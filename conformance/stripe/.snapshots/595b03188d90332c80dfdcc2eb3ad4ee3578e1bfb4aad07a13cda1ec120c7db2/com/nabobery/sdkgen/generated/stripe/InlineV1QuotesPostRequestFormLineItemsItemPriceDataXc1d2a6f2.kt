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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/price_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/line_items/items/properties/price_data
 */
@Serializable(with = InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2.Serializer::class)
public class InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2(
    public val currency: String,
    public val product: String,
    public val recurring: InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb? = null,
    public val taxBehavior: InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorXf6bfff43? = null,
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

        public var recurring: InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb? =
            null

        public var taxBehavior: InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorXf6bfff43? =
            null

        public var unitAmount: Int? = null

        public var unitAmountDecimal: String? = null

        public fun build(): InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2 {
            check(currencyValue != null) { "currency is required" }
            check(productValue != null) { "product is required" }
            return InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2(
                currency = currency,
                product = product,
                recurring = recurring,
                taxBehavior = taxBehavior,
                unitAmount = unitAmount,
                unitAmountDecimal = unitAmountDecimal,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2 must be a JSON object",
                    )
            val currency = json.decodeRequired<String>(rawObject, "currency")
            val product = json.decodeRequired<String>(rawObject, "product")
            return InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2(
                currency = currency,
                product = product,
                recurring =
                    rawObject["recurring"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemPriceDataRecurringX7fe86afb>(
                                it,
                            )
                    },
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1QuotesPostRequestFormLineItemsItemPriceDataTaxBehaviorXf6bfff43>(
                                it,
                            )
                    },
                unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("currency", value.currency)
                    put("product", value.product)
                    value.recurring?.let { put("recurring", json.encodeToJsonElement(it)) }
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2(
    block: InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2.Builder.() -> Unit,
): InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2 =
    InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1QuotesPostRequestFormLineItemsItemPriceDataXc1d2a6f2 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
