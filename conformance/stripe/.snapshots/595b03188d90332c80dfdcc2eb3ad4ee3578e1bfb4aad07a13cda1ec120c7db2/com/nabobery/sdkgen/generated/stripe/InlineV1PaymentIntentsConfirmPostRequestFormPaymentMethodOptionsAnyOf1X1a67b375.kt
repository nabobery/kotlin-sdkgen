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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/payco/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/payco/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375(
    public val captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX11996728? = null,
) {
    public class Builder {
        public var captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX11996728? =
            null

        public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375 =
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375(
                captureMethod = captureMethod,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375 must be a JSON object",
                    )
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX11996728>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375(
    block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375.Builder.() -> Unit,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375 =
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X1a67b375.build(block)
