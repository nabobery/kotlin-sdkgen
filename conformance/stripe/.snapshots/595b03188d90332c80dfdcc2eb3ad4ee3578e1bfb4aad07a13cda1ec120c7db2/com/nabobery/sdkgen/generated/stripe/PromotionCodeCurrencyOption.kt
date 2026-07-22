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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/promotion_code_currency_option
 */
@Serializable(with = PromotionCodeCurrencyOption.Serializer::class)
public class PromotionCodeCurrencyOption(
    /**
     * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to
     * work).
     */
    public val minimumAmount: Int,
) {
    public class Builder {
        private var minimumAmountValue: Int? = null

        public var minimumAmount: Int
            get() = requireNotNull(minimumAmountValue) { "minimumAmount is required" }
            set(`value`) {
                minimumAmountValue = value
            }

        public fun build(): PromotionCodeCurrencyOption {
            check(minimumAmountValue != null) { "minimumAmount is required" }
            return PromotionCodeCurrencyOption(
                minimumAmount = minimumAmount,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PromotionCodeCurrencyOption = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PromotionCodeCurrencyOption> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PromotionCodeCurrencyOption {
            val jsonDecoder = decoder.requireJsonDecoder("PromotionCodeCurrencyOption")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PromotionCodeCurrencyOption must be a JSON object")
            val minimumAmount = json.decodeRequired<Int>(rawObject, "minimum_amount")
            return PromotionCodeCurrencyOption(
                minimumAmount = minimumAmount,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PromotionCodeCurrencyOption,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PromotionCodeCurrencyOption")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("minimum_amount", json.encodeToJsonElement(value.minimumAmount))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun promotionCodeCurrencyOption(
    block: PromotionCodeCurrencyOption.Builder.() -> Unit,
): PromotionCodeCurrencyOption = PromotionCodeCurrencyOption.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("PromotionCodeCurrencyOption is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
