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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_oxxo_payment_method_options
 */
@Serializable(with = CheckoutOxxoPaymentMethodOptions.Serializer::class)
public class CheckoutOxxoPaymentMethodOptions(
    /**
     * The number of calendar days before an OXXO invoice expires. For example, if you create an OXXO invoice on Monday
     * and you set expires_after_days to 2, the OXXO invoice will expire on Wednesday at 23:59 America/Mexico_City time.
     */
    public val expiresAfterDays: Int,
    /**
     * Indicates that you intend to make future payments with this PaymentIntent's payment method.
     *
     * If you provide a Customer with the PaymentIntent, you can use this parameter to [attach the payment
     * method](/payments/save-during-payment) to the Customer after the PaymentIntent is confirmed and the customer
     * completes any required actions. If you don't provide a Customer, you can still
     * [attach](/api/payment_methods/attach) the payment method to a Customer after the transaction completes.
     *
     * If the payment method is `card_present` and isn't a digital wallet, Stripe creates and attaches a
     * [generated_card](/api/charges/object#charge_object-payment_method_details-card_present-generated_card) payment
     * method representing the card to the Customer instead.
     *
     * When processing card payments, Stripe uses `setup_future_usage` to help you comply with regional legislation and
     * network rules, such as [SCA](/strong-customer-authentication).
     */
    public val setupFutureUsage: InlineCheckoutOxxoPaymentMethodOptionsSetupFutureUsageXe47b88a0? = null,
) {
    public class Builder {
        private var expiresAfterDaysValue: Int? = null

        public var expiresAfterDays: Int
            get() = requireNotNull(expiresAfterDaysValue) { "expiresAfterDays is required" }
            set(`value`) {
                expiresAfterDaysValue = value
            }

        /**
         * Indicates that you intend to make future payments with this PaymentIntent's payment method.
         *
         * If you provide a Customer with the PaymentIntent, you can use this parameter to [attach the payment
         * method](/payments/save-during-payment) to the Customer after the PaymentIntent is confirmed and the customer
         * completes any required actions. If you don't provide a Customer, you can still
         * [attach](/api/payment_methods/attach) the payment method to a Customer after the transaction completes.
         *
         * If the payment method is `card_present` and isn't a digital wallet, Stripe creates and attaches a
         * [generated_card](/api/charges/object#charge_object-payment_method_details-card_present-generated_card) payment
         * method representing the card to the Customer instead.
         *
         * When processing card payments, Stripe uses `setup_future_usage` to help you comply with regional legislation and
         * network rules, such as [SCA](/strong-customer-authentication).
         */
        public var setupFutureUsage: InlineCheckoutOxxoPaymentMethodOptionsSetupFutureUsageXe47b88a0? =
            null

        public fun build(): CheckoutOxxoPaymentMethodOptions {
            check(expiresAfterDaysValue != null) { "expiresAfterDays is required" }
            return CheckoutOxxoPaymentMethodOptions(
                expiresAfterDays = expiresAfterDays,
                setupFutureUsage = setupFutureUsage,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CheckoutOxxoPaymentMethodOptions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CheckoutOxxoPaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CheckoutOxxoPaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("CheckoutOxxoPaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CheckoutOxxoPaymentMethodOptions must be a JSON object")
            val expiresAfterDays = json.decodeRequired<Int>(rawObject, "expires_after_days")
            return CheckoutOxxoPaymentMethodOptions(
                expiresAfterDays = expiresAfterDays,
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineCheckoutOxxoPaymentMethodOptionsSetupFutureUsageXe47b88a0>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CheckoutOxxoPaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CheckoutOxxoPaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("expires_after_days", json.encodeToJsonElement(value.expiresAfterDays))
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun checkoutOxxoPaymentMethodOptions(
    block: CheckoutOxxoPaymentMethodOptions.Builder.() -> Unit,
): CheckoutOxxoPaymentMethodOptions = CheckoutOxxoPaymentMethodOptions.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "CheckoutOxxoPaymentMethodOptions is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
