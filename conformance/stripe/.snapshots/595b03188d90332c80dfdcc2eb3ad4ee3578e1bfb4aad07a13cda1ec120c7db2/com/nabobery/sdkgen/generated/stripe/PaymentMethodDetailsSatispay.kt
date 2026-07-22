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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_satispay
 */
@Serializable(with = PaymentMethodDetailsSatispay.Serializer::class)
public class PaymentMethodDetailsSatispay(
    /**
     * The Satispay transaction ID associated with this payment.
     */
    public val transactionId: String? = null,
) {
    public class Builder {
        /**
         * The Satispay transaction ID associated with this payment.
         */
        public var transactionId: String? = null

        public fun build(): PaymentMethodDetailsSatispay =
            PaymentMethodDetailsSatispay(
                transactionId = transactionId,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsSatispay = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsSatispay> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsSatispay {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsSatispay")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsSatispay must be a JSON object")
            return PaymentMethodDetailsSatispay(
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
            `value`: PaymentMethodDetailsSatispay,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsSatispay")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.transactionId?.let { put("transaction_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsSatispay(
    block: PaymentMethodDetailsSatispay.Builder.() -> Unit,
): PaymentMethodDetailsSatispay = PaymentMethodDetailsSatispay.build(block)
