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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_billie
 */
@Serializable(with = PaymentMethodDetailsBillie.Serializer::class)
public class PaymentMethodDetailsBillie(
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

        public fun build(): PaymentMethodDetailsBillie =
            PaymentMethodDetailsBillie(
                transactionId = transactionId,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsBillie = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsBillie> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsBillie {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsBillie")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsBillie must be a JSON object")
            return PaymentMethodDetailsBillie(
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
            `value`: PaymentMethodDetailsBillie,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsBillie")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.transactionId?.let { put("transaction_id", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsBillie(
    block: PaymentMethodDetailsBillie.Builder.() -> Unit,
): PaymentMethodDetailsBillie = PaymentMethodDetailsBillie.build(block)
