package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentMethodOptionsAlmaView(
    @SerialName("capture_method")
    public val captureMethod: InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_alma
 */
@Serializable(with = PaymentMethodOptionsAlma.Serializer::class)
public class PaymentMethodOptionsAlma(
    /**
     * Controls when the funds will be captured from the customer's account.
     */
    public val captureMethod: InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d? = null,
) {
    public class Builder {
        /**
         * Controls when the funds will be captured from the customer's account.
         */
        public var captureMethod: InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d? = null

        public fun build(): PaymentMethodOptionsAlma =
            PaymentMethodOptionsAlma(
                captureMethod = captureMethod,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodOptionsAlma = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodOptionsAlma> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodOptionsAlma {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsAlma")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodOptionsAlma must be a JSON object")
            return PaymentMethodOptionsAlma(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlinePaymentMethodOptionsAlmaCaptureMethodX866f235d>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodOptionsAlma,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsAlma")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodOptionsAlma(block: PaymentMethodOptionsAlma.Builder.() -> Unit): PaymentMethodOptionsAlma =
    PaymentMethodOptionsAlma.build(block)
