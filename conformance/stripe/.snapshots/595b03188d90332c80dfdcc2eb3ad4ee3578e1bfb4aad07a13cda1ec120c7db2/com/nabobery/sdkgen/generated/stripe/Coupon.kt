package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@Serializable
public data class CouponView(
    @SerialName("amount_off")
    public val amountOff: Int? = null,
    @SerialName("applies_to")
    public val appliesTo: CouponAppliesTo? = null,
    public val created: Int,
    public val currency: String? = null,
    @SerialName("currency_options")
    public val currencyOptions: Map<String, CouponCurrencyOption>? = null,
    public val duration: InlineCouponDurationX7e8fa5e4,
    @SerialName("duration_in_months")
    public val durationInMonths: Int? = null,
    public val id: String,
    public val livemode: Boolean,
    @SerialName("max_redemptions")
    public val maxRedemptions: Int? = null,
    public val metadata: Map<String, String>? = null,
    public val name: String? = null,
    @SerialName("object")
    public val objectValue: InlineCouponObjectValueX72b6b420,
    @SerialName("percent_off")
    public val percentOff: Double? = null,
    @SerialName("redeem_by")
    public val redeemBy: Int? = null,
    @SerialName("times_redeemed")
    public val timesRedeemed: Int,
    public val valid: Boolean,
)

/**
 * A coupon contains information about a percent-off or amount-off discount you
 * might want to apply to a customer. Coupons may be applied to [subscriptions](https://api.stripe.com#subscriptions),
 * [invoices](https://api.stripe.com#invoices),
 * [checkout sessions](https://docs.stripe.com/api/checkout/sessions), [quotes](https://api.stripe.com#quotes), and
 * more. Coupons do not work with conventional one-off [charges](/api/charges/create) or [payment
 * intents](https://docs.stripe.com/api/payment_intents).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/coupon
 */
