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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_bacs_debit
 */
@Serializable(with = PaymentMethodBacsDebit.Serializer::class)
public class PaymentMethodBacsDebit(
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
     * Sort code of the bank account. (e.g., `10-20-30`)
     */
    public val sortCode: String? = null,
) {
    public class Builder {
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
         * Sort code of the bank account. (e.g., `10-20-30`)
         */
        public var sortCode: String? = null

        public fun build(): PaymentMethodBacsDebit =
            PaymentMethodBacsDebit(
                fingerprint = fingerprint,
                last4 = last4,
                sortCode = sortCode,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodBacsDebit = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodBacsDebit> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodBacsDebit {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodBacsDebit")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodBacsDebit must be a JSON object")
            return PaymentMethodBacsDebit(
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
                sortCode =
                    rawObject["sort_code"]?.let { element ->
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
            `value`: PaymentMethodBacsDebit,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodBacsDebit")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.fingerprint?.let { put("fingerprint", it) }
                    value.last4?.let { put("last4", it) }
                    value.sortCode?.let { put("sort_code", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodBacsDebit(block: PaymentMethodBacsDebit.Builder.() -> Unit): PaymentMethodBacsDebit =
    PaymentMethodBacsDebit.build(block)
