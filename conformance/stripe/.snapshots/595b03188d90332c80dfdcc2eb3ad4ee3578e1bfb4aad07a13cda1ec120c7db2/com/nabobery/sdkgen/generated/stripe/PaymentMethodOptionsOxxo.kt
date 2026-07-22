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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.String
import kotlin.Unit

@Serializable
public data class PaymentMethodOptionsOxxoView(
    @SerialName("expires_after_days")
    public val expiresAfterDays: Int,
    @SerialName("setup_future_usage")
    public val setupFutureUsage: InlinePaymentMethodOptionsOxxoSetupFutureUsageXda07f017? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_oxxo
 */
@Serializable(with = PaymentMethodOptionsOxxo.Serializer::class)
public class PaymentMethodOptionsOxxo(
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
    public val setupFutureUsage: InlinePaymentMethodOptionsOxxoSetupFutureUsageXda07f017? = null,
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
        public var setupFutureUsage: InlinePaymentMethodOptionsOxxoSetupFutureUsageXda07f017? = null

        public fun build(): PaymentMethodOptionsOxxo {
            check(expiresAfterDaysValue != null) { "expiresAfterDays is required" }
            return PaymentMethodOptionsOxxo(
                expiresAfterDays = expiresAfterDays,
                setupFutureUsage = setupFutureUsage,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodOptionsOxxo = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodOptionsOxxo> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodOptionsOxxo {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsOxxo")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodOptionsOxxo must be a JSON object")
            val expiresAfterDays = json.decodeRequired<Int>(rawObject, "expires_after_days")
            return PaymentMethodOptionsOxxo(
                expiresAfterDays = expiresAfterDays,
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlinePaymentMethodOptionsOxxoSetupFutureUsageXda07f017>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodOptionsOxxo,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsOxxo")
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

public fun paymentMethodOptionsOxxo(block: PaymentMethodOptionsOxxo.Builder.() -> Unit): PaymentMethodOptionsOxxo =
    PaymentMethodOptionsOxxo.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException("PaymentMethodOptionsOxxo is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
