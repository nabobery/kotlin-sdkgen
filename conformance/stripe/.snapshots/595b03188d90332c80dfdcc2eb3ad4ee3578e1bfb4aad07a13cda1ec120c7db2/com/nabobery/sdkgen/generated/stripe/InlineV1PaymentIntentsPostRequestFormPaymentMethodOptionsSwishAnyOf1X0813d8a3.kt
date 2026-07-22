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
 * urlencoded/schema/properties/payment_method_options/properties/swish/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/swish/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3(
    public val reference: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7? = null,
    public val setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXb4a5d9fc? = null,
) {
    public class Builder {
        public var reference:
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7? = null

        public var setupFutureUsage: InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXb4a5d9fc? =
            null

        public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3 =
            InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3(
                reference = reference,
                setupFutureUsage = setupFutureUsage,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3 must be a JSON object",
                    )
            return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3(
                reference =
                    rawObject["reference"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishReferenceX6b127be7>(
                                it,
                            )
                    },
                setupFutureUsage =
                    rawObject["setup_future_usage"]?.let {
                        json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormSetupFutureUsageXb4a5d9fc>(it)
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.reference?.let { put("reference", json.encodeToJsonElement(it)) }
                    value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3(
    block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3.Builder.() -> Unit,
): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3 =
    InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSwishAnyOf1X0813d8a3.build(block)
