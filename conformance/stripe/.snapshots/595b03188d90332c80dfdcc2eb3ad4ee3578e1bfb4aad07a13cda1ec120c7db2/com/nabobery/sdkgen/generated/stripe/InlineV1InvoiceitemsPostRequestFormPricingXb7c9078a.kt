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
 * The pricing information for the invoice item.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems~1{invoiceitem}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/pricing
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a(
    public val price: String? = null,
) {
    public class Builder {
        public var price: String? = null

        public fun build(): InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a =
            InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a(
                price = price,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a must be a JSON object",
                    )
            return InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a(
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.price?.let { put("price", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoiceitemsPostRequestFormPricingXb7c9078a(
    block: InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a.Builder.() -> Unit,
): InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a =
    InlineV1InvoiceitemsPostRequestFormPricingXb7c9078a.build(block)
