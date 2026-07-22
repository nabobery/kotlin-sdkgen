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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sunbit/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sunbit/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba(
    public val captureMethod: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodX77d6a0fc? = null,
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXc1dfc41f? = null,
) {
    public class Builder {
        public var captureMethod:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodX77d6a0fc? = null

        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXc1dfc41f? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba(
                captureMethod = captureMethod,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba(
                captureMethod =
                    rawObject["capture_method"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodX77d6a0fc>(
                                it,
                            )
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXc1dfc41f>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba",
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

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSunbitAnyOf1X01d47fba.build(block)
