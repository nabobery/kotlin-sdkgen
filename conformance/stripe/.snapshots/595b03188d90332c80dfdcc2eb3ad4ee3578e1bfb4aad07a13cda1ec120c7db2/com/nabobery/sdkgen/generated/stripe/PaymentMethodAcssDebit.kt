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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_acss_debit
 */
@Serializable(with = PaymentMethodAcssDebit.Serializer::class)
public class PaymentMethodAcssDebit(
    /**
     * Name of the bank associated with the bank account.
     */
    public val bankName: String? = null,
    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are
     * the same.
     */
    public val fingerprint: String? = null,
    /**
     * Institution number of the bank account.
     */
    public val institutionNumber: String? = null,
    /**
     * Last four digits of the bank account number.
     */
    public val last4: String? = null,
    /**
     * Transit number of the bank account.
     */
    public val transitNumber: String? = null,
) {
    public class Builder {
        /**
         * Name of the bank associated with the bank account.
         */
        public var bankName: String? = null

        /**
         * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts
         * are the same.
         */
        public var fingerprint: String? = null

        /**
         * Institution number of the bank account.
         */
        public var institutionNumber: String? = null

        /**
         * Last four digits of the bank account number.
         */
        public var last4: String? = null

        /**
         * Transit number of the bank account.
         */
        public var transitNumber: String? = null

        public fun build(): PaymentMethodAcssDebit =
            PaymentMethodAcssDebit(
                bankName = bankName,
                fingerprint = fingerprint,
                institutionNumber = institutionNumber,
                last4 = last4,
                transitNumber = transitNumber,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodAcssDebit = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodAcssDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodAcssDebit {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodAcssDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodAcssDebit must be a JSON object")
            return PaymentMethodAcssDebit(
                bankName =
                    rawObject["bank_name"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
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
                institutionNumber =
                    rawObject["institution_number"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                last4 =
                    rawObject["last4"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                transitNumber =
                    rawObject["transit_number"]?.let { element ->
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
            `value`: PaymentMethodAcssDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodAcssDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bankName?.let { put("bank_name", it) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.institutionNumber?.let { put("institution_number", it) }
                    value.last4?.let { put("last4", it) }
                    value.transitNumber?.let { put("transit_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodAcssDebit(block: PaymentMethodAcssDebit.Builder.() -> Unit): PaymentMethodAcssDebit =
    PaymentMethodAcssDebit.build(block)
