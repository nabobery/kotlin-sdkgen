package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/promotion_codes_resource_restrictions
 */
@Serializable(with = PromotionCodesResourceRestrictions.Serializer::class)
public class PromotionCodesResourceRestrictions(
    /**
     * A Boolean indicating if the Promotion Code should only be redeemed for Customers without any successful payments or
     * invoices
     */
    public val firstTimeTransaction: Boolean,
    /**
     * Promotion code restrictions defined in each available currency option. Each key must be a three-letter [ISO
     * currency code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
     * currency](https://stripe.com/docs/currencies).
     */
    public val currencyOptions: Map<String, PromotionCodeCurrencyOption>? = null,
    /**
     * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to
     * work).
     */
    public val minimumAmount: Int? = null,
    /**
     * Three-letter [ISO code](https://stripe.com/docs/currencies) for minimum_amount
     */
    public val minimumAmountCurrency: String? = null,
) {
    public class Builder {
        private var firstTimeTransactionValue: Boolean? = null

        public var firstTimeTransaction: Boolean
            get() = requireNotNull(firstTimeTransactionValue) { "firstTimeTransaction is required" }
            set(`value`) {
                firstTimeTransactionValue = value
            }

        /**
         * Promotion code restrictions defined in each available currency option. Each key must be a three-letter [ISO
         * currency code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
         * currency](https://stripe.com/docs/currencies).
         */
        public var currencyOptions: Map<String, PromotionCodeCurrencyOption>? = null

        /**
         * Minimum amount required to redeem this Promotion Code into a Coupon (e.g., a purchase must be $100 or more to
         * work).
         */
        public var minimumAmount: Int? = null

        /**
         * Three-letter [ISO code](https://stripe.com/docs/currencies) for minimum_amount
         */
        public var minimumAmountCurrency: String? = null

        public fun build(): PromotionCodesResourceRestrictions {
            check(firstTimeTransactionValue != null) { "firstTimeTransaction is required" }
            return PromotionCodesResourceRestrictions(
                firstTimeTransaction = firstTimeTransaction,
                currencyOptions = currencyOptions,
                minimumAmount = minimumAmount,
                minimumAmountCurrency = minimumAmountCurrency,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PromotionCodesResourceRestrictions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PromotionCodesResourceRestrictions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PromotionCodesResourceRestrictions {
            val jsonDecoder = decoder.requireJsonDecoder("PromotionCodesResourceRestrictions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PromotionCodesResourceRestrictions must be a JSON object")
            val firstTimeTransaction = json.decodeRequired<Boolean>(rawObject, "first_time_transaction")
            return PromotionCodesResourceRestrictions(
                firstTimeTransaction = firstTimeTransaction,
                currencyOptions =
                    rawObject["currency_options"]?.let {
                        json.decodeFromJsonElement<Map<String, PromotionCodeCurrencyOption>>(it)
                    },
                minimumAmount =
                    rawObject["minimum_amount"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                minimumAmountCurrency =
                    rawObject["minimum_amount_currency"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PromotionCodesResourceRestrictions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PromotionCodesResourceRestrictions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("first_time_transaction", json.encodeToJsonElement(value.firstTimeTransaction))
                    value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
                    value.minimumAmount?.let { put("minimum_amount", json.encodeToJsonElement(it)) }
                    value.minimumAmountCurrency?.let { put("minimum_amount_currency", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun promotionCodesResourceRestrictions(
    block: PromotionCodesResourceRestrictions.Builder.() -> Unit,
): PromotionCodesResourceRestrictions = PromotionCodesResourceRestrictions.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "PromotionCodesResourceRestrictions is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
