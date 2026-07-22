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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_billie
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordBillie.Serializer::class)
public class PaymentMethodDetailsPaymentRecordBillie(
    /**
     * The Billie transaction ID associated with this payment.
     */
    public val transactionId: String? = null,
) {
    public class Builder {
        /**
         * The Billie transaction ID associated with this payment.
         */
        public var transactionId: String? = null

        public fun build(): PaymentMethodDetailsPaymentRecordBillie =
            PaymentMethodDetailsPaymentRecordBillie(
                transactionId = transactionId,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordBillie =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordBillie> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordBillie {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordBillie")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsPaymentRecordBillie must be a JSON object")
            return PaymentMethodDetailsPaymentRecordBillie(
                transactionId =
                    rawObject["transaction_id"]?.let { element ->
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
            `value`: PaymentMethodDetailsPaymentRecordBillie,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordBillie")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.transactionId?.let { put("transaction_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsPaymentRecordBillie(
    block: PaymentMethodDetailsPaymentRecordBillie.Builder.() -> Unit,
): PaymentMethodDetailsPaymentRecordBillie = PaymentMethodDetailsPaymentRecordBillie.build(block)
