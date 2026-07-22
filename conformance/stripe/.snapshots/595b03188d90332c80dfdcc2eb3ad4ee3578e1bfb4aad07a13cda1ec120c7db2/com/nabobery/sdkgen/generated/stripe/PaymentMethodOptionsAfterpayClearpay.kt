package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentMethodOptionsAfterpayClearpayView(
    @SerialName("capture_method")
    public val captureMethod: InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb? = null,
    public val reference: String? = null,
    @SerialName("setup_future_usage")
    public val setupFutureUsage: InlinePaymentMethodOptionsAfterpayClearpaySetupFutureUsageXf666b267? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_afterpay_clearpay
 */
@Serializable(with = PaymentMethodOptionsAfterpayClearpay.Serializer::class)
public class PaymentMethodOptionsAfterpayClearpay(
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public val captureMethod: InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb? = null,
    /**
     * An internal identifier or reference that this payment corresponds to. You must limit the identifier to 128
     * characters, and it can only contain letters, numbers, underscores, backslashes, and dashes.
     * This field differs from the statement descriptor and item name.
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
    public val setupFutureUsage: InlinePaymentMethodOptionsAfterpayClearpaySetupFutureUsageXf666b267? = null,
) {
    public class Builder {
        /**
         * Controls when the funds will be captured from the customer's account.
         */
        public var captureMethod: InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb? =
            null

        /**
         * An internal identifier or reference that this payment corresponds to. You must limit the identifier to 128
         * characters, and it can only contain letters, numbers, underscores, backslashes, and dashes.
         * This field differs from the statement descriptor and item name.
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
        public var setupFutureUsage:
            InlinePaymentMethodOptionsAfterpayClearpaySetupFutureUsageXf666b267? = null

        public fun build(): PaymentMethodOptionsAfterpayClearpay =
            PaymentMethodOptionsAfterpayClearpay(
                captureMethod = captureMethod,
                reference = reference,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodOptionsAfterpayClearpay =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodOptionsAfterpayClearpay> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodOptionsAfterpayClearpay {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsAfterpayClearpay")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodOptionsAfterpayClearpay must be a JSON object")
            return PaymentMethodOptionsAfterpayClearpay(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlinePaymentMethodOptionsAfterpayClearpayCaptureMethodXc9dc63eb>(it)
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
                        json.decodeFromJsonElement<InlinePaymentMethodOptionsAfterpayClearpaySetupFutureUsageXf666b267>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodOptionsAfterpayClearpay,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsAfterpayClearpay")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                    value.reference?.let { put("reference", it) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodOptionsAfterpayClearpay(
    block: PaymentMethodOptionsAfterpayClearpay.Builder.() -> Unit,
): PaymentMethodOptionsAfterpayClearpay = PaymentMethodOptionsAfterpayClearpay.build(block)
