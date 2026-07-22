package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/discounts_resource_stackable_discount_with_discount_end
 */
@Serializable(with = DiscountsResourceStackableDiscountWithDiscountEnd.Serializer::class)
public class DiscountsResourceStackableDiscountWithDiscountEnd(
    /**
     * ID of the coupon to create a new discount for.
     */
    public val coupon: InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa? = null,
    /**
     * ID of an existing discount on the object (or one of its ancestors) to reuse.
     */
    public val discount: InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea? = null,
    /**
     * ID of the promotion code to create a new discount for.
     */
    public val promotionCode: InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed? = null,
) {
    public class Builder {
        /**
         * ID of the coupon to create a new discount for.
         */
        public var coupon: InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa? =
            null

        /**
         * ID of an existing discount on the object (or one of its ancestors) to reuse.
         */
        public var discount: InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea? =
            null

        /**
         * ID of the promotion code to create a new discount for.
         */
        public var promotionCode:
            InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed? = null

        public fun build(): DiscountsResourceStackableDiscountWithDiscountEnd =
            DiscountsResourceStackableDiscountWithDiscountEnd(
                coupon = coupon,
                discount = discount,
                promotionCode = promotionCode,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): DiscountsResourceStackableDiscountWithDiscountEnd =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<DiscountsResourceStackableDiscountWithDiscountEnd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): DiscountsResourceStackableDiscountWithDiscountEnd {
            val jsonDecoder = decoder.requireJsonDecoder("DiscountsResourceStackableDiscountWithDiscountEnd")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "DiscountsResourceStackableDiscountWithDiscountEnd must be a JSON object",
                    )
            return DiscountsResourceStackableDiscountWithDiscountEnd(
                coupon =
                    rawObject["coupon"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineDiscountsResourceStackableDiscountWithDiscountEndCouponX8a8c7eaa?>(
                                    element,
                                )
                        }
                    },
                discount =
                    rawObject["discount"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineDiscountsResourceStackableDiscountWithDiscountEndDiscountXc537ebea?>(
                                    element,
                                )
                        }
                    },
                promotionCode =
                    rawObject["promotion_code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineDiscountsResourceStackableDiscountWithDiscountEndPromotionCodeX938d36ed?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: DiscountsResourceStackableDiscountWithDiscountEnd,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("DiscountsResourceStackableDiscountWithDiscountEnd")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.coupon?.let { put("coupon", json.encodeToJsonElement(it)) }
                    value.discount?.let { put("discount", json.encodeToJsonElement(it)) }
                    value.promotionCode?.let { put("promotion_code", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun discountsResourceStackableDiscountWithDiscountEnd(
    block: DiscountsResourceStackableDiscountWithDiscountEnd.Builder.() -> Unit,
): DiscountsResourceStackableDiscountWithDiscountEnd = DiscountsResourceStackableDiscountWithDiscountEnd.build(block)
