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
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout_wechat_pay_payment_method_options
 */
@Serializable(with = CheckoutWechatPayPaymentMethodOptions.Serializer::class)
public class CheckoutWechatPayPaymentMethodOptions(
    /**
     * The app ID registered with WeChat Pay. Only required when client is iOS or Android.
     */
    public val appId: String? = null,
    /**
     * The client type that the end customer will pay from
     */
    public val client: InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533? = null,
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
    public val setupFutureUsage: InlineCheckoutWechatPayPaymentMethodOptionsSetupFutureUsageX92769777? = null,
) {
    public class Builder {
        /**
         * The app ID registered with WeChat Pay. Only required when client is iOS or Android.
         */
        public var appId: String? = null

        /**
         * The client type that the end customer will pay from
         */
        public var client: InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533? = null

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
        public var setupFutureUsage:
            InlineCheckoutWechatPayPaymentMethodOptionsSetupFutureUsageX92769777? = null

        public fun build(): CheckoutWechatPayPaymentMethodOptions =
            CheckoutWechatPayPaymentMethodOptions(
                appId = appId,
                client = client,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): CheckoutWechatPayPaymentMethodOptions =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<CheckoutWechatPayPaymentMethodOptions> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): CheckoutWechatPayPaymentMethodOptions {
            val jsonDecoder = decoder.requireJsonDecoder("CheckoutWechatPayPaymentMethodOptions")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("CheckoutWechatPayPaymentMethodOptions must be a JSON object")
            return CheckoutWechatPayPaymentMethodOptions(
                appId =
                    rawObject["app_id"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                client =
                    rawObject["client"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineCheckoutWechatPayPaymentMethodOptionsClientXfa931533?>(
                                element,
                            )
                        }
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json
                            .decodeFromJsonElement<InlineCheckoutWechatPayPaymentMethodOptionsSetupFutureUsageX92769777>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: CheckoutWechatPayPaymentMethodOptions,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("CheckoutWechatPayPaymentMethodOptions")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.appId?.let { put("app_id", it) }
                    value.client?.let { put("client", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun checkoutWechatPayPaymentMethodOptions(
    block: CheckoutWechatPayPaymentMethodOptions.Builder.() -> Unit,
): CheckoutWechatPayPaymentMethodOptions = CheckoutWechatPayPaymentMethodOptions.build(block)
