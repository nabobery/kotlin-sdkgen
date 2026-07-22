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
 * Source: sdkgen://source/openapi.json#/components/schemas/stackable_discount_with_discount_settings
 */
@Serializable(with = StackableDiscountWithDiscountSettings.Serializer::class)
public class StackableDiscountWithDiscountSettings(
    /**
     * ID of the coupon to create a new discount for.
     */
    public val coupon: InlineStackableDiscountWithDiscountSettingsCouponX2c37183c? = null,
    /**
     * ID of an existing discount on the object (or one of its ancestors) to reuse.
     */
    public val discount: InlineStackableDiscountWithDiscountSettingsDiscountX14344739? = null,
    /**
     * ID of the promotion code to create a new discount for.
     */
    public val promotionCode: InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f? = null,
) {
    public class Builder {
        /**
         * ID of the coupon to create a new discount for.
         */
        public var coupon: InlineStackableDiscountWithDiscountSettingsCouponX2c37183c? = null

        /**
         * ID of an existing discount on the object (or one of its ancestors) to reuse.
         */
        public var discount: InlineStackableDiscountWithDiscountSettingsDiscountX14344739? = null

        /**
         * ID of the promotion code to create a new discount for.
         */
        public var promotionCode: InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f? =
            null

        public fun build(): StackableDiscountWithDiscountSettings =
            StackableDiscountWithDiscountSettings(
                coupon = coupon,
                discount = discount,
                promotionCode = promotionCode,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): StackableDiscountWithDiscountSettings =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<StackableDiscountWithDiscountSettings> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): StackableDiscountWithDiscountSettings {
            val jsonDecoder = decoder.requireJsonDecoder("StackableDiscountWithDiscountSettings")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("StackableDiscountWithDiscountSettings must be a JSON object")
            return StackableDiscountWithDiscountSettings(
                coupon =
                    rawObject["coupon"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineStackableDiscountWithDiscountSettingsCouponX2c37183c?>(
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
                            json.decodeFromJsonElement<InlineStackableDiscountWithDiscountSettingsDiscountX14344739?>(
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
                                .decodeFromJsonElement<InlineStackableDiscountWithDiscountSettingsPromotionCodeXc717165f?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: StackableDiscountWithDiscountSettings,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("StackableDiscountWithDiscountSettings")
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

public fun stackableDiscountWithDiscountSettings(
    block: StackableDiscountWithDiscountSettings.Builder.() -> Unit,
): StackableDiscountWithDiscountSettings = StackableDiscountWithDiscountSettings.build(block)
