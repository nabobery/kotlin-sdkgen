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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_paypal
 */
@Serializable(with = PaymentMethodPaypal.Serializer::class)
public class PaymentMethodPaypal(
    /**
     * Two-letter ISO code representing the buyer's country. Values are provided by PayPal directly (if supported) at the
     * time of authorization or settlement. They cannot be set or mutated.
     */
    public val country: String? = null,
    /**
     * Owner's email. Values are provided by PayPal directly
     * (if supported) at the time of authorization or settlement. They cannot be set or mutated.
     */
    public val payerEmail: String? = null,
    /**
     * PayPal account PayerID. This identifier uniquely identifies the PayPal customer.
     */
    public val payerId: String? = null,
) {
    public class Builder {
        /**
         * Two-letter ISO code representing the buyer's country. Values are provided by PayPal directly (if supported) at
         * the time of authorization or settlement. They cannot be set or mutated.
         */
        public var country: String? = null

        /**
         * Owner's email. Values are provided by PayPal directly
         * (if supported) at the time of authorization or settlement. They cannot be set or mutated.
         */
        public var payerEmail: String? = null

        /**
         * PayPal account PayerID. This identifier uniquely identifies the PayPal customer.
         */
        public var payerId: String? = null

        public fun build(): PaymentMethodPaypal =
            PaymentMethodPaypal(
                country = country,
                payerEmail = payerEmail,
                payerId = payerId,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodPaypal = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodPaypal> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodPaypal {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodPaypal")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodPaypal must be a JSON object")
            return PaymentMethodPaypal(
                country =
                    rawObject["country"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                payerEmail =
                    rawObject["payer_email"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                payerId =
                    rawObject["payer_id"]?.let { element ->
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
            `value`: PaymentMethodPaypal,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodPaypal")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.country?.let { put("country", it) }
                    value.payerEmail?.let { put("payer_email", it) }
                    value.payerId?.let { put("payer_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodPaypal(block: PaymentMethodPaypal.Builder.() -> Unit): PaymentMethodPaypal =
    PaymentMethodPaypal.build(block)
