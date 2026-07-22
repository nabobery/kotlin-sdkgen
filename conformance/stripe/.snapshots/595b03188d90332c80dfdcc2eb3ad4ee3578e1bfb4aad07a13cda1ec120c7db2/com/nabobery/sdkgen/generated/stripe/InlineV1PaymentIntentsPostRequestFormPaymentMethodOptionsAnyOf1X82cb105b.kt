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
 * urlencoded/schema/properties/payment_method_options/properties/samsung_pay/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/samsung_pay/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b(
    public val captureMethod: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXd4f003fd? = null,
) {
    public class Builder {
        public var captureMethod:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXd4f003fd? = null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b(
                captureMethod = captureMethod,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodXd4f003fd>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1X82cb105b.build(block)
