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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_card_present_routing
 */
@Serializable(with = PaymentMethodOptionsCardPresentRouting.Serializer::class)
public class PaymentMethodOptionsCardPresentRouting(
    /**
     * Requested routing priority
     */
    public val requestedPriority: InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b? = null,
) {
    public class Builder {
        /**
         * Requested routing priority
         */
        public var requestedPriority:
            InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b? = null

        public fun build(): PaymentMethodOptionsCardPresentRouting =
            PaymentMethodOptionsCardPresentRouting(
                requestedPriority = requestedPriority,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): PaymentMethodOptionsCardPresentRouting =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<PaymentMethodOptionsCardPresentRouting> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): PaymentMethodOptionsCardPresentRouting {
            val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsCardPresentRouting")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("PaymentMethodOptionsCardPresentRouting must be a JSON object")
            return PaymentMethodOptionsCardPresentRouting(
                requestedPriority =
                    rawObject["requested_priority"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json
                                .decodeFromJsonElement<InlinePaymentMethodOptionsCardPresentRoutingRequestedPriorityX0073d63b?>(
                                    element,
                                )
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: PaymentMethodOptionsCardPresentRouting,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsCardPresentRouting")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.requestedPriority?.let { put("requested_priority", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun paymentMethodOptionsCardPresentRouting(
    block: PaymentMethodOptionsCardPresentRouting.Builder.() -> Unit,
): PaymentMethodOptionsCardPresentRouting = PaymentMethodOptionsCardPresentRouting.build(block)
