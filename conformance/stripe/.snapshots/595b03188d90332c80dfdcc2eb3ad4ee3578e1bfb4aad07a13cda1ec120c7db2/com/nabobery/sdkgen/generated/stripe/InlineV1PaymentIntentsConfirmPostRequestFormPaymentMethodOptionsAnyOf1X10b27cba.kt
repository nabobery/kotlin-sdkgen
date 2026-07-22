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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sunbit/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sunbit/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba(
    public val captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX0f6f15d0? = null,
    public val setupFutureUsage: InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX77251ea4? = null,
) {
    public class Builder {
        public var captureMethod: InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX0f6f15d0? =
            null

        public var setupFutureUsage:
            InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX77251ea4? = null

        public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba =
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba(
                captureMethod = captureMethod,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba must be a JSON object",
                    )
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormCaptureMethodX0f6f15d0>(
                            it,
                        )
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX77251ea4>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba(
    block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba.Builder.() -> Unit,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba =
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1X10b27cba.build(block)
