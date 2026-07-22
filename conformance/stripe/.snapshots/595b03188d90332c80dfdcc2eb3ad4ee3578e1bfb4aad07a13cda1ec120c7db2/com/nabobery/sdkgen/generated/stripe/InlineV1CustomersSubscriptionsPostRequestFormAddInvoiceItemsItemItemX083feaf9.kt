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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/discounts/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/add_invoice_items/items/properties/discounts/items
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9(
    public val coupon: String? = null,
    public val discount: String? = null,
    public val promotionCode: String? = null,
) {
    public class Builder {
        public var coupon: String? = null

        public var discount: String? = null

        public var promotionCode: String? = null

        public fun build(): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9 =
            InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9(
                coupon = coupon,
                discount = discount,
                promotionCode = promotionCode,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9 must be a JSON object",
                    )
            return InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9(
                coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
                discount = rawObject["discount"]?.let { json.decodeFromJsonElement<String>(it) },
                promotionCode = rawObject["promotion_code"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.coupon?.let { put("coupon", it) }
                    value.discount?.let { put("discount", it) }
                    value.promotionCode?.let { put("promotion_code", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9(
    block: InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9.Builder.() -> Unit,
): InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9 =
    InlineV1CustomersSubscriptionsPostRequestFormAddInvoiceItemsItemItemX083feaf9.build(block)
