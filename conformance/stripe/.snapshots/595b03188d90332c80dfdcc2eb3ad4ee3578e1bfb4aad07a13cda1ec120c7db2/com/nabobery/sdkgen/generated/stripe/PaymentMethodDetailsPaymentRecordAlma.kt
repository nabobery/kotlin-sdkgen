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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_alma
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordAlma.Serializer::class)
public class PaymentMethodDetailsPaymentRecordAlma(
    public val installments: PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments? = null,
    /**
     * The Alma transaction ID associated with this payment.
     */
    public val transactionId: String? = null,
) {
    public class Builder {
        public var installments:
            PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments? = null

        /**
         * The Alma transaction ID associated with this payment.
         */
        public var transactionId: String? = null

        public fun build(): PaymentMethodDetailsPaymentRecordAlma =
            PaymentMethodDetailsPaymentRecordAlma(
                installments = installments,
                transactionId = transactionId,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordAlma =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordAlma> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordAlma {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordAlma")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsPaymentRecordAlma must be a JSON object")
            return PaymentMethodDetailsPaymentRecordAlma(
                installments =
                    rawObject["installments"]?.let {
                        json
                            .decodeFromJsonElement<PaymentsPrimitivesPaymentRecordsResourcePaymentMethodAlmaDetailsResourceInstallments>(
                                it,
                            )
                    },
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
            `value`: PaymentMethodDetailsPaymentRecordAlma,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordAlma")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.installments?.let { put("installments", json.encodeToJsonElement(it)) }
                    value.transactionId?.let { put("transaction_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsPaymentRecordAlma(
    block: PaymentMethodDetailsPaymentRecordAlma.Builder.() -> Unit,
): PaymentMethodDetailsPaymentRecordAlma = PaymentMethodDetailsPaymentRecordAlma.build(block)
