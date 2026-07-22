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
import kotlin.Boolean
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/card_present/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491(
    public val captureMethod: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXf04d0504? = null,
    public val requestExtendedAuthorization: Boolean? = null,
    public val requestIncrementalAuthorizationSupport: Boolean? = null,
    public val routing: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a? = null,
) {
    public class Builder {
        public var captureMethod:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXf04d0504? = null

        public var requestExtendedAuthorization: Boolean? = null

        public var requestIncrementalAuthorizationSupport: Boolean? = null

        public var routing: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491(
                captureMethod = captureMethod,
                requestExtendedAuthorization = requestExtendedAuthorization,
                requestIncrementalAuthorizationSupport = requestIncrementalAuthorizationSupport,
                routing = routing,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXf04d0504>(
                                it,
                            )
                    },
                requestExtendedAuthorization =
                    rawObject["request_extended_authorization"]?.let {
                        json.decodeFromJsonElement<Boolean>(it)
                    },
                requestIncrementalAuthorizationSupport =
                    rawObject["request_incremental_authorization_support"]?.let {
                        json.decodeFromJsonElement<Boolean>(it)
                    },
                routing =
                    rawObject["routing"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa8ef501a>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                    value.requestExtendedAuthorization?.let {
                        put(
                            "request_extended_authorization",
                            json.encodeToJsonElement(it),
                        )
                    }
                    value.requestIncrementalAuthorizationSupport?.let {
                        put("request_incremental_authorization_support", json.encodeToJsonElement(it))
                    }
                    value.routing?.let { put("routing", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X5e9e1491.build(block)
