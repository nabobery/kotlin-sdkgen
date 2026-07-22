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
 * Source: sdkgen://source/openapi.json#/components/schemas/stackable_discount_with_discount_settings_and_discount_end
 */
@Serializable(with = StackableDiscountWithDiscountSettingsAndDiscountEnd.Serializer::class)
public class StackableDiscountWithDiscountSettingsAndDiscountEnd(
    /**
     * ID of the coupon to create a new discount for.
     */
    public val coupon: InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059? = null,
    /**
     * ID of an existing discount on the object (or one of its ancestors) to reuse.
     */
    public val discount: InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240? = null,
    /**
     * ID of the promotion code to create a new discount for.
     */
    public val promotionCode: InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf? = null,
) {
    public class Builder {
        /**
         * ID of the coupon to create a new discount for.
         */
        public var coupon: InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059? =
            null

        /**
         * ID of an existing discount on the object (or one of its ancestors) to reuse.
         */
        public var discount: InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240? =
            null

        /**
         * ID of the promotion code to create a new discount for.
         */
        public var promotionCode:
            InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf? = null

        public fun build(): StackableDiscountWithDiscountSettingsAndDiscountEnd =
            StackableDiscountWithDiscountSettingsAndDiscountEnd(
                coupon = coupon,
                discount = discount,
                promotionCode = promotionCode,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): StackableDiscountWithDiscountSettingsAndDiscountEnd =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<StackableDiscountWithDiscountSettingsAndDiscountEnd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): StackableDiscountWithDiscountSettingsAndDiscountEnd {
            val jsonDecoder = decoder.requireJsonDecoder("StackableDiscountWithDiscountSettingsAndDiscountEnd")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "StackableDiscountWithDiscountSettingsAndDiscountEnd must be a JSON object",
                    )
            return StackableDiscountWithDiscountSettingsAndDiscountEnd(
                coupon =
                    rawObject["coupon"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlineStackableDiscountWithDiscountSettingsAndDiscountEndCouponX49f71059?>(
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
                                .decodeFromJsonElement<InlineStackableDiscountWithDiscountSettingsAndDiscountEndDiscountX1c59d240?>(
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
                                .decodeFromJsonElement<InlineStackableDiscountWithDiscountSettingsAndDiscountEndPromotionCodeXa6eea1bf?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: StackableDiscountWithDiscountSettingsAndDiscountEnd,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("StackableDiscountWithDiscountSettingsAndDiscountEnd")
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

public fun stackableDiscountWithDiscountSettingsAndDiscountEnd(
    block: StackableDiscountWithDiscountSettingsAndDiscountEnd.Builder.() -> Unit,
): StackableDiscountWithDiscountSettingsAndDiscountEnd =
    StackableDiscountWithDiscountSettingsAndDiscountEnd.build(block)
