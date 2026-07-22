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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items/properties/price_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/line_items/items/properties/price_data
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5(
    public val currency: String,
    public val product: String? = null,
    public val productData: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataProductDataXc6295b73? = null,
    public val recurring: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca? = null,
    public val taxBehavior: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1? = null,
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

        public var product: String? = null

        public var productData:
            InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataProductDataXc6295b73? = null

        public var recurring:
            InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca? = null

        public var taxBehavior:
            InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1? = null

        public var unitAmount: Int? = null

        public var unitAmountDecimal: String? = null

        public fun build(): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5 {
            check(currencyValue != null) { "currency is required" }
            return InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5(
                currency = currency,
                product = product,
                productData = productData,
                recurring = recurring,
                taxBehavior = taxBehavior,
                unitAmount = unitAmount,
                unitAmountDecimal = unitAmountDecimal,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5 must be a JSON object",
                    )
            val currency = json.decodeRequired<String>(rawObject, "currency")
            return InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5(
                currency = currency,
                product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
                productData =
                    rawObject["product_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataProductDataXc6295b73>(
                                it,
                            )
                    },
                recurring =
                    rawObject["recurring"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataRecurringX359a0eca>(
                                it,
                            )
                    },
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataTaxBehaviorXdc1122d1>(
                                it,
                            )
                    },
                unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("currency", value.currency)
                    value.product?.let { put("product", it) }
                    value.productData?.let { put("product_data", json.encodeToJsonElement(it)) }
                    value.recurring?.let { put("recurring", json.encodeToJsonElement(it)) }
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5(
    block: InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5.Builder.() -> Unit,
): InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5 =
    InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1PaymentLinksPostRequestFormLineItemsItemPriceDataX5ba488d5 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
