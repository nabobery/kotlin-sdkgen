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
import kotlin.Unit

@Serializable
public data class PaymentMethodOptionsCustomerBalanceView(
    @SerialName("bank_transfer")
    public val bankTransfer: PaymentMethodOptionsCustomerBalanceBankTransfer? = null,
    @SerialName("funding_type")
    public val fundingType: InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21? = null,
    @SerialName("setup_future_usage")
    public val setupFutureUsage: InlinePaymentMethodOptionsCustomerBalanceSetupFutureUsageXcc945e37? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_customer_balance
 */
@Serializable(with = PaymentMethodOptionsCustomerBalance.Serializer::class)
public class PaymentMethodOptionsCustomerBalance(
    public val bankTransfer: PaymentMethodOptionsCustomerBalanceBankTransfer? = null,
    /**
     * The funding method type to be used when there are not enough funds in the customer balance. Permitted values
     * include: `bank_transfer`.
     */
    public val fundingType: InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21? = null,
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
    public val setupFutureUsage: InlinePaymentMethodOptionsCustomerBalanceSetupFutureUsageXcc945e37? = null,
) {
    public class Builder {
        public var bankTransfer: PaymentMethodOptionsCustomerBalanceBankTransfer? = null

        /**
         * The funding method type to be used when there are not enough funds in the customer balance. Permitted values
         * include: `bank_transfer`.
         */
        public var fundingType: InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21? = null

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
        public var setupFutureUsage: InlinePaymentMethodOptionsCustomerBalanceSetupFutureUsageXcc945e37? =
            null

        public fun build(): PaymentMethodOptionsCustomerBalance =
            PaymentMethodOptionsCustomerBalance(
                bankTransfer = bankTransfer,
                fundingType = fundingType,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodOptionsCustomerBalance =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodOptionsCustomerBalance> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodOptionsCustomerBalance {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsCustomerBalance")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodOptionsCustomerBalance must be a JSON object")
            return PaymentMethodOptionsCustomerBalance(
                bankTransfer =
                    rawObject["bank_transfer"]?.let {
                        json.decodeFromJsonElement<PaymentMethodOptionsCustomerBalanceBankTransfer>(it)
                    },
                fundingType =
                    rawObject["funding_type"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodOptionsCustomerBalanceFundingTypeXf7f9ef21?>(
                                element,
                            )
                        }
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlinePaymentMethodOptionsCustomerBalanceSetupFutureUsageXcc945e37>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodOptionsCustomerBalance,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsCustomerBalance")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bankTransfer?.let { put("bank_transfer", json.encodeToJsonElement(it)) }
                    value.fundingType?.let { put("funding_type", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodOptionsCustomerBalance(
    block: PaymentMethodOptionsCustomerBalance.Builder.() -> Unit,
): PaymentMethodOptionsCustomerBalance = PaymentMethodOptionsCustomerBalance.build(block)
