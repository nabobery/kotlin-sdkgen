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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoiceitems/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/pricing
 */
@Serializable(with = InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2.Serializer::class)
public class InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2(
    public val price: String? = null,
) {
    public class Builder {
        public var price: String? = null

        public fun build(): InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2 =
            InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2(
                price = price,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2 must be a JSON object",
                    )
            return InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2(
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.price?.let { put("price", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2(
    block: InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2.Builder.() -> Unit,
): InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2 =
    InlineV1InvoiceitemsPostRequestFormPricingXb5ef51f2.build(block)
