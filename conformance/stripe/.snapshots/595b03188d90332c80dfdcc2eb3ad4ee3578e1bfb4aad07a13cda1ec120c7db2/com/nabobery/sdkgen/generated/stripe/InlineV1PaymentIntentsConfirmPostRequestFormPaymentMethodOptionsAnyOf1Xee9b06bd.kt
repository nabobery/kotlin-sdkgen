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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/grabpay/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/grabpay/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd(
    public val setupFutureUsage: InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX72eb3115? = null,
) {
    public class Builder {
        public var setupFutureUsage:
            InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX72eb3115? = null

        public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd =
            InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd(
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd must be a JSON object",
                    )
            return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd(
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormSetupFutureUsageX72eb3115>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd(
    block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd.Builder.() -> Unit,
): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd =
    InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf1Xee9b06bd.build(block)
