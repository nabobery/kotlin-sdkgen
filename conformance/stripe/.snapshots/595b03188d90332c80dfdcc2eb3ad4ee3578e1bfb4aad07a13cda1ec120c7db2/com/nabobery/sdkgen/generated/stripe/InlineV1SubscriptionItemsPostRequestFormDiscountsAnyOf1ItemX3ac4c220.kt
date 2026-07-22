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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/discounts/anyOf/0/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items~1{item}/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/discounts/anyOf/0/items
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220(
    public val coupon: String? = null,
    public val discount: String? = null,
    public val promotionCode: String? = null,
) {
    public class Builder {
        public var coupon: String? = null

        public var discount: String? = null

        public var promotionCode: String? = null

        public fun build(): InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220 =
            InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220(
                coupon = coupon,
                discount = discount,
                promotionCode = promotionCode,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220 must be a JSON object",
                    )
            return InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220(
                coupon = rawObject["coupon"]?.let { json.decodeFromJsonElement<String>(it) },
                discount = rawObject["discount"]?.let { json.decodeFromJsonElement<String>(it) },
                promotionCode = rawObject["promotion_code"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220",
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

public fun inlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220(
    block: InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220.Builder.() -> Unit,
): InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220 =
    InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX3ac4c220.build(block)
