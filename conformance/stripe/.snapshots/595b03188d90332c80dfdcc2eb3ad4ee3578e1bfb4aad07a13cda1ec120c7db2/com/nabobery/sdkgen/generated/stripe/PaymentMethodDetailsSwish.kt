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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_swish
 */
@Serializable(with = PaymentMethodDetailsSwish.Serializer::class)
public class PaymentMethodDetailsSwish(
    /**
     * Uniquely identifies the payer's Swish account. You can use this attribute to check whether two Swish transactions
     * were paid for by the same payer
     */
    public val fingerprint: String? = null,
    /**
     * Payer bank reference number for the payment
     */
    public val paymentReference: String? = null,
    /**
     * The last four digits of the Swish account phone number
     */
    public val verifiedPhoneLast4: String? = null,
) {
    public class Builder {
        /**
         * Uniquely identifies the payer's Swish account. You can use this attribute to check whether two Swish transactions
         * were paid for by the same payer
         */
        public var fingerprint: String? = null

        /**
         * Payer bank reference number for the payment
         */
        public var paymentReference: String? = null

        /**
         * The last four digits of the Swish account phone number
         */
        public var verifiedPhoneLast4: String? = null

        public fun build(): PaymentMethodDetailsSwish =
            PaymentMethodDetailsSwish(
                fingerprint = fingerprint,
                paymentReference = paymentReference,
                verifiedPhoneLast4 = verifiedPhoneLast4,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsSwish = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsSwish> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsSwish {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsSwish")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsSwish must be a JSON object")
            return PaymentMethodDetailsSwish(
                fingerprint =
                    rawObject["fingerprint"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                paymentReference =
                    rawObject["payment_reference"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                verifiedPhoneLast4 =
                    rawObject["verified_phone_last4"]?.let { element ->
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
            `value`: PaymentMethodDetailsSwish,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsSwish")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.paymentReference?.let { put("payment_reference", it) }
                    value.verifiedPhoneLast4?.let { put("verified_phone_last4", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsSwish(block: PaymentMethodDetailsSwish.Builder.() -> Unit): PaymentMethodDetailsSwish =
    PaymentMethodDetailsSwish.build(block)
