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
import kotlin.Int
import kotlin.Unit

@Serializable
public data class PaymentMethodOptionsPixView(
    @SerialName("amount_includes_iof")
    public val amountIncludesIof: InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a? = null,
    @SerialName("expires_after_seconds")
    public val expiresAfterSeconds: Int? = null,
    @SerialName("expires_at")
    public val expiresAt: Int? = null,
    @SerialName("mandate_options")
    public val mandateOptions: PaymentMethodOptionsMandateOptionsPix? = null,
    @SerialName("setup_future_usage")
    public val setupFutureUsage: InlinePaymentMethodOptionsPixSetupFutureUsageX1a799d05? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_pix
 */
@Serializable(with = PaymentMethodOptionsPix.Serializer::class)
public class PaymentMethodOptionsPix(
    /**
     * Determines if the amount includes the IOF tax.
     */
    public val amountIncludesIof: InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a? = null,
    /**
     * The number of seconds (between 10 and 1209600) after which Pix payment will expire.
     */
    public val expiresAfterSeconds: Int? = null,
    /**
     * The timestamp at which the Pix expires.
     */
    public val expiresAt: Int? = null,
    public val mandateOptions: PaymentMethodOptionsMandateOptionsPix? = null,
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
    public val setupFutureUsage: InlinePaymentMethodOptionsPixSetupFutureUsageX1a799d05? = null,
) {
    public class Builder {
        /**
         * Determines if the amount includes the IOF tax.
         */
        public var amountIncludesIof: InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a? = null

        /**
         * The number of seconds (between 10 and 1209600) after which Pix payment will expire.
         */
        public var expiresAfterSeconds: Int? = null

        /**
         * The timestamp at which the Pix expires.
         */
        public var expiresAt: Int? = null

        public var mandateOptions: PaymentMethodOptionsMandateOptionsPix? = null

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
        public var setupFutureUsage: InlinePaymentMethodOptionsPixSetupFutureUsageX1a799d05? = null

        public fun build(): PaymentMethodOptionsPix =
            PaymentMethodOptionsPix(
                amountIncludesIof = amountIncludesIof,
                expiresAfterSeconds = expiresAfterSeconds,
                expiresAt = expiresAt,
                mandateOptions = mandateOptions,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodOptionsPix = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodOptionsPix> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodOptionsPix {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsPix")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodOptionsPix must be a JSON object")
            return PaymentMethodOptionsPix(
                amountIncludesIof =
                    rawObject["amount_includes_iof"]?.let {
                        json.decodeFromJsonElement<InlinePaymentMethodOptionsPixAmountIncludesIofXb30d753a>(it)
                    },
                expiresAfterSeconds =
                    rawObject["expires_after_seconds"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                expiresAt =
                    rawObject["expires_at"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                mandateOptions =
                    rawObject["mandate_options"]?.let {
                        json.decodeFromJsonElement<PaymentMethodOptionsMandateOptionsPix>(it)
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlinePaymentMethodOptionsPixSetupFutureUsageX1a799d05>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodOptionsPix,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsPix")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.amountIncludesIof?.let { put("amount_includes_iof", json.encodeToJsonElement(it)) }
                    value.expiresAfterSeconds?.let { put("expires_after_seconds", json.encodeToJsonElement(it)) }
                    value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
                    value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodOptionsPix(block: PaymentMethodOptionsPix.Builder.() -> Unit): PaymentMethodOptionsPix =
    PaymentMethodOptionsPix.build(block)
