package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent_card_processing
 */
@Serializable(with = PaymentIntentCardProcessing.Serializer::class)
public class PaymentIntentCardProcessing(
    public val customerNotification: PaymentIntentProcessingCustomerNotification? = null,
) {
    public class Builder {
        public var customerNotification: PaymentIntentProcessingCustomerNotification? = null

        public fun build(): PaymentIntentCardProcessing =
            PaymentIntentCardProcessing(
                customerNotification = customerNotification,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentIntentCardProcessing = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentIntentCardProcessing> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentIntentCardProcessing {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentIntentCardProcessing")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentIntentCardProcessing must be a JSON object")
            return PaymentIntentCardProcessing(
                customerNotification =
                    rawObject["customer_notification"]?.let {
                        json.decodeFromJsonElement<PaymentIntentProcessingCustomerNotification>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentIntentCardProcessing,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentIntentCardProcessing")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.customerNotification?.let { put("customer_notification", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentIntentCardProcessing(
    block: PaymentIntentCardProcessing.Builder.() -> Unit,
): PaymentIntentCardProcessing = PaymentIntentCardProcessing.build(block)
