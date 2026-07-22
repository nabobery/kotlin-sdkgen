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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/discounts/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1lines~1{line_item_id}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/discounts/anyOf/0/items
 */
@Serializable(with = InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a.Serializer::class)
public class InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a(
    public val coupon: String? = null,
    public val discount: String? = null,
    public val promotionCode: String? = null,
) {
    public class Builder {
        public var coupon: String? = null

        public var discount: String? = null

        public var promotionCode: String? = null

        public fun build(): InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a =
            InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a(
                coupon = coupon,
                discount = discount,
                promotionCode = promotionCode,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a must be a JSON object",
                    )
            return InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a(
                coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
                discount = rawObject["discount"]?.let { json.decodeFromJsonElement<String>(it) },
                promotionCode = rawObject["promotion_code"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a",
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

public fun inlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a(
    block: InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a.Builder.() -> Unit,
): InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a =
    InlineV1InvoicesLinesPostRequestFormDiscountsAnyOf1ItemX0f55c28a.build(block)
