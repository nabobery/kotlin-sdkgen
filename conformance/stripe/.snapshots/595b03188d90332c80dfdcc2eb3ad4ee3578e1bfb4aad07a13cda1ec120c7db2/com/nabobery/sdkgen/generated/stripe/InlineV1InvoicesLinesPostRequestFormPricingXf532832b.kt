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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/pricing
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormPricingXf532832b.Serializer::class)
public class InlineV1InvoicesLinesPostRequestFormPricingXf532832b(
    public val price: String? = null,
) {
    public class Builder {
        public var price: String? = null

        public fun build(): InlineV1InvoicesLinesPostRequestFormPricingXf532832b =
            InlineV1InvoicesLinesPostRequestFormPricingXf532832b(
                price = price,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesLinesPostRequestFormPricingXf532832b =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormPricingXf532832b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormPricingXf532832b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesLinesPostRequestFormPricingXf532832b")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesLinesPostRequestFormPricingXf532832b must be a JSON object",
                    )
            return InlineV1InvoicesLinesPostRequestFormPricingXf532832b(
                price = rawObject["price"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesLinesPostRequestFormPricingXf532832b,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesLinesPostRequestFormPricingXf532832b")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.price?.let { put("price", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1InvoicesLinesPostRequestFormPricingXf532832b(
    block: InlineV1InvoicesLinesPostRequestFormPricingXf532832b.Builder.() -> Unit,
): InlineV1InvoicesLinesPostRequestFormPricingXf532832b =
    InlineV1InvoicesLinesPostRequestFormPricingXf532832b.build(block)
