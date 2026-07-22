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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_payto_payment_method_options
 */
@Serializable(with = CheckoutPaytoPaymentMethodOptions.Serializer::class)
public class CheckoutPaytoPaymentMethodOptions(
    public val mandateOptions: MandateOptionsPayto? = null,
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
    public val setupFutureUsage: InlineCheckoutPaytoPaymentMethodOptionsSetupFutureUsageX8b08d571? = null,
) {
    public class Builder {
        public var mandateOptions: MandateOptionsPayto? = null

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
        public var setupFutureUsage: InlineCheckoutPaytoPaymentMethodOptionsSetupFutureUsageX8b08d571? =
            null

        public fun build(): CheckoutPaytoPaymentMethodOptions =
            CheckoutPaytoPaymentMethodOptions(
                mandateOptions = mandateOptions,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CheckoutPaytoPaymentMethodOptions = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CheckoutPaytoPaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CheckoutPaytoPaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("CheckoutPaytoPaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CheckoutPaytoPaymentMethodOptions must be a JSON object")
            return CheckoutPaytoPaymentMethodOptions(
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json.decodeFromJsonElement<MandateOptionsPayto>(
                            it,
                        )
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineCheckoutPaytoPaymentMethodOptionsSetupFutureUsageX8b08d571>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CheckoutPaytoPaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CheckoutPaytoPaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun checkoutPaytoPaymentMethodOptions(
    block: CheckoutPaytoPaymentMethodOptions.Builder.() -> Unit,
): CheckoutPaytoPaymentMethodOptions = CheckoutPaytoPaymentMethodOptions.build(block)
