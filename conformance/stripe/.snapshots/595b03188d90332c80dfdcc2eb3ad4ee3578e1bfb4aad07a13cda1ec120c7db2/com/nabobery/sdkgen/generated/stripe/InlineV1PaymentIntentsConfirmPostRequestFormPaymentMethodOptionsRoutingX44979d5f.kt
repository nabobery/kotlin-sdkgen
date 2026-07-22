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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/routing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/routing
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f(
    public val requestedPriority: InlineV1PaymentIntentsConfirmPostRequestFormRequestedPriorityXd482d73d? = null,
) {
    public class Builder {
        public var requestedPriority:
            InlineV1PaymentIntentsConfirmPostRequestFormRequestedPriorityXd482d73d? = null

        public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f =
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f(
                requestedPriority = requestedPriority,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f must be a JSON object",
                    )
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f(
                requestedPriority =
                    rawObject["requested_priority"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormRequestedPriorityXd482d73d>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.requestedPriority?.let { put("requested_priority", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f(
    block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f.Builder.() -> Unit,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f =
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsRoutingX44979d5f.build(block)
