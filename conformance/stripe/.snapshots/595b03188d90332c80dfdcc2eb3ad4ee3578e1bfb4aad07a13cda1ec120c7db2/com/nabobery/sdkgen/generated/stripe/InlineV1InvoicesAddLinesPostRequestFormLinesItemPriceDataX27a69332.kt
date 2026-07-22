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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/price_data.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1add_lines/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema/properties/lines/items/properties/price_data
 */
@Serializable(with = InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332.Serializer::class)
public class InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332(
    public val currency: String,
    public val product: String? = null,
    public val productData: InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataProductDataX0c9822d5? = null,
    public val taxBehavior: InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataTaxBehaviorXe8883f64? = null,
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
            InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataProductDataX0c9822d5? = null

        public var taxBehavior:
            InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataTaxBehaviorXe8883f64? = null

        public var unitAmount: Int? = null

        public var unitAmountDecimal: String? = null

        public fun build(): InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332 {
            check(currencyValue != null) { "currency is required" }
            return InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332(
                currency = currency,
                product = product,
                productData = productData,
                taxBehavior = taxBehavior,
                unitAmount = unitAmount,
                unitAmountDecimal = unitAmountDecimal,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332 must be a JSON object",
                    )
            val currency = json.decodeRequired<String>(rawObject, "currency")
            return InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332(
                currency = currency,
                product = rawObject["product"]?.let { json.decodeFromJsonElement<String>(it) },
                productData =
                    rawObject["product_data"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataProductDataX0c9822d5>(
                                it,
                            )
                    },
                taxBehavior =
                    rawObject["tax_behavior"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataTaxBehaviorXe8883f64>(
                                it,
                            )
                    },
                unitAmount = rawObject["unit_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
                unitAmountDecimal = rawObject["unit_amount_decimal"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("currency", value.currency)
                    value.product?.let { put("product", it) }
                    value.productData?.let { put("product_data", json.encodeToJsonElement(it)) }
                    value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
                    value.unitAmount?.let { put("unit_amount", json.encodeToJsonElement(it)) }
                    value.unitAmountDecimal?.let { put("unit_amount_decimal", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332(
    block: InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332.Builder.() -> Unit,
): InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332 =
    InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1InvoicesAddLinesPostRequestFormLinesItemPriceDataX27a69332 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