@Serializable(with = Coupon.Serializer::class)
public class Coupon(
    /**
     * Time at which the object was created. Measured in seconds since the Unix epoch.
     */
    public val created: Int,
    /**
     * One of `forever`, `once`, or `repeating`. Describes how long a customer who applies this coupon will get the
     * discount.
     */
    public val duration: InlineCouponDurationX7e8fa5e4,
    /**
     * Unique identifier for the object.
     */
    public val id: String,
    /**
     * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
     */
    public val livemode: Boolean,
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    public val objectValue: InlineCouponObjectValueX72b6b420,
    /**
     * Number of times this coupon has been applied to a customer.
     */
    public val timesRedeemed: Int,
    /**
     * Taking account of the above properties, whether this coupon can still be applied to a customer.
     */
    public val valid: Boolean,
    /**
     * Amount (in the `currency` specified) that will be taken off the subtotal of any invoices for this customer.
     */
    public val amountOff: Int? = null,
    public val appliesTo: CouponAppliesTo? = null,
    /**
     * If `amount_off` has been set, the three-letter [ISO code for the currency](https://stripe.com/docs/currencies) of
     * the amount to take off.
     */
    public val currency: String? = null,
    /**
     * Coupons defined in each available currency option. Each key must be a three-letter [ISO currency
     * code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
     * currency](https://stripe.com/docs/currencies).
     */
    public val currencyOptions: Map<String, CouponCurrencyOption>? = null,
    /**
     * If `duration` is `repeating`, the number of months the coupon applies. Null if coupon `duration` is `forever` or
     * `once`.
     */
    public val durationInMonths: Int? = null,
    /**
     * Maximum number of times this coupon can be redeemed, in total, across all customers, before it is no longer valid.
     */
    public val maxRedemptions: Int? = null,
    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
     * for storing additional information about the object in a structured format.
     */
    public val metadata: Map<String, String>? = null,
    /**
     * Name of the coupon displayed to customers on for instance invoices or receipts.
     */
    public val name: String? = null,
    /**
     * Percent that will be taken off the subtotal of any invoices for this customer for the duration of the coupon. For
     * example, a coupon with percent_off of 50 will make a $ (or local equivalent)100 invoice $ (or local equivalent)50
     * instead.
     */
    public val percentOff: Double? = null,
    /**
     * Date after which the coupon can no longer be redeemed.
     */
    public val redeemBy: Int? = null,
) {
    public class Builder {
        private var createdValue: Int? = null

        public var created: Int
            get() = requireNotNull(createdValue) { "created is required" }
            set(`value`) {
                createdValue = value
            }

        private var durationValue: InlineCouponDurationX7e8fa5e4? = null

        public var duration: InlineCouponDurationX7e8fa5e4
            get() = requireNotNull(durationValue) { "duration is required" }
            set(`value`) {
                durationValue = value
            }

        private var idValue: String? = null

        public var id: String
            get() = requireNotNull(idValue) { "id is required" }
            set(`value`) {
                idValue = value
            }

        private var livemodeValue: Boolean? = null

        public var livemode: Boolean
            get() = requireNotNull(livemodeValue) { "livemode is required" }
            set(`value`) {
                livemodeValue = value
            }

        private var objectValueValue: InlineCouponObjectValueX72b6b420? = null

        public var objectValue: InlineCouponObjectValueX72b6b420
            get() = requireNotNull(objectValueValue) { "objectValue is required" }
            set(`value`) {
                objectValueValue = value
            }

        private var timesRedeemedValue: Int? = null

        public var timesRedeemed: Int
            get() = requireNotNull(timesRedeemedValue) { "timesRedeemed is required" }
            set(`value`) {
                timesRedeemedValue = value
            }

        private var validValue: Boolean? = null

        public var valid: Boolean
            get() = requireNotNull(validValue) { "valid is required" }
            set(`value`) {
                validValue = value
            }

        /**
         * Amount (in the `currency` specified) that will be taken off the subtotal of any invoices for this customer.
         */
        public var amountOff: Int? = null

        public var appliesTo: CouponAppliesTo? = null

        /**
         * If `amount_off` has been set, the three-letter [ISO code for the currency](https://stripe.com/docs/currencies) of
         * the amount to take off.
         */
        public var currency: String? = null

        /**
         * Coupons defined in each available currency option. Each key must be a three-letter [ISO currency
         * code](https://www.iso.org/iso-4217-currency-codes.html) and a [supported
         * currency](https://stripe.com/docs/currencies).
         */
        public var currencyOptions: Map<String, CouponCurrencyOption>? = null

        /**
         * If `duration` is `repeating`, the number of months the coupon applies. Null if coupon `duration` is `forever` or
         * `once`.
         */
        public var durationInMonths: Int? = null

        /**
         * Maximum number of times this coupon can be redeemed, in total, across all customers, before it is no longer
         * valid.
         */
        public var maxRedemptions: Int? = null

        /**
         * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
         * useful for storing additional information about the object in a structured format.
         */
        public var metadata: Map<String, String>? = null

        /**
         * Name of the coupon displayed to customers on for instance invoices or receipts.
         */
        public var name: String? = null

        /**
         * Percent that will be taken off the subtotal of any invoices for this customer for the duration of the coupon. For
         * example, a coupon with percent_off of 50 will make a $ (or local equivalent)100 invoice $ (or local equivalent)50
         * instead.
         */
        public var percentOff: Double? = null

        /**
         * Date after which the coupon can no longer be redeemed.
         */
        public var redeemBy: Int? = null

        public fun build(): Coupon {
            check(createdValue != null) { "created is required" }
            check(durationValue != null) { "duration is required" }
            check(idValue != null) { "id is required" }
            check(livemodeValue != null) { "livemode is required" }
            check(objectValueValue != null) { "objectValue is required" }
            check(timesRedeemedValue != null) { "timesRedeemed is required" }
            check(validValue != null) { "valid is required" }
            return Coupon(
                created = created,
                duration = duration,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                timesRedeemed = timesRedeemed,
                valid = valid,
                amountOff = amountOff,
                appliesTo = appliesTo,
                currency = currency,
                currencyOptions = currencyOptions,
                durationInMonths = durationInMonths,
                maxRedemptions = maxRedemptions,
                metadata = metadata,
                name = name,
                percentOff = percentOff,
                redeemBy = redeemBy,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): Coupon = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<Coupon> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): Coupon {
            val jsonDecoder = decoder.requireJsonDecoder("Coupon")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("Coupon must be a JSON object")
            val created = json.decodeRequired<Int>(rawObject, "created")
            val duration = json.decodeRequired<InlineCouponDurationX7e8fa5e4>(rawObject, "duration")
            val id = json.decodeRequired<String>(rawObject, "id")
            val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
            val objectValue = json.decodeRequired<InlineCouponObjectValueX72b6b420>(rawObject, "object")
            val timesRedeemed = json.decodeRequired<Int>(rawObject, "times_redeemed")
            val valid = json.decodeRequired<Boolean>(rawObject, "valid")
            return Coupon(
                created = created,
                duration = duration,
                id = id,
                livemode = livemode,
                objectValue = objectValue,
                timesRedeemed = timesRedeemed,
                valid = valid,
                amountOff =
                    rawObject["amount_off"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                appliesTo = rawObject["applies_to"]?.let { json.decodeFromJsonElement<CouponAppliesTo>(it) },
                currency =
                    rawObject["currency"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                currencyOptions =
                    rawObject["currency_options"]?.let {
                        json.decodeFromJsonElement<Map<String, CouponCurrencyOption>>(it)
                    },
                durationInMonths =
                    rawObject["duration_in_months"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                maxRedemptions =
                    rawObject["max_redemptions"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                metadata =
                    rawObject["metadata"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Map<String, String>?>(element)
                        }
                    },
                name =
                    rawObject["name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                percentOff =
                    rawObject["percent_off"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Double?>(element)
                        }
                    },
                redeemBy =
                    rawObject["redeem_by"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: Coupon,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("Coupon")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("created", json.encodeToJsonElement(value.created))
                    put("duration", json.encodeToJsonElement(value.duration))
                    put("id", value.id)
                    put("livemode", json.encodeToJsonElement(value.livemode))
                    put("object", json.encodeToJsonElement(value.objectValue))
                    put("times_redeemed", json.encodeToJsonElement(value.timesRedeemed))
                    put("valid", json.encodeToJsonElement(value.valid))
                    value.amountOff?.let { put("amount_off", json.encodeToJsonElement(it)) }
                    value.appliesTo?.let { put("applies_to", json.encodeToJsonElement(it)) }
                    value.currency?.let { put("currency", it) }
                    value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
                    value.durationInMonths?.let { put("duration_in_months", json.encodeToJsonElement(it)) }
                    value.maxRedemptions?.let { put("max_redemptions", json.encodeToJsonElement(it)) }
                    value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
                    value.name?.let { put("name", it) }
                    value.percentOff?.let { put("percent_off", json.encodeToJsonElement(it)) }
                    value.redeemBy?.let { put("redeem_by", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun coupon(block: Coupon.Builder.() -> Unit): Coupon = Coupon.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element = raw[name] ?: throw SerializationException("Coupon is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
