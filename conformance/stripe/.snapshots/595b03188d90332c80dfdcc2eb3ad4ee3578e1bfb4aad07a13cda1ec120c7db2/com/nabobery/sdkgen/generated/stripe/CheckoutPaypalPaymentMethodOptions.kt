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
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_paypal_payment_method_options
 */
@Serializable(with = CheckoutPaypalPaymentMethodOptions.Serializer::class)
public class CheckoutPaypalPaymentMethodOptions(
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public val captureMethod: InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332? = null,
    /**
     * Preferred locale of the PayPal checkout page that the customer is redirected to.
     */
    public val preferredLocale: String? = null,
    /**
     * A reference of the PayPal transaction visible to customer which is mapped to PayPal's invoice ID. This must be a
     * globally unique ID if you have configured in your PayPal settings to block multiple payments per invoice ID.
     */
    public val reference: String? = null,
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
    public val setupFutureUsage: InlineCheckoutPaypalPaymentMethodOptionsSetupFutureUsageXac29268b? = null,
) {
    public class Builder {
        /**
         * Controls when the funds will be captured from the customer's account.
         */
        public var captureMethod: InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332? = null

        /**
         * Preferred locale of the PayPal checkout page that the customer is redirected to.
         */
        public var preferredLocale: String? = null

        /**
         * A reference of the PayPal transaction visible to customer which is mapped to PayPal's invoice ID. This must be a
         * globally unique ID if you have configured in your PayPal settings to block multiple payments per invoice ID.
         */
        public var reference: String? = null

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
        public var setupFutureUsage: InlineCheckoutPaypalPaymentMethodOptionsSetupFutureUsageXac29268b? =
            null

        public fun build(): CheckoutPaypalPaymentMethodOptions =
            CheckoutPaypalPaymentMethodOptions(
                captureMethod = captureMethod,
                preferredLocale = preferredLocale,
                reference = reference,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CheckoutPaypalPaymentMethodOptions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CheckoutPaypalPaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CheckoutPaypalPaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("CheckoutPaypalPaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CheckoutPaypalPaymentMethodOptions must be a JSON object")
            return CheckoutPaypalPaymentMethodOptions(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineCheckoutPaypalPaymentMethodOptionsCaptureMethodX3cb2a332>(it)
                    },
                preferredLocale =
                    rawObject["preferred_locale"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                reference =
                    rawObject["reference"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineCheckoutPaypalPaymentMethodOptionsSetupFutureUsageXac29268b>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CheckoutPaypalPaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CheckoutPaypalPaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                    value.preferredLocale?.let { put("preferred_locale", it) }
                    value.reference?.let { put("reference", it) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun checkoutPaypalPaymentMethodOptions(
    block: CheckoutPaypalPaymentMethodOptions.Builder.() -> Unit,
): CheckoutPaypalPaymentMethodOptions = CheckoutPaypalPaymentMethodOptions.build(block)
