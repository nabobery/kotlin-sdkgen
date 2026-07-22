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
 * urlencoded/schema/properties/payment_method_options/properties/link/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/link/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386(
    public val captureMethod: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXd74fd75d? = null,
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXcf2c8581? = null,
) {
    public class Builder {
        public var captureMethod:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXd74fd75d? = null

        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXcf2c8581? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386(
                captureMethod = captureMethod,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXd74fd75d>(
                                it,
                            )
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXcf2c8581>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsLinkAnyOf1X2755d386.build(block)
