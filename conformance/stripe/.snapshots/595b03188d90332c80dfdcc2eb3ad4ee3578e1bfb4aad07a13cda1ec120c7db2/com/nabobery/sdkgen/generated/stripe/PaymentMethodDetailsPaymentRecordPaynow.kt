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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_payment_record_paynow
 */
@Serializable(with = PaymentMethodDetailsPaymentRecordPaynow.Serializer::class)
public class PaymentMethodDetailsPaymentRecordPaynow(
    /**
     * ID of the [location](https://docs.stripe.com/api/terminal/locations) that this transaction's reader is assigned to.
     */
    public val location: String? = null,
    /**
     * ID of the [reader](https://docs.stripe.com/api/terminal/readers) this transaction was made on.
     */
    public val reader: String? = null,
    /**
     * Reference number associated with this PayNow payment
     */
    public val reference: String? = null,
) {
    public class Builder {
        /**
         * ID of the [location](https://docs.stripe.com/api/terminal/locations) that this transaction's reader is assigned
         * to.
         */
        public var location: String? = null

        /**
         * ID of the [reader](https://docs.stripe.com/api/terminal/readers) this transaction was made on.
         */
        public var reader: String? = null

        /**
         * Reference number associated with this PayNow payment
         */
        public var reference: String? = null

        public fun build(): PaymentMethodDetailsPaymentRecordPaynow =
            PaymentMethodDetailsPaymentRecordPaynow(
                location = location,
                reader = reader,
                reference = reference,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodDetailsPaymentRecordPaynow =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodDetailsPaymentRecordPaynow> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodDetailsPaymentRecordPaynow {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsPaymentRecordPaynow")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodDetailsPaymentRecordPaynow must be a JSON object")
            return PaymentMethodDetailsPaymentRecordPaynow(
                location = rawObject["location"]?.let { json.decodeFromJsonElement<String>(it) },
                reader = rawObject["reader"]?.let { json.decodeFromJsonElement<String>(it) },
                reference =
                    rawObject["reference"]?.let { element ->
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
            `value`: PaymentMethodDetailsPaymentRecordPaynow,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsPaymentRecordPaynow")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.location?.let { put("location", it) }
                    value.reader?.let { put("reader", it) }
                    value.reference?.let { put("reference", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodDetailsPaymentRecordPaynow(
    block: PaymentMethodDetailsPaymentRecordPaynow.Builder.() -> Unit,
): PaymentMethodDetailsPaymentRecordPaynow = PaymentMethodDetailsPaymentRecordPaynow.build(block)
