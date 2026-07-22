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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card_present/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/card_present/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458(
    public val captureMethod: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXf359d701? = null,
    public val requestExtendedAuthorization: Boolean? = null,
    public val requestIncrementalAuthorizationSupport: Boolean? = null,
    public val routing: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa26d40c6? = null,
) {
    public class Builder {
        public var captureMethod:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXf359d701? = null

        public var requestExtendedAuthorization: Boolean? = null

        public var requestIncrementalAuthorizationSupport: Boolean? = null

        public var routing: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa26d40c6? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458(
                captureMethod = captureMethod,
                requestExtendedAuthorization = requestExtendedAuthorization,
                requestIncrementalAuthorizationSupport = requestIncrementalAuthorizationSupport,
                routing = routing,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXf359d701>(
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
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsRoutingXa26d40c6>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X7f793458.build(block)
