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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/routing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0/properties/routing
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a(
    public val requestedPriority: InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba? = null,
) {
    public class Builder {
        public var requestedPriority: InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a(
                requestedPriority = requestedPriority,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a(
                requestedPriority =
                    rawObject["requested_priority"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormRequestedPriorityX300b6dba>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a.build(block)
