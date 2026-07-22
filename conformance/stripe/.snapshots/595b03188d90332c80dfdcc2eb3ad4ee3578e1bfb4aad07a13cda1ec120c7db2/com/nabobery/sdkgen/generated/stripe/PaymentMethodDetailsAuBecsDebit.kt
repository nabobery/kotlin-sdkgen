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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_au_becs_debit
 */
@Serializable(with = PaymentMethodDetailsAuBecsDebit.Serializer::class)
public class PaymentMethodDetailsAuBecsDebit(
    /**
     * Bank-State-Branch number of the bank account.
     */
    public val bsbNumber: String? = null,
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
     * Last four digits of the bank account number.
     */
    public val last4: String? = null,
    /**
     * ID of the mandate used to make this payment.
     */
    public val mandate: String? = null,
) {
    public class Builder {
        /**
         * Bank-State-Branch number of the bank account.
         */
        public var bsbNumber: String? = null

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
         * Last four digits of the bank account number.
         */
        public var last4: String? = null

        /**
         * ID of the mandate used to make this payment.
         */
        public var mandate: String? = null

        public fun build(): PaymentMethodDetailsAuBecsDebit =
            PaymentMethodDetailsAuBecsDebit(
                bsbNumber = bsbNumber,
                expectedDebitDate = expectedDebitDate,
                fingerprint = fingerprint,
                last4 = last4,
                mandate = mandate,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsAuBecsDebit = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsAuBecsDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsAuBecsDebit {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsAuBecsDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsAuBecsDebit must be a JSON object")
            return PaymentMethodDetailsAuBecsDebit(
                bsbNumber =
                    rawObject["bsb_number"]?.let { element ->
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
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDetailsAuBecsDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsAuBecsDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.bsbNumber?.let { put("bsb_number", it) }
                    value.expectedDebitDate?.let { put("expected_debit_date", it) }
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.last4?.let { put("last4", it) }
                    value.mandate?.let { put("mandate", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsAuBecsDebit(
    block: PaymentMethodDetailsAuBecsDebit.Builder.() -> Unit,
): PaymentMethodDetailsAuBecsDebit = PaymentMethodDetailsAuBecsDebit.build(block)
