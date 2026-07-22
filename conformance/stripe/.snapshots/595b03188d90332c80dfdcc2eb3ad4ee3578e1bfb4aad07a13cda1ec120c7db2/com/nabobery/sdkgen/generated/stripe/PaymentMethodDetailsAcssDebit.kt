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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_acss_debit
 */
@Serializable(with = PaymentMethodDetailsAcssDebit.Serializer::class)
public class PaymentMethodDetailsAcssDebit(
    /**
     * Name of the bank associated with the bank account.
     */
    public val bankName: String? = null,
    /**
     * Estimated date to debit the customer's bank account. A date string in YYYY-MM-DD format.
     */
    public val expectedDebitDate: String? = null,
    /**
     * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts are
     * the same.
     */
    public val fingerprint: String? = null,
    /**
     * Institution number of the bank account
     */
    public val institutionNumber: String? = null,
    /**
     * Last four digits of the bank account number.
     */
    public val last4: String? = null,
    /**
     * ID of the mandate used to make this payment.
     */
    public val mandate: String? = null,
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
         * Estimated date to debit the customer's bank account. A date string in YYYY-MM-DD format.
         */
        public var expectedDebitDate: String? = null

        /**
         * Uniquely identifies this particular bank account. You can use this attribute to check whether two bank accounts
         * are the same.
         */
        public var fingerprint: String? = null

        /**
         * Institution number of the bank account
         */
        public var institutionNumber: String? = null

        /**
         * Last four digits of the bank account number.
         */
        public var last4: String? = null

        /**
         * ID of the mandate used to make this payment.
         */
        public var mandate: String? = null

        /**
         * Transit number of the bank account.
         */
        public var transitNumber: String? = null

        public fun build(): PaymentMethodDetailsAcssDebit =
            PaymentMethodDetailsAcssDebit(
                bankName = bankName,
                expectedDebitDate = expectedDebitDate,
                fingerprint = fingerprint,
                institutionNumber = institutionNumber,
                last4 = last4,
                mandate = mandate,
                transitNumber = transitNumber,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsAcssDebit = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsAcssDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsAcssDebit {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsAcssDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsAcssDebit must be a JSON object")
            return PaymentMethodDetailsAcssDebit(
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
                expectedDebitDate = rawObject["expected_debit_date"]?.let { json.decodeFromJsonElement<String>(it) },
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
                mandate = rawObject["mandate"]?.let { json.decodeFromJsonElement<String>(it) },
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
            `value`: PaymentMethodDetailsAcssDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsAcssDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bankName?.let { put("bank_name", it) }
                    value.expectedDebitDate?.let { put("expected_debit_date", it) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.institutionNumber?.let { put("institution_number", it) }
                    value.last4?.let { put("last4", it) }
                    value.mandate?.let { put("mandate", it) }
                    value.transitNumber?.let { put("transit_number", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsAcssDebit(
    block: PaymentMethodDetailsAcssDebit.Builder.() -> Unit,
): PaymentMethodDetailsAcssDebit = PaymentMethodDetailsAcssDebit.build(block)
