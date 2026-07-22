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
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_mobilepay
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordMobilepay.Serializer::class)
public class PaymentMethodDetailsPaymentRecordMobilepay(
    /**
     * Internal card details
     */
    public val card: InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f? = null,
) {
    public class Builder {
        /**
         * Internal card details
         */
        public var card: InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f? = null

        public fun build(): PaymentMethodDetailsPaymentRecordMobilepay =
            PaymentMethodDetailsPaymentRecordMobilepay(
                card = card,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordMobilepay =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordMobilepay> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordMobilepay {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordMobilepay")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsPaymentRecordMobilepay must be a JSON object")
            return PaymentMethodDetailsPaymentRecordMobilepay(
                card =
                    rawObject["card"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlinePaymentMethodDetailsPaymentRecordMobilepayCardX90c5c01f?>(
                                element,
                            )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodDetailsPaymentRecordMobilepay,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordMobilepay")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.card?.let { put("card", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsPaymentRecordMobilepay(
    block: PaymentMethodDetailsPaymentRecordMobilepay.Builder.() -> Unit,
): PaymentMethodDetailsPaymentRecordMobilepay = PaymentMethodDetailsPaymentRecordMobilepay.build(block)
